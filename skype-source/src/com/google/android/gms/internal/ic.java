// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;

public final class ic
{

    public static Bitmap a(Bitmap bitmap)
    {
        int k = 0;
        if (bitmap == null)
        {
            return null;
        }
        int l = bitmap.getWidth();
        int i = bitmap.getHeight();
        Bitmap bitmap1;
        Canvas canvas;
        Paint paint;
        int j;
        if (l >= i)
        {
            k = (i - l) / 2;
            j = 0;
        } else
        {
            j = (l - i) / 2;
            i = l;
        }
        bitmap1 = Bitmap.createBitmap(i, i, android.graphics.Bitmap.Config.ARGB_8888);
        canvas = new Canvas(bitmap1);
        paint = new Paint(1);
        paint.setColor(0xff000000);
        canvas.drawCircle(i / 2, i / 2, i / 2, paint);
        paint.setXfermode(new PorterDuffXfermode(android.graphics.PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, k, j, paint);
        return bitmap1;
    }
}
