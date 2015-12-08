// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import com.skype.Contact;
import com.skype.ContactImpl;
import com.skype.Conversation;
import com.skype.ConversationImpl;
import com.skype.Message;
import com.skype.SkyLib;
import com.skype.android.SkypeConstants;
import com.skype.android.app.main.SplashActivity;
import com.skype.android.push.ChatPushMessage;
import com.skype.android.push.PushEventType;
import com.skype.android.util.ConversationUtil;
import com.skype.android.util.DeviceFeatures;
import com.skype.android.util.ImageCache;
import com.skype.android.util.cache.FormattedMessageCache;
import java.util.List;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.app.chat:
//            MessageNotificationRenderer, MessageHolder, SyntheticTypes

public abstract class AbstractMessageNotificationRenderer
    implements SkypeConstants, MessageNotificationRenderer
{

    protected static final String CHAT_MESSAGE_GROUP = "CHAT_MESSAGE";
    private static final Logger log = Logger.getLogger("AbstractMessageNotificationRenderer");
    protected final Context context;
    protected final ConversationUtil conversationUtil;
    private final ImageCache imageCache;
    protected final SkyLib lib;
    private final FormattedMessageCache messageCache;

    protected AbstractMessageNotificationRenderer(Context context1, SkyLib skylib, ConversationUtil conversationutil, FormattedMessageCache formattedmessagecache, ImageCache imagecache)
    {
        context = context1;
        lib = skylib;
        conversationUtil = conversationutil;
        messageCache = formattedmessagecache;
        imageCache = imagecache;
    }

    private CharSequence getContentTextForConference(String s, CharSequence charsequence)
    {
        String s1 = s;
        ContactImpl contactimpl = new ContactImpl();
        String s2 = s1;
        if (lib.getContact(s, contactimpl))
        {
            s2 = s1;
            if (!TextUtils.isEmpty(contactimpl.getDisplaynameProp()))
            {
                s2 = contactimpl.getDisplaynameProp();
            }
        }
        return concatSenderAndMessage(s2, charsequence.toString());
    }

    private com.skype.Message.TYPE getMessageType(MessageHolder messageholder)
    {
        Object obj = null;
        Object obj1 = messageholder.getMessageObject();
        if (obj1 instanceof ChatPushMessage)
        {
            messageholder = ((ChatPushMessage)obj1).getEventType().getCorrespondingMessageType();
        } else
        {
            messageholder = obj;
            if (obj1 instanceof Message)
            {
                return ((Message)obj1).getTypeProp();
            }
        }
        return messageholder;
    }

    protected SpannableStringBuilder concatSenderAndMessage(String s, String s1)
    {
        s1 = new SpannableStringBuilder(context.getString(0x7f08045b, new Object[] {
            s, s1
        }));
        s1.setSpan(new StyleSpan(1), 0, s.length(), 0);
        return s1;
    }

    protected abstract void displayAudioMessage(MessageHolder messageholder);

    protected abstract void displayFileTransferMessage(MessageHolder messageholder);

    protected abstract void displayLocationMessage(MessageHolder messageholder);

    protected void displayMessage(MessageHolder messageholder)
    {
        if (messageholder == null)
        {
            log.warning("Trying to display one message in notification but MessageHolder is null");
            return;
        }
        com.skype.Message.TYPE type = getMessageType(messageholder);
        if (type == null)
        {
            displayTextMessage(messageholder);
            return;
        }
        static final class _cls1
        {

            static final int $SwitchMap$com$skype$Message$TYPE[];
            static final int $SwitchMap$com$skype$android$push$PushEventType[];

            static 
            {
                $SwitchMap$com$skype$android$push$PushEventType = new int[PushEventType.values().length];
                try
                {
                    $SwitchMap$com$skype$android$push$PushEventType[PushEventType.MEDIA_MESSAGE_SHARING.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                $SwitchMap$com$skype$Message$TYPE = new int[com.skype.Message.TYPE.values().length];
                try
                {
                    $SwitchMap$com$skype$Message$TYPE[com.skype.Message.TYPE.POSTED_MEDIA_MESSAGE.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    $SwitchMap$com$skype$Message$TYPE[com.skype.Message.TYPE.POSTED_VIDEO.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$com$skype$Message$TYPE[com.skype.Message.TYPE.POSTED_VIDEO_MESSAGE.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$skype$Message$TYPE[com.skype.Message.TYPE.POSTED_AUDIO_MESSAGE.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$skype$Message$TYPE[com.skype.Message.TYPE.POSTED_FILE_MESSAGE.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$skype$Message$TYPE[com.skype.Message.TYPE.POSTED_LOCATION.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$skype$Message$TYPE[com.skype.Message.TYPE.POSTED_FLIK_MESSAGE.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1..SwitchMap.com.skype.Message.TYPE[type.ordinal()])
        {
        default:
            displayTextMessage(messageholder);
            return;

        case 1: // '\001'
            displayPhotoMessage(messageholder);
            return;

        case 2: // '\002'
        case 3: // '\003'
            displayVideoMessage(messageholder);
            return;

        case 4: // '\004'
            displayAudioMessage(messageholder);
            return;

        case 5: // '\005'
            displayFileTransferMessage(messageholder);
            return;

        case 6: // '\006'
            displayLocationMessage(messageholder);
            return;

        case 7: // '\007'
            displayMojiMessage(messageholder);
            break;
        }
    }

    public void displayMessages(List list)
    {
        if (list == null || list.isEmpty())
        {
            log.warning("Trying to display messages in notification but list of MessageHolder is null");
            return;
        }
        if (list.size() == 1)
        {
            displayMessage((MessageHolder)list.get(0));
            return;
        } else
        {
            displayMultipleMessages(list);
            return;
        }
    }

    protected abstract void displayMojiMessage(MessageHolder messageholder);

    protected abstract void displayMultipleMessages(List list);

    protected abstract void displayPhotoMessage(MessageHolder messageholder);

    protected abstract void displayTextMessage(MessageHolder messageholder);

    protected abstract void displayVideoMessage(MessageHolder messageholder);

    protected android.support.v4.app.x.c getBigTextStyle(CharSequence charsequence)
    {
        android.support.v4.app.x.c c = new android.support.v4.app.x.c();
        if (!DeviceFeatures.e())
        {
            c.a("");
        }
        c.b(charsequence);
        return c;
    }

    protected PendingIntent getContentIntent(String s)
    {
        int i = 0;
        Intent intent = new Intent(context, com/skype/android/app/main/SplashActivity);
        intent.addFlags(0x10000000);
        if (s != null)
        {
            intent.setAction("android.intent.action.VIEW");
            intent.putExtra("com.skype.identitiy", s);
        } else
        {
            intent.putExtra("com.skype.index", 0);
        }
        if (s != null)
        {
            i = s.hashCode();
        }
        return PendingIntent.getActivity(context, i, intent, 0x8000000);
    }

    protected Conversation getConversation(MessageHolder messageholder)
    {
        ConversationImpl conversationimpl = new ConversationImpl();
        if (lib.getConversationByIdentity(messageholder.getConversationIdentity(), conversationimpl, true))
        {
            return conversationimpl;
        } else
        {
            return null;
        }
    }

    protected Bitmap getConversationAvatar(Conversation conversation, boolean flag)
    {
        return imageCache.a(conversation, Boolean.valueOf(flag));
    }

    protected CharSequence getConversationTitle(Conversation conversation, MessageHolder messageholder)
    {
        CharSequence charsequence = conversationUtil.m(conversation);
        conversation = charsequence;
        if (TextUtils.isEmpty(charsequence))
        {
            conversation = messageholder.getConversationDisplayName();
        }
        return conversation;
    }

    protected CharSequence getFormattedMessageContent(MessageHolder messageholder)
    {
        CharSequence charsequence1 = getMessageContent(messageholder);
        CharSequence charsequence = charsequence1;
        if (messageholder.isConference())
        {
            charsequence = getContentTextForConference(messageholder.getAuthorIdentity(), charsequence1);
        }
        return charsequence;
    }

    protected CharSequence getMessageContent(MessageHolder messageholder)
    {
        if (messageholder.getTypeOrdinal() == SyntheticTypes.PUSH.getType())
        {
            messageholder = (ChatPushMessage)messageholder.getMessageObject();
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

}
