// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.gsa.shared.speech.exception;

import com.google.android.apps.gsa.shared.exception.a;

public class RecognizeException extends Exception
    implements a
{

    private final int mEngine;
    private final int mErrorCode;

    protected RecognizeException(int i, int j)
    {
        this((new StringBuilder(46)).append("GsaErrorCode: ").append(j).append(", engine: ").append(i).toString(), i, j);
    }

    protected RecognizeException(String s, int i, int j)
    {
        super(s);
        mEngine = i;
        mErrorCode = j;
    }

    protected RecognizeException(String s, Throwable throwable, int i, int j)
    {
        super(s, throwable);
        mEngine = i;
        mErrorCode = j;
    }

    protected RecognizeException(Throwable throwable, int i, int j)
    {
        this((new StringBuilder(46)).append("GsaErrorCode: ").append(j).append(", engine: ").append(i).toString(), throwable, i, j);
    }

    public Exception asException()
    {
        return this;
    }

    public int getEngine()
    {
        return mEngine;
    }

    public int getErrorCode()
    {
        return mErrorCode;
    }

    public int getErrorType()
    {
        return 211;
    }

    public boolean isAuthError()
    {
        return false;
    }
}
