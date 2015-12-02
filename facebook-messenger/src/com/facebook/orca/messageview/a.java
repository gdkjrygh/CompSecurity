// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.messageview;

import com.facebook.messages.model.threads.Message;
import com.facebook.orca.threads.ThreadSummary;
import java.util.List;

public class a
{

    private List a;
    private List b;
    private ThreadSummary c;
    private Message d;

    public a()
    {
    }

    public List a()
    {
        return a;
    }

    public void a(Message message)
    {
        d = message;
    }

    public void a(ThreadSummary threadsummary)
    {
        c = threadsummary;
    }

    public void a(List list)
    {
        a = list;
    }

    public List b()
    {
        return b;
    }

    public void b(List list)
    {
        b = list;
    }

    public ThreadSummary c()
    {
        return c;
    }

    public Message d()
    {
        return d;
    }
}
