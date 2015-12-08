// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.wearable;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.support.v4.app.ae;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.util.SparseArray;
import com.skype.Contact;
import com.skype.ContactImpl;
import com.skype.Conversation;
import com.skype.Message;
import com.skype.SkyLib;
import com.skype.android.app.chat.AbstractMessageNotificationRenderer;
import com.skype.android.app.chat.MessageAgent;
import com.skype.android.app.chat.MessageHolder;
import com.skype.android.app.chat.MessageHolderUtil;
import com.skype.android.app.chat.MessageLoader;
import com.skype.android.app.media.XmmUtil;
import com.skype.android.app.transfer.TransferUtil;
import com.skype.android.concurrent.AsyncCallback;
import com.skype.android.concurrent.AsyncResult;
import com.skype.android.concurrent.AsyncService;
import com.skype.android.skylib.ObjectIdMap;
import com.skype.android.util.ConversationUtil;
import com.skype.android.util.ImageCache;
import com.skype.android.util.cache.FormattedMessageCache;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class WearMessageNotificationRenderer extends AbstractMessageNotificationRenderer
{

    private static final String ELLIPSIS_LINE = "\u2026\n\n";
    private static final String EMOJI_BLOCKED = "\u274C ";
    private static final String EMOJI_CAMERA = "\uD83D\uDCF7 ";
    private static final String EMOJI_CONTACT = "\uD83D\uDC64 ";
    private static final String EMOJI_FILE_FOLDER = "\uD83D\uDCC1 ";
    private static final String EMOJI_PLAY = "\uD83D\uDD0A ";
    private static final String EMOJI_TELEPHONE_RECEIVER = "\uD83D\uDCDE ";
    private static final String EMOJI_UNBLOCKED = "\u2714 ";
    private static final String EMOJI_VIDEO_CAMERA = "\uD83D\uDCF9 ";
    private static final String EMOJI_WORLD = "\uD83C\uDF10 ";
    private final AsyncService async;
    private SparseArray conversationBuilder;
    private final ObjectIdMap map;
    private final FormattedMessageCache messageCache;
    private final MessageHolderUtil messageHolderUtil;
    private final NotificationManager notificationManager;
    private final TransferUtil transferUtil;

    public WearMessageNotificationRenderer(Context context, SkyLib skylib, ConversationUtil conversationutil, FormattedMessageCache formattedmessagecache, ImageCache imagecache, NotificationManager notificationmanager, AsyncService asyncservice, 
            ObjectIdMap objectidmap, MessageHolderUtil messageholderutil, TransferUtil transferutil)
    {
        super(context, skylib, conversationutil, formattedmessagecache, imagecache);
        notificationManager = notificationmanager;
        conversationBuilder = new SparseArray();
        async = asyncservice;
        map = objectidmap;
        messageCache = formattedmessagecache;
        messageHolderUtil = messageholderutil;
        transferUtil = transferutil;
    }

    private SpannableStringBuilder buildSpannableChatHistory(List list)
    {
        HashMap hashmap = new HashMap();
        SpannableStringBuilder spannablestringbuilder = new SpannableStringBuilder();
        spannablestringbuilder.append("\u2026\n\n");
        int i = 0;
        do
        {
            while (i < list.size()) 
            {
                int j = spannablestringbuilder.length();
                Object obj = (Message)list.get(i);
                if (obj != null)
                {
                    Object obj1 = ((Message) (obj)).getTypeProp();
                    boolean flag1 = messageHolderUtil.isOutgoingMessage(((Message) (obj)));
                    boolean flag = true;
                    if (obj1 != com.skype.Message.TYPE.STARTED_LIVESESSION)
                    {
                        if (obj1 == com.skype.Message.TYPE.ENDED_LIVESESSION)
                        {
                            flag = false;
                        }
                        obj1 = getMessageChatText(((com.skype.Message.TYPE) (obj1)), ((Message) (obj)), flag1, hashmap);
                        if (flag1)
                        {
                            obj = context.getResources().getString(0x7f08034c);
                        } else
                        {
                            Contact contact = contactForConversation(((Message) (obj)).getAuthorProp(), hashmap);
                            if (contact == null)
                            {
                                obj = ((Message) (obj)).getAuthorDisplaynameProp();
                            } else
                            {
                                obj = contact.getDisplaynameProp();
                            }
                        }
                        if (flag)
                        {
                            spannablestringbuilder.append(((CharSequence) (obj))).append(" ");
                            spannablestringbuilder.setSpan(new StyleSpan(1), j, spannablestringbuilder.length(), 33);
                        }
                        spannablestringbuilder.append(((CharSequence) (obj1))).append("\n\n");
                    }
                }
                i++;
            }
            return spannablestringbuilder;
        } while (true);
    }

    private Contact contactForConversation(String s, Map map1)
    {
label0:
        {
            Contact contact = (Contact)map1.get(s);
            Object obj = contact;
            if (contact == null)
            {
                obj = new ContactImpl();
                if (!lib.getContact(s, ((Contact) (obj))))
                {
                    break label0;
                }
                map1.put(s, obj);
            }
            return ((Contact) (obj));
        }
        return null;
    }

    private android.support.v4.app.x.g getCarExtender(MessageHolder messageholder, CharSequence charsequence, CharSequence charsequence1, int i)
    {
        android.support.v4.app.x.f.a.a a1 = (android.support.v4.app.x.f.a.a)conversationBuilder.get(i);
        android.support.v4.app.x.f.a.a a = a1;
        if (a1 == null)
        {
            a = getNewUnreadConversation(messageholder, charsequence, i);
            conversationBuilder.put(i, a);
        }
        a.a(charsequence1.toString());
        a.a(messageholder.getTimestamp() * 1000L);
        return (new android.support.v4.app.x.f()).a(a.a());
    }

    private PendingIntent getCarReadPendingIntent(String s, int i)
    {
        s = (new Intent()).addFlags(32).setAction("com.skype.action.READ_MESSAGE_CAR").putExtra("conversationId", s);
        return PendingIntent.getBroadcast(context, i, s, 0x8000000);
    }

    private CharSequence getMessageChatText(com.skype.Message.TYPE type, Message message, boolean flag, Map map1)
    {
        int i = 0;
        if (type == null) goto _L2; else goto _L1
_L1:
        static final class _cls2
        {

            static final int $SwitchMap$com$skype$Message$TYPE[];
            static final int $SwitchMap$com$skype$SkyLib$LEAVE_REASON[];

            static 
            {
                $SwitchMap$com$skype$Message$TYPE = new int[com.skype.Message.TYPE.values().length];
                try
                {
                    $SwitchMap$com$skype$Message$TYPE[com.skype.Message.TYPE.SET_METADATA.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror28) { }
                try
                {
                    $SwitchMap$com$skype$Message$TYPE[com.skype.Message.TYPE.POSTED_EMOTE.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror27) { }
                try
                {
                    $SwitchMap$com$skype$Message$TYPE[com.skype.Message.TYPE.POSTED_SMS.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror26) { }
                try
                {
                    $SwitchMap$com$skype$Message$TYPE[com.skype.Message.TYPE.POSTED_TEXT.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror25) { }
                try
                {
                    $SwitchMap$com$skype$Message$TYPE[com.skype.Message.TYPE.POSTED_CONTACTS.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror24) { }
                try
                {
                    $SwitchMap$com$skype$Message$TYPE[com.skype.Message.TYPE.SPAWNED_CONFERENCE.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror23) { }
                try
                {
                    $SwitchMap$com$skype$Message$TYPE[com.skype.Message.TYPE.HAS_BIRTHDAY.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror22) { }
                try
                {
                    $SwitchMap$com$skype$Message$TYPE[com.skype.Message.TYPE.RETIRED.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror21) { }
                try
                {
                    $SwitchMap$com$skype$Message$TYPE[com.skype.Message.TYPE.ADDED_CONSUMERS.ordinal()] = 9;
                }
                catch (NoSuchFieldError nosuchfielderror20) { }
                try
                {
                    $SwitchMap$com$skype$Message$TYPE[com.skype.Message.TYPE.RETIRED_OTHERS.ordinal()] = 10;
                }
                catch (NoSuchFieldError nosuchfielderror19) { }
                try
                {
                    $SwitchMap$com$skype$Message$TYPE[com.skype.Message.TYPE.LEGACY_MEMBER_UPGRADED.ordinal()] = 11;
                }
                catch (NoSuchFieldError nosuchfielderror18) { }
                try
                {
                    $SwitchMap$com$skype$Message$TYPE[com.skype.Message.TYPE.ADDED_LEGACY_CONSUMERS.ordinal()] = 12;
                }
                catch (NoSuchFieldError nosuchfielderror17) { }
                try
                {
                    $SwitchMap$com$skype$Message$TYPE[com.skype.Message.TYPE.REQUESTED_AUTH.ordinal()] = 13;
                }
                catch (NoSuchFieldError nosuchfielderror16) { }
                try
                {
                    $SwitchMap$com$skype$Message$TYPE[com.skype.Message.TYPE.GRANTED_AUTH.ordinal()] = 14;
                }
                catch (NoSuchFieldError nosuchfielderror15) { }
                try
                {
                    $SwitchMap$com$skype$Message$TYPE[com.skype.Message.TYPE.POSTED_VOICE_MESSAGE.ordinal()] = 15;
                }
                catch (NoSuchFieldError nosuchfielderror14) { }
                try
                {
                    $SwitchMap$com$skype$Message$TYPE[com.skype.Message.TYPE.ENDED_LIVESESSION.ordinal()] = 16;
                }
                catch (NoSuchFieldError nosuchfielderror13) { }
                try
                {
                    $SwitchMap$com$skype$Message$TYPE[com.skype.Message.TYPE.POSTED_VOICE_AUTORESPONSE.ordinal()] = 17;
                }
                catch (NoSuchFieldError nosuchfielderror12) { }
                try
                {
                    $SwitchMap$com$skype$Message$TYPE[com.skype.Message.TYPE.POSTED_VIDEO.ordinal()] = 18;
                }
                catch (NoSuchFieldError nosuchfielderror11) { }
                try
                {
                    $SwitchMap$com$skype$Message$TYPE[com.skype.Message.TYPE.POSTED_VIDEO_MESSAGE.ordinal()] = 19;
                }
                catch (NoSuchFieldError nosuchfielderror10) { }
                try
                {
                    $SwitchMap$com$skype$Message$TYPE[com.skype.Message.TYPE.POSTED_LOCATION.ordinal()] = 20;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                try
                {
                    $SwitchMap$com$skype$Message$TYPE[com.skype.Message.TYPE.POSTED_FILE_MESSAGE.ordinal()] = 21;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    $SwitchMap$com$skype$Message$TYPE[com.skype.Message.TYPE.POSTED_FILES.ordinal()] = 22;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    $SwitchMap$com$skype$Message$TYPE[com.skype.Message.TYPE.BLOCKED.ordinal()] = 23;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    $SwitchMap$com$skype$Message$TYPE[com.skype.Message.TYPE.POSTED_FLIK_MESSAGE.ordinal()] = 24;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$com$skype$Message$TYPE[com.skype.Message.TYPE.POSTED_MEDIA_MESSAGE.ordinal()] = 25;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                $SwitchMap$com$skype$SkyLib$LEAVE_REASON = new int[com.skype.SkyLib.LEAVE_REASON.values().length];
                try
                {
                    $SwitchMap$com$skype$SkyLib$LEAVE_REASON[com.skype.SkyLib.LEAVE_REASON.LIVE_BUSY.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$skype$SkyLib$LEAVE_REASON[com.skype.SkyLib.LEAVE_REASON.LEAVE_REASON_NONE.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$skype$SkyLib$LEAVE_REASON[com.skype.SkyLib.LEAVE_REASON.LIVE_NO_ANSWER.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$skype$SkyLib$LEAVE_REASON[com.skype.SkyLib.LEAVE_REASON.LIVE_MANUAL.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        boolean flag1;
        if (message.getEditTimestampProp() > 0 && TextUtils.isEmpty(message.getBodyXmlProp()))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        _cls2..SwitchMap.com.skype.Message.TYPE[type.ordinal()];
        JVM INSTR tableswitch 1 25: default 152
    //                   1 177
    //                   2 177
    //                   3 177
    //                   4 177
    //                   5 177
    //                   6 177
    //                   7 177
    //                   8 177
    //                   9 177
    //                   10 177
    //                   11 177
    //                   12 177
    //                   13 199
    //                   14 224
    //                   15 250
    //                   16 296
    //                   17 458
    //                   18 514
    //                   19 514
    //                   20 538
    //                   21 562
    //                   22 586
    //                   23 610
    //                   24 703
    //                   25 703;
           goto _L3 _L4 _L4 _L4 _L4 _L4 _L4 _L4 _L4 _L4 _L4 _L4 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L10 _L11 _L12 _L13 _L14 _L15 _L15
_L3:
        if (XmmUtil.isXmmMessageType(type))
        {
            return conversationUtil.a(flag, flag1, type);
        }
_L4:
        if (flag1)
        {
            return conversationUtil.a();
        } else
        {
            return messageCache.a(message);
        }
_L5:
        return (new StringBuilder("\uD83D\uDC64 ")).append(conversationUtil.a(message, flag)).toString();
_L6:
        return (new StringBuilder("\u2714 ")).append(context.getString(0x7f080419)).toString();
_L7:
        type = new StringBuilder("\uD83D\uDD0A ");
        message = context;
        if (flag)
        {
            i = 0x7f080454;
        } else
        {
            i = 0x7f080453;
        }
        return type.append(message.getString(i)).toString();
_L8:
        i = message.getOtherLiveMessage();
        type = null;
        if (i != 0)
        {
            type = (Message)map.a(i, com/skype/Message);
        }
        map1 = _cls2..SwitchMap.com.skype.SkyLib.LEAVE_REASON;
        if (type != null)
        {
            type = type.getLeaveReasonProp();
        } else
        {
            type = message.getLeaveReasonProp();
        }
        map1[type.ordinal()];
        JVM INSTR tableswitch 1 3: default 376
    //                   1 376
    //                   2 376
    //                   3 428;
           goto _L16 _L16 _L16 _L17
_L16:
        return (new StringBuilder("\uD83D\uDCDE ")).append(context.getString(0x7f08036b, new Object[] {
            messageCache.a(message, true)
        })).toString();
_L17:
        if (flag) goto _L16; else goto _L18
_L18:
        return (new StringBuilder("\uD83D\uDCDE ")).append(context.getString(0x7f08037f)).toString();
_L9:
        if (flag)
        {
            return (new StringBuilder("\uD83D\uDD0A ")).append(context.getString(0x7f080454)).toString();
        } else
        {
            return (new StringBuilder("\uD83D\uDD0A ")).append(context.getString(0x7f080453)).toString();
        }
_L10:
        return (new StringBuilder("\uD83D\uDCF9 ")).append(conversationUtil.c(flag)).toString();
_L11:
        return (new StringBuilder("\uD83C\uDF10 ")).append(conversationUtil.e(flag)).toString();
_L12:
        return (new StringBuilder("\uD83D\uDCC1 ")).append(conversationUtil.d(flag)).toString();
_L13:
        return (new StringBuilder("\uD83D\uDCC1 ")).append(transferUtil.getMessageNotification(message)).toString();
_L14:
        if (flag)
        {
            type = contactForConversation(message.getAuthorProp(), map1);
            if (type == null || type.isMemberOfHardwiredGroup(com.skype.ContactGroup.TYPE.CONTACTS_BLOCKED_BY_ME))
            {
                i = 1;
            }
            if (i != 0)
            {
                return (new StringBuilder("\u274C ")).append(context.getString(0x7f0803ab)).toString();
            } else
            {
                return (new StringBuilder("\u2714 ")).append(context.getString(0x7f0803b6)).toString();
            }
        }
        break; /* Loop/switch isn't completed */
_L15:
        return (new StringBuilder("\uD83D\uDCF7 ")).append(conversationUtil.a(flag, flag1, type)).toString();
_L2:
        return "";
    }

    private android.support.v4.app.x.f.a.a getNewUnreadConversation(MessageHolder messageholder, CharSequence charsequence, int i)
    {
        return (new android.support.v4.app.x.f.a.a(charsequence.toString())).a(getCarReadPendingIntent(messageholder.getConversationIdentity(), i)).a(messageholder.getTimestamp()).a(getWearReplyPendingIntent(messageholder, i), getReplyRemoteInput(charsequence));
    }

    private String[] getPredefinedAnswers()
    {
        String as[] = context.getResources().getStringArray(0x7f0a0001);
        ArrayList arraylist = new ArrayList();
        arraylist.addAll(Arrays.asList(as));
        arraylist.add(":)");
        arraylist.add(":(");
        arraylist.add(":D");
        return (String[])arraylist.toArray(new String[arraylist.size()]);
    }

    private ae getReplyRemoteInput(CharSequence charsequence)
    {
        return (new android.support.v4.app.ae.a("com.skype.android.app.wearable.EXTRA_VOICE_REPLY")).a(context.getString(0x7f0804ea, new Object[] {
            charsequence
        })).a(getPredefinedAnswers()).a();
    }

    private android.support.v4.app.x.g getWearExtender(List list, MessageHolder messageholder, CharSequence charsequence, int i, int j)
    {
        list = buildSpannableChatHistory(list);
        android.support.v4.app.x.c c = new android.support.v4.app.x.c();
        c.b(list);
        list = (new android.support.v4.app.x.d(context)).a(c).a((new android.support.v4.app.x.s()).a()).e();
        charsequence = (new android.support.v4.app.x.a.a(0x7f020182, context.getString(0x7f0804ea, new Object[] {
            charsequence
        }), getWearReplyPendingIntent(messageholder, j))).a(getReplyRemoteInput(charsequence));
        messageholder = new android.support.v4.app.x.a.a(0x7f0200b1, context.getString(0x7f0804eb), getWearReplyWithEmoticonPendingIntent(i, j, messageholder.getTimestamp()));
        return (new android.support.v4.app.x.s()).a(list).a(charsequence.a()).a(messageholder.a());
    }

    private PendingIntent getWearReplyPendingIntent(MessageHolder messageholder, int i)
    {
        messageholder = (new Intent()).addFlags(32).setAction("com.skype.action.REPLY_MESSAGE").putExtra("conversationId", messageholder.getConversationIdentity()).putExtra("messageTimestamp", messageholder.getTimestamp());
        return PendingIntent.getBroadcast(context, i, messageholder, 0x8000000);
    }

    private PendingIntent getWearReplyWithEmoticonPendingIntent(int i, int j, long l)
    {
        Intent intent = (new Intent()).addFlags(32).setAction("com.skype.action.REPLY_WITH_EMOTICON").putExtra("conversationId", j).putExtra("notificationId", i).putExtra("messageTimestamp", l);
        return PendingIntent.getBroadcast(context, j, intent, 0x8000000);
    }

    public void clearAllMessages()
    {
    }

    public void clearMessage(int i)
    {
        notificationManager.cancel(MessageAgent.MESSAGE_CHAT_NOTIFICATION_ID | i);
        conversationBuilder.remove(i);
    }

    protected void displayAudioMessage(MessageHolder messageholder)
    {
    }

    protected void displayFileTransferMessage(MessageHolder messageholder)
    {
    }

    protected void displayLocationMessage(MessageHolder messageholder)
    {
        displayTextMessage(messageholder);
    }

    protected void displayMojiMessage(MessageHolder messageholder)
    {
        displayTextMessage(messageholder);
    }

    protected void displayMultipleMessages(List list)
    {
        for (list = list.iterator(); list.hasNext(); super.displayMessage((MessageHolder)list.next())) { }
    }

    protected void displayPhotoMessage(MessageHolder messageholder)
    {
        displayTextMessage(messageholder);
    }

    protected void displayTextMessage(final MessageHolder holder)
    {
        final Conversation conversation = getConversation(holder);
        MessageLoader messageloader = new MessageLoader(conversation, map, messageCache, 0);
        async.a(messageloader, new AsyncCallback() {

            final WearMessageNotificationRenderer this$0;
            final Conversation val$conversation;
            final MessageHolder val$holder;

            public final void done(AsyncResult asyncresult)
            {
                int i = MessageAgent.MESSAGE_CHAT_NOTIFICATION_ID | conversation.getObjectID();
                Object obj = getFormattedMessageContent(holder);
                CharSequence charsequence = getConversationTitle(conversation, holder);
                Bitmap bitmap = getConversationAvatar(conversation, true);
                PendingIntent pendingintent = getContentIntent(holder.getConversationIdentity());
                android.support.v4.app.x.g g = getCarExtender(holder, charsequence, ((CharSequence) (obj)), conversation.getObjectID());
                asyncresult = getWearExtender((List)asyncresult.a(), holder, charsequence, i, conversation.getObjectID());
                android.support.v4.app.x.d d = new android.support.v4.app.x.d(a);
                obj = d.a(getBigTextStyle(((CharSequence) (obj)))).a("CHAT_MESSAGE").d(false).b(((CharSequence) (obj))).a(charsequence);
                obj.g = bitmap;
                ((android.support.v4.app.x.d) (obj)).a(0x7f0201c2).a(pendingintent).a(holder.getTimestamp() * 1000L).a(g).a().c(false).a(asyncresult);
                notificationManager.notify(i, d.e());
            }

            
            {
                this$0 = WearMessageNotificationRenderer.this;
                conversation = conversation1;
                holder = messageholder;
                super();
            }
        });
    }

    protected void displayVideoMessage(MessageHolder messageholder)
    {
        displayTextMessage(messageholder);
    }









}
