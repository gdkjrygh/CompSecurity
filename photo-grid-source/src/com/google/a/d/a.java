// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.d;

import com.google.a.b.q;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;

// Referenced classes of package com.google.a.d:
//            b, i, d, h, 
//            e, c

public class a
    implements Closeable
{

    private static final char a[] = ")]}'\n".toCharArray();
    private final i b = new i();
    private final Reader c;
    private boolean d;
    private final char e[] = new char[1024];
    private int f;
    private int g;
    private int h;
    private int i;
    private d j[];
    private int k;
    private e l;
    private String m;
    private String n;
    private int o;
    private int p;
    private boolean q;

    public a(Reader reader)
    {
        d = false;
        f = 0;
        g = 0;
        h = 1;
        i = 1;
        j = new d[32];
        k = 0;
        a(d.f);
        q = false;
        if (reader == null)
        {
            throw new NullPointerException("in == null");
        } else
        {
            c = reader;
            return;
        }
    }

    static e a(a a1)
    {
        return a1.l;
    }

    static e a(a a1, e e1)
    {
        a1.l = e1;
        return e1;
    }

    private IOException a(String s1)
    {
        throw new h((new StringBuilder()).append(s1).append(" at line ").append(r()).append(" column ").append(s()).toString());
    }

    private String a(char c1)
    {
        char ac[] = e;
        StringBuilder stringbuilder = null;
        do
        {
            int i1 = f;
            int j1 = g;
            for (int k1 = i1; k1 < j1;)
            {
                int l1 = k1 + 1;
                k1 = ac[k1];
                if (k1 == c1)
                {
                    f = l1;
                    if (q)
                    {
                        return "skipped!";
                    }
                    if (stringbuilder == null)
                    {
                        return b.a(ac, i1, l1 - i1 - 1);
                    } else
                    {
                        stringbuilder.append(ac, i1, l1 - i1 - 1);
                        return stringbuilder.toString();
                    }
                }
                StringBuilder stringbuilder2;
                if (k1 == 92)
                {
                    f = l1;
                    StringBuilder stringbuilder1 = stringbuilder;
                    if (stringbuilder == null)
                    {
                        stringbuilder1 = new StringBuilder();
                    }
                    stringbuilder1.append(ac, i1, l1 - i1 - 1);
                    stringbuilder1.append(v());
                    k1 = f;
                    j1 = g;
                    stringbuilder = stringbuilder1;
                    i1 = k1;
                } else
                {
                    k1 = l1;
                }
            }

            stringbuilder2 = stringbuilder;
            if (stringbuilder == null)
            {
                stringbuilder2 = new StringBuilder();
            }
            stringbuilder2.append(ac, i1, k1 - i1);
            f = k1;
            stringbuilder = stringbuilder2;
        } while (a(1));
        throw a("Unterminated string");
    }

    static String a(a a1, String s1)
    {
        a1.n = s1;
        return s1;
    }

    private void a(d d1)
    {
        if (k == j.length)
        {
            d ad[] = new d[k * 2];
            System.arraycopy(j, 0, ad, 0, k);
            j = ad;
        }
        d ad1[] = j;
        int i1 = k;
        k = i1 + 1;
        ad1[i1] = d1;
    }

    private void a(e e1)
    {
        f();
        if (l != e1)
        {
            throw new IllegalStateException((new StringBuilder("Expected ")).append(e1).append(" but was ").append(f()).append(" at line ").append(r()).append(" column ").append(s()).toString());
        } else
        {
            o();
            return;
        }
    }

    private boolean a(int i1)
    {
        char ac[] = e;
        int i2 = h;
        int j1 = i;
        int j2 = f;
        int l1 = 0;
        while (l1 < j2) 
        {
            if (ac[l1] == '\n')
            {
                i2++;
                j1 = 1;
            } else
            {
                j1++;
            }
            l1++;
        }
        h = i2;
        i = j1;
        if (g != f)
        {
            g = g - f;
            System.arraycopy(ac, f, ac, 0, g);
        } else
        {
            g = 0;
        }
        f = 0;
        do
        {
            int k1 = c.read(ac, g, ac.length - g);
            if (k1 != -1)
            {
                g = k1 + g;
                if (h == 1 && i == 1 && g > 0 && ac[0] == '\uFEFF')
                {
                    f = f + 1;
                    i = i - 1;
                }
                if (g >= i1)
                {
                    return true;
                }
            } else
            {
                return false;
            }
        } while (true);
    }

    static int b(a a1)
    {
        return a1.r();
    }

    private e b(boolean flag)
    {
        if (!flag) goto _L2; else goto _L1
_L1:
        j[k - 1] = d.b;
_L4:
        switch (d(true))
        {
        default:
            f = f - 1;
            return q();

        case 93: // ']'
            if (flag)
            {
                k = k - 1;
                e e2 = e.b;
                l = e2;
                return e2;
            }
            // fall through

        case 44: // ','
        case 59: // ';'
            t();
            f = f - 1;
            n = "null";
            e e3 = e.i;
            l = e3;
            return e3;
        }
_L2:
        switch (d(true))
        {
        default:
            throw a("Unterminated array");

        case 93: // ']'
            k = k - 1;
            e e1 = e.b;
            l = e1;
            return e1;

        case 59: // ';'
            t();
            break;

        case 44: // ','
            break;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    static int c(a a1)
    {
        return a1.s();
    }

    private e c(boolean flag)
    {
        if (flag)
        {
            switch (d(true))
            {
            default:
                f = f - 1;
                do
                {
                    int i1 = d(true);
                    e e1;
                    switch (i1)
                    {
                    default:
                        t();
                        f = f - 1;
                        m = e(false);
                        if (m.length() == 0)
                        {
                            throw a("Expected name");
                        }
                        break;

                    case 39: // '\''
                        t();
                        // fall through

                    case 34: // '"'
                        m = a((char)i1);
                        break;
                    }
                    j[k - 1] = d.d;
                    e1 = e.e;
                    l = e1;
                    return e1;
                } while (true);

            case 125: // '}'
                k = k - 1;
                e1 = e.d;
                l = e1;
                return e1;
            }
        } else
        {
            switch (d(true))
            {
            default:
                throw a("Unterminated object");

            case 125: // '}'
                k = k - 1;
                e1 = e.d;
                l = e1;
                return e1;

            case 44: // ','
            case 59: // ';'
                break;
            }
            continue;
        }
    }

    private int d(boolean flag)
    {
        char ac[];
        int i1;
        int j1;
        ac = e;
        i1 = f;
        j1 = g;
_L18:
        int k1;
        k1 = j1;
        int l1 = i1;
        if (i1 == j1)
        {
            f = i1;
            if (!a(1))
            {
                break; /* Loop/switch isn't completed */
            }
            l1 = f;
            k1 = g;
        }
        i1 = l1 + 1;
        j1 = ac[l1];
        j1;
        JVM INSTR lookupswitch 6: default 124
    //                   9: 132
    //                   10: 132
    //                   13: 132
    //                   32: 132
    //                   35: 375
    //                   47: 139;
           goto _L1 _L2 _L2 _L2 _L2 _L3 _L4
_L1:
        f = i1;
        return j1;
_L2:
        j1 = k1;
        continue; /* Loop/switch isn't completed */
_L4:
        f = i1;
        if (i1 == k1)
        {
            f = f - 1;
            boolean flag1 = a(2);
            f = f + 1;
            if (!flag1)
            {
                return j1;
            }
        }
        t();
        ac[f];
        JVM INSTR lookupswitch 2: default 220
    //                   42: 223
    //                   47: 347;
           goto _L5 _L6 _L7
_L5:
        return j1;
_L6:
        f = f + 1;
_L16:
        if (f + "*/".length() > g && !a("*/".length())) goto _L9; else goto _L8
_L8:
        i1 = 0;
_L14:
        if (i1 >= "*/".length()) goto _L11; else goto _L10
_L10:
        if (e[f + i1] != "*/".charAt(i1)) goto _L13; else goto _L12
_L12:
        i1++;
          goto _L14
_L11:
        i1 = 1;
          goto _L15
_L13:
        f = f + 1;
          goto _L16
_L9:
        i1 = 0;
_L15:
        if (i1 == 0)
        {
            throw a("Unterminated comment");
        }
        i1 = f + 2;
        j1 = g;
        continue; /* Loop/switch isn't completed */
          goto _L16
_L7:
        f = f + 1;
        u();
        i1 = f;
        j1 = g;
        continue; /* Loop/switch isn't completed */
_L3:
        f = i1;
        t();
        u();
        i1 = f;
        j1 = g;
        if (true) goto _L18; else goto _L17
_L17:
        if (flag)
        {
            throw new EOFException((new StringBuilder("End of input at line ")).append(r()).append(" column ").append(s()).toString());
        } else
        {
            return -1;
        }
    }

    static String d(a a1)
    {
        return a1.m;
    }

    static String e(a a1)
    {
        a1.m = null;
        return null;
    }

    private String e(boolean flag)
    {
        Object obj;
        Object obj2;
        int i1;
        obj2 = null;
        o = -1;
        p = 0;
        i1 = 0;
        obj = null;
_L2:
        Object obj1;
        int j1;
        if (f + i1 < g)
        {
            obj1 = obj;
            j1 = i1;
            switch (e[f + i1])
            {
            default:
                i1++;
                continue; /* Loop/switch isn't completed */

            case 35: // '#'
            case 47: // '/'
            case 59: // ';'
            case 61: // '='
            case 92: // '\\'
                t();
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
        if (i1 < e.length)
        {
            if (a(i1 + 1))
            {
                continue; /* Loop/switch isn't completed */
            }
            e[g] = '\0';
            obj1 = obj;
            j1 = i1;
        } else
        {
label0:
            {
                obj1 = obj;
                if (obj == null)
                {
                    obj1 = new StringBuilder();
                }
                ((StringBuilder) (obj1)).append(e, f, i1);
                p = p + i1;
                f = i1 + f;
                if (a(1))
                {
                    break label0;
                }
                j1 = 0;
            }
        }
        if (flag && obj1 == null)
        {
            o = f;
            obj = obj2;
        } else
        if (q)
        {
            obj = "skipped!";
        } else
        if (obj1 == null)
        {
            obj = b.a(e, f, j1);
        } else
        {
            ((StringBuilder) (obj1)).append(e, f, j1);
            obj = ((StringBuilder) (obj1)).toString();
        }
        p = p + j1;
        f = f + j1;
        return ((String) (obj));
        i1 = 0;
        obj = obj1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private e o()
    {
        f();
        e e1 = l;
        l = null;
        n = null;
        m = null;
        return e1;
    }

    private e q()
    {
        int i1 = d(true);
        switch (i1)
        {
        default:
            f = f - 1;
            n = e(true);
            if (p == 0)
            {
                throw a("Expected literal value");
            }
            break;

        case 123: // '{'
            a(d.c);
            e e1 = e.c;
            l = e1;
            return e1;

        case 91: // '['
            a(d.a);
            e e2 = e.a;
            l = e2;
            return e2;

        case 39: // '\''
            t();
            // fall through

        case 34: // '"'
            n = a((char)i1);
            e e3 = e.f;
            l = e3;
            return e3;
        }
        if (o == -1) goto _L2; else goto _L1
_L1:
        if (p != 4 || 'n' != e[o] && 'N' != e[o] || 'u' != e[o + 1] && 'U' != e[o + 1] || 'l' != e[o + 2] && 'L' != e[o + 2] || 'l' != e[o + 3] && 'L' != e[o + 3]) goto _L4; else goto _L3
_L3:
        Object obj;
        n = "null";
        obj = e.i;
_L12:
        l = ((e) (obj));
        if (l == e.f)
        {
            t();
        }
        return l;
_L4:
        if (p == 4 && ('t' == e[o] || 'T' == e[o]) && ('r' == e[o + 1] || 'R' == e[o + 1]) && ('u' == e[o + 2] || 'U' == e[o + 2]) && ('e' == e[o + 3] || 'E' == e[o + 3]))
        {
            n = "true";
            obj = e.h;
            continue; /* Loop/switch isn't completed */
        }
        if (p == 5 && ('f' == e[o] || 'F' == e[o]) && ('a' == e[o + 1] || 'A' == e[o + 1]) && ('l' == e[o + 2] || 'L' == e[o + 2]) && ('s' == e[o + 3] || 'S' == e[o + 3]) && ('e' == e[o + 4] || 'E' == e[o + 4]))
        {
            n = "false";
            obj = e.h;
            continue; /* Loop/switch isn't completed */
        }
        n = b.a(e, o, p);
        obj = e;
        int j2 = o;
        int k2 = p;
        int j1 = obj[j2];
        int k1;
        int l1;
        int i2;
        if (j1 == 45)
        {
            k1 = j2 + 1;
            j1 = obj[k1];
        } else
        {
            k1 = j2;
        }
        if (j1 != 48) goto _L6; else goto _L5
_L5:
        j1 = k1 + 1;
        k1 = obj[j1];
_L8:
        i2 = k1;
        l1 = j1;
        if (k1 == 46)
        {
            k1 = j1 + 1;
            j1 = obj[k1];
            do
            {
                i2 = j1;
                l1 = k1;
                if (j1 < 48)
                {
                    break;
                }
                i2 = j1;
                l1 = k1;
                if (j1 > 57)
                {
                    break;
                }
                k1++;
                j1 = obj[k1];
            } while (true);
        }
        break MISSING_BLOCK_LABEL_840;
_L6:
        if (j1 < 49 || j1 > 57)
        {
            break MISSING_BLOCK_LABEL_833;
        }
        i2 = k1 + 1;
        l1 = obj[i2];
_L10:
        k1 = l1;
        j1 = i2;
        if (l1 < 48) goto _L8; else goto _L7
_L7:
        k1 = l1;
        j1 = i2;
        if (l1 > 57) goto _L8; else goto _L9
_L9:
        i2++;
        l1 = obj[i2];
          goto _L10
        obj = e.f;
        continue; /* Loop/switch isn't completed */
label0:
        {
label1:
            {
                if (i2 != 101)
                {
                    k1 = l1;
                    if (i2 != 69)
                    {
                        break label0;
                    }
                }
                l1++;
                i2 = obj[l1];
                if (i2 != '+')
                {
                    k1 = i2;
                    j1 = l1;
                    if (i2 != '-')
                    {
                        break label1;
                    }
                }
                j1 = l1 + 1;
                k1 = obj[j1];
            }
            if (k1 >= 48 && k1 <= 57)
            {
                j1++;
                l1 = obj[j1];
                do
                {
                    k1 = j1;
                    if (l1 < '0')
                    {
                        break;
                    }
                    k1 = j1;
                    if (l1 > '9')
                    {
                        break;
                    }
                    j1++;
                    l1 = obj[j1];
                } while (true);
            } else
            {
                obj = e.f;
                continue; /* Loop/switch isn't completed */
            }
        }
        if (k1 == j2 + k2)
        {
            obj = e.g;
            continue; /* Loop/switch isn't completed */
        }
_L2:
        obj = e.f;
        if (true) goto _L12; else goto _L11
_L11:
    }

    private int r()
    {
        int j1 = h;
        for (int i1 = 0; i1 < f;)
        {
            int k1 = j1;
            if (e[i1] == '\n')
            {
                k1 = j1 + 1;
            }
            i1++;
            j1 = k1;
        }

        return j1;
    }

    private int s()
    {
        int i1 = i;
        int j1 = 0;
        while (j1 < f) 
        {
            if (e[j1] == '\n')
            {
                i1 = 1;
            } else
            {
                i1++;
            }
            j1++;
        }
        return i1;
    }

    private void t()
    {
        if (!d)
        {
            throw a("Use JsonReader.setLenient(true) to accept malformed JSON");
        } else
        {
            return;
        }
    }

    private void u()
    {
        int i1;
        do
        {
            if (f >= g && !a(1))
            {
                break;
            }
            char ac[] = e;
            i1 = f;
            f = i1 + 1;
            i1 = ac[i1];
        } while (i1 != '\r' && i1 != '\n');
    }

    private char v()
    {
        if (f == g && !a(1))
        {
            throw a("Unterminated escape sequence");
        }
        char ac[] = e;
        int i1 = f;
        f = i1 + 1;
        char c1 = ac[i1];
        switch (c1)
        {
        default:
            return c1;

        case 117: // 'u'
            if (f + 4 > g && !a(4))
            {
                throw a("Unterminated escape sequence");
            }
            int k1 = f;
            char c2 = '\0';
            int j1 = k1;
            while (j1 < k1 + 4) 
            {
                char c3 = e[j1];
                char c4 = (char)(c2 << 4);
                if (c3 >= '0' && c3 <= '9')
                {
                    c2 = (char)(c4 + (c3 - 48));
                } else
                if (c3 >= 'a' && c3 <= 'f')
                {
                    c2 = (char)(c4 + ((c3 - 97) + 10));
                } else
                if (c3 >= 'A' && c3 <= 'F')
                {
                    c2 = (char)(c4 + ((c3 - 65) + 10));
                } else
                {
                    throw new NumberFormatException((new StringBuilder("\\u")).append(b.a(e, f, 4)).toString());
                }
                j1++;
            }
            f = f + 4;
            return c2;

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
        }
    }

    public void a()
    {
        a(e.a);
    }

    public final void a(boolean flag)
    {
        d = flag;
    }

    public void b()
    {
        a(e.b);
    }

    public void c()
    {
        a(e.c);
    }

    public void close()
    {
        n = null;
        l = null;
        j[0] = d.h;
        k = 1;
        c.close();
    }

    public void d()
    {
        a(e.d);
    }

    public boolean e()
    {
        f();
        return l != e.d && l != e.b;
    }

    public e f()
    {
        boolean flag = false;
        if (l == null) goto _L2; else goto _L1
_L1:
        e e1 = l;
_L4:
        return e1;
_L2:
        switch (c.a[j[k - 1].ordinal()])
        {
        default:
            throw new AssertionError();

        case 1: // '\001'
label0:
            {
                if (!d)
                {
                    break label0;
                }
                d(true);
                f = f - 1;
                int i1 = ((flag) ? 1 : 0);
                if (f + a.length > g)
                {
                    if (!a(a.length))
                    {
                        break label0;
                    }
                    i1 = ((flag) ? 1 : 0);
                }
                for (; i1 < a.length; i1++)
                {
                    if (e[f + i1] != a[i1])
                    {
                        break label0;
                    }
                }

                f = f + a.length;
            }
            j[k - 1] = d.g;
            e e2 = q();
            e1 = e2;
            if (!d)
            {
                e1 = e2;
                if (l != e.a)
                {
                    e1 = e2;
                    if (l != e.c)
                    {
                        throw new IOException((new StringBuilder("Expected JSON document to start with '[' or '{' but was ")).append(l).append(" at line ").append(r()).append(" column ").append(s()).toString());
                    }
                }
            }
            break;

        case 2: // '\002'
            return b(true);

        case 3: // '\003'
            return b(false);

        case 4: // '\004'
            return c(true);

        case 5: // '\005'
            switch (d(true))
            {
            case 59: // ';'
            case 60: // '<'
            default:
                throw a("Expected ':'");

            case 61: // '='
                t();
                if ((f < g || a(1)) && e[f] == '>')
                {
                    f = f + 1;
                }
                // fall through

            case 58: // ':'
                j[k - 1] = d.e;
                return q();
            }

        case 6: // '\006'
            return c(false);

        case 7: // '\007'
            if (d(false) == -1)
            {
                return e.j;
            }
            f = f - 1;
            if (!d)
            {
                throw a("Expected EOF");
            } else
            {
                return q();
            }

        case 8: // '\b'
            throw new IllegalStateException("JsonReader is closed");
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public String g()
    {
        f();
        if (l != e.e)
        {
            throw new IllegalStateException((new StringBuilder("Expected a name but was ")).append(f()).append(" at line ").append(r()).append(" column ").append(s()).toString());
        } else
        {
            String s1 = m;
            o();
            return s1;
        }
    }

    public String h()
    {
        f();
        if (l != e.f && l != e.g)
        {
            throw new IllegalStateException((new StringBuilder("Expected a string but was ")).append(f()).append(" at line ").append(r()).append(" column ").append(s()).toString());
        } else
        {
            String s1 = n;
            o();
            return s1;
        }
    }

    public boolean i()
    {
        f();
        if (l != e.h)
        {
            throw new IllegalStateException((new StringBuilder("Expected a boolean but was ")).append(l).append(" at line ").append(r()).append(" column ").append(s()).toString());
        }
        boolean flag;
        if (n == "true")
        {
            flag = true;
        } else
        {
            flag = false;
        }
        o();
        return flag;
    }

    public void j()
    {
        f();
        if (l != e.i)
        {
            throw new IllegalStateException((new StringBuilder("Expected null but was ")).append(l).append(" at line ").append(r()).append(" column ").append(s()).toString());
        } else
        {
            o();
            return;
        }
    }

    public double k()
    {
        f();
        if (l != e.f && l != e.g)
        {
            throw new IllegalStateException((new StringBuilder("Expected a double but was ")).append(l).append(" at line ").append(r()).append(" column ").append(s()).toString());
        }
        double d1 = Double.parseDouble(n);
        if (d1 >= 1.0D && n.startsWith("0"))
        {
            throw new h((new StringBuilder("JSON forbids octal prefixes: ")).append(n).append(" at line ").append(r()).append(" column ").append(s()).toString());
        }
        if (!d && (Double.isNaN(d1) || Double.isInfinite(d1)))
        {
            throw new h((new StringBuilder("JSON forbids NaN and infinities: ")).append(n).append(" at line ").append(r()).append(" column ").append(s()).toString());
        } else
        {
            o();
            return d1;
        }
    }

    public long l()
    {
        f();
        if (l != e.f && l != e.g)
        {
            throw new IllegalStateException((new StringBuilder("Expected a long but was ")).append(l).append(" at line ").append(r()).append(" column ").append(s()).toString());
        }
        long l1;
        try
        {
            l1 = Long.parseLong(n);
        }
        catch (NumberFormatException numberformatexception)
        {
            double d1 = Double.parseDouble(n);
            long l2 = (long)d1;
            l1 = l2;
            if ((double)l2 != d1)
            {
                throw new NumberFormatException((new StringBuilder("Expected a long but was ")).append(n).append(" at line ").append(r()).append(" column ").append(s()).toString());
            }
        }
        if (l1 >= 1L && n.startsWith("0"))
        {
            throw new h((new StringBuilder("JSON forbids octal prefixes: ")).append(n).append(" at line ").append(r()).append(" column ").append(s()).toString());
        } else
        {
            o();
            return l1;
        }
    }

    public int m()
    {
        f();
        if (l != e.f && l != e.g)
        {
            throw new IllegalStateException((new StringBuilder("Expected an int but was ")).append(l).append(" at line ").append(r()).append(" column ").append(s()).toString());
        }
        int i1;
        try
        {
            i1 = Integer.parseInt(n);
        }
        catch (NumberFormatException numberformatexception)
        {
            double d1 = Double.parseDouble(n);
            int j1 = (int)d1;
            i1 = j1;
            if ((double)j1 != d1)
            {
                throw new NumberFormatException((new StringBuilder("Expected an int but was ")).append(n).append(" at line ").append(r()).append(" column ").append(s()).toString());
            }
        }
        if ((long)i1 >= 1L && n.startsWith("0"))
        {
            throw new h((new StringBuilder("JSON forbids octal prefixes: ")).append(n).append(" at line ").append(r()).append(" column ").append(s()).toString());
        } else
        {
            o();
            return i1;
        }
    }

    public void n()
    {
        int j1;
        q = true;
        j1 = 0;
_L5:
        e e1 = o();
        if (e1 == e.a) goto _L2; else goto _L1
_L1:
        e e2 = e.c;
        if (e1 != e2) goto _L3; else goto _L2
_L2:
        int i1 = j1 + 1;
_L8:
        j1 = i1;
        if (i1 != 0) goto _L5; else goto _L4
_L4:
        q = false;
        return;
_L3:
        if (e1 == e.b) goto _L7; else goto _L6
_L6:
        e2 = e.d;
        i1 = j1;
        if (e1 != e2) goto _L8; else goto _L7
_L7:
        i1 = j1 - 1;
          goto _L8
        Exception exception;
        exception;
        q = false;
        throw exception;
    }

    public final boolean p()
    {
        return d;
    }

    public String toString()
    {
        return (new StringBuilder()).append(getClass().getSimpleName()).append(" at line ").append(r()).append(" column ").append(s()).toString();
    }

    static 
    {
        q.a = new b();
    }
}
