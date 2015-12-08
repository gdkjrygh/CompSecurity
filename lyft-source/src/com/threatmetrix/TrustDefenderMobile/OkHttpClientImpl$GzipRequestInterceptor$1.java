// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.threatmetrix.TrustDefenderMobile;

import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.RequestBody;
import okio.BufferedSink;
import okio.GzipSink;
import okio.Okio;

class a extends RequestBody
{

    final RequestBody a;
    final a b;

    public long contentLength()
    {
        return -1L;
    }

    public MediaType contentType()
    {
        return a.contentType();
    }

    public void writeTo(BufferedSink bufferedsink)
    {
        bufferedsink = Okio.buffer(new GzipSink(bufferedsink));
        a.writeTo(bufferedsink);
        bufferedsink.close();
    }

    ( , RequestBody requestbody)
    {
        b = ;
        a = requestbody;
        super();
    }
}
