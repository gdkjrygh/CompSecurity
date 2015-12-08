// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aq;

import android.util.Log;
import com.google.android.m4b.maps.ay.ab;
import com.google.android.m4b.maps.bx.g;
import com.google.android.m4b.maps.cg.o;

// Referenced classes of package com.google.android.m4b.maps.aq:
//            v

public class h extends g
{

    private static final String d = com/google/android/m4b/maps/aq/h.getSimpleName();
    private final o e;
    private boolean f;
    private boolean g;
    private boolean h;
    private boolean i;
    private boolean j;

    private h(o o1)
    {
        f = false;
        g = false;
        h = false;
        i = false;
        j = false;
        e = o1;
    }

    public static h a(v v1, o o1)
    {
        o1 = new h(o1);
        v1.a(o1);
        return o1;
    }

    private boolean e()
    {
        this;
        JVM INSTR monitorenter ;
        if (f || g || h || i) goto _L2; else goto _L1
_L1:
        boolean flag = j;
        if (!flag) goto _L2; else goto _L3
_L3:
        flag = true;
_L5:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
        Exception exception;
        exception;
        throw exception;
    }

    public final void a()
    {
        if (ab.a(d, 2))
        {
            Log.v(d, "onRepaintLater");
        }
        this;
        JVM INSTR monitorenter ;
        f = true;
        this;
        JVM INSTR monitorexit ;
        e.a(false);
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected final boolean a(boolean flag)
    {
        if (ab.a(d, 2))
        {
            Log.v(d, (new StringBuilder(29)).append("onEndFrame, isMapReady: ").append(flag).toString());
        }
        this;
        JVM INSTR monitorenter ;
        i = false;
        j = flag;
        this;
        JVM INSTR monitorexit ;
        e.a(e());
        return false;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void b()
    {
        if (ab.a(d, 2))
        {
            Log.v(d, "onSetPendingRequest");
        }
        this;
        JVM INSTR monitorenter ;
        f = false;
        g = true;
        this;
        JVM INSTR monitorexit ;
        e.a(false);
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void c()
    {
        if (ab.a(d, 2))
        {
            Log.v(d, "onRequestRender");
        }
        this;
        JVM INSTR monitorenter ;
        g = false;
        h = true;
        this;
        JVM INSTR monitorexit ;
        e.a(false);
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected final void d()
    {
        if (ab.a(d, 2))
        {
            Log.v(d, "onStartFrame");
        }
        this;
        JVM INSTR monitorenter ;
        h = false;
        i = true;
        this;
        JVM INSTR monitorexit ;
        e.a(false);
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

}
