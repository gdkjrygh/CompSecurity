// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;


public final class k extends Enum
{

    public static final k a;
    public static final k b;
    private static final k c[];

    private k(String s, int i)
    {
        super(s, i);
    }

    public static k valueOf(String s)
    {
        return (k)Enum.valueOf(a/a/k, s);
    }

    public static k[] values()
    {
        return (k[])c.clone();
    }

    static 
    {
        a = new k("GET", 0);
        b = new k("POST", 1);
        c = (new k[] {
            a, b
        });
    }
}
