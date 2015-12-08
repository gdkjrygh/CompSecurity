// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.network;

import com.mopub.volley.Request;
import java.util.Map;

// Referenced classes of package com.mopub.network:
//            c, MoPubRequestQueue

final class d
    implements Runnable
{

    final MoPubRequestQueue a;
    final Request b;
    final c c;

    d(c c1, MoPubRequestQueue mopubrequestqueue, Request request)
    {
        c = c1;
        a = mopubrequestqueue;
        b = request;
        super();
    }

    public final void run()
    {
        MoPubRequestQueue.a(c.d).remove(b);
        c.d.add(b);
    }
}
