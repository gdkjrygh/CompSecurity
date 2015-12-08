// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.wear.command;

import android.content.Context;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import com.google.android.gms.common.api.e;
import com.google.android.gms.wearable.c;
import com.google.android.gms.wearable.h;
import com.google.android.gms.wearable.n;
import com.google.android.gms.wearable.o;
import com.skype.Contact;
import com.skype.ContactImpl;
import com.skype.Conversation;
import com.skype.ConversationImpl;
import com.skype.Message;
import com.skype.SkyLib;
import com.skype.android.app.chat.MessageHolder;
import com.skype.android.app.chat.MessageLoader;
import com.skype.android.app.chat.SkypeMessageHolder;
import com.skype.android.app.chat.SyntheticTypes;
import com.skype.android.app.common.RecentConversationItem;
import com.skype.android.app.common.RecentConversationList;
import com.skype.android.app.recents.Recent;
import com.skype.android.app.wear.ProtocolCommonCommands;
import com.skype.android.app.wear.util.WearDataLayerUtil;
import com.skype.android.push.ChatPushMessage;
import com.skype.android.push.PushEventType;
import com.skype.android.res.DefaultAvatars;
import com.skype.android.skylib.ObjectIdMap;
import com.skype.android.util.ConversationUtil;
import com.skype.android.util.ImageCache;
import com.skype.android.util.cache.FormattedMessageCache;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.skype.android.app.wear.command:
//            CompletionWearCommand

public class NotifyRecentConversationListUpdatedCommand extends CompletionWearCommand
{

    private static final String TAG = com/skype/android/app/wear/command/NotifyRecentConversationListUpdatedCommand.getSimpleName();
    private final Context context;
    private final ConversationUtil conversationUtil;
    private final DefaultAvatars defaultAvatars;
    private final ImageCache imageCache;
    private final ObjectIdMap map;
    private final FormattedMessageCache messageCache;
    private final List recentList;
    private final SkyLib skyLib;

    public NotifyRecentConversationListUpdatedCommand(List list, SkyLib skylib, ImageCache imagecache, ConversationUtil conversationutil, ObjectIdMap objectidmap, Context context1, FormattedMessageCache formattedmessagecache, 
            DefaultAvatars defaultavatars)
    {
        recentList = list;
        skyLib = skylib;
        imageCache = imagecache;
        conversationUtil = conversationutil;
        map = objectidmap;
        context = context1;
        messageCache = formattedmessagecache;
        defaultAvatars = defaultavatars;
    }

    private SpannableStringBuilder concatSenderAndMessage(String s, String s1)
    {
        s1 = new SpannableStringBuilder(context.getString(0x7f08045b, new Object[] {
            s, s1
        }));
        s1.setSpan(new StyleSpan(1), 0, s.length(), 0);
        return s1;
    }

    private CharSequence getContentTextForConference(String s, CharSequence charsequence)
    {
        String s1 = s;
        ContactImpl contactimpl = new ContactImpl();
        String s2 = s1;
        if (skyLib.getContact(s, contactimpl))
        {
            s2 = s1;
            if (!TextUtils.isEmpty(contactimpl.getDisplaynameProp()))
            {
                s2 = contactimpl.getDisplaynameProp();
            }
        }
        return concatSenderAndMessage(s2, charsequence.toString());
    }

    private Conversation getConversation(String s)
    {
        ConversationImpl conversationimpl = new ConversationImpl();
        if (skyLib.getConversationByIdentity(s, conversationimpl, true))
        {
            return conversationimpl;
        } else
        {
            return null;
        }
    }

    private CharSequence getFormattedMessageContent(MessageHolder messageholder)
    {
        CharSequence charsequence1 = getMessageContent(messageholder);
        CharSequence charsequence = charsequence1;
        if (messageholder.isConference())
        {
            charsequence = getContentTextForConference(messageholder.getAuthorIdentity(), charsequence1);
        }
        return charsequence;
    }

