// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.scan.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;

public final class kik.android.scan.widget.a extends Drawable
{
    private static final class a
    {

        private static final Interpolator a = new LinearInterpolator();
        private final int b = 300;
        private final long c;
        private final int d;
        private final Point e;

        static int a(a a1)
        {
            return a1.d;
        }

        static Point b(a a1)
        {
            return a1.e;
        }

        final float a()
        {
            float f1 = (float)(System.currentTimeMillis() - c) / (float)b;
            return a.getInterpolation(f1);
        }

        final boolean b()
        {
            long l = System.currentTimeMillis();
            long l1 = c;
            long l2 = b;
            return c == 0L || l > l1 + l2;
        }


        public a(long l, int i, Point point)
        {
            c = l;
            d = i;
            e = point;
        }
    }


    private int a;
    private final Paint b = new Paint();
    private final Paint c = new Paint();
    private int d;
    private final ArrayList e = new ArrayList();
    private final Object f = new Object();

    public kik.android.scan.widget.a(int i)
    {
        c.setAntiAlias(true);
        b.setAntiAlias(true);
        a = i;
    }

    public final void a(int i, Point point)
    {
        a a1 = new a(System.currentTimeMillis(), i, point);
        synchronized (f)
        {
            e.add(a1);
        }
        invalidateSelf();
        return;
        exception;
        point;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void draw(Canvas canvas)
    {
        Object obj = f;
        obj;
        JVM INSTR monitorenter ;
        int i = 0;
_L5:
        if (i >= e.size()) goto _L2; else goto _L1
_L1:
        int j = i;
        if (!((a)e.get(i)).b()) goto _L4; else goto _L3
_L3:
        a a1 = (a)e.remove(i);
        j = i - 1;
        a = a.a(a1);
          goto _L4
_L2:
        b.setColor(a);
        canvas.drawRect(getBounds(), b);
        i = 0;
_L6:
        if (i < e.size())
        {
            a a2 = (a)e.get(i);
            c.setColor(a.a(a2));
            float f1 = d;
            float f2 = a2.a();
            if (a.b(a2) != null)
            {
                canvas.drawCircle(a.b(a2).x, a.b(a2).y, f1 * f2, c);
            }
            break MISSING_BLOCK_LABEL_227;
        }
        if (e.size() > 0)
        {
            invalidateSelf();
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        canvas;
        obj;
        JVM INSTR monitorexit ;
        throw canvas;
_L4:
        i = j + 1;
          goto _L5
        i++;
          goto _L6
    }

    public final int getOpacity()
    {
        return -1;
    }

    protected final void onBoundsChange(Rect rect)
    {
        super.onBoundsChange(rect);
        d = Math.max(rect.width(), rect.height());
    }

    public final void setAlpha(int i)
    {
    }

    public final void setColorFilter(ColorFilter colorfilter)
    {
    }
}
