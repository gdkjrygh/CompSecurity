// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.TimeUnit;

public final class gfb
    implements gfa
{

    private final long a;

    public gfb(long l, TimeUnit timeunit)
    {
        a = timeunit.toMillis(l);
    }

    public final long a(int i)
    {
        long l2 = a << i;
        long l1 = (long)((double)l2 * 0.33333333333333331D * Math.random());
        long l = l1;
        if (l1 % 2L == 0L)
        {
            l = -l1;
        }
        return l + l2;
    }
}
