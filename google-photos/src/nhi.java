// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class nhi extends Enum
    implements qwc
{

    private static nhi a;
    private static final nhi b[];

    private nhi(String s, int i)
    {
        super(s, 0);
    }

    public static qwc b()
    {
        return a;
    }

    public static nhi valueOf(String s)
    {
        return (nhi)Enum.valueOf(nhi, s);
    }

    public static nhi[] values()
    {
        return (nhi[])b.clone();
    }

    public final Object a()
    {
        return new nhw();
    }

    static 
    {
        a = new nhi("INSTANCE", 0);
        b = (new nhi[] {
            a
        });
    }
}
