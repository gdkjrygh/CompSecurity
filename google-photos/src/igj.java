// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class igj extends Enum
{

    public static final igj a;
    public static final igj b;
    public static final igj c;
    public static final igj d;
    public static final igj e;
    private static final igj f[];

    private igj(String s, int i)
    {
        super(s, i);
    }

    public static igj valueOf(String s)
    {
        return (igj)Enum.valueOf(igj, s);
    }

    public static igj[] values()
    {
        return (igj[])f.clone();
    }

    static 
    {
        a = new igj("SMALL", 0);
        b = new igj("LARGE", 1);
        c = new igj("ACTUAL", 2);
        d = new igj("LINK", 3);
        e = new igj("ANIMATION_AS_MP4", 4);
        f = (new igj[] {
            a, b, c, d, e
        });
    }
}
