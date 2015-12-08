// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;

// Referenced classes of package com.google.android.gms.internal:
//            dn, z

public final class ds
{

    private final Object a = new Object();
    private final String b;
    private int c;
    private long d;
    private long e;
    private int f;
    private int g;

    public ds(String s)
    {
        c = 0;
        d = -1L;
        e = -1L;
        f = 0;
        g = -1;
        b = s;
    }

    public final Bundle a(String s, Context context)
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        Bundle bundle;
        bundle = new Bundle();
        bundle.putString("session_id", b);
        bundle.putLong("basets", e);
        bundle.putLong("currts", d);
        bundle.putString("seq_num", s);
        bundle.putInt("preqs", g);
        bundle.putInt("pclick", c);
        bundle.putInt("pimp", f);
        s = new dn(context);
        bundle.putInt("gnt", ((dn) (s)).m);
        if (((dn) (s)).l != 1)
        {
            break MISSING_BLOCK_LABEL_132;
        }
        bundle.putString("net", "wi");
_L2:
        return bundle;
        bundle.putString("net", "ed");
        if (true) goto _L2; else goto _L1
_L1:
        s;
        throw s;
    }

    public final void a()
    {
        synchronized (a)
        {
            c = c + 1;
        }
    }

    public final void a(z z1, long l)
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        if (e != -1L)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        e = l;
        d = e;
_L2:
        if (z1.d == null || z1.d.getInt("gw", 2) != 1)
        {
            break MISSING_BLOCK_LABEL_72;
        }
        return;
        d = l;
        if (true) goto _L2; else goto _L1
_L1:
        z1;
        throw z1;
        g = g + 1;
        obj;
        JVM INSTR monitorexit ;
    }

    public final void b()
    {
        this;
        JVM INSTR monitorenter ;
        synchronized (a)
        {
            f = f + 1;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        exception1;
        obj;
        JVM INSTR monitorexit ;
        throw exception1;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
