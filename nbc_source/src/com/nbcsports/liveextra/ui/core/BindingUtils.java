// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.core;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.support.design.widget.TabLayout;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.NumberFormat;
import timber.log.Timber;

public final class BindingUtils
{

    public BindingUtils()
    {
    }

    public static void setColorFilter(ImageView imageview, int i)
    {
        if (imageview == null || i == 0)
        {
            return;
        }
        try
        {
            imageview.setColorFilter(imageview.getResources().getColor(i));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ImageView imageview)
        {
            return;
        }
    }

    public static void setImageTint(ImageView imageview, int i)
    {
        if (i == 0)
        {
            return;
        }
        if (android.os.Build.VERSION.SDK_INT < 21)
        {
            imageview.setColorFilter(new PorterDuffColorFilter(i, android.graphics.PorterDuff.Mode.SRC_ATOP));
            return;
        } else
        {
            imageview.setImageTintList(ColorStateList.valueOf(i));
            return;
        }
    }

    public static void setLayoutWeight(View view, float f)
    {
        if (view == null)
        {
            return;
        } else
        {
            view.setLayoutParams(new android.widget.LinearLayout.LayoutParams(view.getLayoutParams().width, 0, f));
            return;
        }
    }

    public static void setNumber(TextView textview, Integer integer)
    {
        if (integer == null)
        {
            integer = "--";
        } else
        {
            integer = Integer.toString(integer.intValue());
        }
        textview.setText(integer);
    }

    public static void setPercent(TextView textview, Double double1)
    {
        NumberFormat numberformat = NumberFormat.getPercentInstance();
        numberformat.setMaximumFractionDigits(0);
        numberformat.setMaximumFractionDigits(0);
        if (double1 == null)
        {
            double1 = "--";
        } else
        {
            double1 = numberformat.format(double1);
        }
        textview.setText(double1);
    }

    public static void setProgressBackgroundTint(ProgressBar progressbar, String s)
    {
        int i;
        if (TextUtils.isEmpty(s))
        {
            return;
        }
        i = 0;
        int j = Color.parseColor(s);
        i = j;
_L2:
        ((LayerDrawable)progressbar.getProgressDrawable()).getDrawable(1).setColorFilter(new PorterDuffColorFilter(i, android.graphics.PorterDuff.Mode.SRC_OVER));
        return;
        s;
        Timber.w(s, "Color could not be parsed", new Object[0]);
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static void setProgressDrawableTint(ProgressBar progressbar, String s)
    {
        int i;
        if (TextUtils.isEmpty(s))
        {
            return;
        }
        i = 0;
        int j = Color.parseColor(s);
        i = j;
_L2:
        ((LayerDrawable)progressbar.getProgressDrawable()).getDrawable(2).setColorFilter(new PorterDuffColorFilter(i, android.graphics.PorterDuff.Mode.SRC_OVER));
        return;
        s;
        Timber.w(s, "Color could not be parsed", new Object[0]);
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static void setSelected(View view, boolean flag)
    {
        view.setSelected(flag);
    }

    public static void setTabIndicatorColor(TabLayout tablayout, int i)
    {
        try
        {
            Object obj = android/support/design/widget/TabLayout.getDeclaredField("mTabStrip");
            ((Field) (obj)).setAccessible(true);
            tablayout = ((TabLayout) (((Field) (obj)).get(tablayout)));
            obj = Class.forName("android.support.design.widget.TabLayout$SlidingTabStrip").getDeclaredMethod("setSelectedIndicatorColor", new Class[] {
                Integer.TYPE
            });
            ((Method) (obj)).setAccessible(true);
            ((Method) (obj)).invoke(tablayout, new Object[] {
                Integer.valueOf(i)
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (TabLayout tablayout)
        {
            tablayout.printStackTrace();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (TabLayout tablayout)
        {
            tablayout.printStackTrace();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (TabLayout tablayout)
        {
            tablayout.printStackTrace();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (TabLayout tablayout)
        {
            tablayout.printStackTrace();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (TabLayout tablayout)
        {
            tablayout.printStackTrace();
        }
    }
}
