// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.webclient.volley;

import com.android.volley.DefaultRetryPolicy;
import com.android.volley.RequestQueue;
import com.android.volley.RetryPolicy;
import com.netflix.mediaclient.service.webclient.UserCredentialRegistry;
import com.netflix.mediaclient.service.webclient.WebClient;
import com.netflix.mediaclient.servicemgr.ErrorLogging;

public abstract class VolleyWebClient
    implements WebClient
{

    protected static RequestQueue sRequestQueue;
    protected ErrorLogging mErrorLogger;
    protected int mTimeoutInMs;
    protected UserCredentialRegistry mUserCredentialRegistry;

    public VolleyWebClient()
    {
    }

    protected RetryPolicy createRetryPolicy()
    {
        int i;
        if (mTimeoutInMs <= 0)
        {
            i = 2500;
        } else
        {
            i = mTimeoutInMs;
        }
        return new DefaultRetryPolicy(i, 1, 1.0F);
    }

    public final boolean isSynchronous()
    {
        return false;
    }

    public void setTimeout(int i)
    {
        mTimeoutInMs = i;
    }
}
