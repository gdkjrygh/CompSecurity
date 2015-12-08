// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.text.TextUtils;
import com.skype.Conversation;
import com.skype.Message;
import com.skype.PROPKEY;
import com.skype.android.util.ConversationUtil;

// Referenced classes of package com.skype.android.app.chat:
//            MessageHolder

public class SkypeMessageHolder
    implements MessageHolder
{

    private static final String KEY_PREFIX = "skype_";
    private String cachedIdentity;
    private long cachedTimestamp;
    private boolean consumed;
    private final Conversation conversation;
    private ConversationUtil conversationUtil;
    private final Message message;
    private int typeOrdinal;

    public SkypeMessageHolder(Conversation conversation1, Message message1, ConversationUtil conversationutil)
    {
        cachedIdentity = null;
        cachedTimestamp = -1L;
        typeOrdinal = -1;
        if (conversation1 == null)
        {
            throw new IllegalArgumentException("null conversation");
        }
        if (message1 == null)
        {
            throw new IllegalArgumentException("null message");
        }
        message = message1;
        conversation = conversation1;
        conversationUtil = conversationutil;
        boolean flag;
        if (message1.getConsumptionStatusProp() == com.skype.Message.CONSUMPTION_STATUS.CONSUMED)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        consumed = flag;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof MessageHolder)
        {
            obj = (MessageHolder)obj;
            return getConversationIdentity().equals(((MessageHolder) (obj)).getConversationIdentity());
        } else
        {
            return false;
        }
    }

    public String getAuthorDisplayName()
    {
        return message.getAuthorDisplaynameProp();
    }

    public String getAuthorIdentity()
    {
        if (cachedIdentity == null)
        {
            cachedIdentity = message.getAuthorProp();
        }
        return cachedIdentity;
    }

    public Conversation getConversation()
    {
        return conversation;
    }

    public String getConversationDisplayName()
    {
        return conversationUtil.m(conversation).toString();
    }

    public String getConversationIdentity()
    {
        return conversation.getIdentityProp();
    }

    public long getEditTimestamp()
    {
        return (long)message.getEditTimestampProp();
    }

    public CharSequence getFormattableContent()
    {
        return null;
    }

    public String getMessageId()
    {
        return (new StringBuilder("skype_")).append(message.getObjectID()).toString();
    }

    public Object getMessageObject()
    {
        return message;
    }

    public String getTextContent()
    {
        return message.getStrPropertyWithXmlStripped(PROPKEY.MESSAGE_BODY_XML, "");
    }

    public long getTimestamp()
    {
        if (cachedTimestamp == -1L)
        {
            cachedTimestamp = message.getTimestampProp();
        }
        return cachedTimestamp;
    }

    public int getTypeOrdinal()
    {
        if (typeOrdinal == -1)
        {
            com.skype.Message.TYPE type = message.getTypeProp();
            if (type != null)
            {
                typeOrdinal = type.toInt();
            } else
            {
                typeOrdinal = com.skype.Message.TYPE.POSTED_TEXT.toInt();
            }
        }
        return typeOrdinal;
    }

    public int hashCode()
    {
        return getConversationIdentity().hashCode();
    }

    public boolean isConference()
    {
        return conversation.getTypeProp() == com.skype.Conversation.TYPE.CONFERENCE;
    }

    public boolean isConsumed()
    {
        return consumed;
    }

    public boolean isDeleted()
    {
        return getTimestamp() > 0L && TextUtils.isEmpty(getTextContent());
    }
}
