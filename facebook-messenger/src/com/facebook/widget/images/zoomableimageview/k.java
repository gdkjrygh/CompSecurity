// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget.images.zoomableimageview;

import android.view.ScaleGestureDetector;

// Referenced classes of package com.facebook.widget.images.zoomableimageview:
//            d, ZoomableImageView

public class k extends d
{

    final ZoomableImageView b;

    public k(ZoomableImageView zoomableimageview)
    {
        b = zoomableimageview;
        super(zoomableimageview);
    }

    public boolean onScale(ScaleGestureDetector scalegesturedetector)
    {
        float f = b.d;
        float f1 = scalegesturedetector.getScaleFactor();
        if (b.j)
        {
            f = Math.min(b.getMaxZoom(), Math.max(f * f1, b.getMinZoom()));
            b.b(f, scalegesturedetector.getFocusX(), scalegesturedetector.getFocusY());
            b.d = Math.min(b.getMaxZoom(), Math.max(f, b.getMinZoom()));
            b.f = -1;
            b.invalidate();
            return true;
        } else
        {
            return false;
        }
    }
}
