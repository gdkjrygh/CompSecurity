// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.gsa.a;

import com.google.android.apps.gsa.shared.b.a.a;
import com.google.common.base.p;

abstract class f extends Thread
{

    private final a a;
    private volatile boolean b;

    protected f(String s)
    {
        super(s);
        b = true;
        a = (a)a.a.get();
    }

    public final void a()
    {
        b = false;
        interrupt();
    }

    protected final void b()
    {
        boolean flag;
        if (Thread.currentThread() == this)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.b(flag);
        if (Thread.interrupted() || !b)
        {
            throw new InterruptedException();
        } else
        {
            return;
        }
    }

    protected abstract void c();

    public final void run()
    {
        Exception exception;
        a.a.set(a);
        try
        {
            c();
        }
        catch (InterruptedException interruptedexception)
        {
            b = false;
            a.a.set(null);
            return;
        }
        finally
        {
            b = false;
        }
        b = false;
        a.a.set(null);
        return;
        a.a.set(null);
        throw exception;
    }
}
