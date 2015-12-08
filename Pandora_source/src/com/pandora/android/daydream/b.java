// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.daydream;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.pandora.android.util.ThumbImageButton;
import com.pandora.android.util.ae;
import com.pandora.android.view.TextClock;
import com.pandora.android.view.c;
import com.pandora.radio.data.aa;
import com.pandora.radio.data.o;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import p.cm.t;
import p.cx.p;

// Referenced classes of package com.pandora.android.daydream:
//            LightshowView, a, DaydreamService

public class com.pandora.android.daydream.b
{
    private class a extends t
    {

        final com.pandora.android.daydream.b a;
        private boolean b;

        protected void a(Bitmap bitmap)
        {
        }

        protected void b(Bitmap bitmap)
        {
            if (bitmap == null)
            {
                return;
            } else
            {
                a.a(bitmap, b);
                return;
            }
        }

        protected void onCancelled(Object obj)
        {
            a((Bitmap)obj);
        }

        protected void onPostExecute(Object obj)
        {
            b((Bitmap)obj);
        }

        private a(boolean flag)
        {
            a = com.pandora.android.daydream.b.this;
            super();
            b = flag;
        }

    }

    public static final class b extends Enum
    {

        public static final b a;
        public static final b b;
        public static final b c;
        public static final b d;
        private static final b e[];

        public static b valueOf(String s1)
        {
            return (b)Enum.valueOf(com/pandora/android/daydream/b$b, s1);
        }

        public static b[] values()
        {
            return (b[])e.clone();
        }

        static 
        {
            a = new b("HIDE", 0);
            b = new b("STOP", 1);
            c = new b("SHOW", 2);
            d = new b("RETURN", 3);
            e = (new b[] {
                a, b, c, d
            });
        }

        private b(String s1, int i1)
        {
            super(s1, i1);
        }
    }

    public static final class c extends Enum
    {

        public static final c a;
        public static final c b;
        private static final c c[];

        public static c valueOf(String s1)
        {
            return (c)Enum.valueOf(com/pandora/android/daydream/b$c, s1);
        }

        public static c[] values()
        {
            return (c[])c.clone();
        }

        static 
        {
            a = new c("ACTIVE", 0);
            b = new c("INACTIVE", 1);
            c = (new c[] {
                a, b
            });
        }

        private c(String s1, int i1)
        {
            super(s1, i1);
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
        private static final d g[];

        public static d valueOf(String s1)
        {
            return (d)Enum.valueOf(com/pandora/android/daydream/b$d, s1);
        }

        public static d[] values()
        {
            return (d[])g.clone();
        }

        static 
        {
            a = new d("PAUSED", 0);
            b = new d("TIME_OUT", 1);
            c = new d("NO_STATION_SELECTED", 2);
            d = new d("NOT_LOGGED_IN", 3);
            e = new d("NON_SUBSCRIBER", 4);
            f = new d("NONE", 5);
            g = (new d[] {
                a, b, c, d, e, f
            });
        }

        private d(String s1, int i1)
        {
            super(s1, i1);
        }
    }


    private static final SimpleDateFormat a;
    private TextView A;
    private TextView B;
    private ProgressBar C;
    private long D;
    private int E;
    private p.cw.c F;
    private Date G;
    private a.a H;
    private boolean I;
    private boolean J;
    private boolean K;
    private a L;
    private Context b;
    private View c;
    private android.view.View.OnClickListener d;
    private android.view.View.OnClickListener e;
    private LightshowView f;
    private ImageView g;
    private ImageView h;
    private RelativeLayout i;
    private ImageView j;
    private ImageButton k;
    private TextView l;
    private Button m;
    private RelativeLayout n;
    private ViewGroup o;
    private ViewGroup p;
    private ViewGroup q;
    private RelativeLayout r;
    private TextClock s;
    private ThumbImageButton t;
    private ThumbImageButton u;
    private ImageButton v;
    private ImageButton w;
    private TextView x;
    private TextView y;
    private TextView z;

    public com.pandora.android.daydream.b(Context context, View view)
    {
        I = false;
        J = false;
        K = false;
        b = context;
        c = view;
        F = com.pandora.android.provider.b.a.b();
        f = (LightshowView)c.findViewById(0x7f100131);
        g = (ImageView)c.findViewById(0x7f100132);
        h = (ImageView)c.findViewById(0x7f100133);
        g.setImageDrawable(new com.pandora.android.view.c());
        H = new a.a(g);
    }

