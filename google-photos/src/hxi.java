// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hxi extends Enum
{

    public static final hxi a;
    public static final hxi b;
    public static final hxi c;
    private static final hxi d[];

    private hxi(String s, int i)
    {
        super(s, i);
    }

    public static hxi valueOf(String s)
    {
        return (hxi)Enum.valueOf(hxi, s);
    }

    public static hxi[] values()
    {
        return (hxi[])d.clone();
    }

    static 
    {
        a = new hxi("HIDE_ONLY", 0);
        b = new hxi("HIDE_SHOW", 1);
        c = new hxi("INACTIVE", 2);
        d = (new hxi[] {
            a, b, c
        });
    }
}
