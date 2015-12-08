// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.wordlens;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.view.ScaleGestureDetector;

// Referenced classes of package com.google.android.libraries.wordlens:
//            c

final class d extends android.view.ScaleGestureDetector.SimpleOnScaleGestureListener
{

    final c a;
    private final PointF b = new PointF();

    d(c c1)
    {
        a = c1;
        super();
    }

    public final boolean onScale(ScaleGestureDetector scalegesturedetector)
    {
        float f = scalegesturedetector.getFocusX();
        float f1 = scalegesturedetector.getFocusY();
        float f2 = b.x;
        float f3 = b.y;
        b.set(f, f1);
        float f4 = scalegesturedetector.getScaleFactor();
        float f5 = c.c(a);
        c.a(a, f4 * c.c(a));
        c.a(a, Math.max(1.0F, Math.min(c.c(a), 3F)));
        c.d(a).postScale(c.c(a) / f5, c.c(a) / f5, f, f1);
        c.d(a).postTranslate(f - f2, f1 - f3);
        c.b(a);
        return true;
    }

    public final boolean onScaleBegin(ScaleGestureDetector scalegesturedetector)
    {
        b.set(scalegesturedetector.getFocusX(), scalegesturedetector.getFocusY());
        c.a(a, true);
        c.a(a);
        c.b(a);
        return true;
    }

    public final void onScaleEnd(ScaleGestureDetector scalegesturedetector)
    {
        c.b(a);
        c.a(a, false);
    }
}
