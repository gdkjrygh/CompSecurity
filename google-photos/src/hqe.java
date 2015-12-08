// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Random;
import java.util.concurrent.TimeUnit;

public final class hqe
    implements hpy
{

    public hqe()
    {
    }

    public final long a()
    {
        return (long)((float)TimeUnit.SECONDS.toMillis(1L) * (1.0F + (new Random()).nextFloat()));
    }

    public final void a(long l)
    {
        Thread.sleep(l);
    }
}
