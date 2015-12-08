// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.tracking;

import android.graphics.RectF;
import com.google.android.apps.unveil.env.af;
import java.util.Map;

// Referenced classes of package com.google.android.apps.unveil.tracking:
//            ObjectTracker

final class e
{

    final String a;
    boolean b;
    final ObjectTracker c;
    private long d;
    private RectF e;
    private boolean f;

    e(ObjectTracker objecttracker, RectF rectf, long l, byte abyte0[])
    {
        c = objecttracker;
        super();
        b = false;
        a = Integer.toString(hashCode());
        d = l;
        objecttracker;
        JVM INSTR monitorenter ;
        RectF rectf1;
        d();
        rectf1 = ObjectTracker.a(c, rectf);
        synchronized (c)
        {
            ObjectTracker.a(c, a, rectf1.left, rectf1.top, rectf1.right, rectf1.bottom, abyte0);
        }
        a(rectf, l);
        ObjectTracker.b(objecttracker).put(a, this);
        objecttracker;
        JVM INSTR monitorexit ;
        return;
        rectf;
        objecttracker1;
        JVM INSTR monitorexit ;
        throw rectf;
        rectf;
        objecttracker;
        JVM INSTR monitorexit ;
        throw rectf;
    }

    private void a(RectF rectf, long l)
    {
        this;
        JVM INSTR monitorenter ;
        d();
        ObjectTracker objecttracker = c;
        objecttracker;
        JVM INSTR monitorenter ;
        if (d <= l) goto _L2; else goto _L1
_L1:
        ObjectTracker.b().c("Tried to use older position time!", new Object[0]);
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        rectf = ObjectTracker.a(c, rectf);
        d = l;
        ObjectTracker.a(c, a, rectf.left, rectf.top, rectf.right, rectf.bottom, d);
        a();
        objecttracker;
        JVM INSTR monitorexit ;
        if (true) goto _L4; else goto _L3
_L3:
        rectf;
        objecttracker;
        JVM INSTR monitorexit ;
        throw rectf;
        rectf;
        this;
        JVM INSTR monitorexit ;
        throw rectf;
    }

    final void a()
    {
        this;
        JVM INSTR monitorenter ;
        d();
        float af1[] = new float[4];
        ObjectTracker.a(c, a, af1);
        e = new RectF(af1[0], af1[1], af1[2], af1[3]);
        f = ObjectTracker.b(c, a);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    final RectF b()
    {
        this;
        JVM INSTR monitorenter ;
        RectF rectf;
        d();
        rectf = e;
        if (rectf != null) goto _L2; else goto _L1
_L1:
        rectf = null;
_L4:
        this;
        JVM INSTR monitorexit ;
        return rectf;
_L2:
        rectf = ObjectTracker.b(c, e);
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    final boolean c()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = f;
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    final void d()
    {
        if (b)
        {
            throw new RuntimeException("TrackedObject already removed from tracking!");
        }
        if (c != ObjectTracker.c())
        {
            throw new RuntimeException("TrackedObject created with another ObjectTracker!");
        } else
        {
            return;
        }
    }
}
