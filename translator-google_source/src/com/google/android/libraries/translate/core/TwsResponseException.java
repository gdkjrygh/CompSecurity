// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.core;


public class TwsResponseException extends Exception
{

    private final String mCauseCode;
    private final int mErrorCode;
    private final String mSrcLang;
    private final String mTrgLang;

    public TwsResponseException(String s, String s1, int i)
    {
        this(s, s1, i, "");
    }

    public TwsResponseException(String s, String s1, int i, String s2)
    {
        mSrcLang = s;
        mTrgLang = s1;
        mErrorCode = i;
        mCauseCode = s2;
    }

    public TwsResponseException(String s, String s1, int i, String s2, Exception exception)
    {
        super(exception);
        mSrcLang = s;
        mTrgLang = s1;
        mErrorCode = i;
        mCauseCode = s2;
    }

    public String getCauseCode()
    {
        return mCauseCode;
    }

    public int getErrorCode()
    {
        return mErrorCode;
    }

    public String getFromLanguage()
    {
        return mSrcLang;
    }

    public String getToLanguage()
    {
        return mTrgLang;
    }
}
