// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.l;

import com.facebook.messages.model.threads.Message;
import java.util.Comparator;

public class aj
    implements Comparator
{

    public aj()
    {
    }

    private long a(Message message)
    {
        if (message.g() && message.h() < message.f())
        {
            return message.h();
        } else
        {
            return message.f();
        }
    }

    public int a(Message message, Message message1)
    {
        long l = a(message);
        long l1 = a(message1);
        if (l > l1)
        {
            return -1;
        }
        return l >= l1 ? 0 : 1;
    }

    public int compare(Object obj, Object obj1)
    {
        return a((Message)obj, (Message)obj1);
    }
}
