// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class aot extends Enum
{

    public static final aot a;
    public static final aot b;
    public static final aot c;
    public static final aot d;
    public static final aot e;
    private static final aot h[];
    final long f;
    private final String g;

    private aot(String s, int i, String s1, long l)
    {
        super(s, i);
        g = s1;
        f = l;
    }

    static String a(int i)
    {
        return values()[i].g;
    }

    public static aot valueOf(String s)
    {
        return (aot)Enum.valueOf(aot, s);
    }

    public static aot[] values()
    {
        return (aot[])h.clone();
    }

    final anO.b a(String s)
    {
        return new anO.b(ordinal(), s);
    }

    static 
    {
        a = new aot("BILLING_SUPPORTED", 0, "supported", 0x5265c00L);
        b = new aot("GET_PURCHASES", 1, "purchases", 0x124f80L);
        c = new aot("GET_SKU_DETAILS", 2, "skus", 0x5265c00L);
        d = new aot("PURCHASE", 3, "purchase", 0L);
        e = new aot("CONSUME_PURCHASE", 4, "consume", 0L);
        h = (new aot[] {
            a, b, c, d, e
        });
    }
}
