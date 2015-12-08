// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.freecrop;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.roidapp.imagelib.b.c;

// Referenced classes of package com.roidapp.imagelib.freecrop:
//            l, a, b, FreeCropView

public final class n extends l
{

    private Path G;
    private Paint H;
    private a I;
    private a J;
    private float K;
    private float L;
    private int M;
    private boolean N;

    public n(Context context, Bitmap bitmap, int i, int j)
    {
        super(context, bitmap, i, j);
        I = null;
        J = null;
        H = new Paint();
        H.setAntiAlias(true);
        H.setAlpha(0);
    }

    public final void a()
    {
        x.reset();
        D = 1.0F;
        E = 1.0F;
    }

    public final void a(int i, int j)
    {
        if (I != null)
        {
            int k = a.getWidth();
            int i1 = a.getHeight();
            RectF rectf = new RectF(0.0F, 0.0F, k, i1);
            RectF rectf1 = new RectF(0.0F, 0.0F, i, j);
            v.mapRect(rectf1);
            I.a(t, rectf, rectf1);
        }
    }

    public final void a(Canvas canvas, Matrix matrix, boolean flag)
    {
        canvas.save();
        super.a(canvas, matrix, flag);
        canvas.restore();
        if (G != null && !G.isEmpty())
        {
            matrix = canvas.getMatrix();
            canvas.save();
            canvas.concat(h());
            canvas.concat(k());
            canvas.clipPath(G, android.graphics.Region.Op.DIFFERENCE);
            canvas.save();
            canvas.setMatrix(matrix);
            canvas.translate(l(), m());
            canvas.rotate(g(), 0.0F, 0.0F);
            canvas.drawRect(i, l);
            canvas.restore();
            canvas.drawPath(G, H);
            canvas.restore();
            canvas.save();
            canvas.concat(h());
            canvas.concat(k());
            I.a(canvas);
            canvas.restore();
        }
    }

    public final void a(Path path)
    {
        G = path;
    }

    public final void a(FreeCropView freecropview)
    {
        super.a(freecropview);
        I = new a(freecropview, this);
    }

    public final boolean a(float f, float f1)
    {
        a a1 = I;
        if (a1 != null && a1.b != null)
        {
            int i = a1.a(f, f1);
            if (i != 0)
            {
                M = i;
                PointF pointf = com.roidapp.imagelib.freecrop.a.a(f, f1, i());
                K = pointf.x;
                L = pointf.y;
                J = a1;
                a1 = J;
                if (i == 5)
                {
                    i = b.b;
                } else
                {
                    i = com.roidapp.imagelib.freecrop.b.c;
                }
                a1.a(i);
            }
            N = true;
            return true;
        } else
        {
            return false;
        }
    }

    public final boolean a(float f, float f1, float f2, float f3)
    {
        if (J != null)
        {
            if (m && N)
            {
                J.a(f, f1, f2, f3);
                N = false;
            }
            PointF pointf = com.roidapp.imagelib.freecrop.a.a(f, f1, i());
            J.a(m, M, pointf.x - K, pointf.y - L, f, f1, f2, f3);
            K = pointf.x;
            L = pointf.y;
        }
        return true;
    }

    public final boolean c()
    {
        super.c();
        g = new RectF();
        if (G != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        Paint paint;
        G.transform(x);
        G.computeBounds(g, false);
        paint = new Paint();
        paint.setColor(0xff000000);
        paint.setAntiAlias(true);
        d = Math.round(g.width());
        e = Math.round(g.height());
        f = com.roidapp.imagelib.b.c.a(d, e, android.graphics.Bitmap.Config.ARGB_8888);
        if (f == null) goto _L1; else goto _L3
_L3:
        Canvas canvas = new Canvas(f);
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        Matrix matrix = new Matrix();
        matrix.postTranslate(-g.left, -g.top);
        G.transform(matrix);
        canvas.drawPath(G, paint);
        return true;
        Object obj;
        obj;
        ((OutOfMemoryError) (obj)).printStackTrace();
        System.gc();
        com.roidapp.imagelib.b.c.a(f);
        return false;
        obj;
        ((Exception) (obj)).printStackTrace();
        com.roidapp.imagelib.b.c.a(f);
        return false;
    }

    public final boolean d()
    {
        if (J != null)
        {
            J.a(b.a);
        }
        J = null;
        return true;
    }
}
