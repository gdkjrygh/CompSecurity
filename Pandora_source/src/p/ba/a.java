// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ba;

import p.bk.e;
import p.bl.b;

// Referenced classes of package p.ba:
//            c, d, f

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

    private void c(p.bb.e e1, byte byte0)
    {
        this;
        JVM INSTR monitorenter ;
        if (a != null)
        {
            a.b(e1, byte0);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        e1;
        throw e1;
    }

    public abstract void a(byte byte0);

    protected void a(String s, Exception exception)
    {
        a.a(s, exception);
    }

    protected void a(d d1, byte abyte0[], int i, int j)
    {
        e.a(b.a, d1, abyte0, i, j, "42baba60-eb57-11df-98cf-0800200c9a66");
        c(d1.i(), d1.e());
        Object obj = b;
        obj;
        JVM INSTR monitorenter ;
        d1 = d1.a();
        a(((byte []) (d1)), 0, d1.length);
        if (abyte0 == null)
        {
            break MISSING_BLOCK_LABEL_59;
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

    protected void a(d d1, byte abyte0[], g.a a1)
    {
        e.a(b.b, d1, abyte0, 0, abyte0.length, "42baba60-eb57-11df-98cf-0800200c9a66");
        a1.d(d1, abyte0);
    }

    public abstract void a(f f);

    public abstract void a(p.bb.e e1);

    public abstract void a(p.bb.e e1, byte byte0);

    protected void a(p.bb.e e1, byte byte0, byte byte1, String s)
    {
        a.a(e1, byte0, byte1, s);
    }

    protected void a(p.bb.e e1, byte byte0, String s)
    {
        a.a(e1, byte0, s);
    }

    public abstract void a(byte abyte0[], int i);

    protected void a(byte abyte0[], int i, int j)
    {
        a.a(abyte0, i, j);
    }

    protected void b(f f)
    {
        a.a(f);
    }

    protected void b(p.bb.e e1, byte byte0)
    {
        a.a(e1, byte0);
    }
}
