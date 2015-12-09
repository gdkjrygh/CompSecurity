// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.g.a;


// Referenced classes of package com.google.b.g.a:
//            s

public final class q extends Enum
{

    public static final q a;
    public static final q b;
    public static final q c;
    public static final q d;
    public static final q e;
    public static final q f;
    public static final q g;
    public static final q h;
    public static final q i;
    public static final q j;
    private static final q m[];
    private final int k[];
    private final int l;

    private q(String s1, int i1, int ai[], int j1)
    {
        super(s1, i1);
        k = ai;
        l = j1;
    }

    public static q a(int i1)
    {
        switch (i1)
        {
        case 6: // '\006'
        case 10: // '\n'
        case 11: // '\013'
        case 12: // '\f'
        default:
            throw new IllegalArgumentException();

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
            return h;

        case 7: // '\007'
            return f;

        case 8: // '\b'
            return g;

        case 9: // '\t'
            return i;

        case 13: // '\r'
            return j;
        }
    }

    public static q valueOf(String s1)
    {
        return (q)Enum.valueOf(com/google/b/g/a/q, s1);
    }

    public static q[] values()
    {
        return (q[])m.clone();
    }

    public int a()
    {
        return l;
    }

    public int a(s s1)
    {
        int i1 = s1.a();
        if (i1 <= 9)
        {
            i1 = 0;
        } else
        if (i1 <= 26)
        {
            i1 = 1;
        } else
        {
            i1 = 2;
        }
        return k[i1];
    }

    static 
    {
        a = new q("TERMINATOR", 0, new int[] {
            0, 0, 0
        }, 0);
        b = new q("NUMERIC", 1, new int[] {
            10, 12, 14
        }, 1);
        c = new q("ALPHANUMERIC", 2, new int[] {
            9, 11, 13
        }, 2);
        d = new q("STRUCTURED_APPEND", 3, new int[] {
            0, 0, 0
        }, 3);
        e = new q("BYTE", 4, new int[] {
            8, 16, 16
        }, 4);
        f = new q("ECI", 5, new int[] {
            0, 0, 0
        }, 7);
        g = new q("KANJI", 6, new int[] {
            8, 10, 12
        }, 8);
        h = new q("FNC1_FIRST_POSITION", 7, new int[] {
            0, 0, 0
        }, 5);
        i = new q("FNC1_SECOND_POSITION", 8, new int[] {
            0, 0, 0
        }, 9);
        j = new q("HANZI", 9, new int[] {
            8, 10, 12
        }, 13);
        m = (new q[] {
            a, b, c, d, e, f, g, h, i, j
        });
    }
}
