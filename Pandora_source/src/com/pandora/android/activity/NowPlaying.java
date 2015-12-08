// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.activity;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.content.j;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.pandora.android.ads.AdView;
import com.pandora.android.ads.VideoAdManager;
import com.pandora.android.ads.g;
import com.pandora.android.ads.h;
import com.pandora.android.coachmark.CoachmarkBuilder;
import com.pandora.android.countdown.CountdownBarLayout;
import com.pandora.android.countdown.a;
import com.pandora.android.iap.d;
import com.pandora.android.personalization.StationPersonalizationActivity;
import com.pandora.android.provider.b;
import com.pandora.android.util.af;
import com.pandora.android.util.q;
import com.pandora.android.util.s;
import com.pandora.android.view.MiniPlayerView;
import com.pandora.android.view.NowPlayingView;
import com.pandora.android.view.TrackView;
import com.pandora.radio.data.aa;
import com.pandora.radio.data.ac;
import com.pandora.radio.data.ag;
import com.pandora.radio.data.y;
import java.security.InvalidParameterException;
import p.bz.f;
import p.bz.w;
import p.ca.bd;
import p.cn.e;
import p.cw.c;
import p.dd.ap;
import p.dd.at;
import p.dd.au;
import p.dd.ay;
import p.dd.bb;
import p.dd.bf;
import p.dd.bh;
import p.dd.bu;
import p.dd.i;
import p.dg.n;

// Referenced classes of package com.pandora.android.activity:
//            BaseAdFragmentActivity, j, k, m, 
//            o, PandoraIntent, PandoraIntentFilter, a, 
//            c, CapHitActivity

