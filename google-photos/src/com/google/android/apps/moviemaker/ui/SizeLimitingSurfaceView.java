// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.moviemaker.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import dal;

public class SizeLimitingSurfaceView extends SurfaceView
{

    public int a;
    public int b;
    public int c;

    public SizeLimitingSurfaceView(Context context)
    {
        super(context);
        a = 0xe1000;
        b();
    }

    public SizeLimitingSurfaceView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = 0xe1000;
        b();
    }

    public SizeLimitingSurfaceView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = 0xe1000;
        b();
    }

    public static int a(SizeLimitingSurfaceView sizelimitingsurfaceview, int i)
    {
        sizelimitingsurfaceview.b = i;
        return i;
    }

    public static int b(SizeLimitingSurfaceView sizelimitingsurfaceview, int i)
    {
        sizelimitingsurfaceview.c = i;
        return i;
    }

    private void b()
    {
        getHolder().addCallback(new dal(this));
    }

    public void a()
    {
        int i = getWidth();
        int j = getHeight();
        int k = i * j;
        if (k > a)
        {
            double d = Math.sqrt((double)a / (double)k);
            getHolder().setFixedSize((int)((double)i * d), (int)(d * (double)j));
            return;
        } else
        {
            getHolder().setSizeFromLayout();
            return;
        }
    }

    protected void onSizeChanged(int i, int j, int k, int l)
    {
        a();
        super.onSizeChanged(i, j, k, l);
    }
}
