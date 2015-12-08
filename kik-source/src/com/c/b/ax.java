// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;


// Referenced classes of package com.c.b:
//            aq, av, be, bk, 
//            f

public class ax
{

    private static final aq b = aq.d();
    protected volatile be a;
    private f c;
    private aq d;
    private volatile f e;

    public ax(aq aq1, f f1)
    {
        if (aq1 == null)
        {
            throw new NullPointerException("found null ExtensionRegistry");
        }
        if (f1 == null)
        {
            throw new NullPointerException("found null ByteString");
        } else
        {
            d = aq1;
            c = f1;
            return;
        }
    }

    public final be a(be be1)
    {
        if (a != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorenter ;
        if (a == null) goto _L4; else goto _L3
_L3:
        this;
        JVM INSTR monitorexit ;
_L2:
        return a;
_L4:
        if (c == null) goto _L6; else goto _L5
_L5:
        a = (be)be1.t().a(c, d);
        e = c;
        c = null;
_L7:
        this;
        JVM INSTR monitorexit ;
          goto _L2
        be1;
        this;
        JVM INSTR monitorexit ;
        throw be1;
_L6:
        a = be1;
        e = f.a;
        c = null;
          goto _L7
        av av1;
        av1;
        a = be1;
        e = f.a;
        c = null;
          goto _L7
    }

    public final int b()
    {
        if (c != null)
        {
            return c.a();
        }
        if (e != null)
        {
            return e.a();
        }
        if (a != null)
        {
            return a.b();
        } else
        {
            return 0;
        }
    }

    public final be b(be be1)
    {
        be be2 = a;
        c = null;
        e = null;
        a = be1;
        return be2;
    }

    public final f c()
    {
        if (c != null)
        {
            return c;
        }
        if (e != null)
        {
            return e;
        }
        this;
        JVM INSTR monitorenter ;
        f f1;
        if (e == null)
        {
            break MISSING_BLOCK_LABEL_47;
        }
        f1 = e;
        this;
        JVM INSTR monitorexit ;
        return f1;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        if (a != null)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        e = f.a;
_L1:
        exception = e;
        this;
        JVM INSTR monitorexit ;
        return exception;
        e = a.d();
          goto _L1
    }

}
