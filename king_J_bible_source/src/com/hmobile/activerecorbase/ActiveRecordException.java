// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.activerecorbase;


public class ActiveRecordException extends Exception
{

    private static final long serialVersionUID = 0xede2e10425bcebdeL;

    public ActiveRecordException()
    {
    }

    public ActiveRecordException(String s)
    {
        super(s);
    }

    public ActiveRecordException(String s, Throwable throwable)
    {
        super(s, throwable);
    }

    public ActiveRecordException(Throwable throwable)
    {
        super(throwable);
    }
}
