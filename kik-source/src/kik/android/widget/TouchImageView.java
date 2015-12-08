// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.ScaleGestureDetector;
import android.widget.ImageView;

// Referenced classes of package kik.android.widget:
//            eg

public class TouchImageView extends ImageView
{
    private final class a extends android.view.ScaleGestureDetector.SimpleOnScaleGestureListener
    {

        final TouchImageView a;

        public final boolean onScale(ScaleGestureDetector scalegesturedetector)
        {
            float f1 = scalegesturedetector.getScaleFactor();
            float f2 = TouchImageView.i(a);
            TouchImageView.a(a, f1);
            if (TouchImageView.i(a) > TouchImageView.o(a))
            {
                TouchImageView.b(a, TouchImageView.o(a));
                f1 = TouchImageView.o(a) / f2;
            } else
            if (TouchImageView.i(a) < TouchImageView.p(a))
            {
                TouchImageView.b(a, TouchImageView.p(a));
                f1 = TouchImageView.p(a) / f2;
            }
            TouchImageView.c(a, TouchImageView.k(a) * TouchImageView.i(a) - TouchImageView.k(a) - TouchImageView.q(a) * 2.0F * TouchImageView.i(a));
            TouchImageView.d(a, TouchImageView.m(a) * TouchImageView.i(a) - TouchImageView.m(a) - TouchImageView.r(a) * 2.0F * TouchImageView.i(a));
            if (TouchImageView.h(a) * TouchImageView.i(a) <= TouchImageView.k(a) || TouchImageView.j(a) * TouchImageView.i(a) <= TouchImageView.m(a))
            {
                TouchImageView.d(a).postScale(f1, f1, TouchImageView.k(a) / 2.0F, TouchImageView.m(a) / 2.0F);
                if (f1 < 1.0F)
                {
                    TouchImageView.d(a).getValues(TouchImageView.c(a));
                    f2 = TouchImageView.c(a)[2];
                    float f4 = TouchImageView.c(a)[5];
                    if (f1 < 1.0F)
                    {
                        if ((float)Math.round(TouchImageView.h(a) * TouchImageView.i(a)) < TouchImageView.k(a))
                        {
                            if (f4 < -TouchImageView.l(a))
                            {
                                TouchImageView.d(a).postTranslate(0.0F, -(TouchImageView.l(a) + f4));
                            } else
                            if (f4 > 0.0F)
                            {
                                TouchImageView.d(a).postTranslate(0.0F, -f4);
                            }
                        } else
                        if (f2 < -TouchImageView.n(a))
                        {
                            TouchImageView.d(a).postTranslate(-(f2 + TouchImageView.n(a)), 0.0F);
                        } else
                        if (f2 > 0.0F)
                        {
                            TouchImageView.d(a).postTranslate(-f2, 0.0F);
                        }
                    }
                }
            } else
            {
                TouchImageView.d(a).postScale(f1, f1, scalegesturedetector.getFocusX(), scalegesturedetector.getFocusY());
                TouchImageView.d(a).getValues(TouchImageView.c(a));
                float f3 = TouchImageView.c(a)[2];
                float f5 = TouchImageView.c(a)[5];
                if (f1 < 1.0F)
                {
                    if (f3 < -TouchImageView.n(a))
                    {
                        TouchImageView.d(a).postTranslate(-(f3 + TouchImageView.n(a)), 0.0F);
                    } else
                    if (f3 > 0.0F)
                    {
                        TouchImageView.d(a).postTranslate(-f3, 0.0F);
                    }
                    if (f5 < -TouchImageView.l(a))
                    {
                        TouchImageView.d(a).postTranslate(0.0F, -(TouchImageView.l(a) + f5));
                    } else
                    if (f5 > 0.0F)
                    {
                        TouchImageView.d(a).postTranslate(0.0F, -f5);
                    }
                }
            }
            return true;
        }

        public final boolean onScaleBegin(ScaleGestureDetector scalegesturedetector)
        {
            TouchImageView.a(a, 2);
            return true;
        }

        private a()
        {
            a = TouchImageView.this;
            super();
        }

        a(byte byte0)
        {
            this();
        }
    }


