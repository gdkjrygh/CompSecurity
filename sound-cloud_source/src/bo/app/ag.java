// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;


public final class ag extends Enum
{

    public static final ag a;
    public static final ag b;
    private static final ag c[];

    private ag(String s, int i)
    {
        super(s, i);
    }

    public static ag valueOf(String s)
    {
        return (ag)Enum.valueOf(bo/app/ag, s);
    }

    public static ag[] values()
    {
        return (ag[])c.clone();
    }

    static 
    {
        a = new ag("GET", 0);
        b = new ag("POST", 1);
        c = (new ag[] {
            a, b
        });
    }
}
