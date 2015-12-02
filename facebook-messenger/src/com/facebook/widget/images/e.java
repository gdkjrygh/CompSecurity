// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget.images;

import android.graphics.Bitmap;
import android.graphics.Matrix;

public class e
{

    public static final Class a = com/facebook/widget/images/e;
    private Bitmap b;
    private int c;

    public e(Bitmap bitmap)
    {
        b = bitmap;
        c = 0;
    }

    public e(Bitmap bitmap, int i)
    {
        b = bitmap;
        c = i % 360;
    }

    public int a()
    {
        return c;
    }

    public void a(int i)
    {
        c = i;
    }

    public void a(Bitmap bitmap)
    {
        b = bitmap;
    }

    public Bitmap b()
    {
        return b;
    }

    public Matrix c()
    {
        Matrix matrix = new Matrix();
        if (c != 0)
        {
            int i = b.getWidth() / 2;
            int j = b.getHeight() / 2;
            matrix.preTranslate(-i, -j);
            matrix.postRotate(c);
            matrix.postTranslate(f() / 2, e() / 2);
        }
        return matrix;
    }

    public boolean d()
    {
        return (c / 90) % 2 != 0;
    }

    public int e()
    {
        if (d())
        {
            return b.getWidth();
        } else
        {
            return b.getHeight();
        }
    }

    public int f()
    {
        if (d())
        {
            return b.getHeight();
        } else
        {
            return b.getWidth();
        }
    }

}
