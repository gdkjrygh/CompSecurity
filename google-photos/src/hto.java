// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hto extends Enum
{

    public static final hto a;
    public static final hto b;
    public static final hto c;
    private static final hto d[];

    private hto(String s, int i)
    {
        super(s, i);
    }

    public static hto valueOf(String s)
    {
        return (hto)Enum.valueOf(hto, s);
    }

    public static hto[] values()
    {
        return (hto[])d.clone();
    }

    static 
    {
        a = new hto("UNKNOWN", 0);
        b = new hto("SEEN", 1);
        c = new hto("SHOW", 2);
        d = (new hto[] {
            a, b, c
        });
    }
}
