// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.timehop.stickyheadersrecyclerview.calculation;

import android.graphics.Rect;
import android.view.View;

public class DimensionCalculator
{

    public DimensionCalculator()
    {
    }

    private Rect getMarginRect(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
    {
        return new Rect(marginlayoutparams.leftMargin, marginlayoutparams.topMargin, marginlayoutparams.rightMargin, marginlayoutparams.bottomMargin);
    }

    public Rect getMargins(View view)
    {
        view = view.getLayoutParams();
        if (view instanceof android.view.ViewGroup.MarginLayoutParams)
        {
            return getMarginRect((android.view.ViewGroup.MarginLayoutParams)view);
        } else
        {
            return new Rect();
        }
    }
}
