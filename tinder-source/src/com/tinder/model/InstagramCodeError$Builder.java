// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.model;


// Referenced classes of package com.tinder.model:
//            InstagramCodeError

public static class mError
{

    private String mError;
    private String mErrorDescription;
    private String mErrorReason;
    private int mStatusCode;

    public mError ErrorDescription(String s)
    {
        mErrorDescription = s;
        return this;
    }

    public mErrorDescription ErrorReason(String s)
    {
        mErrorReason = s;
        return this;
    }

    public mErrorReason StatusCode(int i)
    {
        mStatusCode = i;
        return this;
    }

    public InstagramCodeError build()
    {
        return new InstagramCodeError(mError, mErrorReason, mErrorDescription, mStatusCode, null);
    }

    public (String s)
    {
        mError = s;
    }
}
