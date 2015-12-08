// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.nativeads;

import com.mopub.network.AdResponse;
import com.mopub.volley.VolleyError;

// Referenced classes of package com.mopub.nativeads:
//            MoPubNative

final class v
    implements com.mopub.network.AdRequest.Listener
{

    final MoPubNative a;

    v(MoPubNative mopubnative)
    {
        a = mopubnative;
        super();
    }

    public final void onErrorResponse(VolleyError volleyerror)
    {
        a.a(volleyerror);
    }

    public final void onSuccess(AdResponse adresponse)
    {
        MoPubNative.a(a, adresponse);
    }
}
