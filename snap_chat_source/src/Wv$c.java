// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public static final class lang.String extends Enum
{

    public static final f a;
    public static final f b;
    public static final f c;
    public static final f d;
    public static final f e;
    public static final f f;
    private static final f g[];

    public static lang.String valueOf(String s)
    {
        return (Of)Enum.valueOf(Wv$c, s);
    }

    public static lang.String[] values()
    {
        return (s[])g.clone();
    }

    static 
    {
        a = new <init>("INVALID", 0);
        b = new <init>("CONFIG_ERROR", 1);
        c = new <init>("RUNNING", 2);
        d = new <init>("ABORTED", 3);
        e = new <init>("FAILED", 4);
        f = new <init>("FINISHED", 5);
        g = (new g[] {
            a, b, c, d, e, f
        });
    }

    private >(String s, int i)
    {
        super(s, i);
    }
}
