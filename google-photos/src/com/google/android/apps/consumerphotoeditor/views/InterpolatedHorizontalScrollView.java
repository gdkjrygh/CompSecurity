// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.consumerphotoeditor.views;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HorizontalScrollView;
import bgb;

public class InterpolatedHorizontalScrollView extends HorizontalScrollView
{

    private static final TimeInterpolator h;
    public final int a;
    public long b;
    public long c;
    public int d;
    public int e;
    public int f;
    public int g;
    private int i;
    private int j;

    public InterpolatedHorizontalScrollView(Context context)
    {
        this(context, null, 0);
    }

    public InterpolatedHorizontalScrollView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public InterpolatedHorizontalScrollView(Context context, AttributeSet attributeset, int k)
    {
        super(context, attributeset, k);
        setSmoothScrollingEnabled(true);
        a = getResources().getInteger(com.google.android.apps.consumerphotoeditor.R.integer.cpe_look_item_scroll_duration);
    }

    public boolean executeKeyEvent(KeyEvent keyevent)
    {
        c = 0L;
        b = 0L;
        return super.executeKeyEvent(keyevent);
    }

    public void fling(int k)
    {
        int l;
label0:
        {
            if (j <= i || k >= 0)
            {
                l = k;
                if (j >= i)
                {
                    break label0;
                }
                l = k;
                if (k <= 0)
                {
                    break label0;
                }
            }
            l = -k;
        }
        super.fling(l);
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        float f2 = (float)(SystemClock.elapsedRealtime() - b) / (float)(c - b);
        float f1;
        if (f2 < 0.0F)
        {
            f1 = 0.0F;
        } else
        {
            f1 = f2;
            if (f2 > 1.0F)
            {
                f1 = 1.0F;
            }
        }
        if (h == null)
        {
            f2 = f1;
        } else
        {
            f2 = h.getInterpolation(f1);
        }
        if (f2 < 0.0F)
        {
            f1 = 0.0F;
        } else
        {
            f1 = f2;
            if (f2 > 1.0F)
            {
                f1 = 1.0F;
            }
        }
        if (f1 > 0.0F && f1 < 1.0F)
        {
            int k = Math.round((1.0F - f1) * (float)d + (float)f * f1);
            f2 = e;
            scrollTo(k, Math.round(f1 * (float)g + (1.0F - f1) * f2));
            postInvalidate();
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        c = 0L;
        b = 0L;
        return super.onInterceptTouchEvent(motionevent);
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        i = j;
        j = getScrollX();
        c = 0L;
        b = 0L;
        return super.onTouchEvent(motionevent);
    }

    static 
    {
        h = bgb.a;
    }
}
