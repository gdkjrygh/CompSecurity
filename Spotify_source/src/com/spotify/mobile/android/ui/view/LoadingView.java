// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.view;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import gao;
import gax;

public class LoadingView extends FrameLayout
{

    private static gax l = new gax() {

        public final void a()
        {
        }

        public final long b()
        {
            return 0L;
        }

    };
    public gax a;
    public View b;
    public State c;
    private ProgressBar d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private Animation j;
    private Animation k;
    private Runnable m = new Runnable() {

        private LoadingView a;

        public final void run()
        {
            if (LoadingView.a(a) == State.b)
            {
                LoadingView.a(a, State.c);
                LoadingView.b(a);
                a.postDelayed(LoadingView.c(a), LoadingView.d(a).b());
            }
        }

            
            {
                a = LoadingView.this;
                super();
            }
    };
    private Runnable n = new Runnable() {

        private LoadingView a;

        public final void run()
        {
            if (LoadingView.a(a) == State.c || LoadingView.a(a) == State.d)
            {
                LoadingView.e(a);
            }
        }

            
            {
                a = LoadingView.this;
                super();
            }
    };
    private Runnable o = new Runnable() {

        private LoadingView a;

        public final void run()
        {
            final class _cls6
            {

                static final int a[];

                static 
                {
                    a = new int[State.values().length];
                    try
                    {
                        a[State.c.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror3) { }
                    try
                    {
                        a[State.d.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror2) { }
                    try
                    {
                        a[State.b.ordinal()] = 3;
                    }
                    catch (NoSuchFieldError nosuchfielderror1) { }
                    try
                    {
                        a[State.a.ordinal()] = 4;
                    }
                    catch (NoSuchFieldError nosuchfielderror)
                    {
                        return;
                    }
                }
            }

            switch (_cls6.a[LoadingView.a(a).ordinal()])
            {
            default:
                return;

            case 1: // '\001'
            case 2: // '\002'
                if (LoadingView.a(a) == State.c)
                {
                    LoadingView.f(a);
                }
                a.removeCallbacks(LoadingView.c(a));
                LoadingView.a(a, State.e);
                LoadingView.g(a);
                LoadingView.d(a).a();
                return;

            case 3: // '\003'
            case 4: // '\004'
                break;
            }
            if (LoadingView.a(a) == State.b)
            {
                a.removeCallbacks(LoadingView.h(a));
            }
            LoadingView.a(a, State.f);
            LoadingView.f(a);
            LoadingView.d(a).a();
            LoadingView.i(a);
        }

            
            {
                a = LoadingView.this;
                super();
            }
    };
    private android.view.animation.Animation.AnimationListener p = new android.view.animation.Animation.AnimationListener() {

        private LoadingView a;

        public final void onAnimationEnd(Animation animation)
        {
            if (animation == LoadingView.j(a))
            {
                if (LoadingView.a(a) == State.c)
                {
                    LoadingView.a(a, State.d);
                }
            } else
            if (animation == LoadingView.k(a))
            {
                LoadingView.a(a, State.f);
                LoadingView.i(a);
                return;
            }
        }

        public final void onAnimationRepeat(Animation animation)
        {
        }

        public final void onAnimationStart(Animation animation)
        {
        }

            
            {
                a = LoadingView.this;
                super();
            }
    };

    public LoadingView(Context context)
    {
        this(context, null, 0);
    }

    public LoadingView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public LoadingView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        a = l;
        e = getResources().getInteger(0x7f0e0010);
        f = getResources().getInteger(0x7f0e0013);
        g = getResources().getInteger(0x7f0e0014);
        h = getResources().getInteger(0x7f0e0012);
        c = State.a;
    }

    static State a(LoadingView loadingview)
    {
        return loadingview.c;
    }

    static State a(LoadingView loadingview, State state)
    {
        loadingview.c = state;
        return state;
    }

    public static LoadingView a(LayoutInflater layoutinflater)
    {
        return (LoadingView)layoutinflater.inflate(0x7f0300d4, null);
    }

    public static LoadingView a(LayoutInflater layoutinflater, Context context, View view)
    {
        layoutinflater = (LoadingView)layoutinflater.inflate(0x7f0300d4, null);
        layoutinflater.b = view;
        layoutinflater.a = new gao(context, view);
        return layoutinflater;
    }

    static void b(LoadingView loadingview)
    {
        loadingview.j = new AlphaAnimation(0.0F, 1.0F);
        loadingview.j.setDuration(loadingview.f);
        loadingview.j.setAnimationListener(loadingview.p);
        loadingview.startAnimation(loadingview.j);
        loadingview.setVisibility(0);
    }

    static Runnable c(LoadingView loadingview)
    {
        return loadingview.n;
    }

    static gax d(LoadingView loadingview)
    {
        return loadingview.a;
    }

    static void e(LoadingView loadingview)
    {
        AlphaAnimation alphaanimation = new AlphaAnimation(0.0F, 1.0F);
        alphaanimation.setDuration(loadingview.f);
        loadingview.d.startAnimation(alphaanimation);
        loadingview.d.setVisibility(0);
    }

    static void f(LoadingView loadingview)
    {
        if (loadingview.b != null)
        {
            AlphaAnimation alphaanimation = new AlphaAnimation(0.0F, 1.0F);
            alphaanimation.setDuration(loadingview.h);
            loadingview.b.startAnimation(alphaanimation);
            loadingview.b.setVisibility(0);
        }
    }

    static void g(LoadingView loadingview)
    {
        loadingview.k = new AlphaAnimation((float)loadingview.i / 255F, 0.0F);
        loadingview.k.setFillAfter(true);
        loadingview.k.setFillEnabled(true);
        loadingview.k.setDuration(loadingview.g);
        loadingview.k.setAnimationListener(loadingview.p);
        loadingview.startAnimation(loadingview.k);
    }

    static Runnable h(LoadingView loadingview)
    {
        return loadingview.m;
    }

    static void i(LoadingView loadingview)
    {
        loadingview.setVisibility(8);
    }

    static Animation j(LoadingView loadingview)
    {
        return loadingview.j;
    }

    static Animation k(LoadingView loadingview)
    {
        return loadingview.k;
    }

    public final void a()
    {
        a(e);
    }

    public final void a(int i1)
    {
        if (c == State.a)
        {
            c = State.b;
            postDelayed(m, i1);
        }
    }

    public final void b()
    {
        post(o);
    }

    public final void c()
    {
        removeCallbacks(m);
        removeCallbacks(n);
        removeCallbacks(o);
        setAnimation(null);
        d.setAnimation(null);
        if (b != null)
        {
            b.setAnimation(null);
        }
        setVisibility(8);
        d.setVisibility(4);
        c = State.a;
    }

    public final boolean d()
    {
        return c == State.b || c == State.c || c == State.d;
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        d = (ProgressBar)findViewById(0x7f110341);
    }

    protected boolean onSetAlpha(int i1)
    {
        i = i1;
        return super.onSetAlpha(i1);
    }


    private class State extends Enum
    {

        public static final State a;
        public static final State b;
        public static final State c;
        public static final State d;
        public static final State e;
        public static final State f;
        private static final State g[];

        public static State valueOf(String s)
        {
            return (State)Enum.valueOf(com/spotify/mobile/android/ui/view/LoadingView$State, s);
        }

        public static State[] values()
        {
            return (State[])g.clone();
        }

        static 
        {
            a = new State("WAITING_TO_BE_SHOWN", 0);
            b = new State("WAITING_TO_START_FADE_IN", 1);
            c = new State("FADING_IN", 2);
            d = new State("FULLY_VISIBLE", 3);
            e = new State("FADING_OUT", 4);
            f = new State("VISIBILITY_SET_TO_GONE", 5);
            g = (new State[] {
                a, b, c, d, e, f
            });
        }

        private State(String s, int i1)
        {
            super(s, i1);
        }
    }

}
