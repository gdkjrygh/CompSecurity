// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mobileads;

import com.mopub.network.AdResponse;
import com.mopub.volley.VolleyError;

// Referenced classes of package com.mopub.mobileads:
//            MoPubRewardedVideoManager

public class a
    implements com.mopub.network.r
{

    private final MoPubRewardedVideoManager a;
    public final String adUnitId;

    public void onErrorResponse(VolleyError volleyerror)
    {
        MoPubRewardedVideoManager.a(a, volleyerror, adUnitId);
    }

    public void onSuccess(AdResponse adresponse)
    {
        MoPubRewardedVideoManager.a(a, adresponse, adUnitId);
    }

    public (MoPubRewardedVideoManager mopubrewardedvideomanager, String s)
    {
        adUnitId = s;
        a = mopubrewardedvideomanager;
    }
}
