// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.android.glue.organisms.header;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import dek;
import dij;
import dis;

abstract class GlueBaseHeaderView extends FrameLayout
    implements dij
{

    protected LinearLayout a;
    protected dek b;
    private int c;
    private int d;
    private Button e;
    private TextView f;
    private int g;
    private float h;
    private float i;
    private int j;

    public GlueBaseHeaderView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        h = -1F;
        i = -1F;
        attributeset = LayoutInflater.from(context).inflate(a(), this, true);
        setWillNotDraw(false);
        a = (LinearLayout)attributeset.findViewById(0x7f1103e3);
        b = new dek(context);
        attributeset = context.obtainStyledAttributes(new int[] {
            0x7f0100ea
        });
        int k = attributeset.getDimensionPixelSize(0, 0);
        attributeset.recycle();
        g = k;
        f = (TextView)LayoutInflater.from(context).inflate(0x7f0300ae, this, false);
        addView(f);
    }

    private int f(int k)
    {
        return (c - f.getMeasuredHeight()) + k;
    }

    protected int a()
    {
        return 0x7f0300ad;
    }

    public void a(int k)
    {
        dek dek1 = b;
        dek1.b.setColor(k);
        dek1.b.setAlpha(dek1.e);
    }

    public void a(int k, float f1)
    {
        j = k;
        dek dek1 = b;
        float f2 = dis.a(dis.a(dis.a(dis.a(k, 0.0F, dek1.c - dek1.d), 0.0F, dek1.c - dek1.d, 1.0F, 0.0F), 0.0F, 0.05000001F), 0.05000001F, 0.0F, 1.0F, 0.0F);
        dek1.a.setAlpha((int)(f2 * 255F));
        b(k);
        c(k);
        f2 = dis.a(dis.a(f1, 0.0F, 0.3F), 0.0F, 0.3F, 1.0F, 0.0F);
        if (Math.abs(i - f2) >= 0.01F && e != null)
        {
            e.setAlpha(f2);
        }
        f1 = Math.max(0.0F, 4F * f1 - 1.0F) / 3F;
        if (Math.abs(h - f1) >= 0.01F)
        {
            h = f1;
            f.setAlpha(f1);
        }
    }

    public void a(Button button)
    {
        e = button;
    }

    protected final void a(CharSequence charsequence)
    {
        f.setText(charsequence);
        f.bringToFront();
    }

    public ViewGroup b()
    {
        return this;
    }

    public void b(int k)
    {
        int l = a.getTop();
        int i1 = ((android.view.ViewGroup.MarginLayoutParams)a.getLayoutParams()).topMargin;
        a.offsetTopAndBottom(i1 + (k - l));
    }

    public void c(int k)
    {
        k = f(k);
        int l = f.getTop();
        f.offsetTopAndBottom(k - l);
    }

    public void d(int k)
    {
        c = k;
        ((android.view.ViewGroup.MarginLayoutParams)a.getLayoutParams()).topMargin = c;
        b.d = c + d;
    }

    public void e(int k)
    {
        d = k;
        b.d = c + d;
    }

    protected void onLayout(boolean flag, int k, int l, int i1, int j1)
    {
        super.onLayout(flag, k, l, i1, j1);
        f.layout(0, f(j), getMeasuredWidth(), f(j) + f.getMeasuredHeight());
    }

    protected void onMeasure(int k, int l)
    {
        super.onMeasure(k, l);
        b.a(getMeasuredWidth(), getMeasuredHeight());
        f.measure(android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(g, 0x40000000));
    }

    protected void onSizeChanged(int k, int l, int i1, int j1)
    {
        super.onSizeChanged(k, l, i1, j1);
        b.a(k, l);
    }
}
