// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.countdown;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Handler;
import android.support.v4.content.j;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.pandora.android.activity.PandoraIntent;
import com.pandora.android.provider.b;
import com.pandora.android.util.s;
import com.pandora.android.view.AutoResizeTextView;
import com.pandora.android.view.e;
import p.df.a;

// Referenced classes of package com.pandora.android.countdown:
//            a, c, d

public class CountdownBarLayout extends FrameLayout
{
    public static interface a
    {

        public abstract void a();

        public abstract void b();

        public abstract void c();

        public abstract void d();
    }

    private class b
        implements Runnable
    {

        final CountdownBarLayout a;
        private int b;

        public void run()
        {
            int i1 = CountdownBarLayout.i(a);
            if (b >= i1)
            {
                CountdownBarLayout.d(a).postDelayed(CountdownBarLayout.c(a), com.pandora.android.countdown.CountdownBarLayout.a(a, com.pandora.android.countdown.CountdownBarLayout.a(a).g()));
                return;
            } else
            {
                b = b + 3;
                com.pandora.android.countdown.CountdownBarLayout.a(a, com.pandora.android.countdown.CountdownBarLayout.b(a), b);
                CountdownBarLayout.d(a).postDelayed(com.pandora.android.countdown.CountdownBarLayout.j(a), 5L);
                return;
            }
        }

        private b()
        {
            a = CountdownBarLayout.this;
            super();
            b = 0;
        }

    }

    private class c
    {

        final CountdownBarLayout a;
        private boolean b;

        public void a()
        {
            if (!b)
            {
                com.pandora.android.provider.b.a.e().c(CountdownBarLayout.h(a));
                com.pandora.android.provider.b.a.b().b(CountdownBarLayout.h(a));
                b = true;
            }
        }

        public void b()
        {
            if (b)
            {
                com.pandora.android.provider.b.a.e().b(CountdownBarLayout.h(a));
                com.pandora.android.provider.b.a.b().c(CountdownBarLayout.h(a));
                b = false;
            }
        }

