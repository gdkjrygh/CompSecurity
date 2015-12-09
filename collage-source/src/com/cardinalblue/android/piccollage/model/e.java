// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.model;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import com.cardinalblue.android.b.k;

public class e
{

    private Paint a;
    private final Path b;
    private Bitmap c;

    public e(Path path, int i)
    {
        a = new Paint();
        b = path;
        a.setColor(Color.parseColor("#c9c9c9"));
        a.setStrokeWidth(k.a().getResources().getDimensionPixelSize(0x7f0b0124));
        a.setStyle(android.graphics.Paint.Style.STROKE);
    }

    private static int a()
    {
        return k.a().getResources().getDimensionPixelSize(0x7f0b0127);
    }

    private Bitmap a(Bitmap bitmap)
    {
        int i = bitmap.getWidth();
        int j = bitmap.getHeight();
        int l = a();
        Bitmap bitmap1 = Bitmap.createBitmap(i, j, bitmap.getConfig());
        Canvas canvas = new Canvas(bitmap1);
        canvas.drawBitmap(bitmap, 0.0F, 0.0F, a);
        canvas.drawRect(l, l, i - l, j - l, a);
        return bitmap1;
    }

    public Bitmap a(int i, int j)
    {
        if (c != null)
        {
            return c;
        } else
        {
            Matrix matrix = new Matrix();
            float f = a.getStrokeWidth() / 2.0F;
            matrix.setScale((float)i - f, (float)j - f);
            matrix.postTranslate(f / 2.0F, f / 2.0F);
            Bitmap bitmap = Bitmap.createBitmap(i, j, android.graphics.Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmap);
            canvas.drawColor(Color.parseColor("#666666"));
            canvas.drawPath(b, a);
            Path path = new Path();
            b.transform(matrix, path);
            canvas.drawPath(path, a);
            c = a(bitmap);
            return c;
        }
    }
}
