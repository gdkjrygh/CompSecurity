// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.retouch;

import android.graphics.Matrix;
import android.view.ScaleGestureDetector;

// Referenced classes of package com.roidapp.imagelib.retouch:
//            x

final class z
    implements android.view.ScaleGestureDetector.OnScaleGestureListener
{

    final x a;

    z(x x1)
    {
        a = x1;
        super();
    }

    public final boolean onScale(ScaleGestureDetector scalegesturedetector)
    {
        float f = scalegesturedetector.getScaleFactor();
        if (Float.isNaN(f) || Float.isInfinite(f))
        {
            return false;
        }
        if (a.b() * f <= 5F)
        {
            x.a(a).postScale(f, f, scalegesturedetector.getFocusX(), scalegesturedetector.getFocusY());
            x.b(a);
        }
        return true;
    }

    public final boolean onScaleBegin(ScaleGestureDetector scalegesturedetector)
    {
        return true;
    }

    public final void onScaleEnd(ScaleGestureDetector scalegesturedetector)
    {
    }
}
