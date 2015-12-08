// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


public final class cx extends Enum
{

    public static final cx a;
    public static final cx b;
    private static final cx c[];

    private cx(String s, int i)
    {
        super(s, i);
    }

    public static cx valueOf(String s)
    {
        return (cx)Enum.valueOf(b/a/cx, s);
    }

    public static cx[] values()
    {
        return (cx[])c.clone();
    }

    static 
    {
        a = new cx("NORMAL", 0);
        b = new cx("URGENT", 1);
        c = (new cx[] {
            a, b
        });
    }
}
