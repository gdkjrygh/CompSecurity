// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;

public final class vl
{

    public static Bitmap a(Bitmap bitmap)
    {
        int i = 0;
        if (bitmap == null)
        {
            return null;
        }
        int j = bitmap.getWidth();
        int l = bitmap.getHeight();
        Bitmap bitmap1;
        Canvas canvas;
        Paint paint;
        int k;
        if (j >= l)
        {
            k = (l - j) / 2;
            j = l;
        } else
        {
            i = (j - l) / 2;
            k = 0;
        }
        bitmap1 = Bitmap.createBitmap(j, j, android.graphics.Bitmap.Config.ARGB_8888);
        canvas = new Canvas(bitmap1);
        paint = new Paint(1);
        paint.setColor(0xff000000);
        canvas.drawCircle(j / 2, j / 2, j / 2, paint);
        paint.setXfermode(new PorterDuffXfermode(android.graphics.PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, k, i, paint);
        return bitmap1;
    }
}
