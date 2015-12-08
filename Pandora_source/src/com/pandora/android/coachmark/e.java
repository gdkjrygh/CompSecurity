// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.coachmark;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.crashlytics.android.d;
import com.pandora.android.activity.BaseFragmentActivity;
import com.pandora.android.provider.b;
import com.pandora.android.util.a;
import com.pandora.radio.data.aa;
import com.pandora.radio.data.ag;
import com.pandora.radio.util.i;
import com.pandora.radio.util.k;
import java.util.Calendar;
import java.util.Locale;
import p.bz.g;
import p.cw.c;
import p.dd.bh;

// Referenced classes of package com.pandora.android.coachmark:
//            CoachmarkLayout, CoachmarkBuilder

public class com.pandora.android.coachmark.e
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        public static final a e;
        public static final a f;
        public static final a g;
        public static final a h;
        private static final a j[];
        public final String i;

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/pandora/android/coachmark/e$a, s);
        }

        public static a[] values()
        {
            return (a[])j.clone();
        }

        static 
        {
            a = new a("ONBOARDING", 0);
            b = new a("STATION_PERSONALIZATION_TEACHING", 1);
            c = new a("STATION_PERSONALIZATION_REWARD", 2);
            d = new a("CASTING", 3);
            e = new a("UPSELL", 4);
            f = new a("ARTIST_MESSAGE", 5);
            g = new a("TRAFFIC_DRIVER_PARTNERSHIP", 6);
            h = new a("SPONSORED_LISTENING", 7);
            j = (new a[] {
                a, b, c, d, e, f, g, h
            });
        }

        private a(String s, int l)
        {
            super(s, l);
            i = name().toLowerCase(Locale.US);
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
        private static final b g[];

        public static b valueOf(String s)
        {
            return (b)Enum.valueOf(com/pandora/android/coachmark/e$b, s);
        }

        public static b[] values()
        {
            return (b[])g.clone();
        }

        static 
        {
            a = new b("NO_LIMIT", 0);
            b = new b("ONCE", 1);
            c = new b("ONCE_PER_DAY", 2);
            d = new b("ONCE_PER_WEEK", 3);
            e = new b("ONCE_PER_TWO_WEEKS", 4);
            f = new b("ONCE_PER_MONTH", 5);
            g = (new b[] {
                a, b, c, d, e, f
            });
        }

        private b(String s, int l)
        {
            super(s, l);
        }
    }

    private class c
        implements android.view.ViewTreeObserver.OnGlobalLayoutListener
    {

        final com.pandora.android.coachmark.e a;
        private final CoachmarkBuilder b;

        public void onGlobalLayout()
        {
            View view = b.a().findViewById(0x1020002);
            if (android.os.Build.VERSION.SDK_INT < 16)
            {
                view.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            } else
            {
                view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
            com.pandora.android.coachmark.e.a(a, b);
        }

        public c(CoachmarkBuilder coachmarkbuilder)
        {
            a = com.pandora.android.coachmark.e.this;
            super();
            b = coachmarkbuilder;
        }
    }

    public static final class d extends Enum
    {

        public static final d a;
        public static final d b;
        public static final d c;
        public static final d d;
        public static final d e;
        public static final d f;
        private static final d h[];
        public final String g;

        public static d valueOf(String s)
        {
            return (d)Enum.valueOf(com/pandora/android/coachmark/e$d, s);
        }

        public static d[] values()
        {
            return (d[])h.clone();
        }

        static 
        {
            a = new d("TIMEOUT", 0);
            b = new d("BACKGROUND", 1);
            c = new d("PRESS_BACK", 2);
            d = new d("TOUCH", 3);
            e = new d("CLICK_THROUGH_ACTION_CLICKED", 4);
            f = new d("DISABLED", 5);
            h = (new d[] {
                a, b, c, d, e, f
            });
        }

        private d(String s, int l)
        {
            super(s, l);
            g = name().toLowerCase(Locale.US);
        }
    }

    public static final class e extends Enum
    {

        private static final e A[];
        public static final e a;
        public static final e b;
        public static final e c;
        public static final e d;
        public static final e e;
        public static final e f;
        public static final e g;
        public static final e h;
        public static final e i;
        public static final e j;
        public static final e k;
        public static final e l;
        public static final e m;
        public static final e n;
        public static final e o;
        public static final e p;
        public static final e q;
        public static final e r;
        public static final e s;
        public static final e t;
        public static final e u;
        public static final e v;
        public static final e w;
        public static final e x;
        public final String y;
        public final a z;

        public static e valueOf(String s1)
        {
            return (e)Enum.valueOf(com/pandora/android/coachmark/e$e, s1);
        }

        public static e[] values()
        {
            return (e[])A.clone();
        }

        static 
        {
            a = new e("THUMBS", 0, "thumbs", com.pandora.android.coachmark.a.a);
            b = new e("THUMB_UP", 1, "thumb_up", com.pandora.android.coachmark.a.a);
            c = new e("THUMB_DOWN", 2, "thumb_down", com.pandora.android.coachmark.a.a);
            d = new e("STATION_LIST", 3, "station_list", com.pandora.android.coachmark.a.a);
            e = new e("MIN_SKIPS", 4, "min_skips", com.pandora.android.coachmark.a.a);
            f = new e("SP_METER", 5, "meter", com.pandora.android.coachmark.a.b);
            g = new e("SP_STATION_CREATED", 6, "existing_user_first_time_now_playing", com.pandora.android.coachmark.a.b);
            h = new e("SP_FIRST_THUMB_UP", 7, "existing_user_1st_thumb_up", com.pandora.android.coachmark.a.b);
            i = new e("SP_FIRST_THUMB_DOWN", 8, "existing_user_thumb_down", com.pandora.android.coachmark.a.b);
            j = new e("SP_TOTAL_THUMBS_5", 9, "existing_user_5th_thumb_up", com.pandora.android.coachmark.a.b);
            k = new e("SP_TOTAL_THUMBS_10", 10, "existing_user_10th_thumb_up", com.pandora.android.coachmark.a.b);
            l = new e("SP_TOTAL_THUMBS_20", 11, "existing_user_20th_thumb_up", com.pandora.android.coachmark.a.b);
            m = new e("SP_VARIETY_ADDED", 12, "existing_user_add_variety", com.pandora.android.coachmark.a.b);
            n = new e("SP_AD_DISMISSED", 13, "now_playing_pandora_one_upsell_on_dismissal", a.e);
            o = new e("SP_AD_DISMISSED_TRIAL", 14, "now_playing_free_trial_on_dismissal", a.e);
            p = new e("ARTIST_AUDIO_MESSAGE", 15, "artist_message_follow_on_coachmark", a.f);
            q = new e("STATION_NOT_FOUND_MESSAGE", 16, "station_not_found_coachmark", com.pandora.android.coachmark.a.g);
            r = new e("CASTING_AVAILABLE", 17, "casting_available", com.pandora.android.coachmark.a.d);
            s = new e("P1_ALACARTE_PROMOTION", 18, "mdp_promotion", a.e);
            t = new e("P1_ALACARTE_WELCOME", 19, "mdp_welcome", a.e);
            u = new e("P1_ALACARTE_UPGRADE", 20, "mdp_expiration_upgrade", a.e);
            v = new e("P1_ALACARTE_FREE_TRIAL", 21, "mdp_expiration_free_trial", a.e);
            w = new e("SL_RESUME_VIDEO", 22, "sponsored_listening_resume_video", a.h);
            x = new e("TEST", 23, "test", com.pandora.android.coachmark.a.a);
            A = (new e[] {
                a, b, c, d, e, f, g, h, i, j, 
                k, l, m, n, o, p, q, r, s, t, 
                u, v, w, x
            });
        }

        private e(String s1, int i1, String s2, a a1)
        {
            super(s1, i1);
            y = s2;
            z = a1;
        }
    }


    private static boolean g = true;
    private CoachmarkLayout a;
    private Activity b;
    private aa c;
    private Handler d;
    private Runnable e;
    private boolean f;

    public com.pandora.android.coachmark.e(Activity activity)
    {
        f = true;
        b = activity;
        d = new Handler(Looper.getMainLooper());
        com.pandora.android.provider.b.a.b().b(this);
        com.pandora.android.provider.b.a.e().c(this);
    }

    private static void a(Activity activity, CoachmarkLayout coachmarklayout)
    {
        if (coachmarklayout.getParent() == null)
        {
            ((ViewGroup)activity.getWindow().getDecorView()).addView(coachmarklayout);
        }
    }

    private void a(CoachmarkBuilder coachmarkbuilder, CoachmarkBuilder coachmarkbuilder1)
    {
        com.crashlytics.android.d.a(new IllegalStateException(String.format("Collision %s & %s", new Object[] {
            coachmarkbuilder.e(), coachmarkbuilder1.e()
        })));
    }

    static void a(com.pandora.android.coachmark.e e1, CoachmarkBuilder coachmarkbuilder)
    {
        e1.c(coachmarkbuilder);
    }

    public static void a(boolean flag)
    {
        g = flag;
    }

    public static boolean a(e e1, b b1)
    {
        long l;
        long l1;
        boolean flag;
        flag = true;
        l = com.pandora.android.provider.b.a.b().k().g(e1.name());
        l1 = System.currentTimeMillis() - l;
        static class _cls2
        {

            static final int a[];

            static 
            {
                a = new int[b.values().length];
                try
                {
                    a[com.pandora.android.coachmark.b.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    a[com.pandora.android.coachmark.b.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[com.pandora.android.coachmark.b.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[com.pandora.android.coachmark.b.d.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[b.e.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[b.f.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        com.pandora.android.coachmark._cls2.a[b1.ordinal()];
        JVM INSTR tableswitch 1 6: default 76
    //                   1 108
    //                   2 114
    //                   3 122
    //                   4 133
    //                   5 144
    //                   6 155;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        throw new IllegalArgumentException((new StringBuilder()).append("Frequency: ").append(b1).append(" is unknown.").toString());
_L2:
        flag = false;
_L9:
        return flag;
_L3:
        if (l == 0L)
        {
            return false;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (l1 >= 0x5265c00L)
        {
            return false;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        if (l1 >= 0x240c8400L)
        {
            return false;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        if (l1 >= 0x48190800L)
        {
            return false;
        }
        continue; /* Loop/switch isn't completed */
_L7:
        if (l1 >= 0x9a7ec800L)
        {
            return false;
        }
        if (true) goto _L9; else goto _L8
_L8:
    }

    private CoachmarkLayout b(CoachmarkBuilder coachmarkbuilder)
    {
        CoachmarkLayout coachmarklayout = new CoachmarkLayout(coachmarkbuilder);
        coachmarklayout.setId((int)System.currentTimeMillis());
        a(coachmarkbuilder.a(), coachmarklayout);
        return coachmarklayout;
    }

    private static void b(Activity activity, CoachmarkLayout coachmarklayout)
    {
        if (coachmarklayout != null && activity != null)
        {
            activity = activity.getWindow();
            if (activity != null)
            {
                ((ViewGroup)activity.getDecorView()).removeView(coachmarklayout);
                coachmarklayout.removeAllViews();
            }
        }
    }

    public static void b(e e1)
    {
        com.pandora.android.provider.b.a.b().k().f(e1.name());
    }

    private void c(CoachmarkBuilder coachmarkbuilder)
    {
        if (a == null)
        {
            a = b(coachmarkbuilder);
            a.b();
        } else
        {
            a(a.getBuilder(), coachmarkbuilder);
            a.a(coachmarkbuilder);
        }
        d(coachmarkbuilder);
    }

    private void d(CoachmarkBuilder coachmarkbuilder)
    {
        if (!coachmarkbuilder.b() && coachmarkbuilder.g)
        {
            com.pandora.android.provider.b.a.b().o().a(coachmarkbuilder.e().y, coachmarkbuilder.e().z.i, false, null);
        }
        com.pandora.android.provider.b.a.b().k().f(coachmarkbuilder.e().name());
    }

    private boolean e(CoachmarkBuilder coachmarkbuilder)
    {
        if (coachmarkbuilder.a() == null || coachmarkbuilder.a().isFinishing())
        {
            com.crashlytics.android.d.a(new IllegalStateException("Activity cannot be null or finishing!"));
            return false;
        }
        if (coachmarkbuilder.e() == null)
        {
            throw new IllegalStateException("CoachmarkManager.Type cannot be null!");
        }
        if (com.pandora.radio.util.i.a(coachmarkbuilder.k()) || com.pandora.radio.util.i.a(coachmarkbuilder.l()))
        {
            throw new IllegalStateException("HeaderText and MessageText must be specified!");
        } else
        {
            return true;
        }
    }

    public static boolean f()
    {
        p.cw.c c1 = com.pandora.android.provider.b.a.b();
        if (!com.pandora.android.util.a.a(p.dj.b.a.c))
        {
            return false;
        } else
        {
            return c1.k().D();
        }
    }

    private boolean f(CoachmarkBuilder coachmarkbuilder)
    {
        return a(coachmarkbuilder.e(), coachmarkbuilder.g());
    }

    public static boolean g()
    {
        if (!com.pandora.android.util.a.a(p.dj.b.a.c))
        {
            return true;
        }
        ag ag1 = com.pandora.android.provider.b.a.b().k();
        long l1 = ag1.B();
        if (l1 == -1L)
        {
            return true;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(l1);
        calendar.add(6, 2);
        if (Calendar.getInstance().after(calendar))
        {
            return true;
        }
        long al[] = new long[5];
        al[0] = ag1.g(com.pandora.android.coachmark.e.a.name());
        al[1] = ag1.g(com.pandora.android.coachmark.e.b.name());
        al[2] = ag1.g(com.pandora.android.coachmark.e.c.name());
        al[3] = ag1.g(e.e.name());
        al[4] = ag1.g(com.pandora.android.coachmark.e.d.name());
        int i1 = al.length;
        int l = 0;
        l1 = 0L;
        for (; l < i1; l++)
        {
            long l2 = al[l];
            if (l2 == 0L)
            {
                return false;
            }
            if (l1 < l2)
            {
                l1 = l2;
            }
        }

        return System.currentTimeMillis() - l1 > 0x5265c00L;
    }

    public static boolean i()
    {
        return g;
    }

    private void j()
    {
        if (a != null)
        {
            b(b, a);
            a = null;
        }
    }

    public void a()
    {
        f = true;
    }

    public void a(Configuration configuration, BaseFragmentActivity basefragmentactivity)
    {
        if (c())
        {
            configuration = h();
            if (c() && configuration != null)
            {
                configuration.a(basefragmentactivity);
                a(((CoachmarkBuilder) (configuration)), true, true);
                return;
            }
        }
    }

    public void a(Bundle bundle)
    {
        d.removeCallbacks(e);
        while (!c() || !c() || a.c()) 
        {
            return;
        }
        bundle.putParcelable("configuration", a.getBuilder());
    }

    public void a(Bundle bundle, BaseFragmentActivity basefragmentactivity)
    {
        bundle = (CoachmarkBuilder)bundle.getParcelable("configuration");
        if (bundle != null)
        {
            bundle.a(basefragmentactivity);
            e = new Runnable(bundle) {

                final CoachmarkBuilder a;
                final com.pandora.android.coachmark.e b;

                public void run()
                {
                    b.a(a, true, true);
                }

            
            {
                b = com.pandora.android.coachmark.e.this;
                a = coachmarkbuilder;
                super();
            }
            };
            d.postDelayed(e, 1000L);
        }
    }

    public boolean a(CoachmarkBuilder coachmarkbuilder)
    {
        return a(coachmarkbuilder, false, false);
    }

    public boolean a(CoachmarkBuilder coachmarkbuilder, boolean flag, boolean flag1)
    {
        if (i())
        {
            if (!f)
            {
                p.df.a.c("CoachmarkManager", "Not showing coachmark as they have been disabled.");
                return false;
            }
            coachmarkbuilder.a(b);
            coachmarkbuilder.a(flag1);
            if (e(coachmarkbuilder))
            {
                if (!flag)
                {
                    if (f(coachmarkbuilder))
                    {
                        p.df.a.c("CoachmarkManager", String.format("Not showing %s coachmark since its frequency limit has been exceeded.", new Object[] {
                            coachmarkbuilder.e()
                        }));
                        return false;
                    }
                    boolean flag2;
                    if (c != null && c.M())
                    {
                        flag2 = true;
                    } else
                    {
                        flag2 = false;
                    }
                    if (flag2)
                    {
                        p.df.a.c("CoachmarkManager", "Not showing coachmark since audio ad is playing.");
                        return false;
                    }
                    if (com.pandora.android.provider.b.a.F())
                    {
                        p.df.a.c("CoachmarkManager", "Not showing coachmark because video ad is playing.");
                        return false;
                    }
                }
                if (coachmarkbuilder.r())
                {
                    View view = b.findViewById(0x1020002);
                    if (view != null)
                    {
                        view.getViewTreeObserver().addOnGlobalLayoutListener(new c(coachmarkbuilder));
                    }
                } else
                {
                    c(coachmarkbuilder);
                }
                return true;
            }
        }
        return false;
    }

    public boolean a(e e1)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (a != null)
        {
            flag = flag1;
            if (a.getType() == e1)
            {
                flag = true;
            }
        }
        return flag;
    }

    public void b()
    {
        f = false;
        if (c())
        {
            Object obj = h();
            if (obj != null && ((CoachmarkBuilder) (obj)).e() != null)
            {
                obj = ((CoachmarkBuilder) (obj)).e();
                com.pandora.android.provider.b.a.b().o().a(((e) (obj)).y, ((e) (obj)).z.i, false, d.f.g);
            }
            a.a(d.f);
        }
    }

    public boolean c()
    {
        return a != null;
    }

    public void d()
    {
        d.removeCallbacks(e);
        j();
        b = null;
    }

    public boolean e()
    {
        boolean flag = false;
        if (a != null)
        {
            e e1 = a.getType();
            com.pandora.android.provider.b.a.b().o().a(e1.y, e1.z.i, false, com.pandora.android.coachmark.d.c.g);
            a.a(com.pandora.android.coachmark.d.c);
            flag = true;
        }
        return flag;
    }

    public CoachmarkBuilder h()
    {
        if (a == null)
        {
            return null;
        } else
        {
            return a.getBuilder();
        }
    }

    public void onCoachmarkVisibility(g g1)
    {
        if (g1.a == p.bz.g.a.b)
        {
            j();
        }
    }

    public void onTrackState(bh bh1)
    {
        c = bh1.b;
    }

}
