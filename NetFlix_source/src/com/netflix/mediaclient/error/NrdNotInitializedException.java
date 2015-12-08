// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.error;


public class NrdNotInitializedException extends Exception
{

    private static final long serialVersionUID = 0x2fa766c74124e4bL;

    public NrdNotInitializedException()
    {
    }

    public NrdNotInitializedException(String s)
    {
        super(s);
    }

    public NrdNotInitializedException(String s, Throwable throwable)
    {
        super(s, throwable);
    }

    public NrdNotInitializedException(Throwable throwable)
    {
        super(throwable);
    }
}
