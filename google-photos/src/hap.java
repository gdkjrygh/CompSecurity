// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hap extends Enum
{

    public static final hap a;
    public static final hap b;
    public static final hap c;
    public static final hap d;
    private static final hap e[];

    private hap(String s, int i)
    {
        super(s, i);
    }

    public static hap valueOf(String s)
    {
        return (hap)Enum.valueOf(hap, s);
    }

    public static hap[] values()
    {
        return (hap[])e.clone();
    }

    static 
    {
        a = new hap("LAYOUT_LINEAR", 0);
        b = new hap("LAYOUT_GRID", 1);
        c = new hap("LAYOUT_COZY", 2);
        d = new hap("LAYOUT_SMART_ALBUM", 3);
        e = (new hap[] {
            a, b, c, d
        });
    }
}
