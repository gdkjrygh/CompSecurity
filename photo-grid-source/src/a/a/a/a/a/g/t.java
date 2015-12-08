// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a.a.a.a.g;


public final class t extends Enum
{

    public static final t a;
    public static final t b;
    public static final t c;
    private static final t d[];

    private t(String s, int i)
    {
        super(s, i);
    }

    public static t valueOf(String s)
    {
        return (t)Enum.valueOf(a/a/a/a/a/g/t, s);
    }

    public static t[] values()
    {
        return (t[])d.clone();
    }

    static 
    {
        a = new t("USE_CACHE", 0);
        b = new t("SKIP_CACHE_LOOKUP", 1);
        c = new t("IGNORE_CACHE_EXPIRATION", 2);
        d = (new t[] {
            a, b, c
        });
    }
}
