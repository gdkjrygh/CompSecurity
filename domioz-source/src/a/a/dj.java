// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;

import com.appboy.f;
import java.util.Locale;
import java.util.TimeZone;

public final class dj
{

    private static final String a;
    private static final Locale b;
    private static final TimeZone c = TimeZone.getTimeZone("UTC");

    public dj()
    {
    }

    public static long a()
    {
        return System.currentTimeMillis() / 1000L;
    }

    public static double b()
    {
        return (double)System.currentTimeMillis() / 1000D;
    }

    public static long c()
    {
        return System.currentTimeMillis();
    }

    static 
    {
        a = String.format("%s.%s", new Object[] {
            f.a, a/a/dj.getName()
        });
        b = Locale.US;
    }
}