    static ImageView a(com.pandora.android.daydream.b b1)
    {
        return b1.g;
    }

    private void a(Bitmap bitmap)
    {
        h.setImageBitmap(bitmap);
        com.pandora.android.daydream.a.a(h, new Runnable(bitmap) {

            final Bitmap a;
            final com.pandora.android.daydream.b b;

            public void run()
            {
                com.pandora.android.daydream.b.a(b).setImageBitmap(a);
                com.pandora.android.daydream.b.a(b).setScrollX(com.pandora.android.daydream.b.b(b).getScrollX());
                com.pandora.android.daydream.b.a(b).setScrollY(com.pandora.android.daydream.b.b(b).getScrollY());
                com.pandora.android.daydream.b.a(b).setVisibility(0);
                com.pandora.android.daydream.b.b(b).setVisibility(4);
                com.pandora.android.daydream.b.c(b).c();
                com.pandora.android.daydream.b.c(b).a(a.getWidth(), a.getHeight());
                com.pandora.android.daydream.b.c(b).b();
            }

            
            {
                b = com.pandora.android.daydream.b.this;
                a = bitmap;
                super();
            }
        }, h.getRight());
    }

    private void a(b b1)
    {
        if (n == null)
        {
            f();
        }
        n.setOnClickListener(d);
        static class _cls2
        {

            static final int a[];
            static final int b[];
            static final int c[];

            static 
            {
                c = new int[d.values().length];
                try
                {
                    c[d.b.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                try
                {
                    c[com.pandora.android.daydream.d.c.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    c[d.d.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    c[d.e.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                b = new int[b.values().length];
                try
                {
                    b[com.pandora.android.daydream.b.c.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    b[b.a.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    b[b.d.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    b[b.b.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                a = new int[c.values().length];
                try
                {
                    a[c.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[c.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls2.b[b1.ordinal()];
        JVM INSTR tableswitch 1 4: default 60
    //                   1 61
    //                   2 71
    //                   3 76
    //                   4 163;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        return;
_L2:
        b(true);
        j();
        return;
_L3:
        k();
        return;
_L4:
        b(true);
        j();
        if (i != null)
        {
            i.setVisibility(8);
        }
        g.setImageDrawable(null);
        g.setVisibility(0);
        g.setAlpha(1.0F);
        if (F.d().s() != null)
        {
            a(F.d().s());
            a(((Bitmap) (null)), true);
            return;
        }
          goto _L1
_L5:
        b(false);
        return;
    }

    static boolean a(com.pandora.android.daydream.b b1, boolean flag)
    {
        b1.K = flag;
        return flag;
    }

    static ImageView b(com.pandora.android.daydream.b b1)
    {
        return b1.h;
    }

    private void b(b b1)
    {
        boolean flag = DaydreamService.a();
        if (i == null)
        {
            g();
        }
        if (n != null)
        {
            n.setVisibility(8);
            n.setOnClickListener(null);
        }
        i.setVisibility(0);
        j.setVisibility(0);
        g.setVisibility(8);
        h.setVisibility(8);
        if (flag)
        {
            i.setOnClickListener(e);
            j.setOnClickListener(e);
            k.setOnClickListener(e);
            if (F.d().u() == p.cw.a.c)
            {
                k.setVisibility(0);
                l.setVisibility(8);
                m.setVisibility(8);
            } else
            {
                k.setVisibility(8);
                l.setVisibility(0);
                m.setVisibility(0);
            }
            c();
        } else
        {
            i.setOnClickListener(null);
            j.setOnClickListener(null);
            k.setOnClickListener(null);
            k.setVisibility(8);
            m.setVisibility(0);
            c();
        }
        c(b1);
    }

    static boolean b(com.pandora.android.daydream.b b1, boolean flag)
    {
        b1.I = flag;
        return flag;
    }

    static a.a c(com.pandora.android.daydream.b b1)
    {
        return b1.H;
    }

    private void c(b b1)
    {
        if (i == null)
        {
            g();
        }
        switch (_cls2.b[b1.ordinal()])
        {
        default:
            return;

        case 2: // '\002'
            com.pandora.android.daydream.a.b(i, new Runnable() {

                final com.pandora.android.daydream.b a;

                public void run()
                {
                    com.pandora.android.daydream.b.c(a, false);
                    com.pandora.android.daydream.b.j(a).setOnClickListener(null);
                    com.pandora.android.daydream.b.k(a).setOnClickListener(null);
                }

            
            {
                a = com.pandora.android.daydream.b.this;
                super();
            }
            });
            return;

        case 4: // '\004'
            com.pandora.android.daydream.a.b(i, new Runnable() {

                final com.pandora.android.daydream.b a;

                public void run()
                {
                    com.pandora.android.daydream.b.c(a, false);
                    com.pandora.android.daydream.b.l(a).b();
                    com.pandora.android.daydream.b.k(a).setOnClickListener(null);
                }

            
            {
                a = com.pandora.android.daydream.b.this;
                super();
            }
            });
            return;

        case 1: // '\001'
            com.pandora.android.daydream.a.a(i, new Runnable() {

                final com.pandora.android.daydream.b a;

                public void run()
                {
                    com.pandora.android.daydream.b.c(a, true);
                    if (com.pandora.android.daydream.b.m(a).d().u() == p.cw.a.c)
                    {
                        com.pandora.android.daydream.b.k(a).setOnClickListener(com.pandora.android.daydream.b.n(a));
                        return;
                    } else
                    {
                        com.pandora.android.daydream.b.j(a).setOnClickListener(com.pandora.android.daydream.b.n(a));
                        return;
                    }
                }

            
            {
                a = com.pandora.android.daydream.b.this;
                super();
            }
            });
            return;

        case 3: // '\003'
            com.pandora.android.daydream.a.b(g, new Runnable() {

                final com.pandora.android.daydream.b a;

                public void run()
                {
                    com.pandora.android.daydream.b.c(a).c();
                    com.pandora.android.daydream.b.a(a).setVisibility(4);
                }

            
            {
                a = com.pandora.android.daydream.b.this;
                super();
            }
            });
            com.pandora.android.daydream.a.a(i, new Runnable() {

                final com.pandora.android.daydream.b a;

                public void run()
                {
                    com.pandora.android.daydream.b.c(a, true);
                }

            
            {
                a = com.pandora.android.daydream.b.this;
                super();
            }
            });
            return;
        }
    }

    static boolean c(com.pandora.android.daydream.b b1, boolean flag)
    {
        b1.J = flag;
        return flag;
    }

    static RelativeLayout d(com.pandora.android.daydream.b b1)
    {
        return b1.n;
    }

    static Context e(com.pandora.android.daydream.b b1)
    {
        return b1.b;
    }

    static RelativeLayout f(com.pandora.android.daydream.b b1)
    {
        return b1.r;
    }

    private void f()
    {
        n = (RelativeLayout)((ViewStub)c.findViewById(0x7f100136)).inflate();
        r = (RelativeLayout)n.findViewById(0x7f10013a);
        s = (TextClock)n.findViewById(0x7f10013c);
        q = (ViewGroup)n.findViewById(0x7f10013d);
        t = (ThumbImageButton)n.findViewById(0x7f10013e);
        u = (ThumbImageButton)n.findViewById(0x7f10013f);
        v = (ImageButton)n.findViewById(0x7f100140);
        w = (ImageButton)n.findViewById(0x7f100141);
        p = (ViewGroup)n.findViewById(0x7f100146);
        x = (TextView)n.findViewById(0x7f100147);
        y = (TextView)n.findViewById(0x7f100148);
        z = (TextView)n.findViewById(0x7f100149);
        o = (ViewGroup)n.findViewById(0x7f100142);
        A = (TextView)n.findViewById(0x7f100143);
        B = (TextView)n.findViewById(0x7f100145);
        C = (ProgressBar)n.findViewById(0x7f100144);
        t.setOnClickListener(d);
        u.setOnClickListener(d);
        v.setOnClickListener(d);
        w.setOnClickListener(d);
    }

    static ViewGroup g(com.pandora.android.daydream.b b1)
    {
        return b1.p;
    }

    private void g()
    {
        i = (RelativeLayout)((ViewStub)c.findViewById(0x7f100134)).inflate();
        j = (ImageView)i.findViewById(0x7f10014a);
        k = (ImageButton)i.findViewById(0x7f10014d);
        l = (TextView)i.findViewById(0x7f10014b);
        m = (Button)i.findViewById(0x7f10014c);
    }

    static ViewGroup h(com.pandora.android.daydream.b b1)
    {
        return b1.o;
    }

    private void h()
    {
        if (I)
        {
            a(b.a);
            return;
        } else
        {
            a(com.pandora.android.daydream.b.c);
            return;
        }
    }

    static ViewGroup i(com.pandora.android.daydream.b b1)
    {
        return b1.q;
    }

    private void i()
    {
        if (J)
        {
            b(b.a);
            return;
        } else
        {
            b(com.pandora.android.daydream.b.c);
            return;
        }
    }

    static Button j(com.pandora.android.daydream.b b1)
    {
        return b1.m;
    }

    private void j()
    {
        if (!K)
        {
            n.getViewTreeObserver().addOnGlobalLayoutListener(new android.view.ViewTreeObserver.OnGlobalLayoutListener() {

                final com.pandora.android.daydream.b a;

                public void onGlobalLayout()
                {
                    long l3 = 400L;
                    long l2 = 700L;
                    ObjectAnimator objectanimator;
                    ObjectAnimator objectanimator1;
                    ObjectAnimator objectanimator2;
                    ObjectAnimator objectanimator3;
                    ValueAnimator valueanimator;
                    AnimatorSet animatorset;
                    boolean flag;
                    int i1;
                    long l1;
                    if (android.os.Build.VERSION.SDK_INT < 16)
                    {
                        com.pandora.android.daydream.b.d(a).getViewTreeObserver().removeGlobalOnLayoutListener(this);
                    } else
                    {
                        com.pandora.android.daydream.b.d(a).getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    }
                    com.pandora.android.daydream.b.a(a, true);
                    com.pandora.android.daydream.b.d(a).setVisibility(0);
                    if (com.pandora.android.daydream.b.e(a).getResources().getConfiguration().orientation == 1)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    i1 = com.pandora.android.daydream.b.a(a).getBottom();
                    objectanimator = com.pandora.android.daydream.a.a(com.pandora.android.daydream.b.f(a), -com.pandora.android.daydream.b.f(a).getHeight(), com.pandora.android.daydream.b.f(a).getTop());
                    if (flag)
                    {
                        l1 = 700L;
                    } else
                    {
                        l1 = 500L;
                    }
                    objectanimator = objectanimator.setDuration(l1);
                    objectanimator1 = com.pandora.android.daydream.a.a(com.pandora.android.daydream.b.g(a), i1, com.pandora.android.daydream.b.g(a).getTop());
                    if (flag)
                    {
                        l1 = 500L;
                    } else
                    {
                        l1 = 400L;
                    }
                    objectanimator1 = objectanimator1.setDuration(l1);
                    objectanimator2 = com.pandora.android.daydream.a.a(com.pandora.android.daydream.b.h(a), i1, com.pandora.android.daydream.b.h(a).getTop());
                    l1 = l3;
                    if (flag)
                    {
                        l1 = 600L;
                    }
                    objectanimator2 = objectanimator2.setDuration(l1);
                    objectanimator3 = com.pandora.android.daydream.a.a(com.pandora.android.daydream.b.i(a), i1, com.pandora.android.daydream.b.i(a).getTop());
                    if (flag)
                    {
                        l1 = 700L;
                    } else
                    {
                        l1 = 500L;
                    }
                    objectanimator3 = objectanimator3.setDuration(l1);
                    valueanimator = com.pandora.android.daydream.a.a(0, 0x99000000);
                    if (flag)
                    {
                        l1 = l2;
                    } else
                    {
                        l1 = 500L;
                    }
                    valueanimator = valueanimator.setDuration(l1);
                    valueanimator.setEvaluator(new ArgbEvaluator());
                    valueanimator.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener(this) {

                        final _cls3 a;

                        public void onAnimationUpdate(ValueAnimator valueanimator)
                        {
                            com.pandora.android.daydream.b.a(a.a).setColorFilter(((Integer)valueanimator.getAnimatedValue()).intValue());
                            com.pandora.android.daydream.b.b(a.a).setColorFilter(((Integer)valueanimator.getAnimatedValue()).intValue());
                        }

            
            {
                a = _pcls3;
                super();
            }
                    });
                    animatorset = new AnimatorSet();
                    animatorset.playTogether(new Animator[] {
                        objectanimator, objectanimator1, objectanimator2, objectanimator3, valueanimator
                    });
                    animatorset.setInterpolator(new DecelerateInterpolator(1.7F));
                    animatorset.addListener(new AnimatorListenerAdapter(this) {

                        final _cls3 a;

                        public void onAnimationEnd(Animator animator)
                        {
                            com.pandora.android.daydream.b.b(a.a, true);
                            com.pandora.android.daydream.b.a(a.a, false);
                        }

            
            {
                a = _pcls3;
                super();
            }
                    });
                    animatorset.start();
                }

            
            {
                a = com.pandora.android.daydream.b.this;
                super();
            }
            });
        }
    }

    static ImageButton k(com.pandora.android.daydream.b b1)
    {
        return b1.k;
    }

    private void k()
    {
        long l2 = 700L;
        if (!K)
        {
            K = true;
            ObjectAnimator objectanimator;
            ObjectAnimator objectanimator1;
            ObjectAnimator objectanimator2;
            ObjectAnimator objectanimator3;
            ValueAnimator valueanimator;
            AnimatorSet animatorset;
            boolean flag;
            int i1;
            long l1;
            if (b.getResources().getConfiguration().orientation == 1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            i1 = g.getBottom();
            objectanimator = com.pandora.android.daydream.a.a(r, r.getTop(), -r.getHeight());
            if (!flag);
            objectanimator = objectanimator.setDuration(500L);
            objectanimator1 = com.pandora.android.daydream.a.a(p, p.getTop(), i1);
            if (flag)
            {
                l1 = 700L;
            } else
            {
                l1 = 500L;
            }
            objectanimator1 = objectanimator1.setDuration(l1);
            objectanimator2 = com.pandora.android.daydream.a.a(o, o.getTop(), i1);
            if (flag)
            {
                l1 = 600L;
            } else
            {
                l1 = 400L;
            }
            objectanimator2 = objectanimator2.setDuration(l1);
            objectanimator3 = com.pandora.android.daydream.a.a(q, q.getTop(), i1);
            if (!flag);
            objectanimator3 = objectanimator3.setDuration(500L);
            valueanimator = com.pandora.android.daydream.a.a(0x99000000, 0);
            if (flag)
            {
                l1 = l2;
            } else
            {
                l1 = 500L;
            }
            valueanimator = valueanimator.setDuration(l1);
            valueanimator.setEvaluator(new ArgbEvaluator());
            valueanimator.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

                final com.pandora.android.daydream.b a;

                public void onAnimationUpdate(ValueAnimator valueanimator1)
                {
                    com.pandora.android.daydream.b.a(a).setColorFilter(((Integer)valueanimator1.getAnimatedValue()).intValue());
                    com.pandora.android.daydream.b.b(a).setColorFilter(((Integer)valueanimator1.getAnimatedValue()).intValue());
                }

            
            {
                a = com.pandora.android.daydream.b.this;
                super();
            }
            });
            animatorset = new AnimatorSet();
            animatorset.playTogether(new Animator[] {
                objectanimator, objectanimator1, objectanimator2, objectanimator3, valueanimator
            });
            animatorset.setInterpolator(new AccelerateInterpolator(1.7F));
            animatorset.addListener(new AnimatorListenerAdapter() {

                final com.pandora.android.daydream.b a;

                public void onAnimationEnd(Animator animator)
                {
                    com.pandora.android.daydream.b.a(a, false);
                    com.pandora.android.daydream.b.b(a, false);
                    com.pandora.android.daydream.b.a(a).clearColorFilter();
                    com.pandora.android.daydream.b.b(a).clearColorFilter();
                }

            
            {
                a = com.pandora.android.daydream.b.this;
                super();
            }
            });
            animatorset.start();
        }
    }

    static LightshowView l(com.pandora.android.daydream.b b1)
    {
        return b1.f;
    }

    static p.cw.c m(com.pandora.android.daydream.b b1)
    {
        return b1.F;
    }

    static android.view.View.OnClickListener n(com.pandora.android.daydream.b b1)
    {
        return b1.e;
    }

    public void a()
    {
        if (DaydreamService.a() && n == null)
        {
            f();
        } else
        if (i == null)
        {
            g();
            return;
        }
    }

    public void a(int i1, aa aa1)
    {
        ae.a(i1, t, u, aa1);
    }

    public void a(long l1, int i1)
    {
        D = l1;
        E = i1;
        if (G == null)
        {
            G = new Date();
        }
        i1 = (int)D;
        C.setMax(i1 / 1000);
        C.setProgress(E / 1000);
        G.setTime(E);
        A.setText(a.format(G));
        G.setTime(D - (long)E);
        B.setText((new StringBuilder()).append("-").append(a.format(G)).toString());
    }

    public void a(Bitmap bitmap, boolean flag)
    {
        if (bitmap == null)
        {
            H.c();
            g.setImageDrawable(new com.pandora.android.view.c());
            g.setVisibility(0);
            bitmap = F.d().s();
            if (bitmap != null)
            {
                bitmap = bitmap.v();
            } else
            {
                bitmap = null;
            }
            if (L != null && L.getStatus() != android.os.AsyncTask.Status.FINISHED)
            {
                L.cancel(true);
            }
            L = new a(flag);
            L.execute(new String[] {
                bitmap, "DaydreamViewManager"
            });
            return;
        }
        if (flag)
        {
            a(bitmap);
            return;
        } else
        {
            h.setImageBitmap(bitmap);
            g.setImageBitmap(bitmap);
            H.c();
            H.a(bitmap.getWidth(), bitmap.getHeight());
            H.b();
            return;
        }
    }

    public void a(android.view.View.OnClickListener onclicklistener)
    {
        d = onclicklistener;
    }

    public void a(c c1)
    {
        switch (_cls2.a[c1.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            a(b.d);
            return;

        case 2: // '\002'
            b(b.d);
            break;
        }
    }

    public void a(c c1, b b1)
    {
        switch (_cls2.a[c1.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            a(b1);
            return;

        case 2: // '\002'
            b(b1);
            break;
        }
    }

    public void a(d d1)
    {
        if (i == null)
        {
            g();
        }
        if (n != null)
        {
            n.setOnClickListener(null);
        }
        k.setVisibility(8);
        k.setOnClickListener(null);
        com.pandora.android.daydream._cls2.c[d1.ordinal()];
        JVM INSTR tableswitch 1 4: default 80
    //                   1 81
    //                   2 175
    //                   3 223
    //                   4 271;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_271;
_L1:
        return;
_L2:
        l.setText(b.getString(0x7f08012e));
        m.setText(b.getString(0x7f08012c));
        m.setVisibility(0);
        m.setOnClickListener(e);
        i.setOnClickListener(e);
_L6:
        if (!J)
        {
            com.pandora.android.daydream.a.a(l, null, 200L);
            com.pandora.android.daydream.a.a(i, null, 200L);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        l.setText(b.getString(0x7f080127));
        m.setVisibility(8);
        m.setOnClickListener(null);
        i.setOnClickListener(e);
          goto _L6
_L4:
        l.setText(b.getString(0x7f080129));
        m.setVisibility(8);
        m.setOnClickListener(null);
        i.setOnClickListener(e);
          goto _L6
        l.setText(b.getString(0x7f080128));
        m.setText(b.getString(0x7f08012f));
        m.setVisibility(0);
        m.setOnClickListener(e);
        i.setOnClickListener(e);
          goto _L6
    }

    public void a(aa aa1)
    {
        int i1 = 0;
        if (aa1 != null)
        {
            a(D, E);
            x.setText(aa1.s());
            z.setText(aa1.u());
            y.setText(aa1.t());
            ae.a(aa1.E(), t, u, aa1);
            boolean flag;
            if (!F.d().o())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            ae.a(flag, v, 0x7f020236, 0x7f020233);
            aa1 = s;
            if (!F.j().r())
            {
                i1 = 4;
            }
            aa1.setVisibility(i1);
        }
    }

    public void a(boolean flag)
    {
        if (flag)
        {
            a(d.b);
            return;
        } else
        {
            m.setOnClickListener(null);
            m.setVisibility(8);
            return;
        }
    }

    public void b()
    {
        if (L != null)
        {
            L.cancel(true);
        }
    }

    public void b(android.view.View.OnClickListener onclicklistener)
    {
        e = onclicklistener;
    }

    public void b(c c1)
    {
        switch (_cls2.a[c1.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            h();
            return;

        case 2: // '\002'
            i();
            break;
        }
    }

    public void b(boolean flag)
    {
        t.setEnabled(flag);
        u.setEnabled(flag);
        v.setEnabled(flag);
        w.setEnabled(flag);
    }

    public d c()
    {
        if (com.pandora.android.provider.b.a.d() == null)
        {
            a(d.d);
            return d.d;
        }
        if (!DaydreamService.a())
        {
            a(d.e);
            return d.e;
        }
        if (F.z().b())
        {
            a(d.b);
            return d.b;
        }
        if (F.d().t() == null)
        {
            a(com.pandora.android.daydream.d.c);
            return com.pandora.android.daydream.d.c;
        } else
        {
            return d.f;
        }
    }

    public void d()
    {
        ae.a(u, null);
    }

    public void e()
    {
        ae.b(t, null);
    }

    static 
    {
        a = new SimpleDateFormat("m:ss", Locale.US);
        a.setTimeZone(TimeZone.getTimeZone("UTC"));
    }
}
