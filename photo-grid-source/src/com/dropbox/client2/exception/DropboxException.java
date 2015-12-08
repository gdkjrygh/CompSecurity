// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dropbox.client2.exception;


public class DropboxException extends Exception
{

    private static final long serialVersionUID = 1L;

    protected DropboxException()
    {
    }

    public DropboxException(String s)
    {
        super(s);
    }

    public DropboxException(String s, Throwable throwable)
    {
        super(s, throwable);
    }

    public DropboxException(Throwable throwable)
    {
        super(throwable);
    }
}
