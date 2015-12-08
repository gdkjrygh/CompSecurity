// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.network;

import com.mopub.volley.VolleyError;

public abstract class BackoffPolicy
{

    protected int a;
    protected int b;
    protected int c;
    protected int d;
    protected int e;

    public BackoffPolicy()
    {
    }

    public abstract void backoff(VolleyError volleyerror);

    public int getBackoffMs()
    {
        return a;
    }

    public int getRetryCount()
    {
        return d;
    }

    public boolean hasAttemptRemaining()
    {
        return d < e;
    }
}
