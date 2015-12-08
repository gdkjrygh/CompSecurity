// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.network;

import com.mopub.volley.Request;

// Referenced classes of package com.mopub.network:
//            MoPubRequestQueue

final class b
    implements com.mopub.volley.RequestQueue.RequestFilter
{

    final Request a;
    final MoPubRequestQueue b;

    b(MoPubRequestQueue mopubrequestqueue, Request request)
    {
        b = mopubrequestqueue;
        a = request;
        super();
    }

    public final boolean apply(Request request)
    {
        return a == request;
    }
}
