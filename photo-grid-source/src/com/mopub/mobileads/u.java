// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mobileads;

import android.content.SharedPreferences;
import com.mopub.volley.VolleyError;

// Referenced classes of package com.mopub.mobileads:
//            MoPubConversionTracker

final class u
    implements com.mopub.network.TrackingRequest.Listener
{

    final MoPubConversionTracker a;

    u(MoPubConversionTracker mopubconversiontracker)
    {
        a = mopubconversiontracker;
        super();
    }

    public final void onErrorResponse(VolleyError volleyerror)
    {
    }

    public final void onResponse(String s)
    {
        MoPubConversionTracker.b(a).edit().putBoolean(MoPubConversionTracker.a(a), true).commit();
    }
}
