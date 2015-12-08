// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.views;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import com.squareup.picasso.z;

public class GrayscaleTransformation
    implements z
{

    public GrayscaleTransformation()
    {
    }

    public String key()
    {
        return "GrayscaleTransformation";
    }

    public Bitmap transform(Bitmap bitmap)
    {
        int i = bitmap.getHeight();
        Bitmap bitmap1 = Bitmap.createBitmap(bitmap.getWidth(), i, android.graphics.Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap1);
        Paint paint = new Paint();
        ColorMatrix colormatrix = new ColorMatrix();
        colormatrix.setSaturation(0.0F);
        paint.setColorFilter(new ColorMatrixColorFilter(colormatrix));
        canvas.drawBitmap(bitmap, 0.0F, 0.0F, paint);
        if (bitmap1 != bitmap)
        {
            bitmap.recycle();
        }
        return bitmap1;
    }
}
