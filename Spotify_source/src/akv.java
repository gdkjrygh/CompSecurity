// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Random;

final class akv
    implements hac
{

    private hac a;
    private Random b;
    private double c;

    public akv(hac hac1)
    {
        this(hac1, new Random());
    }

    private akv(hac hac1, Random random)
    {
        if (hac1 == null)
        {
            throw new NullPointerException("backoff must not be null");
        } else
        {
            a = hac1;
            c = 0.10000000000000001D;
            b = random;
            return;
        }
    }

    public final long a(int i)
    {
        double d = 1.0D - c;
        return (long)((d + ((c + 1.0D) - d) * b.nextDouble()) * (double)a.a(i));
    }
}
