// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.wear;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.skype.Contact;
import com.skype.ContactImpl;
import com.skype.Conversation;
import com.skype.Message;
import com.skype.SkyLib;
import com.skype.android.app.chat.MessageHolderUtil;
import com.skype.android.app.chat.MessageLoader;
import com.skype.android.app.common.WearConversationHistory;
import com.skype.android.app.common.WearConversationMessageItem;
import com.skype.android.app.media.XmmUtil;
import com.skype.android.app.transfer.TransferUtil;
import com.skype.android.skylib.ObjectIdMap;
import com.skype.android.util.ConversationUtil;
import com.skype.android.util.cache.FormattedMessageCache;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WearConversationHistoryLoader
{

    private static final String EMOJI_BLOCKED = "\u274C ";
    private static final String EMOJI_CAMERA = "\uD83D\uDCF7 ";
    private static final String EMOJI_CONTACT = "\uD83D\uDC64 ";
    private static final String EMOJI_FILE_FOLDER = "\uD83D\uDCC1 ";
    private static final String EMOJI_PLAY = "\uD83D\uDD0A ";
    private static final String EMOJI_TELEPHONE_RECEIVER = "\uD83D\uDCDE ";
    private static final String EMOJI_UNBLOCKED = "\u2714 ";
    private static final String EMOJI_VIDEO_CAMERA = "\uD83D\uDCF9 ";
    private static final String EMOJI_WORLD = "\uD83C\uDF10 ";
    private final Context context;
    private final ConversationUtil conversationUtil;
    private final SkyLib lib;
    private final ObjectIdMap map;
    private final FormattedMessageCache messageCache;
    private final MessageHolderUtil messageHolderUtil;
    private final TransferUtil transferUtil;

    public WearConversationHistoryLoader(ObjectIdMap objectidmap, FormattedMessageCache formattedmessagecache, MessageHolderUtil messageholderutil, TransferUtil transferutil, ConversationUtil conversationutil, Context context1, SkyLib skylib)
    {
        map = objectidmap;
        messageCache = formattedmessagecache;
        messageHolderUtil = messageholderutil;
        transferUtil = transferutil;
        conversationUtil = conversationutil;
        context = context1;
        lib = skylib;
    }

    private WearConversationHistory buildWearConversationHistory(List list)
    {
        HashMap hashmap = new HashMap();
        WearConversationHistory wearconversationhistory = new WearConversationHistory();
        int i = 0;
        do
        {
            while (i < list.size()) 
            {
                Object obj = (Message)list.get(i);
                if (obj != null)
                {
                    Object obj1 = ((Message) (obj)).getTypeProp();
                    if (obj1 != com.skype.Message.TYPE.STARTED_LIVESESSION)
                    {
                        boolean flag = messageHolderUtil.isOutgoingMessage(((Message) (obj)));
                        obj1 = getMessageChatText(((com.skype.Message.TYPE) (obj1)), ((Message) (obj)), flag, hashmap);
                        if (!TextUtils.isEmpty(((CharSequence) (obj1))))
                        {
                            obj1 = new WearConversationMessageItem(((CharSequence) (obj1)));
                            if (flag)
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
                            ((WearConversationMessageItem) (obj1)).setAuthor(((String) (obj)));
                            wearconversationhistory.add(((WearConversationMessageItem) (obj1)));
                        }
                    }
                }
                i++;
            }
            return wearconversationhistory;
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

    private CharSequence getMessageChatText(com.skype.Message.TYPE type, Message message, boolean flag, Map map1)
    {
        int i = 0;
        if (type == null) goto _L2; else goto _L1
_L1:
        static final class _cls1
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
        _cls1..SwitchMap.com.skype.Message.TYPE[type.ordinal()];
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
    //                   15 249
    //                   16 293
    //                   17 457
    //                   18 511
    //                   19 511
    //                   20 535
    //                   21 559
    //                   22 583
    //                   23 607
    //                   24 700
    //                   25 700;
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
        map1 = _cls1..SwitchMap.com.skype.SkyLib.LEAVE_REASON;
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
    //                   3 427;
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

    public WearConversationHistory getWearConversationHistory(int i)
    {
        return buildWearConversationHistory((new MessageLoader((Conversation)map.a(i, com/skype/Conversation), map, messageCache, 0)).call());
    }
}
