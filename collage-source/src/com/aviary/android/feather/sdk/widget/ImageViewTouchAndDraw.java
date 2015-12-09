// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import it.sephiroth.android.library.imagezoom.ImageViewTouch;
import it.sephiroth.android.library.imagezoom.a.b;

public class ImageViewTouchAndDraw extends ImageViewTouch
{
    public static interface a
    {

        public abstract void G();

        public abstract void H();

        public abstract void a(float f1, float f2);

        public abstract void a(float f1, float f2, float f3, float f4);
    }

    public static interface b
    {

        public abstract void a();
    }

    public static final class c extends Enum
    {

        public static final c a;
        public static final c b;
        private static final c c[];

        public static c valueOf(String s)
        {
            return (c)Enum.valueOf(com/aviary/android/feather/sdk/widget/ImageViewTouchAndDraw$c, s);
        }

        public static c[] values()
        {
            return (c[])c.clone();
        }

        static 
        {
            a = new c("IMAGE", 0);
            b = new c("DRAW", 1);
            c = (new c[] {
                a, b
            });
        }

        private c(String s, int i1)
        {
            super(s, i1);
        }
    }


    protected Paint a;
    protected Path b;
    protected Canvas c;
    protected c d;
    protected float e;
    protected float f;
    protected Matrix g;
    protected Matrix h;
    protected Bitmap i;
    private boolean j;
    private b k;
    private a l;

    public ImageViewTouchAndDraw(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public ImageViewTouchAndDraw(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        b = new Path();
        d = com.aviary.android.feather.sdk.widget.c.b;
        g = new Matrix();
        h = new Matrix();
    }

    public static float[] a(Matrix matrix)
    {
        float af[] = new float[9];
        matrix.getValues(af);
        return af;
    }

    private void c()
    {
        Log.i("ImageViewTouchBase", "touch_up");
        if (j)
        {
            b.reset();
            if (l != null)
            {
                l.H();
            }
        }
        j = false;
    }

    private void e(float f1, float f2)
    {
        Log.i("ImageViewTouchBase", "touch_start");
        if (j)
        {
            Log.w("ImageViewTouchBase", "touch already started!");
        } else
        {
            j = true;
            b.reset();
            b.moveTo(f1, f2);
            e = f1;
            f = f2;
            if (k != null)
            {
                k.a();
            }
            if (l != null)
            {
                l.G();
                float af[] = new float[2];
                af[0] = f1;
                af[1] = f2;
                h.mapPoints(af);
                l.a(af[0], af[1]);
                return;
            }
        }
    }

    private void f(float f1, float f2)
    {
        if (!j)
        {
            Log.w("ImageViewTouchBase", "touch not started!");
        } else
        {
            float f3 = Math.abs(f1 - e);
            float f5 = Math.abs(f2 - f);
            if (f3 >= 4F || f5 >= 4F)
            {
                float f4 = (e + f1) / 2.0F;
                float f6 = (f + f2) / 2.0F;
                b.quadTo(e, f, f4, f6);
                c.drawPath(b, a);
                b.reset();
                b.moveTo(f4, f6);
                if (l != null)
                {
                    float af[] = new float[4];
                    af[0] = e;
                    af[1] = f;
                    af[2] = f4;
                    af[3] = f6;
                    h.mapPoints(af);
                    l.a(af[0], af[1], af[2], af[3]);
                }
                e = f1;
                f = f2;
                return;
            }
        }
    }

    protected void a()
    {
        if (d == com.aviary.android.feather.sdk.widget.c.b)
        {
            Matrix matrix = new Matrix(getImageMatrix());
            h.reset();
            float af[] = a(matrix);
            matrix.invert(matrix);
            float af1[] = a(matrix);
            h.postTranslate(-af[2], -af[5]);
            h.postScale(af1[0], af1[4]);
            c.setMatrix(h);
            Log.d("ImageViewTouchBase", (new StringBuilder()).append("scale: ").append(d(h)).toString());
        }
    }

    protected void a(int i1, int j1, int k1, int l1)
    {
        super.a(i1, j1, k1, l1);
        a();
    }

    protected void a(Context context, AttributeSet attributeset, int i1)
    {
        super.a(context, attributeset, i1);
        Log.i("ImageViewTouchBase", (new StringBuilder()).append("init, paint: ").append(a).toString());
        a = new Paint(5);
        a.setFilterBitmap(false);
        a.setColor(0xffff0000);
        a.setStyle(android.graphics.Paint.Style.STROKE);
        a.setStrokeJoin(android.graphics.Paint.Join.ROUND);
        a.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        a.setStrokeWidth(10F);
        b = new Path();
    }

    public void a(Canvas canvas)
    {
        Drawable drawable = getDrawable();
        if (drawable != null && (drawable instanceof it.sephiroth.android.library.imagezoom.a.b))
        {
            canvas.drawBitmap(((it.sephiroth.android.library.imagezoom.a.b)drawable).a(), new Matrix(), null);
            canvas.drawBitmap(i, new Matrix(), null);
        }
    }

    protected void a(Drawable drawable)
    {
        super.a(drawable);
        if (i != null)
        {
            i.recycle();
            i = null;
        }
        if (drawable != null && (drawable instanceof it.sephiroth.android.library.imagezoom.a.b))
        {
            drawable = ((it.sephiroth.android.library.imagezoom.a.b)drawable).a();
            i = Bitmap.createBitmap(drawable.getWidth(), drawable.getHeight(), android.graphics.Bitmap.Config.ARGB_8888);
            c = new Canvas(i);
            c.drawColor(0);
            a();
        }
    }

    public c getDrawMode()
    {
        return d;
    }

    public float getDrawingScale()
    {
        return d(h);
    }

    public Bitmap getOverlayBitmap()
    {
        return i;
    }

    public Paint getPaint()
    {
        return a;
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        if (i != null)
        {
            int i1 = canvas.getSaveCount();
            canvas.save();
            canvas.drawBitmap(i, getImageMatrix(), null);
            canvas.restoreToCount(i1);
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (d == com.aviary.android.feather.sdk.widget.c.b && motionevent.getPointerCount() == 1)
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
            case 3: // '\003'
                c();
                invalidate();
                return true;
            }
        }
        if (d == c.a)
        {
            return super.onTouchEvent(motionevent);
        } else
        {
            return false;
        }
    }

    public void setDrawMode(c c1)
    {
        if (c1 != d)
        {
            d = c1;
            a();
        }
    }

    public void setOnDrawPathListener(a a1)
    {
        l = a1;
    }

    public void setOnDrawStartListener(b b1)
    {
        k = b1;
    }

    public void setPaint(Paint paint)
    {
        a.set(paint);
    }
}
