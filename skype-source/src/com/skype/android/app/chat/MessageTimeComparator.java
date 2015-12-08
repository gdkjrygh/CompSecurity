// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import com.skype.Message;
import java.io.Serializable;
import java.util.Comparator;

public class MessageTimeComparator
    implements Serializable, Comparator
{

    public MessageTimeComparator()
    {
    }

    public int compare(Message message, Message message1)
    {
        return (int)(((long)message.getTimestampProp() & 0xffffffffL) - ((long)message1.getTimestampProp() & 0xffffffffL));
    }

    public volatile int compare(Object obj, Object obj1)
    {
        return compare((Message)obj, (Message)obj1);
    }
}
