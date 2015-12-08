// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fsr.tracker.util;

import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;

public class DisplayUtil
{

    private DisplayMetrics displayMetrics;

    public DisplayUtil(DisplayMetrics displaymetrics)
    {
        displayMetrics = displaymetrics;
    }

    public void setMargins(android.widget.LinearLayout.LayoutParams layoutparams, int i, int j, int k, int l)
    {
        layoutparams.setMargins(toDP(i), toDP(j), toDP(k), toDP(l));
    }

    public void setPadding(View view, int i, int j, int k, int l)
    {
        view.setPadding(toDP(i), toDP(j), toDP(k), toDP(l));
    }

    public int toDP(int i)
    {
        return (int)TypedValue.applyDimension(1, i, displayMetrics);
    }
}