    private CharSequence getMessageContent(MessageHolder messageholder)
    {
        if (messageholder.getTypeOrdinal() == SyntheticTypes.PUSH.getType())
        {
            messageholder = (ChatPushMessage)messageholder.getMessageObject();
            static final class _cls1
            {

                static final int $SwitchMap$com$skype$android$push$PushEventType[];

                static 
                {
                    $SwitchMap$com$skype$android$push$PushEventType = new int[PushEventType.values().length];
                    try
                    {
                        $SwitchMap$com$skype$android$push$PushEventType[PushEventType.MEDIA_MESSAGE_SHARING.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror) { }
                }
            }

            switch (_cls1..SwitchMap.com.skype.android.push.PushEventType[messageholder.getEventType().ordinal()])
            {
            default:
                return messageCache.a(messageholder);

            case 1: // '\001'
                return context.getString(0x7f0802ec);
            }
        } else
        {
            return messageholder.getTextContent();
        }
    }

    private void putRecentConversationAvatar(Recent recent, h h1)
    {
        Conversation conversation = getConversation(recent.getIdentity());
        if (conversation != null)
        {
            android.graphics.Bitmap bitmap = imageCache.a(conversation);
            Object obj = bitmap;
            if (bitmap == null)
            {
                if (conversation.getTypeProp() == com.skype.Conversation.TYPE.DIALOG)
                {
                    obj = com.skype.android.res.DefaultAvatars.AvatarType.c;
                } else
                {
                    obj = com.skype.android.res.DefaultAvatars.AvatarType.d;
                }
                obj = defaultAvatars.b(((com.skype.android.res.DefaultAvatars.AvatarType) (obj)), com.skype.android.res.DefaultAvatars.AvatarSize.a, recent.getIdentity());
            }
            obj = WearDataLayerUtil.createAssetFromBitmap(((android.graphics.Bitmap) (obj)));
            if (obj != null)
            {
                h1.a(Integer.toString(recent.getConversationObjectId()), ((com.google.android.gms.wearable.Asset) (obj)));
            }
        }
    }

    private RecentConversationItem serializeRecentConversationItem(Recent recent)
    {
        recent = new RecentConversationItem(recent.getConversationObjectId(), recent.getIdentity(), recent.getDisplayName(), recent.getLastMessageObjectId(), recent.getUnreadCount());
        setLastMessageText(recent);
        return recent;
    }

    private void setLastMessageText(RecentConversationItem recentconversationitem)
    {
        Conversation conversation = getConversation(recentconversationitem.getIdentity());
        SkypeMessageHolder skypemessageholder = new SkypeMessageHolder(conversation, (Message)map.a(recentconversationitem.getLastMessageObjectId(), com/skype/Message), conversationUtil);
        (new MessageLoader(conversation, map, messageCache, 0)).call();
        recentconversationitem.setLastMessageText(getFormattedMessageContent(skypemessageholder));
    }

    public void send(com.google.android.gms.common.api.c c1, com.google.android.gms.common.api.h h1)
    {
        n n1 = n.a(com.skype.android.app.wear.RemoteDeviceCapabilities.RemoteCommands.NOTIFY_CONTENT_RECENT_CONVO_LIST_JSON_DEFINITION_UPDATED.getCommandPath(new Object[0]));
        h h2 = n1.a();
        Object obj = new RecentConversationList();
        Recent recent;
        for (Iterator iterator = recentList.iterator(); iterator.hasNext(); putRecentConversationAvatar(recent, h2))
        {
            recent = (Recent)iterator.next();
            ((RecentConversationList) (obj)).add(serializeRecentConversationItem(recent));
        }

        obj = ((RecentConversationList) (obj)).serializeAsAsset();
        ProtocolCommonCommands.putTimestamp(h2, SystemClock.uptimeMillis());
        ProtocolCommonCommands.putRecentConversationListJson(h2, ((com.google.android.gms.wearable.Asset) (obj)));
        o.a.a(c1, n1.b()).a(h1);
    }

}
