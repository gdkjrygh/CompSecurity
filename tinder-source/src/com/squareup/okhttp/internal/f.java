// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal;


public abstract class f
    implements Runnable
{

    protected final String b;

    public transient f(String s, Object aobj[])
    {
        b = String.format(s, aobj);
    }

    public abstract void b();

    public final void run()
    {
        String s;
        s = Thread.currentThread().getName();
        Thread.currentThread().setName(b);
        b();
        Thread.currentThread().setName(s);
        return;
        Exception exception;
        exception;
        Thread.currentThread().setName(s);
        throw exception;
    }
}
