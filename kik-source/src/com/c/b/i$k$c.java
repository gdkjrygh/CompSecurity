// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;


// Referenced classes of package com.c.b:
//            bl, i, t

public static final class v extends Enum
    implements bl
{

    public static final r a;
    public static final r b;
    public static final r c;
    public static final r d;
    public static final r e;
    public static final r f;
    public static final r g;
    public static final r h;
    public static final r i;
    public static final r j;
    public static final r k;
    public static final r l;
    public static final r m;
    public static final r n;
    public static final r o;
    public static final r p;
    public static final r q;
    public static final r r;
    private static r s = new t();
    private static final t> t[] = values();
    private static final values w[];
    private final int u;
    private final int v;

    public static  a(int i1)
    {
        switch (i1)
        {
        default:
            return null;

        case 1: // '\001'
            return a;

        case 2: // '\002'
            return b;

        case 3: // '\003'
            return c;

        case 4: // '\004'
            return d;

        case 5: // '\005'
            return e;

        case 6: // '\006'
            return f;

        case 7: // '\007'
            return g;

        case 8: // '\b'
            return h;

        case 9: // '\t'
            return i;

        case 10: // '\n'
            return j;

        case 11: // '\013'
            return k;

        case 12: // '\f'
            return l;

        case 13: // '\r'
            return m;

        case 14: // '\016'
            return n;

        case 15: // '\017'
            return o;

        case 16: // '\020'
            return p;

        case 17: // '\021'
            return q;

        case 18: // '\022'
            return r;
        }
    }

    public static ng valueOf(String s1)
    {
        return (ng)Enum.valueOf(com/c/b/i$k$c, s1);
    }

    public static ng[] values()
    {
        return (ng[])w.clone();
    }

    public final int a()
    {
        return v;
    }

    static 
    {
        a = new <init>("TYPE_DOUBLE", 0, 0, 1);
        b = new <init>("TYPE_FLOAT", 1, 1, 2);
        c = new <init>("TYPE_INT64", 2, 2, 3);
        d = new <init>("TYPE_UINT64", 3, 3, 4);
        e = new <init>("TYPE_INT32", 4, 4, 5);
        f = new <init>("TYPE_FIXED64", 5, 5, 6);
        g = new <init>("TYPE_FIXED32", 6, 6, 7);
        h = new <init>("TYPE_BOOL", 7, 7, 8);
        i = new <init>("TYPE_STRING", 8, 8, 9);
        j = new <init>("TYPE_GROUP", 9, 9, 10);
        k = new <init>("TYPE_MESSAGE", 10, 10, 11);
        l = new <init>("TYPE_BYTES", 11, 11, 12);
        m = new <init>("TYPE_UINT32", 12, 12, 13);
        n = new <init>("TYPE_ENUM", 13, 13, 14);
        o = new <init>("TYPE_SFIXED32", 14, 14, 15);
        p = new <init>("TYPE_SFIXED64", 15, 15, 16);
        q = new <init>("TYPE_SINT32", 16, 16, 17);
        r = new <init>("TYPE_SINT64", 17, 17, 18);
        w = (new w[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m, n, o, p, q, r
        });
    }

    private ng(String s1, int i1, int j1, int k1)
    {
        super(s1, i1);
        u = j1;
        v = k1;
    }
}
