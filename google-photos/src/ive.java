// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Calendar;
import java.util.Random;

public final class ive
{

    private final Calendar a = ivc.a();
    private final Random b = new Random();

    public ive()
    {
    }

    public final ivd a(long l)
    {
        this;
        JVM INSTR monitorenter ;
        ivf ivf1;
        a.setTimeInMillis(l);
        eyr.b(a);
        l = a.getTimeInMillis();
        a.add(2, 1);
        ivf1 = new ivf(l, a.getTimeInMillis() - 1L);
        this;
        JVM INSTR monitorexit ;
        return ivf1;
        Exception exception;
        exception;
        throw exception;
    }

    public final long b(long l)
    {
        this;
        JVM INSTR monitorenter ;
        long l1;
        ivd ivd1 = a(l);
        b.setSeed(l);
        l1 = ivd1.b();
        long l2 = ivd1.a();
        l = ivd1.a();
        l1 = Math.abs(b.nextLong() % (l1 - l2));
        this;
        JVM INSTR monitorexit ;
        return l + l1;
        Exception exception;
        exception;
        throw exception;
    }
}
