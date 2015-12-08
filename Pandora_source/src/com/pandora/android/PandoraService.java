// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.media.AudioManager;
import android.os.AsyncTask;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.SystemClock;
import android.support.v4.content.j;
import com.connectsdk.discovery.DiscoveryManager;
import com.connectsdk.discovery.provider.SSDPDiscoveryProvider;
import com.connectsdk.service.DIALService;
import com.pandora.android.activity.MediaButtonBroadcastReceiver;
import com.pandora.android.activity.PandoraIntent;
import com.pandora.android.activity.PandoraIntentFilter;
import com.pandora.android.ads.VideoAdManager;
import com.pandora.android.ads.g;
import com.pandora.android.api.bluetooth.BluetoothService;
import com.pandora.android.audio.RemoteControlClientManager;
import com.pandora.android.iap.d;
import com.pandora.android.provider.b;
import com.pandora.android.tablet.TabletHome;
import com.pandora.android.util.TabsClickedStatsCollector;
import com.pandora.android.util.k;
import com.pandora.android.util.s;
import com.pandora.android.widget.a;
import com.pandora.radio.data.SearchDescriptor;
import com.pandora.radio.data.aa;
import com.pandora.radio.data.af;
import com.pandora.radio.data.ah;
import com.pandora.radio.data.o;
import com.pandora.radio.data.q;
import com.pandora.radio.data.y;
import com.pandora.radio.provider.f;
import com.pandora.radio.util.i;
import com.pandora.radio.util.l;
import java.security.InvalidParameterException;
import java.util.Calendar;
import p.cm.ag;
import p.cm.al;
import p.cw.c;
import p.cx.e;
import p.cx.p;
import p.cx.t;
import p.cx.x;
import p.dd.an;
import p.dd.ay;
import p.dd.bh;
import p.dd.bl;
import p.dd.bp;
import p.dd.m;
import p.dg.h;
import p.di.r;

public class PandoraService extends Service
{
    public class a extends Binder
    {

        final PandoraService a;

        public a()
        {
            a = PandoraService.this;
            super();
        }
    }

    private static final class b extends Enum
    {

        public static final b a;
        public static final b b;
        public static final b c;
        private static final b d[];

        public static b valueOf(String s1)
        {
            return (b)Enum.valueOf(com/pandora/android/PandoraService$b, s1);
        }

        public static b[] values()
        {
            return (b[])d.clone();
        }

        static 
        {
            a = new b("DailyLimit", 0);
            b = new b("StationLimit", 1);
            c = new b("AllLimits", 2);
            d = (new b[] {
                a, b, c
            });
        }

        private b(String s1, int i1)
        {
            super(s1, i1);
        }
    }

    private class c extends AsyncTask
    {

        public String a;
        final PandoraService b;

        protected transient Object doInBackground(Object aobj[])
        {
            com.pandora.android.PandoraService.a(b, a);
            return null;
        }

        protected void onPostExecute(Object obj)
        {
            super.onPostExecute(obj);
            com.pandora.android.util.s.k();
        }

        public c(String s1)
        {
            b = PandoraService.this;
            super();
            a = null;
            a = s1;
        }
    }


    private static String f = "none";
    public long a;
    public String b;
    protected p.cw.c c;
    private boolean d;
    private boolean e;
    private AudioManager g;
    private ComponentName h;
    private y i;
    private q j;
    private boolean k;
    private aa l;
    private com.pandora.android.widget.a m;
    private com.pandora.android.artist.a n;
    private final IBinder o = new a();
    private BroadcastReceiver p;

    public PandoraService()
    {
        d = false;
        e = false;
        a = 0L;
        b = null;
        m = new com.pandora.android.widget.a(this);
        n = new com.pandora.android.artist.a();
        p = new BroadcastReceiver() {

            final PandoraService a;

            public void onReceive(Context context, Intent intent)
            {
                context = intent.getAction();
                if (context.equals(PandoraIntent.a("shuffle_options_changed")))
                {
                    com.pandora.android.PandoraService.a(a);
                } else
                {
                    if (context.equals(PandoraIntent.a("cmd_shutdown")))
                    {
                        com.pandora.android.PandoraService.b(a);
                        return;
                    }
                    if (context.equals(PandoraIntent.a("cmd_music_search_to_create_station")))
                    {
                        int i1 = intent.getIntExtra("intent_station_creation_source", 0);
                        context = p.cx.x.e.values()[i1];
                        com.pandora.android.PandoraService.a(a, intent, context);
                        return;
                    }
                    if (context.equals(PandoraIntent.a("cmd_music_search")))
                    {
                        int j1 = intent.getIntExtra("intent_station_creation_source", 0);
                        context = p.cx.x.e.values()[j1];
                        com.pandora.android.PandoraService.b(a, intent, context);
                        return;
                    }
                    if (context.equals(PandoraIntent.a("cmd_create_station")))
                    {
                        com.pandora.android.PandoraService.a(a, intent);
                        return;
                    }
                    if (context.equals(PandoraIntent.a("cmd_ack_trial_expired")))
                    {
                        com.pandora.android.PandoraService.b(a, intent);
                        return;
                    }
                    if (context.equals(PandoraIntent.a("cmd_ack_trial_expired_success")))
                    {
                        com.pandora.android.PandoraService.c(a);
                        return;
                    }
                }
            }

            
            {
                a = PandoraService.this;
                super();
            }
        };
    }

