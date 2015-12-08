// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.facedetector;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.FloatMath;
import android.view.MotionEvent;
import android.widget.ImageView;
import com.roidapp.imagelib.b.c;
import com.roidapp.imagelib.f;

// Referenced classes of package com.roidapp.imagelib.facedetector:
//            g

public class LoadImageView extends ImageView
{

    private Bitmap a;
    private Matrix b;
    private Matrix c;
    private Matrix d;
    private Matrix e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private Drawable k;
    private Drawable l;
    private int m;
    private float n;
    private float o;
    private float p;
    private float q;
    private float r;
    private float s;
    private float t;

    public LoadImageView(Context context)
    {
        super(context);
        c = new Matrix();
        e = new Matrix();
        f = 50;
        a(context);
    }

    public LoadImageView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        c = new Matrix();
        e = new Matrix();
        f = 50;
        a(context);
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

    private static PointF a(float f1, float f2, Matrix matrix)
    {
        float af[] = new float[2];
        af[0] = f1;
        af[1] = f2;
        matrix.mapPoints(af);
        return new PointF(af[0], af[1]);
    }

    private void a(Context context)
    {
        DisplayMetrics displaymetrics = getResources().getDisplayMetrics();
        g = displaymetrics.widthPixels;
        h = displaymetrics.heightPixels;
        l = context.getResources().getDrawable(f.c);
        k = context.getResources().getDrawable(f.av);
        q = 0.0F;
        t = 1.0F;
    }

    private static boolean a(float f1, float f2, RectF rectf)
    {
        return f1 > rectf.left && f1 < rectf.right && f2 > rectf.top && f2 < rectf.bottom;
    }

    public final float a()
    {
        return t;
    }

    public final void a(Bitmap bitmap, float af[])
    {
        a = bitmap;
        int i1 = a.getWidth();
        int j1 = a.getHeight();
        float f1 = Math.min((float)g / (float)i1, (float)h / (float)j1);
        float f2 = (float)g / 2.0F;
        float f3 = ((float)i1 * f1) / 2.0F;
        float f4 = (float)h / 2.0F;
        float f5 = ((float)j1 * f1) / 2.0F;
        b = new Matrix();
        b.postScale(f1, f1);
        b.postRotate(0.0F);
        b.postTranslate(f2 - f3, f4 - f5);
        b.invert(c);
        int k1 = l.getIntrinsicWidth();
        int l1 = l.getIntrinsicHeight();
        f1 = Math.min((float)((double)(float)i1 * 0.59999999999999998D) / (float)k1, ((float)j1 * 0.6F) / (float)l1);
        f2 = (float)i1 / 2.0F;
        f3 = ((float)k1 * f1) / 2.0F;
        f4 = (float)j1 / 2.0F;
        f5 = ((float)l1 * f1) / 2.0F;
        d = new Matrix();
        if (af != null)
        {
            d.setValues(af);
            q = af[9];
        } else
        {
            d.postScale(f1, f1);
            d.postRotate(0.0F);
            d.postTranslate(f2 - f3, f4 - f5);
            d.invert(e);
        }
        l.setBounds(0, 0, k1, l1);
        i = k.getIntrinsicWidth();
        j = k.getIntrinsicHeight();
        bitmap = a(l.getBounds().right, l.getBounds().bottom, d);
        bitmap = a(((PointF) (bitmap)).x, ((PointF) (bitmap)).y, b);
        k.setBounds((int)((PointF) (bitmap)).x - i / 2, (int)((PointF) (bitmap)).y - j / 2, (int)((PointF) (bitmap)).x + i / 2, (int)((PointF) (bitmap)).y + j / 2);
    }

    public final float[] b()
    {
        float af[] = new float[10];
        d.getValues(af);
        af[9] = q;
        return af;
    }

