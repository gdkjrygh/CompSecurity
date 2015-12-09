// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.views;

import android.graphics.Matrix;
import android.view.ScaleGestureDetector;

// Referenced classes of package com.jcp.views:
//            TouchImageView, ae

class af extends android.view.ScaleGestureDetector.SimpleOnScaleGestureListener
{

    final TouchImageView a;

    private af(TouchImageView touchimageview)
    {
        a = touchimageview;
        super();
    }

    af(TouchImageView touchimageview, ae ae)
    {
        this(touchimageview);
    }

    public boolean onScale(ScaleGestureDetector scalegesturedetector)
    {
        float f = scalegesturedetector.getScaleFactor();
        float f1 = TouchImageView.g(a);
        TouchImageView.a(a, f);
        if (TouchImageView.g(a) > TouchImageView.k(a))
        {
            TouchImageView.b(a, TouchImageView.k(a));
            f = TouchImageView.k(a) / f1;
        } else
        if (TouchImageView.g(a) < TouchImageView.l(a))
        {
            TouchImageView.b(a, TouchImageView.l(a));
            f = TouchImageView.l(a) / f1;
        }
        if (TouchImageView.f(a) * TouchImageView.g(a) <= (float)TouchImageView.e(a) || TouchImageView.i(a) * TouchImageView.g(a) <= (float)TouchImageView.h(a))
        {
            TouchImageView.j(a).postScale(f, f, TouchImageView.e(a) / 2, TouchImageView.h(a) / 2);
        } else
        {
            TouchImageView.j(a).postScale(f, f, scalegesturedetector.getFocusX(), scalegesturedetector.getFocusY());
        }
        a.a();
        return true;
    }

    public boolean onScaleBegin(ScaleGestureDetector scalegesturedetector)
    {
        TouchImageView.a(a, 2);
        return true;
    }
}
