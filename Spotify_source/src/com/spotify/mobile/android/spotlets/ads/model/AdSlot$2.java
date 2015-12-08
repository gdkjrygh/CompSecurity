// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.ads.model;

import com.spotify.mobile.android.spotlets.ads.AdEventReporter;
import com.spotify.mobile.android.spotlets.ads.rules.AdRules;
import dmz;
import dzx;
import fni;
import fnm;

// Referenced classes of package com.spotify.mobile.android.spotlets.ads.model:
//            AdSlot

final class tateType
    implements dzx
{

    public final void a(fnm fnm1)
    {
        AdEventReporter adeventreporter = (AdEventReporter)dmz.a(com/spotify/mobile/android/spotlets/ads/AdEventReporter);
        if (((fni) (fnm1.m)).a)
        {
            adeventreporter.a(AdSlot.WATCHNOW);
            adeventreporter.e();
            ((AdRules)dmz.a(com/spotify/mobile/android/spotlets/ads/rules/AdRules)).a(com.spotify.mobile.android.spotlets.ads.rules.tateType.a, true);
        } else
        {
            ((AdRules)dmz.a(com/spotify/mobile/android/spotlets/ads/rules/AdRules)).a(com.spotify.mobile.android.spotlets.ads.rules.tateType.a, false);
        }
        ((AdRules)dmz.a(com/spotify/mobile/android/spotlets/ads/rules/AdRules)).a(com.spotify.mobile.android.spotlets.ads.rules.tateType.f, true);
    }

    tateType()
    {
    }
}
