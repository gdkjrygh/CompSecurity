// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import com.aviary.android.feather.library.graphics.RectD;
import it.sephiroth.android.library.imagezoom.ImageViewTouch;

// Referenced classes of package com.aviary.android.feather.sdk.widget:
//            e

public class CropImageView extends ImageViewTouch
{
    class a extends android.view.GestureDetector.SimpleOnGestureListener
    {

        final CropImageView a;

        public boolean onDoubleTap(MotionEvent motionevent)
        {
            if (CropImageView.e(a))
            {
                CropImageView.a(a, null);
                float f1 = a.getScale();
                f1 = CropImageView.a(a, f1, a.getMaxScale());
                f1 = Math.min(a.getMaxScale(), Math.max(f1, 1.0F));
                CropImageView.a(a, f1, motionevent.getX(), motionevent.getY(), 200F);
                a.invalidate();
            }
            return super.onDoubleTap(motionevent);
        }

        public boolean onDown(MotionEvent motionevent)
        {
            CropImageView.a(a, null);
            Object obj = CropImageView.a(a);
            if (obj != null)
            {
                int i1 = ((e) (obj)).a(motionevent.getX(), motionevent.getY());
                if (i1 != 1)
                {
                    CropImageView.a(a, i1);
                    CropImageView.a(a, ((e) (obj)));
                    e e1 = CropImageView.b(a);
                    if (i1 == 32)
                    {
                        obj = e.a.b;
                    } else
                    {
                        obj = e.a.c;
                    }
                    e1.a(((e.a) (obj)));
                    a.postInvalidate();
                }
            }
            return super.onDown(motionevent);
        }

        public boolean onFling(MotionEvent motionevent, MotionEvent motionevent1, float f1, float f2)
        {
            while (motionevent.getPointerCount() > 1 || motionevent1.getPointerCount() > 1 || CropImageView.g(a).isInProgress() || CropImageView.b(a) != null) 
            {
                return false;
            }
            float f3 = motionevent1.getX();
            float f4 = motionevent.getX();
            float f5 = motionevent1.getY();
            float f6 = motionevent.getY();
            if (Math.abs(f1) > 800F || Math.abs(f2) > 800F)
            {
                CropImageView.a(a, (f3 - f4) / 2.0F, (f5 - f6) / 2.0F, 300D);
                a.invalidate();
            }
            return super.onFling(motionevent, motionevent1, f1, f2);
        }

        public boolean onScroll(MotionEvent motionevent, MotionEvent motionevent1, float f1, float f2)
        {
            while (motionevent == null || motionevent1 == null || motionevent.getPointerCount() > 1 || motionevent1.getPointerCount() > 1 || CropImageView.f(a).isInProgress()) 
            {
                return false;
            }
            if (CropImageView.b(a) != null && CropImageView.c(a) != 1)
            {
                CropImageView.b(a).a(CropImageView.c(a), -f1, -f2);
                if (CropImageView.c(a) == 32)
                {
                    a.invalidate(CropImageView.b(a).b());
                } else
                {
                    a.postInvalidate();
                }
                CropImageView.b(a, CropImageView.b(a));
                return true;
            } else
            {
                a.d(-f1, -f2);
                a.invalidate();
                return true;
            }
        }

        public boolean onSingleTapConfirmed(MotionEvent motionevent)
        {
            CropImageView.a(a, null);
            return super.onSingleTapConfirmed(motionevent);
        }

        public boolean onSingleTapUp(MotionEvent motionevent)
        {
            CropImageView.a(a, null);
            if (CropImageView.a(a) != null && CropImageView.c(a) == 32 && CropImageView.d(a) != null)
            {
                CropImageView.d(a).a();
            }
            return super.onSingleTapUp(motionevent);
        }

        a()
        {
            a = CropImageView.this;
            super();
        }
    }

    public static interface b
    {

        public abstract void a();
    }


    protected Handler a;
    Runnable b = new Runnable() {

        final CropImageView a;

        public void run()
        {
label0:
            {
                Drawable drawable = a.getDrawable();
                if (drawable != null && ((it.sephiroth.android.library.imagezoom.a.b)drawable).a() != null && CropImageView.a(a) != null)
                {
                    if (!CropImageView.a(a).e())
                    {
                        break label0;
                    }
                    a.a.post(this);
                }
                return;
            }
            Log.d("ImageViewTouchBase", "onLayoutRunnable.. running");
            CropImageView.a(a).f().set(a.getImageMatrix());
            CropImageView.a(a).d();
        }

            
            {
                a = CropImageView.this;
                super();
            }
    };
    protected double c;
    private int d;
    private e e;
    private b f;
    private e g;
    private int h;
    private int i;
    private Rect j;
    private Rect k;
    private boolean l;

