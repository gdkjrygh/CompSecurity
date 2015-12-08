// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.TimeUnit;

public final class gfe
    implements gfa
{

    private final long a;
    private final long b;

    public gfe(long l, long l1, TimeUnit timeunit)
    {
        a = timeunit.toMillis(l);
        b = timeunit.toMillis(l1);
    }

    public final long a(int i)
    {
        return a + (long)(Math.random() * (double)(b - a));
    }
}
