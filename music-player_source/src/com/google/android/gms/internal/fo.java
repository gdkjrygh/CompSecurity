// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;

public final class fo
{

    public static Bitmap a(Bitmap bitmap)
    {
        if (bitmap == null)
        {
            return null;
        }
        if (bitmap.getWidth() != bitmap.getHeight())
        {
            throw new IllegalArgumentException("Avatar image must be squared");
        } else
        {
            int i = bitmap.getWidth();
            Bitmap bitmap1 = Bitmap.createBitmap(i, i, android.graphics.Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmap1);
            Paint paint = new Paint(1);
            paint.setColor(0xff000000);
            canvas.drawCircle(i / 2, i / 2, i / 2, paint);
            paint.setXfermode(new PorterDuffXfermode(android.graphics.PorterDuff.Mode.SRC_IN));
            canvas.drawBitmap(bitmap, 0.0F, 0.0F, paint);
            return bitmap1;
        }
    }
}
