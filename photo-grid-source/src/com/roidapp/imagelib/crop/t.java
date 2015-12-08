// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.crop;

import android.graphics.Bitmap;
import android.graphics.Matrix;

public final class t
{

    private Bitmap a;
    private int b;

    public t(Bitmap bitmap)
    {
        a = bitmap;
        b = 0;
    }

    private boolean f()
    {
        return (b / 90) % 2 != 0;
    }

    public final int a()
    {
        return b;
    }

    public final void a(int i)
    {
        b = i;
    }

    public final void a(Bitmap bitmap)
    {
        a = bitmap;
    }

    public final Bitmap b()
    {
        return a;
    }

    public final Matrix c()
    {
        Matrix matrix = new Matrix();
        if (b != 0)
        {
            int i = a.getWidth() / 2;
            int j = a.getHeight() / 2;
            matrix.preTranslate(-i, -j);
            matrix.postRotate(b);
            matrix.postTranslate(e() / 2, d() / 2);
        }
        return matrix;
    }

    public final int d()
    {
        if (f())
        {
            return a.getWidth();
        } else
        {
            return a.getHeight();
        }
    }

    public final int e()
    {
        if (f())
        {
            return a.getHeight();
        } else
        {
            return a.getWidth();
        }
    }
}
