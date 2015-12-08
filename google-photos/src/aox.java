// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class aox extends Enum
{

    public static final aox a;
    public static final aox b;
    public static final aox c;
    public static final aox d;
    public static final aox e;
    public static final aox f;
    private static final aox g[];

    private aox(String s, int i)
    {
        super(s, i);
    }

    public static aox valueOf(String s)
    {
        return (aox)Enum.valueOf(aox, s);
    }

    public static aox[] values()
    {
        return (aox[])g.clone();
    }

    static 
    {
        a = new aox("INITIALIZE", 0);
        b = new aox("RESOURCE_CACHE", 1);
        c = new aox("DATA_CACHE", 2);
        d = new aox("SOURCE", 3);
        e = new aox("ENCODE", 4);
        f = new aox("FINISHED", 5);
        g = (new aox[] {
            a, b, c, d, e, f
        });
    }
}
