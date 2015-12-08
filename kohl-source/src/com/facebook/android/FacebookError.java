// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.android;


public class FacebookError extends RuntimeException
{

    private static final long serialVersionUID = 1L;
    private int mErrorCode;
    private String mErrorType;

    public FacebookError(String s)
    {
        super(s);
        mErrorCode = 0;
    }

    public FacebookError(String s, String s1, int i)
    {
        super(s);
        mErrorCode = 0;
        mErrorType = s1;
        mErrorCode = i;
    }

    public int getErrorCode()
    {
        return mErrorCode;
    }

    public String getErrorType()
    {
        return mErrorType;
    }
}
