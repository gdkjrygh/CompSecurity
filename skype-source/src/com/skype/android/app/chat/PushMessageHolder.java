// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import com.skype.android.push.ChatPushMessage;
import com.skype.msnp.MsnpIdentity;
import com.skype.msnp.MsnpIdentityType;
import com.skype.msnp.MsnpMessage;

// Referenced classes of package com.skype.android.app.chat:
//            MessageHolder, SyntheticTypes

public class PushMessageHolder
    implements MessageHolder
{

    private static final String KEY_PREFIX = "push_";
    private final ChatPushMessage pushMessage;

    public PushMessageHolder(ChatPushMessage chatpushmessage)
    {
        pushMessage = chatpushmessage;
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
        return pushMessage.getAuthorDisplayName();
    }

    public String getAuthorIdentity()
    {
        return pushMessage.getSenderId();
    }

    public String getConversationDisplayName()
    {
        return pushMessage.getAuthorDisplayName().trim();
    }

    public String getConversationIdentity()
    {
        return pushMessage.getConversationIdentity();
    }

    public long getEditTimestamp()
    {
        return getTimestamp();
    }

    public CharSequence getFormattableContent()
    {
        return pushMessage.getMessageBody();
    }

    public String getMessageId()
    {
        Object obj = null;
        String s = obj;
        if (pushMessage != null)
        {
            MsnpMessage msnpmessage = pushMessage.getMsnpMessage();
            s = obj;
            if (msnpmessage != null)
            {
                s = (new StringBuilder("push_")).append(msnpmessage.e()).toString();
            }
        }
        return s;
    }

    public Object getMessageObject()
    {
        return pushMessage;
    }

    public String getTextContent()
    {
        return pushMessage.getMessageBody();
    }

    public long getTimestamp()
    {
        return pushMessage.getReceivedTimestamp();
    }

    public int getTypeOrdinal()
    {
        return SyntheticTypes.PUSH.getType();
    }

    public int hashCode()
    {
        return getConversationIdentity().hashCode();
    }

    public boolean isConference()
    {
        boolean flag1 = false;
        Object obj = pushMessage.getMsnpMessage();
        boolean flag = flag1;
        if (obj != null)
        {
            obj = ((MsnpMessage) (obj)).b();
            flag = flag1;
            if (obj != null)
            {
                flag = flag1;
                if (((MsnpIdentity) (obj)).a() == MsnpIdentityType.f)
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public boolean isConsumed()
    {
        return pushMessage.isConsumed();
    }

    public boolean isDeleted()
    {
        return false;
    }
}