    public final Bitmap c()
    {
        if (a != null && !a.isRecycled())
        {
            int i1 = l.getBounds().width();
            int j1 = l.getBounds().height();
            Object obj = new RectF(0.0F, 0.0F, i1, j1);
            d.mapRect(((RectF) (obj)));
            i1 = (int)((RectF) (obj)).width();
            j1 = (int)((RectF) (obj)).height();
            obj = new Rect((int)((RectF) (obj)).left, (int)((RectF) (obj)).top, (int)((RectF) (obj)).right, (int)((RectF) (obj)).bottom);
            Object obj1 = Bitmap.createBitmap(i1, j1, android.graphics.Bitmap.Config.ARGB_8888);
            Object obj2 = new Canvas(((Bitmap) (obj1)));
            ((Canvas) (obj2)).setDrawFilter(new PaintFlagsDrawFilter(0, 3));
            Object obj3 = new Paint();
            ((Paint) (obj3)).setAntiAlias(true);
            ((Paint) (obj3)).setFilterBitmap(true);
            ((Paint) (obj3)).setColor(-1);
            obj3 = new Rect(0, 0, i1, j1);
            ((Canvas) (obj2)).drawColor(-1);
            ((Canvas) (obj2)).drawBitmap(a, ((Rect) (obj)), ((Rect) (obj3)), null);
            System.currentTimeMillis();
            i1 = Math.min(i1, j1);
            int l1;
            int j2;
            if (obj1 == null || ((Bitmap) (obj1)).isRecycled())
            {
                obj = null;
            } else
            {
                int k1 = ((Bitmap) (obj1)).getWidth();
                int i2 = ((Bitmap) (obj1)).getHeight();
                int k2 = Math.min(k1, i2);
                if (k2 <= 640)
                {
                    obj = obj1;
                } else
                {
                    double d1 = ((double)k2 * 1.0D) / 640D;
                    i2 = (int)Math.floor((double)i2 / d1);
                    obj = Bitmap.createScaledBitmap(((Bitmap) (obj1)), (int)Math.floor((double)k1 / d1), i2, true);
                }
            }
            if (i1 > 640)
            {
                com.roidapp.imagelib.b.c.a(((Bitmap) (obj1)));
            }
            obj1 = new Matrix();
            ((Matrix) (obj1)).setRotate(360F - q);
            i1 = ((Bitmap) (obj)).getWidth();
            j1 = ((Bitmap) (obj)).getHeight();
            obj2 = new RectF(0.0F, 0.0F, ((Bitmap) (obj)).getWidth(), ((Bitmap) (obj)).getHeight());
            ((Matrix) (obj1)).mapRect(((RectF) (obj2)));
            l1 = (int)((RectF) (obj2)).width();
            j2 = (int)((RectF) (obj2)).height();
            obj2 = Bitmap.createBitmap(l1, j2, android.graphics.Bitmap.Config.ARGB_8888);
            obj3 = new Canvas(((Bitmap) (obj2)));
            ((Canvas) (obj3)).setDrawFilter(new PaintFlagsDrawFilter(0, 3));
            ((Matrix) (obj1)).reset();
            ((Matrix) (obj1)).postTranslate(l1 / 2 - i1 / 2, j2 / 2 - j1 / 2);
            ((Matrix) (obj1)).postRotate(360F - q, l1 / 2, j2 / 2);
            ((Canvas) (obj3)).drawColor(-1);
            ((Canvas) (obj3)).drawBitmap(((Bitmap) (obj)), ((Matrix) (obj1)), null);
            com.roidapp.imagelib.b.c.a(((Bitmap) (obj)));
            t = (float)Math.sqrt((double)(l1 * j2) / (double)(i1 * j1));
            return ((Bitmap) (obj2));
        } else
        {
            return null;
        }
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        if (a != null && !a.isRecycled())
        {
            canvas.drawBitmap(a, b, null);
            canvas.save();
            canvas.concat(b);
            canvas.concat(d);
            l.draw(canvas);
            canvas.restore();
            canvas.save();
            k.draw(canvas);
            canvas.restore();
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        motionevent.getAction();
        JVM INSTR tableswitch 0 2: default 32
    //                   0 34
    //                   1 804
    //                   2 304;
           goto _L1 _L2 _L3 _L4
_L1:
        return true;
_L2:
        float f1;
        float f3;
        float f5;
        float f8;
        f1 = motionevent.getX();
        f3 = motionevent.getY();
        f5 = motionevent.getX();
        f8 = motionevent.getY();
        if (d == null || b == null) goto _L6; else goto _L5
_L5:
        d.invert(e);
        motionevent = new RectF(f, f, l.getBounds().width() - f, l.getBounds().height() - f);
        d.mapRect(motionevent);
        b.mapRect(motionevent);
        if (!a(f5, f8, motionevent)) goto _L8; else goto _L7
_L7:
        int i1 = g.b;
_L9:
        m = i1;
        n = f1;
        o = f3;
        if (l != null && c != null && d != null)
        {
            f5 = l.getBounds().centerX();
            f8 = l.getBounds().centerY();
            p = a(a(f1, f3, c), a(f5, f8, d));
            r = 0.0F;
        }
        continue; /* Loop/switch isn't completed */
_L8:
        if (a(f5, f8, new RectF(k.getBounds())))
        {
            i1 = com.roidapp.imagelib.facedetector.g.c;
            continue; /* Loop/switch isn't completed */
        }
_L6:
        i1 = g.a;
        if (true) goto _L9; else goto _L4
_L4:
        int j1 = m;
        if (c != null && d != null && l != null && k != null)
        {
            float f2 = motionevent.getX();
            float f4 = motionevent.getY();
            motionevent = a(f2, f4, c);
            PointF pointf = a(n, o, c);
            float f6 = ((PointF) (motionevent)).x;
            float f9 = pointf.x;
            float f12 = ((PointF) (motionevent)).y;
            float f14 = pointf.y;
            if (j1 == g.b)
            {
                d.postTranslate(f6 - f9, f12 - f14);
            }
            if (j1 == com.roidapp.imagelib.facedetector.g.c)
            {
                float f7 = l.getBounds().centerX();
                float f10 = l.getBounds().centerY();
                motionevent = a(f2, f4, c);
                PointF pointf1 = a(f7, f10, d);
                f7 = a(motionevent, pointf1);
                f10 = p - f7;
                d.postRotate(f10, pointf1.x, pointf1.y);
                p = f7;
                q = q + f10;
                float f13 = ((PointF) (motionevent)).x;
                f7 = ((PointF) (motionevent)).y;
                float f15 = pointf1.x;
                f10 = pointf1.y;
                f13 -= f15;
                f7 -= f10;
                f7 = FloatMath.sqrt(f13 * f13 + f7 * f7);
                if (r != 0.0F)
                {
                    float f11 = f7 / r;
                    if (f11 > 1.0F)
                    {
                        d.postScale(f11, f11, pointf1.x, pointf1.y);
                    } else
                    {
                        d.postScale(f11, f11, pointf1.x, pointf1.y);
                    }
                    s = s * f11;
                }
                r = f7;
            }
            motionevent = a(l.getBounds().right, l.getBounds().bottom, d);
            motionevent = a(((PointF) (motionevent)).x, ((PointF) (motionevent)).y, b);
            k.setBounds((int)((PointF) (motionevent)).x - i / 2, (int)((PointF) (motionevent)).y - j / 2, (int)((PointF) (motionevent)).x + i / 2, (int)((PointF) (motionevent)).y + j / 2);
            n = f2;
            o = f4;
        }
        invalidate();
        continue; /* Loop/switch isn't completed */
_L3:
        m = g.a;
        if (true) goto _L1; else goto _L10
_L10:
    }
}
