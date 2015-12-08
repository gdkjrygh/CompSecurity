// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class gvl extends Enum
{

    public static final gvl a;
    public static final gvl b;
    private static final gvl c[];

    private gvl(String s, int i)
    {
        super(s, i);
    }

    public static gvl valueOf(String s)
    {
        return (gvl)Enum.valueOf(gvl, s);
    }

    public static gvl[] values()
    {
        return (gvl[])c.clone();
    }

    static 
    {
        a = new gvl("COPY", 0);
        b = new gvl("IN_PLACE", 1);
        c = (new gvl[] {
            a, b
        });
    }
}
