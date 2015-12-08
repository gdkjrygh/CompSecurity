// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.TimeUnit;

public final class dgh extends Enum
{

    public static final dgh a;
    public static final dgh b;
    private static dgh d;
    private static dgh e;
    private static final dgh f[];
    public final long c;

    private dgh(String s, int i, long l)
    {
        super(s, i);
        c = l;
    }

    public static dgh valueOf(String s)
    {
        return (dgh)Enum.valueOf(dgh, s);
    }

    public static dgh[] values()
    {
        return (dgh[])f.clone();
    }

    static 
    {
        a = new dgh("ACCESSIBILITY_EXTRA_LONG", 0, TimeUnit.SECONDS.toMillis(90L));
        d = new dgh("EXTRA_LONG", 1, TimeUnit.SECONDS.toMillis(30L));
        b = new dgh("LONG", 2, TimeUnit.SECONDS.toMillis(5L));
        e = new dgh("SHORT", 3, TimeUnit.SECONDS.toMillis(1L));
        f = (new dgh[] {
            a, d, b, e
        });
    }
}
