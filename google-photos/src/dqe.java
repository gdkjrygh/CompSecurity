// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Calendar;
import java.util.TimeZone;

final class dqe
    implements dpz
{

    private final Calendar a = Calendar.getInstance(TimeZone.getTimeZone("UTC"));

    dqe()
    {
    }

    public final long a(long l)
    {
        a.setTimeInMillis(l);
        eyr.b(a);
        return a.getTimeInMillis();
    }
}
