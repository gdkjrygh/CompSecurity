// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bh;


public final class z extends Enum
{

    public static final z a;
    public static final z b;
    public static final z c;
    private static final z d[];

    private z(String s, int i)
    {
        super(s, i);
    }

    public static z valueOf(String s)
    {
        return (z)Enum.valueOf(p/bh/z, s);
    }

    public static z[] values()
    {
        return (z[])d.clone();
    }

    static 
    {
        a = new z("LEFT_ALIGNED", 0);
        b = new z("RIGHT_ALIGNED", 1);
        c = new z("CENTERED", 2);
        d = (new z[] {
            a, b, c
        });
    }
}
