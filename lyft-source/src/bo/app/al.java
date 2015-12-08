// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;


public final class al extends Enum
{

    public static final al a;
    public static final al b;
    private static final al c[];

    private al(String s, int i)
    {
        super(s, i);
    }

    public static al valueOf(String s)
    {
        return (al)Enum.valueOf(bo/app/al, s);
    }

    public static al[] values()
    {
        return (al[])c.clone();
    }

    static 
    {
        a = new al("GET", 0);
        b = new al("POST", 1);
        c = (new al[] {
            a, b
        });
    }
}