    private void a(Intent intent)
    {
        com.pandora.android.provider.b b1 = com.pandora.android.provider.b.a;
        c = b1.b();
        if (!k)
        {
            c.b(this);
            b1.e().c(this);
            k = true;
        }
        Object obj = c.x().b("KEY_KILL_TIME");
        if (obj != null)
        {
            try
            {
                long l1 = Long.valueOf(((String) (obj))).longValue();
                if (System.currentTimeMillis() - l1 < 1500L)
                {
                    r("preventing ghost restart");
                    stopSelf();
                }
            }
            catch (Exception exception)
            {
                exception.printStackTrace();
            }
        }
        if (e || d)
        {
            r("already initialized");
            c.m().a(intent);
            return;
        }
        r("Service start called");
        e = true;
        g = (AudioManager)com.pandora.radio.util.l.a(getApplicationContext(), "audio");
        b1.a(true);
        com.pandora.android.ads.c.c();
        r("Initializing Pandora Service");
        exception = new PandoraIntentFilter();
        exception.a("shuffle_options_changed");
        exception.a("cmd_shutdown");
        exception.a("cmd_music_search_to_create_station");
        exception.a("cmd_music_search");
        exception.a("cmd_create_station");
        exception.a("cmd_audio_focus_lost");
        exception.a("cmd_audio_focus_lost_transient");
        exception.a("cmd_audio_focus_gained");
        exception.a("cmd_reset_ad_refresh_timer");
        exception.a("cmd_ack_trial_expired");
        exception.a("cmd_ack_trial_expired_success");
        b1.C().a(p, exception);
        com.pandora.android.audio.b.a.a();
        if (p.cy.b.a())
        {
            p.df.a.c("PandoraService", "Initializing FordSync.");
            com.pandora.android.fordsync.a.a().d();
            com.pandora.android.audio.a.a();
        }
        u();
        v();
        RemoteControlClientManager.a(this, h);
        com.pandora.android.ads.VideoAdManager.c.c();
        com.pandora.android.ads.s.b.b();
        if (com.pandora.android.util.s.m())
        {
            com.pandora.android.iap.d.d.a().e();
        } else
        {
            com.pandora.android.iap.d.d.a().d().b();
        }
        c.m().a(intent);
        p.cn.e.a().b();
        com.pandora.android.util.e.c(this);
        DiscoveryManager.getInstance().registerDeviceService(com/connectsdk/service/DIALService, com/connectsdk/discovery/provider/SSDPDiscoveryProvider);
        DiscoveryManager.getInstance().setPairingLevel(com.connectsdk.discovery.DiscoveryManager.PairingLevel.ON);
        DiscoveryManager.getInstance().addListener(new com.pandora.android.eureka.e());
        DiscoveryManager.getInstance().start();
        p.cf.b.a().b();
        com.pandora.android.inbox.e.a().b();
        m.a();
        d = true;
        e = false;
        r("Done initializing Pandora Service");
    }

    private void a(Intent intent, p.cx.x.e e1)
    {
        Object obj;
        if (intent.getIntExtra("intent_search_id", -1) == -1)
        {
            obj = null;
        } else
        {
            obj = Integer.valueOf(intent.getIntExtra("intent_search_id", -1));
        }
        obj = new com.pandora.radio.util.c(((Integer) (obj)));
        ((com.pandora.radio.util.j) (obj)).a(intent.getStringExtra("intent_station_creation_followon_ad_url"));
        intent.putExtra("intent_search_result_consumer", ((java.io.Serializable) (obj)));
        b(intent, e1);
    }

    static void a(PandoraService pandoraservice)
    {
        pandoraservice.r();
    }

    static void a(PandoraService pandoraservice, Intent intent)
    {
        pandoraservice.c(intent);
    }

    static void a(PandoraService pandoraservice, Intent intent, p.cx.x.e e1)
    {
        pandoraservice.a(intent, e1);
    }

    static void a(PandoraService pandoraservice, String s1)
    {
        pandoraservice.q(s1);
    }

    public static void a(aa aa1, String s1, boolean flag)
    {
        if (aa1 != null && !aa1.M())
        {
            (new ag()).execute(new Object[] {
                Integer.valueOf(2), aa1, aa1.r(), s1, Boolean.valueOf(flag)
            });
        }
    }

    public static void a(y y1, String s1, boolean flag)
    {
        if (y1 != null)
        {
            (new ag()).execute(new Object[] {
                Integer.valueOf(1), null, y1.c(), s1, Boolean.valueOf(flag)
            });
        }
    }

    public static void a(String s1)
    {
        (new al()).execute(new Object[] {
            s1
        });
    }

