// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.widget;

import android.view.ScaleGestureDetector;

// Referenced classes of package com.aviary.android.feather.sdk.widget:
//            ImageViewSpotSingleTap

class a extends it.sephiroth.android.library.imagezoom.
{

    final ImageViewSpotSingleTap a;

    public boolean onScale(ScaleGestureDetector scalegesturedetector)
    {
        if (a.d == b)
        {
            a.e = scalegesturedetector.getFocusX();
            a.f = scalegesturedetector.getFocusY();
            a.postInvalidate();
            return true;
        } else
        {
            return super.tInvalidate(scalegesturedetector);
        }
    }

    public boolean onScaleBegin(ScaleGestureDetector scalegesturedetector)
    {
        if (a.d == b)
        {
            ImageViewSpotSingleTap imageviewspotsingletap = a;
            ImageViewSpotSingleTap imageviewspotsingletap1 = a;
            float f = scalegesturedetector.getFocusX();
            imageviewspotsingletap1.e = f;
            imageviewspotsingletap.g = f;
            imageviewspotsingletap = a;
            imageviewspotsingletap1 = a;
            f = scalegesturedetector.getFocusY();
            imageviewspotsingletap1.f = f;
            imageviewspotsingletap.h = f;
            a.j = true;
            a.postInvalidate();
            return true;
        } else
        {
            return super.egin(scalegesturedetector);
        }
    }

    public void onScaleEnd(ScaleGestureDetector scalegesturedetector)
    {
        a.j = false;
        super.nd(scalegesturedetector);
    }

    (ImageViewSpotSingleTap imageviewspotsingletap)
    {
        a = imageviewspotsingletap;
        super(imageviewspotsingletap);
    }
}
