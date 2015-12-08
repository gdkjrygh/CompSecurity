// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import com.nineoldandroids.a.a;
import com.nineoldandroids.a.c;
import com.nineoldandroids.a.k;
import it.sephiroth.android.library.imagezoom.ImageViewTouch;
import it.sephiroth.android.library.imagezoom.a.b;

public class ImageViewSpotSingleTap extends ImageViewTouch
    implements com.nineoldandroids.a.a.a
{
    public static interface a
    {

        public abstract void a(float af[], float f1);
    }

    class b extends it.sephiroth.android.library.imagezoom.ImageViewTouch.d
    {

        final ImageViewSpotSingleTap a;

        public boolean onScale(ScaleGestureDetector scalegesturedetector)
        {
            if (a.d == com.aviary.android.feather.sdk.widget.c.b)
            {
                a.e = scalegesturedetector.getFocusX();
                a.f = scalegesturedetector.getFocusY();
                a.postInvalidate();
                return true;
            } else
            {
                return super.onScale(scalegesturedetector);
            }
        }

        public boolean onScaleBegin(ScaleGestureDetector scalegesturedetector)
        {
            if (a.d == com.aviary.android.feather.sdk.widget.c.b)
            {
                ImageViewSpotSingleTap imageviewspotsingletap = a;
                ImageViewSpotSingleTap imageviewspotsingletap1 = a;
                float f1 = scalegesturedetector.getFocusX();
                imageviewspotsingletap1.e = f1;
                imageviewspotsingletap.g = f1;
                imageviewspotsingletap = a;
                imageviewspotsingletap1 = a;
                f1 = scalegesturedetector.getFocusY();
                imageviewspotsingletap1.f = f1;
                imageviewspotsingletap.h = f1;
                a.j = true;
                a.postInvalidate();
                return true;
            } else
            {
                return super.onScaleBegin(scalegesturedetector);
            }
        }

        public void onScaleEnd(ScaleGestureDetector scalegesturedetector)
        {
            a.j = false;
            super.onScaleEnd(scalegesturedetector);
        }

        b()
        {
            a = ImageViewSpotSingleTap.this;
            super(ImageViewSpotSingleTap.this);
        }
    }

    public static final class c extends Enum
    {

        public static final c a;
        public static final c b;
        private static final c c[];

        public static c valueOf(String s1)
        {
            return (c)Enum.valueOf(com/aviary/android/feather/sdk/widget/ImageViewSpotSingleTap$c, s1);
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

        private c(String s1, int i1)
        {
            super(s1, i1);
        }
    }


    private float T;
    private float U;
    com.nineoldandroids.a.c a;
    protected float b;
    protected Matrix c;
    protected c d;
    protected float e;
    protected float f;
    protected float g;
    protected float h;
    boolean i;
    boolean j;
    RectF k;
    Rect l;
    private float m;
    private float n;
    private Paint o;
    private Paint p;
    private Paint q;
    private a r;
    private String s;
    private float t;
    private float u;

    public ImageViewSpotSingleTap(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public ImageViewSpotSingleTap(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        m = 10F;
        n = 0.0F;
        b = 1.0F;
        c = new Matrix();
        o = new Paint();
        p = new Paint();
        q = new Paint();
        d = com.aviary.android.feather.sdk.widget.c.b;
        e = 0.0F;
        f = 0.0F;
        i = true;
        j = false;
        k = new RectF();
        l = new Rect();
        s = "";
        t = 50F;
        u = 150F;
        T = 150F;
        U = 20F;
        a(context);
    }

    private void a(Context context)
    {
        s = context.getString(com.aviary.android.feather.sdk.R.string.feather_blemish_tool_tip);
        t = context.getResources().getDimensionPixelSize(com.aviary.android.feather.sdk.R.dimen.aviary_textSizeMedium);
        U = t / 2.0F;
        float f1 = t * 3F;
        T = f1;
        u = f1;
        a = new com.nineoldandroids.a.c();
        a.a(this);
        o.setAntiAlias(true);
        o.setStyle(android.graphics.Paint.Style.STROKE);
        o.setColor(-1);
        o.setStrokeWidth(6F);
        p.setColor(-1);
        p.setTextSize(t);
        p.getTextBounds(s, 0, s.length(), l);
        q.setARGB(150, 0, 0, 0);
        setLongClickable(false);
    }

    public static float[] a(Matrix matrix)
    {
        float af[] = new float[9];
        matrix.getValues(af);
        return af;
    }

    private void c()
    {
        n = 0.0F;
        o.setAlpha(255);
        k k1 = com.nineoldandroids.a.k.a(this, "radius", new float[] {
            0.0F, m
        });
        k1.b(200L);
        com.nineoldandroids.a.c c1 = new com.nineoldandroids.a.c();
        c1.a(new DecelerateInterpolator(1.0F));
        c1.c(200L);
        c1.a(new com.nineoldandroids.a.a[] {
            com.nineoldandroids.a.k.a(this, "radius", new float[] {
                m, (float)(int)((double)m * 1.3D)
            }), com.nineoldandroids.a.k.a(o, "alpha", new int[] {
                255, 0
            })
        });
        a.b(new com.nineoldandroids.a.a[] {
            k1, c1
        });
        a.a(new AccelerateInterpolator(1.0F));
        a.a();
    }

    protected void a()
    {
        boolean flag1 = true;
        if (d == com.aviary.android.feather.sdk.widget.c.b)
        {
            Log.i("ImageViewTouchBase", "onDrawModeChanged");
            Matrix matrix = new Matrix(getImageMatrix());
            c.reset();
            float af[] = a(matrix);
            matrix.invert(matrix);
            float af1[] = a(matrix);
            c.postTranslate(-af[2], -af[5]);
            c.postScale(af1[0], af1[4]);
            b = getScale() * getBaseScale();
        }
        boolean flag;
        if (d == com.aviary.android.feather.sdk.widget.c.a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        setDoubleTapEnabled(flag);
        if (d == com.aviary.android.feather.sdk.widget.c.a)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        setScaleEnabled(flag);
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
    }

    protected void a(Drawable drawable)
    {
        super.a(drawable);
        if (drawable != null && (drawable instanceof it.sephiroth.android.library.imagezoom.a.b))
        {
            a();
        }
    }

    public void a(com.nineoldandroids.a.a a1)
    {
        invalidate();
    }

    public boolean a(MotionEvent motionevent)
    {
        if (d == com.aviary.android.feather.sdk.widget.c.b)
        {
            i = true;
            c();
            if (r != null)
            {
                float af[] = new float[2];
                af[0] = motionevent.getX();
                af[1] = motionevent.getY();
                c.mapPoints(af);
                r.a(af, m / b);
            }
            return true;
        } else
        {
            return super.a(motionevent);
        }
    }

    public boolean a(MotionEvent motionevent, MotionEvent motionevent1, float f1, float f2)
    {
        if (d == com.aviary.android.feather.sdk.widget.c.b)
        {
            e = motionevent1.getX();
            f = motionevent1.getY();
            j = true;
            postInvalidate();
            return false;
        } else
        {
            return super.a(motionevent, motionevent1, f1, f2);
        }
    }

    public void b(com.nineoldandroids.a.a a1)
    {
        invalidate();
    }

    public boolean b(MotionEvent motionevent)
    {
        if (d == com.aviary.android.feather.sdk.widget.c.b)
        {
            float f1 = motionevent.getX();
            e = f1;
            g = f1;
            f1 = motionevent.getY();
            f = f1;
            h = f1;
            i = false;
        }
        return super.b(motionevent);
    }

    public boolean b(MotionEvent motionevent, MotionEvent motionevent1, float f1, float f2)
    {
        if (d == com.aviary.android.feather.sdk.widget.c.b)
        {
            return false;
        } else
        {
            return super.b(motionevent, motionevent1, f1, f2);
        }
    }

    public void c(com.nineoldandroids.a.a a1)
    {
    }

    public boolean c(MotionEvent motionevent)
    {
        j = false;
        postInvalidate();
        return super.c(motionevent);
    }

    public void d(com.nineoldandroids.a.a a1)
    {
        invalidate();
    }

    public boolean d(MotionEvent motionevent)
    {
        if (d == com.aviary.android.feather.sdk.widget.c.b)
        {
            return false;
        } else
        {
            return super.d(motionevent);
        }
    }

    public c getDrawMode()
    {
        return d;
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

    public float getRadius()
    {
        return n;
    }

    protected android.view.ScaleGestureDetector.OnScaleGestureListener getScaleListener()
    {
        return new b();
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        if (i && n > 0.0F)
        {
            canvas.drawCircle(e, f, n, o);
        }
        if (j)
        {
            k.set(e - U - u, f - (float)l.height() * 1.25F - U - T, (e + (float)l.width() + U) - u, (f + (float)l.height() * 0.5F + U) - T);
            canvas.drawRoundRect(k, 10F, 10F, q);
            canvas.drawText(s, e - u, f - T, p);
        }
    }

    public void setBrushSize(float f1)
    {
        Log.i("ImageViewTouchBase", (new StringBuilder()).append("setBrushSize: ").append(f1).toString());
        m = f1;
    }

    public void setDrawMode(c c1)
    {
        if (c1 != d)
        {
            d = c1;
            a();
        }
    }

    public void setOnTapListener(a a1)
    {
        r = a1;
    }

    public void setRadius(float f1)
    {
        n = f1;
        invalidate();
    }
}