    private void a(String s1, b b1)
    {
        boolean flag = com.pandora.radio.util.i.e();
        if (flag)
        {
            com.pandora.android.util.s.s();
            return;
        }
        int i1 = Integer.parseInt(s1);
        if (i1 < -1)
        {
            break MISSING_BLOCK_LABEL_166;
        }
        com.pandora.android.provider.b b2 = com.pandora.android.provider.b.a;
        String s2 = "";
        if (b1 != com.pandora.android.b.c) goto _L2; else goto _L1
_L1:
        b2.d().b(i1);
        j.a(i1);
        s2 = "All";
_L5:
        c.d().a();
        if (i1 == -1)
        {
            s1 = " unlimited";
        }
        com.pandora.android.util.s.h((new StringBuilder()).append(s2).append(" skips changed to: ").append(s1).toString());
        com.pandora.android.util.s.s();
        return;
_L2:
        if (b1 != com.pandora.android.b.a) goto _L4; else goto _L3
_L3:
        b2.d().b(i1);
        s2 = "Daily";
          goto _L5
_L4:
        if (b1 != com.pandora.android.b.b) goto _L5; else goto _L6
_L6:
        j.a(i1);
        s2 = "Station";
          goto _L5
        s1;
        com.pandora.android.util.s.h("Invalid skip limit");
        com.pandora.android.util.s.s();
        return;
        s1;
        com.pandora.android.util.s.s();
        throw s1;
    }

    private void a(String s1, boolean flag)
    {
        if (com.pandora.radio.util.i.e()) goto _L2; else goto _L1
_L1:
        if (!com.pandora.android.util.s.a(s1)) goto _L4; else goto _L3
_L3:
        com.pandora.android.coachmark.e.e ae[];
        int j1;
        s1 = com.pandora.android.provider.b.a.b().k();
        s1.b(System.currentTimeMillis());
        ae = com.pandora.android.coachmark.e.e.values();
        j1 = ae.length;
        int i1 = 0;
_L6:
        com.pandora.android.coachmark.e.e e1;
        if (i1 >= j1)
        {
            break; /* Loop/switch isn't completed */
        }
        e1 = ae[i1];
        ((ah)s1).m(e1.name());
        i1++;
        if (true) goto _L6; else goto _L5
_L5:
        com.pandora.android.coachmark.e.a(true);
        if (!flag) goto _L2; else goto _L7
_L7:
        com.pandora.android.util.s.a(this, "Coachmarks reset and enabled.");
_L2:
        com.pandora.android.util.s.s();
        return;
_L4:
        if (!s1.equalsIgnoreCase("enable")) goto _L9; else goto _L8
_L8:
        com.pandora.android.coachmark.e.a(true);
        if (!flag) goto _L2; else goto _L10
_L10:
        com.pandora.android.util.s.a(this, "Coachmarks enabled.");
          goto _L2
        s1;
        com.pandora.android.util.s.s();
        throw s1;
_L9:
        if (!s1.equalsIgnoreCase("disable")) goto _L2; else goto _L11
_L11:
        com.pandora.android.coachmark.e.a(false);
        if (!flag) goto _L2; else goto _L12
_L12:
        com.pandora.android.util.s.a(this, "Coachmarks disabled.");
          goto _L2
    }

    private void b(Intent intent)
    {
        (new p.cm.a()).execute(new Object[0]);
    }

    private void b(Intent intent, p.cx.x.e e1)
    {
        String s1 = intent.getStringExtra("intent_search_seed");
        if (s1 != null && s1.startsWith("@test"))
        {
            p(s1);
            return;
        }
        if (s1 != null && s1.startsWith("@web"))
        {
            i(s1);
            return;
        }
        if (s1 != null && s1.startsWith("@cmd"))
        {
            d(s1);
            return;
        } else
        {
            intent = (com.pandora.radio.util.j)intent.getSerializableExtra("intent_search_result_consumer");
            c.n().a(s1, intent, false, true, e1);
            return;
        }
    }

    static void b(PandoraService pandoraservice)
    {
        pandoraservice.s();
    }

    static void b(PandoraService pandoraservice, Intent intent)
    {
        pandoraservice.b(intent);
    }

    static void b(PandoraService pandoraservice, Intent intent, p.cx.x.e e1)
    {
        pandoraservice.b(intent, e1);
    }

    public static void b(String s1)
    {
        (new p.di.f()).execute(new Object[] {
            s1
        });
    }

    private void b(String s1, boolean flag)
    {
        if (!com.pandora.radio.util.i.e())
        {
            s1 = s1.substring("existinguserdelay".length()).trim();
            int i1;
            try
            {
                i1 = Integer.parseInt(s1);
            }
            catch (NumberFormatException numberformatexception)
            {
                com.pandora.android.util.s.a(this, (new StringBuilder()).append("Exception parsing '").append(s1).append("' as an int").toString());
                p.df.a.b("PandoraService", s("@cmd:existinguserdelay"), numberformatexception);
                return;
            }
            s1 = Calendar.getInstance();
            s1.add(6, -2);
            s1.add(13, i1);
            ((ah)com.pandora.android.provider.b.a.b().k()).b(s1.getTimeInMillis());
            if (flag)
            {
                com.pandora.android.util.s.a(this, (new StringBuilder()).append("Eligible for SP coachmarks in ").append(i1).append(" seconds.").toString());
                return;
            }
        }
    }

    public static boolean b()
    {
        return "display".equals(f);
    }

