// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget.fliks;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuffXfermode;

public class FlikMaskDecorator
{
    public static interface Callback
    {

        public abstract void a(Canvas canvas);
    }


    private static final PorterDuffXfermode a;
    private boolean b;
    private int c;
    private int d;
    private Path e;
    private android.graphics.Path.FillType f;
    private final Paint g = new Paint();
    private final Paint h = new Paint();
    private Bitmap i;
    private Canvas j;

    public FlikMaskDecorator()
    {
        c = -1;
        d = -1;
        h.setColor(0xff000000);
        h.setAntiAlias(true);
        g.setAntiAlias(true);
        g.setStyle(android.graphics.Paint.Style.FILL);
        b = true;
        f = android.graphics.Path.FillType.WINDING;
        b(152, 152);
    }

    private void b(int k, int l)
    {
        e = new Path();
        e.moveTo(140F, 149F);
        e.cubicTo(140F, 149F, 109F, 152F, 75F, 152F);
        e.cubicTo(41F, 152F, 12F, 149F, 12F, 149F);
        e.cubicTo(5F, 148F, 3F, 145F, 2.0F, 139F);
        e.cubicTo(2.0F, 139F, 0.0F, 117F, 0.0F, 75F);
        e.cubicTo(0.0F, 33F, 2.0F, 13F, 2.0F, 13F);
        e.cubicTo(3F, 7F, 7F, 4F, 12F, 3F);
        e.cubicTo(12F, 3F, 23F, 0.0F, 75F, 0.0F);
        e.cubicTo(126F, 0.0F, 140F, 3F, 140F, 3F);
        e.cubicTo(145F, 3F, 149F, 7F, 149F, 13F);
        e.cubicTo(149F, 13F, 152F, 35F, 152F, 76F);
        e.cubicTo(152F, 116F, 149F, 139F, 149F, 139F);
        e.cubicTo(149F, 145F, 146F, 148F, 140F, 149F);
        e.close();
        e.setFillType(f);
        Matrix matrix = new Matrix();
        matrix.setScale((float)k / 152F, (float)l / 152F);
        e.transform(matrix);
    }

    public final void a(int k)
    {
        b = false;
        g.setColor(k);
        f = android.graphics.Path.FillType.INVERSE_WINDING;
    }

    public final void a(int k, int l)
    {
        if (c == k && d == l || l == 0 || k == 0)
        {
            return;
        }
        c = k;
        d = l;
        if (b)
        {
            i = Bitmap.createBitmap(k, k, android.graphics.Bitmap.Config.ARGB_8888);
            j = new Canvas(i);
        }
        b(k, l);
    }

    public final void a(Canvas canvas, Callback callback)
    {
        int k = canvas.getWidth();
        int l = canvas.getHeight();
        if (b)
        {
            k = canvas.saveLayer(0.0F, 0.0F, k, l, h, 31);
            canvas.drawColor(0);
            canvas.drawPath(e, h);
            android.graphics.Xfermode xfermode = h.getXfermode();
            h.setXfermode(a);
            callback.a(j);
            canvas.drawBitmap(i, 0.0F, 0.0F, h);
            h.setXfermode(xfermode);
            canvas.restoreToCount(k);
            return;
        } else
        {
            callback.a(canvas);
            canvas.drawPath(e, g);
            return;
        }
    }

    static 
    {
        a = new PorterDuffXfermode(android.graphics.PorterDuff.Mode.SRC_IN);
    }
}
