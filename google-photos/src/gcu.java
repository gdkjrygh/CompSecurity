// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class gcu extends Enum
{

    public static final gcu a;
    public static final gcu b;
    public static final gcu c;
    private static final gcu d[];

    private gcu(String s, int i)
    {
        super(s, i);
    }

    public static gcu valueOf(String s)
    {
        return (gcu)Enum.valueOf(gcu, s);
    }

    public static gcu[] values()
    {
        return (gcu[])d.clone();
    }

    static 
    {
        a = new gcu("COMPLETE", 0);
        b = new gcu("LIMIT", 1);
        c = new gcu("CANCELLED", 2);
        d = (new gcu[] {
            a, b, c
        });
    }
}
