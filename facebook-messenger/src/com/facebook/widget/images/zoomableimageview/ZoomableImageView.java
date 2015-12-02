// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget.images.zoomableimageview;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;

// Referenced classes of package com.facebook.widget.images.zoomableimageview:
//            a, j, k, l, 
//            m

public class ZoomableImageView extends a
{

    private boolean C;
    private boolean D;
    private l E;
    private m F;

    public ZoomableImageView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        C = true;
        D = true;
        setFitToScreen(true);
    }

    private PointF a(PointF pointf)
    {
        RectF rectf = getBitmapRect();
        if (rectf != null && rectf.contains(pointf.x, pointf.y))
        {
            return new PointF((pointf.x - rectf.left) / rectf.width(), (pointf.y - rectf.top) / rectf.height());
        } else
        {
            return null;
        }
    }

    static PointF a(ZoomableImageView zoomableimageview, PointF pointf)
    {
        return zoomableimageview.a(pointf);
    }

    static l a(ZoomableImageView zoomableimageview)
    {
        return zoomableimageview.E;
    }

    private boolean d()
    {
        return D;
    }

    protected float a(float f, float f1)
    {
        if (this.f == 1)
        {
            this.f = -1;
            return f1;
        } else
        {
            this.f = 1;
            return 1.0F;
        }
    }

    protected void a(float f, float f1, float f2, float f3)
    {
        float f4 = f3;
        if (f3 == 200F)
        {
            f4 = 400F;
        }
        super.a(f, f1, f2, f4);
    }

    protected void a(RectF rectf, RectF rectf1)
    {
        if (rectf != null && d())
        {
            super.a(rectf, rectf1);
        }
    }

    protected void a(boolean flag, boolean flag1)
    {
        if (d())
        {
            super.a(flag, flag1);
        }
    }

    protected float b()
    {
        Drawable drawable = getDrawable();
        if (drawable == null)
        {
            return 1.0F;
        } else
        {
            return Math.max((float)drawable.getIntrinsicWidth() / (float)u, (float)drawable.getIntrinsicHeight() / (float)v) * 3F;
        }
    }

    protected void b(float f)
    {
        if (!a.isInProgress())
        {
            d = f;
        }
    }

    public void c(float f)
    {
        super.c(f);
        this.f = 1;
    }

    public Matrix getBaseMatrix()
    {
        return m;
    }

    public int getBitmapHeight()
    {
        return getDrawable().getIntrinsicHeight();
    }

    public int getBitmapWidth()
    {
        return getDrawable().getIntrinsicWidth();
    }

    protected android.view.GestureDetector.OnGestureListener getGestureListener()
    {
        return new j(this);
    }

    protected android.view.ScaleGestureDetector.OnScaleGestureListener getScaleListener()
    {
        return new k(this);
    }

    protected void onLayout(boolean flag, int i, int i1, int j1, int k1)
    {
        if (flag)
        {
            super.onLayout(flag, i, i1, j1, k1);
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (C)
        {
            a.onTouchEvent(motionevent);
            if (!a.isInProgress())
            {
                b.onTouchEvent(motionevent);
            }
            return true;
        } else
        {
            return false;
        }
    }

    public void setImageMatrix(Matrix matrix)
    {
        super.setImageMatrix(matrix);
        if (E != null)
        {
            E.a(matrix);
        }
    }

    public void setMinZoom(float f)
    {
        r = 1.0F;
    }

    public void setZoomAndPanListener(m m)
    {
        F = m;
    }
}
