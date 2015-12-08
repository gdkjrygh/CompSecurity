// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.freecrop;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import com.roidapp.imagelib.b.c;

// Referenced classes of package com.roidapp.imagelib.freecrop:
//            m, c, a, FreeCropView

public abstract class l extends m
{

    private com.roidapp.imagelib.freecrop.c G;
    private Paint H;
    private Paint I;
    private Paint J;
    private float K;
    private int L;
    protected Bitmap a;
    protected boolean b;
    protected boolean c;
    protected int d;
    protected int e;
    protected Bitmap f;
    protected RectF g;
    public a h;
    protected Rect i;
    protected View j;
    protected Context k;
    protected Paint l;
    protected boolean m;

    public l(Context context, Bitmap bitmap, int i1, int j1)
    {
        L = 8;
        h = null;
        i = new Rect();
        l = new Paint();
        m = false;
        k = context;
        a = bitmap;
        r = a.getWidth();
        q = a.getHeight();
        float f1 = Math.min((float)i1 / (float)r, (float)j1 / (float)q);
        a((float)i1 / 2.0F - ((float)r * f1) / 2.0F, (float)j1 / 2.0F - ((float)q * f1) / 2.0F, f1);
        l.setARGB(125, 50, 50, 50);
        l.setAntiAlias(true);
    }

    private Bitmap a()
    {
        Bitmap bitmap = com.roidapp.imagelib.b.c.a(d, e, android.graphics.Bitmap.Config.ARGB_8888);
        if (bitmap == null)
        {
            return null;
        }
        Canvas canvas = new Canvas(bitmap);
        canvas.drawBitmap(a, -g.left, -g.top, null);
        if (b)
        {
            if (I == null)
            {
                I = new Paint();
                I.setColor(-1);
                I.setStrokeWidth(K);
                I.setStyle(android.graphics.Paint.Style.STROKE);
                I.setAntiAlias(true);
            }
            canvas.drawPath(G, I);
        }
        if (f != null && !f.isRecycled())
        {
            canvas.save();
            canvas.drawBitmap(f, 0.0F, 0.0F, H);
            canvas.restore();
        }
        if (c)
        {
            if (J == null)
            {
                J = new Paint();
                BlurMaskFilter blurmaskfilter = new BlurMaskFilter(L, android.graphics.BlurMaskFilter.Blur.OUTER);
                J.setAntiAlias(true);
                J.setFilterBitmap(true);
                J.setMaskFilter(blurmaskfilter);
                J.setColor(0xff000000);
            }
            canvas.drawPath(G, J);
        }
        return bitmap;
        Object obj;
        obj;
        bitmap = null;
_L4:
        ((OutOfMemoryError) (obj)).printStackTrace();
        System.gc();
        com.roidapp.imagelib.b.c.a(bitmap);
        return null;
        obj;
        bitmap = null;
_L2:
        ((Exception) (obj)).printStackTrace();
        com.roidapp.imagelib.b.c.a(bitmap);
        return null;
        obj;
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void a(Canvas canvas, Matrix matrix, boolean flag)
    {
        j.getDrawingRect(i);
        if (f == null)
        {
            if (flag)
            {
                canvas.concat(matrix);
            }
            if (a != null && !a.isRecycled() && t != null)
            {
                canvas.drawBitmap(a, t, null);
            }
        }
    }

    public void a(FreeCropView freecropview)
    {
        j = freecropview;
    }

    public final void a(boolean flag)
    {
        m = flag;
    }

    public final void a(float af[])
    {
        if (!c(af[0], af[1]))
        {
            if (af[0] > (float)r)
            {
                af[0] = r;
            }
            if (af[1] > (float)q)
            {
                af[1] = q;
            }
            if (af[0] < 0.0F)
            {
                af[0] = 0.0F;
            }
            if (af[1] < 0.0F)
            {
                af[1] = 0.0F;
            }
        }
    }

    public boolean a(float f1, float f2)
    {
        return false;
    }

    public boolean a(float f1, float f2, float f3, float f4)
    {
        return false;
    }

    public boolean c()
    {
        H = new Paint();
        H.setColor(0xff000000);
        H.setXfermode(new PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_IN));
        return true;
    }

    public boolean d()
    {
        return false;
    }

    public final Bitmap e()
    {
        return a;
    }

    public final Bitmap f()
    {
        if (!c())
        {
            return null;
        } else
        {
            b = false;
            c = false;
            Bitmap bitmap = a();
            com.roidapp.imagelib.b.c.a(f);
            return bitmap;
        }
    }
}
