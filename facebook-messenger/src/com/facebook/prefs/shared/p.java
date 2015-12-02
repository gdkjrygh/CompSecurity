// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.prefs.shared;

import com.google.common.a.ik;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.facebook.prefs.shared:
//            e, j, ae

public class p
    implements e
{

    final j a;
    private final Map b = ik.a();

    public p(j j1)
    {
        a = j1;
        super();
    }

    public e a(ae ae1)
    {
        this;
        JVM INSTR monitorenter ;
        b.put(ae1, j.g());
        this;
        JVM INSTR monitorexit ;
        return this;
        ae1;
        throw ae1;
    }

    public e a(ae ae1, float f)
    {
        this;
        JVM INSTR monitorenter ;
        b.put(ae1, Float.valueOf(f));
        this;
        JVM INSTR monitorexit ;
        return this;
        ae1;
        throw ae1;
    }

    public e a(ae ae1, int i)
    {
        this;
        JVM INSTR monitorenter ;
        b.put(ae1, Integer.valueOf(i));
        this;
        JVM INSTR monitorexit ;
        return this;
        ae1;
        throw ae1;
    }

    public e a(ae ae1, long l)
    {
        this;
        JVM INSTR monitorenter ;
        b.put(ae1, Long.valueOf(l));
        this;
        JVM INSTR monitorexit ;
        return this;
        ae1;
        throw ae1;
    }

    public e a(ae ae1, String s)
    {
        this;
        JVM INSTR monitorenter ;
        if (s != null) goto _L2; else goto _L1
_L1:
        b.put(ae1, j.g());
        j.a(a, ae1);
_L4:
        this;
        JVM INSTR monitorexit ;
        return this;
_L2:
        b.put(ae1, s);
        if (true) goto _L4; else goto _L3
_L3:
        ae1;
        throw ae1;
    }

    public e a(ae ae1, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        b.put(ae1, Boolean.valueOf(flag));
        this;
        JVM INSTR monitorexit ;
        return this;
        ae1;
        throw ae1;
    }

    public void a()
    {
        this;
        JVM INSTR monitorenter ;
        java.util.HashMap hashmap = ik.a(b);
        j.a(a, hashmap, true);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public e b(ae ae1)
    {
        this;
        JVM INSTR monitorenter ;
        ae ae2;
        for (ae1 = a.d(ae1).iterator(); ae1.hasNext(); b.put(ae2, j.g()))
        {
            ae2 = (ae)ae1.next();
        }

        break MISSING_BLOCK_LABEL_57;
        ae1;
        throw ae1;
        this;
        JVM INSTR monitorexit ;
        return this;
    }
}
