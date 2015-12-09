// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bh;


public final class x extends Enum
{

    public static final x a;
    public static final x b;
    private static final x c[];

    private x(String s, int i)
    {
        super(s, i);
    }

    public static x valueOf(String s)
    {
        return (x)Enum.valueOf(p/bh/x, s);
    }

    public static x[] values()
    {
        return (x[])c.clone();
    }

    static 
    {
        a = new x("SYNC_INTERFACE_AVAILABLE", 0);
        b = new x("SYNC_INTERFACE_UNAVAILABLE", 1);
        c = (new x[] {
            a, b
        });
    }
}
