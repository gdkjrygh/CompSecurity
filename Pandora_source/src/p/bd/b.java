// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bd;

import p.bg.am;
import p.bh.i;
import p.bh.p;

public class b
{

    private Boolean a;
    private Boolean b;
    private i c;
    private int d;

    public b()
    {
        a = Boolean.valueOf(false);
        b = null;
        c = null;
    }

    private p b()
    {
        this;
        JVM INSTR monitorenter ;
        if (c != null && !c.equals(i.d)) goto _L2; else goto _L1
_L1:
        p p1 = p.c;
_L4:
        this;
        JVM INSTR monitorexit ;
        return p1;
_L2:
        if (!c.equals(i.c))
        {
            break MISSING_BLOCK_LABEL_135;
        }
        if (b != null)
        {
            break MISSING_BLOCK_LABEL_74;
        }
        if (a.booleanValue())
        {
            p1 = p.a;
            continue; /* Loop/switch isn't completed */
        }
        p1 = p.c;
        continue; /* Loop/switch isn't completed */
        if (b.booleanValue() && a.booleanValue())
        {
            p1 = p.a;
            continue; /* Loop/switch isn't completed */
        }
        if (!b.booleanValue() && a.booleanValue())
        {
            p1 = p.b;
            continue; /* Loop/switch isn't completed */
        }
        p1 = p.c;
        continue; /* Loop/switch isn't completed */
        if (!c.equals(i.a) && !c.equals(i.b))
        {
            break MISSING_BLOCK_LABEL_192;
        }
        if (b != null && !b.booleanValue())
        {
            p1 = p.b;
            continue; /* Loop/switch isn't completed */
        }
        p1 = p.a;
        continue; /* Loop/switch isn't completed */
        p1 = p.c;
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

    public am a()
    {
        this;
        JVM INSTR monitorenter ;
        am am1;
        am1 = new am();
        am1.a(b);
        am1.a(c);
        am1.b(a);
        am1.a(b());
        this;
        JVM INSTR monitorexit ;
        return am1;
        Exception exception;
        exception;
        throw exception;
    }

    public void a(int j)
    {
        this;
        JVM INSTR monitorenter ;
        d = j;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void a(i j)
    {
        this;
        JVM INSTR monitorenter ;
        c = j;
        if (!j.equals(i.a) && !j.equals(i.b)) goto _L2; else goto _L1
_L1:
        b(true);
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (j.equals(i.d))
        {
            b(false);
        }
        if (true) goto _L4; else goto _L3
_L3:
        j;
        throw j;
    }

    public void a(boolean flag)
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
