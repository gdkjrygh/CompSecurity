// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class osh extends Enum
{

    public static final osh a;
    public static final osh b;
    private static final osh d[];
    final int c;

    private osh(String s, int i, int j)
    {
        super(s, i);
        c = j;
    }

    public static osh valueOf(String s)
    {
        return (osh)Enum.valueOf(osh, s);
    }

    public static osh[] values()
    {
        return (osh[])d.clone();
    }

    static 
    {
        a = new osh("LEFT", 0, 0);
        b = new osh("RIGHT", 1, 1);
        d = (new osh[] {
            a, b
        });
    }
}
