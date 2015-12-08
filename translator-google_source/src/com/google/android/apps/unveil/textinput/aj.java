// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.textinput;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.view.ScaleGestureDetector;

// Referenced classes of package com.google.android.apps.unveil.textinput:
//            ZoomableContainer

final class aj extends android.view.ScaleGestureDetector.SimpleOnScaleGestureListener
{

    final float a[] = new float[9];
    final ZoomableContainer b;

    aj(ZoomableContainer zoomablecontainer)
    {
        b = zoomablecontainer;
        super();
    }

    public final boolean onScale(ScaleGestureDetector scalegesturedetector)
    {
        float f1 = 0.0F;
        float f = scalegesturedetector.getFocusX();
        float f2 = scalegesturedetector.getFocusY();
        float f3 = ZoomableContainer.a(b).x;
        float f4 = ZoomableContainer.a(b).y;
        ZoomableContainer.a(b).set(f, f2);
        float f5 = ZoomableContainer.c(b);
        ZoomableContainer.a(b, ZoomableContainer.c(b) * scalegesturedetector.getScaleFactor());
        ZoomableContainer.a(b, Math.max(ZoomableContainer.b(), Math.min(ZoomableContainer.c(b), ZoomableContainer.c())));
        ZoomableContainer.b(b).postScale(ZoomableContainer.c(b) / f5, ZoomableContainer.c(b) / f5, b.getWidth() / 2, b.getHeight() / 2);
        ZoomableContainer.b(b).postTranslate(f - f3, f2 - f4);
        scalegesturedetector = ZoomableContainer.b(b);
        scalegesturedetector.getValues(a);
        f4 = a[0];
        f3 = a[2];
        f2 = a[5];
        int i = b.getWidth();
        int j = b.getHeight();
        if (f3 > 0.0F)
        {
            f = 0.0F;
        } else
        {
            f = f3;
            if (-f3 + (float)i > (float)i * f4)
            {
                f = (float)i - (float)i * f4;
            }
        }
        if (f2 <= 0.0F)
        {
            if (-f2 + (float)j > (float)j * f4)
            {
                f1 = (float)j - (float)j * f4;
            } else
            {
                f1 = f2;
            }
        }
        a[2] = f;
        a[5] = f1;
        scalegesturedetector.setValues(a);
        ZoomableContainer.d(b);
        b.invalidate();
        return true;
    }

    public final boolean onScaleBegin(ScaleGestureDetector scalegesturedetector)
    {
        ZoomableContainer.a(b).set(scalegesturedetector.getFocusX(), scalegesturedetector.getFocusY());
        if (ZoomableContainer.b(b).isIdentity())
        {
            ZoomableContainer.a(b, 1.0F);
        }
        return true;
    }
}
