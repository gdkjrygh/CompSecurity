// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.TimeUnit;

public final class mri
    implements mql
{

    public static final mql a;
    private final int b = 3;
    private final long c;

    private mri(int i, long l)
    {
        c = l;
    }

    public final int a()
    {
        return b;
    }

    public final long b()
    {
        return c;
    }

    static 
    {
        a = new mri(3, TimeUnit.MINUTES.toMillis(3L));
    }
}
