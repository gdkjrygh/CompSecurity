// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


public final class kv extends Enum
{

    public static final kv a;
    public static final kv b;
    public static final kv c;
    public static final kv d;
    public static final kv e;
    public static final kv f;
    public static final kv g;
    public static final kv h;
    public static final kv i;
    public static final kv j;
    private static final kv k[];

    private kv(String s, int l)
    {
        super(s, l);
    }

    public static kv valueOf(String s)
    {
        return (kv)Enum.valueOf(b/a/kv, s);
    }

    public static kv[] values()
    {
        return (kv[])k.clone();
    }

    static 
    {
        a = new kv("UNKNOWN", 0);
        b = new kv("NONE", 1);
        c = new kv("VARIES", 2);
        d = new kv("TYPE_REF", 3);
        e = new kv("STRING_REF", 4);
        f = new kv("METHOD_REF", 5);
        g = new kv("FIELD_REF", 6);
        h = new kv("INLINE_METHOD", 7);
        i = new kv("VTABLE_OFFSET", 8);
        j = new kv("FIELD_OFFSET", 9);
        k = (new kv[] {
            a, b, c, d, e, f, g, h, i, j
        });
    }
}
