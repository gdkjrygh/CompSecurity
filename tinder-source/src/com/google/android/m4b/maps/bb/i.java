// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bb;

import android.view.animation.LinearInterpolator;
import com.google.android.m4b.maps.bo.f;
import com.google.android.m4b.maps.bo.g;
import com.google.android.m4b.maps.y.h;
import com.google.android.m4b.maps.y.j;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.m4b.maps.bb:
//            h, k, d, g, 
//            f, b

public final class i
    implements com.google.android.m4b.maps.bb.h
{

    private static final long a;
    private static final long b;
    private final k c = new k(new d());
    private final com.google.android.m4b.maps.bb.f d = new com.google.android.m4b.maps.bb.f(new b());
    private final com.google.android.m4b.maps.bb.g e = new com.google.android.m4b.maps.bb.g(new d());
    private final com.google.android.m4b.maps.bb.g f = new com.google.android.m4b.maps.bb.g(new LinearInterpolator());

    public i()
    {
        c.setDuration(a);
        d.setDuration(a);
        e.setDuration(a);
        f.a(0);
        f.a(2);
        f.setDuration(b);
        f.setRepeatCount(-1);
        f.start();
    }

    public final boolean a(f f1)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = c.isInitialized();
        if (flag) goto _L2; else goto _L1
_L1:
        flag = false;
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        j.a(f1);
        f1.a((g)c.b(), d.c, e.c);
        f1.j = Math.min(1.0F, Math.max(0.0F, f.c));
        flag = true;
        if (true) goto _L4; else goto _L3
_L3:
        f1;
        throw f1;
    }

    public final void b(f f1)
    {
        this;
        JVM INSTR monitorenter ;
        if (!c.isInitialized() || !h.a(f1.a, c.a()))
        {
            c.d(f1.a);
            c.start();
        }
        if (d.isInitialized() && f1.b == d.b) goto _L2; else goto _L1
_L1:
        float f2;
        com.google.android.m4b.maps.bb.f f3;
        f3 = d;
        f2 = f1.b;
        if (f3.d)
        {
            break MISSING_BLOCK_LABEL_161;
        }
        f3.a = f2;
        f3.b = f2;
        f3.c = f2;
        f3.d = true;
_L3:
        d.start();
_L2:
        if (!e.isInitialized() || f1.c != e.b)
        {
            e.a(f1.c);
            e.start();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        f3.a = f3.c;
        f3.b = f2;
          goto _L3
        f1;
        throw f1;
    }

    static 
    {
        a = TimeUnit.SECONDS.toMillis(5L);
        b = TimeUnit.SECONDS.toMillis(1L);
    }
}