    private Matrix a;
    private int b;
    private PointF c;
    private PointF d;
    private float e;
    private float f;
    private float g[];
    private float h;
    private float i;
    private float j;
    private float k;
    private float l;
    private float m;
    private float n;
    private float o;
    private float p;
    private float q;
    private float r;
    private ScaleGestureDetector s;
    private android.view.View.OnTouchListener t;
    private Context u;

    public TouchImageView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = new Matrix();
        b = 0;
        c = new PointF();
        d = new PointF();
        e = 1.0F;
        f = 4F;
        l = 1.0F;
        super.setClickable(true);
        u = context;
        s = new ScaleGestureDetector(context, new a((byte)0));
        a.setTranslate(1.0F, 1.0F);
        g = new float[9];
        setImageMatrix(a);
        setScaleType(android.widget.ImageView.ScaleType.MATRIX);
        setOnTouchListener(new eg(this));
    }

    static float a(TouchImageView touchimageview, float f1)
    {
        f1 = touchimageview.l * f1;
        touchimageview.l = f1;
        return f1;
    }

    static int a(TouchImageView touchimageview, int i1)
    {
        touchimageview.b = i1;
        return i1;
    }

    static android.view.View.OnTouchListener a(TouchImageView touchimageview)
    {
        return touchimageview.t;
    }

    static float b(TouchImageView touchimageview, float f1)
    {
        touchimageview.l = f1;
        return f1;
    }

    static ScaleGestureDetector b(TouchImageView touchimageview)
    {
        return touchimageview.s;
    }

    static float c(TouchImageView touchimageview, float f1)
    {
        touchimageview.m = f1;
        return f1;
    }

    static float[] c(TouchImageView touchimageview)
    {
        return touchimageview.g;
    }

    static float d(TouchImageView touchimageview, float f1)
    {
        touchimageview.n = f1;
        return f1;
    }

    static Matrix d(TouchImageView touchimageview)
    {
        return touchimageview.a;
    }

    static PointF e(TouchImageView touchimageview)
    {
        return touchimageview.c;
    }

    static PointF f(TouchImageView touchimageview)
    {
        return touchimageview.d;
    }

    static int g(TouchImageView touchimageview)
    {
        return touchimageview.b;
    }

    static float h(TouchImageView touchimageview)
    {
        return touchimageview.o;
    }

    static float i(TouchImageView touchimageview)
    {
        return touchimageview.l;
    }

    static float j(TouchImageView touchimageview)
    {
        return touchimageview.p;
    }

    static float k(TouchImageView touchimageview)
    {
        return touchimageview.j;
    }

    static float l(TouchImageView touchimageview)
    {
        return touchimageview.n;
    }

    static float m(TouchImageView touchimageview)
    {
        return touchimageview.k;
    }

    static float n(TouchImageView touchimageview)
    {
        return touchimageview.m;
    }

    static float o(TouchImageView touchimageview)
    {
        return touchimageview.f;
    }

    static float p(TouchImageView touchimageview)
    {
        return touchimageview.e;
    }

    static float q(TouchImageView touchimageview)
    {
        return touchimageview.h;
    }

    static float r(TouchImageView touchimageview)
    {
        return touchimageview.i;
    }

    protected void onMeasure(int i1, int j1)
    {
        super.onMeasure(i1, j1);
        j = android.view.View.MeasureSpec.getSize(i1);
        k = android.view.View.MeasureSpec.getSize(j1);
        float f1 = Math.min(j / q, k / r);
        a.setScale(f1, f1);
        setImageMatrix(a);
        l = 1.0F;
        i = k - r * f1;
        h = j - f1 * q;
        i = i / 2.0F;
        h = h / 2.0F;
        a.postTranslate(h, i);
        o = j - h * 2.0F;
        p = k - i * 2.0F;
        m = j * l - j - h * 2.0F * l;
        n = k * l - k - i * 2.0F * l;
        setImageMatrix(a);
    }

    public void setImageBitmap(Bitmap bitmap)
    {
        super.setImageBitmap(bitmap);
        if (bitmap != null)
        {
            q = bitmap.getWidth();
            r = bitmap.getHeight();
        }
    }
}
