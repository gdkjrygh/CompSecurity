// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.volley;

import java.util.Collections;
import java.util.Map;

public class p
{

    public byte data[];
    public String etag;
    public Map responseHeaders;
    public long serverDate;
    public long softTtl;
    public long ttl;

    public boolean isExpired()
    {
        return ttl < System.currentTimeMillis();
    }

    public boolean refreshNeeded()
    {
        return softTtl < System.currentTimeMillis();
    }

    public ()
    {
        responseHeaders = Collections.emptyMap();
    }
}
