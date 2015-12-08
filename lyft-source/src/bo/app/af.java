// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;


public final class af extends Enum
{

    public static final af a;
    public static final af b;
    private static final af d[];
    public final String c;

    private af(String s, int i, String s1)
    {
        super(s, i);
        c = s1;
    }

    public static af valueOf(String s)
    {
        return (af)Enum.valueOf(bo/app/af, s);
    }

    public static af[] values()
    {
        return (af[])d.clone();
    }

    static 
    {
        a = new af("SHORT", 0, "yyyy-MM-dd");
        b = new af("LONG", 1, "yyyy-MM-dd kk:mm:ss");
        d = (new af[] {
            a, b
        });
    }
}
