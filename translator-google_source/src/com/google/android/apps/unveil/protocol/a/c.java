// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.protocol.a;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.google.android.apps.unveil.env.ImageUtils;
import com.google.android.apps.unveil.env.Size;
import com.google.android.apps.unveil.env.a;
import com.google.android.apps.unveil.env.j;
import com.google.android.apps.unveil.env.k;
import com.google.android.apps.unveil.nonstop.m;
import com.google.android.apps.unveil.nonstop.o;
import com.google.android.apps.unveil.results.ResultItem;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

public final class c
{

    private final a a = new a(16F);
    private final int b;
    private final Size c;
    private final o d;
    private final boolean e;
    private final int f;
    private final byte g[];
    private j h;

    public c(m m1, byte abyte0[])
    {
        b = m1.g;
        c = m1.f;
        d = m1.h;
        e = m1.f();
        f = m1.a;
        g = abyte0;
    }

    private j a(int i, boolean flag)
    {
        Object obj = null;
        this;
        JVM INSTR monitorenter ;
        if (h != null) goto _L2; else goto _L1
_L1:
        byte abyte0[] = g;
        if (abyte0 != null) goto _L4; else goto _L3
_L3:
        h = ((j) (obj));
_L2:
        obj = h;
        this;
        JVM INSTR monitorexit ;
        return ((j) (obj));
_L4:
        Bitmap bitmap = k.a(abyte0, 0).c();
        if (bitmap == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        Object obj1;
        Size size;
        obj = Bitmap.createBitmap(100, i, android.graphics.Bitmap.Config.RGB_565);
        obj1 = new Size(bitmap);
        size = new Size(((Bitmap) (obj)));
        if (flag)
        {
            i = 90;
        } else
        {
            i = 0;
        }
        obj1 = ImageUtils.a(((Size) (obj1)), size, i);
        (new Canvas(((Bitmap) (obj)))).drawBitmap(bitmap, ((Matrix) (obj1)), new Paint());
        obj = k.a(((Bitmap) (obj)), 0);
        if (true) goto _L3; else goto _L5
_L5:
        Exception exception;
        exception;
        throw exception;
    }

    private void a(Canvas canvas, int i)
    {
        int l = 0xffff0000;
        if (d.e.isEmpty()) goto _L2; else goto _L1
_L1:
        l = 0xff00ff00;
_L4:
        a.a.setColor(l);
        Object obj = new Vector();
        l = f;
        ((Vector) (obj)).add((new StringBuilder(14)).append("#: ").append(l).toString());
        boolean flag = e;
        ((Vector) (obj)).add((new StringBuilder(10)).append("blr: ").append(flag).toString());
        if (g != null)
        {
            l = g.length / 1024;
            ((Vector) (obj)).add((new StringBuilder(18)).append("JPG: ").append(l).append("kB").toString());
            o o1 = d;
            long l1 = o1.a;
            long l4 = o1.d;
            ((Vector) (obj)).add((new StringBuilder(27)).append("lcl: ").append(l1 - l4).append("ms").toString());
        }
        o o2 = d;
        Vector vector = new Vector();
        if (o2.b != -1L)
        {
            long l2 = o2.b;
            long l5 = o2.d;
            vector.add((new StringBuilder(26)).append("up: ").append(l2 - l5).append("ms").toString());
        }
        if (o2.c != -1L)
        {
            long l3 = o2.c;
            long l6 = o2.d;
            vector.add((new StringBuilder(27)).append("s+r: ").append(l3 - l6).append("ms").toString());
            l = o2.e.size();
            vector.add((new StringBuilder(17)).append("#res: ").append(l).toString());
        }
        ((Vector) (obj)).addAll(vector);
        String s;
        for (obj = ((Vector) (obj)).iterator(); ((Iterator) (obj)).hasNext(); a.a(canvas, 4F, i, s))
        {
            s = (String)((Iterator) (obj)).next();
            i += 18;
        }

        break; /* Loop/switch isn't completed */
_L2:
        if (d.b != -1L)
        {
            l = -256;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void a(Canvas canvas, Matrix matrix)
    {
        Map map = d.e;
        Iterator iterator = map.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj = (ResultItem)map.get((String)iterator.next());
            Paint paint = new Paint();
            paint.setStrokeWidth(2.0F);
            paint.setStyle(android.graphics.Paint.Style.STROKE);
            paint.setColor(0xff00ff00);
            if (((ResultItem) (obj)).getBoundingBox() != null && ((ResultItem) (obj)).getBoundingBox().right - ((ResultItem) (obj)).getBoundingBox().left > 0)
            {
                obj = new RectF(((ResultItem) (obj)).getBoundingBox());
                matrix.mapRect(((RectF) (obj)));
                canvas.drawRoundRect(((RectF) (obj)), 1.0F, 1.0F, paint);
            }
        } while (true);
    }

    public final void a(Canvas canvas)
    {
        this;
        JVM INSTR monitorenter ;
        float f1;
        Object obj;
        Bitmap bitmap;
        int i;
        boolean flag;
        if (b != 90 && b != 270)
        {
            flag = false;
        } else
        {
            flag = true;
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        i = c.height;
_L7:
        f1 = 100F / (float)i;
        if (!flag) goto _L4; else goto _L3
_L3:
        i = c.width;
_L8:
        i = (int)((float)i * f1);
        obj = new Paint();
        if (g == null) goto _L6; else goto _L5
_L5:
        bitmap = a(i, flag).c();
        if (bitmap == null)
        {
            break MISSING_BLOCK_LABEL_110;
        }
        canvas.drawBitmap(bitmap, 0.0F, 0.0F, ((Paint) (obj)));
_L9:
        obj = new Matrix();
        ((Matrix) (obj)).postScale(f1, f1);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_167;
        }
        ((Matrix) (obj)).postTranslate(-i / 2, -50F);
        ((Matrix) (obj)).postRotate(b);
        ((Matrix) (obj)).postTranslate(50F, i / 2);
        ((Matrix) (obj)).postTranslate(0.0F, 0.0F);
        a(canvas, ((Matrix) (obj)));
        a(canvas, i);
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        i = c.width;
          goto _L7
_L4:
        i = c.height;
          goto _L8
_L6:
        ((Paint) (obj)).setColor(0xff444444);
        canvas.drawRect(new Rect(0, 0, 100, i), ((Paint) (obj)));
          goto _L9
        canvas;
        throw canvas;
          goto _L7
    }
}
