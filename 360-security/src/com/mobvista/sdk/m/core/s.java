// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobvista.sdk.m.core;

import android.util.Log;
import com.mobvista.sdk.m.core.entity.Campaign;
import java.util.HashMap;

// Referenced classes of package com.mobvista.sdk.m.core:
//            AdListener, MobvistaAd, MobvistaAdNative

final class s
    implements AdListener
{

    final String a;
    final MobvistaAdNative b;

    s(String s1, MobvistaAdNative mobvistaadnative)
    {
        a = s1;
        b = mobvistaadnative;
        super();
    }

    public final void onAdClick(Campaign campaign)
    {
        Log.d("MobvistaAd", (new StringBuilder("native preload onAdClick: ")).append(campaign.getType()).append("   ").append(campaign.getAppName()).toString());
    }

    public final void onAdLoadError(String s1)
    {
        Log.d("MobvistaAd", (new StringBuilder("native preload onAdLoadError: ")).append(s1).toString());
    }

    public final void onAdLoaded(Campaign campaign)
    {
        Log.d("MobvistaAd", (new StringBuilder("native preload onAdLoaded: ")).append(campaign.getAppName()).toString());
        synchronized (MobvistaAd.mCachedMobvistaAdNative)
        {
            MobvistaAd.mCachedMobvistaAdNative.put(a, b);
        }
    }
}
