// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class fec
{

    private final jk a = new jk();
    private final bad b = new bad(6000);

    fec()
    {
    }

    final fed a(String s)
    {
        this;
        JVM INSTR monitorenter ;
        fed fed2 = (fed)a.get(s);
        fed fed1;
        fed1 = fed2;
        if (fed2 != null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        fed2 = (fed)b.b(s);
        fed1 = fed2;
        if (fed2 != null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        fed1 = new fed(s, this);
        a.put(s, fed1);
        this;
        JVM INSTR monitorexit ;
        return fed1;
        s;
        throw s;
    }

    final void a()
    {
        this;
        JVM INSTR monitorenter ;
        a.clear();
        b.a();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    void a(fed fed1)
    {
        this;
        JVM INSTR monitorenter ;
        a.remove(fed1.b);
        b.b(fed1.b, fed1);
        this;
        JVM INSTR monitorexit ;
        return;
        fed1;
        throw fed1;
    }

    void b(fed fed1)
    {
        this;
        JVM INSTR monitorenter ;
        b.c(fed1.b);
        a.put(fed1.b, fed1);
        this;
        JVM INSTR monitorexit ;
        return;
        fed1;
        throw fed1;
    }
}