        public void onCountdownBarUpdate(d d1)
        {
            Object obj = a;
            static class _cls5
            {

                static final int a[];

                static 
                {
                    a = new int[com.pandora.android.countdown.a.a.values().length];
                    try
                    {
                        a[com.pandora.android.countdown.a.a.b.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror2) { }
                    try
                    {
                        a[a.a.c.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror1) { }
                    try
                    {
                        a[com.pandora.android.countdown.a.a.a.ordinal()] = 3;
                    }
                    catch (NoSuchFieldError nosuchfielderror)
                    {
                        return;
                    }
                }
            }

            CountdownBarLayout countdownbarlayout;
            boolean flag;
            if (d1.b == com.pandora.android.countdown.a.a.b)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            com.pandora.android.countdown.CountdownBarLayout.a(((CountdownBarLayout) (obj)), flag);
            countdownbarlayout = a;
            if (com.pandora.android.countdown.CountdownBarLayout.e(a))
            {
                obj = d1.a;
            } else
            {
                obj = null;
            }
            CountdownBarLayout.c(countdownbarlayout, ((com.pandora.android.countdown.a) (obj)));
            p.df.a.a("CountdownBarLayout", (new StringBuilder()).append("onCountdownBarDataAppEvent. activeCountdown = ").append(com.pandora.android.countdown.CountdownBarLayout.e(a)).append("; countdownBarData = ").append(com.pandora.android.countdown.CountdownBarLayout.a(a)).toString());
            com.pandora.android.countdown._cls5.a[d1.b.ordinal()];
            JVM INSTR tableswitch 1 3: default 132
        //                       1 167
        //                       2 302
        //                       3 260;
               goto _L1 _L2 _L3 _L4
_L1:
            throw new IllegalArgumentException(String.format("State: %s is not supported", new Object[] {
                d1.b
            }));
_L2:
            if (!com.pandora.android.countdown.CountdownBarLayout.e(a) || com.pandora.android.countdown.CountdownBarLayout.a(a) == null || !com.pandora.android.countdown.CountdownBarLayout.a(a).h()) goto _L6; else goto _L5
_L5:
            if ((com.pandora.android.countdown.CountdownBarLayout.a(a).a() & CountdownBarLayout.f(a)) != CountdownBarLayout.f(a) && (com.pandora.android.countdown.CountdownBarLayout.a(a).a() & 0xf) != 15) goto _L8; else goto _L7
_L7:
            CountdownBarLayout.d(a, com.pandora.android.countdown.CountdownBarLayout.a(a));
_L4:
            return;
_L8:
            CountdownBarLayout.c(a, null);
            com.pandora.android.countdown.CountdownBarLayout.a(a, false);
            CountdownBarLayout.g(a);
            return;
_L6:
            com.pandora.android.countdown.CountdownBarLayout.a(a, com.pandora.android.countdown.CountdownBarLayout.a(a));
            return;
_L3:
            com.pandora.android.countdown.CountdownBarLayout.a(a, d1.a);
            return;
        }

        private c()
        {
            a = CountdownBarLayout.this;
            super();
        }

    }


    private Handler a;
    private e b;
    private ImageView c;
    private c d;
    private long e;
    private boolean f;
    private com.pandora.android.countdown.a g;
    private AutoResizeTextView h;
    private TextView i;
    private TextView j;
    private boolean k;
    private int l;
    private Runnable m;
    private Runnable n = new Runnable() {

        final CountdownBarLayout a;

        public void run()
        {
            if (com.pandora.android.countdown.CountdownBarLayout.a(a) == null)
            {
                com.pandora.android.countdown.CountdownBarLayout.a(a, null);
                return;
            }
            long l2 = com.pandora.android.countdown.CountdownBarLayout.a(a).g();
            p.df.a.a("CountdownBarLayout", (new StringBuilder()).append("countdownTimer secondsRemaining: ").append(l2).toString());
            long l1 = l2;
            if (l2 <= 0L)
            {
                l1 = 0L;
            }
            com.pandora.android.countdown.CountdownBarLayout.a(a, com.pandora.android.countdown.CountdownBarLayout.b(a));
            com.pandora.android.countdown.CountdownBarLayout.b(a, com.pandora.android.countdown.CountdownBarLayout.a(a));
            if (l1 > 0L)
            {
                CountdownBarLayout.d(a).postDelayed(CountdownBarLayout.c(a), com.pandora.android.countdown.CountdownBarLayout.a(a, l1));
                return;
            } else
            {
                p.df.a.a("CountdownBarLayout", "countdownTimer.run -> done");
                com.pandora.android.countdown.CountdownBarLayout.a(a, com.pandora.android.countdown.CountdownBarLayout.a(a));
                return;
            }
        }

            
            {
                a = CountdownBarLayout.this;
                super();
            }
    };
    private Runnable o = new Runnable() {

        final CountdownBarLayout a;

        public void run()
        {
            if (com.pandora.android.countdown.CountdownBarLayout.a(a) != null && com.pandora.android.countdown.CountdownBarLayout.a(a).c() != null)
            {
                com.pandora.android.countdown.CountdownBarLayout.a(a).c().b();
            }
            CountdownBarLayout.g(a);
        }

            
            {
                a = CountdownBarLayout.this;
                super();
            }
    };

    public CountdownBarLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        e = 0L;
        k = true;
        m = null;
        a(attributeset);
    }

    public CountdownBarLayout(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        e = 0L;
        k = true;
        m = null;
        a(attributeset);
    }

    private long a(long l1)
    {
        return Math.min(10000L, 1000L * l1);
    }

    static long a(CountdownBarLayout countdownbarlayout, long l1)
    {
        return countdownbarlayout.a(l1);
    }

    static com.pandora.android.countdown.a a(CountdownBarLayout countdownbarlayout)
    {
        return countdownbarlayout.g;
    }

    private String a(Object obj, long l1, long l2)
    {
        if (obj == null)
        {
            return null;
        }
        if (obj instanceof c.a)
        {
            return ((c.a)obj).a(l1, l2);
        } else
        {
            return (String)obj;
        }
    }

    private void a()
    {
        m = null;
        i.setText(null);
        j.setText(null);
        setVisibility(8);
    }

