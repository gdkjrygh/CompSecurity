// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.customview;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.squareup.picasso.Transformation;

public class RoundedTransformation
    implements Transformation
{

    private final int margin;
    private final int radius;

    public RoundedTransformation(int i, int j)
    {
        radius = i;
        margin = j;
    }

    public String key()
    {
        return "rounded";
    }

    public Bitmap transform(Bitmap bitmap)
    {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setShader(new BitmapShader(bitmap, android.graphics.Shader.TileMode.CLAMP, android.graphics.Shader.TileMode.CLAMP));
        Bitmap bitmap1 = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), android.graphics.Bitmap.Config.ARGB_8888);
        (new Canvas(bitmap1)).drawRoundRect(new RectF(margin, margin, bitmap.getWidth() - margin, bitmap.getHeight() - margin), radius, radius, paint);
        if (bitmap != bitmap1)
        {
            bitmap.recycle();
        }
        return bitmap1;
    }
}
