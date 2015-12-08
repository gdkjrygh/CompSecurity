// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.EnumSet;

public final class gcp extends Enum
{

    public static final gcp a;
    public static final gcp b;
    public static final gcp c;
    public static final gcp d;
    private static final EnumSet e;
    private static final gcp f[];

    private gcp(String s, int i)
    {
        super(s, i);
    }

    public static boolean a(gcp gcp1)
    {
        return e.contains(gcp1);
    }

    public static gcp valueOf(String s)
    {
        return (gcp)Enum.valueOf(gcp, s);
    }

    public static gcp[] values()
    {
        return (gcp[])f.clone();
    }

    static 
    {
        a = new gcp("UNKNOWN", 0);
        b = new gcp("NOT_BOOTSTRAPPED", 1);
        c = new gcp("BOOTSTRAPPED", 2);
        d = new gcp("COMPLETE", 3);
        f = (new gcp[] {
            a, b, c, d
        });
        e = EnumSet.of(c, d);
    }
}
