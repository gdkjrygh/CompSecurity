// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.TimeUnit;

final class nyo extends nym
{

    private static final long a;
    private final jz b = new jz();
    private final lwu c;

    nyo(lwu lwu)
    {
        c = lwu;
    }

    static long a()
    {
        return a;
    }

    public final nyn a(String s)
    {
        this;
        JVM INSTR monitorenter ;
        nyn nyn2 = (nyn)b.get(s);
        nyn nyn1;
        nyn1 = nyn2;
        if (nyn2 != null)
        {
            break MISSING_BLOCK_LABEL_43;
        }
        nyn1 = new nyn(s, c);
        b.put(s, nyn1);
        this;
        JVM INSTR monitorexit ;
        return nyn1;
        s;
        throw s;
    }

    static 
    {
        a = TimeUnit.HOURS.toMillis(1L);
    }
}
