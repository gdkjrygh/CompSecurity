// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.dialer;

import com.skype.Conversation;
import com.skype.Message;
import com.skype.android.app.recents.Recent;
import com.skype.android.util.ConversationUtil;
import com.skype.android.util.ImageSource;
import java.util.Comparator;

final class b
    implements Recent, ImageSource
{

    private final Conversation conversation;
    private ConversationUtil conversationUtil;
    private final Message message;

    public b(ConversationUtil conversationutil, Conversation conversation1, Message message1)
    {
        conversationUtil = conversationutil;
        conversation = conversation1;
        message = message1;
    }

    public final int compareTo(Recent recent)
    {
        return TIME_COMPARATOR.compare(this, recent);
    }

    public final volatile int compareTo(Object obj)
    {
        return compareTo((Recent)obj);
    }

    public final int getConversationObjectId()
    {
        return conversation.getObjectID();
    }

    public final String getDisplayName()
    {
        return conversationUtil.m(conversation).toString();
    }

    public final String getIdentity()
    {
        return conversation.getIdentityProp();
    }

    public final byte[] getImageData()
    {
        return conversation.getMetaPictureProp();
    }

    public final long getImageTimestamp()
    {
        return 0L;
    }

    public final int getLastMessageObjectId()
    {
        return message.getObjectID();
    }

    public final com.skype.Conversation.LOCAL_LIVESTATUS getLiveStatus()
    {
        return conversation.getLocalLiveStatusProp();
    }

    public final int getObjectId()
    {
        return 0;
    }

    public final String getPicture()
    {
        return conversation.getPictureProp();
    }

    public final long getTimestamp()
    {
        return (long)message.getTimestampProp();
    }

    public final int getUnreadCount()
    {
        return 0;
    }

    public final boolean isDialog()
    {
        return conversation.getTypeProp().toInt() == com.skype.Conversation.TYPE.DIALOG.toInt();
    }

    public final boolean isInboxConversation()
    {
        return conversation.getInboxTimestampProp() > 0;
    }
}
