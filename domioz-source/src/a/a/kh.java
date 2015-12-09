// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;


public final class kh extends Enum
{

    public static final kh a;
    public static final kh b;
    private static final kh c[];

    private kh(String s, int i)
    {
        super(s, i);
    }

    public static kh valueOf(String s)
    {
        return (kh)Enum.valueOf(a/a/kh, s);
    }

    public static kh[] values()
    {
        return (kh[])c.clone();
    }

    static 
    {
        a = new kh("SMALL", 0);
        b = new kh("LARGE", 1);
        c = (new kh[] {
            a, b
        });
    }
}
