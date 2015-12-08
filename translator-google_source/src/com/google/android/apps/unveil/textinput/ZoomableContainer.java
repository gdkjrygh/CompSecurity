// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.textinput;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.unveil.env.af;

// Referenced classes of package com.google.android.apps.unveil.textinput:
//            aj, ak

public class ZoomableContainer extends ViewGroup
{

    private static final af a = new af();
    private static float b = 1.0F;
    private static float c = 5F;
    private float d;
    private final PointF e = new PointF();
    private final ScaleGestureDetector f;
    private final Matrix g = new Matrix();

    public ZoomableContainer(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        d = 1.0F;
        f = new ScaleGestureDetector(context, new aj(this));
    }

    static float a(ZoomableContainer zoomablecontainer, float f1)
    {
        zoomablecontainer.d = f1;
        return f1;
    }

    static PointF a(ZoomableContainer zoomablecontainer)
    {
        return zoomablecontainer.e;
    }

    static float b()
    {
        return b;
    }

    static Matrix b(ZoomableContainer zoomablecontainer)
    {
        return zoomablecontainer.g;
    }

    static float c()
    {
        return c;
    }

    static float c(ZoomableContainer zoomablecontainer)
    {
        return zoomablecontainer.d;
    }

    private void d()
    {
        int j = getChildCount();
        for (int i = 0; i < j; i++)
        {
            View view = getChildAt(i);
            if (view instanceof ak)
            {
                ((ak)view).a(g);
            }
        }

    }

    static void d(ZoomableContainer zoomablecontainer)
    {
        zoomablecontainer.d();
    }

    public final void a()
    {
        g.reset();
        d();
    }

    protected void dispatchDraw(Canvas canvas)
    {
        canvas.save();
        canvas.concat(g);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public boolean dispatchTouchEvent(MotionEvent motionevent)
    {
        boolean flag1 = true;
        f.onTouchEvent(motionevent);
        boolean flag;
        if (motionevent.getPointerCount() == 1)
        {
            flag = super.dispatchTouchEvent(motionevent);
        } else
        {
            flag = flag1;
            if (motionevent.getPointerCount() > 1)
            {
                flag = flag1;
                if (motionevent.getActionMasked() == 5)
                {
                    return super.dispatchTouchEvent(MotionEvent.obtain(motionevent.getDownTime(), motionevent.getEventTime(), 3, motionevent.getX(0), motionevent.getY(0), motionevent.getPressure(0), motionevent.getSize(0), motionevent.getMetaState(), motionevent.getXPrecision(), motionevent.getYPrecision(), motionevent.getDeviceId(), motionevent.getEdgeFlags()));
                }
            }
        }
        return flag;
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        a.a("zoomable container onLayout: %d,%d,%d,%d", new Object[] {
            Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(l)
        });
        int j1 = getChildCount();
        for (int i1 = 0; i1 < j1; i1++)
        {
            getChildAt(i1).layout(0, 0, k - i, l - j);
        }

    }

}
