// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.TimeUnit;

final class hdo
{

    static final long a;
    final ivi b;

    hdo(ivi ivi)
    {
        b = ivi;
    }

    static hdp a(String s)
    {
        s = fzt.a(s);
        if (s != null)
        {
            return new hdp(s.longValue(), 0L);
        } else
        {
            return null;
        }
    }

    static 
    {
        a = TimeUnit.DAYS.toMillis(365L);
    }
}
