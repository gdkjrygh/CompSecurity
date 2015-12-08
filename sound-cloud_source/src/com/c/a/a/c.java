// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a.a;


public abstract class c
    implements Runnable
{

    protected final String a;

    public transient c(String s, Object aobj[])
    {
        a = String.format(s, aobj);
    }

    public abstract void a();

    public final void run()
    {
        String s;
        s = Thread.currentThread().getName();
        Thread.currentThread().setName(a);
        a();
        Thread.currentThread().setName(s);
        return;
        Exception exception;
        exception;
        Thread.currentThread().setName(s);
        throw exception;
    }
}
