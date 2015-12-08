// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.ads.model;

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
        com.spotify.mobile.android.spotlets.ads.rules.tateType tatetype = com.spotify.mobile.android.spotlets.ads.rules.tateType.a;
        boolean flag = ((fni) (fnm1.m)).a;
        ((AdRules)dmz.a(com/spotify/mobile/android/spotlets/ads/rules/AdRules)).a(tatetype, flag);
    }

    tateType()
    {
    }
}
