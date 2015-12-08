// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;


public final class jj extends Enum
{

    public static final jj a;
    public static final jj b;
    public static final jj c;
    private static final jj d[];

    private jj(String s, int i)
    {
        super(s, i);
    }

    public static jj valueOf(String s)
    {
        return (jj)Enum.valueOf(bo/app/jj, s);
    }

    public static jj[] values()
    {
        return (jj[])d.clone();
    }

    static 
    {
        a = new jj("NETWORK", 0);
        b = new jj("DISC_CACHE", 1);
        c = new jj("MEMORY_CACHE", 2);
        d = (new jj[] {
            a, b, c
        });
    }
}
