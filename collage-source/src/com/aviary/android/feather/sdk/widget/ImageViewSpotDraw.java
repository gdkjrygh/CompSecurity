// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import it.sephiroth.android.library.imagezoom.ImageViewTouch;
import it.sephiroth.android.library.imagezoom.a.b;

public class ImageViewSpotDraw extends ImageViewTouch
{
    public static interface a
    {

        public abstract void a();

        public abstract void a(float af[], float f1);

        public abstract void b(float af[], float f1);
    }

    public static final class b extends Enum
    {

        public static final b a;
        public static final b b;
        private static final b c[];

        public static b valueOf(String s)
        {
            return (b)Enum.valueOf(com/aviary/android/feather/sdk/widget/ImageViewSpotDraw$b, s);
        }

        public static b[] values()
        {
            return (b[])c.clone();
        }

        static 
        {
            a = new b("IMAGE", 0);
            b = new b("DRAW", 1);
            c = (new b[] {
                a, b
            });
        }

        private b(String s, int i1)
        {
            super(s, i1);
        }
    }


    protected float a;
    protected Paint b;
    protected float c;
    protected Path d;
    protected Canvas e;
    protected b f;
    protected float g;
    protected float h;
    protected float i;
    protected float j;
    protected Matrix k;
    protected Matrix l;
    private a m;
    private double n;
    private boolean o;

    public ImageViewSpotDraw(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public ImageViewSpotDraw(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        a = 30F;
        c = 1.0F;
        d = new Path();
        f = com.aviary.android.feather.sdk.widget.b.b;
        k = new Matrix();
        l = new Matrix();
        n = 0.0D;
        o = false;
    }

    public static float[] a(Matrix matrix)
    {
        float af[] = new float[9];
        matrix.getValues(af);
        return af;
    }

    private void c()
    {
        if (m != null)
        {
            m.a();
        }
    }

    private void e(float f1, float f2)
    {
        o = false;
        d.reset();
        if (b != null)
        {
            d.moveTo(f1, f2);
        }
        g = f1;
        h = f2;
        i = f1;
        j = f2;
        if (m != null)
        {
            float af[] = new float[2];
            af[0] = f1;
            af[1] = f2;
            l.mapPoints(af);
            m.a(af, a / c);
        }
    }

    private void f(float f1, float f2)
    {
        float f5;
        float f6;
label0:
        {
            float f4 = Math.abs(f1 - g);
            float f3 = Math.abs(f2 - h);
            if (f4 < 2.0F)
            {
                f5 = f1;
                f6 = f2;
                if (f3 < 2.0F)
                {
                    break label0;
                }
            }
            if (!o && b != null)
            {
                d.setLastPoint(g, h);
            }
            o = true;
            f4 = f1;
            f3 = f2;
            if (n > 0.0D)
            {
                double d2 = Math.sqrt(Math.pow(f1 - i, 2D) + Math.pow(f2 - j, 2D));
                double d1 = Math.atan2(f2 - j, f1 - i);
                f1 = getWidth();
                f2 = getHeight();
                double d3 = n / (double)c / (double)(f1 + f2) / (double)(a / c);
                d2 = Math.log(d2 * d3 + 1.0D) / d3;
                f4 = (float)((double)i + Math.cos(d1) * d2);
                d3 = j;
                f3 = (float)(d2 * Math.sin(d1) + d3);
            }
            g = f4;
            h = f3;
            f5 = f4;
            f6 = f3;
            if (b != null)
            {
                d.quadTo(g, h, (g + f4) / 2.0F, (h + f3) / 2.0F);
                f6 = f3;
                f5 = f4;
            }
        }
        if (m != null)
        {
            float af[] = new float[2];
            af[0] = f5;
            af[1] = f6;
            l.mapPoints(af);
            m.b(af, a / c);
        }
    }

    protected void a()
    {
        if (f == com.aviary.android.feather.sdk.widget.b.b)
        {
            Log.i("ImageViewTouchBase", "onDrawModeChanged");
            Matrix matrix = new Matrix(getImageMatrix());
            l.reset();
            float af[] = a(matrix);
            matrix.invert(matrix);
            float af1[] = a(matrix);
            l.postTranslate(-af[2], -af[5]);
            l.postScale(af1[0], af1[4]);
            e.setMatrix(l);
            c = getScale() * getBaseScale();
            if (b != null)
            {
                b.setStrokeWidth(a);
            }
        }
    }

    protected void a(int i1, int j1, int k1, int l1)
    {
        super.a(i1, j1, k1, l1);
        if (getDrawable() != null)
        {
            a();
        }
    }

    protected void a(Context context, AttributeSet attributeset, int i1)
    {
        super.a(context, attributeset, i1);
        d = new Path();
    }

    protected void a(Drawable drawable)
    {
        super.a(drawable);
        if (drawable != null && (drawable instanceof it.sephiroth.android.library.imagezoom.a.b))
        {
            e = new Canvas();
            e.drawColor(0);
            a();
        }
    }

    public b getDrawMode()
    {
        return f;
    }

    public RectF getImageRect()
    {
        if (getDrawable() != null)
        {
            return new RectF(0.0F, 0.0F, getDrawable().getIntrinsicWidth(), getDrawable().getIntrinsicHeight());
        } else
        {
            return null;
        }
    }

    public Paint getPaint()
    {
        return b;
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        if (b != null)
        {
            canvas.drawPath(d, b);
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (f == com.aviary.android.feather.sdk.widget.b.b && motionevent.getPointerCount() == 1)
        {
            float f1 = motionevent.getX();
            float f2 = motionevent.getY();
            switch (motionevent.getAction())
            {
            default:
                return true;

            case 0: // '\0'
                e(f1, f2);
                invalidate();
                return true;

            case 2: // '\002'
                f(f1, f2);
                invalidate();
                return true;

            case 1: // '\001'
                c();
                invalidate();
                return true;
            }
        }
        if (f == b.a)
        {
            return super.onTouchEvent(motionevent);
        } else
        {
            return false;
        }
    }

    public void setBrushSize(float f1)
    {
        a = f1;
        if (b != null)
        {
            b.setStrokeWidth(a);
        }
    }

    public void setDrawLimit(double d1)
    {
        n = d1;
    }

    public void setDrawMode(b b1)
    {
        if (b1 != f)
        {
            f = b1;
            a();
        }
    }

    public void setOnDrawStartListener(a a1)
    {
        m = a1;
    }

    public void setPaint(Paint paint)
    {
        b.set(paint);
    }

    public void setPaintEnabled(boolean flag)
    {
        if (flag)
        {
            b = new Paint(1);
            b.setFilterBitmap(false);
            b.setDither(true);
            b.setColor(0x66ffffcc);
            b.setStyle(android.graphics.Paint.Style.STROKE);
            b.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        }
    }
}
