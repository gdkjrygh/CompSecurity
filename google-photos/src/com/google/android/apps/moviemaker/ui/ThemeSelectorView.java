// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.moviemaker.ui;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateInterpolator;
import b;
import czx;
import dbl;
import dbm;
import dbo;

// Referenced classes of package com.google.android.apps.moviemaker.ui:
//            ThemeItemView

public class ThemeSelectorView extends ViewPager
{

    public ViewPropertyAnimator u;
    public Animator v;
    public int w;
    public dbo x;

    public ThemeSelectorView(Context context)
    {
        this(context, null);
    }

    public ThemeSelectorView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        w = -1;
    }

    public static int a(ThemeSelectorView themeselectorview, int k)
    {
        return k;
    }

    public static dbo a(ThemeSelectorView themeselectorview)
    {
        return themeselectorview.x;
    }

    public static void a(ThemeSelectorView themeselectorview, ThemeItemView themeitemview, int k)
    {
        themeselectorview.a(themeitemview, 0);
    }

    public static int b(ThemeSelectorView themeselectorview)
    {
        return 0;
    }

    public static int b(ThemeSelectorView themeselectorview, int k)
    {
        themeselectorview.w = -1;
        return -1;
    }

    public final void a(int k)
    {
        super.a(k);
    }

    public final void a(int k, boolean flag)
    {
        super.a(k, flag);
    }

    public void a(ThemeItemView themeitemview, int k)
    {
        u = czx.a(themeitemview).scaleX(0.7F).scaleY(0.7F).alpha(0.0F).setDuration(getResources().getInteger(b.hu)).setStartDelay(k).setListener(new dbm(this, themeitemview));
    }

    public final void i()
    {
        ThemeItemView themeitemview;
label0:
        {
            if (super.c == w)
            {
                if (v != null)
                {
                    v.cancel();
                }
                if (u != null)
                {
                    u.setListener(null).cancel();
                }
            }
            themeitemview = j();
            if (themeitemview != null)
            {
                w = super.c;
                if (themeitemview.d < 1.0F)
                {
                    break label0;
                }
                v = ObjectAnimator.ofFloat(themeitemview, ThemeItemView.b, new float[] {
                    themeitemview.d, 0.0F
                });
                v.setDuration(getResources().getInteger(b.hv));
                v.setInterpolator(new AccelerateInterpolator());
                v.setStartDelay(0L);
                v.removeAllListeners();
                v.addListener(new dbl(this, themeitemview));
                v.start();
            }
            return;
        }
        a(themeitemview, 0);
    }

    public ThemeItemView j()
    {
        return (ThemeItemView)findViewWithTag(Integer.valueOf(super.c));
    }
}
