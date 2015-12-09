// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package it.sephiroth.android.library.imagezoom;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ViewConfiguration;

// Referenced classes of package it.sephiroth.android.library.imagezoom:
//            ImageViewTouchBase

public class ImageViewTouch extends ImageViewTouchBase
{

    protected android.view.GestureDetector.OnGestureListener A;
    protected android.view.ScaleGestureDetector.OnScaleGestureListener B;
    protected boolean C;
    protected boolean D;
    protected boolean E;
    private b a;
    private c b;
    protected ScaleGestureDetector v;
    protected GestureDetector w;
    protected int x;
    protected float y;
    protected int z;

    public ImageViewTouch(Context context)
    {
        super(context);
        C = true;
        D = true;
        E = true;
    }

    public ImageViewTouch(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public ImageViewTouch(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        C = true;
        D = true;
        E = true;
    }

    static c a(ImageViewTouch imageviewtouch)
    {
        return imageviewtouch.b;
    }

    static b b(ImageViewTouch imageviewtouch)
    {
        return imageviewtouch.a;
    }

    protected void a(float f)
    {
        if (f < getMinScale())
        {
            c(getMinScale(), 50F);
        }
    }

    protected void a(Context context, AttributeSet attributeset, int i)
    {
        super.a(context, attributeset, i);
        x = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        A = getGestureListener();
        B = getScaleListener();
        v = new ScaleGestureDetector(getContext(), B);
        w = new GestureDetector(getContext(), A, null, true);
        z = 1;
    }

    public boolean a(MotionEvent motionevent)
    {
        return true;
    }

    public boolean a(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
    {
        if (getScale() == 1.0F)
        {
            return false;
        } else
        {
            L = true;
            d(-f, -f1);
            invalidate();
            return true;
        }
    }

    protected float b(float f, float f1)
    {
        if (z == 1)
        {
            if (y * 2.0F + f <= f1)
            {
                return f + y;
            } else
            {
                z = -1;
                return f1;
            }
        } else
        {
            z = 1;
            return 1.0F;
        }
    }

    protected void b(Drawable drawable, Matrix matrix, float f, float f1)
    {
        super.b(drawable, matrix, f, f1);
        y = getMaxScale() / 3F;
    }

    public boolean b(MotionEvent motionevent)
    {
        return true;
    }

    public boolean b(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
    {
        float f2 = motionevent1.getX();
        float f3 = motionevent.getX();
        float f4 = motionevent1.getY();
        float f5 = motionevent.getY();
        if (Math.abs(f) > 800F || Math.abs(f1) > 800F)
        {
            L = true;
            a((f2 - f3) / 2.0F, (f4 - f5) / 2.0F, 300D);
            invalidate();
            return true;
        } else
        {
            return false;
        }
    }

    public boolean c(MotionEvent motionevent)
    {
        if (getScale() < getMinScale())
        {
            c(getMinScale(), 50F);
        }
        return true;
    }

    public boolean d(MotionEvent motionevent)
    {
        return true;
    }

    public boolean getDoubleTapEnabled()
    {
        return C;
    }

    protected android.view.GestureDetector.OnGestureListener getGestureListener()
    {
    /* block-local class not found */
    class a {}

        return new a();
    }

    protected android.view.ScaleGestureDetector.OnScaleGestureListener getScaleListener()
    {
    /* block-local class not found */
    class d {}

        return new d();
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        v.onTouchEvent(motionevent);
        if (!v.isInProgress())
        {
            w.onTouchEvent(motionevent);
        }
        switch (motionevent.getAction() & 0xff)
        {
        default:
            return true;

        case 1: // '\001'
            return c(motionevent);
        }
    }

    public void setDoubleTapEnabled(boolean flag)
    {
        C = flag;
    }

    public void setDoubleTapListener(b b1)
    {
        a = b1;
    }

    public void setScaleEnabled(boolean flag)
    {
        D = flag;
    }

    public void setScrollEnabled(boolean flag)
    {
        E = flag;
    }

    public void setSingleTapListener(c c1)
    {
        b = c1;
    }

    // Unreferenced inner class it/sephiroth/android/library/imagezoom/ImageViewTouch$b
    /* block-local class not found */
    class b {}


    // Unreferenced inner class it/sephiroth/android/library/imagezoom/ImageViewTouch$c
    /* block-local class not found */
    class c {}

}
