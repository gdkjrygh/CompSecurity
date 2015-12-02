// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.a;


public class c
    implements Runnable
{

    private volatile Runnable a;

    public c(Runnable runnable)
    {
        a = runnable;
    }

    public void a()
    {
        a = null;
    }

    public void run()
    {
        Runnable runnable = a;
        if (runnable != null)
        {
            runnable.run();
        }
    }
}
