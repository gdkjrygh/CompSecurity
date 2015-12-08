// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.images.internal;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

public final class ImageUtils
{

    public static Bitmap frameBitmapInCircle(Bitmap bitmap)
    {
        if (bitmap == null)
        {
            return null;
        }
        int k = bitmap.getWidth();
        int l = bitmap.getHeight();
        Bitmap bitmap1;
        Canvas canvas;
        Paint paint;
        int i;
        int j;
        if (k >= l)
        {
            i = l;
            j = (l - k) / 2;
            k = 0;
        } else
        {
            i = k;
            j = 0;
            k = (k - l) / 2;
        }
        bitmap1 = Bitmap.createBitmap(i, i, android.graphics.Bitmap.Config.ARGB_8888);
        canvas = new Canvas(bitmap1);
        paint = new Paint(1);
        paint.setColor(0xff000000);
        canvas.drawCircle(i / 2, i / 2, i / 2, paint);
        paint.setXfermode(new PorterDuffXfermode(android.graphics.PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, j, k, paint);
        return bitmap1;
    }

    public static Drawable frameDrawableInCircle(Resources resources, Drawable drawable)
    {
        if (drawable == null)
        {
            drawable = null;
        } else
        if (drawable instanceof BitmapDrawable)
        {
            drawable = ((BitmapDrawable)drawable).getBitmap();
        } else
        {
            Bitmap bitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), android.graphics.Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            drawable = bitmap;
        }
        return new BitmapDrawable(resources, frameBitmapInCircle(drawable));
    }
}
