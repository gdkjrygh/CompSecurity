// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ay;

import android.util.Log;
import java.util.Vector;

// Referenced classes of package com.google.android.m4b.maps.ay:
//            m, l, r, t, 
//            ab

public final class <init>
{

    boolean a;
    final r b;
    private Vector c;
    private m d;

    final <init> a()
    {
        this;
        JVM INSTR monitorenter ;
        if (c.size() != 0)
        {
            break MISSING_BLOCK_LABEL_16;
        }
        this;
        JVM INSTR monitorexit ;
        return null;
        if (a)
        {
            break MISSING_BLOCK_LABEL_32;
        }
        this;
        JVM INSTR monitorexit ;
        return null;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        String s;
        if (m.a(d) == null)
        {
            break MISSING_BLOCK_LABEL_88;
        }
        s = m.a(d).c();
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_88;
        }
        synchronized (d.f.b)
        {
            d.f.b.a(s);
        }
        obj = new <init>(d, c, b);
        c = new Vector();
        a = false;
        this;
        JVM INSTR monitorexit ;
        return ((a) (obj));
        exception1;
        obj;
        JVM INSTR monitorexit ;
        throw exception1;
    }

    public final void a(t t1)
    {
        t1.f();
        if (ab.a(m.i(), 3))
        {
            String s = m.i();
            int i = t1.g();
            Log.d(s, (new StringBuilder(29)).append("Add Data Request: ").append(i).toString());
        }
        boolean flag = d.g;
        this;
        JVM INSTR monitorenter ;
        if (t1.c())
        {
            a = true;
        }
        c.add(t1);
        this;
        JVM INSTR monitorexit ;
        if (t1.c() && !d.a())
        {
            d.e.a();
        }
        return;
        t1;
        this;
        JVM INSTR monitorexit ;
        throw t1;
    }

    private (m m1, r r1)
    {
        d = m1;
        super();
        c = new Vector();
        a = false;
        b = r1;
    }

    b(m m1, r r1, byte byte0)
    {
        this(m1, r1);
    }
}