    public CropImageView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, com.aviary.android.feather.sdk.R.attr.aviaryCropImageViewStyle);
    }

    public CropImageView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        d = 1;
        h = 10;
        a = new Handler();
        j = new Rect();
        k = new Rect();
        c = 0.0D;
    }

    static float a(CropImageView cropimageview, float f1, float f2)
    {
        return cropimageview.b(f1, f2);
    }

    static int a(CropImageView cropimageview, int i1)
    {
        cropimageview.d = i1;
        return i1;
    }

    private RectD a(double d1)
    {
        float f1 = getScale();
        float f2 = getDrawable().getIntrinsicWidth();
        float f3 = getDrawable().getIntrinsicHeight();
        RectF rectf = new RectF(0.0F, 0.0F, getWidth(), getHeight());
        Object obj = getBitmapRect();
        obj = new RectF(Math.max(rectf.left, ((RectF) (obj)).left), Math.max(rectf.top, ((RectF) (obj)).top), Math.min(rectf.right, ((RectF) (obj)).right), Math.min(rectf.bottom, ((RectF) (obj)).bottom));
        double d2 = Math.min(Math.min(f2 / f1, ((RectF) (obj)).width()), Math.min(f3 / f1, ((RectF) (obj)).height())) * 0.8F;
        double d4;
        double d7;
        Matrix matrix;
        if (d1 != 0.0D)
        {
            if (d1 > 1.0D)
            {
                double d3 = d2 / d1;
                d1 = d2;
                d2 = d3;
            } else
            {
                double d5 = d2;
                d1 = d2 * d1;
                d2 = d5;
            }
        } else
        {
            double d6 = d2;
            d1 = d2;
            d2 = d6;
        }
        obj = getImageMatrix();
        matrix = new Matrix();
        if (!((Matrix) (obj)).invert(matrix))
        {
            Log.e("ImageViewTouchBase", "cannot invert matrix");
        }
        matrix.mapRect(rectf);
        d4 = (double)rectf.centerX() - d1 / 2D;
        d7 = (double)rectf.centerY() - d2 / 2D;
        return new RectD(d4, d7, d1 + d4, d2 + d7);
    }

    static e a(CropImageView cropimageview)
    {
        return cropimageview.e;
    }

    static e a(CropImageView cropimageview, e e1)
    {
        cropimageview.g = e1;
        return e1;
    }

    private void a(double d1, e e1, boolean flag)
    {
        Log.d("ImageViewTouchBase", (new StringBuilder()).append("updateAspectRatio: ").append(d1).toString());
        float f1 = getDrawable().getIntrinsicWidth();
        float f2 = getDrawable().getIntrinsicHeight();
        RectD rectd = new RectD(0.0D, 0.0D, (int)f1, (int)f2);
        Matrix matrix = getImageMatrix();
        RectD rectd1 = a(d1);
        if (flag)
        {
            e1.a(this, matrix, rectd, rectd1, l);
            return;
        } else
        {
            e1.a(matrix, rectd, rectd1, l);
            postInvalidate();
            return;
        }
    }

    static void a(CropImageView cropimageview, float f1, float f2, double d1)
    {
        cropimageview.a(f1, f2, d1);
    }

    static void a(CropImageView cropimageview, float f1, float f2, float f3, float f4)
    {
        cropimageview.a(f1, f2, f3, f4);
    }

    private boolean a(e e1)
    {
        boolean flag = false;
        e1 = e1.g();
        int i1 = Math.max(0, getLeft() - ((Rect) (e1)).left);
        int l1 = Math.min(0, getRight() - ((Rect) (e1)).right);
        int j1 = Math.max(0, getTop() - ((Rect) (e1)).top);
        int k1 = Math.min(0, getBottom() - ((Rect) (e1)).bottom);
        if (i1 == 0)
        {
            i1 = l1;
        }
        if (j1 == 0)
        {
            j1 = k1;
        }
        if (i1 != 0 || j1 != 0)
        {
            a(i1, j1);
            flag = true;
        }
        return flag;
    }

    static e b(CropImageView cropimageview)
    {
        return cropimageview.g;
    }

    static boolean b(CropImageView cropimageview, e e1)
    {
        return cropimageview.a(e1);
    }

    static int c(CropImageView cropimageview)
    {
        return cropimageview.d;
    }

    static b d(CropImageView cropimageview)
    {
        return cropimageview.f;
    }

    static boolean e(CropImageView cropimageview)
    {
        return cropimageview.C;
    }

    static ScaleGestureDetector f(CropImageView cropimageview)
    {
        return cropimageview.v;
    }

    static ScaleGestureDetector g(CropImageView cropimageview)
    {
        return cropimageview.v;
    }

    public void a(double d1, boolean flag)
    {
        if (getDrawable() != null)
        {
            c = d1;
            l = flag;
            a(false);
        }
    }

    protected void a(float f1, float f2)
    {
        super.a(f1, f2);
        if (e == null || e.e())
        {
            return;
        }
        if (getScale() != 1.0F)
        {
            float af[] = new float[9];
            getImageMatrix().getValues(af);
            float f3 = af[0];
            e.h().a(-f1 / f3, -f2 / f3);
        }
        e.f().set(getImageMatrix());
        e.d();
    }

    protected void a(float f1, float f2, float f3)
    {
        if (e != null)
        {
            if (e.e())
            {
                return;
            } else
            {
                RectD rectd = e.h();
                e.a(getImageViewMatrix(), e.h(), j);
                super.a(f1, f2, f3);
                e.a(getImageViewMatrix(), e.h(), k);
                float af[] = new float[9];
                getImageViewMatrix().getValues(af);
                f1 = af[0];
                rectd.a((float)(j.left - k.left) / f1, (float)(j.top - k.top) / f1);
                rectd.c = rectd.c + (double)((float)(-(k.width() - j.width())) / f1);
                rectd.d = rectd.d + (double)((float)(-(k.height() - j.height())) / f1);
                e.f().set(getImageMatrix());
                e.h().a(rectd);
                e.d();
                return;
            }
        } else
        {
            super.a(f1, f2, f3);
            return;
        }
    }

    protected void a(int i1, int j1, int k1, int l1)
    {
        super.a(i1, j1, k1, l1);
        a.post(b);
    }

    protected void a(Context context, AttributeSet attributeset, int i1)
    {
        super.a(context, attributeset, i1);
        w = null;
        A = null;
        B = null;
        w = new GestureDetector(getContext(), new a(), null, true);
        w.setIsLongpressEnabled(false);
        context = context.getTheme().obtainStyledAttributes(attributeset, com.aviary.android.feather.sdk.R.styleable.AviaryCropImageView, i1, 0);
        h = context.getDimensionPixelSize(0, 50);
        i = context.getResourceId(1, -1);
        context.recycle();
    }

    public void a(Bitmap bitmap, double d1, boolean flag)
    {
        c = d1;
        l = flag;
        a(bitmap, ((Matrix) (null)), -1F, 8F);
    }

    protected void a(Drawable drawable)
    {
        super.a(drawable);
        if (getHandler() != null)
        {
            getHandler().post(new Runnable() {

                final CropImageView a;

                public void run()
                {
                    a.a(true);
                }

            
            {
                a = CropImageView.this;
                super();
            }
            });
        }
    }

    public void a(Drawable drawable, Matrix matrix, float f1, float f2)
    {
        g = null;
        super.a(drawable, matrix, f1, f2);
    }

    public void a(boolean flag)
    {
        if (flag)
        {
            setHighlightView(null);
        }
        if (getDrawable() == null)
        {
            setHighlightView(null);
            invalidate();
            return;
        }
        if (getHighlightView() != null)
        {
            a(c, getHighlightView(), true);
        } else
        {
            e e1 = new e(this, i);
            e1.a(h);
            a(c, e1, false);
            setHighlightView(e1);
        }
        invalidate();
    }

    public double getAspectRatio()
    {
        return c;
    }

    public boolean getAspectRatioIsFixed()
    {
        return l;
    }

    public e getHighlightView()
    {
        return e;
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        if (getHandler() != null)
        {
            getHandler().postDelayed(new Runnable() {

                final CropImageView a;

                public void run()
                {
                    a.a(a.c, a.getAspectRatioIsFixed());
                }

            
            {
                a = CropImageView.this;
                super();
            }
            }, 500L);
        }
        postInvalidate();
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        if (e != null)
        {
            e.a(canvas);
        }
    }

    protected void onSizeChanged(int i1, int j1, int k1, int l1)
    {
        super.onSizeChanged(i1, j1, k1, l1);
        if (e != null)
        {
            e.a(this, i1, j1, k1, l1);
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        super.onTouchEvent(motionevent);
        switch (motionevent.getAction() & 0xff)
        {
        default:
            return true;

        case 1: // '\001'
            break;
        }
        if (e != null)
        {
            e.a(e.a.a);
            postInvalidate();
        }
        g = null;
        d = 1;
        return true;
    }

    public void setHighlightView(e e1)
    {
        if (e != null)
        {
            e.a();
        }
        g = null;
        e = e1;
        invalidate();
    }

    public void setMinCropSize(int i1)
    {
        h = i1;
        if (e != null)
        {
            e.a(i1);
        }
    }

    public void setOnHighlightSingleTapUpConfirmedListener(b b1)
    {
        f = b1;
    }
}
