// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class cck extends Enum
{

    public static final cck a;
    public static final cck b;
    public static final cck c;
    public static final cck d;
    public static final cck e;
    private static final cck f[];

    private cck(String s, int i)
    {
        super(s, i);
    }

    public static cck valueOf(String s)
    {
        return (cck)Enum.valueOf(cck, s);
    }

    public static cck[] values()
    {
        return (cck[])f.clone();
    }

    static 
    {
        a = new cck("TOP_TO_BOTTOM", 0);
        b = new cck("BOTTOM_TO_TOP", 1);
        c = new cck("LEFT_TO_RIGHT", 2);
        d = new cck("RIGHT_TO_LEFT", 3);
        e = new cck("RANDOM_PER_CLIP", 4);
        f = (new cck[] {
            a, b, c, d, e
        });
    }
}
