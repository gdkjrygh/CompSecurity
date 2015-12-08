// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cmcm.adsdk;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;

public class CMAdRelativeLayout extends RelativeLayout
{

    private ProgressBar a;
    private RelativeLayout b;
    private Context c;
    private boolean d;
    private boolean e;
    private int f;
    private int g;

    public CMAdRelativeLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        d = false;
        e = false;
        c = context;
    }

    public CMAdRelativeLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        d = false;
        e = false;
        c = context;
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        super.onLayout(flag, i, j, k, l);
        if (e && !d)
        {
            a = new ProgressBar(c);
            android.widget.RelativeLayout.LayoutParams layoutparams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
            layoutparams.addRule(13);
            a.setLayoutParams(layoutparams);
            a.setVisibility(4);
            b = new RelativeLayout(c);
            b.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(f, g));
            b.addView(a);
            addView(b, getChildCount());
            d = true;
        }
    }

    protected void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
        f = getMeasuredWidth();
        g = getMeasuredHeight();
    }

    protected void onSizeChanged(int i, int j, int k, int l)
    {
        super.onSizeChanged(i, j, k, l);
    }

    public void onWindowFocusChanged(boolean flag)
    {
        super.onWindowFocusChanged(flag);
    }
}
