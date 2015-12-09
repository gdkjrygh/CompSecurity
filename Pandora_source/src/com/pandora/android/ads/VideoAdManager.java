// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.ads;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.content.j;
import com.pandora.android.PandoraService;
import com.pandora.android.activity.PandoraIntent;
import com.pandora.android.activity.PandoraIntentFilter;
import com.pandora.android.coachmark.CoachmarkBuilder;
import com.pandora.android.data.f;
import com.pandora.android.data.g;
import com.pandora.android.data.i;
import com.pandora.android.data.m;
import com.pandora.android.data.o;
import com.pandora.android.data.p;
import com.pandora.android.data.r;
import com.pandora.android.data.s;
import com.pandora.android.data.u;
import com.pandora.android.provider.b;
import com.pandora.radio.data.ac;
import com.pandora.radio.data.ad;
import com.pandora.radio.data.af;
import com.pandora.radio.data.ag;
import com.pandora.radio.data.ak;
import com.pandora.radio.data.y;
import com.pandora.radio.util.k;
import java.io.IOException;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;
import p.bz.aa;
import p.cw.c;
import p.cx.n;
import p.cx.q;
import p.cx.t;
import p.cx.v;
import p.dd.an;
import p.dd.ay;
import p.dd.ba;
import p.dd.bh;
import p.dd.bo;
import p.dd.bq;
import p.dd.br;
import p.dd.bs;
import p.dd.bt;
import p.df.a;
import p.dg.d;

// Referenced classes of package com.pandora.android.ads:
//            s, l, q, m, 
//            c, g, k

public class VideoAdManager extends BroadcastReceiver
{
    static class a extends com.pandora.android.ads.k
    {

        private final s a;

        public String[] a()
        {
            String as[] = super.a();
            ArrayList arraylist = new ArrayList();
            String as1[] = a.h();
            int j1 = as1.length;
            for (int i1 = 0; i1 < j1; i1++)
            {
                String s1 = as1[i1];
                if (!com.pandora.android.util.s.a(s1))
                {
                    arraylist.add(s1);
                }
            }

            if (as.length > 0)
            {
                arraylist.addAll(Arrays.asList(as));
            }
            return (String[])arraylist.toArray(new String[arraylist.size()]);
        }

        public a(Map map, s s1)
        {
            super(map, new p[] {
                s1
            });
            a = s1;
        }
    }

    public static final class b extends Enum
    {

        public static final b a;
        public static final b b;
        public static final b c;
        public static final b d;
        public static final b e;
        public static final b f;
        public static final b g;
        public static final b h;
        public static final b i;
        public static final b j;
        public static final b k;
        public static final b l;
        public static final b m;
        public static final b n;
        private static final b o[];

        public static b valueOf(String s1)
        {
            return (b)Enum.valueOf(com/pandora/android/ads/VideoAdManager$b, s1);
        }

        public static b[] values()
        {
            return (b[])o.clone();
        }

        static 
        {
            a = new b("IMPRESSION", 0);
            b = new b("START", 1);
            c = new b("FIRST_QUARTILE", 2);
            d = new b("SECOND_QUARTILE", 3);
            e = new b("THIRD_QUARTILE", 4);
            f = new b("COMPLETE", 5);
            g = new b("RESUME", 6);
            h = new b("SKIP", 7);
            i = new b("PAUSE", 8);
            j = new b("UNPAUSE", 9);
            k = new b("MUTE", 10);
            l = new b("UNMUTE", 11);
            m = new b("MORE_INFO", 12);
            n = new b("ERROR", 13);
            o = (new b[] {
                a, b, c, d, e, f, g, h, i, j, 
                k, l, m, n
            });
        }

        private b(String s1, int i1)
        {
            super(s1, i1);
        }
    }

    public static class c extends com.pandora.radio.util.b
    {

        private static volatile VideoAdManager a = null;

