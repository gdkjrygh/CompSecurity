// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.model;

import java.io.Serializable;

public class InstagramCodeError
    implements Serializable
{
    public static class Builder
    {

        private String mError;
        private String mErrorDescription;
        private String mErrorReason;
        private int mStatusCode;

        public Builder ErrorDescription(String s)
        {
            mErrorDescription = s;
            return this;
        }

        public Builder ErrorReason(String s)
        {
            mErrorReason = s;
            return this;
        }

        public Builder StatusCode(int i)
        {
            mStatusCode = i;
            return this;
        }

        public InstagramCodeError build()
        {
            return new InstagramCodeError(mError, mErrorReason, mErrorDescription, mStatusCode);
        }

        public Builder(String s)
        {
            mError = s;
        }
    }


    public String mError;
    public String mErrorDescription;
    public String mErrorReason;
    public int mStatusCode;

    private InstagramCodeError(String s, String s1, String s2, int i)
    {
        mError = s;
        mErrorReason = s1;
        mErrorDescription = s2;
        mStatusCode = i;
    }


    public String getError()
    {
        return mError;
    }

    public String getErrorDescription()
    {
        return mErrorDescription;
    }

    public String getErrorReason()
    {
        return mErrorReason;
    }

    public int getStatusCode()
    {
        return mStatusCode;
    }
}
