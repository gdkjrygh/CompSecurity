// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.network;

import android.os.Handler;
import com.mopub.volley.Request;

// Referenced classes of package com.mopub.network:
//            d, MoPubRequestQueue

final class c
{

    final int a;
    final Handler b;
    final Runnable c;
    final MoPubRequestQueue d;

    c(MoPubRequestQueue mopubrequestqueue, Request request, int i)
    {
        this(mopubrequestqueue, request, i, new Handler());
    }

    private c(MoPubRequestQueue mopubrequestqueue, Request request, int i, Handler handler)
    {
        d = mopubrequestqueue;
        super();
        a = i;
        b = handler;
        c = new d(this, mopubrequestqueue, request);
    }
}