    private void c(Intent intent)
    {
        Object obj = null;
        String s1 = intent.getStringExtra("intent_music_token");
        String s2 = intent.getStringExtra("intent_station_creation_followon_ad_url");
        boolean flag = intent.getBooleanExtra("intent_allow_video_ad_opportunity", false);
        String s3 = intent.getStringExtra("intent_start_track_token");
        String s4 = intent.getStringExtra("intent_auto_share_social_network");
        String s5 = intent.getStringExtra("intent_auto_share_lid_token");
        com.pandora.radio.data.b b1 = (com.pandora.radio.data.b)intent.getSerializableExtra("intent_ad_id");
        String s6 = intent.getStringExtra("intent_ad_server_correlation_id");
        Integer integer = obj;
        if (intent.hasExtra("intent_promoted_station_campaign_id"))
        {
            integer = Integer.valueOf(intent.getIntExtra("intent_promoted_station_campaign_id", -1));
            if (integer.intValue() == -1)
            {
                integer = obj;
            }
        }
        int i1 = intent.getIntExtra("intent_station_creation_source", 0);
        intent = p.cx.x.e.values()[i1];
        a(c, s1, s2, flag, s3, s4, s5, integer, intent, b1, s6);
    }

    static void c(PandoraService pandoraservice)
    {
        pandoraservice.h();
    }

    public static void c(String s1)
    {
        if ("none".equals(s1))
        {
            com.pandora.android.ads.c.b().c(null);
        }
        f = s1;
    }

    public static boolean c()
    {
        return "video".equals(f);
    }

    private void d(String s1)
    {
        if (s1.length() >= "@cmd".length() + 1)
        {
            s1 = s1.substring("@cmd".length() + 1).trim();
            if (s1.equalsIgnoreCase("about"))
            {
                m();
                return;
            }
            if (s1.equalsIgnoreCase("log"))
            {
                n();
                return;
            }
            if (s1.equalsIgnoreCase("locale"))
            {
                o();
                return;
            }
            if (s1.startsWith("abtests"))
            {
                p();
                return;
            }
            if (s1.equalsIgnoreCase("environment"))
            {
                q();
                return;
            }
            if (s1.startsWith("video"))
            {
                h(s1.substring("video".length()).trim());
                return;
            }
            if (s1.startsWith("dailyskips"))
            {
                g(s1.substring("dailyskips".length()).trim());
                return;
            }
            if (s1.startsWith("stationskips"))
            {
                f(s1.substring("stationskips".length()).trim());
                return;
            }
            if (s1.startsWith("noskiplimit"))
            {
                k();
                return;
            }
            if (s1.startsWith("tabsreport"))
            {
                e(s1);
                return;
            }
            if (s1.startsWith("coachmarks"))
            {
                a(s1.substring("coachmarks".length()).trim(), true);
                return;
            }
            if (s1.startsWith("existinguserdelay"))
            {
                b(s1, true);
                return;
            }
            if (s1.startsWith("zerovolume"))
            {
                i();
                return;
            }
            if (s1.startsWith("willshowcasting"))
            {
                j();
                return;
            }
            if (s1.equalsIgnoreCase("reauth"))
            {
                l();
                return;
            }
        }
    }

    public static boolean d()
    {
        return "int".equals(f);
    }

    private void e(String s1)
    {
        long l1 = 0x5265c00L;
        int i1 = 5;
        if (!com.pandora.radio.util.i.e())
        {
            if ((s1 = s1.substring("tabsreport".length()).trim().split(",")).length == 2)
            {
                int j1 = Integer.valueOf(s1[0].substring(0, s1[0].length() - 1)).intValue();
                TabsClickedStatsCollector tabsclickedstatscollector;
                int k1;
                if (!s1[0].endsWith("d"))
                {
                    if (s1[0].endsWith("h"))
                    {
                        i1 = 11;
                    } else
                    if (s1[0].endsWith("m"))
                    {
                        i1 = 12;
                    }
                }
                k1 = Integer.valueOf(s1[0].substring(0, s1[0].length() - 1)).intValue();
                if (s1[1].endsWith("d"))
                {
                    l1 = 0x5265c00L * (long)k1;
                } else
                if (s1[1].endsWith("m"))
                {
                    l1 = (long)k1 * 60L * 1000L;
                }
                tabsclickedstatscollector = TabsClickedStatsCollector.a();
                tabsclickedstatscollector.a = i1;
                tabsclickedstatscollector.b = j1;
                tabsclickedstatscollector.c = l1;
                tabsclickedstatscollector.b();
                com.pandora.android.util.s.h((new StringBuilder()).append("tabsreport changed to  --> next alarm : ").append(s1[0]).append(", repeat interval : ").append(s1[1]).toString());
                return;
            }
        }
    }

    public static boolean e()
    {
        return "adm server".equals(f);
    }

    private void f(String s1)
    {
        a(s1, com.pandora.android.b.b);
    }

    public static boolean f()
    {
        return "ad html".equals(f);
    }

    private void g()
    {
        if (p.cy.b.a())
        {
            p.cx.c.a().b();
            com.pandora.android.fordsync.a.a().j();
            BluetoothService.b();
        }
    }

    private void g(String s1)
    {
        a(s1, com.pandora.android.b.a);
    }

    private void h()
    {
        com.pandora.android.provider.b.a.b().d().X();
    }

    private void h(String s1)
    {
        if (s1.equals("-1"))
        {
            com.pandora.android.ads.VideoAdManager.c.a().j();
            com.pandora.android.util.s.h("Video timers disabled");
        }
        com.pandora.android.util.s.s();
        return;
        s1;
        com.pandora.android.util.s.s();
        throw s1;
    }

