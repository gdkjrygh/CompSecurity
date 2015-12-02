// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget.images.zoomableimageview;

import android.util.Log;
import android.view.ScaleGestureDetector;

// Referenced classes of package com.facebook.widget.images.zoomableimageview:
//            a

public class d extends android.view.ScaleGestureDetector.SimpleOnScaleGestureListener
{

    final a a;

    public d(a a1)
    {
        a = a1;
        super();
    }

    public boolean onScale(ScaleGestureDetector scalegesturedetector)
    {
        Log.d("image", "onScale");
        scalegesturedetector.getCurrentSpan();
        scalegesturedetector.getPreviousSpan();
        float f = a.d;
        float f1 = scalegesturedetector.getScaleFactor();
        if (a.j)
        {
            f = Math.min(a.getMaxZoom(), Math.max(f * f1, a.getMinZoom() - 0.1F));
            a.b(f, scalegesturedetector.getFocusX(), scalegesturedetector.getFocusY());
            a.d = Math.min(a.getMaxZoom(), Math.max(f, a.getMinZoom() - 1.0F));
            a.f = 1;
            a.invalidate();
            return true;
        } else
        {
            return false;
        }
    }
}
