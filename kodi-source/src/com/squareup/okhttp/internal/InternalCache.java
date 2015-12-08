// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal;

import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.internal.http.CacheRequest;
import com.squareup.okhttp.internal.http.CacheStrategy;
import java.io.IOException;

public interface InternalCache
{

    public abstract Response get(Request request)
        throws IOException;

    public abstract CacheRequest put(Response response)
        throws IOException;

    public abstract void remove(Request request)
        throws IOException;

    public abstract void trackConditionalCacheHit();

    public abstract void trackResponse(CacheStrategy cachestrategy);

    public abstract void update(Response response, Response response1)
        throws IOException;
}
