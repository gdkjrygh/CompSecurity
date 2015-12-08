// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Calendar;

final class dpq
    implements dpz
{

    private final Calendar a = ivc.a();

    dpq()
    {
    }

    public final long a(long l)
    {
        this;
        JVM INSTR monitorenter ;
        a.setTimeInMillis(l);
        eyr.a(a);
        l = a.getTimeInMillis();
        this;
        JVM INSTR monitorexit ;
        return l;
        Exception exception;
        exception;
        throw exception;
    }
}
