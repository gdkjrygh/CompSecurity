// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.network;

import com.mopub.common.logging.MoPubLog;
import com.mopub.volley.VolleyError;

final class i
    implements TrackingRequest.Listener
{

    final TrackingRequest.Listener a;
    final String b;

    i(TrackingRequest.Listener listener, String s)
    {
        a = listener;
        b = s;
        super();
    }

    public final void onErrorResponse(VolleyError volleyerror)
    {
        MoPubLog.d((new StringBuilder("Failed to hit tracking endpoint: ")).append(b).toString());
        if (a != null)
        {
            a.onErrorResponse(volleyerror);
        }
    }

    public final void onResponse(String s)
    {
        MoPubLog.d((new StringBuilder("Successfully hit tracking endpoint: ")).append(s).toString());
        if (a != null)
        {
            a.onResponse(s);
        }
    }
}
