// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util;


public class StopWatch
{

    private long a;
    private long b;
    private boolean c;

    public StopWatch()
    {
        a();
    }

    public final void a()
    {
        a = System.currentTimeMillis();
        c = false;
    }

    public final void b()
    {
        b = System.currentTimeMillis();
        c = true;
    }

    public final long c()
    {
        if (c)
        {
            return b;
        } else
        {
            return System.currentTimeMillis() - a;
        }
    }
}