        public static VideoAdManager a()
        {
            com/pandora/android/ads/VideoAdManager$c;
            JVM INSTR monitorenter ;
            VideoAdManager videoadmanager = a;
            if (com.pandora.android.ads.VideoAdManager.r())
            {
                throw new IllegalStateException("ViewAdManager is already shutdown, cannot re-initialize again.");
            }
            break MISSING_BLOCK_LABEL_29;
            Exception exception;
            exception;
            com/pandora/android/ads/VideoAdManager$c;
            JVM INSTR monitorexit ;
            throw exception;
            VideoAdManager videoadmanager1;
            if (a == null)
            {
                a = new VideoAdManager();
            }
            videoadmanager1 = a;
            com/pandora/android/ads/VideoAdManager$c;
            JVM INSTR monitorexit ;
            return videoadmanager1;
        }

        public static void b()
        {
            com/pandora/android/ads/VideoAdManager$c;
            JVM INSTR monitorenter ;
            VideoAdManager videoadmanager = a;
            if (videoadmanager == null)
            {
                break MISSING_BLOCK_LABEL_19;
            }
            videoadmanager.a();
            a = null;
            com/pandora/android/ads/VideoAdManager$c;
            JVM INSTR monitorexit ;
            return;
            Exception exception;
            exception;
            com/pandora/android/ads/VideoAdManager$c;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public static void c()
        {
            a();
        }


        public c()
        {
        }
    }


    private static volatile boolean b;
    protected int a;
    private y c;
    private int d;
    private v e;
    private s f;
    private boolean g;
    private boolean h;
    private boolean i;
    private int j;
    private int k;
    private long l;
    private final d m;
    private final ag n;
    private final p.cw.c o;
    private af p;
    private boolean q;
    private Activity r;
    private boolean s;
    private Map t;
    private ak u;
    private CoachmarkBuilder v;
    private long w;
    private com.pandora.android.ads.q x;
    private p.dg.i y;

    protected VideoAdManager()
    {
        d = 1;
        j = 840;
        k = 180;
        s = false;
        a = 0;
        com.pandora.android.provider.b b1 = com.pandora.android.provider.b.a;
        l = System.currentTimeMillis();
        o = b1.b();
        o.b(this);
        b1.e().c(this);
        m = o.i();
        n = o.k();
        PandoraIntentFilter pandoraintentfilter = new PandoraIntentFilter();
        pandoraintentfilter.a("disable_video_ads_until_next_station_change");
        i = false;
        b1.C().a(this, pandoraintentfilter);
        e = b();
        b = false;
    }

    private void a(int i1)
    {
        j = i1;
    }

    private void a(s s1, String s2)
    {
        n.a((new Date()).getTime());
        a(s1);
        p.df.a.c("VIDEO AD", "videoad is a house ad.  not playing it");
        b(s2, null, null);
    }

    private void a(s s1, boolean flag)
    {
        boolean flag2 = true;
        n.a((new Date()).getTime());
        c(true);
        HashMap hashmap = s1.u();
        boolean flag1 = flag2;
        if (!com.pandora.android.provider.b.a.b().d().m())
        {
            if (s1.a("dontResumeMusicPlayback"))
            {
                flag1 = flag2;
            } else
            {
                flag1 = false;
            }
        }
        hashmap.put("wasTrackPlaying", Boolean.valueOf(flag1));
        i = false;
        o.d().b(p.cw.b.c.b);
        if (!flag && !(s1 instanceof r))
        {
            p.df.a.c("VIDEO AD", "Discarding audio ads as we're about to play a video");
            o.d().a(ac.b);
            p.df.a.c("VIDEO AD", "Discarding artist message tracks, we're about to play a video");
            o.d().a(ac.c);
        }
    }

