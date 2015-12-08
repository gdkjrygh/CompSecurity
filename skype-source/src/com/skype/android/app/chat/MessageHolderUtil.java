// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import com.skype.Account;
import com.skype.Message;
import com.skype.android.skylib.ObjectIdMap;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.chat:
//            MessageHolder, SkypeMessageHolder

public class MessageHolderUtil
{

    private static final String SYSTEM_AUTHOR_NAME = "sys";
    private Provider accountProvider;
    private ObjectIdMap map;

    public MessageHolderUtil(Provider provider, ObjectIdMap objectidmap)
    {
        accountProvider = provider;
        map = objectidmap;
    }

    public static boolean isEndedLiveSession(MessageHolder messageholder)
    {
        return messageholder != null && messageholder.getTypeOrdinal() == com.skype.Message.TYPE.ENDED_LIVESESSION.toInt();
    }

    public static boolean isLiveSession(MessageHolder messageholder)
    {
        return isStartedLiveSession(messageholder) || isEndedLiveSession(messageholder);
    }

    private boolean isOutgoingEndedLiveSession(MessageHolder messageholder)
    {
        boolean flag = false;
        if (messageholder == null)
        {
            return false;
        }
        int i = ((Message)messageholder.getMessageObject()).getOtherLiveMessage();
        if (i != 0)
        {
            flag = isOutgoingMessage((Message)map.a(i, com/skype/Message));
        }
        return flag;
    }

    public static boolean isStartedLiveSession(MessageHolder messageholder)
    {
        return messageholder != null && messageholder.getTypeOrdinal() == com.skype.Message.TYPE.STARTED_LIVESESSION.toInt();
    }

    public static boolean isSystemMessage(MessageHolder messageholder)
    {
        return messageholder.getAuthorIdentity().equalsIgnoreCase("sys");
    }

    public Message getMessageObject(MessageHolder messageholder)
    {
        messageholder = ((MessageHolder) (messageholder.getMessageObject()));
        if (messageholder instanceof Message)
        {
            return (Message)messageholder;
        } else
        {
            return null;
        }
    }

    public boolean isMissedCall(MessageHolder messageholder)
    {
        boolean flag;
label0:
        {
            boolean flag1 = false;
            if (!(messageholder instanceof SkypeMessageHolder))
            {
                return false;
            }
            if (!isStartedLiveSession(messageholder))
            {
                flag = flag1;
                if (!isEndedLiveSession(messageholder))
                {
                    break label0;
                }
            }
            Message message = (Message)messageholder.getMessageObject();
            if (message.getLeaveReasonProp() != com.skype.SkyLib.LEAVE_REASON.LIVE_MANUAL)
            {
                flag = flag1;
                if (message.getLeaveReasonProp() != com.skype.SkyLib.LEAVE_REASON.LIVE_NO_ANSWER)
                {
                    break label0;
                }
            }
            flag = flag1;
            if (!isOutgoing(messageholder))
            {
                flag = true;
            }
        }
        return flag;
    }

    public boolean isOutgoing(MessageHolder messageholder)
    {
        if (isEndedLiveSession(messageholder))
        {
            return isOutgoingEndedLiveSession(messageholder);
        } else
        {
            return messageholder.getAuthorIdentity().equalsIgnoreCase(((Account)accountProvider.get()).getSkypenameProp());
        }
    }

    public boolean isOutgoingMessage(Message message)
    {
        return message != null && message.getAuthorProp().equalsIgnoreCase(((Account)accountProvider.get()).getSkypenameProp());
    }
}