    private void a(AttributeSet attributeset)
    {
        a = new Handler();
        d = new c();
        if (attributeset == null)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        attributeset = getMyContext().obtainStyledAttributes(attributeset, com.pandora.android.R.styleable.CountdownBarLayout);
        k = attributeset.getBoolean(0, true);
        l = attributeset.getInt(1, 0);
        attributeset.recycle();
        LayoutInflater.from(getMyContext()).inflate(0x7f040043, this, true);
        c = (ImageView)findViewById(0x7f10011e);
        h = (AutoResizeTextView)findViewById(0x7f100120);
        attributeset = h;
        Exception exception;
        int i1;
        if (k)
        {
            i1 = 0;
        } else
        {
            i1 = 8;
        }
        attributeset.setVisibility(i1);
        h.setMaxLines(1);
        h.setAddEllipsis(false);
        attributeset = findViewById(0x7f10011f);
        if (attributeset != null)
        {
            attributeset.setOnClickListener(new android.view.View.OnClickListener() {

                final CountdownBarLayout a;

                public void onClick(View view)
                {
                    if (com.pandora.android.countdown.CountdownBarLayout.a(a) != null && com.pandora.android.countdown.CountdownBarLayout.a(a).c() != null)
                    {
                        com.pandora.android.countdown.CountdownBarLayout.a(a).c().d();
                    }
                }

            
            {
                a = CountdownBarLayout.this;
                super();
            }
            });
        }
        i = (TextView)findViewById(0x7f100121);
        j = (TextView)findViewById(0x7f100122);
        return;
        exception;
        attributeset.recycle();
        throw exception;
    }

    static void a(CountdownBarLayout countdownbarlayout, com.pandora.android.countdown.a a1)
    {
        countdownbarlayout.d(a1);
    }

    static void a(CountdownBarLayout countdownbarlayout, e e1)
    {
        countdownbarlayout.a(e1);
    }

    static void a(CountdownBarLayout countdownbarlayout, e e1, int i1)
    {
        countdownbarlayout.a(e1, i1);
    }

    private void a(com.pandora.android.countdown.a a1)
    {
        com.pandora.android.countdown.c c1 = a1.e();
        if (c1.e)
        {
            b = new e(getResources().getColor(0x7f0b0080), 1.0F, s.t());
            c.setImageDrawable(b);
            c.setVisibility(0);
        } else
        {
            c.setVisibility(8);
        }
        a(b, 0);
        b(a1);
        a.removeCallbacksAndMessages(null);
        if (c1.e)
        {
            if (m == null)
            {
                m = new b();
            }
            a.postDelayed(m, 5L);
        } else
        {
            a.postDelayed(n, 10000L);
        }
        setVisibility(0);
        if (a1.c() != null)
        {
            a1.c().a();
        }
    }

    private void a(e e1)
    {
        int i1 = getCurrentProgressPercent();
        p.df.a.a("CountdownBarLayout", (new StringBuilder()).append("countdownTimer updateLevel percentage: ").append(i1).toString());
        a(e1, i1);
    }

    private void a(e e1, int i1)
    {
        if (e1 != null && e1.setLevel(i1))
        {
            c.invalidate();
        }
    }

    static boolean a(CountdownBarLayout countdownbarlayout, boolean flag)
    {
        countdownbarlayout.f = flag;
        return flag;
    }

    static e b(CountdownBarLayout countdownbarlayout)
    {
        return countdownbarlayout.b;
    }

    static void b(CountdownBarLayout countdownbarlayout, com.pandora.android.countdown.a a1)
    {
        countdownbarlayout.c(a1);
    }

    private void b(com.pandora.android.countdown.a a1)
    {
        boolean flag = true;
        p.df.a.c("CountdownBarLayout", "updateDisplay");
        j.setTypeface(j.getTypeface(), 1);
        c(a1);
        Object obj = a1.e();
        if (!k || !((com.pandora.android.countdown.c) (obj)).d)
        {
            h.setVisibility(8);
            return;
        }
        if (((com.pandora.android.countdown.c) (obj)).c.length() <= 11)
        {
            flag = false;
        }
        if (flag)
        {
            obj = ((com.pandora.android.countdown.c) (obj)).c.subSequence(0, 11);
        } else
        {
            obj = ((com.pandora.android.countdown.c) (obj)).c;
        }
        setMoreButtonText(((CharSequence) (obj)));
        h.setVisibility(0);
        h.setOnClickListener(new android.view.View.OnClickListener(a1) {

            final com.pandora.android.countdown.a a;
            final CountdownBarLayout b;

            public void onClick(View view)
            {
                a.c().c();
            }

            
            {
                b = CountdownBarLayout.this;
                a = a1;
                super();
            }
        });
    }

