// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.player;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import geg;

public class NewPlayerPortraitLayout extends ViewGroup
{

    private ViewGroup a;
    private ViewGroup b;
    private ViewGroup c;
    private ViewGroup d;
    private ViewGroup e;
    private ViewGroup f;
    private int g;

    public NewPlayerPortraitLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    private int a()
    {
        if (d.getVisibility() == 8)
        {
            return 0;
        } else
        {
            return d.getMeasuredHeight();
        }
    }

    private static void a(View view, int i)
    {
        if (view.getLayoutParams() != null && view.getLayoutParams().height > 0)
        {
            view.measure(i, geg.a(view.getLayoutParams().height));
            return;
        } else
        {
            view.measure(i, geg.a());
            return;
        }
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        return new android.view.ViewGroup.MarginLayoutParams(getContext(), attributeset);
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        a = (ViewGroup)findViewById(0x7f110491);
        b = (ViewGroup)findViewById(0x7f110492);
        c = (ViewGroup)findViewById(0x7f110493);
        d = (ViewGroup)findViewById(0x7f1103fb);
        e = (ViewGroup)findViewById(0x7f110494);
        f = (ViewGroup)findViewById(0x7f110328);
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        i = getMeasuredWidth();
        a.layout(0, 0, i, a.getMeasuredHeight() + 0);
        j = a.getMeasuredHeight() + g + 0;
        k = ((android.view.ViewGroup.MarginLayoutParams)c.getLayoutParams()).topMargin;
        b.layout(0, j, i, b.getMeasuredHeight() + j);
        j = k + b.getMeasuredHeight() + g + j;
        c.layout(0, j, i, c.getMeasuredHeight() + j);
        k = c.getMeasuredHeight() + g + j;
        d.layout(0, k, i, a() + k);
        j = ((android.view.ViewGroup.MarginLayoutParams)e.getLayoutParams()).bottomMargin;
        if (f.getVisibility() == 0)
        {
            k += a() + g;
            e.layout(0, k, i, e.getMeasuredHeight() + k);
            j = j + (e.getMeasuredHeight() + g) + k;
            f.layout(0, j, i, f.getMeasuredHeight() + j);
            return;
        } else
        {
            k += a();
            j = (k + (getMeasuredHeight() - k) / 2) - e.getMeasuredHeight() / 2 - j;
            e.layout(0, j, i, e.getMeasuredHeight() + j);
            return;
        }
    }

    protected void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
        a.measure(i, geg.a());
        b.measure(i, geg.a());
        a(c, i);
        a(d, i);
        e.measure(i, geg.a());
        a(f, i);
        j = ((android.view.ViewGroup.MarginLayoutParams)e.getLayoutParams()).bottomMargin;
        int k = ((android.view.ViewGroup.MarginLayoutParams)c.getLayoutParams()).topMargin;
        int l = a.getMeasuredHeight();
        int i1 = b.getMeasuredHeight();
        int j1 = c.getMeasuredHeight();
        int k1 = d.getMeasuredHeight();
        int l1 = e.getMeasuredHeight();
        int i2 = f.getMeasuredHeight();
        j = getMeasuredHeight() - (k + (l + i1 + j1 + k1 + l1 + i2) + j);
        if (j > 0)
        {
            g = j / 5;
            return;
        } else
        {
            g = 0;
            b.measure(i, geg.a(Math.max(0, j + b.getMeasuredHeight())));
            return;
        }
    }
}
