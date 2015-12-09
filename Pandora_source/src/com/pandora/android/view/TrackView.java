// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.LayoutTransition;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.pandora.android.activity.j;
import com.pandora.android.artist.FeaturedTrackLayout;
import com.pandora.android.coachmark.e;
import com.pandora.android.eureka.DisappearingMediaRouteButton;
import com.pandora.android.eureka.a;
import com.pandora.android.provider.b;
import com.pandora.android.util.ThumbImageButton;
import com.pandora.android.util.ad;
import com.pandora.android.util.ae;
import com.pandora.android.util.s;
import com.pandora.radio.data.aa;
import com.pandora.radio.data.ac;
import com.pandora.radio.util.k;
import p.al.f;
import p.cw.c;
import p.dd.bb;
import p.dd.bc;
import p.dd.bd;
import p.dd.bh;
import p.l.d;
import p.l.g;
import p.l.i;

// Referenced classes of package com.pandora.android.view:
//            NowPlayingView, d, SlidingDrawer, TrackInfoView, 
//            TrackActionsLayout

public class TrackView extends NowPlayingView
    implements SlidingDrawer.b, SlidingDrawer.c, SlidingDrawer.d
{
    protected class a
    {

        final TrackView a;

        public void castDeviceListChanged(p.bz.e e1)
        {
            if (com.pandora.android.view.TrackView.k(a) != null)
            {
                com.pandora.android.view.TrackView.k(a).a(e1);
            }
        }

        public void onThumbDownEvent(bb bb1)
        {
            if (com.pandora.android.view.TrackView.e(a) == bb1.b && com.pandora.android.view.TrackView.d(a) != null)
            {
                ae.a(-1, com.pandora.android.view.TrackView.d(a), com.pandora.android.view.TrackView.f(a), com.pandora.android.view.TrackView.e(a));
            }
        }

        public void onThumbRevertedEvent(bc bc1)
        {
            if (com.pandora.android.view.TrackView.e(a) == bc1.a && com.pandora.android.view.TrackView.d(a) != null)
            {
                ae.a(bc1.b, com.pandora.android.view.TrackView.d(a), com.pandora.android.view.TrackView.f(a), com.pandora.android.view.TrackView.e(a));
            }
        }

        public void onThumbUpEvent(bd bd1)
        {
            if (com.pandora.android.view.TrackView.e(a) == bd1.b && com.pandora.android.view.TrackView.d(a) != null)
            {
                ae.a(1, com.pandora.android.view.TrackView.d(a), com.pandora.android.view.TrackView.f(a), com.pandora.android.view.TrackView.e(a));
            }
        }

        public void onTrackState(bh bh1)
        {
            com.pandora.android.view.TrackView.a(a, bh1.b);
            static class _cls3
            {

                static final int a[];

                static 
                {
                    a = new int[p.dd.bh.a.values().length];
                    try
                    {
                        a[p.dd.bh.a.b.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror4) { }
                    try
                    {
                        a[p.dd.bh.a.c.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror3) { }
                    try
                    {
                        a[p.dd.bh.a.a.ordinal()] = 3;
                    }
                    catch (NoSuchFieldError nosuchfielderror2) { }
                    try
                    {
                        a[p.dd.bh.a.d.ordinal()] = 4;
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

            switch (com.pandora.android.view._cls3.a[bh1.a.ordinal()])
            {
            default:
                throw new IllegalArgumentException((new StringBuilder()).append("onTrackState: unknown event type ").append(bh1.a).toString());

            case 1: // '\001'
            case 2: // '\002'
                a.g_();
                // fall through

            case 3: // '\003'
            case 4: // '\004'
            case 5: // '\005'
                return;
            }
        }

        protected a()
        {
            a = TrackView.this;
            super();
        }
    }


    private com.pandora.android.activity.o.a A;
    private com.pandora.android.activity.o.b B;
    private View C;
    private View D;
    private TextView E;
    private String F;
    private e G;
    private Handler H;
    private Runnable I = new Runnable() {

        final TrackView a;

        public void run()
        {
            com.pandora.android.view.TrackView.g(a).a();
            com.pandora.android.view.TrackView.a(a, null);
            TrackView.h(a);
        }

            
            {
                a = TrackView.this;
                super();
            }
    };
    protected SlidingDrawer a;
    protected View b;
    protected View c;
    protected ViewGroup d;
    protected a e;
    private final LayoutTransition f;
    private ImageView g;
    private TextView h;
    private TextView i;
    private TextView j;
    private aa k;
    private aa l;
    private DisappearingMediaRouteButton m;
    private TrackActionsLayout n;
    private TrackInfoView o;
    private ThumbImageButton p;
    private ThumbImageButton q;
    private FeaturedTrackLayout r;
    private float s;
    private float t;
    private float u;
    private float v;
    private String w;
    private j x;
    private boolean y;
    private com.pandora.android.ads.c.a z;

    public TrackView(Context context)
    {
        super(context);
        f = new LayoutTransition();
        e = new a();
        a();
    }

    public TrackView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        f = new LayoutTransition();
        e = new a();
        a();
    }

    public TrackView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        f = new LayoutTransition();
        e = new a();
        a();
    }

    static float a(TrackView trackview, float f1)
    {
        trackview.v = f1;
        return f1;
    }

    static ImageView a(TrackView trackview)
    {
        return trackview.g;
    }

    public static NowPlayingView a(Context context, aa aa1, String s1, com.pandora.android.activity.o.a a1, com.pandora.android.activity.o.b b1, String s2, e e1)
    {
        if (aa1 == null || s1 == null)
        {
            throw new IllegalArgumentException("Arguments must be non-null!");
        } else
        {
            context = com.pandora.android.view.d.a(context, aa1);
            context.setTrackViewAvailableListener(a1);
            context.setTrackViewTransitionListener(b1);
            context.setCoachmarkManager(e1);
            context.a(aa1, s1, s2);
            return context;
        }
    }

    static aa a(TrackView trackview, aa aa1)
    {
        trackview.l = aa1;
        return aa1;
    }

    static String a(TrackView trackview, String s1)
    {
        trackview.F = s1;
        return s1;
    }

    static void a(TrackView trackview, boolean flag)
    {
        trackview.b(flag);
    }

    static float b(TrackView trackview)
    {
        return trackview.v;
    }

    private void b(float f1)
    {
        boolean flag = false;
        if (getContext() == null)
        {
            return;
        }
        if (s == 0.0F || s == (1.0F / 0.0F))
        {
            Object obj = getContext().getResources();
            int i1 = ((Resources) (obj)).getDimensionPixelSize(0x7f090107);
            float f2;
            float f3;
            if (g.getWidth() > 0)
            {
                s = (float)i1 / (float)g.getWidth() - 1.0F;
            } else
            {
                s = 0.0F;
            }
            g.setPivotX(g.getWidth());
            g.setPivotY(0.0F);
            t = -((Resources) (obj)).getDimension(0x7f090117);
            f2 = d.getRootView().getTop();
            u = ((Resources) (obj)).getDimension(0x7f090118) + f2;
        }
        f2 = s * f1 + 1.0F;
        com.pandora.android.util.s.a(g, 1.0F - 0.5F * f1);
        g.setScaleX(f2);
        g.setScaleY(f2);
        g.setTranslationX(t * f1);
        g.setTranslationY(u * f1);
        if (r != null)
        {
            r.a(g, f2, f1, t, u);
        }
        com.pandora.android.util.s.a(o, f1);
        a.setBackgroundColor(Color.argb(Math.round(25.5F * f1), 255, 255, 255));
        f2 = v;
        f3 = v;
        d.setTranslationY(1.0F - (f2 - f3 * f1) / 2.0F);
        if (p.getVisibility() != 8)
        {
            f2 = 1.0F - f1;
            com.pandora.android.util.s.a(p, f2);
            com.pandora.android.util.s.a(q, f2);
            obj = q;
            byte byte0;
            if (f2 == 0.0F)
            {
                byte0 = 4;
            } else
            {
                byte0 = 0;
            }
            ((ThumbImageButton) (obj)).setVisibility(byte0);
            obj = p;
            if (f2 == 0.0F)
            {
                byte0 = 4;
            } else
            {
                byte0 = 0;
            }
            ((ThumbImageButton) (obj)).setVisibility(byte0);
        }
        if (m != null && E.getVisibility() != 0 && c.getVisibility() == 8 && k())
        {
            f2 = 1.0F - f1;
            com.pandora.android.util.s.a(m, f2);
            obj = m;
            byte0 = flag;
            if (f2 == 0.0F)
            {
                byte0 = 8;
            }
            ((DisappearingMediaRouteButton) (obj)).setVisibility(byte0);
        }
        if (c.getVisibility() == 0)
        {
            c.setRotation(180F * f1);
        }
        f2 = (1.0F - f1) * (float)(h.getHeight() / 2);
        i.setTranslationY(f2);
        h.setTranslationY(f2);
        j.setTranslationY(f2);
        j.setAlpha(f1);
    }

    static void b(TrackView trackview, boolean flag)
    {
        trackview.c(flag);
    }

    private void b(boolean flag)
    {
        if (!m()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (E.getVisibility() == 0)
        {
            break; /* Loop/switch isn't completed */
        }
        if (flag && m != null && (a == null || !a.g()))
        {
            if (c != null && c.getVisibility() != 8)
            {
                c.setVisibility(8);
            }
            if (m.getVisibility() != 0)
            {
                m.setVisibility(0);
                return;
            }
        } else
        {
            if (c != null && c.getVisibility() != 0)
            {
                c.setVisibility(0);
            }
            if (m != null && m.getVisibility() != 8)
            {
                m.setVisibility(8);
                return;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (c != null && c.getVisibility() != 8)
        {
            c.setVisibility(8);
        }
        if (m != null && m.getVisibility() != 8)
        {
            m.setVisibility(8);
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    static com.pandora.android.ads.c.a c(TrackView trackview)
    {
        return trackview.z;
    }

    private void c(boolean flag)
    {
        if (r == null)
        {
            ViewStub viewstub = (ViewStub)findViewById(0x7f10016d);
            if (viewstub != null)
            {
                viewstub.setVisibility(0);
                r = (FeaturedTrackLayout)findViewById(0x7f10016e);
            }
            g.getViewTreeObserver().addOnPreDrawListener(new android.view.ViewTreeObserver.OnPreDrawListener(flag) {

                final boolean a;
                final TrackView b;

                public boolean onPreDraw()
                {
                    com.pandora.android.view.TrackView.a(b).getViewTreeObserver().removeOnPreDrawListener(this);
                    TrackView.l(b).a(com.pandora.android.view.TrackView.a(b), a);
                    return false;
                }

            
            {
                b = TrackView.this;
                a = flag;
                super();
            }
            });
        }
    }

    static ThumbImageButton d(TrackView trackview)
    {
        return trackview.p;
    }

    static aa e(TrackView trackview)
    {
        return trackview.k;
    }

    static ThumbImageButton f(TrackView trackview)
    {
        return trackview.q;
    }

    static e g(TrackView trackview)
    {
        return trackview.G;
    }

    static void h(TrackView trackview)
    {
        trackview.n();
    }

    static Runnable i(TrackView trackview)
    {
        return trackview.I;
    }

    static Handler j(TrackView trackview)
    {
        return trackview.H;
    }

    static DisappearingMediaRouteButton k(TrackView trackview)
    {
        return trackview.m;
    }

    static FeaturedTrackLayout l(TrackView trackview)
    {
        return trackview.r;
    }

    private void l()
    {
        if (o != null)
        {
            o.a(k, 0, null);
        }
    }

    private boolean m()
    {
        return !com.pandora.android.util.s.a(F);
    }

    private void n()
    {
        if (getContext() != null)
        {
            g_();
            ad.a(E, C, D);
            if (d != null)
            {
                d.setLayoutTransition(f);
                return;
            }
        }
    }

    private void o()
    {
label0:
        {
            if (E != null)
            {
                if (!m())
                {
                    break label0;
                }
                q();
            }
            return;
        }
        p();
    }

    private void p()
    {
        E.setVisibility(4);
        if (C != null)
        {
            C.setVisibility(0);
        }
        if (m != null)
        {
            b(m.b());
        }
    }

    private void q()
    {
        E.setText(F);
        E.setVisibility(0);
        E.setOnClickListener(new android.view.View.OnClickListener() {

            final TrackView a;

            public void onClick(View view)
            {
                com.pandora.android.view.TrackView.j(a).removeCallbacks(com.pandora.android.view.TrackView.i(a));
                com.pandora.android.view.TrackView.i(a).run();
            }

            
            {
                a = TrackView.this;
                super();
            }
        });
        if (C != null)
        {
            C.setVisibility(4);
        }
        if (c != null)
        {
            c.setVisibility(4);
        }
        if (m != null)
        {
            m.setVisibility(4);
        }
    }

    private boolean r()
    {
        return k != null && k.l() == ac.a && !k.k();
    }

    protected void a()
    {
        LayoutInflater.from(getContext()).inflate(getLayoutResId(), this, true);
        g = (ImageView)findViewById(0x7f1000d8);
        a = (SlidingDrawer)findViewById(0x7f1002dc);
        h = (TextView)findViewById(0x7f1000da);
        i = (TextView)findViewById(0x7f100044);
        j = (TextView)findViewById(0x7f1000dd);
        b = findViewById(0x7f1002dd);
        d = (ViewGroup)findViewById(0x7f1002de);
        m = (DisappearingMediaRouteButton)findViewById(0x7f1002e0);
        n = (TrackActionsLayout)findViewById(0x7f1002e2);
        p = (ThumbImageButton)findViewById(0x7f1001f1);
        q = (ThumbImageButton)findViewById(0x7f1001f2);
        c = findViewById(0x7f1002e1);
        C = findViewById(0x7f1002d9);
        E = (TextView)findViewById(0x7f1002db);
        D = findViewById(0x7f1002df);
        if (d())
        {
            a.getViewTreeObserver().addOnGlobalLayoutListener(new android.view.ViewTreeObserver.OnGlobalLayoutListener() {

                final TrackView a;

                public void onGlobalLayout()
                {
                    android.view.ViewGroup.LayoutParams layoutparams;
                    if (android.os.Build.VERSION.SDK_INT < 16)
                    {
                        a.a.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                    } else
                    {
                        a.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    }
                    com.pandora.android.view.TrackView.a(a, a.a.getMeasuredHeight() - com.pandora.android.view.TrackView.a(a).getMeasuredHeight() - a.d.getMeasuredHeight());
                    a.d.setTranslationY(-1F * (com.pandora.android.view.TrackView.b(a) / 2.0F));
                    layoutparams = a.a.getLayoutParams();
                    layoutparams.height = (int)a.getContext().getResources().getDimension(0x7f090114) + a.a.getMeasuredHeight();
                    a.a.setLayoutParams(layoutparams);
                }

            
            {
                a = TrackView.this;
                super();
            }
            });
        }
    }

    public void a(float f1)
    {
        b(f1);
        if (B != null)
        {
            B.a(f1);
        }
    }

    public void a(aa aa1, String s1, String s2)
    {
        H = new Handler();
        k = aa1;
        w = s1;
        F = s2;
        l = b.a.b().d().s();
        x = (j)getContext();
        z = (com.pandora.android.ads.c.a)getContext();
        if (a != null)
        {
            a.setOnDrawerScrollListener(this);
            a.setOnDrawerOpenListener(this);
            a.setOnDrawerCloseListener(this);
            if (a.g())
            {
                a.c();
            }
        }
        if (d())
        {
            o = (TrackInfoView)findViewWithTag("trackInfoView");
            if (o == null && findViewById(0x7f1002e3) != null)
            {
                o = com.pandora.android.view.TrackInfoView.a(getContext(), true, 0);
                com.pandora.android.util.s.a(o, false);
                ((FrameLayout)findViewById(0x7f1002e3)).addView(o);
            }
            b(0.0F);
        }
        if (p != null)
        {
            p.setOnClickListener(new android.view.View.OnClickListener() {

                final TrackView a;

                public void onClick(View view)
                {
                    com.pandora.android.view.TrackView.c(a).b("rateDown");
                    com.pandora.android.view.TrackView.d(a).setEnabled(false);
                    ae.b(com.pandora.android.view.TrackView.e(a));
                }

            
            {
                a = TrackView.this;
                super();
            }
            });
            q.setOnClickListener(new android.view.View.OnClickListener() {

                final TrackView a;

                public void onClick(View view)
                {
                    com.pandora.android.view.TrackView.c(a).b("rateUp");
                    com.pandora.android.view.TrackView.f(a).setEnabled(false);
                    ae.a(com.pandora.android.view.TrackView.e(a));
                }

            
            {
                a = TrackView.this;
                super();
            }
            });
        }
        if (g != null)
        {
            g.setOnClickListener(new android.view.View.OnClickListener() {

                final TrackView a;

                public void onClick(View view)
                {
                    if (a.a != null)
                    {
                        a.a.b();
                    }
                }

            
            {
                a = TrackView.this;
                super();
            }
            });
            if (k != null && !com.pandora.android.util.s.a(k.v()))
            {
                g.setContentDescription(getContext().getResources().getString(0x7f0800c8));
            } else
            {
                g.setContentDescription(getContext().getResources().getString(0x7f0800c9));
            }
        }
        if (A != null)
        {
            A.a(this);
        }
        j();
    }

    public void a(boolean flag)
    {
label0:
        {
            if (a != null && !a.g())
            {
                if (!flag)
                {
                    break label0;
                }
                a.b();
            }
            return;
        }
        a.setOnDrawerOpenListener(null);
        a.a();
        a.setOnDrawerOpenListener(this);
    }

    public void b()
    {
        if (r != null)
        {
            Object obj = (ViewGroup)r.getParent();
            int i1 = ((ViewGroup) (obj)).indexOfChild(r);
            ((ViewGroup) (obj)).removeView(r);
            LayoutInflater.from(getContext()).inflate(0x7f040053, this);
            obj = findViewById(0x7f10016d);
            removeView(((View) (obj)));
            addView(((View) (obj)), i1);
            r = null;
        }
    }

    public boolean c()
    {
        if (a != null)
        {
            return a.g();
        } else
        {
            return false;
        }
    }

    protected boolean d()
    {
        return a != null;
    }

    public void e()
    {
        if (a != null && a.g())
        {
            a.b();
        }
    }

    public void f()
    {
        if (k() && x.getDisplayMode() != com.pandora.android.activity.j.a.b)
        {
            x.setShowProgressTime(true);
        }
        if (B != null)
        {
            B.ad();
        }
        if (k() && m.b())
        {
            ViewPropertyAnimator viewpropertyanimator = c.animate();
            viewpropertyanimator.setListener(new AnimatorListenerAdapter(viewpropertyanimator) {

                final ViewPropertyAnimator a;
                final TrackView b;

                public void onAnimationEnd(Animator animator)
                {
                    a.setListener(null);
                    b.c.setVisibility(8);
                    if (com.pandora.android.view.TrackView.k(b).getVisibility() != 0)
                    {
                        com.pandora.android.view.TrackView.k(b).setVisibility(0);
                        com.pandora.android.view.TrackView.k(b).setAlpha(0.0F);
                        com.pandora.android.view.TrackView.k(b).animate().alpha(1.0F);
                    }
                }

            
            {
                b = TrackView.this;
                a = viewpropertyanimator;
                super();
            }
            });
            viewpropertyanimator.alpha(0.0F);
        }
    }

    public void g()
    {
        if (c != null)
        {
            c.animate().setListener(null);
        }
        x.setShowProgressTime(false);
        if (B != null)
        {
            B.v();
            float f1 = getContext().getResources().getDimension(0x7f09014a);
            i.setTextSize(0, f1);
            h.setTextSize(0, f1);
            j.setVisibility(0);
            if (k())
            {
                m.setVisibility(8);
                if (c.getVisibility() != 0)
                {
                    c.setVisibility(0);
                    c.setAlpha(0.0F);
                    c.animate().alpha(1.0F).rotation(180F);
                }
            }
        }
        b.a.b().o().b(k.r(), k.w());
    }

    protected void g_()
    {
        if (k != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        boolean flag;
        i.setText(k.s());
        h.setText(k.t());
        j.setText(k.u());
        flag = k();
        if (!flag) goto _L4; else goto _L3
_L3:
        if (p != null)
        {
            p.setVisibility(8);
            q.setVisibility(8);
            c.setVisibility(0);
        }
        if (r())
        {
            o();
        }
        if (m != null)
        {
            b.a.c().a(m);
            m.setEnabledListener(new com.pandora.android.eureka.DisappearingMediaRouteButton.a() {

                final TrackView a;

                public void a(View view, int i1)
                {
                }

                public void a(boolean flag1)
                {
                    com.pandora.android.view.TrackView.a(a, flag1);
                }

            
            {
                a = TrackView.this;
                super();
            }
            });
            b(m.b());
        }
_L5:
        if (g != null)
        {
            Object obj;
            if (flag)
            {
                obj = i.b;
            } else
            {
                obj = i.c;
            }
            obj = p.l.g.b(getContext()).a(k.v()).a(((i) (obj))).a(p.s.b.a).a(0x7f0200e9).b();
            if (k.W())
            {
                ((p.l.c) (obj)).a(new f() {

                    final TrackView a;

                    public volatile boolean a(Exception exception, Object obj1, p.an.k k1, boolean flag1)
                    {
                        return a(exception, (String)obj1, k1, flag1);
                    }

                    public boolean a(Exception exception, String s1, p.an.k k1, boolean flag1)
                    {
                        com.pandora.android.view.TrackView.b(a, true);
                        return false;
                    }

                    public volatile boolean a(Object obj1, Object obj2, p.an.k k1, boolean flag1, boolean flag2)
                    {
                        return a((p.ad.b)obj1, (String)obj2, k1, flag1, flag2);
                    }

                    public boolean a(p.ad.b b1, String s1, p.an.k k1, boolean flag1, boolean flag2)
                    {
                        com.pandora.android.view.TrackView.b(a, false);
                        return false;
                    }

            
            {
                a = TrackView.this;
                super();
            }
                });
            }
            ((p.l.c) (obj)).a(g);
        }
        if (n != null)
        {
            n.a((Activity)getContext(), k, w, flag, z);
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
        if (p != null)
        {
            p.setVisibility(0);
            q.setVisibility(0);
            c.setVisibility(8);
            ae.a(k.E(), p, q, k);
        }
        if (m != null)
        {
            m.setVisibility(8);
            m.setEnabledListener(null);
        }
          goto _L5
    }

    protected ImageView getAlbumArt()
    {
        return g;
    }

    protected TextView getArtist()
    {
        return h;
    }

    protected int getLayoutResId()
    {
        return 0x7f0400b7;
    }

    protected TextView getTitle()
    {
        return i;
    }

    public aa getTrackData()
    {
        return k;
    }

    public String getTrackKey()
    {
        return w;
    }

    public void h()
    {
        if (r() && m())
        {
            H.removeCallbacks(I);
            I.run();
        }
        if (B != null)
        {
            B.r();
        }
    }

    public void i()
    {
    }

    public void j()
    {
        l();
        if (r() && m())
        {
            if (d != null)
            {
                d.setLayoutTransition(null);
            }
            G.b();
            H.postDelayed(I, getResources().getInteger(0x7f0c0009));
        }
        g_();
    }

    public boolean k()
    {
        return k != null && k.equals(l);
    }

    public void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (isInEditMode())
        {
            return;
        } else
        {
            b.a.b().b(e);
            b.a.e().c(e);
            return;
        }
    }

    public void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        if (!isInEditMode())
        {
            b.a.b().c(e);
            b.a.e().b(e);
            b.a.c().e();
            if (!com.pandora.android.util.s.a(F))
            {
                H.removeCallbacks(I);
            }
            if (G != null)
            {
                G.a();
                return;
            }
        }
    }

    protected void setCoachmarkManager(e e1)
    {
        G = e1;
    }

    public void setSelected(boolean flag)
    {
        while (getContext() == null || y == flag) 
        {
            return;
        }
        y = flag;
        if (y)
        {
            l();
        }
        g_();
    }

    protected void setTrackViewAvailableListener(com.pandora.android.activity.o.a a1)
    {
        A = a1;
    }

    protected void setTrackViewTransitionListener(com.pandora.android.activity.o.b b1)
    {
        B = b1;
    }

    public String toString()
    {
        if (k != null)
        {
            return k.s();
        } else
        {
            return "no track data";
        }
    }
}
