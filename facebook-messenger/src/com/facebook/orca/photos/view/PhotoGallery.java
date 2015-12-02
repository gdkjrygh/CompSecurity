// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.photos.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import com.facebook.i;
import com.facebook.widget.images.ImageViewTouchBase;
import com.facebook.widget.images.UrlImage;
import com.facebook.widget.images.a;

public class PhotoGallery extends a
    implements android.view.GestureDetector.OnDoubleTapListener, android.view.ScaleGestureDetector.OnScaleGestureListener
{

    private ScaleGestureDetector a;
    private ImageViewTouchBase b;
    private boolean c;
    private boolean d;

    public PhotoGallery(Context context, AttributeSet attributeset)
    {
        super(context, attributeset, 0);
        c = false;
        d = false;
        a = new ScaleGestureDetector(context, this);
        (new GestureDetector(this)).setOnDoubleTapListener(this);
    }

    private boolean a(MotionEvent motionevent, MotionEvent motionevent1)
    {
        return motionevent1.getX() > motionevent.getX();
    }

    public boolean onDoubleTap(MotionEvent motionevent)
    {
        if (d)
        {
            return false;
        }
        if (b.getScale() > 2.0F)
        {
            b.a(1.0F);
        } else
        {
            b.b(3F, motionevent.getX(), motionevent.getY());
        }
        return true;
    }

    public boolean onDoubleTapEvent(MotionEvent motionevent)
    {
        return false;
    }

    public boolean onFling(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
    {
        while (d || b.getImageRight() > (float)b.getWidth() && !a(motionevent, motionevent1) || b.getImageLeft() < 0.0F && a(motionevent, motionevent1) || c) 
        {
            return false;
        }
        byte byte0;
        if (a(motionevent, motionevent1))
        {
            byte0 = 21;
        } else
        {
            byte0 = 22;
        }
        onKeyDown(byte0, null);
        return true;
    }

    public boolean onScale(ScaleGestureDetector scalegesturedetector)
    {
        if (d)
        {
            return false;
        } else
        {
            float f = scalegesturedetector.getScaleFactor();
            float f1 = b.getScale();
            b.a(f * f1, scalegesturedetector.getFocusX(), scalegesturedetector.getFocusY());
            return true;
        }
    }

    public boolean onScaleBegin(ScaleGestureDetector scalegesturedetector)
    {
        return true;
    }

    public void onScaleEnd(ScaleGestureDetector scalegesturedetector)
    {
    }

    public boolean onScroll(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
    {
        if (!d)
        {
            if (b.getScale() > 1.5F || b.getImageRight() > (float)b.getWidth() && !a(motionevent, motionevent1) || b.getImageLeft() < 0.0F && a(motionevent, motionevent1))
            {
                b.a(-f, -f1);
                return true;
            }
            if (!c)
            {
                return super.onScroll(motionevent, motionevent1, f, f1);
            }
        }
        return false;
    }

    public boolean onSingleTapConfirmed(MotionEvent motionevent)
    {
        return false;
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        while (d || getChildCount() == 0) 
        {
            return false;
        }
        View view = getSelectedView();
        if (view == null)
        {
            return super.onTouchEvent(motionevent);
        }
        b = (ImageViewTouchBase)((UrlImage)(UrlImage)view.findViewById(i.photo_image)).getImageView();
        if (motionevent.getPointerCount() >= 2)
        {
            a.onTouchEvent(motionevent);
            if (a.isInProgress())
            {
                return true;
            }
        }
        return super.onTouchEvent(motionevent);
    }
}
