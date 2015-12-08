// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.tracking;

import android.graphics.Canvas;
import android.graphics.Matrix;
import com.google.android.apps.unveil.env.gl.BoundingBox;
import com.google.android.apps.unveil.env.gl.a;
import com.google.android.apps.unveil.nonstop.c;
import com.google.android.apps.unveil.nonstop.m;
import java.util.ArrayList;

// Referenced classes of package com.google.android.apps.unveil.tracking:
//            TrackingTestView, VisionGyro, ObjectTracker, e

public final class i extends c
    implements com.google.android.apps.unveil.ui.c
{

    final TrackingTestView a;
    private VisionGyro j;

    public i(TrackingTestView trackingtestview)
    {
        a = trackingtestview;
        super();
    }

    protected final void a(m m1)
    {
        TrackingTestView trackingtestview = a;
        trackingtestview;
        JVM INSTR monitorenter ;
        if (com.google.android.apps.unveil.tracking.TrackingTestView.a(a) == null)
        {
            com.google.android.apps.unveil.env.Size size = m1.f;
            j = new VisionGyro();
            com.google.android.apps.unveil.tracking.TrackingTestView.a(a, com.google.android.apps.unveil.tracking.ObjectTracker.a(m1.b(), m1.c(), m1.d()));
            com.google.android.apps.unveil.tracking.TrackingTestView.a(a, super.e);
        }
        com.google.android.apps.unveil.env.c c1 = m1.a();
        float af[] = j.a(c1.a, m1.b(), m1.c());
        com.google.android.apps.unveil.tracking.TrackingTestView.a(a).a(c1.a, m1.b, af, super.h);
        if (!TrackingTestView.b(a)) goto _L2; else goto _L1
_L1:
        int k = 0;
_L4:
        android.graphics.RectF rectf;
        if (k >= com.google.android.apps.unveil.tracking.TrackingTestView.c(a).size())
        {
            break; /* Loop/switch isn't completed */
        }
        rectf = ((e)com.google.android.apps.unveil.tracking.TrackingTestView.c(a).get(k)).b();
        if (rectf == null)
        {
            break MISSING_BLOCK_LABEL_212;
        }
        TrackingTestView.d(a).a(k + 1).set(rectf);
        TrackingTestView.e(a).mapRect(TrackingTestView.d(a).a(k + 1));
        BoundingBox boundingbox = TrackingTestView.d(a).a(k + 1);
        boolean flag;
        if (rectf != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        boundingbox.a = flag;
        k++;
        if (true) goto _L4; else goto _L3
_L3:
        k = com.google.android.apps.unveil.tracking.TrackingTestView.c(a).size() + 1;
_L9:
        if (k >= 6) goto _L6; else goto _L5
_L5:
        if (TrackingTestView.d(a).a(k) != null)
        {
            TrackingTestView.d(a).a(k).a = false;
        }
          goto _L7
_L2:
        TrackingTestView.f(a);
_L6:
        trackingtestview;
        JVM INSTR monitorexit ;
        if (TrackingTestView.g(a) != null)
        {
            com.google.android.apps.unveil.tracking.TrackingTestView.c(a).add(com.google.android.apps.unveil.tracking.TrackingTestView.a(a).a(TrackingTestView.g(a), m1.a().a));
            TrackingTestView.h(a);
        }
        return;
        m1;
        trackingtestview;
        JVM INSTR monitorexit ;
        throw m1;
_L7:
        k++;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public final void b(Canvas canvas)
    {
        if (com.google.android.apps.unveil.tracking.TrackingTestView.a(a) != null)
        {
            com.google.android.apps.unveil.tracking.TrackingTestView.a(a).a(canvas, TrackingTestView.e(a));
        }
    }

    public final void e()
    {
        TrackingTestView.i(a);
    }

    public final void i()
    {
        this;
        JVM INSTR monitorenter ;
        if (com.google.android.apps.unveil.tracking.TrackingTestView.a(a) != null)
        {
            com.google.android.apps.unveil.tracking.TrackingTestView.a(a).a(super.d, super.g);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }
}
