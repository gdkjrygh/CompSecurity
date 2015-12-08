// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.photos.remotemedia.enrichment.ui;

import aly;
import ame;
import amh;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.widget.ImageView;
import b;
import emv;
import emw;
import his;
import p;

public final class MapImageView extends ImageView
{

    public his a;
    private final double b;
    private final int c;

    public MapImageView(Context context)
    {
        super(context);
        b = a();
        c = context.getResources().getDimensionPixelSize(b.vZ);
    }

    public MapImageView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        b = a();
        c = context.getResources().getDimensionPixelSize(b.vZ);
    }

    public MapImageView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        b = a();
        c = context.getResources().getDimensionPixelSize(b.vZ);
    }

    private double a()
    {
        return (double)getContext().getResources().getInteger(b.wp) / 10000D;
    }

    protected final void onMeasure(int i, int j)
    {
        boolean flag1 = true;
        int k = android.view.View.MeasureSpec.getSize(i);
        i = android.view.View.MeasureSpec.getSize(j);
        int l = android.view.View.MeasureSpec.getMode(j);
        j = (int)((double)k * b);
        Object obj;
        emw emw1;
        boolean flag;
        if (l != 0x40000000)
        {
            if (l == 0x80000000)
            {
                i = Math.max(i, j);
            } else
            {
                i = j;
            }
        }
        setMeasuredDimension(k, i);
        obj = getResources().getDisplayMetrics();
        emw1 = new emw();
        emw1.c = k;
        emw1.d = i;
        emw1.e = ((DisplayMetrics) (obj)).density;
        emw1.a = a.c;
        emw1.b = a.d;
        emw1.f = c;
        p.a(emw1.a);
        p.a(emw1.b);
        if (emw1.c > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag);
        if (emw1.d > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag);
        if (emw1.e > 0.0F)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        p.a(flag);
        obj = new emv(emw1);
        aly.c(getContext()).a(((emv) (obj)).a).a(this);
    }
}
