// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget.images.zoomableimageview;

import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;

// Referenced classes of package com.facebook.widget.images.zoomableimageview:
//            b, ZoomableImageView, l

public class j extends b
{

    final ZoomableImageView b;

    public j(ZoomableImageView zoomableimageview)
    {
        b = zoomableimageview;
        super(zoomableimageview);
    }

    public void onLongPress(MotionEvent motionevent)
    {
        if (ZoomableImageView.a(b) != null)
        {
            if (!b.a.isInProgress())
            {
                PointF pointf = new PointF(motionevent.getX(), motionevent.getY());
                ZoomableImageView.a(b).b(pointf, ZoomableImageView.a(b, pointf));
            }
            super.onLongPress(motionevent);
        }
    }

    public boolean onSingleTapConfirmed(MotionEvent motionevent)
    {
        if (ZoomableImageView.a(b) != null)
        {
            PointF pointf = new PointF(motionevent.getX(), motionevent.getY());
            ZoomableImageView.a(b).a(pointf, ZoomableImageView.a(b, pointf));
        }
        return super.onSingleTapConfirmed(motionevent);
    }
}
