// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.flickrjandroid;


public class FlickrException extends Exception
{

    private static final long serialVersionUID = 0x6e70d1f953f1d09fL;
    private String errorCode;
    private String errorMessage;

    public FlickrException(String s)
    {
        super(s);
    }

    public FlickrException(String s, String s1)
    {
        super((new StringBuilder(String.valueOf(s))).append(": ").append(s1).toString());
        errorCode = s;
        errorMessage = s1;
    }

    public FlickrException(String s, Throwable throwable)
    {
        super(s, throwable);
    }

    public FlickrException(Throwable throwable)
    {
        super(throwable);
    }

    public String getErrorCode()
    {
        return errorCode;
    }

    public String getErrorMessage()
    {
        return errorMessage;
    }
}
