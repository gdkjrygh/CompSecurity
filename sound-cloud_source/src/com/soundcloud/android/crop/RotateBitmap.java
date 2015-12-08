// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.crop;

import android.graphics.Bitmap;
import android.graphics.Matrix;

class RotateBitmap
{

    private Bitmap bitmap;
    private int rotation;

    public RotateBitmap(Bitmap bitmap1, int i)
    {
        bitmap = bitmap1;
        rotation = i % 360;
    }

    public Bitmap getBitmap()
    {
        return bitmap;
    }

    public int getHeight()
    {
        if (bitmap == null)
        {
            return 0;
        }
        if (isOrientationChanged())
        {
            return bitmap.getWidth();
        } else
        {
            return bitmap.getHeight();
        }
    }

    public Matrix getRotateMatrix()
    {
        Matrix matrix = new Matrix();
        if (bitmap != null && rotation != 0)
        {
            int i = bitmap.getWidth() / 2;
            int j = bitmap.getHeight() / 2;
            matrix.preTranslate(-i, -j);
            matrix.postRotate(rotation);
            matrix.postTranslate(getWidth() / 2, getHeight() / 2);
        }
        return matrix;
    }

    public int getRotation()
    {
        return rotation;
    }

    public int getWidth()
    {
        if (bitmap == null)
        {
            return 0;
        }
        if (isOrientationChanged())
        {
            return bitmap.getHeight();
        } else
        {
            return bitmap.getWidth();
        }
    }

    public boolean isOrientationChanged()
    {
        return (rotation / 90) % 2 != 0;
    }

    public void recycle()
    {
        if (bitmap != null)
        {
            bitmap.recycle();
            bitmap = null;
        }
    }

    public void setBitmap(Bitmap bitmap1)
    {
        bitmap = bitmap1;
    }

    public void setRotation(int i)
    {
        rotation = i;
    }
}
