// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.freecrop;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.util.FloatMath;
import android.view.View;
import com.roidapp.imagelib.f;

// Referenced classes of package com.roidapp.imagelib.freecrop:
//            b, l

public final class a
{

    View a;
    public RectF b;
    public Matrix c;
    private RectF d;
    private Bitmap e;
    private boolean f;
    private float g;
    private boolean h;
    private boolean i;
    private Drawable j;
    private Drawable k;
    private final Paint l = new Paint();
    private final Paint m = new Paint();
    private final Paint n = new Paint();
    private l o;
    private float p;
    private float q;
    private int r;
    private int s;

    public a(View view, l l1)
    {
        f = false;
        h = false;
        q = 1.0F;
        r = 0;
        s = b.a;
        a = view;
        o = l1;
        view = a.getResources();
        int i1 = a.getResources().getDisplayMetrics().widthPixels;
        int j1 = a.getResources().getDisplayMetrics().heightPixels;
        if (i1 <= j1)
        {
            i1 = j1;
        }
        r = i1;
        j = view.getDrawable(f.at);
        k = view.getDrawable(f.av);
    }

    private static float a(PointF pointf, PointF pointf1)
    {
        double d1 = 1.0D;
        float f1 = pointf.x - pointf1.x;
        float f2 = pointf.y - pointf1.y;
        double d2 = (double)f1 / Math.sqrt(f1 * f1 + f2 * f2);
        float f3;
        if (d2 <= 1.0D)
        {
            if (d2 < -1D)
            {
                d1 = -1D;
            } else
            {
                d1 = d2;
            }
        }
        f3 = (float)((Math.asin(d1) * 180D) / 3.1415926535897931D);
        if (f1 >= 0.0F && f2 <= 0.0F)
        {
            return 360F - f3;
        }
        if (f1 <= 0.0F && f2 <= 0.0F)
        {
            return -f3;
        }
        if (f1 <= 0.0F && f2 >= 0.0F)
        {
            return f3 + 180F;
        }
        if (f1 >= 0.0F && f2 >= 0.0F)
        {
            return f3 + 180F;
        } else
        {
            return 0.0F;
        }
    }

    public static PointF a(float f1, float f2, Matrix matrix)
    {
        float af[] = new float[2];
        af[0] = f1;
        af[1] = f2;
        matrix.mapPoints(af);
        return new PointF(af[0], af[1]);
    }

    private boolean a()
    {
        RectF rectf = new RectF(b.left, b.top, b.right, b.bottom);
        o.k().mapRect(rectf);
        o.h().mapRect(rectf);
        float f1;
        if (rectf.width() > rectf.height())
        {
            f1 = rectf.width();
        } else
        {
            f1 = rectf.height();
        }
        return f1 > (float)r * 1.5F;
    }

    private static float b(float f1, float f2, float f3, float f4)
    {
        f1 -= f3;
        f2 -= f4;
        return FloatMath.sqrt(f1 * f1 + f2 * f2);
    }

    private boolean b()
    {
        RectF rectf = new RectF(b.left, b.top, b.right, b.bottom);
        o.k().mapRect(rectf);
        o.h().mapRect(rectf);
        float f1;
        if (rectf.width() > rectf.height())
        {
            f1 = rectf.width();
        } else
        {
            f1 = rectf.height();
        }
        return f1 < (float)r * 0.1F;
    }

    private Rect c()
    {
        RectF rectf = new RectF(b.left, b.top, b.right, b.bottom);
        return new Rect(Math.round(rectf.left), Math.round(rectf.top), Math.round(rectf.right), Math.round(rectf.bottom));
    }