    private boolean a(y y1, boolean flag)
    {
        if (f == null)
        {
            p.df.a.c("VIDEO AD", "not playing video ad because we don't have one");
        } else
        {
            if (com.pandora.android.provider.b.a.c().i())
            {
                p.df.a.c("VIDEO AD", "not playing video ad because we are casting");
                return false;
            }
            if (p == null)
            {
                p.df.a.c("VIDEO AD", "not playing video ad because we no UserData");
                return false;
            }
            if (!p.a())
            {
                p.df.a.c("VIDEO AD", "not playing video ad because we are not ad supported");
                return false;
            }
            if (y1 != null && y1.q())
            {
                p.df.a.c("VIDEO AD", "not playing video ad because the station suppresses video ads");
                return false;
            }
            if (g)
            {
                p.df.a.c("VIDEO AD", "not playing video ad because the station station sponsorship suppresses video ads");
                return false;
            }
            if (f.i_())
            {
                p.df.a.c("VIDEO AD", "not playing video ad because it is expired");
                return false;
            }
            if (!com.pandora.android.activity.c.a().b())
            {
                p.df.a.c("VIDEO AD", "not playing video ad because the ui isn't visible");
                return false;
            }
            if (!com.pandora.android.provider.b.a.n())
            {
                p.df.a.c("VIDEO AD", "not playing video ad because an accessory is connected");
                return false;
            }
            if (!m.b())
            {
                if ((f instanceof u) && !com.pandora.android.ads.s.b.a().b())
                {
                    com.pandora.android.ads.s.b.a().a();
                    p.df.a.c("VIDEO AD", "not playing video ad because video ad is a Yume ad, but not ready to play yet");
                    return false;
                }
                if (!flag && !o.d().W())
                {
                    p.df.a.c("VIDEO AD", "not playing video ad because we are out of skips");
                    return false;
                }
                if (PandoraService.c())
                {
                    p.df.a.c("VIDEO AD", "playing video ad because because its test time");
                    return true;
                }
                long l1 = l;
                long l2 = k * 1000;
                if (System.currentTimeMillis() < l1 + l2)
                {
                    p.df.a.c("VIDEO AD", (new StringBuilder()).append("not playing video ad because the app has only been open for ").append(System.currentTimeMillis() - l).append("ms.  It needs to be open for ").append(k * 1000).append("ms before we can play a video").toString());
                    return false;
                }
                if ((new Date()).getTime() - n.p() < (long)(j * 1000))
                {
                    p.df.a.c("VIDEO AD", (new StringBuilder()).append("not playing video ad because we played one within the last ").append(j * 1000).append("ms").toString());
                    return false;
                } else
                {
                    return true;
                }
            }
        }
        return false;
    }

