// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.util;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.pandora.android.provider.b;
import p.ab.d;
import p.t.c;

public class i extends d
{

    public i(Context context)
    {
        super(context);
    }

    protected Bitmap a(c c, Bitmap bitmap, int j, int k)
    {
        c = b.a.h();
        j = Math.min(bitmap.getWidth(), bitmap.getHeight());
        int i1 = bitmap.getWidth();
        int j1 = bitmap.getHeight();
        k = (i1 - j) / 2;
        int l = (j1 - j) / 2;
        float f = i1 / 2;
        float f1 = j1 / 2;
        i1 = j / 2;
        float f2 = c.getResources().getDimension(0x7f0900a6);
        j1 = c.getResources().getColor(0x7f0b00a6);
        c = Bitmap.createBitmap(bitmap, k, l, j, j);
        Paint paint = new Paint();
        paint.setShader(new BitmapShader(c, android.graphics.Shader.TileMode.CLAMP, android.graphics.Shader.TileMode.CLAMP));
        paint.setAntiAlias(true);
        bitmap = Bitmap.createBitmap(j, j, android.graphics.Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap);
        canvas.drawCircle(i1, i1, i1, paint);
        paint = new Paint();
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setAntiAlias(true);
        paint.setColor(j1);
        paint.setStrokeWidth(f2);
        canvas.drawCircle(f, f1, (float)i1 - f2 / 2.0F, paint);
        c.recycle();
        return bitmap;
    }

    public String a()
    {
        return getClass().getSimpleName();
    }
}
