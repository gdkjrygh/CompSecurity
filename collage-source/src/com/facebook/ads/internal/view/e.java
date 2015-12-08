// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.util.DisplayMetrics;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class e extends LinearLayout
{

    private DisplayMetrics a;
    private Bitmap b;
    private Bitmap c;
    private ImageView d;
    private ImageView e;
    private ImageView f;
    private float g;
    private Bitmap h;
    private Bitmap i;
    private int j;
    private int k;

    public e(Context context)
    {
        super(context);
        b();
    }

    private void a()
    {
        if (getHeight() > 0)
        {
            k = c();
            j = (int)Math.ceil((float)(getHeight() - k) / 2.0F);
            Matrix matrix = new Matrix();
            matrix.preScale(1.0F, -1F);
            int l = (int)Math.floor((float)(getHeight() - k) / 2.0F);
            float f1 = (float)b.getHeight() / (float)k;
            int i1 = Math.round((float)j * f1);
            if (i1 > 0)
            {
                h = Bitmap.createBitmap(c, 0, 0, c.getWidth(), i1, matrix, true);
                d.setImageBitmap(h);
            }
            l = Math.round((float)l * f1);
            if (l > 0)
            {
                i = Bitmap.createBitmap(c, 0, c.getHeight() - l, c.getWidth(), l, matrix, true);
                f.setImageBitmap(i);
            }
        }
    }

    private void b()
    {
        a = getContext().getResources().getDisplayMetrics();
        setOrientation(1);
        d = new ImageView(getContext());
        d.setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
        addView(d);
        e = new ImageView(getContext());
        e.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -1));
        e.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
        addView(e);
        f = new ImageView(getContext());
        f.setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
        addView(f);
    }

    private int c()
    {
        return (int)Math.round((double)getWidth() / 1.9099999999999999D);
    }

    public void a(Bitmap bitmap, Bitmap bitmap1)
    {
        if (bitmap == null)
        {
            e.setImageDrawable(null);
            return;
        } else
        {
            e.setImageBitmap(Bitmap.createBitmap(bitmap));
            b = bitmap;
            c = bitmap1;
            g = (float)bitmap.getHeight() / (float)bitmap.getWidth();
            a();
            return;
        }
    }

    protected void onLayout(boolean flag, int l, int i1, int j1, int k1)
    {
        if (b == null || c == null)
        {
            super.onLayout(flag, l, i1, j1, k1);
            return;
        }
        int l1 = c();
        if (h == null || k != l1)
        {
            a();
        }
        d.layout(l, i1, j1, j);
        e.layout(l, j + i1, j1, j + k);
        f.layout(l, j + i1 + k, j1, k1);
    }
}
