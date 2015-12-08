// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.retouch;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.support.v4.view.GestureDetectorCompat;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

// Referenced classes of package com.roidapp.imagelib.retouch:
//            y, z, aa, ab

public final class x
    implements android.view.View.OnTouchListener
{

    private static final float i[] = new float[9];
    private static final Interpolator j = new AccelerateDecelerateInterpolator();
    private final GestureDetectorCompat a;
    private final ScaleGestureDetector b;
    private final WeakReference c;
    private android.widget.ImageView.ScaleType d;
    private RectF e;
    private Matrix f;
    private Matrix g;
    private Matrix h;

    public x(ImageView imageview)
    {
        e = new RectF();
        f = new Matrix();
        g = new Matrix();
        h = new Matrix();
        a = new GestureDetectorCompat(imageview.getContext(), new y(this));
        b = new ScaleGestureDetector(imageview.getContext(), new z(this));
        c = new WeakReference(imageview);
        d = imageview.getScaleType();
        if (imageview != null && !android.widget.ImageView.ScaleType.MATRIX.equals(imageview.getScaleType()))
        {
            imageview.setScaleType(android.widget.ImageView.ScaleType.MATRIX);
        }
    }

    private static int a(ImageView imageview)
    {
        if (imageview == null)
        {
            return 0;
        } else
        {
            return imageview.getWidth() - imageview.getPaddingLeft() - imageview.getPaddingRight();
        }
    }

    static Matrix a(x x1)
    {
        return x1.h;
    }

    private RectF a(Matrix matrix)
    {
        Object obj = (ImageView)c.get();
        if (obj != null)
        {
            obj = ((ImageView) (obj)).getDrawable();
            if (obj != null)
            {
                e.set(0.0F, 0.0F, ((Drawable) (obj)).getIntrinsicWidth(), ((Drawable) (obj)).getIntrinsicHeight());
                matrix.mapRect(e);
                return e;
            }
        }
        return null;
    }

    private static int b(ImageView imageview)
    {
        if (imageview == null)
        {
            return 0;
        } else
        {
            return imageview.getHeight() - imageview.getPaddingTop() - imageview.getPaddingBottom();
        }
    }

    private void b(Matrix matrix)
    {
        ImageView imageview = (ImageView)c.get();
        if (imageview == null)
        {
            return;
        } else
        {
            imageview.setImageMatrix(matrix);
            return;
        }
    }

    static void b(x x1)
    {
        if (x1.e())
        {
            x1.b(x1.d());
        }
    }

    static Interpolator c()
    {
        return j;
    }

    static WeakReference c(x x1)
    {
        return x1.c;
    }

    private Matrix d()
    {
        g.set(f);
        g.postConcat(h);
        return g;
    }

    private boolean e()
    {
        float f1;
        float f2;
        float f3;
        ImageView imageview;
        RectF rectf;
        int k;
        f2 = 0.0F;
        imageview = (ImageView)c.get();
        if (imageview == null)
        {
            return false;
        }
        rectf = a(d());
        if (rectf == null)
        {
            return false;
        }
        f1 = rectf.height();
        f3 = rectf.width();
        k = b(imageview);
        if (f1 > (float)k) goto _L2; else goto _L1
_L1:
        aa.a[d.ordinal()];
        JVM INSTR tableswitch 1 2: default 100
    //                   1 190
    //                   2 200;
           goto _L3 _L4 _L5
_L3:
        f1 = ((float)k - f1) / 2.0F - rectf.top;
_L9:
        k = a(imageview);
        if (f3 > (float)k)
        {
            break MISSING_BLOCK_LABEL_285;
        }
        aa.a[d.ordinal()];
        JVM INSTR tableswitch 1 2: default 164
    //                   1 260
    //                   2 270;
           goto _L6 _L7 _L8
_L6:
        f2 = ((float)k - f3) / 2.0F - rectf.left;
_L10:
        h.postTranslate(f2, f1);
        return true;
_L4:
        f1 = -rectf.top;
          goto _L9
_L5:
        f1 = (float)k - f1 - rectf.top;
          goto _L9
_L2:
        if (rectf.top > 0.0F)
        {
            f1 = -rectf.top;
        } else
        if (rectf.bottom < (float)k)
        {
            f1 = (float)k - rectf.bottom;
        } else
        {
            f1 = 0.0F;
        }
          goto _L9
_L7:
        f2 = -rectf.left;
          goto _L10
_L8:
        f2 = (float)k - f3 - rectf.left;
          goto _L10
        if (rectf.left > 0.0F)
        {
            f2 = -rectf.left;
        } else
        if (rectf.right < (float)k)
        {
            f2 = (float)k - rectf.right;
        }
          goto _L10
    }

    public final void a()
    {
        float f1;
        float f2;
        float f3;
        float f4;
        int k;
        int l;
        Object obj;
        ImageView imageview;
label0:
        {
            obj = (ImageView)c.get();
            if (obj != null)
            {
                obj = ((ImageView) (obj)).getDrawable();
                imageview = (ImageView)c.get();
                if (imageview != null && obj != null)
                {
                    break label0;
                }
            }
            return;
        }
        f1 = a(imageview);
        f2 = b(imageview);
        k = ((Drawable) (obj)).getIntrinsicWidth();
        l = ((Drawable) (obj)).getIntrinsicHeight();
        f.reset();
        f3 = f1 / (float)k;
        f4 = f2 / (float)l;
        if (d != android.widget.ImageView.ScaleType.CENTER) goto _L2; else goto _L1
_L1:
        f.postTranslate((f1 - (float)k) / 2.0F, (f2 - (float)l) / 2.0F);
_L4:
        h.reset();
        b(d());
        e();
        return;
_L2:
        if (d == android.widget.ImageView.ScaleType.CENTER_CROP)
        {
            f3 = Math.max(f3, f4);
            f.postScale(f3, f3);
            f.postTranslate((f1 - (float)k * f3) / 2.0F, (f2 - (float)l * f3) / 2.0F);
            continue; /* Loop/switch isn't completed */
        }
        if (d != android.widget.ImageView.ScaleType.CENTER_INSIDE)
        {
            break; /* Loop/switch isn't completed */
        }
        f3 = Math.min(1.0F, Math.min(f3, f4));
        f.postScale(f3, f3);
        f.postTranslate((f1 - (float)k * f3) / 2.0F, (f2 - (float)l * f3) / 2.0F);
        if (true) goto _L4; else goto _L3
_L3:
        RectF rectf = new RectF(0.0F, 0.0F, k, l);
        RectF rectf1 = new RectF(0.0F, 0.0F, f1, f2);
        switch (aa.a[d.ordinal()])
        {
        case 1: // '\001'
            f.setRectToRect(rectf, rectf1, android.graphics.Matrix.ScaleToFit.START);
            break;

        case 3: // '\003'
            f.setRectToRect(rectf, rectf1, android.graphics.Matrix.ScaleToFit.CENTER);
            break;

        case 2: // '\002'
            f.setRectToRect(rectf, rectf1, android.graphics.Matrix.ScaleToFit.END);
            break;

        case 4: // '\004'
            f.setRectToRect(rectf, rectf1, android.graphics.Matrix.ScaleToFit.FILL);
            break;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    public final float b()
    {
        h.getValues(i);
        return i[0];
    }

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
        motionevent.getActionMasked();
        JVM INSTR tableswitch 1 3: default 32
    //                   1 60
    //                   2 32
    //                   3 60;
           goto _L1 _L2 _L1 _L2
_L1:
        if (motionevent.getPointerCount() > 1)
        {
            RectF rectf;
            try
            {
                b.onTouchEvent(motionevent);
            }
            // Misplaced declaration of an exception variable
            catch (View view) { }
            a.onTouchEvent(motionevent);
        }
        return false;
_L2:
        if (b() < 1.0F)
        {
            e();
            rectf = a(d());
            if (rectf != null)
            {
                view.post(new ab(this, b(), rectf.centerX(), rectf.centerY()));
            }
        }
          goto _L1
    }

}
