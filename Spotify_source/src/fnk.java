// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.net.wifi.WifiManager;
import android.os.Handler;
import android.os.PowerManager;
import com.spotify.mobile.android.core.internal.SoundDriver;
import com.spotify.mobile.android.service.SpotifyService;
import com.spotify.mobile.android.spotlets.ads.AdEventReporter;
import com.spotify.mobile.android.spotlets.ads.BannerAdActivity;
import com.spotify.mobile.android.spotlets.ads.model.AdSlot;
import com.spotify.mobile.android.spotlets.ads.rules.AdRules;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.logging.Logger;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import java.util.Timer;

public class fnk
    implements dwx
{

    private static final String b = fnk.getSimpleName();
    public dvb a;
    private final AdEventReporter c = (AdEventReporter)dmz.a(com/spotify/mobile/android/spotlets/ads/AdEventReporter);
    private SpotifyService d;
    private BroadcastReceiver e;
    private BroadcastReceiver f;
    private eac g;
    private fnm h;
    private AudioManager i;
    private android.net.wifi.WifiManager.WifiLock j;
    private android.os.PowerManager.WakeLock k;
    private dvq l;
    private dvp m;
    private dll n;
    private final eag o;
    private final fnl p;
    private fop q;
    private boolean r;
    private eco s;
    private Handler t;
    private boolean u;
    private boolean v;

    public fnk(SpotifyService spotifyservice, eac eac, fnm fnm1, fnj fnj1, dvq dvq, dvp dvp, dll dll, 
            eag eag)
    {
        q = (fop)dmz.a(fop);
        d = spotifyservice;
        t = d.d;
        s = new eco(d);
        g = eac;
        h = fnm1;
        l = dvq;
        m = dvp;
        n = dll;
        o = eag;
        i = (AudioManager)d.getSystemService("audio");
        a = fnj1.b;
        e = new BroadcastReceiver() {

            private fnk a;

            public final void onReceive(Context context, Intent intent)
            {
                Logger.b("Audio has become noisy - headset probably removed", new Object[0]);
                fnk.a(a).a(true);
            }

            
            {
                a = fnk.this;
                super();
            }
        };
        f = new BroadcastReceiver() {

            private fnk a;

            public final void onReceive(Context context, Intent intent)
            {
                context = flb.a(fnk.b(a), "com.spotify.music.service.video.action.player.PAUSE");
                fnk.b(a).startService(context);
            }

            
            {
                a = fnk.this;
                super();
            }
        };
        spotifyservice = new fnl() {

            private fnk a;

            public final void a()
            {
                if (((fni) (fnk.c(a).o)).a && ((fni) (fnk.c(a).e)).a)
                {
                    fnk.d(a).c();
                }
            }

            public final void b()
            {
                fnk.a(a, false);
            }

            
            {
                a = fnk.this;
                super();
            }
        };
        eac = new fnl() {

            private final ClientEvent a;
            private final ClientEvent b;
            private fnk c;

            public final void a()
            {
                fnk.e(c).a();
                fnk.b(c).registerReceiver(fnk.f(c), new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
                fnk.g(c);
                fop.a(fnk.b(c).getApplicationContext(), ViewUri.b, a);
            }

            public final void b()
            {
                try
                {
                    fnk.b(c).unregisterReceiver(fnk.f(c));
                }
                catch (IllegalArgumentException illegalargumentexception)
                {
                    Assertion.a("Should have been registered", illegalargumentexception);
                }
                fnk.g(c);
                fop.a(fnk.b(c).getApplicationContext(), ViewUri.b, b);
            }

            
            {
                c = fnk.this;
                super();
                a = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.at, com.spotify.mobile.android.util.ClientEvent.SubEvent.di);
                b = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.at, com.spotify.mobile.android.util.ClientEvent.SubEvent.dj);
            }
        };
        fnj1 = new fnl(fnm1) {

            private fnm a;
            private fnk b;

            public final void a()
            {
                if (((fni) (a.e)).a)
                {
                    fnk.h(b);
                }
            }

            public final void b()
            {
            }

            
            {
                b = fnk.this;
                a = fnm1;
                super();
            }
        };
        p = new fnl(fnm1) {

            private final ClientEvent a;
            private final ClientEvent b;
            private fnm c;
            private fnk d;

            public final void a()
            {
                boolean flag = true;
                fnk.e(d).c();
                fnk.g(d);
                fop.a(fnk.b(d).getApplicationContext(), ViewUri.b, b);
                fnk.i(d).a(true);
                Object obj = d;
                boolean flag1;
                if (fnk.j(d).isWiredHeadsetOn() || fnk.j(d).isBluetoothA2dpOn())
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                fnk.a(((fnk) (obj)), flag1);
                fnk.k(d);
                if (fnk.k(d) && ((fni) (c.o)).a && c.c.d())
                {
                    fnk.d(d).c();
                }
                if (((fni) (c.p)).a && fnk.l(d) != null)
                {
                    obj = fnk.l(d);
                    Intent intent = flb.a(((eag) (obj)).c, "com.spotify.music.service.video.action.player.DISPLAY_VIDEO");
                    ((eag) (obj)).c.startService(intent);
                }
                if (((fni) (c.q)).a && c.p.d())
                {
                    fnk.h(d);
                }
                obj = (eez)dmz.a(eez);
                flag1 = ((eez) (obj)).b;
                flag1 = ((eez) (obj)).c;
                ((eez) (obj)).d();
                ((eez) (obj)).b();
                ((eez) (obj)).c();
                ((eez) (obj)).a();
                if (!((eez) (obj)).b() || !((eez) (obj)).c || !((eez) (obj)).d() || !((eez) (obj)).c())
                {
                    flag = false;
                }
                if (flag)
                {
                    ((AdEventReporter)dmz.a(com/spotify/mobile/android/spotlets/ads/AdEventReporter)).e(AdSlot.MOBILE_SCREENSAVER);
                    if (!eez.a(((eez) (obj)).f))
                    {
                        ((eez) (obj)).g.a(((eez) (obj)).f);
                    }
                    obj.f = null;
                }
            }

            public final void b()
            {
                fnk.a(d, false);
                fnk.g(d);
                fop.a(fnk.b(d).getApplicationContext(), ViewUri.b, a);
                fnk.i(d).a(false);
                fnk.b(d).getApplicationContext().startService(dvv.a(fnk.b(d), "com.spotify.mobile.android.service.action.FLUSH_CACHES"));
                eez eez1 = (eez)dmz.a(eez);
                if (eez1.b && !eez1.b())
                {
                    eez1.a();
                    long l1 = eez1.d;
                    eez1.e = new Timer();
                    eez1.e.schedule(new eez._cls1(eez1), eez1.d);
                }
            }

            
            {
                d = fnk.this;
                c = fnm1;
                super();
                a = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.O, com.spotify.mobile.android.util.ClientEvent.SubEvent.aC);
                b = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.O, com.spotify.mobile.android.util.ClientEvent.SubEvent.aB);
            }
        };
        fnm1 = new fnl() {

            private fnk a;

            public final void a()
            {
                WifiManager wifimanager = (WifiManager)fnk.b(a).getSystemService("wifi");
                fnk.a(a, wifimanager.createWifiLock("Spotify Wifi Lock"));
                fnk.m(a).acquire();
            }

            public final void b()
            {
                fnk.m(a).release();
                fnk.a(a, null);
            }

            
            {
                a = fnk.this;
                super();
            }
        };
        dvq = new fnl() {

            private boolean a;
            private boolean b;
            private fnk c;

            public final void a()
            {
                if (a || b)
                {
                    if (a && ((fni) (fnk.c(c).b)).a && fnk.c(c).o.d())
                    {
                        fnk.a(c).a(false);
                        return;
                    }
                    if (b)
                    {
                        fnk.l(c).a(false);
                        return;
                    }
                }
            }

            public final void b()
            {
label0:
                {
                    if (fnk.c(c).o.d())
                    {
                        if (((fni) (fnk.c(c).c)).a)
                        {
                            fnk.a(c).a(true);
                            a = true;
                        } else
                        {
                            a = false;
                        }
                        if (!((fni) (fnk.c(c).p)).a)
                        {
                            break label0;
                        }
                        fnk.l(c).a(true);
                        b = true;
                    }
                    return;
                }
                b = false;
            }

            
            {
                c = fnk.this;
                super();
            }
        };
        dvp = new fnl() {

            private fnk a;

            public final void a()
            {
                Logger.c("The application has been idle too long, stopping service", new Object[0]);
                fnk.b(a).d();
            }

            public final void b()
            {
                fnk.b(a).c();
            }

            
            {
                a = fnk.this;
                super();
            }
        };
        dll = new fnl() {

            private fnk a;

            public final void a()
            {
                fnk.n(a).c.a();
            }

            public final void b()
            {
                fnk.n(a).c.b();
            }

            
            {
                a = fnk.this;
                super();
            }
        };
        eag = new fnl() {

            private fnk a;

            public final void a()
            {
                dvp dvp1 = fnk.o(a);
                dvp1.c = true;
                dvp1.c();
            }

            public final void b()
            {
                dvp dvp1 = fnk.o(a);
                dvp1.c = false;
                dvp1.d();
            }

            
            {
                a = fnk.this;
                super();
            }
        };
        fnl fnl = new fnl() {

            private fnk a;

            public final void a()
            {
                Object obj;
                if (((fni) (fnk.c(a).p)).a)
                {
                    obj = new ecv(fnk.b(a), fnk.p(a), fnk.q(a), fnk.l(a));
                } else
                {
                    obj = new ecm(fnk.b(a), fnk.p(a), fnk.q(a));
                }
                fnk.o(a).a(((ecq) (obj)));
            }

            public final void b()
            {
                fnk.o(a).a(null);
            }

            
            {
                a = fnk.this;
                super();
            }
        };
        fnl fnl1 = new fnl() {

            private fnk a;

            public final void a()
            {
                if (fnk.k(a) && fnk.c(a).c.d())
                {
                    fnk.a(a, false);
                    fnk.d(a).c();
                }
            }

            public final void b()
            {
            }

            
            {
                a = fnk.this;
                super();
            }
        };
        fnl fnl2 = new fnl() {

            private fnk a;

            public final void a()
            {
                SoundDriver.startDuckingAudio(fnk.b(a).c.a);
            }

            public final void b()
            {
                SoundDriver.stopDuckingAudio(fnk.b(a).c.a);
            }

            
            {
                a = fnk.this;
                super();
            }
        };
        fnl fnl3 = new fnl() {

            private fnk a;

            public final void a()
            {
                fnk.d(a).a(false);
            }

            public final void b()
            {
                fnk.d(a).a(true);
            }

            
            {
                a = fnk.this;
                super();
            }
        };
        fnl fnl4 = new fnl() {

            private fnk a;

            public final void a()
            {
                PowerManager powermanager = (PowerManager)fnk.b(a).getSystemService("power");
                fnk.a(a, powermanager.newWakeLock(1, fnk.a()));
                fnk.r(a).acquire();
            }

            public final void b()
            {
                fnk.r(a).release();
                fnk.e(a).b();
            }

            
            {
                a = fnk.this;
                super();
            }
        };
        fnl fnl5 = new fnl() {

            private fnk a;

            public final void a()
            {
                fnk.b(a).registerReceiver(fnk.s(a), new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
            }

            public final void b()
            {
                fnk.b(a).unregisterReceiver(fnk.s(a));
                if (((fni) (fnk.c(a).q)).a && ((fni) (fnk.c(a).e)).a)
                {
                    fnk.h(a);
                }
            }

            
            {
                a = fnk.this;
                super();
            }
        };
        fnl fnl6 = new fnl() {

            private final ClientEvent a;
            private final ClientEvent b;
            private fnk c;

            public final void a()
            {
                fnk.g(c);
                fop.a(fnk.b(c).getApplicationContext(), ViewUri.b, a);
            }

            public final void b()
            {
                fnk.g(c);
                fop.a(fnk.b(c).getApplicationContext(), ViewUri.b, b);
            }

            
            {
                c = fnk.this;
                super();
                a = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.at, com.spotify.mobile.android.util.ClientEvent.SubEvent.dk);
                b = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.at, com.spotify.mobile.android.util.ClientEvent.SubEvent.dl);
            }
        };
        fnl fnl7 = new fnl() {

            private final ClientEvent a;
            private final ClientEvent b;
            private fnk c;

            public final void a()
            {
                fnk.g(c);
                fop.a(fnk.b(c).getApplicationContext(), ViewUri.b, a);
            }

            public final void b()
            {
                fnk.g(c);
                fop.a(fnk.b(c).getApplicationContext(), ViewUri.b, b);
            }

            
            {
                c = fnk.this;
                super();
                a = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.at, com.spotify.mobile.android.util.ClientEvent.SubEvent.dm);
                b = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.at, com.spotify.mobile.android.util.ClientEvent.SubEvent.dn);
            }
        };
        fnl fnl8 = new fnl() {

            private final ClientEvent a;
            private final ClientEvent b;
            private fnk c;

            public final void a()
            {
                fnk.g(c);
                fop.a(fnk.b(c).getApplicationContext(), ViewUri.b, a);
                fnk.i(c).a(AdSlot.WATCHNOW);
                ((AdRules)dmz.a(com/spotify/mobile/android/spotlets/ads/rules/AdRules)).a(com.spotify.mobile.android.spotlets.ads.rules.AdRules.StateType.a, true);
                fnk.i(c).e();
                fnk.b(c).getApplicationContext().startService(dvv.a(fnk.b(c), "com.spotify.mobile.android.service.action.driver.DISTRACTION_MODE_ON"));
            }

            public final void b()
            {
                fnk.g(c);
                fop.a(fnk.b(c).getApplicationContext(), ViewUri.b, b);
                fnk.i(c).b(AdSlot.WATCHNOW);
                ((AdRules)dmz.a(com/spotify/mobile/android/spotlets/ads/rules/AdRules)).a(com.spotify.mobile.android.spotlets.ads.rules.AdRules.StateType.a, false);
                fnk.b(c).getApplicationContext().startService(dvv.a(fnk.b(c), "com.spotify.mobile.android.service.action.driver.DISTRACTION_MODE_OFF"));
            }

            
            {
                c = fnk.this;
                super();
                a = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.at, com.spotify.mobile.android.util.ClientEvent.SubEvent._flddo);
                b = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.at, com.spotify.mobile.android.util.ClientEvent.SubEvent.dp);
            }
        };
        fnl fnl9 = new fnl() {

            private fnk a;

            public final void a()
            {
                if (fnk.t(a) && fnk.u(a))
                {
                    BannerAdActivity.a(fnk.b(a));
                }
            }

            public final void b()
            {
            }

            
            {
                a = fnk.this;
                super();
            }
        };
        fnl fnl10 = new fnl() {

            public final void a()
            {
                ((fmu)dmz.a(fmu)).a();
            }

            public final void b()
            {
                ((fmu)dmz.a(fmu)).a();
            }

        };
        h.a.a(fnl3);
        h.t.a(fnl2);
        h.l.a(spotifyservice);
        h.r.a(eac);
        h.e.a(p);
        h.f.a(fnm1);
        h.g.a(dvq);
        h.h.a(dvp);
        h.i.a(dll);
        h.j.a(eag);
        h.k.a(fnl);
        h.o.a(fnl1);
        h.q.a(fnj1);
        h.u.a(fnl4);
        h.p.a(fnl5);
        h.s.a(fnl6);
        h.s.a(fnl10);
        h.d.a(fnl7);
        h.m.a(fnl8);
        h.C.a(fnl9);
        h.b();
    }

    static android.net.wifi.WifiManager.WifiLock a(fnk fnk1, android.net.wifi.WifiManager.WifiLock wifilock)
    {
        fnk1.j = wifilock;
        return wifilock;
    }

    static android.os.PowerManager.WakeLock a(fnk fnk1, android.os.PowerManager.WakeLock wakelock)
    {
        fnk1.k = wakelock;
        return wakelock;
    }

    static eac a(fnk fnk1)
    {
        return fnk1.g;
    }

    static String a()
    {
        return b;
    }

    static boolean a(fnk fnk1, boolean flag)
    {
        fnk1.r = flag;
        return flag;
    }

    static SpotifyService b(fnk fnk1)
    {
        return fnk1.d;
    }

    static fnm c(fnk fnk1)
    {
        return fnk1.h;
    }

    static dll d(fnk fnk1)
    {
        return fnk1.n;
    }

    static dvb e(fnk fnk1)
    {
        return fnk1.a;
    }

    static BroadcastReceiver f(fnk fnk1)
    {
        return fnk1.e;
    }

    static fop g(fnk fnk1)
    {
        return fnk1.q;
    }

    static void h(fnk fnk1)
    {
        Intent intent = new Intent("com.spotify.mobile.android.service.broadcast.session.SHOW_PLAYER");
        fnk1.d.sendBroadcast(intent, "com.spotify.music.permission.INTERNAL_BROADCAST");
    }

    static AdEventReporter i(fnk fnk1)
    {
        return fnk1.c;
    }

    static AudioManager j(fnk fnk1)
    {
        return fnk1.i;
    }

    static boolean k(fnk fnk1)
    {
        return fnk1.r;
    }

    static eag l(fnk fnk1)
    {
        return fnk1.o;
    }

    static android.net.wifi.WifiManager.WifiLock m(fnk fnk1)
    {
        return fnk1.j;
    }

    static dvq n(fnk fnk1)
    {
        return fnk1.l;
    }

    static dvp o(fnk fnk1)
    {
        return fnk1.m;
    }

    static eco p(fnk fnk1)
    {
        return fnk1.s;
    }

    static Handler q(fnk fnk1)
    {
        return fnk1.t;
    }

    static android.os.PowerManager.WakeLock r(fnk fnk1)
    {
        return fnk1.k;
    }

    static BroadcastReceiver s(fnk fnk1)
    {
        return fnk1.f;
    }

    static boolean t(fnk fnk1)
    {
        return fnk1.v;
    }

    static boolean u(fnk fnk1)
    {
        return fnk1.u;
    }

    public final void a(Flags flags)
    {
        v = ((Boolean)flags.a(fys.aa)).booleanValue();
        u = ((Boolean)flags.a(fys.c)).booleanValue();
    }

}
