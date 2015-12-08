// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.android.paste.widget.layout;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.mobile.android.util.logging.Logger;
import dfh;
import geg;

public class AspectRatioView extends ViewGroup
{

    private float a;
    private boolean b;
    private boolean c;
    private boolean d;
    private int e;
    private int f;

    public AspectRatioView(Context context)
    {
        super(context);
        a = 1.0F;
        setWillNotDraw(true);
    }

    public AspectRatioView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = 1.0F;
        setWillNotDraw(true);
        context = context.obtainStyledAttributes(attributeset, dfh.a);
        a = context.getFloat(dfh.c, a);
        b = context.getBoolean(dfh.b, b);
        c = context.getBoolean(dfh.b, c);
        d = context.getBoolean(dfh.f, d);
        e = context.getDimensionPixelSize(dfh.e, e);
        f = context.getDimensionPixelSize(dfh.d, f);
        context.recycle();
    }

    public void addView(View view)
    {
        if (getChildCount() > 0)
        {
            throw new IllegalStateException("AspectRatioView can host only one direct child.");
        } else
        {
            super.addView(view);
            return;
        }
    }

    public void addView(View view, int i)
    {
        if (getChildCount() > 0)
        {
            throw new IllegalStateException("AspectRatioView can host only one direct child.");
        } else
        {
            super.addView(view, i);
            return;
        }
    }

    public void addView(View view, int i, android.view.ViewGroup.LayoutParams layoutparams)
    {
        if (getChildCount() > 0)
        {
            throw new IllegalStateException("AspectRatioView can host only one direct child.");
        } else
        {
            super.addView(view, i, layoutparams);
            return;
        }
    }

    public void addView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        if (getChildCount() > 0)
        {
            throw new IllegalStateException("AspectRatioView can host only one direct child.");
        } else
        {
            super.addView(view, layoutparams);
            return;
        }
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        j = getPaddingTop();
        k = getPaddingLeft();
        l = getChildCount();
        for (i = 0; i < l; i++)
        {
            View view = getChildAt(i);
            view.layout(k, j, view.getMeasuredWidth() + k, view.getMeasuredHeight() + j);
        }

    }

    protected void onMeasure(int i, int j)
    {
        Object obj;
        int i1;
        int j1;
        int k1;
        int l1;
        k1 = getPaddingLeft();
        l1 = getPaddingRight();
        i1 = getPaddingTop();
        j1 = getPaddingBottom();
        obj = getChildAt(0);
        if (obj == null || ((View) (obj)).getLayoutParams() == null) goto _L2; else goto _L1
_L1:
        obj = ((View) (obj)).getLayoutParams();
        boolean flag;
        if (((android.view.ViewGroup.LayoutParams) (obj)).width >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            if (((android.view.ViewGroup.LayoutParams) (obj)).height >= 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                throw new IllegalStateException("Child supplied to AspectRatioView cannot have both dimensions set to exact");
            }
        }
        if (((android.view.ViewGroup.LayoutParams) (obj)).width >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag) goto _L4; else goto _L3
_L3:
        int k;
        int l;
        boolean flag1;
        if (geg.b(i))
        {
            throw new IllegalStateException("Both child and AspectRatioView have exact width dimension.");
        }
        l = android.view.View.MeasureSpec.getSize(((android.view.ViewGroup.LayoutParams) (obj)).width);
        flag1 = true;
        k = 0;
_L10:
        if (!flag1)
        {
            l = getDefaultSize(getSuggestedMinimumWidth(), i);
            k = getDefaultSize(getSuggestedMinimumHeight(), j);
        }
        if (l == 0 && k == 0)
        {
            Logger.b("With both width and height set to zero, it is impossible to calculate and enforce aspect ratio.", new Object[0]);
            super.onMeasure(i, j);
            return;
        }
          goto _L5
_L4:
        if (((android.view.ViewGroup.LayoutParams) (obj)).height >= 0)
        {
            k = 1;
        } else
        {
            k = 0;
        }
        if (k != 0)
        {
            if (geg.b(j))
            {
                throw new IllegalStateException("Both child and AspectRatioView have exact height dimension.");
            }
            k = android.view.View.MeasureSpec.getSize(((android.view.ViewGroup.LayoutParams) (obj)).height);
            flag1 = true;
            l = 0;
            continue; /* Loop/switch isn't completed */
        }
          goto _L2
_L5:
        if (l != 0 && !geg.b(j)) goto _L7; else goto _L6
_L6:
        j = Math.round((float)k * a) + e;
        i = k;
_L8:
        l = i;
        k = j;
        if (flag1)
        {
            k = j + (k1 + l1);
            l = i + (i1 + j1);
        }
        setMeasuredDimension(android.view.View.MeasureSpec.makeMeasureSpec(k, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(l, 0x40000000));
        measureChildren(Math.max(0, android.view.View.MeasureSpec.makeMeasureSpec(k, 0x40000000)), Math.max(0, android.view.View.MeasureSpec.makeMeasureSpec(l, 0x40000000)));
        return;
_L7:
        if (k == 0 || geg.b(i))
        {
            i = Math.round((float)l / a) + f;
            j = l;
            continue; /* Loop/switch isn't completed */
        }
        if (a > (float)l / (float)k)
        {
            if (d && android.view.View.MeasureSpec.getMode(j) == 0x40000000)
            {
                i = k;
                j = l;
                if (c)
                {
                    continue; /* Loop/switch isn't completed */
                }
            }
            i = Math.round((float)(l - e) / a);
            j = l;
            continue; /* Loop/switch isn't completed */
        }
        if (d && android.view.View.MeasureSpec.getMode(i) == 0x40000000)
        {
            i = k;
            j = l;
            if (b)
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        j = Math.round((float)(k - f) * a);
        i = k;
        if (true) goto _L8; else goto _L2
_L2:
        flag1 = false;
        k = 0;
        l = 0;
        if (true) goto _L10; else goto _L9
_L9:
    }
}
