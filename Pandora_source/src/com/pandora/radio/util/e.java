// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.radio.util;


public class e
{

    private final Object a = new Object();
    private volatile boolean b;

    public e(boolean flag)
    {
        b = false;
        b = flag;
    }

    public void a(long l)
        throws InterruptedException
    {
        synchronized (a)
        {
            if (!b)
            {
                a.wait(l);
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean a()
    {
        return b;
    }

    public void b()
    {
        synchronized (a)
        {
            b = true;
            a.notifyAll();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
