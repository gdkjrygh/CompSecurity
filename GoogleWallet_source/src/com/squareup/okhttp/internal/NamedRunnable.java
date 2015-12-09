// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal;


public abstract class NamedRunnable
    implements Runnable
{

    protected final String name;

    public transient NamedRunnable(String s, Object aobj[])
    {
        name = String.format(s, aobj);
    }

    protected abstract void execute();

    public final void run()
    {
        String s;
        s = Thread.currentThread().getName();
        Thread.currentThread().setName(name);
        execute();
        Thread.currentThread().setName(s);
        return;
        Exception exception;
        exception;
        Thread.currentThread().setName(s);
        throw exception;
    }
}
