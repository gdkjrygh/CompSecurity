// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.github.nkzawa.engineio.client;


public class EngineIOException extends Exception
{

    public String a;
    public Object b;

    public EngineIOException()
    {
    }

    public EngineIOException(String s)
    {
        super(s);
    }

    public EngineIOException(String s, Throwable throwable)
    {
        super(s, throwable);
    }

    public EngineIOException(Throwable throwable)
    {
        super(throwable);
    }
}