    private void i()
    {
        if (com.pandora.radio.util.i.e())
        {
            return;
        }
        String s1;
        StringBuilder stringbuilder;
        boolean flag;
        if (!com.pandora.android.provider.b.a.d().y())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.pandora.android.provider.b.a.d().d(flag);
        stringbuilder = (new StringBuilder()).append("Zero Volume Auto Pause is now ");
        if (flag)
        {
            s1 = "ENABLED";
        } else
        {
            s1 = "DISABLED";
        }
        com.pandora.android.util.s.h(stringbuilder.append(s1).toString());
    }

    private void i(String s1)
    {
        if (com.pandora.radio.util.i.e())
        {
            return;
        }
        String s2 = s1.substring(Math.min(s1.length(), "@web".length() + 1));
        s1 = com.pandora.android.provider.b.a.C();
        if (s2.equals("test"))
        {
            s1.a(new PandoraIntent("show_test_landing_page"));
            return;
        }
        if (com.pandora.android.util.s.a(s2))
        {
            com.pandora.android.util.s.k();
            return;
        }
        if (s2.charAt(0) == '/')
        {
            String s3 = com.pandora.android.data.d.g;
            s1 = s3;
            if (s3.charAt(s3.length() - 1) == '/')
            {
                s1 = s3.substring(0, s3.length() - 1);
            }
            com.pandora.android.util.s.l((new StringBuilder(s1)).append(s2).toString());
            return;
        }
        if (!s2.contains("http"))
        {
            s1 = String.format("http://%s", new Object[] {
                s2
            });
        } else
        {
            s1 = s2;
        }
        com.pandora.android.util.s.l(s1);
    }

    private void j()
    {
        if (com.pandora.radio.util.i.e())
        {
            return;
        } else
        {
            com.pandora.android.provider.b.a.b().k().e(true);
            a("", false);
            b("existinguserdelay5", false);
            com.pandora.android.util.s.h("Reset coachmarks, willShowCastingCoachMark and user registration");
            return;
        }
    }

    private void j(String s1)
    {
        if (com.pandora.radio.util.i.e() || s1.length() < "@backstage".length() + 1)
        {
            return;
        }
        StringBuilder stringbuilder = new StringBuilder(com.pandora.android.data.d.g);
        stringbuilder.append("content/mobile/");
        s1 = s1.substring("@backstage".length() + 1).trim();
        String as[] = s1.split("/");
        if (as.length == 1 && as[0].length() > 0)
        {
            stringbuilder.append("artist_detail");
        } else
        if (as.length == 2)
        {
            stringbuilder.append("album_detail");
        } else
        if (as.length == 3)
        {
            stringbuilder.append("track_detail");
        } else
        {
            com.pandora.android.util.s.k();
            return;
        }
        stringbuilder.append(".vm?token=").append(s1);
        com.pandora.android.util.s.l(stringbuilder.toString());
    }

    private void k()
    {
        a("-1", com.pandora.android.b.c);
    }

    private void k(String s1)
    {
        c("adm server");
        com.pandora.android.util.s.h("Now testing ADM server-side ad");
        Object obj = null;
        String as[] = s1.split(":");
        s1 = obj;
        if (as.length > 1)
        {
            s1 = as[1];
        }
        com.pandora.android.ads.c.b().c(s1);
    }

    private void l()
    {
        if (com.pandora.radio.util.i.e())
        {
            return;
        } else
        {
            (new r()).execute(new Object[] {
                com.pandora.android.provider.b.a.b()
            });
            return;
        }
    }

    private void l(String s1)
    {
        Object obj = null;
        String as[] = s1.split(":");
        s1 = obj;
        if (as.length > 1)
        {
            s1 = as[1];
        }
        if (s1 != null)
        {
            c("ad html");
            com.pandora.android.util.s.h("Now testing custom HTML ad");
            com.pandora.android.ads.c.b().c(s1);
        }
    }

    private void m()
    {
        com.pandora.android.util.s.a(com.pandora.android.util.s.g("\n"), com.pandora.android.util.s.r());
    }

    private void m(String s1)
    {
        c("artist");
        s1 = s1.substring("@testartist".length()).trim();
        if (com.pandora.android.util.s.a(s1))
        {
            com.pandora.android.provider.b.a.b().k().k(null);
            com.pandora.android.util.s.h("test artist message - cleared");
            return;
        } else
        {
            com.pandora.android.provider.b.a.b().k().k(s1);
            com.pandora.android.util.s.h((new StringBuilder()).append("Now testing artist message ").append(s1).toString());
            return;
        }
    }

    private void n()
    {
        PandoraIntent pandoraintent = new PandoraIntent("show_diagnostic_dialog");
        pandoraintent.putExtra("intent_followon_intent", com.pandora.android.util.s.r());
        com.pandora.android.provider.b.a.C().a(pandoraintent);
    }

    private void n(String s1)
    {
        c("featuredtrack");
        s1 = s1.substring("@testfeaturedtrack".length()).trim();
        if (com.pandora.android.util.s.a(s1))
        {
            com.pandora.android.provider.b.a.b().k().l(null);
            com.pandora.android.util.s.h("test featured track - cleared");
            return;
        } else
        {
            com.pandora.android.provider.b.a.b().k().l(s1);
            com.pandora.android.util.s.h((new StringBuilder()).append("Now testing featuredTrack ").append(s1).toString());
            return;
        }
    }

    private void o()
    {
        if (com.pandora.radio.util.i.e())
        {
            return;
        } else
        {
            PandoraIntent pandoraintent = new PandoraIntent("show_locale_dialog");
            pandoraintent.putExtra("intent_followon_intent", com.pandora.android.util.s.r());
            com.pandora.android.provider.b.a.C().a(pandoraintent);
            return;
        }
    }

