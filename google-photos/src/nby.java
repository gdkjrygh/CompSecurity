// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class nby extends Enum
{

    public static final nby a;
    public static final nby b;
    private static final nby c[];

    private nby(String s, int i)
    {
        super(s, i);
    }

    public static nby valueOf(String s)
    {
        return (nby)Enum.valueOf(nby, s);
    }

    public static nby[] values()
    {
        return (nby[])c.clone();
    }

    static 
    {
        a = new nby("EXACT", 0);
        b = new nby("APPROXIMATE", 1);
        c = (new nby[] {
            a, b
        });
    }
}