    public static g b(String s1)
        throws l
    {
        p.df.a.c("VIDEO AD", "requestAdFromDART(String adUrl)");
        try
        {
            s1 = com.pandora.android.provider.b.a.b().p().b(s1);
            com.pandora.android.provider.b.a.b().o().d();
            if (com.pandora.android.util.s.a(s1))
            {
                throw new l("failed to fetch a videoad from DART - got an empty response from DART");
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            throw new l(s1);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            throw new l(s1);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            throw new l(s1);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            throw new l(s1);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            throw new l(s1);
        }
        s1 = com.pandora.android.data.f.a(s1);
        if (Integer.parseInt((String)s1.get("version")) < 2)
        {
            throw new l("failed to fetch a videoad from DART - got an old video ad creative version");
        }
        s1 = new g(s1);
        return s1;
    }

    private void b(int i1)
    {
        k = i1;
    }

    public static String c(s s1)
    {
        if (s1 instanceof i)
        {
            return "autoplay";
        }
        if (s1 instanceof m)
        {
            return "p1preroll";
        }
        if (s1 instanceof o)
        {
            return "taptovideo";
        } else
        {
            return null;
        }
    }

    static boolean r()
    {
        return b;
    }

    private void s()
    {
        if (e != null)
        {
            try
            {
                e.a();
            }
            catch (Exception exception) { }
            e = null;
        }
    }

    private void t()
    {
        if (o.d().e())
        {
            d = d + 1;
        }
    }

    private boolean u()
    {
        if (v == null)
        {
            return false;
        }
        if (System.currentTimeMillis() - w > 0x927c0L)
        {
            v();
            p();
            return false;
        } else
        {
            return true;
        }
    }

    private void v()
    {
        v = null;
        w = 0L;
    }

    public void a()
    {
        s();
        o.c(this);
        com.pandora.android.provider.b.a.e().b(this);
        b = true;
    }

    public void a(Activity activity)
    {
        if (l() || activity == null)
        {
            r = activity;
        }
    }

    public void a(MediaPlayer mediaplayer, int i1, int j1, int k1)
    {
        if (x == null)
        {
            x = new com.pandora.android.ads.q(mediaplayer, i1, j1, k1);
            return;
        } else
        {
            x.a(i1, j1, k1);
            return;
        }
    }

    public void a(r r1)
    {
        if (r1 == null)
        {
            throw new IllegalStateException("Failed creating coachmark, no video adata");
        }
        String s1;
        if (c == null)
        {
            s1 = "";
        } else
        {
            s1 = c.h();
        }
        v = com.pandora.android.util.q.a(r1.c(), com.pandora.android.provider.c.a(r1), s1, u.d());
        w = System.currentTimeMillis();
    }

    protected void a(s s1)
    {
        a(s1, com.pandora.android.ads.b.a);
    }

    public void a(s s1, b b1)
    {
        if (s1 != null) goto _L2; else goto _L1
_L1:
        p.df.a.c("VIDEO AD", "pingTracker : null videoAdData");
_L18:
        return;
_L2:
        Object obj = null;
        static class _cls3
        {

            static final int a[];
            static final int b[];
            static final int c[];
            static final int d[];

            static 
            {
                d = new int[p.bz.g.a.values().length];
                try
                {
                    d[p.bz.g.a.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror23) { }
                try
                {
                    d[p.bz.g.a.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror22) { }
                c = new int[p.cx.e.a.values().length];
                try
                {
                    c[p.cx.e.a.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror21) { }
                try
                {
                    c[p.cx.e.a.c.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror20) { }
                try
                {
                    c[p.cx.e.a.d.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror19) { }
                try
                {
                    c[p.cx.e.a.b.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror18) { }
                b = new int[p.dd.bh.a.values().length];
                try
                {
                    b[p.dd.bh.a.b.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror17) { }
                try
                {
                    b[p.dd.bh.a.c.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror16) { }
                try
                {
                    b[p.dd.bh.a.d.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror15) { }
                try
                {
                    b[p.dd.bh.a.e.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror14) { }
                try
                {
                    b[p.dd.bh.a.a.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror13) { }
                a = new int[b.values().length];
                try
                {
                    a[com.pandora.android.ads.b.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror12) { }
                try
                {
                    a[com.pandora.android.ads.b.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror11) { }
                try
                {
                    a[com.pandora.android.ads.b.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror10) { }
                try
                {
                    a[com.pandora.android.ads.b.d.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                try
                {
                    a[b.e.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    a[com.pandora.android.ads.b.f.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    a[b.h.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    a[com.pandora.android.ads.b.i.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    a[com.pandora.android.ads.b.j.ordinal()] = 9;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[com.pandora.android.ads.b.k.ordinal()] = 10;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[b.l.ordinal()] = 11;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[com.pandora.android.ads.b.m.ordinal()] = 12;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.pandora.android.ads.b.n.ordinal()] = 13;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        com.pandora.android.ads._cls3.a[b1.ordinal()];
        JVM INSTR tableswitch 1 13: default 88
    //                   1 145
    //                   2 168
    //                   3 183
    //                   4 198
    //                   5 213
    //                   6 228
    //                   7 243
    //                   8 258
    //                   9 273
    //                   10 288
    //                   11 303
    //                   12 318
    //                   13 333;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16
_L16:
        break MISSING_BLOCK_LABEL_333;
_L4:
        break; /* Loop/switch isn't completed */
_L3:
        p.df.a.c("VIDEO AD", (new StringBuilder()).append("pingTracker : Unknown Tracking type ").append(b1).toString());
_L19:
        if (obj != null)
        {
            a(((ad) (obj)));
            if (b1 == com.pandora.android.ads.b.a)
            {
                s1.S();
                if (!s1.h_())
                {
                    t();
                    return;
                }
            }
        }
        if (true) goto _L18; else goto _L17
_L17:
        if (!s1.R())
        {
            obj = new a(t, s1);
        }
          goto _L19
_L5:
        obj = new ad(s1.E());
          goto _L19
_L6:
        obj = new ad(s1.i());
          goto _L19
_L7:
        obj = new ad(s1.j());
          goto _L19
_L8:
        obj = new ad(s1.k());
          goto _L19
_L9:
        obj = new ad(s1.l());
          goto _L19
_L10:
        obj = new ad(s1.C());
          goto _L19
_L11:
        obj = new ad(s1.y());
          goto _L19
_L12:
        obj = new ad(s1.z());
          goto _L19
_L13:
        obj = new ad(s1.A());
          goto _L19
_L14:
        obj = new ad(s1.B());
          goto _L19
_L15:
        obj = new ad(s1.F());
          goto _L19
        obj = new ad(s1.D());
          goto _L19
    }

    protected void a(ad ad1)
    {
        (new p.di.a()).execute(new ad[] {
            ad1
        });
    }

    public void a(String s1)
    {
        s1 = (s)com.pandora.android.provider.c.a(s1);
        a(((s) (s1)));
        b(s1);
        com.pandora.android.provider.b.a.b().d().b(p.cw.b.c.b);
    }

    public void a(String s1, aa aa1)
    {
        a(s1, aa1, ((Bundle) (null)));
    }

    public void a(String s1, aa aa1, Bundle bundle)
    {
        b(s1, aa1, bundle);
        if (m.h())
        {
            m.g();
        }
    }

    protected void a(boolean flag)
    {
        g = flag;
    }

    public boolean a(Activity activity, y y1)
    {
        return a(activity, y1, false);
    }

    public boolean a(Activity activity, y y1, boolean flag)
    {
        if (m.b())
        {
            return false;
        }
        com.pandora.android.util.b.a().a(activity);
        if (y1 != null)
        {
            a(false);
            flag = true;
        } else
        {
            y1 = c;
            flag = false;
        }
        if (a(y1, flag))
        {
            h = flag;
            f.u().put("playAfterVideo", Boolean.valueOf(true));
            return a(com.pandora.android.provider.c.a(f), flag);
        }
        if (f instanceof u)
        {
            ((u)f).H();
        }
        com.pandora.android.util.b.a().a(null);
        return false;
    }

    public boolean a(String s1, boolean flag)
    {
        boolean flag1 = true;
        s s2 = (s)com.pandora.android.provider.c.a(s1);
        p.df.a.c("VIDEO AD", "about to play videoad");
        if (s2 == null)
        {
            p.df.a.c("VIDEO AD", "videoAdData is null, so not playing any video ad now");
            return false;
        }
        j j1 = com.pandora.android.provider.b.a.C();
        if (s2 instanceof u)
        {
            if (com.pandora.android.ads.s.b.a().b())
            {
                a(s2, flag);
                a(s2);
                com.pandora.android.ads.s.b.a().a(s1);
                s1 = new PandoraIntent("show_yume_video");
                s1.putExtra("show_yume_video", s2);
                j1.a(s1);
                flag = flag1;
            } else
            {
                p.df.a.c("VIDEO AD", "video ad is a Yume ad, but not ready to play yet");
                com.pandora.android.ads.s.b.a().a();
                flag = false;
            }
        } else
        if (s2 instanceof com.pandora.android.data.k)
        {
            a(s2, s1);
            flag = false;
        } else
        if (s2 instanceof com.pandora.android.data.b)
        {
            a(s2, flag);
            a(s2);
            com.pandora.android.util.b.a().a(s1);
            flag = flag1;
        } else
        if ((s2 instanceof i) || (s2 instanceof m) || (s2 instanceof o))
        {
            a(s2, flag);
            com.pandora.android.util.s.k();
            PandoraIntent pandoraintent = new PandoraIntent("SHOW_VIDEOAD");
            pandoraintent.putExtra("intent_video_ad_data_id", s1);
            j1.a(pandoraintent);
            flag = flag1;
        } else
        {
            flag = false;
        }
        if (!(s2 instanceof com.pandora.android.data.b))
        {
            com.pandora.android.util.b.a().a(null);
        }
        return flag;
    }

    protected v b()
    {
        v v1 = new v();
        v1.a(c());
        return v1;
    }

    protected void b(s s1)
    {
        if (s1 != null && !com.pandora.android.util.s.a(s1.x()))
        {
            p.df.a.c("VIDEO AD", "setting followon banner data");
            String s3 = c(s1);
            String s2;
            if (s1.v())
            {
                s2 = "vast";
            } else
            {
                s2 = "nonvast";
            }
            s1 = new com.pandora.android.ads.m(s1.x(), null, 50, s2, s1.c(), s3, s1.n());
            com.pandora.android.ads.c.b().a(s1);
            s1 = new PandoraIntent("handle_listener_interaction");
            s1.putExtra("intent_interaction_name", "video follow on");
            com.pandora.android.provider.b.a.C().a(s1);
        }
    }

    protected void b(String s1, aa aa1, Bundle bundle)
    {
        this;
        JVM INSTR monitorenter ;
        s s2 = (s)com.pandora.android.provider.c.a(s1);
        if (s2 != null) goto _L2; else goto _L1
_L1:
        p.df.a.c("VIDEO AD", "handleVideoAdClose: videoAdData == null!");
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        p.df.a.a("VIDEO AD", (new StringBuilder()).append("handleVideoAdClose - removing  videoAdDataId: ").append(s1).toString());
        com.pandora.android.provider.c.b(s1);
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (!s2.I())
        {
            break MISSING_BLOCK_LABEL_119;
        }
        p.df.a.c("VIDEO AD", "handleVideoAdClose: videoAdData already discarded!");
        if (s1 == null) goto _L4; else goto _L3
_L3:
        p.df.a.a("VIDEO AD", (new StringBuilder()).append("handleVideoAdClose - removing  videoAdDataId: ").append(s1).toString());
        com.pandora.android.provider.c.b(s1);
          goto _L4
        s1;
        throw s1;
        c(false);
        if (aa1 == null) goto _L6; else goto _L5
_L5:
        com.pandora.android.provider.b.a.e().a(aa1);
        if (s2.G())
        {
            s2.H();
        }
        if (bundle == null) goto _L8; else goto _L7
_L7:
        if (!bundle.containsKey("intent_followon_action")) goto _L8; else goto _L9
_L9:
        aa1 = new Intent(bundle.getString("intent_followon_action"));
        aa1.putExtras(bundle);
        com.pandora.android.provider.b.a.C().a(aa1);
_L14:
        if (!i) goto _L11; else goto _L10
_L10:
        o.d().b(p.cw.b.c.b);
        i = false;
_L16:
        if (s1 == null) goto _L4; else goto _L12
_L12:
        p.df.a.a("VIDEO AD", (new StringBuilder()).append("handleVideoAdClose - removing  videoAdDataId: ").append(s1).toString());
        com.pandora.android.provider.c.b(s1);
          goto _L4
_L6:
        aa1 = new aa(s2);
          goto _L5
        aa1;
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_309;
        }
        p.df.a.a("VIDEO AD", (new StringBuilder()).append("handleVideoAdClose - removing  videoAdDataId: ").append(s1).toString());
        com.pandora.android.provider.c.b(s1);
        throw aa1;
_L8:
        if (c == null) goto _L14; else goto _L13
_L13:
        aa1 = new PandoraIntent("show_now_playing");
        if (bundle == null)
        {
            break MISSING_BLOCK_LABEL_339;
        }
        aa1.putExtras(bundle);
        com.pandora.android.provider.b.a.C().a(aa1);
          goto _L14
_L11:
        boolean flag;
        boolean flag1;
        flag = s2.a("wasTrackPlaying");
        flag1 = s2.a("playAfterVideo");
        if (s2.a("dontResumeMusicPlayback") || !flag && !flag1) goto _L16; else goto _L15
_L15:
        com.pandora.android.provider.b.a.b().d().a(p.cw.b.c.b);
          goto _L16
    }

    public void b(String s1, boolean flag)
    {
        if (y == null)
        {
            y = new p.dg.i(com.pandora.android.provider.b.a.b());
        }
        y.a(s1, null, com.pandora.android.provider.b.a.h(), new Runnable(flag) {

            final boolean a;
            final VideoAdManager b;

            public void run()
            {
                if (a)
                {
                    com.pandora.android.provider.b.a.b().d().a(p.cw.b.c.b);
                }
            }

            
            {
                b = VideoAdManager.this;
                a = flag;
                super();
            }
        });
    }

    protected void b(boolean flag)
    {
        h = flag;
    }

    protected p.cx.v.a c()
    {
        return new p.cx.v.a() {

            final VideoAdManager a;

            public void a(p.cx.g g1)
            {
                a.d();
            }

            
            {
                a = VideoAdManager.this;
                super();
            }
        };
    }

    protected void c(boolean flag)
    {
        q = flag;
        if (!flag)
        {
            r = null;
        }
    }

    public Object clone()
        throws CloneNotSupportedException
    {
        throw new CloneNotSupportedException();
    }

    protected void d()
    {
        if (e != null)
        {
            if (p == null)
            {
                f = null;
                return;
            }
            if (!p.a())
            {
                f = null;
                return;
            }
            if (!com.pandora.android.provider.b.a.n())
            {
                f = null;
                return;
            }
            if (f != null && f.I())
            {
                p.df.a.c("VIDEO AD", "video ad has been discarded");
                f = null;
                return;
            }
            if (f != null && f.i_())
            {
                p.df.a.c("VIDEO AD", "clearing the video ad because it's expired");
                f = null;
            }
            if (s && !(f instanceof com.pandora.android.data.k))
            {
                f = null;
            }
            if (f != null)
            {
                f.a(true);
                return;
            }
            if ((o.d().o() || o.d().p()) && c != null && o.d().A())
            {
                long l2;
                try
                {
                    com.pandora.android.data.i.a();
                    p.df.a.c("VIDEO AD", "need to fetch a video ad");
                    f = f();
                    if (f != null)
                    {
                        f.a(true);
                    }
                    a = 0;
                    return;
                }
                catch (l l1)
                {
                    l2 = e();
                    p.df.a.e("VIDEO AD", String.format(Locale.US, "Got a VideoAdException. Will wait %d minute(s) before trying again", new Object[] {
                        Long.valueOf(l2 / 60L / 1000L)
                    }), l1);
                    a = a + 1;
                    f = null;
                }
                try
                {
                    Thread.sleep(l2);
                    return;
                }
                catch (InterruptedException interruptedexception)
                {
                    return;
                }
            }
        }
    }

    protected long e()
    {
        return (long)Math.min(Math.pow(2D, a), 60D) * 60L * 1000L;
    }

    protected s f()
        throws l
    {
        s s1 = g();
        if (s1 != null && !s1.i_())
        {
            p.df.a.c("VIDEO AD", (new StringBuilder()).append("DART returned video ad of type: ").append(s1.getClass().getSimpleName()).toString());
            return s1;
        } else
        {
            return null;
        }
    }

    protected s g()
        throws l
    {
        Object obj = h();
        if (((g) (obj)).E())
        {
            return new com.pandora.android.data.b(((g) (obj)));
        }
        if (((g) (obj)).D())
        {
            obj = new u(((g) (obj)));
            com.pandora.android.ads.s.b.a().a(((u) (obj)));
            return ((s) (obj));
        }
        if (com.pandora.android.util.s.a(((g) (obj)).d()))
        {
            return new com.pandora.android.data.k(((g) (obj)));
        }
        try
        {
            obj = new i(((g) (obj)));
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            return null;
        }
        return ((s) (obj));
    }

    protected g h()
        throws l
    {
        if (p == null)
        {
            throw new l("failed to fetch a videoad from DART - user data is null");
        }
        String s2 = p.s();
        String s1 = s2;
        if (s2 != null)
        {
            if (com.pandora.android.provider.b.a.b().d().e())
            {
                s1 = s2.replaceAll("__INDEX__", String.valueOf(k()));
            } else
            {
                s1 = s2.replaceAll("__INDEX__", "");
            }
        }
        return b(s1);
    }

    public boolean i()
    {
        return h;
    }

    public void j()
    {
        b(0);
        a(0);
    }

    public int k()
    {
        return d;
    }

    public boolean l()
    {
        if (!com.pandora.android.provider.b.a.n())
        {
            return false;
        } else
        {
            return q;
        }
    }

    public Activity m()
    {
        return r;
    }

    public ak n()
    {
        return u;
    }

    public com.pandora.android.ads.q o()
    {
        return x;
    }

    public void onApplicationFocusChanged(p.bz.d d1)
    {
        if (d1.b != p.bz.d.a.b)
        {
            p.df.a.a("VideoAdManager", (new StringBuilder()).append("onApplicationFocusChanged: foreground = true; activity = ").append(d1.a).toString());
            if (u())
            {
                d1 = new PandoraIntent("show_coachmark");
                d1.putExtra("intent_coachmark_builder", v);
                com.pandora.android.provider.b.a.C().a(d1);
                return;
            }
        }
    }

    public void onCoachmarkVisibility(p.bz.g g1)
    {
        if (g1.c.e() == com.pandora.android.coachmark.e.e.w)
        {
            com.pandora.radio.data.b b1 = g1.c.f();
            String s1 = (String)g1.c.f("stationId");
            r r1 = (r)com.pandora.android.provider.c.a((String)g1.c.f("videoAdDataUUID"));
            v();
            switch (com.pandora.android.ads._cls3.d[g1.a.ordinal()])
            {
            default:
                throw new IllegalArgumentException((new StringBuilder()).append("Unknown Coachmark Visibility Type : ").append(g1.a).toString());

            case 1: // '\001'
                o.o().a(com.pandora.radio.util.k.p.x, b1, -1, -1, false, s1, true, r1.t(), r1.n());
                p.df.a.a("VideoAdManager", (new StringBuilder()).append("SL_RESUME_VIDEO Coachmark SHOWN: ").append(b1).toString());
                return;

            case 2: // '\002'
                break;
            }
            if (g1.b != com.pandora.android.coachmark.e.d.e)
            {
                q();
                com.pandora.android.provider.c.b((String)g1.c.f("videoAdDataUUID"));
                p();
                o.o().a(com.pandora.radio.util.k.p.y, b1, -1, -1, false, s1, true, r1.t(), r1.n());
                p.df.a.a("VideoAdManager", (new StringBuilder()).append("SL_RESUME_VIDEO Coachmark DISMISSED: ").append(b1).toString());
                return;
            }
        }
    }

    public void onReceive(Context context, Intent intent)
    {
        if (intent.getAction().equals(PandoraIntent.a("disable_video_ads_until_next_station_change")))
        {
            a(true);
        }
    }

    public void onSignInState(an an1)
    {
        p = an1.a;
        switch (com.pandora.android.ads._cls3.c[an1.b.ordinal()])
        {
        default:
            throw new InvalidParameterException((new StringBuilder()).append("onSignInState called with unknown signInState: ").append(an1.b).toString());

        case 1: // '\001'
            com.pandora.android.data.i.a();
            // fall through

        case 2: // '\002'
        case 3: // '\003'
            return;

        case 4: // '\004'
            com.pandora.android.data.i.a();
            break;
        }
    }

    public void onSleepTimerEnd(p.bz.q q1)
    {
        i = true;
    }

    public void onStationStateChange(ay ay1)
    {
        c = ay1.a;
        if (ay1.b == p.dd.ay.a.b || ay1.b == p.dd.ay.a.a)
        {
            b(false);
            a(false);
        }
    }

    public void onThirdPartyTrackingUrls(ba ba1)
    {
        t = ba1.a;
    }

    public void onTrackStateEvent(bh bh1)
    {
        switch (com.pandora.android.ads._cls3.b[bh1.a.ordinal()])
        {
        default:
            throw new InvalidParameterException((new StringBuilder()).append("onTrackStateEvent called with unknown Track state: ").append(bh1.a).toString());

        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
            break;

        case 1: // '\001'
            if (bh1.b.M())
            {
                v();
                p();
            }
            break;
        }
    }

    public void onUserData(bo bo1)
    {
        if (bo1.a == null)
        {
            return;
        } else
        {
            p = bo1.a;
            return;
        }
    }

    public void onValueExchangeRewardEvent(bq bq1)
    {
        s = bq1.a();
    }

    public void onVideoAdRefreshIntervalChange(br br1)
    {
        a(br1.a);
    }

    public void onVideoAdStartInterval(bs bs1)
    {
        b(bs1.a);
    }

    public void onVideoProgressEnforcementConfig(bt bt1)
    {
        u = bt1.a;
    }

    public void p()
    {
        if (x != null)
        {
            x.e();
        }
        x = null;
    }

    public void q()
    {
        if (y != null)
        {
            y.b();
        }
        y = null;
    }
}
