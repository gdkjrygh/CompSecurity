// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public static final class ang.String extends Enum
{

    public static final f a;
    public static final f b;
    public static final f c;
    public static final f d;
    public static final f e;
    public static final f f;
    private static final f g[];

    public static ang.String valueOf(String s)
    {
        return (f)Enum.valueOf(abT$a, s);
    }

    public static ang.String[] values()
    {
        return ([])g.clone();
    }

    static 
    {
        a = new <init>("START", 0);
        b = new <init>("END_SIMPLY", 1);
        c = new <init>("END_REPLACED", 2);
        d = new <init>("END_MOVED", 3);
        e = new <init>("END_CLOBBERED_BY_PREV", 4);
        f = new <init>("END_CLOBBERED_BY_NEXT", 5);
        g = (new g[] {
            a, b, c, d, e, f
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
