// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class mxj extends Enum
{

    public static final mxj a;
    public static final mxj b;
    public static final mxj c;
    private static final mxj d[];

    private mxj(String s, int i)
    {
        super(s, i);
    }

    public static mxj valueOf(String s)
    {
        return (mxj)Enum.valueOf(mxj, s);
    }

    public static mxj[] values()
    {
        return (mxj[])d.clone();
    }

    static 
    {
        a = new mxj("LOADING", 0);
        b = new mxj("LOADED", 1);
        c = new mxj("EMPTY", 2);
        d = (new mxj[] {
            a, b, c
        });
    }
}
