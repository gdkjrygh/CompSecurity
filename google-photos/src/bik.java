// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class bik extends Enum
{

    public static final bik a;
    public static final bik b;
    public static final bik c;
    public static final bik d;
    public static final bik e;
    private static final bik g[];
    public final Class f;

    private bik(String s, int i, Class class1)
    {
        super(s, i);
        f = class1;
    }

    public static bik valueOf(String s)
    {
        return (bik)Enum.valueOf(bik, s);
    }

    public static bik[] values()
    {
        return (bik[])g.clone();
    }

    static 
    {
        a = new bik("OPAQUE", 0, java/lang/Object);
        b = new bik("FLOAT_MATRIX", 1, cob);
        c = new bik("STABILIZATION", 2, null);
        d = new bik("COLOR_CORRECT", 3, cea);
        e = new bik("INTEGER", 4, Integer.TYPE);
        g = (new bik[] {
            a, b, c, d, e
        });
    }
}
