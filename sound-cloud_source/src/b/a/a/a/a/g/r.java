// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a.a.a.a.g;


public final class r extends Enum
{

    public static final r a;
    public static final r b;
    public static final r c;
    private static final r d[];

    private r(String s, int i)
    {
        super(s, i);
    }

    public static r valueOf(String s)
    {
        return (r)Enum.valueOf(b/a/a/a/a/g/r, s);
    }

    public static r[] values()
    {
        return (r[])d.clone();
    }

    static 
    {
        a = new r("USE_CACHE", 0);
        b = new r("SKIP_CACHE_LOOKUP", 1);
        c = new r("IGNORE_CACHE_EXPIRATION", 2);
        d = (new r[] {
            a, b, c
        });
    }
}