    public final int a(float f1, float f2)
    {
        float f3;
        float f4;
        byte byte0;
        byte byte1;
        c();
        byte1 = 0;
        byte0 = 0;
        f3 = (b.left + b.right) / 2.0F;
        f4 = (b.top + b.bottom) / 2.0F;
        if (o == null) goto _L2; else goto _L1
_L1:
        Object obj;
        PointF pointf;
        PointF pointf1;
        PointF pointf2;
        PointF pointf3;
        obj = a(f1, f2, o.i());
        pointf = a(f3, f4, o.k());
        p = a(new PointF(((PointF) (obj)).x, ((PointF) (obj)).y), new PointF(pointf.x, pointf.y));
        obj = new Matrix();
        ((Matrix) (obj)).setConcat(o.k(), ((Matrix) (obj)));
        ((Matrix) (obj)).setConcat(o.h(), ((Matrix) (obj)));
        pointf = a(b.left, b.top, ((Matrix) (obj)));
        pointf1 = a(b.right, b.top, ((Matrix) (obj)));
        pointf2 = a(b.right, b.bottom, ((Matrix) (obj)));
        pointf3 = a(b.left, b.bottom, ((Matrix) (obj)));
        if (b(f1, f2, pointf.x, pointf.y) >= 30F) goto _L4; else goto _L3
_L3:
        byte0 = 1;
_L6:
        RectF rectf = new RectF();
        ((Matrix) (obj)).mapRect(rectf, b);
        byte1 = byte0;
        if (byte0 == 0)
        {
            byte1 = byte0;
            if (rectf.contains(f1, f2))
            {
                byte1 = 5;
            }
        }
        q = 0.0F;
_L2:
        return byte1;
_L4:
        if (b(f1, f2, pointf1.x, pointf1.y) < 30F)
        {
            byte0 = 2;
        } else
        if (b(f1, f2, pointf2.x, pointf2.y) < 30F)
        {
            byte0 = 4;
        } else
        if (b(f1, f2, pointf3.x, pointf3.y) < 30F)
        {
            byte0 = 3;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final void a(float f1, float f2, float f3, float f4)
    {
        p = a(new PointF(f1, f2), new PointF(f3, f4));
    }

    public final void a(int i1)
    {
        if (i1 != s)
        {
            s = i1;
            a.invalidate();
        }
    }

    public final void a(Canvas canvas)
    {
        if (!i)
        {
            Path path = new Path();
            path.addRect(new RectF(b), android.graphics.Path.Direction.CW);
            n.setColor(0x880000ff);
            n.setAntiAlias(true);
            canvas.drawPath(path, n);
            if (s == b.a || s == b.c)
            {
                if (h)
                {
                    int i2 = j.getIntrinsicWidth();
                    int i1 = j.getIntrinsicHeight();
                    int k1 = (int)Math.round(Math.cos(0.78539816339744828D) * ((double)b.width() / 2D));
                    i2 = (int)((b.left + b.width() / 2.0F + (float)k1) - (float)(i2 / 2));
                    i1 = (int)((b.top + b.height() / 2.0F) - (float)k1 - (float)(i1 / 2));
                    j.setBounds(i2, i1, j.getIntrinsicWidth() + i2, j.getIntrinsicHeight() + i1);
                    j.draw(canvas);
                    return;
                }
                int j2 = (int)b.left;
                int j1 = (int)b.right;
                int k2 = (int)b.top;
                int l1 = (int)b.bottom;
                int l2 = j.getIntrinsicWidth() / 2;
                int i3 = j.getIntrinsicHeight() / 2;
                canvas.save();
                if (o != null)
                {
                    canvas.scale(1.0F / (o.n() * o.D), 1.0F / (o.n() * o.E), j2, k2);
                }
                j.setBounds(j2 - l2, k2 - i3, j2 + l2, k2 + i3);
                j.draw(canvas);
                canvas.restore();
                canvas.save();
                if (o != null)
                {
                    canvas.scale(1.0F / (o.n() * o.D), 1.0F / (o.n() * o.E), j1, k2);
                }
                j.setBounds(j1 - l2, k2 - i3, j1 + l2, k2 + i3);
                j.draw(canvas);
                canvas.restore();
                canvas.save();
                if (o != null)
                {
                    canvas.scale(1.0F / (o.n() * o.D), 1.0F / (o.n() * o.E), j2, l1);
                }
                j.setBounds(j2 - l2, l1 - i3, j2 + l2, l1 + i3);
                j.draw(canvas);
                canvas.restore();
                j2 = k.getIntrinsicWidth() / 2;
                k2 = k.getIntrinsicHeight() / 2;
                canvas.save();
                if (o != null)
                {
                    canvas.scale(1.0F / (o.n() * o.D), 1.0F / (o.n() * o.E), j1, l1);
                }
                k.setBounds(j1 - j2, l1 - k2, j2 + j1, l1 + k2);
                k.draw(canvas);
                canvas.restore();
                return;
            }
        }
    }

    public final void a(Matrix matrix, RectF rectf, RectF rectf1)
    {
        c = new Matrix(matrix);
        e = null;
        b = rectf1;
        d = rectf;
        f = true;
        g = b.width() / b.height();
        l.setARGB(125, 50, 50, 50);
        if (o != null)
        {
            n.setStrokeWidth(3F / o.n());
        } else
        {
            n.setStrokeWidth(3F);
        }
        n.setStyle(android.graphics.Paint.Style.STROKE);
        n.setAntiAlias(true);
        s = b.a;
    }

    public final void a(boolean flag, int i1, float f1, float f2, float f3, float f4, float f5, 
            float f6)
    {
        c();
        if (!flag) goto _L2; else goto _L1
_L1:
        if (o != null)
        {
            f1 = (b.left + b.right) / 2.0F;
            f2 = (b.top + b.bottom) / 2.0F;
            PointF pointf = a(f3, f4, o.i());
            PointF pointf3 = a(f5, f6, o.i());
            PointF pointf6 = a(f1, f2, o.k());
            f1 = a(new PointF(pointf.x, pointf.y), new PointF(pointf3.x, pointf3.y));
            f2 = p;
            o.c(f2 - f1, pointf6.x, pointf6.y);
            p = f1;
            f2 = b(pointf.x, pointf.y, pointf3.x, pointf3.y);
            if (q != 0.0F)
            {
                f1 = f2 / q;
                if (f1 > 1.0F)
                {
                    if (a())
                    {
                        f1 = 1.0F;
                    }
                    o.b(f1, f1, pointf6.x, pointf6.y);
                } else
                {
                    if (b())
                    {
                        f1 = 1.0F;
                    }
                    o.b(f1, f1, pointf6.x, pointf6.y);
                }
            }
            q = f2;
        }
_L4:
        return;
_L2:
        if (i1 == 0) goto _L4; else goto _L3
_L3:
        if (i1 == 5)
        {
            o.b(f1, f2);
            a.invalidate();
            return;
        }
        if (4 != i1)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (o == null) goto _L4; else goto _L5
_L5:
        f1 = (b.left + b.right) / 2.0F;
        f2 = (b.top + b.bottom) / 2.0F;
        PointF pointf1 = a(f3, f4, o.i());
        PointF pointf4 = a(f1, f2, o.k());
        f1 = a(new PointF(pointf1.x, pointf1.y), new PointF(pointf4.x, pointf4.y));
        f2 = p;
        o.c(f2 - f1, pointf4.x, pointf4.y);
        p = f1;
        f2 = b(pointf1.x, pointf1.y, pointf4.x, pointf4.y);
        if (q != 0.0F)
        {
            f1 = f2 / q;
            if (f1 > 1.0F)
            {
                if (a())
                {
                    f1 = 1.0F;
                }
                o.b(f1, f1, pointf4.x, pointf4.y);
            } else
            {
                if (b())
                {
                    f1 = 1.0F;
                }
                o.b(f1, f1, pointf4.x, pointf4.y);
            }
        }
        q = f2;
        return;
        if (1 != i1 && 2 != i1 && 3 != i1 || o == null) goto _L4; else goto _L6
_L6:
        f1 = (b.left + b.right) / 2.0F;
        f2 = (b.top + b.bottom) / 2.0F;
        PointF pointf2 = a(f3, f4, o.i());
        PointF pointf5 = a(f1, f2, o.k());
        f2 = b(pointf2.x, pointf2.y, pointf5.x, pointf5.y);
        if (q != 0.0F)
        {
            f1 = f2 / q;
            if (f1 > 1.0F)
            {
                if (a())
                {
                    f1 = 1.0F;
                }
                o.b(f1, f1, pointf5.x, pointf5.y);
            } else
            {
                if (b())
                {
                    f1 = 1.0F;
                }
                o.b(f1, f1, pointf5.x, pointf5.y);
            }
        }
        q = f2;
        return;
    }
}
