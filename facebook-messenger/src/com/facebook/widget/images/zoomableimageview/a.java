// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget.images.zoomableimageview;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ViewConfiguration;

// Referenced classes of package com.facebook.widget.images.zoomableimageview:
//            e, b, d, c

public class a extends e
{

    private c C;
    protected ScaleGestureDetector a;
    protected GestureDetector b;
    protected int c;
    protected float d;
    protected float e;
    protected int f;
    protected android.view.GestureDetector.OnGestureListener g;
    protected android.view.ScaleGestureDetector.OnScaleGestureListener h;
    protected boolean i;
    protected boolean j;
    protected boolean k;

    public a(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        i = true;
        j = true;
        k = true;
    }

    static c a(a a1)
    {
        return a1.C;
    }

    protected float a(float f1, float f2)
    {
        if (f == 1)
        {
            if (e * 2.0F + f1 <= f2)
            {
                return f1 + e;
            } else
            {
                f = -1;
                return f2;
            }
        } else
        {
            f = 1;
            return 1.0F;
        }
    }

    protected void a()
    {
        super.a();
        c = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        g = getGestureListener();
        h = getScaleListener();
        a = new ScaleGestureDetector(getContext(), h);
        b = new GestureDetector(getContext(), g, null, true);
        d = 1.0F;
        f = 1;
    }

    protected void a(float f1)
    {
        super.a(f1);
        if (!a.isInProgress())
        {
            d = f1;
        }
    }

    protected void a(Drawable drawable)
    {
        super.a(drawable);
        drawable = new float[9];
        n.getValues(drawable);
        d = drawable[0];
    }

    protected void a(Drawable drawable, boolean flag, Matrix matrix, float f1)
    {
        super.a(drawable, flag, matrix, f1);
        e = getMaxZoom() / 3F;
    }

    public boolean a(MotionEvent motionevent, MotionEvent motionevent1, float f1, float f2)
    {
        while (!k || motionevent == null || motionevent1 == null || motionevent.getPointerCount() > 1 || motionevent1.getPointerCount() > 1 || a.isInProgress() || getScale() == 1.0F) 
        {
            return false;
        }
        Log.d("image", (new StringBuilder()).append("onScroll: ").append(f1).append(", ").append(f2).toString());
        d(-f1, -f2);
        invalidate();
        return true;
    }

    protected void b(float f1)
    {
        super.b(f1);
        if (!a.isInProgress())
        {
            d = f1;
        }
        if (f1 < getMinZoom())
        {
            c(getMinZoom(), 50F);
        }
    }

    public boolean b(MotionEvent motionevent, MotionEvent motionevent1, float f1, float f2)
    {
        if (k && motionevent.getPointerCount() <= 1 && motionevent1.getPointerCount() <= 1 && !a.isInProgress())
        {
            float f3 = motionevent1.getX();
            float f4 = motionevent.getX();
            float f5 = motionevent1.getY();
            float f6 = motionevent.getY();
            if (Math.abs(f1) > 800F || Math.abs(f2) > 800F)
            {
                a((f3 - f4) / 2.0F, (f5 - f6) / 2.0F, 300D);
                invalidate();
                return true;
            }
        }
        return false;
    }

    public boolean getDoubleTapEnabled()
    {
        return i;
    }

    protected android.view.GestureDetector.OnGestureListener getGestureListener()
    {
        return new b(this);
    }

    protected android.view.ScaleGestureDetector.OnScaleGestureListener getScaleListener()
    {
        return new d(this);
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        a.onTouchEvent(motionevent);
        if (!a.isInProgress())
        {
            b.onTouchEvent(motionevent);
        }
        motionevent.getAction() & 0xff;
        JVM INSTR tableswitch 1 1: default 56
    //                   1 58;
           goto _L1 _L2
_L1:
        return true;
_L2:
        if (getScale() < getMinZoom())
        {
            c(getMinZoom(), 50F);
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public void setDoubleTapEnabled(boolean flag)
    {
        i = flag;
    }

    public void setDoubleTapListener(c c1)
    {
        C = c1;
    }

    public void setScaleEnabled(boolean flag)
    {
        j = flag;
    }

    public void setScrollEnabled(boolean flag)
    {
        k = flag;
    }
}
