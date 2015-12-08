// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.gsa.shared.exception;


// Referenced classes of package com.google.android.apps.gsa.shared.exception:
//            a

public class GenericGsaError extends Exception
    implements a
{

    private final int mErrorCode;
    private final int mErrorType;

    public GenericGsaError(int i, int j)
    {
        mErrorType = i;
        mErrorCode = j;
    }

    public GenericGsaError(Throwable throwable, int i, int j)
    {
        super(throwable);
        mErrorType = i;
        mErrorCode = j;
    }

    public Exception asException()
    {
        return this;
    }

    public int getErrorCode()
    {
        return mErrorCode;
    }

    public int getErrorType()
    {
        return mErrorType;
    }

    public boolean isAuthError()
    {
        return false;
    }
}
