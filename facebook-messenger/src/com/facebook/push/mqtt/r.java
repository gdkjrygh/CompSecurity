// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.push.mqtt;

import com.google.common.base.Preconditions;

class r
{

    private final Runnable a;
    private final long b;
    private volatile int c;

    public r(Runnable runnable, long l)
    {
        c = 0;
        a = runnable;
        b = l;
    }

    public Runnable a()
    {
        return a;
    }

    public void a(int i)
    {
        boolean flag;
        if (i >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        c = i;
    }

    public long b()
    {
        return b;
    }

    public int c()
    {
        return c;
    }

    public int d()
    {
        return a().hashCode();
    }
}
