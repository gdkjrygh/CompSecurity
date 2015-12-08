// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class nqk extends Enum
{

    public static final nqk a;
    public static final nqk b;
    private static final nqk c[];

    private nqk(String s, int i, int j)
    {
        super(s, i);
    }

    public static nqk valueOf(String s)
    {
        return (nqk)Enum.valueOf(nqk, s);
    }

    public static nqk[] values()
    {
        return (nqk[])c.clone();
    }

    static 
    {
        a = new nqk("IMPORTANT", 0, 0);
        b = new nqk("LOW", 1, 1);
        c = (new nqk[] {
            a, b
        });
        ntn.a(nqk);
    }
}
