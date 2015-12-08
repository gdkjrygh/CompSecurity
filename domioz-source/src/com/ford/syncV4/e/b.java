// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.e;

import com.ford.syncV4.e.c.a.e;
import com.ford.syncV4.e.c.a.k;
import com.ford.syncV4.e.c.al;

public final class b
{

    private Boolean a;
    private Boolean b;
    private e c;
    private int d;

    public b()
    {
        a = Boolean.valueOf(false);
        b = null;
        c = null;
    }

    private k b()
    {
        this;
        JVM INSTR monitorenter ;
        if (c != null && !c.equals(e.d)) goto _L2; else goto _L1
_L1:
        k k1 = k.c;
_L4:
        this;
        JVM INSTR monitorexit ;
        return k1;
_L2:
        if (!c.equals(e.c))
        {
            break MISSING_BLOCK_LABEL_135;
        }
        if (b != null)
        {
            break MISSING_BLOCK_LABEL_74;
        }
        if (a.booleanValue())
        {
            k1 = k.a;
            continue; /* Loop/switch isn't completed */
        }
        k1 = k.c;
        continue; /* Loop/switch isn't completed */
        if (b.booleanValue() && a.booleanValue())
        {
            k1 = k.a;
            continue; /* Loop/switch isn't completed */
        }
        if (!b.booleanValue() && a.booleanValue())
        {
            k1 = k.b;
            continue; /* Loop/switch isn't completed */
        }
        k1 = k.c;
        continue; /* Loop/switch isn't completed */
        if (!c.equals(e.a) && !c.equals(e.b))
        {
            break MISSING_BLOCK_LABEL_192;
        }
        if (b != null && !b.booleanValue())
        {
            k1 = k.b;
            continue; /* Loop/switch isn't completed */
        }
        k1 = k.a;
        continue; /* Loop/switch isn't completed */
        k1 = k.c;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    private void b(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        a = Boolean.valueOf(flag);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final al a()
    {
        this;
        JVM INSTR monitorenter ;
        al al1;
        al1 = new al();
        al1.a(b);
        al1.a(c);
        al1.b(a);
        al1.a(b());
        this;
        JVM INSTR monitorexit ;
        return al1;
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(int i)
    {
        this;
        JVM INSTR monitorenter ;
        d = i;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(e e1)
    {
        this;
        JVM INSTR monitorenter ;
        c = e1;
        if (!e1.equals(e.a) && !e1.equals(e.b)) goto _L2; else goto _L1
_L1:
        b(true);
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (e1.equals(e.d))
        {
            b(false);
        }
        if (true) goto _L4; else goto _L3
_L3:
        e1;
        throw e1;
    }

    public final void a(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        b = Boolean.valueOf(flag);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }
}
