// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.videochat.view;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

public class QuickSnapOnboardingOverlay extends LinearLayout
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        private static final a d[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/snapchat/videochat/view/QuickSnapOnboardingOverlay$a, s);
        }

        public static a[] values()
        {
            return (a[])d.clone();
        }

        static 
        {
            a = new a("MODE_BLINK", 0);
            b = new a("MODE_SOLID", 1);
            c = new a("MODE_SOLID_EXPIRE", 2);
            d = (new a[] {
                a, b, c
            });
        }

        private a(String s, int i)
        {
            super(s, i);
        }
    }


    private static int a = -1;
    private final Handler b = new Handler();
    private final FrameLayout c;
    private final FrameLayout d;
    private a e;
    private boolean f;
    private final Runnable g = new Runnable() {

        private QuickSnapOnboardingOverlay a;

        public final void run()
        {
            QuickSnapOnboardingOverlay.a(a, a.a);
            ViewPropertyAnimator viewpropertyanimator = a.animate();
            viewpropertyanimator.alpha(0.0F);
            viewpropertyanimator.setDuration(2000L);
            viewpropertyanimator.start();
        }

            
            {
                a = QuickSnapOnboardingOverlay.this;
                super();
            }
    };

    public QuickSnapOnboardingOverlay(Context context)
    {
        super(context);
        e = a.b;
        View view = ((LayoutInflater)context.getSystemService("layout_inflater")).inflate(Vl.f.quick_snap_onboarding, this, true);
        if (view == null)
        {
            throw new NullPointerException();
        }
        view.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        if (a == -1)
        {
            a = context.getResources().getColor(Vl.a.quicksnap_overlay_grey);
        }
        c = (FrameLayout)findViewById(Vl.d.quicksnap_upper_region);
        d = (FrameLayout)findViewById(Vl.d.quicksnap_lower_region);
    }

    static a a(QuickSnapOnboardingOverlay quicksnaponboardingoverlay, a a1)
    {
        quicksnaponboardingoverlay.e = a1;
        return a1;
    }

    public void setHeightThreshold(int i)
    {
        android.view.ViewGroup.LayoutParams layoutparams = c.getLayoutParams();
        if (layoutparams == null)
        {
            throw new NullPointerException();
        } else
        {
            layoutparams.height = i;
            c.setLayoutParams(layoutparams);
            return;
        }
    }

    public void setOverlayMode(a a1)
    {
        e = a1;
        b.removeCallbacks(g);
        static final class _cls2
        {

            static final int a[];

            static 
            {
                a = new int[a.values().length];
                try
                {
                    a[a.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[a.c.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[a.b.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls2.a[e.ordinal()])
        {
        default:
            throw new RuntimeException((new StringBuilder("Unexpected OverlayMode")).append(e).toString());

        case 1: // '\001'
            setAlpha(0.0F);
            return;

        case 2: // '\002'
            b.postDelayed(g, 6000L);
            setAlpha(1.0F);
            return;

        case 3: // '\003'
            setAlpha(1.0F);
            break;
        }
    }

    public void setUpperRegionHighlight(boolean flag)
    {
        if (flag != f)
        {
            f = flag;
            FrameLayout framelayout = c;
            int i;
            if (flag)
            {
                i = 0;
            } else
            {
                i = a;
            }
            framelayout.setBackgroundColor(i);
            framelayout = d;
            if (flag)
            {
                i = a;
            } else
            {
                i = 0;
            }
            framelayout.setBackgroundColor(i);
            if (e == a.a)
            {
                AnimatorSet animatorset = new AnimatorSet();
                ObjectAnimator objectanimator = ObjectAnimator.ofFloat(this, "alpha", new float[] {
                    getAlpha(), 1.0F
                }).setDuration(500L);
                ObjectAnimator objectanimator1 = ObjectAnimator.ofFloat(this, "alpha", new float[] {
                    1.0F, 0.0F
                }).setDuration(500L);
                animatorset.play(objectanimator).before(objectanimator1);
                animatorset.start();
                return;
            }
        }
    }

}
