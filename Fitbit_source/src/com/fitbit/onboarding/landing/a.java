// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.onboarding.landing;

import android.graphics.Point;
import android.view.Display;
import android.view.WindowManager;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.TranslateAnimation;
import com.fitbit.FitBitApplication;

// Referenced classes of package com.fitbit.onboarding.landing:
//            CaptionView

public class com.fitbit.onboarding.landing.a
{
    public static class a
    {

        public static final int a = 0;
        public final int b;
        public final int c;

        public a(int i, int j)
        {
            b = i;
            c = j;
        }
    }


    private static final int a = d();
    private final Interpolator b = new AccelerateDecelerateInterpolator();
    private a c[];
    private CaptionView d;
    private CaptionView e;
    private int f;

    public com.fitbit.onboarding.landing.a(a aa[], CaptionView captionview, CaptionView captionview1)
    {
        c = aa;
        d = captionview;
        e = captionview1;
        c();
    }

    static void a(com.fitbit.onboarding.landing.a a1)
    {
        a1.e();
    }

    private void c()
    {
        d.setLayerType(2, null);
        e.setLayerType(2, null);
    }

    private static int d()
    {
        WindowManager windowmanager = (WindowManager)FitBitApplication.a().getSystemService("window");
        if (com.fitbit.util.b.a.a(17))
        {
            Point point = new Point();
            windowmanager.getDefaultDisplay().getRealSize(point);
            return point.x;
        } else
        {
            return windowmanager.getDefaultDisplay().getWidth();
        }
    }

    private void e()
    {
        d.setVisibility(8);
        CaptionView captionview = e;
        e = d;
        d = captionview;
        f = f + 1;
        if (f == c.length)
        {
            f = 0;
        }
        f();
    }

    private void f()
    {
        d.a(c[f]);
        int j = f + 1;
        int i = j;
        if (j == c.length)
        {
            i = 0;
        }
        e.a(c[i]);
    }

    public void a()
    {
        f = 0;
        d.a(c[0]);
        d.invalidate();
        d.setVisibility(0);
        d.clearAnimation();
        d.setAnimation(null);
        e.a(c[1]);
        e.invalidate();
        e.setVisibility(8);
        e.clearAnimation();
        e.setAnimation(null);
    }

    public void b()
    {
        TranslateAnimation translateanimation = new TranslateAnimation(0.0F, -a, 0.0F, 0.0F);
        translateanimation.setDuration(1000L);
        translateanimation.setInterpolator(b);
        translateanimation.setAnimationListener(new android.view.animation.Animation.AnimationListener() {

            final com.fitbit.onboarding.landing.a a;

            public void onAnimationEnd(Animation animation)
            {
                com.fitbit.onboarding.landing.a.a(a);
            }

            public void onAnimationRepeat(Animation animation)
            {
            }

            public void onAnimationStart(Animation animation)
            {
            }

            
            {
                a = com.fitbit.onboarding.landing.a.this;
                super();
            }
        });
        d.setAnimation(translateanimation);
        translateanimation = new TranslateAnimation(a, 0.0F, 0.0F, 0.0F);
        translateanimation.setDuration(1000L);
        translateanimation.setInterpolator(b);
        e.setVisibility(0);
        e.setAnimation(translateanimation);
    }

}
