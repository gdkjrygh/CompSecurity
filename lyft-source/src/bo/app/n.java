// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;


public final class n extends Enum
{

    public static final n a;
    public static final n b;
    private static final n c[];

    private n(String s, int i)
    {
        super(s, i);
    }

    public static n valueOf(String s)
    {
        return (n)Enum.valueOf(bo/app/n, s);
    }

    public static n[] values()
    {
        return (n[])c.clone();
    }

    static 
    {
        a = new n("SMALL", 0);
        b = new n("LARGE", 1);
        c = (new n[] {
            a, b
        });
    }
}
