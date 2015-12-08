// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bx;

import android.os.SystemClock;
import com.google.android.m4b.maps.bi.a;
import com.google.android.m4b.maps.bi.b;
import com.google.android.m4b.maps.bi.c;
import com.google.android.m4b.maps.bi.d;
import com.google.android.m4b.maps.bi.e;

// Referenced classes of package com.google.android.m4b.maps.bx:
//            p

static final class b extends a
{

    private final e b;
    private float c;
    private float d;
    private long e;

    public final int a()
    {
        return c != 0.0F || d != 0.0F ? 2 : 0;
    }

    public final d a(b b1)
    {
        long l = SystemClock.uptimeMillis();
        this;
        JVM INSTR monitorenter ;
        float f1;
        float f2;
        float f3;
        long l1 = e;
        e = l;
        float f = (float)Math.exp((float)(-(l - l1)) * 0.006F);
        f1 = (1.0F - f) / 0.006F;
        f2 = c;
        f3 = d;
        c = c * f;
        d = f * d;
        if (Math.abs(c) < 0.15F && Math.abs(d) < 0.15F)
        {
            c = 0.0F;
            d = 0.0F;
        }
        this;
        JVM INSTR monitorexit ;
        a = b.a(com.google.android.m4b.maps.bx.p.a(a, b1, f2 * f1, f1 * f3));
        b1 = this;
        if (c == 0.0F)
        {
            b1 = this;
            if (d == 0.0F)
            {
                b1 = a;
            }
        }
        return b1;
        b1;
        this;
        JVM INSTR monitorexit ;
        throw b1;
    }

    final void a(float f, float f1)
    {
        this;
        JVM INSTR monitorenter ;
        c = f * -0.001F;
        d = f1 * -0.001F;
        e = SystemClock.uptimeMillis();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public (c c1, e e1)
    {
        super(c1);
        b = e1;
    }
}
