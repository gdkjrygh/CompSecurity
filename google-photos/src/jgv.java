// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jgv extends Enum
{

    public static final jgv a;
    public static final jgv b;
    private static final jgv c[];

    private jgv(String s, int i)
    {
        super(s, i);
    }

    public static jgv valueOf(String s)
    {
        return (jgv)Enum.valueOf(jgv, s);
    }

    public static jgv[] values()
    {
        return (jgv[])c.clone();
    }

    static 
    {
        a = new jgv("START", 0);
        b = new jgv("END", 1);
        c = (new jgv[] {
            a, b
        });
    }
}
