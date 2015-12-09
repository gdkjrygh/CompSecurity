// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.d;

import com.ford.syncV4.d.a.f;
import com.ford.syncV4.h.a.b;
import com.ford.syncV4.h.e;

// Referenced classes of package com.ford.syncV4.d:
//            g, c, d, e

public abstract class a
{

    private c a;
    private Object b;

    public a(c c1)
    {
        a = null;
        b = new Object();
        if (c1 == null)
        {
            throw new IllegalArgumentException("Provided protocol listener interface reference is null");
        } else
        {
            a = c1;
            return;
        }
    }

    protected static void a(d d1, byte abyte0[], g g1)
    {
        e.a(b.b, d1, abyte0, 0, abyte0.length, "42baba60-eb57-11df-98cf-0800200c9a66");
        g1.a(d1, abyte0);
    }

    private void a(byte abyte0[], int i, int j)
    {
        a.a(abyte0, i, j);
    }

    private void c(byte byte0)
    {
        this;
        JVM INSTR monitorenter ;
        if (a != null)
        {
            a.b(byte0);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public abstract void a(byte byte0);

    public abstract void a(f f);

    public abstract void a(f f, byte byte0);

    protected final void a(f f, byte byte0, byte byte1, String s)
    {
        a.a(f, byte0, byte1, s);
    }

    protected final void a(f f, byte byte0, String s)
    {
        a.a(f, byte0, s);
    }

    protected final void a(d d1, byte abyte0[], int i, int j)
    {
        e.a(b.a, d1, abyte0, i, j, "42baba60-eb57-11df-98cf-0800200c9a66");
        c(d1.e());
        Object obj = b;
        obj;
        JVM INSTR monitorenter ;
        d1 = d1.a();
        a(((byte []) (d1)), 0, d1.length);
        if (abyte0 == null)
        {
            break MISSING_BLOCK_LABEL_55;
        }
        a(abyte0, i, j);
        obj;
        JVM INSTR monitorexit ;
        return;
        d1;
        obj;
        JVM INSTR monitorexit ;
        throw d1;
    }

    public abstract void a(com.ford.syncV4.d.e e1);

    protected final void a(String s, Exception exception)
    {
        a.a(s, exception);
    }

    public abstract void a(byte abyte0[], int i);

    protected final void b(byte byte0)
    {
        a.a(byte0);
    }

    protected final void b(com.ford.syncV4.d.e e1)
    {
        a.a(e1);
    }
}
