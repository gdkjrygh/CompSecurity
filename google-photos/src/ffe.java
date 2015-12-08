// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.TimeUnit;

public final class ffe extends Enum
{

    public static final ffe a;
    private static final ffe d[];
    public final int b = 1;
    public final long c;

    private ffe(String s, int i, int j, long l)
    {
        super(s, 0);
        c = l - 0xdbba0L;
    }

    public static ffe valueOf(String s)
    {
        return (ffe)Enum.valueOf(ffe, s);
    }

    public static ffe[] values()
    {
        return (ffe[])d.clone();
    }

    static 
    {
        a = new ffe("MEDIA", 0, 1, TimeUnit.HOURS.toMillis(14L));
        d = (new ffe[] {
            a
        });
    }
}
