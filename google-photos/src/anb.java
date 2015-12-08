// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class anb extends Enum
{

    public static final anb a;
    public static final anb b;
    public static final anb c;
    private static final anb d[];

    private anb(String s, int i)
    {
        super(s, i);
    }

    public static anb valueOf(String s)
    {
        return (anb)Enum.valueOf(anb, s);
    }

    public static anb[] values()
    {
        return (anb[])d.clone();
    }

    static 
    {
        a = new anb("SOURCE", 0);
        b = new anb("TRANSFORMED", 1);
        c = new anb("NONE", 2);
        d = (new anb[] {
            a, b, c
        });
    }
}
