// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.n.a.k;


// Referenced classes of package com.kik.n.a.k:
//            a

public static final class w extends Enum
{

    public static final v a;
    public static final v b;
    public static final v c;
    public static final v d;
    public static final v e;
    public static final v f;
    public static final v g;
    public static final v h;
    public static final v i;
    public static final v j;
    public static final v k;
    public static final v l;
    public static final v m;
    public static final v n;
    public static final v o;
    public static final v p;
    public static final v q;
    public static final v r;
    public static final v s;
    public static final v t;
    public static final v u;
    public static final v v;
    private static final v x[];
    public final int w;

    public static w a(int i1)
    {
        switch (i1)
        {
        default:
            return null;

        case 0: // '\0'
            return a;

        case 1: // '\001'
            return b;

        case 2: // '\002'
            return c;

        case 3: // '\003'
            return d;

        case 4: // '\004'
            return e;

        case 5: // '\005'
            return f;

        case 6: // '\006'
            return g;

        case 7: // '\007'
            return h;

        case 8: // '\b'
            return i;

        case 9: // '\t'
            return j;

        case 10: // '\n'
            return k;

        case 11: // '\013'
            return l;

        case 12: // '\f'
            return m;

        case 13: // '\r'
            return n;

        case 14: // '\016'
            return o;

        case 15: // '\017'
            return p;

        case 16: // '\020'
            return q;

        case 17: // '\021'
            return r;

        case 18: // '\022'
            return s;

        case 19: // '\023'
            return t;

        case 20: // '\024'
            return u;

        case 21: // '\025'
            return v;
        }
    }

    public static v valueOf(String s1)
    {
        return (v)Enum.valueOf(com/kik/n/a/k/a$a, s1);
    }

    public static ueOf[] values()
    {
        return (ueOf[])x.clone();
    }

    static 
    {
        a = new <init>("COLOR_BRIGHT_RED", 0, 0);
        b = new <init>("COLOR_BRIGHT_PINK", 1, 1);
        c = new <init>("COLOR_BRIGHT_MAGENTA", 2, 2);
        d = new <init>("COLOR_BRIGHT_VIOLET", 3, 3);
        e = new <init>("COLOR_BRIGHT_BLUE", 4, 4);
        f = new <init>("COLOR_BRIGHT_GREEN", 5, 5);
        g = new <init>("COLOR_BRIGHT_KIK_GREEN", 6, 6);
        h = new <init>("COLOR_BRIGHT_YELLOW", 7, 7);
        i = new <init>("COLOR_BRIGHT_ORANGE", 8, 8);
        j = new <init>("COLOR_BRIGHT_BROWN", 9, 9);
        k = new <init>("COLOR_BRIGHT_GREY", 10, 10);
        l = new <init>("COLOR_LIGHT_RED", 11, 11);
        m = new <init>("COLOR_LIGHT_PINK", 12, 12);
        n = new <init>("COLOR_LIGHT_MAGENTA", 13, 13);
        o = new <init>("COLOR_LIGHT_VIOLET", 14, 14);
        p = new <init>("COLOR_LIGHT_BLUE", 15, 15);
        q = new <init>("COLOR_LIGHT_AQUA", 16, 16);
        r = new <init>("COLOR_LIGHT_KIK_GREEN", 17, 17);
        s = new <init>("COLOR_LIGHT_YELLOW", 18, 18);
        t = new <init>("COLOR_LIGHT_ORANGE", 19, 19);
        u = new <init>("COLOR_LIGHT_BROWN", 20, 20);
        v = new <init>("COLOR_LIGHT_GREY", 21, 21);
        x = (new x[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m, n, o, p, q, r, s, t, 
            u, v
        });
    }

    private (String s1, int i1, int j1)
    {
        super(s1, i1);
        w = j1;
    }
}
