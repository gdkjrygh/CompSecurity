// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.share.model;

import com.spotify.mobile.android.cosmos.JacksonModel;

public class Status
    implements JacksonModel
{

    private boolean mIsRetryable;
    private boolean mIsSuccess;
    private String mMessage;

    public Status(boolean flag, boolean flag1, String s)
    {
        mIsSuccess = flag;
        mIsRetryable = flag1;
        mMessage = s;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof Status))
            {
                return false;
            }
            obj = (Status)obj;
            if (mIsRetryable != ((Status) (obj)).mIsRetryable)
            {
                return false;
            }
            if (mIsSuccess != ((Status) (obj)).mIsSuccess)
            {
                return false;
            }
            if (mMessage == null ? ((Status) (obj)).mMessage != null : !mMessage.equals(((Status) (obj)).mMessage))
            {
                return false;
            }
        }
        return true;
    }

    public String getMessage()
    {
        return mMessage;
    }

    public int hashCode()
    {
        int j = 1;
        int k = 0;
        int i;
        if (mIsSuccess)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (!mIsRetryable)
        {
            j = 0;
        }
        if (mMessage != null)
        {
            k = mMessage.hashCode();
        }
        return (i * 31 + j) * 31 + k;
    }

    public boolean isRetryable()
    {
        return mIsRetryable;
    }

    public boolean isSuccess()
    {
        return mIsSuccess;
    }
}
