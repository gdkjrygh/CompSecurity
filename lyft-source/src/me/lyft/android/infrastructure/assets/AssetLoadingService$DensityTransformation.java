// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.assets;

import android.graphics.Bitmap;
import com.squareup.picasso.Transformation;

class scaleRation
    implements Transformation
{

    final double scaleRation;
    final int screenDensity;

    public String key()
    {
        return "square()";
    }

    public Bitmap transform(Bitmap bitmap)
    {
        int i = bitmap.getWidth();
        int j = bitmap.getHeight();
        Bitmap bitmap1 = Bitmap.createScaledBitmap(bitmap, (int)(scaleRation * (double)i), (int)(scaleRation * (double)j), false);
        if (bitmap1 != bitmap)
        {
            bitmap.recycle();
        }
        return bitmap1;
    }

    public (int i)
    {
        screenDensity = i;
        scaleRation = (1.0D * (double)i) / 480D;
    }
}
