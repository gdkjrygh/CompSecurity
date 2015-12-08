// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public final class eyr
{

    public static final long a;
    private static final eys b;
    private static final eys c;
    private static final eys d;

    public static void a(Calendar calendar)
    {
        a(calendar, d);
    }

    private static void a(Calendar calendar, eys eys1)
    {
        if (calendar.get(11) < 4)
        {
            calendar.add(6, -1);
        }
        eys1 = eys1.a;
        int j = eys1.length;
        for (int i = 0; i < j; i++)
        {
            calendar.clear(eys1[i]);
        }

        calendar.set(11, 4);
    }

    public static void b(Calendar calendar)
    {
        a(calendar, c);
    }

    public static void c(Calendar calendar)
    {
        a(calendar, b);
    }

    static 
    {
        a = TimeUnit.HOURS.toMillis(4L);
        HashSet hashset = new HashSet();
        for (int i = 0; i < 17; i++)
        {
            hashset.add(Integer.valueOf(i));
        }

        hashset.remove(Integer.valueOf(1));
        b = new eys(hashset);
        hashset.remove(Integer.valueOf(2));
        c = new eys(hashset);
        hashset.remove(Integer.valueOf(5));
        d = new eys(hashset);
    }
}
