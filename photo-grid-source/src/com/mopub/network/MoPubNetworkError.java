// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.network;

import com.mopub.volley.NetworkResponse;
import com.mopub.volley.VolleyError;

public class MoPubNetworkError extends VolleyError
{

    private final Reason a;
    private final Integer b;

    public MoPubNetworkError(Reason reason)
    {
        a = reason;
        b = null;
    }

    public MoPubNetworkError(NetworkResponse networkresponse, Reason reason)
    {
        super(networkresponse);
        a = reason;
        b = null;
    }

    public MoPubNetworkError(String s, Reason reason)
    {
        this(s, reason, ((Integer) (null)));
    }

    public MoPubNetworkError(String s, Reason reason, Integer integer)
    {
        super(s);
        a = reason;
        b = integer;
    }

    public MoPubNetworkError(String s, Throwable throwable, Reason reason)
    {
        super(s, throwable);
        a = reason;
        b = null;
    }

    public MoPubNetworkError(Throwable throwable, Reason reason)
    {
        super(throwable);
        a = reason;
        b = null;
    }

    public Reason getReason()
    {
        return a;
    }

    public Integer getRefreshTimeMillis()
    {
        return b;
    }
}
