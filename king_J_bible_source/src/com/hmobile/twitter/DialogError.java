// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.twitter;


public class DialogError extends Throwable
{

    private static final long serialVersionUID = 0xf23934387688b13cL;
    private int mErrorCode;
    private String mFailingUrl;

    public DialogError(String s, int i, String s1)
    {
        super(s);
        mErrorCode = i;
        mFailingUrl = s1;
    }

    public int getErrorCode()
    {
        return mErrorCode;
    }

    public String getFailingUrl()
    {
        return mFailingUrl;
    }
}
