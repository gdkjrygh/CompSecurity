// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a.a.a;

import java.io.Reader;

// Referenced classes of package b.a.a.a:
//            d, b

final class c
{

    private static final int a[];
    private static final char b[];
    private static final int c[];
    private static final int d[];
    private static final int e[];
    private static final String f[];
    private static final int g[];
    private Reader h;
    private int i;
    private int j;
    private char k[];
    private int l;
    private int m;
    private int n;
    private int o;
    private int p;
    private int q;
    private int r;
    private boolean s;
    private boolean t;
    private StringBuffer u;

    c()
    {
        j = 0;
        k = new char[16384];
        s = true;
        u = new StringBuffer();
        h = null;
    }

    private String c()
    {
        return new String(k, n, l - n);
    }

    final int a()
    {
        return q;
    }

    public final void a(Reader reader)
    {
        h = reader;
        s = true;
        t = false;
        n = 0;
        o = 0;
        l = 0;
        m = 0;
        r = 0;
        q = 0;
        p = 0;
        j = 0;
    }

    public final d b()
    {
        char ac[];
        char ac1[];
        int ai[];
        int ai1[];
        int ai2[];
        int j2;
        j2 = o;
        ac = k;
        ac1 = b;
        ai = e;
        ai1 = d;
        ai2 = g;
_L5:
        Object obj;
        int i1;
        int j1;
        int l1;
        j1 = l;
        q = q + (j1 - n);
        i1 = -1;
        n = j1;
        m = j1;
        i = a[j];
        l1 = j1;
        obj = ac;
_L11:
        int k1;
        int i2;
        int k2;
        ac = ((char []) (obj));
        i2 = j2;
        k1 = j1;
        k2 = l1;
        if (l1 < j2) goto _L2; else goto _L1
_L1:
        if (!t) goto _L4; else goto _L3
_L3:
        int l2;
        k2 = -1;
        l2 = i1;
        l1 = j1;
        j1 = j2;
_L6:
        char c1;
        l = l1;
        if (l2 >= 0)
        {
            l2 = c[l2];
        }
        ac = ((char []) (obj));
        j2 = j1;
        switch (l2)
        {
        default:
            int i3;
            if (k2 == -1 && n == m)
            {
                t = true;
                return null;
            }
            try
            {
                obj = f[1];
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                obj = f[0];
            }
            throw new Error(((String) (obj)));

        case 11: // '\013'
            u.append(c());
            ac = ((char []) (obj));
            j2 = j1;
            break;

        case 4: // '\004'
            u.delete(0, u.length());
            j = 2;
            ac = ((char []) (obj));
            j2 = j1;
            break;

        case 16: // '\020'
            u.append('\b');
            ac = ((char []) (obj));
            j2 = j1;
            break;

        case 6: // '\006'
            return new d(2, null);

        case 23: // '\027'
            return new d(0, Boolean.valueOf(c()));

        case 22: // '\026'
            return new d(0, null);

        case 13: // '\r'
            j = 0;
            return new d(0, u.toString());

        case 12: // '\f'
            u.append('\\');
            ac = ((char []) (obj));
            j2 = j1;
            break;

        case 21: // '\025'
            return new d(0, Double.valueOf(c()));

        case 1: // '\001'
            throw new b(q, 0, new Character(k[n + 0]));

        case 8: // '\b'
            return new d(4, null);

        case 19: // '\023'
            u.append('\r');
            ac = ((char []) (obj));
            j2 = j1;
            break;

        case 15: // '\017'
            u.append('/');
            ac = ((char []) (obj));
            j2 = j1;
            break;

        case 10: // '\n'
            return new d(6, null);

        case 14: // '\016'
            u.append('"');
            ac = ((char []) (obj));
            j2 = j1;
            break;

        case 5: // '\005'
            return new d(1, null);

        case 17: // '\021'
            u.append('\f');
            ac = ((char []) (obj));
            j2 = j1;
            break;

        case 24: // '\030'
            try
            {
                i1 = Integer.parseInt(c().substring(2), 16);
                u.append((char)i1);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw new b(q, 2, obj);
            }
            ac = ((char []) (obj));
            j2 = j1;
            break;

        case 20: // '\024'
            u.append('\t');
            ac = ((char []) (obj));
            j2 = j1;
            break;

        case 7: // '\007'
            return new d(3, null);

        case 2: // '\002'
            return new d(0, Long.valueOf(c()));

        case 18: // '\022'
            u.append('\n');
            ac = ((char []) (obj));
            j2 = j1;
            break;

        case 9: // '\t'
            return new d(5, null);

        case 3: // '\003'
        case 25: // '\031'
        case 26: // '\032'
        case 27: // '\033'
        case 28: // '\034'
        case 29: // '\035'
        case 30: // '\036'
        case 31: // '\037'
        case 32: // ' '
        case 33: // '!'
        case 34: // '"'
        case 35: // '#'
        case 36: // '$'
        case 37: // '%'
        case 38: // '&'
        case 39: // '\''
        case 40: // '('
        case 41: // ')'
        case 42: // '*'
        case 43: // '+'
        case 44: // ','
        case 45: // '-'
        case 46: // '.'
        case 47: // '/'
        case 48: // '0'
            break;
        }
          goto _L5
_L4:
        m = l1;
        l = j1;
        if (n > 0)
        {
            System.arraycopy(k, n, k, 0, o - n);
            o = o - n;
            m = m - n;
            l = l - n;
            n = 0;
        }
        if (m >= k.length)
        {
            obj = new char[m * 2];
            System.arraycopy(k, 0, obj, 0, k.length);
            k = ((char []) (obj));
        }
        j1 = h.read(k, o, k.length - o);
        if (j1 > 0)
        {
            o = j1 + o;
            j1 = 0;
        } else
        {
label0:
            {
                if (j1 != 0)
                {
                    break label0;
                }
                j1 = h.read();
                if (j1 == -1)
                {
                    break label0;
                }
                obj = k;
                k1 = o;
                o = k1 + 1;
                obj[k1] = (char)j1;
                j1 = 0;
            }
        }
_L7:
        k2 = m;
        k1 = l;
        obj = k;
        i2 = o;
        if (j1 == 0)
        {
            break MISSING_BLOCK_LABEL_655;
        }
        j1 = i2;
        k2 = -1;
        l1 = k1;
        l2 = i1;
          goto _L6
        j1 = 1;
          goto _L7
        ac = ((char []) (obj));
_L2:
        j2 = k2 + 1;
        c1 = ac[k2];
        i3 = ai[ai1[i] + ac1[c1]];
        obj = ac;
        j1 = i2;
        l1 = k1;
        k2 = c1;
        l2 = i1;
        if (i3 == -1) goto _L6; else goto _L8
_L8:
        i = i3;
        j1 = ai2[i];
        if ((j1 & 1) != 1)
        {
            break MISSING_BLOCK_LABEL_1247;
        }
        l2 = i;
        if ((j1 & 8) == 8) goto _L10; else goto _L9
_L9:
        i1 = l2;
        j1 = j2;
_L12:
        l1 = j2;
        obj = ac;
        j2 = i2;
          goto _L11
_L10:
        l1 = j2;
        obj = ac;
        j1 = i2;
        k2 = c1;
          goto _L6
        j1 = k1;
          goto _L12
    }

