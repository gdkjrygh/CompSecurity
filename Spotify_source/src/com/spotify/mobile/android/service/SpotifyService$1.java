// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.service;

import android.os.AsyncTask;
import com.nielsen.app.sdk.AppSdk;
import com.spotify.mobile.android.connect.ConnectManager;
import com.spotify.mobile.android.connect.DiscoveryClient;
import com.spotify.mobile.android.spotlets.ads.model.Sponsorships;
import com.spotify.mobile.android.spotlets.ads.rules.AdRules;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.ui.page.DebugFlag;
import dmz;
import duw;
import dvp;
import dwg;
import dwx;
import eej;
import eez;
import efg;
import efh;
import fdo;
import fiy;
import fmu;
import fys;
import gcf;
import ggi;
import gin;
import gio;
import giq;
import java.lang.ref.WeakReference;

// Referenced classes of package com.spotify.mobile.android.service:
//            SpotifyService

public final class a
    implements dwx
{

    private SpotifyService a;

    public final void a(Flags flags)
    {
        a.e = flags;
        (new duw(a.getApplication())).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        boolean flag2 = fiy.b(flags);
        boolean flag3 = fiy.c(flags);
        boolean flag4 = ((Boolean)flags.a(fys.aC)).booleanValue();
        boolean flag5 = ((String)flags.a(fys.f)).equals("Enabled");
        boolean flag6 = fdo.a(flags);
        boolean flag7 = ((Boolean)flags.a(fys.d)).booleanValue();
        Object obj = DebugFlag.o;
        obj = (eez)dmz.a(eez);
        Flags flags1;
        boolean flag1;
        if (((Boolean)flags.a(fys.aa)).booleanValue() && !ggi.c(((eez) (obj)).a) && "enabled".equals(flags.a(fys.g)))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        obj.b = flag1;
        obj = (AdRules)dmz.a(com/spotify/mobile/android/spotlets/ads/rules/AdRules);
        flags1 = a.e;
        if (flags1 != null)
        {
            ((AdRules) (obj)).a(com.spotify.mobile.android.spotlets.ads.rules..c, ((Boolean)flags1.a(fys.b)).booleanValue());
        }
        SpotifyService.a(a);
        ((giq)dmz.a(giq)).b(a).b().a(SpotifyService.a, flag7).b();
        if (!flag2)
        {
            SpotifyService.e(a).b("audio/episode");
        } else
        {
            SpotifyService.e(a).a("audio/episode");
        }
        if (!flag3)
        {
            SpotifyService.e(a).b("video/episode");
        } else
        {
            SpotifyService.e(a).a("video/episode");
        }
        obj = (efg)dmz.a(efg);
        obj.d = flag5;
        if (((efg) (obj)).d)
        {
            efh efh1 = ((efg) (obj)).c;
            Sponsorships sponsorships = ((efg) (obj)).b;
            boolean flag;
            if (sponsorships == null)
            {
                flag = true;
            } else
            {
                long l = gcf.b() / 1000L;
                if (sponsorships.getTTLSeconds() + efh1.b < l)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
            }
            if (flag)
            {
                ((efg) (obj)).a();
            }
        } else
        {
            obj.b = null;
            ((efg) (obj)).b();
        }
        if (flag5)
        {
            obj = SpotifyService.d(a);
            obj.a = true;
            ((eej) (obj)).a();
        } else
        {
            obj = SpotifyService.d(a);
            obj.a = false;
            ((eej) (obj)).a();
        }
        obj = SpotifyService.b(a);
        if (((DiscoveryClient) (obj)).c != flag4)
        {
            obj.c = flag4;
            if (((DiscoveryClient) (obj)).d.a == com.spotify.mobile.android.connect.iscoveryConfiguration.FeatureFlagOverrideValue.a)
            {
                ((DiscoveryClient) (obj)).g();
            }
        }
        obj = SpotifyService.c(a);
        obj.e = flag6;
        ((dvp) (obj)).a(((dvp) (obj)).d);
        obj = (dwg)dmz.a(dwg);
        if (dwg.a(flags))
        {
            obj.b = AppSdk.getInstance(((dwg) (obj)).a, ((dwg) (obj)).a(), ((com.nielsen.app.sdk.IAppNotifier) (obj)));
        } else
        {
            obj.b = null;
        }
        ((fmu)dmz.a(fmu)).a.get();
    }

    rships(SpotifyService spotifyservice)
    {
        a = spotifyservice;
        super();
    }
}
