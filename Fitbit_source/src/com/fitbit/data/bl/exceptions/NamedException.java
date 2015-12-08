// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl.exceptions;


public class NamedException extends Exception
{

    private static final long serialVersionUID = 1L;

    public NamedException()
    {
    }

    public NamedException(String s)
    {
        super(s);
    }

    public NamedException(String s, Throwable throwable)
    {
        super(s, throwable);
    }

    public NamedException(Throwable throwable)
    {
        super(throwable);
    }

    public String b()
    {
        return getClass().getName();
    }
}
