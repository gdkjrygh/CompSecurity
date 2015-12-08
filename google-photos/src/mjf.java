// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayDeque;
import java.util.List;

final class mjf
{

    private final ArrayDeque a = new ArrayDeque();
    private mjd b;

    mjf(mjd mjd)
    {
        b = mjd;
        super();
    }

    public final mje a(ata ata)
    {
        this;
        JVM INSTR monitorenter ;
        mje mje2 = (mje)a.poll();
        mje mje1;
        mje1 = mje2;
        if (mje2 != null)
        {
            break MISSING_BLOCK_LABEL_31;
        }
        mje1 = new mje(b);
        mje1.c = System.currentTimeMillis();
        mje1.b = ata;
        this;
        JVM INSTR monitorexit ;
        return mje1;
        ata;
        throw ata;
    }

    public final void a(mje mje1)
    {
        this;
        JVM INSTR monitorenter ;
        mje.c(mje1).clear();
        mje.a(mje1, null);
        mje.a(mje1, false);
        if (a.size() < 50)
        {
            a.offer(mje1);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        mje1;
        throw mje1;
    }
}
