// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.freecrop;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.roidapp.imagelib.b.c;
import com.roidapp.imagelib.f;

// Referenced classes of package com.roidapp.imagelib.freecrop:
//            l, c

public final class d extends l
{

    private com.roidapp.imagelib.freecrop.c G;
    private boolean H;
    private Drawable I;
    private Drawable J;
    private Paint K;
    private float L;

    public d(Context context, Bitmap bitmap, int i, int j)
    {
        super(context, bitmap, i, j);
        H = false;
        K = new Paint();
        G = new com.roidapp.imagelib.freecrop.c(n());
        i = k.getResources().getColor(com.roidapp.imagelib.d.a);
        K.setColor(i);
        K.setStrokeWidth(4F);
        K.setStyle(android.graphics.Paint.Style.STROKE);
        K.setAntiAlias(true);
        J = k.getResources().getDrawable(f.aM);
        I = k.getResources().getDrawable(f.aq);
        I.setVisible(false, false);
    }

    public final void a(Canvas canvas, Matrix matrix, boolean flag)
    {
        canvas.save();
        super.a(canvas, matrix, flag);
        canvas.restore();
        if (G != null && G.i() != 0)
        {
            canvas.save();
            canvas.translate(l(), m());
            canvas.rotate(g(), 0.0F, 0.0F);
            if (H)
            {
                canvas.save();
                canvas.clipPath(G, android.graphics.Region.Op.DIFFERENCE);
                canvas.drawRect(this.i, l);
                canvas.restore();
            }
            canvas.drawPath(G, K);
            canvas.restore();
            if (J.isVisible())
            {
                if (G != null && !G.isEmpty() && J != null)
                {
                    matrix = G.e();
                    if (matrix != null)
                    {
                        h().mapPoints(matrix);
                        float f1 = J.getMinimumWidth();
                        float f3 = J.getMinimumHeight();
                        Drawable drawable = J;
                        int i = (int)(matrix[0] - f1 / 2.0F);
                        int k = (int)(matrix[1] - f3);
                        f3 = matrix[0];
                        drawable.setBounds(i, k, (int)(f1 / 2.0F + f3), (int)matrix[1]);
                    }
                }
                J.draw(canvas);
            }
            if (I.isVisible())
            {
                if (G != null && !G.isEmpty() && I != null)
                {
                    matrix = G.d();
                    if (matrix != null)
                    {
                        h().mapPoints(matrix);
                        float f2 = I.getMinimumWidth();
                        float f4 = I.getMinimumHeight();
                        Drawable drawable1 = I;
                        int j = (int)(matrix[0] - f2 / 2.0F);
                        int i1 = (int)(matrix[1] - f4 / 2.0F);
                        float f5 = matrix[0];
                        drawable1.setBounds(j, i1, (int)(f2 / 2.0F + f5), (int)(matrix[1] + f4 / 2.0F));
                        L = G.c() + g();
                    }
                }
                canvas.rotate(L, I.getBounds().centerX(), I.getBounds().centerY());
                I.draw(canvas);
            }
        }
    }

    public final boolean a()
    {
        return H;
    }

    public final boolean a(float f1, float f2)
    {
        boolean flag = true;
        float af[] = new float[2];
        af[0] = f1;
        af[1] = f2;
        i().mapPoints(af);
        a(af);
        if (G != null)
        {
            if (!G.a(af[0], af[1]) || H)
            {
                G.moveTo(af[0], af[1]);
            } else
            {
                G.a(af[0], af[1], true);
                flag = false;
            }
        } else
        {
            flag = false;
        }
        if (I != null)
        {
            I.setVisible(false, false);
        }
        H = false;
        return flag;
    }

    public final boolean a(float f1, float f2, float f3, float f4)
    {
        float af[] = new float[2];
        af[0] = f1;
        af[1] = f2;
        i().mapPoints(af);
        a(af);
        if (G != null)
        {
            G.a(af[0], af[1], false);
        }
        return true;
    }

    public final com.roidapp.imagelib.freecrop.c b()
    {
        return G;
    }

    public final boolean c()
    {
        float f1;
        super.c();
        g = new RectF();
        f1 = G.a();
        G.a(1.0F);
        G.a(G.f(), G.g());
        G.computeBounds(g, false);
        if (g.width() > 0.0F && g.height() > 0.0F) goto _L2; else goto _L1
_L1:
        G.a(f1);
_L4:
        return false;
_L2:
        Paint paint;
        paint = new Paint();
        paint.setColor(0xff000000);
        paint.setAntiAlias(true);
        d = Math.round(g.width());
        e = Math.round(g.height());
        f = com.roidapp.imagelib.b.c.a(d, e, android.graphics.Bitmap.Config.ARGB_8888);
        if (f == null) goto _L4; else goto _L3
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
        if (G == null) goto _L2; else goto _L1
_L1:
        if (!com.roidapp.imagelib.freecrop.c.a(G.b())) goto _L4; else goto _L3
_L3:
        G.reset();
        H = true;
_L2:
        if (I != null && !H)
        {
            I.setVisible(true, false);
        }
        return H;
_L4:
        G.h();
        float af[] = G.e();
        float af1[] = G.d();
        if (com.roidapp.imagelib.freecrop.c.a(af[0], af[1], af1[0], af1[1]))
        {
            G.close();
            H = true;
        }
        if (true) goto _L2; else goto _L5
_L5:
    }
}
