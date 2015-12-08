// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class dux extends Enum
{

    public static final dux a;
    public static final dux b;
    private static final dux c[];

    private dux(String s, int i)
    {
        super(s, i);
    }

    public static dux valueOf(String s)
    {
        return (dux)Enum.valueOf(dux, s);
    }

    public static dux[] values()
    {
        return (dux[])c.clone();
    }

    static 
    {
        a = new dux("ACCOUNT", 0);
        b = new dux("SHARED", 1);
        c = (new dux[] {
            a, b
        });
    }
}
