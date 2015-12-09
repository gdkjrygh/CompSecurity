// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.androidauto;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.service.media.MediaBrowserService;
import com.google.common.collect.Lists;
import com.spotify.mobile.android.service.media.MediaService;
import com.spotify.mobile.android.service.media.browser.MediaBrowserItem;
import com.spotify.mobile.android.spotlets.ads.AdEventReporter;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.logging.Logger;
import ctv;
import dmz;
import dwx;
import dxc;
import dxd;
import eaj;
import eao;
import ebb;
import ebe;
import ebf;
import ebg;
import ebi;
import ecf;
import ecl;
import eeo;
import efv;
import efw;
import efx;
import gei;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SpotifyMediaBrowserService extends MediaBrowserService
{

    private static final List a = Collections.emptyList();
    private static final String f[] = {
        "car", "AndroidAuto"
    };
    private MediaService b;
    private ecf c;
    private MediaSession d;
    private efw e;
    private efx g;
    private dxc h;
    private final dwx i = new dwx() {

        private SpotifyMediaBrowserService a;

        public final void a(Flags flags)
        {
            flags = new ebe(a, "spotify_media_browser_root");
            SpotifyMediaBrowserService.a(a).a.a(new ebi[] {
                flags
            });
            a.notifyChildrenChanged("spotify_media_browser_root");
            SpotifyMediaBrowserService.a(a).a(SpotifyMediaBrowserService.a());
            SpotifyMediaBrowserService.b(a);
            SpotifyMediaBrowserService.c(a).b(this);
            SpotifyMediaBrowserService.d(a).a(true);
        }

            
            {
                a = SpotifyMediaBrowserService.this;
                super();
            }
    };
    private efv j;
    private AdEventReporter k;
    private final ServiceConnection l = new ServiceConnection() {

        private SpotifyMediaBrowserService a;

        public final void onServiceConnected(ComponentName componentname, IBinder ibinder)
        {
            SpotifyMediaBrowserService.a(a, ((eao)ibinder).a);
            SpotifyMediaBrowserService.a(a, new MediaSession(a, a.getString(0x7f08061c)));
            SpotifyMediaBrowserService.a(a, new efw(SpotifyMediaBrowserService.e(a), SpotifyMediaBrowserService.a(a)));
            SpotifyMediaBrowserService.a(a, new efv(SpotifyMediaBrowserService.a(a), SpotifyMediaBrowserService.f(a)));
            SpotifyMediaBrowserService.d(a).a(false);
            SpotifyMediaBrowserService.e(a).setFlags(3);
            SpotifyMediaBrowserService.e(a).setCallback(SpotifyMediaBrowserService.d(a));
            ecl.a(SpotifyMediaBrowserService.e(a));
            SpotifyMediaBrowserService.g(a);
            SpotifyMediaBrowserService.c(a).a(SpotifyMediaBrowserService.h(a));
        }

        public final void onServiceDisconnected(ComponentName componentname)
        {
            SpotifyMediaBrowserService.i(a);
        }

            
            {
                a = SpotifyMediaBrowserService.this;
                super();
            }
    };

    public SpotifyMediaBrowserService()
    {
    }

    static MediaSession a(SpotifyMediaBrowserService spotifymediabrowserservice, MediaSession mediasession)
    {
        spotifymediabrowserservice.d = mediasession;
        return mediasession;
    }

    static MediaService a(SpotifyMediaBrowserService spotifymediabrowserservice)
    {
        return spotifymediabrowserservice.b;
    }

    static MediaService a(SpotifyMediaBrowserService spotifymediabrowserservice, MediaService mediaservice)
    {
        spotifymediabrowserservice.b = mediaservice;
        return mediaservice;
    }

    static efv a(SpotifyMediaBrowserService spotifymediabrowserservice, efv efv)
    {
        spotifymediabrowserservice.j = efv;
        return efv;
    }

    static efw a(SpotifyMediaBrowserService spotifymediabrowserservice, efw efw1)
    {
        spotifymediabrowserservice.e = efw1;
        return efw1;
    }

    static List a(SpotifyMediaBrowserService spotifymediabrowserservice, List list)
    {
        return Lists.a(list, spotifymediabrowserservice. new ctv() {

            private SpotifyMediaBrowserService a;

            public final Object a(Object obj)
            {
                obj = (MediaBrowserItem)obj;
                android.media.MediaDescription mediadescription = (new android.media.MediaDescription.Builder()).setMediaId(((MediaBrowserItem) (obj)).a).setTitle(gei.a(((MediaBrowserItem) (obj)).c, SpotifyMediaBrowserService.a(a).getResources().getConfiguration().locale)).setSubtitle(((MediaBrowserItem) (obj)).d).setIconUri(((MediaBrowserItem) (obj)).e).build();
                int i1;
                if (com.spotify.mobile.android.service.media.browser.MediaBrowserItem.ActionType.b.equals(((MediaBrowserItem) (obj)).b))
                {
                    i1 = 1;
                } else
                {
                    i1 = 2;
                }
                return new android.media.browse.MediaBrowser.MediaItem(mediadescription, i1);
            }

            
            {
                a = SpotifyMediaBrowserService.this;
                super();
            }
        });
    }

    static String[] a()
    {
        return f;
    }

    static List b()
    {
        return a;
    }

    static void b(SpotifyMediaBrowserService spotifymediabrowserservice)
    {
        spotifymediabrowserservice.d();
    }

    static dxc c(SpotifyMediaBrowserService spotifymediabrowserservice)
    {
        return spotifymediabrowserservice.h;
    }

    private void c()
    {
        h.b();
        if (d != null)
        {
            d.release();
        }
        if (e != null)
        {
            e.a.b();
        }
        if (b != null)
        {
            b.i = null;
        }
        if (k != null)
        {
            k.e();
            k = null;
        }
    }

    static efv d(SpotifyMediaBrowserService spotifymediabrowserservice)
    {
        return spotifymediabrowserservice.j;
    }

    private void d()
    {
        if (g.a())
        {
            e.a.a();
            b.i = e;
        }
    }

    static MediaSession e(SpotifyMediaBrowserService spotifymediabrowserservice)
    {
        return spotifymediabrowserservice.d;
    }

    static efx f(SpotifyMediaBrowserService spotifymediabrowserservice)
    {
        return spotifymediabrowserservice.g;
    }

    static void g(SpotifyMediaBrowserService spotifymediabrowserservice)
    {
        spotifymediabrowserservice.setSessionToken(spotifymediabrowserservice.d.getSessionToken());
        spotifymediabrowserservice.d.setActive(true);
    }

    static dwx h(SpotifyMediaBrowserService spotifymediabrowserservice)
    {
        return spotifymediabrowserservice.i;
    }

    static void i(SpotifyMediaBrowserService spotifymediabrowserservice)
    {
        spotifymediabrowserservice.c();
    }

    public void onCreate()
    {
        super.onCreate();
        g = new efx(new ebb(this));
        c = new ecf(this);
        MediaService.a(this, l);
        dmz.a(dxd);
        h = dxd.a(this);
        h.a();
        k = (AdEventReporter)dmz.a(com/spotify/mobile/android/spotlets/ads/AdEventReporter);
    }

    public void onDestroy()
    {
        super.onDestroy();
        c();
        unbindService(l);
        efx efx1 = g;
        for (Iterator iterator = efx1.b.iterator(); iterator.hasNext();)
        {
            String s = (String)iterator.next();
            if ("com.google.android.projection.gearhead".equals(s))
            {
                efx1.a.b(5L, "AndroidAuto", s);
            } else
            if ("com.google.android.wearable.app".equals(s))
            {
                efx1.a.b(10L, "AndroidWear", s);
            } else
            {
                efx1.a.b(999L, "AndroidOther", s);
            }
        }

        efx1.b.clear();
        if (b != null)
        {
            b.b(f);
        }
    }

    public android.service.media.MediaBrowserService.BrowserRoot onGetRoot(String s, int i1, Bundle bundle)
    {
        long l1;
        if (!c.a(this, s, i1))
        {
            Logger.b("onGetRoot: IGNORING request from untrusted package %s", new Object[] {
                s
            });
            bundle = g;
            ((efx) (bundle)).a.a(1000L, "AndroidUnauth", s);
            ((efx) (bundle)).a.b(1000L, "AndroidUnauth", s);
            return null;
        }
        bundle = g;
        if (!((efx) (bundle)).b.contains(s))
        {
            ((efx) (bundle)).b.add(s);
            if ("com.google.android.projection.gearhead".equals(s))
            {
                ((efx) (bundle)).a.a(5L, "AndroidAuto", s);
            } else
            if ("com.google.android.wearable.app".equals(s))
            {
                ((efx) (bundle)).a.a(10L, "AndroidWear", s);
            } else
            if ("com.carconnectivity.mlmediaplayer".equals(s))
            {
                ((efx) (bundle)).a.a(6L, "MLAudioBridge", s);
            } else
            {
                ((efx) (bundle)).a.a(999L, "AndroidOther", s);
            }
        }
        bundle = "none";
        l1 = 999L;
        if (!"com.google.android.projection.gearhead".equals(s)) goto _L2; else goto _L1
_L1:
        bundle = "auto";
        l1 = 5L;
_L4:
        s = new eeo();
        s.c = bundle;
        s.e = l1;
        s.d = "AndroidAuto";
        k.a(s.a());
        if (b != null)
        {
            d();
        }
        return new android.service.media.MediaBrowserService.BrowserRoot("spotify_media_browser_root", null);
_L2:
        if ("com.google.android.wearable.app".equals(s))
        {
            bundle = "wearable";
            l1 = 10L;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void onLoadChildren(String s, android.service.media.MediaBrowserService.Result result)
    {
        if (b == null || b.a == null)
        {
            result.sendResult(a);
            return;
        } else
        {
            result.detach();
            b.a.a(s, new ebg(result) {

                private android.service.media.MediaBrowserService.Result a;
                private SpotifyMediaBrowserService b;

                public final void a(Throwable throwable)
                {
                    a.sendResult(SpotifyMediaBrowserService.b());
                }

                public final void a(List list)
                {
                    if (list.size() > 0)
                    {
                        a.sendResult(SpotifyMediaBrowserService.a(b, list));
                        return;
                    } else
                    {
                        a.sendResult(SpotifyMediaBrowserService.b());
                        return;
                    }
                }

            
            {
                b = SpotifyMediaBrowserService.this;
                a = result;
                super();
            }
            });
            return;
        }
    }

}
