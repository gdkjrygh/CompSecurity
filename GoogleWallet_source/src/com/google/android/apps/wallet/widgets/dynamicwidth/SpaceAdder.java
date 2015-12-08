// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.widgets.dynamicwidth;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;

public final class SpaceAdder
{

    public static void addMarginIfNecessary(View view)
    {
        Integer integer = computeSideSpacing(view.getResources().getDisplayMetrics());
        if (integer != null)
        {
            applyDynamicMargins(view, integer.intValue());
        }
    }

    private static void applyDynamicMargins(View view, int i)
    {
        android.view.ViewGroup.MarginLayoutParams marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)view.getLayoutParams();
        marginlayoutparams.leftMargin = i;
        marginlayoutparams.rightMargin = i;
        view.setLayoutParams(marginlayoutparams);
    }

    private static void applyDynamicPadding(View view, int i)
    {
        view.setPadding(i, view.getPaddingTop(), i, view.getPaddingBottom());
    }

    private static Integer computeSideSpacing(DisplayMetrics displaymetrics)
    {
        if ((float)displaymetrics.widthPixels / displaymetrics.density <= 480F)
        {
            return null;
        } else
        {
            return Integer.valueOf((displaymetrics.widthPixels - (int)(displaymetrics.density * 480F)) / 2);
        }
    }

    public static void padIfNecessary(View view)
    {
        Integer integer = computeSideSpacing(view.getResources().getDisplayMetrics());
        if (integer != null)
        {
            applyDynamicPadding(view, integer.intValue());
        }
    }
}
