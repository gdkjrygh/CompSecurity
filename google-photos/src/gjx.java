// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public final class gjx
{

    private static final long c;
    private static final long d;
    public final int a;
    public final int b;

    gjx(long l)
    {
        Calendar calendar = ivc.a();
        calendar.setTimeInMillis(l);
        eyr.a(calendar);
        a = (int)(calendar.getTimeInMillis() / d);
        b = (int)((l - (long)a * d) / c);
    }

    public static long a(int i)
    {
        return (long)i * d;
    }

    static 
    {
        c = TimeUnit.SECONDS.toMillis(1L);
        d = TimeUnit.DAYS.toMillis(1L);
    }
}
