// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import com.skype.Message;

// Referenced classes of package com.skype.android.app.chat:
//            MessageTimeComparator, MessageLoader

private static final class <init> extends MessageTimeComparator
{

    public final int compare(Message message, Message message1)
    {
        int j = super.compare(message, message1);
        int i = j;
        if (j == 0)
        {
            i = message.getDbID() - message1.getDbID();
        }
        return i;
    }

    public final volatile int compare(Object obj, Object obj1)
    {
        return compare((Message)obj, (Message)obj1);
    }

    private rator()
    {
    }

    rator(rator rator)
    {
        this();
    }
}
