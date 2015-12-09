// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v4.app.Fragment;
import com.spotify.mobile.android.spotlets.ads.AdEventReporter;
import com.spotify.mobile.android.spotlets.ads.rules.AdRules;
import com.spotify.mobile.android.ui.NavigationItem;
import java.util.Map;

public final class edv
    implements fol
{

    private AdEventReporter a;
    private AdRules b;

    public edv()
    {
        b = (AdRules)dmz.a(com/spotify/mobile/android/spotlets/ads/rules/AdRules);
        a = (AdEventReporter)dmz.a(com/spotify/mobile/android/spotlets/ads/AdEventReporter);
    }

    public final void a(Fragment fragment)
    {
        if (fragment instanceof NavigationItem)
        {
            AdRules adrules = b;
            fragment = (NavigationItem)fragment;
            if (fragment != null)
            {
                fragment = fragment.A_();
                if (fragment.equals(com.spotify.mobile.android.ui.NavigationItem.NavigationGroup.c) || fragment.equals(com.spotify.mobile.android.ui.NavigationItem.NavigationGroup.n))
                {
                    adrules.a(new eeq(com.spotify.mobile.android.spotlets.ads.rules.AdRules.StateType.b, true));
                } else
                {
                    adrules.a(new eeq(com.spotify.mobile.android.spotlets.ads.rules.AdRules.StateType.b, false));
                }
            }
        }
        if (((eet)b.a.get(ees)).c())
        {
            a.c();
        }
    }
}
