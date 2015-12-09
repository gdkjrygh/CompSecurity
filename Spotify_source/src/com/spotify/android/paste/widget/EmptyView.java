// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.android.paste.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import dfh;
import dft;
import dgn;
import dgo;
import dhr;

public class EmptyView extends LinearLayout
{

    private static final int a[] = {
        0x1010199, 0x10101e1, 0x101014f
    };
    private final TextView b;
    private final TextView c;
    private final ImageView d;
    private dhr e;
    private int f;
    private float g;
    private boolean h;

    public EmptyView(Context context)
    {
        this(context, null);
    }

    public EmptyView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0x7f0101f4);
    }

    public EmptyView(Context context, AttributeSet attributeset, int i)
    {
        Object obj;
        Object obj1;
        Drawable drawable1;
        String s;
        String s1;
        android.content.res.ColorStateList colorstatelist;
        android.content.res.ColorStateList colorstatelist1;
        int k;
        int l;
        int i1;
        int j1;
        int k1;
        super(context, attributeset);
        dgn.a(com/spotify/android/paste/widget/EmptyView, this);
        setOrientation(1);
        setGravity(17);
        obj = context.obtainStyledAttributes(attributeset, a, i, 0);
        drawable1 = ((TypedArray) (obj)).getDrawable(0);
        s = ((TypedArray) (obj)).getString(1);
        s1 = ((TypedArray) (obj)).getString(2);
        ((TypedArray) (obj)).recycle();
        obj1 = context.obtainStyledAttributes(attributeset, dfh.L, i, 0);
        k = ((TypedArray) (obj1)).getResourceId(dfh.S, 0);
        colorstatelist = ((TypedArray) (obj1)).getColorStateList(dfh.T);
        l = ((TypedArray) (obj1)).getResourceId(dfh.P, 0);
        colorstatelist1 = ((TypedArray) (obj1)).getColorStateList(dfh.Q);
        i1 = ((TypedArray) (obj1)).getDimensionPixelOffset(dfh.N, 0);
        j1 = ((TypedArray) (obj1)).getDimensionPixelOffset(dfh.R, 0);
        k1 = ((TypedArray) (obj1)).getDimensionPixelOffset(dfh.M, 0);
        f = ((TypedArray) (obj1)).getDimensionPixelSize(dfh.O, dft.b(96F, getResources()));
        ((TypedArray) (obj1)).recycle();
        obj = obj1;
        attributeset = context.obtainStyledAttributes(attributeset, new int[] {
            0x1010054
        }, i, 0);
        obj = attributeset;
        obj1 = attributeset;
        Drawable drawable = attributeset.getDrawable(0);
        attributeset.recycle();
        attributeset = drawable;
_L1:
        inflate(context, 0x7f030102, this);
        b = (TextView)findViewById(0x7f11026e);
        c = (TextView)findViewById(0x7f1102aa);
        d = (ImageView)findViewById(0x7f11026a);
        e = new dhr((ViewGroup)findViewById(0x7f1102f5));
        a(s);
        b(s1);
        a(drawable1);
        dgo.a(this, attributeset);
        attributeset = context.getResources().getDisplayMetrics();
        int j;
        if ((float)((DisplayMetrics) (attributeset)).widthPixels / ((DisplayMetrics) (attributeset)).density < 321F)
        {
            j = dft.a(32F, getResources());
            i = dft.a(16F, getResources());
        } else
        {
            j = dft.a(48F, getResources());
            i = dft.a(32F, getResources());
        }
        setPadding(j, i, j, i);
        if (k != 0)
        {
            dgo.a(context, b, k);
        }
        if (l != 0)
        {
            dgo.a(context, c, l);
        }
        if (colorstatelist != null)
        {
            b.setTextColor(colorstatelist);
        }
        if (colorstatelist1 != null)
        {
            c.setTextColor(colorstatelist1);
        }
        if (i1 > 0)
        {
            ((android.widget.LinearLayout.LayoutParams)d.getLayoutParams()).bottomMargin = i1;
        }
        if (j1 > 0)
        {
            ((android.widget.LinearLayout.LayoutParams)c.getLayoutParams()).topMargin = j1;
        }
        if (k1 > 0)
        {
            ((android.widget.LinearLayout.LayoutParams)findViewById(0x7f1102f5).getLayoutParams()).topMargin = k1;
        }
        return;
        attributeset;
        ((TypedArray) (obj)).recycle();
        attributeset = null;
          goto _L1
        context;
        ((TypedArray) (obj1)).recycle();
        throw context;
    }

    public final void a()
    {
        g = 1.0F;
        h = true;
    }

    public final void a(int i)
    {
        f = i;
    }

    public final void a(Drawable drawable)
    {
        if (drawable != null)
        {
            d.setVisibility(0);
            d.setImageDrawable(drawable);
            return;
        } else
        {
            d.setVisibility(8);
            return;
        }
    }

    public final void a(View view)
    {
        e.a(view);
    }

    public final void a(CharSequence charsequence)
    {
        b.setText(charsequence);
    }

    public final TextView b()
    {
        return b;
    }

    public final void b(CharSequence charsequence)
    {
        TextView textview = c;
        byte byte0;
        if (TextUtils.isEmpty(charsequence))
        {
            byte0 = 8;
        } else
        {
            byte0 = 0;
        }
        textview.setVisibility(byte0);
        c.setText(charsequence);
    }

    public final TextView c()
    {
        return c;
    }

    public final ImageView d()
    {
        return d;
    }

    public final View e()
    {
        return e.a;
    }

    protected void onMeasure(int i, int j)
    {
        e.a();
        Drawable drawable = d.getDrawable();
        if (drawable != null)
        {
            int k = f;
            float f1;
            int l;
            if (h)
            {
                f1 = g;
            } else
            {
                f1 = (float)drawable.getIntrinsicWidth() / (float)drawable.getIntrinsicHeight();
            }
            l = Math.round((float)k / f1);
            d.getLayoutParams().width = k;
            d.getLayoutParams().height = l;
        }
        super.onMeasure(i, j);
    }

}
