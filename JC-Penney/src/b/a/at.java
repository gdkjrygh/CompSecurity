// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


public final class at extends Enum
{

    public static final at a;
    public static final at b;
    private static final at c[];

    private at(String s, int i)
    {
        super(s, i);
    }

    public static at valueOf(String s)
    {
        return (at)Enum.valueOf(b/a/at, s);
    }

    public static at[] values()
    {
        return (at[])c.clone();
    }

    static 
    {
        a = new at("ACTIVATED", 0);
        b = new at("DEACTIVATED", 1);
        c = (new at[] {
            a, b
        });
    }
}
