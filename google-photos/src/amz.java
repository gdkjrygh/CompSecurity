// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class amz extends Enum
{

    public static final amz a;
    public static final amz b;
    public static final amz c;
    public static final amz d;
    public static final amz e;
    private static final amz f[];

    private amz(String s, int i)
    {
        super(s, i);
    }

    public static amz valueOf(String s)
    {
        return (amz)Enum.valueOf(amz, s);
    }

    public static amz[] values()
    {
        return (amz[])f.clone();
    }

    static 
    {
        a = new amz("LOCAL", 0);
        b = new amz("REMOTE", 1);
        c = new amz("DATA_DISK_CACHE", 2);
        d = new amz("RESOURCE_DISK_CACHE", 3);
        e = new amz("MEMORY_CACHE", 4);
        f = (new amz[] {
            a, b, c, d, e
        });
    }
}
