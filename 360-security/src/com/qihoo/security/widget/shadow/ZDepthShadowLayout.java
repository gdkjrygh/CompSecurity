// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.widget.shadow;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

// Referenced classes of package com.qihoo.security.widget.shadow:
//            d, ZDepth

public class ZDepthShadowLayout extends FrameLayout
{

    protected d a;
    protected int b;
    protected int c;
    protected int d;
    protected int e;
    protected int f;
    protected int g;
    protected long h;
    protected boolean i;

    public ZDepthShadowLayout(Context context)
    {
        this(context, null);
    }

    public ZDepthShadowLayout(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public ZDepthShadowLayout(Context context, AttributeSet attributeset, int j)
    {
        super(context, attributeset, j);
        a(attributeset, j);
    }

    protected void a(AttributeSet attributeset, int j)
    {
        byte byte0 = 5;
        setClipToPadding(false);
        attributeset = getContext().obtainStyledAttributes(attributeset, com.qihoo.security.lite.a.a.ZDepthShadowLayout, j, 0);
        b = attributeset.getInt(1, 0);
        c = attributeset.getInt(0, 1);
        h = attributeset.getInt(7, 150);
        i = attributeset.getBoolean(8, true);
        int j1 = attributeset.getInt(2, -1);
        j = attributeset.getInt(3, -1);
        int i1 = attributeset.getInt(4, -1);
        int l = attributeset.getInt(5, -1);
        int k = attributeset.getInt(6, -1);
        if (j1 > -1)
        {
            d = j1;
            e = j1;
            f = j1;
            g = j1;
        } else
        {
            if (j <= -1)
            {
                j = 5;
            }
            d = j;
            if (i1 > -1)
            {
                j = i1;
            } else
            {
                j = 5;
            }
            e = j;
            if (l > -1)
            {
                j = l;
            } else
            {
                j = 5;
            }
            f = j;
            j = byte0;
            if (k > -1)
            {
                j = k;
            }
            g = j;
        }
        attributeset.recycle();
    }

    public void a(ZDepth zdepth)
    {
        if (a != null)
        {
            a.b(zdepth);
        }
    }

    public void f()
    {
        if (a != null)
        {
            a.setVisibility(0);
        }
    }

    public void g()
    {
        if (a != null)
        {
            a.setVisibility(4);
        }
    }

    public int getHeightExceptShadow()
    {
        return getHeight() - getPaddingTop() - getPaddingBottom();
    }

    public int getWidthExceptShadow()
    {
        return getWidth() - getPaddingLeft() - getPaddingRight();
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        a = new d(getContext());
        a.setShape(b);
        a.setZDepth(c);
        a.setZDepthPaddingLeft(d);
        a.setZDepthPaddingTop(e);
        a.setZDepthPaddingRight(f);
        a.setZDepthPaddingBottom(g);
        a.setZDepthAnimDuration(h);
        a.setZDepthDoAnimation(i);
        addView(a, 0);
        setPadding(a.getZDepthPaddingLeft(), a.getZDepthPaddingTop(), a.getZDepthPaddingRight(), a.getZDepthPaddingBottom());
    }

    protected void onLayout(boolean flag, int j, int k, int l, int i1)
    {
        super.onLayout(flag, j, k, l, i1);
        a.layout(0, 0, l - j, i1 - k);
    }

    protected void onMeasure(int j, int k)
    {
        int i1 = 0;
        measureChildren(j, k);
        super.onMeasure(j, k);
        int l1 = getChildCount();
        int l = 0;
        j = 0;
        k = i1;
        while (l < l1) 
        {
            View view = getChildAt(l);
            i1 = k;
            if (k < view.getMeasuredWidth())
            {
                i1 = view.getMeasuredWidth();
            }
            int j1 = j;
            if (j < view.getMeasuredHeight())
            {
                j1 = view.getMeasuredHeight();
            }
            l++;
            k = i1;
            j = j1;
        }
        l = a.getZDepthPaddingLeft();
        i1 = a.getZDepthPaddingTop();
        int k1 = a.getZDepthPaddingRight();
        l1 = a.getZDepthPaddingBottom();
        a.measure(android.view.View.MeasureSpec.makeMeasureSpec(k + (l + k1), 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(j + (i1 + l1), 0x40000000));
    }
}