    static 
    {
        int ai[];
        int i1;
        int j1;
        int l1;
        l1 = 0;
        a = (new int[] {
            0, 0, 1, 1
        });
        ai = new char[0x10000];
        i1 = 0;
        j1 = 0;
_L2:
        char c1;
        int i2;
        if (j1 >= 90)
        {
            break; /* Loop/switch isn't completed */
        }
        i2 = j1 + 1;
        char c2 = "\t\000\001\007\001\007\002\000\001\007\022\000\001\007\001\000\001\t\b\000\001\006\001\031\001\002\001\004\001\n\n\003\001\032\006\000\004\001\001\005\001\001\024\000\001\027\001\b\001\030\003\000\001\022\001\013\002\001\001\021\001\f\005\000\001\023\001\000\001\r\003\000\001\016\001\024\001\017\001\020\005\000\001\025\001\000\001\026\uFF82\0".charAt(j1);
        c1 = "\t\000\001\007\001\007\002\000\001\007\022\000\001\007\001\000\001\t\b\000\001\006\001\031\001\002\001\004\001\n\n\003\001\032\006\000\004\001\001\005\001\001\024\000\001\027\001\b\001\030\003\000\001\022\001\013\002\001\001\021\001\f\005\000\001\023\001\000\001\r\003\000\001\016\001\024\001\017\001\020\005\000\001\025\001\000\001\026\uFF82\0".charAt(i2);
        j1 = i1;
        i1 = c2;
_L9:
        int k1;
        k1 = j1 + 1;
        ai[j1] = c1;
        i1--;
        if (i1 > 0)
        {
            break MISSING_BLOCK_LABEL_4410;
        }
        i1 = k1;
        j1 = i2 + 1;
        if (true) goto _L2; else goto _L1
_L1:
        b = ai;
        ai = new int[45];
        i2 = "\002\000\002\001\001\002\001\003\001\004\003\001\001\005\001\006\001\007\001\b\001\t\001\n\001\013\001\f\001\r\005\000\001\f\001\016\001\017\001\020\001\021\001\022\001\023\001\024\001\000\001\025\001\000\001\025\004\000\001\026\001\027\002\000\001\030".length();
        i1 = 0;
        j1 = 0;
_L4:
        int j2;
        char c3;
        if (j1 >= i2)
        {
            break; /* Loop/switch isn't completed */
        }
        j2 = j1 + 1;
        k1 = "\002\000\002\001\001\002\001\003\001\004\003\001\001\005\001\006\001\007\001\b\001\t\001\n\001\013\001\f\001\r\005\000\001\f\001\016\001\017\001\020\001\021\001\022\001\023\001\024\001\000\001\025\001\000\001\025\004\000\001\026\001\027\002\000\001\030".charAt(j1);
        c3 = "\002\000\002\001\001\002\001\003\001\004\003\001\001\005\001\006\001\007\001\b\001\t\001\n\001\013\001\f\001\r\005\000\001\f\001\016\001\017\001\020\001\021\001\022\001\023\001\024\001\000\001\025\001\000\001\025\004\000\001\026\001\027\002\000\001\030".charAt(j2);
        j1 = i1;
        i1 = k1;
_L8:
        k1 = j1 + 1;
        ai[j1] = c3;
        i1--;
        if (i1 > 0)
        {
            break MISSING_BLOCK_LABEL_4404;
        }
        i1 = k1;
        j1 = j2 + 1;
        if (true) goto _L4; else goto _L3
_L3:
        c = ai;
        ai = new int[45];
        k1 = "\000\000\000\033\0006\000Q\000l\000\207\0006\000\242\000\275\000\330\0006\0006\0006\0006\0006\0006\000\363\000\u010E\0006\000\u0129\000\u0144\000\u015F\000\u017A\000\u0195\0006\0006\0006\0006\0006\0006\0006\0006\000\u01B0\000\u01CB\000\u01E6\000\u01E6\000\u0201\000\u021C\000\u0237\000\u0252\0006\0006\000\u026D\000\u0288\0006".length();
        i1 = 0;
        for (j1 = 0; j1 < k1; j1 = i2 + 1)
        {
            i2 = j1 + 1;
            j1 = "\000\000\000\033\0006\000Q\000l\000\207\0006\000\242\000\275\000\330\0006\0006\0006\0006\0006\0006\000\363\000\u010E\0006\000\u0129\000\u0144\000\u015F\000\u017A\000\u0195\0006\0006\0006\0006\0006\0006\0006\0006\000\u01B0\000\u01CB\000\u01E6\000\u01E6\000\u0201\000\u021C\000\u0237\000\u0252\0006\0006\000\u026D\000\u0288\0006".charAt(j1);
            ai[i1] = "\000\000\000\033\0006\000Q\000l\000\207\0006\000\242\000\275\000\330\0006\0006\0006\0006\0006\0006\000\363\000\u010E\0006\000\u0129\000\u0144\000\u015F\000\u017A\000\u0195\0006\0006\0006\0006\0006\0006\0006\0006\000\u01B0\000\u01CB\000\u01E6\000\u01E6\000\u0201\000\u021C\000\u0237\000\u0252\0006\0006\000\u026D\000\u0288\0006".charAt(i2) | j1 << 16;
            i1++;
        }

        d = ai;
        e = (new int[] {
            2, 2, 3, 4, 2, 2, 2, 5, 2, 6, 
            2, 2, 7, 8, 2, 9, 2, 2, 2, 2, 
            2, 10, 11, 12, 13, 14, 15, 16, 16, 16, 
            16, 16, 16, 16, 16, 17, 18, 16, 16, 16, 
            16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 
            16, 16, 16, 16, -1, -1, -1, -1, -1, -1, 
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
            -1, -1, -1, -1, 4, -1, -1, -1, -1, -1, 
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
            -1, 4, 19, 20, -1, -1, -1, -1, -1, -1, 
            -1, -1, -1, -1, -1, 20, -1, -1, -1, -1, 
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
            -1, -1, 5, -1, -1, -1, -1, -1, -1, -1, 
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
            21, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
            -1, -1, -1, -1, -1, 22, -1, -1, -1, -1, 
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
            23, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
            -1, -1, -1, 16, 16, 16, 16, 16, 16, 16, 
            16, -1, -1, 16, 16, 16, 16, 16, 16, 16, 
            16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 
            -1, -1, -1, -1, -1, -1, -1, -1, 24, 25, 
            26, 27, 28, 29, 30, 31, 32, -1, -1, -1, 
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
            33, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
            -1, -1, -1, -1, -1, -1, 34, 35, -1, -1, 
            34, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
            36, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
            -1, -1, -1, -1, -1, -1, -1, 37, -1, -1, 
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
            -1, 38, -1, -1, -1, -1, -1, -1, -1, -1, 
            -1, -1, -1, 39, -1, 39, -1, 39, -1, -1, 
            -1, -1, -1, 39, 39, -1, -1, -1, -1, 39, 
            39, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
            -1, -1, 33, -1, 20, -1, -1, -1, -1, -1, 
            -1, -1, -1, -1, -1, -1, 20, -1, -1, -1, 
            -1, -1, -1, -1, -1, -1, -1, -1, -1, 35, 
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
            -1, -1, -1, 38, -1, -1, -1, -1, -1, -1, 
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
            -1, -1, -1, -1, -1, -1, -1, -1, -1, 40, 
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
            -1, -1, -1, -1, 41, -1, -1, -1, -1, -1, 
            -1, -1, -1, -1, -1, 42, -1, 42, -1, 42, 
            -1, -1, -1, -1, -1, 42, 42, -1, -1, -1, 
            -1, 42, 42, -1, -1, -1, -1, -1, -1, -1, 
            -1, -1, 43, -1, 43, -1, 43, -1, -1, -1, 
            -1, -1, 43, 43, -1, -1, -1, -1, 43, 43, 
            -1, -1, -1, -1, -1, -1, -1, -1, -1, 44, 
            -1, 44, -1, 44, -1, -1, -1, -1, -1, 44, 
            44, -1, -1, -1, -1, 44, 44, -1, -1, -1, 
            -1, -1, -1, -1, -1
        });
        f = (new String[] {
            "Unkown internal scanner error", "Error: could not match input", "Error: pushback value was too large"
        });
        ai = new int[45];
        i2 = "\002\000\001\t\003\001\001\t\003\001\006\t\002\001\001\t\005\000\b\t\001\000\001\001\001\000\001\001\004\000\002\t\002\000\001\t".length();
        i1 = 0;
        j1 = l1;
_L6:
        if (j1 >= i2)
        {
            break; /* Loop/switch isn't completed */
        }
        j2 = j1 + 1;
        k1 = "\002\000\001\t\003\001\001\t\003\001\006\t\002\001\001\t\005\000\b\t\001\000\001\001\001\000\001\001\004\000\002\t\002\000\001\t".charAt(j1);
        l1 = j2 + 1;
        j2 = "\002\000\001\t\003\001\001\t\003\001\006\t\002\001\001\t\005\000\b\t\001\000\001\001\001\000\001\001\004\000\002\t\002\000\001\t".charAt(j2);
        j1 = i1;
        i1 = k1;
_L7:
        k1 = j1 + 1;
        ai[j1] = j2;
        i1--;
        if (i1 > 0)
        {
            break MISSING_BLOCK_LABEL_4398;
        }
        i1 = k1;
        j1 = l1;
        if (true) goto _L6; else goto _L5
_L5:
        g = ai;
        return;
        j1 = k1;
          goto _L7
        j1 = k1;
          goto _L8
        j1 = k1;
          goto _L9
    }
}
