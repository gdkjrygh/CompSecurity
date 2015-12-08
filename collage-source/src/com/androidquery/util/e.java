// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.androidquery.util;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

public class e extends BitmapDrawable
{

    private float a;
    private WeakReference b;
    private boolean c;
    private Matrix d;
    private int e;
    private float f;

    public e(Resources resources, Bitmap bitmap, ImageView imageview, float f1, float f2)
    {
        super(resources, bitmap);
        b = new WeakReference(imageview);
        a = f1;
        f = f2;
        imageview.setScaleType(android.widget.ImageView.ScaleType.MATRIX);
        imageview.setImageMatrix(new Matrix());
        a(imageview, bitmap, false);
    }

    private float a(int i, int j)
    {
        if (f != 3.402823E+38F)
        {
            return (1.0F - f) / 2.0F;
        } else
        {
            return (1.5F - Math.max(1.0F, Math.min(1.5F, (float)j / (float)i))) / 2.0F + 0.25F;
        }
    }

    private int a(int i, int j, int k)
    {
        float f1 = a;
        if (a == 3.402823E+38F)
        {
            f1 = (float)j / (float)i;
        }
        return (int)(f1 * (float)k);
    }

    private int a(ImageView imageview)
    {
        int j = 0;
        android.view.ViewGroup.LayoutParams layoutparams = imageview.getLayoutParams();
        if (layoutparams != null)
        {
            j = layoutparams.width;
        }
        int i = j;
        if (j <= 0)
        {
            i = imageview.getWidth();
        }
        j = i;
        if (i > 0)
        {
            j = i - imageview.getPaddingLeft() - imageview.getPaddingRight();
        }
        return j;
    }

    private Matrix a(ImageView imageview, Bitmap bitmap)
    {
        float f1 = 0.0F;
        int i = bitmap.getWidth();
        if (d != null && i == e)
        {
            return d;
        }
        int j = bitmap.getHeight();
        int k = a(imageview);
        int l = a(i, j, k);
        if (i <= 0 || j <= 0 || k <= 0 || l <= 0)
        {
            return null;
        }
        if (d == null || i != e)
        {
            d = new Matrix();
            float f2;
            float f3;
            if (i * l >= k * j)
            {
                f3 = (float)l / (float)j;
                f2 = ((float)k - (float)i * f3) * 0.5F;
            } else
            {
                f3 = (float)k / (float)i;
                f1 = a(i, j);
                float f4 = l;
                float f5 = j;
                f2 = 0.0F;
                f1 = (f4 - f5 * f3) * f1;
            }
            d.setScale(f3, f3);
            d.postTranslate(f2, f1);
            e = i;
        }
        return d;
    }

    private void a(Canvas canvas, ImageView imageview, Bitmap bitmap)
    {
        Matrix matrix = a(imageview, bitmap);
        if (matrix != null)
        {
            int i = imageview.getPaddingTop() + imageview.getPaddingBottom();
            int j = imageview.getPaddingLeft() + imageview.getPaddingRight();
            if (i > 0 || j > 0)
            {
                canvas.clipRect(0, 0, imageview.getWidth() - j, imageview.getHeight() - i);
            }
            canvas.drawBitmap(bitmap, matrix, getPaint());
        }
        if (!c)
        {
            a(imageview, bitmap, true);
        }
    }

    private void a(ImageView imageview, Bitmap bitmap, boolean flag)
    {
        int i = a(imageview);
        if (i > 0)
        {
            i = a(bitmap.getWidth(), bitmap.getHeight(), i) + imageview.getPaddingTop() + imageview.getPaddingBottom();
            bitmap = imageview.getLayoutParams();
            if (bitmap != null)
            {
                if (i != ((android.view.ViewGroup.LayoutParams) (bitmap)).height)
                {
                    bitmap.height = i;
                    imageview.setLayoutParams(bitmap);
                }
                if (flag)
                {
                    c = true;
                    return;
                }
            }
        }
    }

    public void draw(Canvas canvas)
    {
        ImageView imageview = null;
        if (b != null)
        {
            imageview = (ImageView)b.get();
        }
        if (a == 0.0F || imageview == null)
        {
            super.draw(canvas);
            return;
        } else
        {
            a(canvas, imageview, getBitmap());
            return;
        }
    }
}
