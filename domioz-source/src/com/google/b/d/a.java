// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.d;

import com.google.b.b.u;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;

// Referenced classes of package com.google.b.d:
//            b, e, c

public class a
    implements Closeable
{

    private static final char a[] = ")]}'\n".toCharArray();
    private final Reader b;
    private boolean c;
    private final char d[] = new char[1024];
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private long j;
    private int k;
    private String l;
    private int m[];
    private int n;
    private String o[];
    private int p[];

    public a(Reader reader)
    {
        c = false;
        e = 0;
        f = 0;
        g = 0;
        h = 0;
        i = 0;
        m = new int[32];
        n = 0;
        int ai[] = m;
        int i1 = n;
        n = i1 + 1;
        ai[i1] = 6;
        o = new String[32];
        p = new int[32];
        if (reader == null)
        {
            throw new NullPointerException("in == null");
        } else
        {
            b = reader;
            return;
        }
    }

    static int a(a a1)
    {
        return a1.i;
    }

    static int a(a a1, int i1)
    {
        a1.i = i1;
        return i1;
    }

    private IOException a(String s1)
    {
        throw new e((new StringBuilder()).append(s1).append(" at line ").append(g + 1).append(" column ").append(u()).append(" path ").append(q()).toString());
    }

    private void a(int i1)
    {
        if (n == m.length)
        {
            int ai[] = new int[n * 2];
            int ai2[] = new int[n * 2];
            String as[] = new String[n * 2];
            System.arraycopy(m, 0, ai, 0, n);
            System.arraycopy(p, 0, ai2, 0, n);
            System.arraycopy(o, 0, as, 0, n);
            m = ai;
            p = ai2;
            o = as;
        }
        int ai1[] = m;
        int j1 = n;
        n = j1 + 1;
        ai1[j1] = i1;
    }

    private boolean a(char c1)
    {
        switch (c1)
        {
        default:
            return true;

        case 35: // '#'
        case 47: // '/'
        case 59: // ';'
        case 61: // '='
        case 92: // '\\'
            v();
            // fall through

        case 9: // '\t'
        case 10: // '\n'
        case 12: // '\f'
        case 13: // '\r'
        case 32: // ' '
        case 44: // ','
        case 58: // ':'
        case 91: // '['
        case 93: // ']'
        case 123: // '{'
        case 125: // '}'
            return false;
        }
    }

    static int b(a a1)
    {
        return a1.o();
    }

    private int b(boolean flag)
    {
        char ac[];
        int i1;
        int j1;
        ac = d;
        i1 = e;
        j1 = f;
_L25:
        int k1;
        int l1;
        k1 = j1;
        l1 = i1;
        if (i1 != j1) goto _L2; else goto _L1
_L1:
        e = i1;
        if (!b(1)) goto _L4; else goto _L3
_L3:
        l1 = e;
        k1 = f;
_L2:
        i1 = l1 + 1;
        j1 = ac[l1];
        if (j1 == '\n')
        {
            g = g + 1;
            h = i1;
            j1 = k1;
            continue; /* Loop/switch isn't completed */
        }
        if (j1 == 32 || j1 == 13 || j1 == 9) goto _L6; else goto _L5
_L5:
        if (j1 != 47) goto _L8; else goto _L7
_L7:
        e = i1;
        if (i1 == k1)
        {
            e = e - 1;
            boolean flag1 = b(2);
            e = e + 1;
            if (!flag1)
            {
                return j1;
            }
        }
        v();
        ac[e];
        JVM INSTR lookupswitch 2: default 204
    //                   42: 207
    //                   47: 365;
           goto _L9 _L10 _L11
_L9:
        return j1;
_L10:
        e = e + 1;
_L16:
        if (e + "*/".length() > f && !b("*/".length())) goto _L13; else goto _L12
_L12:
        if (d[e] != '\n') goto _L15; else goto _L14
_L14:
        g = g + 1;
        h = e + 1;
_L20:
        e = e + 1;
          goto _L16
_L15:
        i1 = 0;
_L21:
        if (i1 >= "*/".length()) goto _L18; else goto _L17
_L17:
        if (d[e + i1] != "*/".charAt(i1)) goto _L20; else goto _L19
_L19:
        i1++;
          goto _L21
          goto _L20
_L18:
        i1 = 1;
_L23:
        if (i1 == 0)
        {
            throw a("Unterminated comment");
        }
        break; /* Loop/switch isn't completed */
_L13:
        i1 = 0;
        if (true) goto _L23; else goto _L22
_L22:
        i1 = e + 2;
        j1 = f;
        continue; /* Loop/switch isn't completed */
_L11:
        e = e + 1;
        w();
        i1 = e;
        j1 = f;
        continue; /* Loop/switch isn't completed */
_L8:
        if (j1 == 35)
        {
            e = i1;
            v();
            w();
            i1 = e;
            j1 = f;
        } else
        {
            e = i1;
            return j1;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (flag)
        {
            throw new EOFException((new StringBuilder("End of input at line ")).append(g + 1).append(" column ").append(u()).toString());
        } else
        {
            return -1;
        }
_L6:
        j1 = k1;
        if (true) goto _L25; else goto _L24
_L24:
    }

    private String b(char c1)
    {
        char ac[] = d;
        StringBuilder stringbuilder = new StringBuilder();
label0:
        do
        {
            int j1 = e;
            int l1 = f;
            int i1;
            int k1;
            for (i1 = j1; i1 < l1; i1 = k1)
            {
                k1 = i1 + 1;
                i1 = ac[i1];
                if (i1 == c1)
                {
                    e = k1;
                    stringbuilder.append(ac, j1, k1 - j1 - 1);
                    return stringbuilder.toString();
                }
                if (i1 == 92)
                {
                    e = k1;
                    stringbuilder.append(ac, j1, k1 - j1 - 1);
                    stringbuilder.append(x());
                    continue label0;
                }
                if (i1 == 10)
                {
                    g = g + 1;
                    h = k1;
                }
            }

            stringbuilder.append(ac, j1, i1 - j1);
            e = i1;
            if (!b(1))
            {
                throw a("Unterminated string");
            }
        } while (true);
    }

    private boolean b(int i1)
    {
        boolean flag1 = false;
        char ac[] = d;
        h = h - e;
        boolean flag;
        if (f != e)
        {
            f = f - e;
            System.arraycopy(ac, e, ac, 0, f);
        } else
        {
            f = 0;
        }
        e = 0;
        do
        {
            int j1 = b.read(ac, f, ac.length - f);
            flag = flag1;
            if (j1 == -1)
            {
                break;
            }
            f = j1 + f;
            j1 = i1;
            if (g == 0)
            {
                j1 = i1;
                if (h == 0)
                {
                    j1 = i1;
                    if (f > 0)
                    {
                        j1 = i1;
                        if (ac[0] == '\uFEFF')
                        {
                            e = e + 1;
                            h = h + 1;
                            j1 = i1 + 1;
                        }
                    }
                }
            }
            i1 = j1;
            if (f < j1)
            {
                continue;
            }
            flag = true;
            break;
        } while (true);
        return flag;
    }

    static int c(a a1)
    {
        return a1.g + 1;
    }

    private void c(char c1)
    {
        char ac[] = d;
label0:
        do
        {
            int i1 = e;
            int j1;
            for (int k1 = f; i1 < k1; i1 = j1)
            {
                j1 = i1 + 1;
                i1 = ac[i1];
                if (i1 == c1)
                {
                    e = j1;
                    return;
                }
                if (i1 == 92)
                {
                    e = j1;
                    x();
                    continue label0;
                }
                if (i1 == 10)
                {
                    g = g + 1;
                    h = j1;
                }
            }

            e = i1;
            if (!b(1))
            {
                throw a("Unterminated string");
            }
        } while (true);
    }

    static int d(a a1)
    {
        return a1.u();
    }

    private int o()
    {
        int j1 = m[n - 1];
        if (j1 != 1) goto _L2; else goto _L1
_L1:
        m[n - 1] = 2;
_L14:
        b(true);
        JVM INSTR lookupswitch 7: default 100
    //                   34: 756
    //                   39: 743
    //                   44: 703
    //                   59: 703
    //                   91: 777
    //                   93: 691
    //                   123: 784;
           goto _L3 _L4 _L5 _L6 _L6 _L7 _L8 _L9
_L3:
        int i1;
        e = e - 1;
        if (n == 1)
        {
            v();
        }
        i1 = r();
        if (i1 == 0) goto _L11; else goto _L10
_L10:
        return i1;
_L2:
        if (j1 == 2)
        {
            switch (b(true))
            {
            default:
                throw a("Unterminated array");

            case 93: // ']'
                i = 4;
                return 4;

            case 59: // ';'
                v();
                break;

            case 44: // ','
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        if (j1 == 3 || j1 == 5)
        {
            m[n - 1] = 4;
            if (j1 == 5)
            {
                switch (b(true))
                {
                default:
                    throw a("Unterminated object");

                case 125: // '}'
                    i = 2;
                    return 2;

                case 59: // ';'
                    v();
                    break;

                case 44: // ','
                    break;
                }
            }
            i1 = b(true);
            switch (i1)
            {
            default:
                v();
                e = e - 1;
                if (a((char)i1))
                {
                    i = 14;
                    return 14;
                } else
                {
                    throw a("Expected name");
                }

            case 34: // '"'
                i = 13;
                return 13;

            case 39: // '\''
                v();
                i = 12;
                return 12;

            case 125: // '}'
                break;
            }
            if (j1 != 5)
            {
                i = 2;
                return 2;
            } else
            {
                throw a("Expected name");
            }
        }
        if (j1 == 4)
        {
            m[n - 1] = 5;
            switch (b(true))
            {
            case 59: // ';'
            case 60: // '<'
            default:
                throw a("Expected ':'");

            case 61: // '='
                v();
                if ((e < f || b(1)) && d[e] == '>')
                {
                    e = e + 1;
                }
                break;

            case 58: // ':'
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        if (j1 == 6)
        {
label0:
            {
                if (!c)
                {
                    break label0;
                }
                b(true);
                e = e - 1;
                if (e + a.length > f && !b(a.length))
                {
                    break label0;
                }
                for (i1 = 0; i1 < a.length; i1++)
                {
                    if (d[e + i1] != a[i1])
                    {
                        break label0;
                    }
                }

                e = e + a.length;
            }
            m[n - 1] = 7;
            continue; /* Loop/switch isn't completed */
        } else
        {
            if (j1 == 7)
            {
                if (b(false) == -1)
                {
                    i = 17;
                    return 17;
                }
                v();
                e = e - 1;
            } else
            if (j1 == 8)
            {
                throw new IllegalStateException("JsonReader is closed");
            }
            continue; /* Loop/switch isn't completed */
        }
_L8:
        if (j1 == 1)
        {
            i = 4;
            return 4;
        }
_L6:
        if (j1 == 1 || j1 == 2)
        {
            v();
            e = e - 1;
            i = 7;
            return 7;
        } else
        {
            throw a("Unexpected value");
        }
_L5:
        v();
        i = 8;
        return 8;
_L4:
        if (n == 1)
        {
            v();
        }
        i = 9;
        return 9;
_L7:
        i = 3;
        return 3;
_L9:
        i = 1;
        return 1;
_L11:
        j1 = s();
        i1 = j1;
        if (j1 != 0) goto _L10; else goto _L12
_L12:
        if (!a(d[e]))
        {
            throw a("Expected value");
        } else
        {
            v();
            i = 10;
            return 10;
        }
        if (true) goto _L14; else goto _L13
_L13:
    }

    private int r()
    {
        int i1 = d[e];
        String s1;
        String s2;
        if (i1 == 116 || i1 == 84)
        {
            s2 = "true";
            s1 = "TRUE";
            i1 = 5;
        } else
        if (i1 == 102 || i1 == 70)
        {
            s2 = "false";
            s1 = "FALSE";
            i1 = 6;
        } else
        if (i1 == 110 || i1 == 78)
        {
            s2 = "null";
            s1 = "NULL";
            i1 = 7;
        } else
        {
            return 0;
        }
        do
        {
            int k1 = s2.length();
            for (int j1 = 1; j1 < k1; j1++)
            {
                if (e + j1 >= f && !b(j1 + 1))
                {
                    return 0;
                }
                char c1 = d[e + j1];
                if (c1 != s2.charAt(j1) && c1 != s1.charAt(j1))
                {
                    return 0;
                }
            }

            if ((e + k1 < f || b(k1 + 1)) && a(d[e + k1]))
            {
                return 0;
            }
            e = e + k1;
            i = i1;
            return i1;
        } while (true);
    }

    private int s()
    {
        char ac[];
        int i1;
        boolean flag;
        int j1;
        int k1;
        int k2;
        int j3;
        long l3;
        ac = d;
        k2 = e;
        int l1 = f;
        l3 = 0L;
        i1 = 0;
        flag = true;
        j1 = 0;
        k1 = 0;
        j3 = l1;
_L7:
        char c1;
        int i2;
        int j2;
        j2 = j3;
        i2 = k2;
        if (k2 + k1 == j3)
        {
            if (k1 == ac.length)
            {
                return 0;
            }
            if (!b(k1 + 1))
            {
                break MISSING_BLOCK_LABEL_458;
            }
            i2 = e;
            j2 = f;
        }
        c1 = ac[i2 + k1];
        c1;
        JVM INSTR lookupswitch 5: default 144
    //                   43: 228
    //                   45: 166
    //                   46: 275
    //                   69: 249
    //                   101: 249;
           goto _L1 _L2 _L3 _L4 _L5 _L5
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        if (c1 < '0' || c1 > '9')
        {
            if (a(c1))
            {
                return 0;
            }
            break MISSING_BLOCK_LABEL_458;
        }
        break MISSING_BLOCK_LABEL_295;
_L3:
        int k3;
        if (j1 == 0)
        {
            i1 = 1;
            j1 = 1;
        } else
        if (j1 == 5)
        {
            byte byte0 = 6;
            j1 = i1;
            i1 = byte0;
        } else
        {
            return 0;
        }
_L8:
        k3 = k1 + 1;
        k1 = j1;
        j3 = j2;
        k2 = i2;
        j1 = i1;
        i1 = k1;
        k1 = k3;
        if (true) goto _L7; else goto _L6
_L6:
        if (j1 == 5)
        {
            byte byte1 = 6;
            j1 = i1;
            i1 = byte1;
        } else
        {
            return 0;
        }
          goto _L8
_L5:
        if (j1 == 2 || j1 == 4)
        {
            byte byte2 = 5;
            j1 = i1;
            i1 = byte2;
        } else
        {
            return 0;
        }
          goto _L8
_L4:
        if (j1 == 2)
        {
            byte byte3 = 3;
            j1 = i1;
            i1 = byte3;
        } else
        {
            return 0;
        }
          goto _L8
        if (j1 == 1 || j1 == 0)
        {
            l3 = -(c1 - 48);
            byte byte4 = 2;
            j1 = i1;
            i1 = byte4;
        } else
        if (j1 == 2)
        {
            if (l3 == 0L)
            {
                return 0;
            }
            long l4 = 10L * l3 - (long)(c1 - 48);
            int l2;
            boolean flag1;
            if (l3 > 0xf333333333333334L || l3 == 0xf333333333333334L && l4 < l3)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            l2 = i1;
            l3 = l4;
            flag = flag1 & flag;
            i1 = j1;
            j1 = l2;
        } else
        if (j1 == 3)
        {
            byte byte5 = 4;
            j1 = i1;
            i1 = byte5;
        } else
        if (j1 == 5 || j1 == 6)
        {
            byte byte6 = 7;
            j1 = i1;
            i1 = byte6;
        } else
        {
            int i3 = i1;
            i1 = j1;
            j1 = i3;
        }
          goto _L8
        if (j1 == 2 && flag && (l3 != 0x8000000000000000L || i1 != 0))
        {
            if (i1 == 0)
            {
                l3 = -l3;
            }
            j = l3;
            e = e + k1;
            i = 15;
            return 15;
        }
        if (j1 == 2 || j1 == 4 || j1 == 7)
        {
            k = k1;
            i = 16;
            return 16;
        } else
        {
            return 0;
        }
    }

    private String t()
    {
        Object obj;
        int i1;
        obj = null;
        i1 = 0;
_L2:
        Object obj1;
        int j1;
        if (e + i1 < f)
        {
            obj1 = obj;
            j1 = i1;
            switch (d[e + i1])
            {
            default:
                i1++;
                continue; /* Loop/switch isn't completed */

            case 35: // '#'
            case 47: // '/'
            case 59: // ';'
            case 61: // '='
            case 92: // '\\'
                v();
                j1 = i1;
                obj1 = obj;
                break;

            case 9: // '\t'
            case 10: // '\n'
            case 12: // '\f'
            case 13: // '\r'
            case 32: // ' '
            case 44: // ','
            case 58: // ':'
            case 91: // '['
            case 93: // ']'
            case 123: // '{'
            case 125: // '}'
                break;
            }
        } else
        if (i1 < d.length)
        {
            obj1 = obj;
            j1 = i1;
            if (b(i1 + 1))
            {
                continue; /* Loop/switch isn't completed */
            }
        } else
        {
label0:
            {
                obj1 = obj;
                if (obj == null)
                {
                    obj1 = new StringBuilder();
                }
                ((StringBuilder) (obj1)).append(d, e, i1);
                e = i1 + e;
                if (b(1))
                {
                    break label0;
                }
                j1 = 0;
            }
        }
        if (obj1 == null)
        {
            obj = new String(d, e, j1);
        } else
        {
            ((StringBuilder) (obj1)).append(d, e, j1);
            obj = ((StringBuilder) (obj1)).toString();
        }
        e = j1 + e;
        return ((String) (obj));
        i1 = 0;
        obj = obj1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private int u()
    {
        return (e - h) + 1;
    }

    private void v()
    {
        if (!c)
        {
            throw a("Use JsonReader.setLenient(true) to accept malformed JSON");
        } else
        {
            return;
        }
    }

    private void w()
    {
        int i1;
        do
        {
            if (e < f || b(1))
            {
                char ac[] = d;
                i1 = e;
                e = i1 + 1;
                i1 = ac[i1];
                if (i1 != '\n')
                {
                    continue;
                }
                g = g + 1;
                h = e;
            }
            return;
        } while (i1 != '\r');
    }

    private char x()
    {
        if (e == f && !b(1))
        {
            throw a("Unterminated escape sequence");
        }
        char ac[] = d;
        int i1 = e;
        e = i1 + 1;
        char c1 = ac[i1];
        switch (c1)
        {
        default:
            return c1;

        case 117: // 'u'
            if (e + 4 > f && !b(4))
            {
                throw a("Unterminated escape sequence");
            }
            int k1 = e;
            c1 = '\0';
            int j1 = k1;
            while (j1 < k1 + 4) 
            {
                char c2 = d[j1];
                char c3 = (char)(c1 << 4);
                if (c2 >= '0' && c2 <= '9')
                {
                    c1 = (char)(c3 + (c2 - 48));
                } else
                if (c2 >= 'a' && c2 <= 'f')
                {
                    c1 = (char)(c3 + ((c2 - 97) + 10));
                } else
                if (c2 >= 'A' && c2 <= 'F')
                {
                    c1 = (char)(c3 + ((c2 - 65) + 10));
                } else
                {
                    throw new NumberFormatException((new StringBuilder("\\u")).append(new String(d, e, 4)).toString());
                }
                j1++;
            }
            e = e + 4;
            return c1;

        case 116: // 't'
            return '\t';

        case 98: // 'b'
            return '\b';

        case 110: // 'n'
            return '\n';

        case 114: // 'r'
            return '\r';

        case 102: // 'f'
            return '\f';

        case 10: // '\n'
            g = g + 1;
            h = e;
            return c1;
        }
    }

    public void a()
    {
        int j1 = i;
        int i1 = j1;
        if (j1 == 0)
        {
            i1 = o();
        }
        if (i1 == 3)
        {
            a(1);
            p[n - 1] = 0;
            i = 0;
            return;
        } else
        {
            throw new IllegalStateException((new StringBuilder("Expected BEGIN_ARRAY but was ")).append(f()).append(" at line ").append(g + 1).append(" column ").append(u()).append(" path ").append(q()).toString());
        }
    }

    public final void a(boolean flag)
    {
        c = flag;
    }

    public void b()
    {
        int j1 = i;
        int i1 = j1;
        if (j1 == 0)
        {
            i1 = o();
        }
        if (i1 == 4)
        {
            n = n - 1;
            i = 0;
            return;
        } else
        {
            throw new IllegalStateException((new StringBuilder("Expected END_ARRAY but was ")).append(f()).append(" at line ").append(g + 1).append(" column ").append(u()).append(" path ").append(q()).toString());
        }
    }

    public void c()
    {
        int j1 = i;
        int i1 = j1;
        if (j1 == 0)
        {
            i1 = o();
        }
        if (i1 == 1)
        {
            a(3);
            i = 0;
            return;
        } else
        {
            throw new IllegalStateException((new StringBuilder("Expected BEGIN_OBJECT but was ")).append(f()).append(" at line ").append(g + 1).append(" column ").append(u()).append(" path ").append(q()).toString());
        }
    }

    public void close()
    {
        i = 0;
        m[0] = 8;
        n = 1;
        b.close();
    }

    public void d()
    {
        int j1 = i;
        int i1 = j1;
        if (j1 == 0)
        {
            i1 = o();
        }
        if (i1 == 2)
        {
            n = n - 1;
            o[n] = null;
            i = 0;
            return;
        } else
        {
            throw new IllegalStateException((new StringBuilder("Expected END_OBJECT but was ")).append(f()).append(" at line ").append(g + 1).append(" column ").append(u()).append(" path ").append(q()).toString());
        }
    }

    public boolean e()
    {
        int j1 = i;
        int i1 = j1;
        if (j1 == 0)
        {
            i1 = o();
        }
        return i1 != 2 && i1 != 4;
    }

    public c f()
    {
        int j1 = i;
        int i1 = j1;
        if (j1 == 0)
        {
            i1 = o();
        }
        switch (i1)
        {
        default:
            throw new AssertionError();

        case 1: // '\001'
            return c.c;

        case 2: // '\002'
            return c.d;

        case 3: // '\003'
            return c.a;

        case 4: // '\004'
            return c.b;

        case 12: // '\f'
        case 13: // '\r'
        case 14: // '\016'
            return c.e;

        case 5: // '\005'
        case 6: // '\006'
            return c.h;

        case 7: // '\007'
            return c.i;

        case 8: // '\b'
        case 9: // '\t'
        case 10: // '\n'
        case 11: // '\013'
            return c.f;

        case 15: // '\017'
        case 16: // '\020'
            return c.g;

        case 17: // '\021'
            return c.j;
        }
    }

    public String g()
    {
        int j1 = i;
        int i1 = j1;
        if (j1 == 0)
        {
            i1 = o();
        }
        String s1;
        if (i1 == 14)
        {
            s1 = t();
        } else
        if (i1 == 12)
        {
            s1 = b('\'');
        } else
        if (i1 == 13)
        {
            s1 = b('"');
        } else
        {
            throw new IllegalStateException((new StringBuilder("Expected a name but was ")).append(f()).append(" at line ").append(g + 1).append(" column ").append(u()).append(" path ").append(q()).toString());
        }
        i = 0;
        o[n - 1] = s1;
        return s1;
    }

    public String h()
    {
        int j1 = i;
        int i1 = j1;
        if (j1 == 0)
        {
            i1 = o();
        }
        String s1;
        int ai[];
        if (i1 == 10)
        {
            s1 = t();
        } else
        if (i1 == 8)
        {
            s1 = b('\'');
        } else
        if (i1 == 9)
        {
            s1 = b('"');
        } else
        if (i1 == 11)
        {
            s1 = l;
            l = null;
        } else
        if (i1 == 15)
        {
            s1 = Long.toString(j);
        } else
        if (i1 == 16)
        {
            s1 = new String(d, e, k);
            e = e + k;
        } else
        {
            throw new IllegalStateException((new StringBuilder("Expected a string but was ")).append(f()).append(" at line ").append(g + 1).append(" column ").append(u()).append(" path ").append(q()).toString());
        }
        i = 0;
        ai = p;
        i1 = n - 1;
        ai[i1] = ai[i1] + 1;
        return s1;
    }

    public boolean i()
    {
        int k1 = i;
        int i1 = k1;
        if (k1 == 0)
        {
            i1 = o();
        }
        if (i1 == 5)
        {
            i = 0;
            int ai[] = p;
            i1 = n - 1;
            ai[i1] = ai[i1] + 1;
            return true;
        }
        if (i1 == 6)
        {
            i = 0;
            int ai1[] = p;
            int j1 = n - 1;
            ai1[j1] = ai1[j1] + 1;
            return false;
        } else
        {
            throw new IllegalStateException((new StringBuilder("Expected a boolean but was ")).append(f()).append(" at line ").append(g + 1).append(" column ").append(u()).append(" path ").append(q()).toString());
        }
    }

    public void j()
    {
        int k1 = i;
        int i1 = k1;
        if (k1 == 0)
        {
            i1 = o();
        }
        if (i1 == 7)
        {
            i = 0;
            int ai[] = p;
            int j1 = n - 1;
            ai[j1] = ai[j1] + 1;
            return;
        } else
        {
            throw new IllegalStateException((new StringBuilder("Expected null but was ")).append(f()).append(" at line ").append(g + 1).append(" column ").append(u()).append(" path ").append(q()).toString());
        }
    }

    public double k()
    {
        int k1 = i;
        int i1 = k1;
        if (k1 == 0)
        {
            i1 = o();
        }
        if (i1 == 15)
        {
            i = 0;
            int ai[] = p;
            i1 = n - 1;
            ai[i1] = ai[i1] + 1;
            return (double)j;
        }
        if (i1 == 16)
        {
            l = new String(d, e, k);
            e = e + k;
        } else
        if (i1 == 8 || i1 == 9)
        {
            char c1;
            if (i1 == 8)
            {
                c1 = '\'';
            } else
            {
                c1 = '"';
            }
            l = b(c1);
        } else
        {
            if (i1 != 10)
            {
                continue;
            }
            l = t();
        }
        do
        {
            i = 11;
            double d1 = Double.parseDouble(l);
            if (!c && (Double.isNaN(d1) || Double.isInfinite(d1)))
            {
                throw new e((new StringBuilder("JSON forbids NaN and infinities: ")).append(d1).append(" at line ").append(g + 1).append(" column ").append(u()).append(" path ").append(q()).toString());
            } else
            {
                l = null;
                i = 0;
                int ai1[] = p;
                int j1 = n - 1;
                ai1[j1] = ai1[j1] + 1;
                return d1;
            }
        } while (i1 == 11);
        throw new IllegalStateException((new StringBuilder("Expected a double but was ")).append(f()).append(" at line ").append(g + 1).append(" column ").append(u()).append(" path ").append(q()).toString());
    }

    public long l()
    {
        int i1;
        int k1 = i;
        i1 = k1;
        if (k1 == 0)
        {
            i1 = o();
        }
        if (i1 == 15)
        {
            i = 0;
            int ai[] = p;
            i1 = n - 1;
            ai[i1] = ai[i1] + 1;
            return j;
        }
        if (i1 != 16) goto _L2; else goto _L1
_L1:
        l = new String(d, e, k);
        e = e + k;
_L3:
        i = 11;
        double d1 = Double.parseDouble(l);
        long l1 = (long)d1;
        char c1;
        int ai1[];
        NumberFormatException numberformatexception;
        if ((double)l1 != d1)
        {
            throw new NumberFormatException((new StringBuilder("Expected a long but was ")).append(l).append(" at line ").append(g + 1).append(" column ").append(u()).append(" path ").append(q()).toString());
        } else
        {
            l = null;
            i = 0;
            int ai2[] = p;
            int j1 = n - 1;
            ai2[j1] = ai2[j1] + 1;
            return l1;
        }
_L2:
        if (i1 != 8 && i1 != 9)
        {
            break MISSING_BLOCK_LABEL_286;
        }
        if (i1 == 8)
        {
            c1 = '\'';
        } else
        {
            c1 = '"';
        }
        l = b(c1);
        l1 = Long.parseLong(l);
        i = 0;
        ai1 = p;
        i1 = n - 1;
        ai1[i1] = ai1[i1] + 1;
        return l1;
        numberformatexception;
          goto _L3
        throw new IllegalStateException((new StringBuilder("Expected a long but was ")).append(f()).append(" at line ").append(g + 1).append(" column ").append(u()).append(" path ").append(q()).toString());
    }

    public int m()
    {
        int i1;
        int j1 = i;
        i1 = j1;
        if (j1 == 0)
        {
            i1 = o();
        }
        if (i1 == 15)
        {
            i1 = (int)j;
            if (j != (long)i1)
            {
                throw new NumberFormatException((new StringBuilder("Expected an int but was ")).append(j).append(" at line ").append(g + 1).append(" column ").append(u()).append(" path ").append(q()).toString());
            } else
            {
                i = 0;
                int ai[] = p;
                int k1 = n - 1;
                ai[k1] = ai[k1] + 1;
                return i1;
            }
        }
        if (i1 != 16) goto _L2; else goto _L1
_L1:
        l = new String(d, e, k);
        e = e + k;
_L3:
        i = 11;
        double d1 = Double.parseDouble(l);
        i1 = (int)d1;
        char c1;
        int ai1[];
        NumberFormatException numberformatexception;
        int l1;
        if ((double)i1 != d1)
        {
            throw new NumberFormatException((new StringBuilder("Expected an int but was ")).append(l).append(" at line ").append(g + 1).append(" column ").append(u()).append(" path ").append(q()).toString());
        } else
        {
            l = null;
            i = 0;
            int ai2[] = p;
            int i2 = n - 1;
            ai2[i2] = ai2[i2] + 1;
            return i1;
        }
_L2:
        if (i1 != 8 && i1 != 9)
        {
            break MISSING_BLOCK_LABEL_368;
        }
        if (i1 == 8)
        {
            c1 = '\'';
        } else
        {
            c1 = '"';
        }
        l = b(c1);
        i1 = Integer.parseInt(l);
        i = 0;
        ai1 = p;
        l1 = n - 1;
        ai1[l1] = ai1[l1] + 1;
        return i1;
        numberformatexception;
          goto _L3
        throw new IllegalStateException((new StringBuilder("Expected an int but was ")).append(f()).append(" at line ").append(g + 1).append(" column ").append(u()).append(" path ").append(q()).toString());
    }

    public void n()
    {
        int j1 = 0;
_L2:
        int i1;
        int k1;
        i1 = i;
        k1 = i1;
        if (i1 == 0)
        {
            k1 = o();
        }
        if (k1 != 3)
        {
            break; /* Loop/switch isn't completed */
        }
        a(1);
        i1 = j1 + 1;
_L3:
        i = 0;
        j1 = i1;
        if (i1 == 0)
        {
            int ai[] = p;
            i1 = n - 1;
            ai[i1] = ai[i1] + 1;
            o[n - 1] = "null";
            return;
        }
        if (true) goto _L2; else goto _L1
_L1:
        if (k1 == 1)
        {
            a(3);
            i1 = j1 + 1;
        } else
        if (k1 == 4)
        {
            n = n - 1;
            i1 = j1 - 1;
        } else
        {
label0:
            {
                if (k1 != 2)
                {
                    break label0;
                }
                n = n - 1;
                i1 = j1 - 1;
            }
        }
          goto _L3
        if (k1 != 14 && k1 != 10)
        {
            break MISSING_BLOCK_LABEL_373;
        }
_L5:
        i1 = 0;
        do
        {
            if (e + i1 >= f)
            {
                break MISSING_BLOCK_LABEL_350;
            }
            switch (d[e + i1])
            {
            default:
                i1++;
                break;

            case 35: // '#'
            case 47: // '/'
            case 59: // ';'
            case 61: // '='
            case 92: // '\\'
                v();
                // fall through

            case 9: // '\t'
            case 10: // '\n'
            case 12: // '\f'
            case 13: // '\r'
            case 32: // ' '
            case 44: // ','
            case 58: // ':'
            case 91: // '['
            case 93: // ']'
            case 123: // '{'
            case 125: // '}'
label1:
                {
                    e = i1 + e;
                    break label1;
                }
                break;
            }
        } while (true);
        break MISSING_BLOCK_LABEL_350;
        i1 = j1;
          goto _L3
        e = i1 + e;
        if (b(1)) goto _L5; else goto _L4
_L4:
        i1 = j1;
          goto _L3
        if (k1 == 8 || k1 == 12)
        {
            c('\'');
            i1 = j1;
        } else
        if (k1 == 9 || k1 == 13)
        {
            c('"');
            i1 = j1;
        } else
        {
            i1 = j1;
            if (k1 == 16)
            {
                e = e + k;
                i1 = j1;
            }
        }
          goto _L3
    }

    public final boolean p()
    {
        return c;
    }

    public final String q()
    {
        StringBuilder stringbuilder;
        int i1;
        int j1;
        stringbuilder = new StringBuilder("$");
        i1 = 0;
        j1 = n;
_L2:
        if (i1 >= j1)
        {
            break MISSING_BLOCK_LABEL_125;
        }
        switch (m[i1])
        {
        default:
            break;

        case 1: // '\001'
        case 2: // '\002'
            break; /* Loop/switch isn't completed */

        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
            break;
        }
        break MISSING_BLOCK_LABEL_95;
_L3:
        i1++;
        if (true) goto _L2; else goto _L1
_L1:
        stringbuilder.append('[').append(p[i1]).append(']');
          goto _L3
        stringbuilder.append('.');
        if (o[i1] != null)
        {
            stringbuilder.append(o[i1]);
        }
          goto _L3
        return stringbuilder.toString();
    }

    public String toString()
    {
        return (new StringBuilder()).append(getClass().getSimpleName()).append(" at line ").append(g + 1).append(" column ").append(u()).toString();
    }

    static 
    {
        u.a = new b();
    }
}
