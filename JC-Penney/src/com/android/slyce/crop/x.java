// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.crop;

import android.graphics.Bitmap;
import android.graphics.Matrix;

public class x
{

    private Bitmap a;
    private int b;

    public x(Bitmap bitmap)
    {
        a = bitmap;
        b = 0;
    }

    public int a()
    {
        return b;
    }

    public void a(int i)
    {
        b = i;
    }

    public void a(Bitmap bitmap)
    {
        a = bitmap;
    }

    public Bitmap b()
    {
        return a;
    }

    public Matrix c()
    {
        Matrix matrix = new Matrix();
        if (b != 0)
        {
            int i = a.getWidth() / 2;
            int j = a.getHeight() / 2;
            matrix.preTranslate(-i, -j);
            matrix.postRotate(b);
            matrix.postTranslate(f() / 2, e() / 2);
        }
        return matrix;
    }

    public boolean d()
    {
        return (b / 90) % 2 != 0;
    }

    public int e()
    {
        if (d())
        {
            return a.getWidth();
        } else
        {
            return a.getHeight();
        }
    }

    public int f()
    {
        if (d())
        {
            return a.getHeight();
        } else
        {
            return a.getWidth();
        }
    }
}