public class NowPlaying extends BaseAdFragmentActivity
    implements com.pandora.android.activity.j, o.a, o.b, com.pandora.android.ads.c.a
{
    private class a
        implements Runnable
    {

        final NowPlaying a;
        private com.pandora.radio.util.k.a b;
        private BaseAdFragmentActivity c;

        public a a(com.pandora.radio.util.k.a a1)
        {
            b = a1;
            return this;
        }

        public void run()
        {
            if (b != null)
            {
                c.a(b);
            }
        }

        public a(BaseAdFragmentActivity baseadfragmentactivity)
        {
            a = NowPlaying.this;
            super();
            c = baseadfragmentactivity;
        }
    }

    static class b extends AdView
    {

        private com.pandora.android.coachmark.e i;
        private com.pandora.android.coachmark.CoachmarkLayout.a j;

        public void a()
        {
            super.a();
        }

        public void a(com.pandora.android.coachmark.e e1)
        {
            i = e1;
        }

        protected void a(com.pandora.radio.util.k.a a1)
        {
            if (a1 != null) goto _L2; else goto _L1
_L1:
            return;
_L2:
            static class _cls5
            {

                static final int a[];
                static final int b[];
                static final int c[];
                static final int d[];
                static final int e[];

                static 
                {
                    e = new int[com.pandora.android.coachmark.e.e.values().length];
                    try
                    {
                        e[com.pandora.android.coachmark.e.e.j.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror32) { }
                    try
                    {
                        e[com.pandora.android.coachmark.e.e.l.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror31) { }
                    try
                    {
                        e[com.pandora.android.coachmark.e.e.k.ordinal()] = 3;
                    }
                    catch (NoSuchFieldError nosuchfielderror30) { }
                    try
                    {
                        e[com.pandora.android.coachmark.e.e.n.ordinal()] = 4;
                    }
                    catch (NoSuchFieldError nosuchfielderror29) { }
                    try
                    {
                        e[com.pandora.android.coachmark.e.e.o.ordinal()] = 5;
                    }
                    catch (NoSuchFieldError nosuchfielderror28) { }
                    d = new int[com.pandora.radio.util.k.a.values().length];
                    try
                    {
                        d[com.pandora.radio.util.k.a.a.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror27) { }
                    try
                    {
                        d[com.pandora.radio.util.k.a.b.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror26) { }
                    try
                    {
                        d[com.pandora.radio.util.k.a.f.ordinal()] = 3;
                    }
                    catch (NoSuchFieldError nosuchfielderror25) { }
                    try
                    {
                        d[com.pandora.radio.util.k.a.e.ordinal()] = 4;
                    }
                    catch (NoSuchFieldError nosuchfielderror24) { }
                    try
                    {
                        d[com.pandora.radio.util.k.a.j.ordinal()] = 5;
                    }
                    catch (NoSuchFieldError nosuchfielderror23) { }
                    try
                    {
                        d[com.pandora.radio.util.k.a.i.ordinal()] = 6;
                    }
                    catch (NoSuchFieldError nosuchfielderror22) { }
                    try
                    {
                        d[com.pandora.radio.util.k.a.h.ordinal()] = 7;
                    }
                    catch (NoSuchFieldError nosuchfielderror21) { }
                    try
                    {
                        d[com.pandora.radio.util.k.a.g.ordinal()] = 8;
                    }
                    catch (NoSuchFieldError nosuchfielderror20) { }
                    try
                    {
                        d[com.pandora.radio.util.k.a.d.ordinal()] = 9;
                    }
                    catch (NoSuchFieldError nosuchfielderror19) { }
                    try
                    {
                        d[com.pandora.radio.util.k.a.c.ordinal()] = 10;
                    }
                    catch (NoSuchFieldError nosuchfielderror18) { }
                    try
                    {
                        d[com.pandora.radio.util.k.a.k.ordinal()] = 11;
                    }
                    catch (NoSuchFieldError nosuchfielderror17) { }
                    try
                    {
                        d[com.pandora.radio.util.k.a.l.ordinal()] = 12;
                    }
                    catch (NoSuchFieldError nosuchfielderror16) { }
                    c = new int[p.dd.ay.a.values().length];
                    try
                    {
                        c[p.dd.ay.a.a.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror15) { }
                    try
                    {
                        c[p.dd.ay.a.d.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror14) { }
                    try
                    {
                        c[p.dd.ay.a.b.ordinal()] = 3;
                    }
                    catch (NoSuchFieldError nosuchfielderror13) { }
                    try
                    {
                        c[p.dd.ay.a.c.ordinal()] = 4;
                    }
                    catch (NoSuchFieldError nosuchfielderror12) { }
                    b = new int[p.dd.au.a.values().length];
                    try
                    {
                        b[p.dd.au.a.a.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror11) { }
                    try
                    {
                        b[p.dd.au.a.b.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror10) { }
                    try
                    {
                        b[p.dd.au.a.c.ordinal()] = 3;
                    }
                    catch (NoSuchFieldError nosuchfielderror9) { }
                    try
                    {
                        b[p.dd.au.a.d.ordinal()] = 4;
                    }
                    catch (NoSuchFieldError nosuchfielderror8) { }
                    try
                    {
                        b[p.dd.au.a.e.ordinal()] = 5;
                    }
                    catch (NoSuchFieldError nosuchfielderror7) { }
                    try
                    {
                        b[p.dd.au.a.f.ordinal()] = 6;
                    }
                    catch (NoSuchFieldError nosuchfielderror6) { }
                    try
                    {
                        b[p.dd.au.a.g.ordinal()] = 7;
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

            switch (com.pandora.android.activity._cls5.d[a1.ordinal()])
            {
            default:
                throw new InvalidParameterException((new StringBuilder()).append("Unknown AdAction: ").append(a1).toString());

            case 1: // '\001'
                if (!com.pandora.android.iap.d.d.a().a(a1))
                {
                    q.f(i, j);
                    return;
                }
                break;

            case 2: // '\002'
                com.pandora.android.iap.d.d.a().a(a1);
                return;

            case 3: // '\003'
            case 4: // '\004'
            case 5: // '\005'
            case 6: // '\006'
            case 7: // '\007'
            case 8: // '\b'
            case 9: // '\t'
            case 10: // '\n'
            case 11: // '\013'
            case 12: // '\f'
                break;
            }
            if (true) goto _L1; else goto _L3
_L3:
        }

        public void b()
        {
            j = null;
        }

        public b(Context context, com.pandora.android.coachmark.e e1, com.pandora.android.coachmark.CoachmarkLayout.a a1)
        {
            super(context);
            j = a1;
            i = e1;
        }
    }

    private class c
    {

        final NowPlaying a;

        public void onSkipTrack(ap ap1)
        {
            if (ap1.c == p.cw.d.a.a)
            {
                q.c(a.w, a);
            }
        }

        public void onStationStateChange(ay ay1)
        {
            switch (com.pandora.android.activity._cls5.c[ay1.b.ordinal()])
            {
            default:
                return;

            case 1: // '\001'
            case 2: // '\002'
                com.pandora.android.activity.NowPlaying.b(a).c();
                break;
            }
        }

        public void onTrackHistoryCleared(w w1)
        {
            com.pandora.android.activity.NowPlaying.b(a).c();
        }

        private c()
        {
            a = NowPlaying.this;
            super();
        }

    }


    private bd A;
    private MiniPlayerView B;
    private ViewGroup C;
    private k D;
    private CountdownBarLayout E;
    private y F;
    private aa G;
    private boolean H;
    private boolean I;
    private boolean J;
    private boolean K;
    private boolean L;
    private android.support.v4.view.ViewPager.e M;
    private c N;
    private int O;
    private com.pandora.android.personalization.view.c P;
    private Handler Q;
    private a R;
    private AlertDialog S;
    private boolean T;
    private boolean U;
    private String V;
    private Bundle W;
    private Runnable X;
    private ViewPager o;
    private RelativeLayout p;
    private o z;

    public NowPlaying()
    {
        O = -1;
        U = false;
        W = null;
        X = new Runnable() {

            final NowPlaying a;

            public void run()
            {
                com.pandora.android.activity.NowPlaying.a(a);
                Bundle bundle = new Bundle();
                bundle.putBoolean("suppressScroll", true);
                Intent intent = new Intent();
                intent.putExtras(bundle);
                a.setResult(-1, intent);
                a.finish();
            }

            
            {
                a = NowPlaying.this;
                super();
            }
        };
    }

    static int a(NowPlaying nowplaying, int i)
    {
        nowplaying.O = i;
        return i;
    }

    public static Bundle a(y y1, ImageView imageview, int i, boolean flag, boolean flag1, boolean flag2)
    {
        Bundle bundle = new Bundle();
        if (imageview != null)
        {
            int ai1[] = new int[2];
            imageview.getLocationOnScreen(ai1);
            float f1 = imageview.getWidth();
            float f2 = imageview.getHeight();
            bundle.putInt("originalOrientation", i);
            bundle.putIntArray("albumArtLocation", ai1);
            bundle.putFloatArray("albumArtDimensions", new float[] {
                f1, f2
            });
            bundle.putBoolean("shouldAnimate", flag);
            bundle.putBoolean("isNewStation", flag1);
            bundle.putBoolean("videoAd", flag2);
        }
        bundle.putSerializable("intent_station_data", y1);
        return bundle;
    }

    static void a(NowPlaying nowplaying)
    {
        nowplaying.ap();
    }

    static void a(NowPlaying nowplaying, com.pandora.radio.util.k.a a1)
    {
        nowplaying.b(a1);
    }

    private void a(NowPlayingView nowplayingview)
    {
        a(((com.pandora.radio.util.k.a) (null)));
        View view = p.findViewWithTag("viewExcludedFromHistory");
        if (view != null)
        {
            p.removeView(view);
        }
        p.addView(nowplayingview);
        if (D.d())
        {
            nowplayingview.setAlpha(0.0F);
            nowplayingview.setTranslationX(p.getWidth());
            D.a(nowplayingview);
        }
        o.setVisibility(8);
    }

    static boolean a(NowPlaying nowplaying, boolean flag)
    {
        nowplaying.H = flag;
        return flag;
    }

    private boolean ag()
    {
        return F != null && F.A();
    }

    private o ah()
    {
        if (getResources().getConfiguration().orientation == 2)
        {
            return new m(this, p.cn.e.a(), V, w);
        } else
        {
            return new o(this, p.cn.e.a(), V, w);
        }
    }

    private boolean ai()
    {
        return E.getVisibility() == 0;
    }

    private void aj()
    {
        z.e().setTranslationY(0.0F);
        android.widget.RelativeLayout.LayoutParams layoutparams = (android.widget.RelativeLayout.LayoutParams)p.getLayoutParams();
        layoutparams.addRule(3, 0x7f1001c1);
        p.setLayoutParams(layoutparams);
    }

    private void ak()
    {
        z.e().setTranslationY(0.0F);
        android.widget.RelativeLayout.LayoutParams layoutparams = (android.widget.RelativeLayout.LayoutParams)p.getLayoutParams();
        layoutparams.addRule(3, -1);
        p.setLayoutParams(layoutparams);
    }

    private boolean al()
    {
        ag ag1 = com.pandora.android.provider.b.a.b().k();
        long l1 = ag1.U();
        if (l1 >= 0L)
        {
            ag1.e(-1L);
            if (System.currentTimeMillis() - l1 < 60000L)
            {
                return true;
            }
        }
        return false;
    }

    private void am()
    {
label0:
        {
            com.pandora.android.provider.b b1 = com.pandora.android.provider.b.a;
            if (b1.o() && !J)
            {
                if (p.cx.c.a().V() != 7)
                {
                    break label0;
                }
                d(getResources().getString(0x7f080288));
                b1.d(false);
                b1.a(-1, null);
                b1.e(false);
                b1.f(false);
            }
            if (getIntent() != null && K)
            {
                S();
            }
            return;
        }
        J = true;
        com.pandora.android.util.s.a();
    }

    private void an()
    {
        int i = z.b() - 1;
        if (o.getCurrentItem() != i)
        {
            o.a(i, true);
        }
    }

    private void ao()
    {
        View view = p.findViewWithTag("viewExcludedFromHistory");
        if (view != null)
        {
            p.removeView(view);
        }
        o.setVisibility(0);
    }

    private void ap()
    {
        PandoraIntent pandoraintent = new PandoraIntent("show_home");
        if (ab())
        {
            boolean flag = w.a(com.pandora.android.coachmark.e.e.e);
            if (flag)
            {
                com.pandora.android.coachmark.e e1 = w;
                com.pandora.android.coachmark.e.b(com.pandora.android.coachmark.e.e.d);
            }
            if (!flag)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            pandoraintent.putExtra("showCoachmark", flag);
            pandoraintent.putExtra("showCoachmarkType", com.pandora.android.coachmark.e.e.d.name());
        }
        com.pandora.android.provider.b.a.C().a(pandoraintent);
    }

    private void aq()
    {
        if (F != null)
        {
            if (S == null)
            {
                S = com.pandora.android.util.s.b(this, F.d());
            }
            if (!S.isShowing())
            {
                S.show();
                return;
            }
        }
    }

    private void ar()
    {
        if (com.pandora.android.provider.b.a.b().a(p.dj.b.a.b) && !com.pandora.android.util.s.u() && !com.pandora.android.provider.b.a.b().k().M())
        {
            com.pandora.android.util.s.a(this);
        }
    }

    private void as()
    {
        if (!U)
        {
            View view = B.getThumbDown();
            View view1 = B.getThumbUp();
            boolean flag1 = q.a(w, this, F, view, view1) | q.a(w, this, F, G);
            boolean flag = flag1;
            if (!flag1)
            {
                flag = flag1 | q.b(w, this, F, G);
            }
            if (!flag)
            {
                ar();
            }
        }
        U = true;
    }

    static o b(NowPlaying nowplaying)
    {
        return nowplaying.z;
    }

    private void b(com.pandora.radio.util.k.a a1)
    {
        T = false;
        Q.removeCallbacks(R);
        Q.postDelayed(R.a(a1), 250L);
    }

    static boolean b(NowPlaying nowplaying, boolean flag)
    {
        nowplaying.L = flag;
        return flag;
    }

    static boolean c(NowPlaying nowplaying)
    {
        return nowplaying.H;
    }

    static k d(NowPlaying nowplaying)
    {
        return nowplaying.D;
    }

    static boolean e(NowPlaying nowplaying)
    {
        return nowplaying.ag();
    }

    static ViewPager f(NowPlaying nowplaying)
    {
        return nowplaying.o;
    }

    static android.support.v4.view.ViewPager.e g(NowPlaying nowplaying)
    {
        return nowplaying.M;
    }

    static bd h(NowPlaying nowplaying)
    {
        return nowplaying.A;
    }

    protected PandoraIntentFilter B()
    {
        PandoraIntentFilter pandoraintentfilter = super.B();
        pandoraintentfilter.a("handle_share_now_playing");
        pandoraintentfilter.a("show_waiting");
        pandoraintentfilter.a("hide_waiting");
        return pandoraintentfilter;
    }

    public boolean G()
    {
        return false;
    }

    protected boolean J()
    {
        return true;
    }

    public void a(float f1)
    {
        if (ai())
        {
            z.e().setTranslationY((float)E.getHeight() * f1);
        }
    }

    protected void a(Context context, Intent intent, String s1)
    {
        super.a(context, intent, s1);
        if (!J)
        {
            f(s1);
            if (s1.equals(com.pandora.android.activity.PandoraIntent.a("handle_share_now_playing")))
            {
                com.pandora.android.activity.a.a(this, F, G, "");
                return;
            }
        }
    }

    public void a(com.pandora.android.ads.h.b b1)
    {
    }

    public void a(com.pandora.android.ads.h.b b1, int i, int i1, boolean flag, boolean flag1)
    {
        android.widget.RelativeLayout.LayoutParams layoutparams;
        Resources resources;
        boolean flag2;
        int j1;
        if (i == 0 || p() == null || b1 != com.pandora.android.ads.h.b.b)
        {
            return;
        }
        b1 = p();
        layoutparams = (android.widget.RelativeLayout.LayoutParams)b1.getLayoutParams();
        layoutparams.setMargins(0, 0, 0, 0);
        layoutparams.addRule(12, 0);
        layoutparams.addRule(8, 0);
        layoutparams.addRule(10, 0);
        b1.setBackgroundColor(0);
        if (flag1)
        {
            e(true);
            return;
        }
        flag1 = ae();
        resources = getResources();
        j1 = p.getMeasuredHeight() - findViewById(0x7f1001c0).getMeasuredHeight();
        int k1;
        if (1 == resources.getConfiguration().orientation)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        k1 = u().y;
        if (flag2)
        {
            if (!flag1)
            {
                i1 = j1;
            } else
            {
                i1 = 0;
            }
        } else
        {
            i1 = 0;
        }
        if (i < k1 - i1)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i != 0) goto _L2; else goto _L1
_L1:
        if (!flag2) goto _L4; else goto _L3
_L3:
        if (flag)
        {
            if (flag1)
            {
                layoutparams.addRule(8, 0x7f1001bd);
            } else
            {
                layoutparams.addRule(10, -1);
            }
        }
_L6:
        b1.setLayoutParams(layoutparams);
        e(true);
        return;
_L4:
        layoutparams.setMargins(resources.getDimensionPixelSize(0x7f090023), 0, 0, 0);
        if (flag)
        {
            layoutparams.addRule(10, -1);
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (flag2)
        {
            layoutparams.addRule(8, 0x7f1001bd);
            if (!flag1)
            {
                layoutparams.setMargins(0, 0, 0, j1);
            }
        } else
        {
            layoutparams.setMargins(resources.getDimensionPixelSize(0x7f090023), 0, 0, 0);
            layoutparams.addRule(12, -1);
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    protected void a(h h1)
    {
        if (h1 instanceof b)
        {
            ((b)h1).a(w);
        }
    }

    public void a(CoachmarkBuilder coachmarkbuilder)
    {
        super.a(coachmarkbuilder);
        coachmarkbuilder = coachmarkbuilder.e();
        switch (com.pandora.android.activity._cls5.e[coachmarkbuilder.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            StationPersonalizationActivity.a(this, F, com/pandora/android/activity/NowPlaying, false);
            return;

        case 2: // '\002'
            StationPersonalizationActivity.a(this, F, com/pandora/android/activity/NowPlaying);
            return;

        case 3: // '\003'
            com.pandora.android.activity.a.a(this, 1, F, null, null);
            return;

        case 4: // '\004'
        case 5: // '\005'
            com.pandora.android.iap.d.d.a().a(this, null);
            break;
        }
    }

    public void a(TrackView trackview)
    {
        View view = z.e();
        D.a(view);
        if (H)
        {
            o.post(new Runnable() {

                final NowPlaying a;

                public void run()
                {
                    com.pandora.android.activity.NowPlaying.g(a).a_(com.pandora.android.activity.NowPlaying.f(a).getCurrentItem());
                }

            
            {
                a = NowPlaying.this;
                super();
            }
            });
        }
        if (ag())
        {
            trackview.post(new Runnable(trackview) {

                final TrackView a;
                final NowPlaying b;

                public void run()
                {
                    a.a(false);
                    if (!a.k())
                    {
                        com.pandora.android.activity.NowPlaying.h(b).a(a, -0.9F);
                    }
                }

            
            {
                b = NowPlaying.this;
                a = trackview;
                super();
            }
            });
        }
    }

    protected boolean a(Context context, Intent intent)
    {
        String s1 = intent.getAction();
        if (com.pandora.android.activity.PandoraIntent.a("show_now_playing").equals(s1))
        {
            an();
            z.c();
            context = z.e();
            D.a(context);
        } else
        if (com.pandora.android.activity.PandoraIntent.a("hide_waiting").equals(s1))
        {
            if (!K)
            {
                U();
                return true;
            }
        } else
        {
            return super.a(context, intent);
        }
        return true;
    }

    protected boolean ab()
    {
        return true;
    }

    public void ad()
    {
        if (T)
        {
            b(com.pandora.radio.util.k.a.f);
        }
        if (ai())
        {
            ak();
        }
        Object obj;
        if (L)
        {
            obj = (TrackView)z.a(O);
        } else
        {
            obj = (TrackView)z.e();
        }
        if (obj != null && s)
        {
            if (((TrackView) (obj)).k())
            {
                obj = com.pandora.android.util.af.c.c;
            } else
            {
                obj = com.pandora.android.util.af.c.a;
            }
            com.pandora.android.util.af.a().a(((com.pandora.android.util.af.c) (obj)));
        }
        L = false;
    }

    protected boolean ae()
    {
        if (ag() && T)
        {
            return true;
        }
        NowPlayingView nowplayingview = (NowPlayingView)z.e();
        boolean flag;
        if (nowplayingview != null && nowplayingview.c())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return flag;
    }

    public com.pandora.android.personalization.view.c af()
    {
        return P;
    }

    public void b(String s1)
    {
        if ("skip".equals(s1) && com.pandora.android.ads.c.b().b(s1) && com.pandora.android.ads.VideoAdManager.c.a().a(this, null, true))
        {
            return;
        } else
        {
            a(s1, false);
            return;
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyevent)
    {
        int i = keyevent.getKeyCode();
        int i1 = keyevent.getAction();
        if (i == 82 && i1 == 1)
        {
            return true;
        } else
        {
            return super.dispatchKeyEvent(keyevent);
        }
    }

    public j.a getDisplayMode()
    {
        return B.getDisplayMode();
    }

    protected IntentFilter l()
    {
        return B();
    }

    protected int m()
    {
        return 0;
    }

    protected ViewGroup n()
    {
        return null;
    }

    protected int o()
    {
        return 0x7f1001c2;
    }

    public void onAutomotiveAccessoryRadioEvent(p.dd.e e1)
    {
        f((new StringBuilder()).append("onAutomotiveAccessoryRadioEvent called: ").append(e1.a).toString());
        if (e1.a == p.dd.e.a.a)
        {
            if (S != null && S.isShowing())
            {
                S.dismiss();
            }
            com.pandora.android.util.s.f();
        }
    }

    public void onBackPressed()
    {
        a(((com.pandora.radio.util.k.a) (null)));
        D.a(X);
    }

    public void onCappedPlaylist(i i)
    {
        f("playlist is capped, finishing NowPlaying activity");
        if (s)
        {
            i = com.pandora.android.activity.c.a();
            if (i.c(com/pandora/android/activity/CapHitActivity))
            {
                f("skipping CapHitActivity screen start - it's starting up already");
            } else
            {
                f("launch the cap screen");
                i.a(this, com/pandora/android/activity/CapHitActivity, com.pandora.android.activity.CapHitActivity.a(p.cp.b.a(), null, -1, true));
            }
            finish();
        }
    }

    public void onChromecastStateChange(f f1)
    {
        if (f1.a)
        {
            h().a(getString(0x7f0800c5, new Object[] {
                f1.b
            }));
            return;
        } else
        {
            h().a(null);
            return;
        }
    }

    public void onCountdownBarUpdate(com.pandora.android.countdown.d d1)
    {
        d1 = d1.a;
        boolean flag;
        if (d1 != null && d1.g() > 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag && z.e() != null && ((NowPlayingView)z.e()).c())
        {
            aj();
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f04006c);
        Object obj = getIntent();
        if (obj != null)
        {
            V = ((Intent) (obj)).getStringExtra("intent_welcome_message");
            ((Intent) (obj)).removeExtra("intent_welcome_message");
            obj = ((Intent) (obj)).getExtras();
            if (obj != null && ((Bundle) (obj)).containsKey("intent_followon_action"))
            {
                W = ((Bundle) (obj));
            }
        }
        H = true;
        if (bundle == null)
        {
            D = new k(this, getIntent().getExtras());
        } else
        {
            D = new k(this, null);
        }
        B = (MiniPlayerView)findViewById(0x7f1001be);
        E = (CountdownBarLayout)findViewById(0x7f1001c1);
        o = (ViewPager)findViewById(0x7f1001bf);
        A = new bd();
        o.a(false, A);
        o.setPageMargin(-getResources().getDimensionPixelSize(0x7f09011a));
        p = (RelativeLayout)findViewById(0x7f1001bd);
        M = new android.support.v4.view.ViewPager.e(this) {

            final NowPlaying a;
            final NowPlaying b;
            private int c;
            private int d;

            private boolean c(int i)
            {
                boolean flag;
                boolean flag1;
                if (i == 0)
                {
                    i = 1;
                } else
                {
                    i = 0;
                }
                if (c != 1)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (d == com.pandora.android.activity.NowPlaying.b(b).b() - 1)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                return i != 0 && flag && flag1;
            }

            public void a(int i, float f1, int i1)
            {
            }

            public void a_(int i)
            {
                if (d != i)
                {
                    Object obj1 = (TrackView)com.pandora.android.activity.NowPlaying.b(b).a(i);
                    if (obj1 != null && b.s)
                    {
                        if (((TrackView) (obj1)).k())
                        {
                            b.setDisplayMode(com.pandora.android.activity.j.a.a);
                            if (!com.pandora.android.activity.NowPlaying.c(b))
                            {
                                com.pandora.android.util.af.a().a(com.pandora.android.util.af.c.c);
                            }
                            com.pandora.android.activity.NowPlaying.d(b).f();
                            com.pandora.android.activity.NowPlaying.a(b, false);
                        } else
                        {
                            b.setDisplayMode(com.pandora.android.activity.j.a.b);
                            if (!com.pandora.android.activity.NowPlaying.c(b))
                            {
                                com.pandora.android.util.af.a().a(com.pandora.android.util.af.c.a);
                            }
                            com.pandora.android.activity.NowPlaying.d(b).e();
                            com.pandora.android.activity.NowPlaying.a(b, false);
                        }
                        if (com.pandora.android.activity.NowPlaying.e(b))
                        {
                            ((TrackView) (obj1)).a(true);
                        }
                        if (((TrackView) (obj1)).getTrackData() != null && ((TrackView) (obj1)).getTrackData().l() == ac.c)
                        {
                            com.pandora.android.artist.a.a((com.pandora.radio.data.c)((TrackView) (obj1)).getTrackData(), com.pandora.android.artist.a.a.b);
                        }
                    }
                    if (com.pandora.android.activity.NowPlaying.b(b).b() > 1)
                    {
                        obj1 = (NowPlayingView)com.pandora.android.activity.NowPlaying.b(b).a(d);
                        if (obj1 != null && !com.pandora.android.activity.NowPlaying.e(b))
                        {
                            ((NowPlayingView) (obj1)).e();
                        }
                    }
                    com.pandora.android.activity.NowPlaying.a(b, d);
                    d = i;
                    com.pandora.android.activity.NowPlaying.b(b, true);
                }
            }

            public void b_(int i)
            {
                boolean flag = true;
                if (i == 1 && c != 1)
                {
                    com.pandora.android.activity.NowPlaying.a(a, com.pandora.radio.util.k.a.e);
                }
                if (c(i))
                {
                    TrackView trackview = (TrackView)com.pandora.android.activity.NowPlaying.b(b).e();
                    View view = trackview.findViewById(0x7f1002e0);
                    boolean flag1;
                    if (view == null || view.getVisibility() != 0)
                    {
                        flag = false;
                    }
                    flag1 = com.pandora.android.provider.b.a.b().k().C();
                    if (flag && !trackview.c() && flag1)
                    {
                        q.b(b.w, view);
                    }
                }
                c = i;
            }

            
            {
                b = NowPlaying.this;
                a = nowplaying1;
                super();
                d = -1;
            }
        };
        z = ah();
        z.a(this);
        z.a(this);
        o.setOnPageChangeListener(M);
        o.setAdapter(z);
        N = new c();
        com.pandora.android.provider.b.a.b().b(N);
        com.pandora.android.provider.b.a.e().c(N);
        R = new a(this);
        Q = new Handler(getMainLooper());
        b(bundle);
        a(bundle);
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        y y1;
        boolean flag = super.onCreateOptionsMenu(menu);
        if (F == null)
        {
            y1 = com.pandora.android.provider.b.a.b().d().t();
        } else
        {
            y1 = F;
        }
        if (I || y1 == null || y1.A())
        {
            return flag;
        }
        if (!com.pandora.android.activity.a.a(y1)) goto _L2; else goto _L1
_L1:
        P = com.pandora.android.activity.a.a(this, menu);
_L4:
        return true;
_L2:
        if (!y1.j())
        {
            getMenuInflater().inflate(0x7f12001c, menu);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void onDestroy()
    {
        super.onDestroy();
        if (Q != null && R != null)
        {
            Q.removeCallbacks(R);
        }
        if (z != null)
        {
            z.f();
        }
        if (N != null)
        {
            com.pandora.android.provider.b.a.b().c(N);
            com.pandora.android.provider.b.a.e().b(N);
            N = null;
        }
    }

    protected void onNewIntent(Intent intent)
    {
        super.onNewIntent(intent);
        V = null;
        W = null;
        if (intent != null)
        {
            V = intent.getStringExtra("intent_welcome_message");
            intent.removeExtra("intent_welcome_message");
            if (!com.pandora.android.util.s.a(V))
            {
                z.a(V);
            }
            intent = intent.getExtras();
            if (intent != null && intent.containsKey("intent_followon_action"))
            {
                W = intent;
            }
        }
    }

    public void onOnePlaylistEnded(p.dd.aa aa1)
    {
        f("ONE playlist ended, finishing NowPlaying activity");
        finish();
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        boolean flag;
        boolean flag1;
        flag1 = com.pandora.android.activity.a.b(this, menuitem.getItemId());
        flag = flag1;
        if (flag1) goto _L2; else goto _L1
_L1:
        menuitem.getItemId();
        JVM INSTR lookupswitch 2: default 48
    //                   16908332: 52
    //                   2131755806: 71;
           goto _L3 _L4 _L5
_L3:
        flag = true;
_L2:
        return flag;
_L4:
        a(((com.pandora.radio.util.k.a) (null)));
        D.a(X);
        continue; /* Loop/switch isn't completed */
_L5:
        com.pandora.android.activity.a.a(this, p.cp.b.b(F.c()), null, null, null, null, null);
        if (true) goto _L3; else goto _L6
_L6:
    }

    public void onPause()
    {
        super.onPause();
        K = false;
    }

    protected void onResume()
    {
        super.onResume();
        Object obj = com.pandora.android.provider.b.a;
        if (!((com.pandora.android.provider.b) (obj)).v())
        {
            if (((com.pandora.android.provider.b) (obj)).b().i().b())
            {
                onCappedPlaylist(null);
                return;
            }
            com.pandora.android.util.af.a().a(com.pandora.android.util.af.c.c);
            obj = (TrackView)z.e();
            if (obj != null)
            {
                ((TrackView) (obj)).j();
            }
            if (p.findViewWithTag("viewExcludedFromHistory") != null)
            {
                ao();
            }
            if (I)
            {
                if (D.d())
                {
                    D.a();
                }
                a(com.pandora.android.view.d.a(this, G));
                return;
            }
            if (!al())
            {
                an();
                D.a();
                return;
            }
        }
    }

    protected void onStart()
    {
        super.onStart();
        if (com.pandora.android.util.s.l())
        {
            return;
        } else
        {
            super.d();
            am();
            return;
        }
    }

    public void onStationData(at at1)
    {
        if (at1.a != null)
        {
            setTitle(at1.a.d());
            F = at1.a;
        }
    }

    public void onStationPersonalizationChanged(au au1)
    {
        F = au1.a;
        com.pandora.android.activity._cls5.b[au1.b.ordinal()];
        JVM INSTR tableswitch 1 7: default 60
    //                   1 132
    //                   2 91
    //                   3 91
    //                   4 132
    //                   5 132
    //                   6 132
    //                   7 132;
           goto _L1 _L2 _L3 _L3 _L2 _L2 _L2 _L2
_L1:
        throw new InvalidParameterException((new StringBuilder()).append("onSPChange called with unknown reason ").append(au1.b).toString());
_L3:
        int i = F.H() + F.G();
        if (i != 1) goto _L5; else goto _L4
_L4:
        if (F.H() != 1) goto _L7; else goto _L6
_L6:
        q.d(w, this);
_L2:
        return;
_L7:
        q.e(w, this);
        return;
_L5:
        q.a(w, this, i);
        return;
    }

    public void onThumbDown(bb bb)
    {
        q.b(w, this);
    }

    public void onThumbUp(p.dd.bd bd1)
    {
        q.a(w, this);
    }

    public void onTrackBuffering(bf bf1)
    {
        if (bf1.a)
        {
            K = false;
            U();
        } else
        {
            Object obj = bf1.b;
            K = ((n) (obj)).b();
            if (K)
            {
                boolean flag;
                boolean flag1;
                if (G != null)
                {
                    bf1 = G.w();
                } else
                {
                    bf1 = null;
                }
                obj = ((n) (obj)).a();
                if (bf1 == null && obj == null)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (bf1 != null && bf1.equals(obj))
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                if (flag || flag1)
                {
                    d(getResources().getString(0x7f0801f0));
                    return;
                }
            } else
            {
                U();
                return;
            }
        }
    }

    public void onTrackState(bh bh1)
    {
        if (com.pandora.android.provider.b.a.d() != null) goto _L2; else goto _L1
_L1:
        p.df.a.c("NowPlaying", "We've been signed out, exiting");
        finish();
_L4:
        return;
_L2:
        G = bh1.b;
        I = p.cn.e.a().a(G);
        D.a(I);
        switch (com.pandora.android.activity._cls5.a[bh1.a.ordinal()])
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("onTrackState: unknown event type ").append(bh1.a).toString());

        case 1: // '\001'
            z.c();
            if (I)
            {
                a(com.pandora.android.view.d.a(this, G));
            } else
            {
                setShowProgressTime(true);
                an();
                if (!G.m())
                {
                    a(((com.pandora.radio.util.k.a) (null)));
                }
                ao();
            }
            if (!G.M())
            {
                if (W != null && W.containsKey("intent_followon_action"))
                {
                    bh1 = new Intent(W.getString("intent_followon_action"));
                    W.remove("intent_followon_action");
                    bh1.putExtras(W);
                    com.pandora.android.provider.b.a.C().a(bh1);
                    W = null;
                } else
                {
                    as();
                }
            } else
            {
                as();
            }
            // fall through

        case 2: // '\002'
            U();
            // fall through

        case 3: // '\003'
            d();
            return;

        case 4: // '\004'
        case 5: // '\005'
            break;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void onZeroVolumeAutoPause(bu bu1)
    {
        f("onZeroVolumeAutoPause called");
        if (bu1.a)
        {
            aq();
        }
    }

    protected ViewGroup p()
    {
        if (C == null)
        {
            C = (ViewGroup)findViewById(o());
        }
        return C;
    }

    public void r()
    {
        if (ai() && ((NowPlayingView)z.e()).c())
        {
            ak();
        }
        if (!ag())
        {
            b(com.pandora.radio.util.k.a.f);
        } else
        if (ag() && !T)
        {
            b(com.pandora.radio.util.k.a.f);
            return;
        }
    }

    public void s()
    {
    }

    public void setDisplayMode(j.a a1)
    {
        B.setDisplayMode(a1);
    }

    public void setShowProgressTime(boolean flag)
    {
        B.setShowProgressTime(flag);
    }

    public boolean t()
    {
        aa aa1;
        if (getIntent().getExtras() == null || !D.c())
        {
            if (!p.cn.e.a().a(aa1 = com.pandora.android.provider.b.a.b().d().s()))
            {
                return true;
            }
        }
        return false;
    }

    public Point u()
    {
        View view = findViewById(0x7f1001bd);
        Resources resources = getResources();
        if (1 == resources.getConfiguration().orientation)
        {
            return new Point(view.getMeasuredWidth(), view.getMeasuredHeight());
        } else
        {
            return new Point(resources.getDimensionPixelOffset(0x7f090110), view.getMeasuredHeight());
        }
    }

    public void v()
    {
        if (T)
        {
            b(com.pandora.radio.util.k.a.f);
        }
        if (ai())
        {
            aj();
        }
        Object obj = (TrackView)z.e();
        if (obj != null && s)
        {
            if (((TrackView) (obj)).k())
            {
                obj = com.pandora.android.util.af.c.d;
            } else
            {
                obj = com.pandora.android.util.af.c.b;
            }
            com.pandora.android.util.af.a().a(((com.pandora.android.util.af.c) (obj)));
        }
        L = false;
    }

    protected h w()
    {
        return new b(getApplicationContext(), w, this);
    }

    protected void x()
    {
        T = z();
        super.x();
    }
}
