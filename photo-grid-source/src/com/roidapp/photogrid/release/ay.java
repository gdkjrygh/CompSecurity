// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuffXfermode;
import java.util.ArrayList;
import java.util.Iterator;

public final class ay
{

    public int a;
    public float b;
    private ArrayList c;
    private Path d;
    private PointF e;

    public ay()
    {
        a = 0xff00ff00;
        b = 12F;
        c = new ArrayList();
        d = new Path();
        e = null;
    }

    public final int a()
    {
        return c.size();
    }

    public final void a(Canvas canvas, float f, Paint paint)
    {
        this;
        JVM INSTR monitorenter ;
        ArrayList arraylist;
        if (a == 0)
        {
            paint.setXfermode(new PorterDuffXfermode(android.graphics.PorterDuff.Mode.MULTIPLY));
        }
        arraylist = new ArrayList();
        PointF pointf;
        for (Iterator iterator = c.iterator(); iterator.hasNext(); arraylist.add(new PointF(pointf.x * f, pointf.y * f)))
        {
            pointf = (PointF)iterator.next();
        }

        break MISSING_BLOCK_LABEL_99;
        canvas;
        throw canvas;
        if (c.size() <= 1) goto _L2; else goto _L1
_L1:
        Object obj;
        Path path;
        path = new Path();
        obj = (PointF)arraylist.get(0);
        path.moveTo(((PointF) (obj)).x, ((PointF) (obj)).y);
        paint.setColor(a);
        paint.setStyle(android.graphics.Paint.Style.FILL);
        canvas.drawCircle(((PointF) (obj)).x, ((PointF) (obj)).y, (b * f) / 2.0F, paint);
        int i = 1;
_L10:
        if (i >= arraylist.size()) goto _L4; else goto _L3
_L3:
        float f1;
        float f2;
        PointF pointf1;
        pointf1 = (PointF)arraylist.get(i);
        f1 = Math.abs(pointf1.x - ((PointF) (obj)).x);
        f2 = Math.abs(pointf1.y - ((PointF) (obj)).y);
        if (f1 <= 0.0F && f2 <= 0.0F) goto _L6; else goto _L5
_L5:
        path.quadTo(((PointF) (obj)).x, ((PointF) (obj)).y, (pointf1.x + ((PointF) (obj)).x) / 2.0F, (pointf1.y + ((PointF) (obj)).y) / 2.0F);
        f1 = (pointf1.x + ((PointF) (obj)).x) / 2.0F;
        f2 = pointf1.y;
        canvas.drawCircle(f1, (((PointF) (obj)).y + f2) / 2.0F, (b * f) / 2.0F, paint);
          goto _L7
_L11:
        path.quadTo(((PointF) (obj)).x, ((PointF) (obj)).y, (pointf1.x + ((PointF) (obj)).x + 1.0F) / 2.0F, (pointf1.y + ((PointF) (obj)).y + 1.0F) / 2.0F);
        f1 = (pointf1.x + ((PointF) (obj)).x + 1.0F) / 2.0F;
        f2 = pointf1.y;
        canvas.drawCircle(f1, (((PointF) (obj)).y + f2 + 1.0F) / 2.0F, (b * f) / 2.0F, paint);
          goto _L7
_L4:
        paint.setStrokeWidth(b * f);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        canvas.drawPath(path, paint);
_L9:
        paint.setXfermode(null);
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (c.size() != 1) goto _L9; else goto _L8
_L8:
        obj = new Path();
        pointf1 = (PointF)arraylist.get(0);
        ((Path) (obj)).moveTo(pointf1.x, pointf1.y);
        paint.setStyle(android.graphics.Paint.Style.FILL);
        paint.setColor(a);
        ((Path) (obj)).quadTo(pointf1.x, pointf1.y, (pointf1.x + pointf1.x + 1.0F) / 2.0F, (pointf1.y + pointf1.y + 1.0F) / 2.0F);
        f1 = (pointf1.x + pointf1.x + 1.0F) / 2.0F;
        f2 = pointf1.y;
        canvas.drawCircle(f1, (pointf1.y + f2 + 1.0F) / 2.0F, (b * f) / 2.0F, paint);
        paint.setStrokeWidth(b * f);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        canvas.drawPath(((Path) (obj)), paint);
          goto _L9
_L7:
        i++;
        obj = pointf1;
          goto _L10
_L6:
        if (f1 != 0.0F && f2 != 0.0F) goto _L7; else goto _L11
    }

    public final void a(Canvas canvas, Paint paint)
    {
        if (a == 0)
        {
            paint.setXfermode(new PorterDuffXfermode(android.graphics.PorterDuff.Mode.MULTIPLY));
        }
        if (c.size() <= 1) goto _L2; else goto _L1
_L1:
        PointF pointf = (PointF)c.get(0);
        paint.setStyle(android.graphics.Paint.Style.FILL);
        paint.setColor(a);
        canvas.drawCircle(pointf.x, pointf.y, b / 2.0F, paint);
        pointf = (PointF)c.get(c.size() - 1);
        PointF pointf2 = (PointF)c.get(c.size() - 2);
        canvas.drawCircle((pointf.x + pointf2.x) / 2.0F, (pointf.y + pointf2.y) / 2.0F, b / 2.0F, paint);
        paint.setStrokeWidth(b);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        canvas.drawPath(d, paint);
_L4:
        paint.setXfermode(null);
        return;
_L2:
        if (c.size() == 1)
        {
            PointF pointf1 = (PointF)c.get(0);
            paint.setStyle(android.graphics.Paint.Style.FILL);
            paint.setColor(a);
            canvas.drawCircle(pointf1.x, pointf1.y, b / 2.0F, paint);
            paint.setStrokeWidth(b);
            paint.setStyle(android.graphics.Paint.Style.STROKE);
            canvas.drawPath(d, paint);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void a(PointF pointf)
    {
        this;
        JVM INSTR monitorenter ;
        if (c.size() != 0) goto _L2; else goto _L1
_L1:
        e = pointf;
        d.moveTo(e.x, e.y);
        c.add(pointf);
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        float f;
        float f1;
        f = Math.abs(pointf.x - e.x);
        f1 = Math.abs(pointf.y - e.y);
        if (f <= 0.0F && f1 <= 0.0F)
        {
            continue; /* Loop/switch isn't completed */
        }
        d.quadTo(e.x, e.y, (pointf.x + e.x) / 2.0F, (pointf.y + e.y) / 2.0F);
        c.add(pointf);
        e = pointf;
        if (true) goto _L4; else goto _L3
_L3:
        pointf;
        throw pointf;
    }
}