    private boolean o(String s1)
    {
        com.pandora.android.util.k.a().b(false);
        if (!com.pandora.android.util.s.a(s1) && s1.equals("0"))
        {
            com.pandora.android.provider.b.a.b().j().k();
            com.pandora.android.util.k.a().b(true);
            return true;
        } else
        {
            return false;
        }
    }

    private void p()
    {
        if (com.pandora.radio.util.i.e())
        {
            return;
        } else
        {
            PandoraIntent pandoraintent = new PandoraIntent("show_ab_tests");
            pandoraintent.putExtra("intent_followon_intent", com.pandora.android.util.s.r());
            com.pandora.android.provider.b.a.C().a(pandoraintent);
            return;
        }
    }

    private void p(String s1)
    {
        (new c(s1)).execute(new Object[0]);
    }

    private void q()
    {
        if (com.pandora.radio.util.i.e())
        {
            return;
        } else
        {
            PandoraIntent pandoraintent = new PandoraIntent("show_environment_dialog");
            pandoraintent.putExtra("intent_followon_intent", com.pandora.android.util.s.r());
            com.pandora.android.provider.b.a.C().a(pandoraintent);
            return;
        }
    }

    private void q(String s1)
    {
        String s3 = null;
        if (!"@test".equalsIgnoreCase(s1.trim())) goto _L2; else goto _L1
_L1:
        com.pandora.android.util.s.h("Exiting test mode");
        com.pandora.android.provider.b.a.b().p().a("disable", null, null, null);
        com.pandora.android.provider.b.a.b().k().k(null);
        c("none");
_L3:
        r("Issuing devicelogin");
        c.e().b(true);
        s1 = com.pandora.android.provider.b.a.b().d();
        if (s1 instanceof h)
        {
            ((h)s1).a(com.pandora.radio.util.k.n.h);
        }
        com.pandora.android.util.s.s();
        return;
_L2:
label0:
        {
            if (!s1.startsWith("@testadm server"))
            {
                break label0;
            }
            k(s1);
        }
          goto _L3
label1:
        {
            if (!s1.startsWith("@testad html"))
            {
                break label1;
            }
            l(s1);
        }
          goto _L3
label2:
        {
            if (!s1.startsWith("@testartist"))
            {
                break label2;
            }
            m(s1);
        }
          goto _L3
label3:
        {
            if (!s1.startsWith("@testfeaturedtrack"))
            {
                break label3;
            }
            n(s1);
        }
          goto _L3
        String as[] = s1.split(" ");
        as.length;
        JVM INSTR tableswitch 2 3: default 707
    //                   2 712
    //                   3 262;
           goto _L4 _L5 _L6
_L5:
        String s2;
        break MISSING_BLOCK_LABEL_712;
_L8:
        if (s2 == null)
        {
            try
            {
                com.pandora.android.util.s.h("Ad id is required");
                com.pandora.android.activity.a.a();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                r((new StringBuilder()).append("Error in atTest setup: ").append(s1.getMessage()).toString());
                com.pandora.android.activity.a.a();
                return;
            }
        }
          goto _L7
_L6:
        s2 = as[1];
        s3 = as[2];
          goto _L8
_L7:
        Integer.parseInt(s2);
        if (s3 == null)
        {
            break MISSING_BLOCK_LABEL_289;
        }
        Long.parseLong(s3);
        if (!s1.startsWith("@testaudio"))
        {
            break MISSING_BLOCK_LABEL_454;
        }
        com.pandora.android.util.s.h((new StringBuilder()).append("Now testing audio ad: ").append(s2).toString());
        com.pandora.android.provider.b.a.b().p().a("enable", "audio", s2, s3);
        c("audio");
          goto _L3
        s1;
        r((new StringBuilder()).append("Invalid ad id: ").append(s2).toString());
        com.pandora.android.util.s.h((new StringBuilder()).append("Invalid ad id: ").append(s2).toString());
        com.pandora.android.activity.a.a();
        return;
        s1;
        r((new StringBuilder()).append("Invalid creative id: ").append(s3).toString());
        com.pandora.android.util.s.h((new StringBuilder()).append("Invalid creative id: ").append(s3).toString());
        com.pandora.android.activity.a.a();
        return;
label4:
        {
            if (!s1.startsWith("@testdisplay"))
            {
                break label4;
            }
            com.pandora.android.util.s.h((new StringBuilder()).append("Now testing display ad: ").append(s2).toString());
            com.pandora.android.provider.b.a.b().p().a("enable", "display", s2, s3);
            c("display");
        }
          goto _L3
label5:
        {
            if (!s1.startsWith("@testvideo"))
            {
                break label5;
            }
            com.pandora.android.util.s.h((new StringBuilder()).append("Now testing video ad: ").append(s2).toString());
            com.pandora.android.provider.b.a.b().p().a("enable", "video", s2, s3);
            c("video");
        }
          goto _L3
label6:
        {
            if (!s1.startsWith("@testint"))
            {
                break label6;
            }
            if (!o(s2))
            {
                com.pandora.android.provider.b.a.b().p().a("enable", "int", s2, s3);
            }
            com.pandora.android.util.s.h((new StringBuilder()).append("Now testing interstitial ad: ").append(s2).toString());
            c("int");
        }
          goto _L3
        r((new StringBuilder()).append("Invalid test request: ").append(s1).toString());
        com.pandora.android.util.s.h((new StringBuilder()).append("Invalid test reuqest: ").append(s1).toString());
        com.pandora.android.activity.a.a();
        return;
_L4:
        s2 = null;
          goto _L8
        s2 = as[1];
          goto _L8
    }