    static com.pandora.android.countdown.a c(CountdownBarLayout countdownbarlayout, com.pandora.android.countdown.a a1)
    {
        countdownbarlayout.g = a1;
        return a1;
    }

    static Runnable c(CountdownBarLayout countdownbarlayout)
    {
        return countdownbarlayout.n;
    }

    private void c(com.pandora.android.countdown.a a1)
    {
        com.pandora.android.countdown.c c1 = a1.e();
        TextView textview = i;
        Context context = getContext();
        int i1;
        if (c1.a() > 0)
        {
            i1 = c1.a();
        } else
        {
            i1 = 0x7f0d0114;
        }
        textview.setTextAppearance(context, i1);
        i.setText(a(c1.a, a1.g(), a1.d()));
        if (c1.b == null)
        {
            j.setText("");
            j.setVisibility(8);
            return;
        } else
        {
            j.setText(a(c1.b, a1.g(), a1.d()));
            j.setVisibility(0);
            return;
        }
    }

    static Handler d(CountdownBarLayout countdownbarlayout)
    {
        return countdownbarlayout.a;
    }

    static void d(CountdownBarLayout countdownbarlayout, com.pandora.android.countdown.a a1)
    {
        countdownbarlayout.a(a1);
    }

    private void d(com.pandora.android.countdown.a a1)
    {
        this;
        JVM INSTR monitorenter ;
        if (a1 != null) goto _L2; else goto _L1
_L1:
        a();
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        com.pandora.android.countdown.c c1;
        com.pandora.android.provider.b.a.C().a(new PandoraIntent("hide_banner_ad"));
        c1 = a1.f();
        if (c1 == null)
        {
            break MISSING_BLOCK_LABEL_157;
        }
        j.setTypeface(j.getTypeface(), 0);
        i.setText(a(c1.a, a1.g(), a1.d()));
        j.setText(a(c1.b, a1.g(), a1.d()));
        i.setVisibility(0);
        j.setVisibility(0);
        h.setVisibility(8);
        setVisibility(0);
        a.postDelayed(o, getDisplayRewardEndTimeMs());
          goto _L3
        a1;
        throw a1;
        if (a1.c() != null)
        {
            a1.c().b();
        }
        a();
          goto _L3
    }

    static boolean e(CountdownBarLayout countdownbarlayout)
    {
        return countdownbarlayout.f;
    }

    static int f(CountdownBarLayout countdownbarlayout)
    {
        return countdownbarlayout.l;
    }

    static void g(CountdownBarLayout countdownbarlayout)
    {
        countdownbarlayout.a();
    }

    private int getCurrentProgressPercent()
    {
        return Math.round((100F * (float)g.g()) / (float)g.d());
    }

    private long getDisplayRewardEndTimeMs()
    {
        if (e > 0L)
        {
            return e;
        } else
        {
            return 10000L;
        }
    }

    private Context getMyContext()
    {
        Context context = getContext();
        if (context != null)
        {
            return context;
        } else
        {
            return com.pandora.android.provider.b.a.h();
        }
    }

    static c h(CountdownBarLayout countdownbarlayout)
    {
        return countdownbarlayout.d;
    }

    static int i(CountdownBarLayout countdownbarlayout)
    {
        return countdownbarlayout.getCurrentProgressPercent();
    }

    static Runnable j(CountdownBarLayout countdownbarlayout)
    {
        return countdownbarlayout.m;
    }

    private void setMoreButtonText(CharSequence charsequence)
    {
        Object obj = getMyContext().getResources();
        float f1 = ((Resources) (obj)).getDimensionPixelSize(0x7f090105);
        float f2 = ((Resources) (obj)).getDimensionPixelSize(0x7f090106);
        h.setMaxTextSize(f1);
        h.setMinTextSize(f2);
        h.setTextSize(f1);
        obj = "";
        if (android.os.Build.VERSION.SDK_INT <= 15)
        {
            obj = "\u2060";
        }
        h.setText((new StringBuilder()).append(charsequence.toString()).append(((String) (obj))).toString());
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (!isInEditMode())
        {
            d.a();
        }
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        if (!isInEditMode())
        {
            d.b();
        }
        a.removeCallbacksAndMessages(null);
    }
}
