// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.retouch;


public final class l
{

    private static l e;
    private int a;
    private int b;
    private int c;
    private boolean d;

    public l()
    {
    }

    public static l f()
    {
        com/roidapp/imagelib/retouch/l;
        JVM INSTR monitorenter ;
        l l1;
        if (e == null)
        {
            e = new l();
        }
        l1 = e;
        com/roidapp/imagelib/retouch/l;
        JVM INSTR monitorexit ;
        return l1;
        Exception exception;
        exception;
        throw exception;
    }

    public static void g()
    {
        com/roidapp/imagelib/retouch/l;
        JVM INSTR monitorenter ;
        e = null;
        com/roidapp/imagelib/retouch/l;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(int i)
    {
        a = i;
    }

    public final void a(boolean flag)
    {
        d = flag;
    }

    public final boolean a()
    {
        return d;
    }

    public final void b(int i)
    {
        b = i;
    }

    public final boolean b()
    {
        return a > 0 || b > 0 || c > 0 || d;
    }

    public final void c(int i)
    {
        c = i;
    }

    public final boolean c()
    {
        return a > 0;
    }

    public final boolean d()
    {
        return b > 0;
    }

    public final boolean e()
    {
        return c > 0;
    }
}