    private void r()
    {
        com.pandora.android.provider.b.a.b().d().X();
    }

    private static void r(String s1)
    {
        p.df.a.c("PandoraService", s(s1));
    }

    private static String s(String s1)
    {
        return (new StringBuilder()).append("PANDORA SERVICE - ").append(s1).toString();
    }

    private void s()
    {
        r("User initiated shutdown");
        com.pandora.android.provider.b.a.g(true);
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            t();
        }
        stopSelf();
    }

    private void t()
    {
        Object obj = new Intent(getApplicationContext(), com/pandora/android/api/bluetooth/BluetoothService);
        ((Intent) (obj)).setPackage("com.pandora.android");
        obj = PendingIntent.getService(getApplicationContext(), 1, ((Intent) (obj)), 0x40000000);
        ((AlarmManager)getSystemService("alarm")).set(3, SystemClock.elapsedRealtime() + 5000L, ((PendingIntent) (obj)));
    }

    private void u()
    {
        h = new ComponentName(getApplicationContext(), com/pandora/android/activity/MediaButtonBroadcastReceiver);
    }

    private void v()
    {
        g.registerMediaButtonEventReceiver(h);
    }

    private void w()
    {
        g.unregisterMediaButtonEventReceiver(h);
    }

    protected void a()
    {
        com.pandora.android.ads.VideoAdManager.c.b();
        p.bu.f.b();
        com.pandora.android.provider.b.a.C().a(p);
        if (m != null)
        {
            m.b();
        }
        com.pandora.android.inbox.e.a().c();
        p.cf.b.a().c();
        DiscoveryManager.destroy();
        com.pandora.android.util.g.a.a().b();
        com.pandora.android.audio.b.a.b();
        c.d().k();
        com.pandora.android.ads.c.k();
        g();
        RemoteControlClientManager.e();
        com.pandora.android.audio.a.b();
        com.pandora.android.ads.s.b.c();
        com.pandora.android.activity.c.a().c();
        w();
        p.bx.d.a().e();
        p.bx.d.b().b();
        if (!com.pandora.android.util.s.m())
        {
            com.pandora.android.iap.d.d.a().d().a();
        }
        com.pandora.android.widget.d.b();
        com.pandora.android.util.s.b();
        if (n != null)
        {
            n.a();
        }
        if (c != null)
        {
            if (k)
            {
                c.c(this);
                com.pandora.android.provider.b.a.e().b(this);
                k = false;
            }
            com.pandora.android.provider.b.a.a(null);
            c.c();
            c = null;
        }
    }

    protected void a(p.cw.c c1, String s1, String s2, boolean flag, String s3, String s4, String s5, 
            Integer integer, p.cx.x.e e1, com.pandora.radio.data.b b1, String s6)
    {
        (new p.di.c(c1, s1, s2, flag, s3, s4, s5, integer, e1, b1, null, s6)).execute(new Object[0]);
    }

    public void onAutomotiveAccessoryEvent(p.dd.e e1)
    {
        if (e1.a == p.dd.e.a.a)
        {
            e1 = c.d();
            if (e1.u() != p.cw.b.a.a)
            {
                e1.y();
            }
        } else
        if (e1.a == p.dd.e.a.b)
        {
            c.z().a();
            return;
        }
    }

    public IBinder onBind(Intent intent)
    {
        return o;
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        com.pandora.android.widget.d.a().c();
    }

    public void onCountryCodeChanged(p.dd.l l1)
    {
        com.pandora.android.util.r.a(l1.a);
    }

    public void onCreate()
    {
        super.onCreate();
        com.pandora.android.util.g.a.a().a();
        DiscoveryManager.init(this);
    }

    public void onCreateStationTaskCompleted(m m1)
    {
        Object obj;
        Object obj1;
        if (m1.h != null)
        {
            obj = m1.h.b();
        } else
        {
            obj = null;
        }
        String s1;
        boolean flag;
        if (!com.pandora.android.util.s.a(((String) (obj))))
        {
            Bundle bundle = new Bundle(1);
            bundle.putString("intent_welcome_message", ((String) (obj)));
            obj = bundle;
        } else
        {
            obj = null;
        }
        obj1 = com.pandora.android.provider.b.a.c();
        if (m1.c && !m1.a.t() && c.d().p())
        {
            c.d().a(p.cw.b.c.a);
            com.pandora.android.activity.a.a(((Bundle) (obj)));
            return;
        }
        if (obj1 != null && !((com.pandora.android.eureka.a) (obj1)).a(m1.a))
        {
            ((com.pandora.android.eureka.a) (obj1)).b();
            return;
        }
        if (m1.f && !m1.b && !m1.c && !m1.a.t())
        {
            flag = com.pandora.android.ads.VideoAdManager.c.a().a(null, m1.a);
        } else
        {
            flag = false;
        }
        obj1 = m1.a;
        s1 = m1.g;
        if (!flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (m1.c)
        {
            m1 = p.cw.b.b.c;
        } else
        {
            m1 = p.cw.b.b.a;
        }
        com.pandora.android.activity.a.a(((y) (obj1)), s1, flag, true, m1, ((Bundle) (obj)));
    }

    public void onDebugSearchCommand(p.dd.o o1)
    {
        o1 = o1.a;
        if (o1 != null && o1.startsWith("@test"))
        {
            p(o1);
        } else
        {
            if (o1 != null && o1.startsWith("@web"))
            {
                i(o1);
                return;
            }
            if (o1 != null && o1.startsWith("@backstage"))
            {
                j(o1);
                return;
            }
            if (o1 != null && o1.startsWith("@cmd"))
            {
                d(o1);
                return;
            }
        }
    }

    public void onDeleteStationSuccess(p.dd.p p1)
    {
label0:
        {
            String s1 = p1.a;
            boolean flag;
            if (!c.y().d())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (p1.b || flag)
            {
                com.pandora.android.activity.a.b();
                if (com.pandora.android.util.s.u())
                {
                    if (!flag)
                    {
                        break label0;
                    }
                    com.pandora.android.provider.b.a.C().a(TabletHome.af());
                }
            }
            return;
        }
        com.pandora.android.provider.b.a.C().a(TabletHome.ah());
    }

    public void onDestroy()
    {
        super.onDestroy();
        if (c != null)
        {
            f f1 = c.x();
            if (f1 != null)
            {
                f1.a("KEY_KILL_TIME", String.valueOf(System.currentTimeMillis()));
            }
        }
        r("Pandora received shutdown request");
        a();
        com.pandora.android.provider.b.a.a(false);
        r("System exit initiated");
        System.exit(0);
        return;
        Object obj;
        obj;
        p.df.a.c("PandoraService", "Exception shutting down", ((Throwable) (obj)));
        com.pandora.android.provider.b.a.a(false);
        r("System exit initiated");
        System.exit(0);
        return;
        obj;
        com.pandora.android.provider.b.a.a(false);
        r("System exit initiated");
        System.exit(0);
        throw obj;
    }

    public void onLowMemory()
    {
        try
        {
            if (c != null && c.E())
            {
                r("Received low memory warning, stopping service");
                stopSelf();
            }
            if (!com.pandora.android.activity.c.a().b())
            {
                r("Received low memory warning, shutdown activities");
                com.pandora.android.activity.c.a().c();
            }
            return;
        }
        catch (Exception exception)
        {
            p.df.a.c("PandoraService", "onLowMemory", exception);
        }
    }

    public void onPauseOnBluetoothDisconnect(p.dd.af af1)
    {
        p.df.a.c("PandoraService", "Bluetooth state change - disconnected, pausing music");
        if (RemoteControlClientManager.c())
        {
            RemoteControlClientManager.d().a();
        }
        c.d().b(p.cw.b.c.a);
    }

    public void onSignInState(an an1)
    {
        j = an1.c;
        static class _cls2
        {

            static final int a[];
            static final int b[];

            static 
            {
                b = new int[p.cx.e.a.values().length];
                try
                {
                    b[p.cx.e.a.b.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    b[p.cx.e.a.a.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    b[p.cx.e.a.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    b[p.cx.e.a.d.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                a = new int[p.dd.bh.a.values().length];
                try
                {
                    a[p.dd.bh.a.b.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[p.dd.bh.a.d.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[p.dd.bh.a.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[p.dd.bh.a.a.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[p.dd.bh.a.e.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (com.pandora.android._cls2.b[an1.b.ordinal()])
        {
        default:
            throw new InvalidParameterException((new StringBuilder()).append("onSignInState called with unknown signInState: ").append(an1.b).toString());

        case 1: // '\001'
            com.crashlytics.android.d.c(an1.a.d());
            (new p.cm.p()).execute(new Object[0]);
            // fall through

        case 2: // '\002'
        case 3: // '\003'
            return;

        case 4: // '\004'
            stopForeground(true);
            break;
        }
    }

    public int onStartCommand(Intent intent, int i1, int j1)
    {
        a(intent);
        return 2;
    }

    public void onStationStateChange(ay ay1)
    {
        i = ay1.a;
    }

    public void onTaskRemoved(Intent intent)
    {
        com.pandora.android.widget.d.a().b();
        com.pandora.android.util.s.d();
        com.pandora.android.util.s.f();
        com.pandora.android.provider.b.a.e().a(new p.bz.p());
        s();
    }

    public void onTrackState(bh bh1)
    {
        l = bh1.b;
        switch (com.pandora.android._cls2.a[bh1.a.ordinal()])
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("onTrackState: unknown event type ").append(bh1.a).toString());

        case 3: // '\003'
            v();
            // fall through

        case 1: // '\001'
        case 2: // '\002'
            return;

        case 4: // '\004'
        case 5: // '\005'
            bh1 = com.pandora.android.provider.b.a.b().o();
            break;
        }
        boolean flag;
        if (com.pandora.android.activity.b.a().d() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        bh1.b(flag);
        com.pandora.radio.util.p.a().a();
    }

    public void onUpdatePromptVersion(bl bl1)
    {
        com.pandora.android.util.s.a(bl1.a, bl1.b);
    }

    public void onUserStateChange(bp bp1)
    {
        if (bp1.a)
        {
            c.x().a("KEY_SPLASH_SCREEN_URL", "");
        }
    }

}
