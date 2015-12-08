// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.TimeUnit;

public final class gfd
    implements gfa
{

    private final long a;

    public gfd(long l, TimeUnit timeunit)
    {
        a = timeunit.toMillis(l);
    }

    public final long a(int i)
    {
        return a;
    }
}
