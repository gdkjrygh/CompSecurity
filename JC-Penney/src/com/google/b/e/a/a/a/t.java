// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.e.a.a.a;

import com.google.b.b.a;
import com.google.b.h;

// Referenced classes of package com.google.b.e.a.a.a:
//            m, l, q, p, 
//            o, s

final class t
{

    private final a a;
    private final m b = new m();
    private final StringBuilder c = new StringBuilder();

    t(a a1)
    {
        a = a1;
    }

    static int a(a a1, int j, int k)
    {
        int j1 = 0;
        for (int i1 = 0; i1 < k;)
        {
            int k1 = j1;
            if (a1.a(j + i1))
            {
                k1 = j1 | 1 << k - i1 - 1;
            }
            i1++;
            j1 = k1;
        }

        return j1;
    }

    private p a()
    {
        do
        {
            int j = b.a();
            l l1;
            boolean flag;
            boolean flag1;
            if (b.b())
            {
                l1 = d();
                flag1 = l1.b();
            } else
            if (b.c())
            {
                l1 = c();
                flag1 = l1.b();
            } else
            {
                l1 = b();
                flag1 = l1.b();
            }
            if (j != b.a())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            while (!flag && !flag1 || flag1) 
            {
                return l1.a();
            }
        } while (true);
    }

    private boolean a(int j)
    {
        if (j + 7 <= a.a()) goto _L2; else goto _L1
_L1:
        if (j + 4 > a.a()) goto _L4; else goto _L3
_L3:
        return true;
_L4:
        return false;
_L2:
        int k = j;
label0:
        do
        {
label1:
            {
                if (k >= j + 3)
                {
                    break label1;
                }
                if (a.a(k))
                {
                    break label0;
                }
                k++;
            }
        } while (true);
        if (true) goto _L3; else goto _L5
_L5:
        return a.a(j + 3);
    }

    private l b()
    {
        Object obj;
        for (; a(b.a()); c.append(((q) (obj)).b()))
        {
            obj = b(b.a());
            b.a(((q) (obj)).e());
            if (((q) (obj)).c())
            {
                if (((q) (obj)).d())
                {
                    obj = new p(b.a(), c.toString());
                } else
                {
                    obj = new p(b.a(), c.toString(), ((q) (obj)).b());
                }
                return new l(((p) (obj)), true);
            }
            c.append(((q) (obj)).a());
            if (((q) (obj)).d())
            {
                return new l(new p(b.a(), c.toString()), true);
            }
        }

        if (i(b.a()))
        {
            b.e();
            b.b(4);
        }
        return new l(false);
    }

    private q b(int j)
    {
        if (j + 7 > a.a())
        {
            j = a(j, 4);
            if (j == 0)
            {
                return new q(a.a(), 10, 10);
            } else
            {
                return new q(a.a(), j - 1, 10);
            }
        } else
        {
            int k = a(j, 7);
            return new q(j + 7, (k - 8) / 11, (k - 8) % 11);
        }
    }

    private l c()
    {
        o o1;
        for (; c(b.a()); c.append(o1.a()))
        {
            o1 = d(b.a());
            b.a(o1.e());
            if (o1.b())
            {
                return new l(new p(b.a(), c.toString()), true);
            }
        }

        if (!h(b.a())) goto _L2; else goto _L1
_L1:
        b.b(3);
        b.d();
_L4:
        return new l(false);
_L2:
        if (g(b.a()))
        {
            if (b.a() + 5 < a.a())
            {
                b.b(5);
            } else
            {
                b.a(a.a());
            }
            b.e();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private boolean c(int j)
    {
        boolean flag = true;
        if (j + 5 <= a.a())
        {
            int k = a(j, 5);
            if (k >= 5 && k < 16)
            {
                return true;
            }
            if (j + 7 <= a.a())
            {
                int i1 = a(j, 7);
                if (i1 >= 64 && i1 < 116)
                {
                    return true;
                }
                if (j + 8 <= a.a())
                {
                    j = a(j, 8);
                    if (j < 232 || j >= 253)
                    {
                        flag = false;
                    }
                    return flag;
                }
            }
        }
        return false;
    }

    private l d()
    {
        o o1;
        for (; e(b.a()); c.append(o1.a()))
        {
            o1 = f(b.a());
            b.a(o1.e());
            if (o1.b())
            {
                return new l(new p(b.a(), c.toString()), true);
            }
        }

        if (!h(b.a())) goto _L2; else goto _L1
_L1:
        b.b(3);
        b.d();
_L4:
        return new l(false);
_L2:
        if (g(b.a()))
        {
            if (b.a() + 5 < a.a())
            {
                b.b(5);
            } else
            {
                b.a(a.a());
            }
            b.f();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private o d(int j)
    {
        int k = a(j, 5);
        if (k == 15)
        {
            return new o(j + 5, '$');
        }
        if (k >= 5 && k < 15)
        {
            return new o(j + 5, (char)((k + 48) - 5));
        }
        k = a(j, 7);
        if (k >= 64 && k < 90)
        {
            return new o(j + 7, (char)(k + 1));
        }
        if (k >= 90 && k < 116)
        {
            return new o(j + 7, (char)(k + 7));
        }
        a(j, 8);
        JVM INSTR tableswitch 232 252: default 224
    //                   232 228
    //                   233 244
    //                   234 250
    //                   235 256
    //                   236 262
    //                   237 268
    //                   238 274
    //                   239 280
    //                   240 286
    //                   241 292
    //                   242 298
    //                   243 304
    //                   244 310
    //                   245 316
    //                   246 322
    //                   247 328
    //                   248 334
    //                   249 340
    //                   250 346
    //                   251 352
    //                   252 358;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22
_L1:
        throw com.google.b.h.a();
_L2:
        char c1 = '!';
_L24:
        return new o(j + 8, c1);
_L3:
        c1 = '"';
        continue; /* Loop/switch isn't completed */
_L4:
        c1 = '%';
        continue; /* Loop/switch isn't completed */
_L5:
        c1 = '&';
        continue; /* Loop/switch isn't completed */
_L6:
        c1 = '\'';
        continue; /* Loop/switch isn't completed */
_L7:
        c1 = '(';
        continue; /* Loop/switch isn't completed */
_L8:
        c1 = ')';
        continue; /* Loop/switch isn't completed */
_L9:
        c1 = '*';
        continue; /* Loop/switch isn't completed */
_L10:
        c1 = '+';
        continue; /* Loop/switch isn't completed */
_L11:
        c1 = ',';
        continue; /* Loop/switch isn't completed */
_L12:
        c1 = '-';
        continue; /* Loop/switch isn't completed */
_L13:
        c1 = '.';
        continue; /* Loop/switch isn't completed */
_L14:
        c1 = '/';
        continue; /* Loop/switch isn't completed */
_L15:
        c1 = ':';
        continue; /* Loop/switch isn't completed */
_L16:
        c1 = ';';
        continue; /* Loop/switch isn't completed */
_L17:
        c1 = '<';
        continue; /* Loop/switch isn't completed */
_L18:
        c1 = '=';
        continue; /* Loop/switch isn't completed */
_L19:
        c1 = '>';
        continue; /* Loop/switch isn't completed */
_L20:
        c1 = '?';
        continue; /* Loop/switch isn't completed */
_L21:
        c1 = '_';
        continue; /* Loop/switch isn't completed */
_L22:
        c1 = ' ';
        if (true) goto _L24; else goto _L23
_L23:
    }

    private boolean e(int j)
    {
        boolean flag = true;
        if (j + 5 <= a.a())
        {
            int k = a(j, 5);
            if (k >= 5 && k < 16)
            {
                return true;
            }
            if (j + 6 <= a.a())
            {
                j = a(j, 6);
                if (j < 16 || j >= 63)
                {
                    flag = false;
                }
                return flag;
            }
        }
        return false;
    }

    private o f(int j)
    {
        int k;
        k = a(j, 5);
        if (k == 15)
        {
            return new o(j + 5, '$');
        }
        if (k >= 5 && k < 15)
        {
            return new o(j + 5, (char)((k + 48) - 5));
        }
        k = a(j, 6);
        if (k >= 32 && k < 58)
        {
            return new o(j + 6, (char)(k + 33));
        }
        k;
        JVM INSTR tableswitch 58 62: default 128
    //                   58 155
    //                   59 171
    //                   60 177
    //                   61 183
    //                   62 189;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        throw new IllegalStateException((new StringBuilder()).append("Decoding invalid alphanumeric value: ").append(k).toString());
_L2:
        char c1 = '*';
_L8:
        return new o(j + 6, c1);
_L3:
        c1 = ',';
        continue; /* Loop/switch isn't completed */
_L4:
        c1 = '-';
        continue; /* Loop/switch isn't completed */
_L5:
        c1 = '.';
        continue; /* Loop/switch isn't completed */
_L6:
        c1 = '/';
        if (true) goto _L8; else goto _L7
_L7:
    }

    private boolean g(int j)
    {
        if (j + 1 <= a.a()) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int k = 0;
_L6:
        if (k >= 5 || k + j >= a.a())
        {
            break MISSING_BLOCK_LABEL_75;
        }
        if (k != 2) goto _L4; else goto _L3
_L3:
        if (!a.a(j + 2)) goto _L1; else goto _L5
_L5:
        k++;
          goto _L6
_L4:
        if (!a.a(j + k)) goto _L5; else goto _L7
_L7:
        return false;
        return true;
    }

    private boolean h(int j)
    {
        if (j + 3 <= a.a()) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int k = j;
label0:
        do
        {
label1:
            {
                if (k >= j + 3)
                {
                    break label1;
                }
                if (a.a(k))
                {
                    break label0;
                }
                k++;
            }
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
        return true;
    }

    private boolean i(int j)
    {
        if (j + 1 <= a.a()) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int k = 0;
label0:
        do
        {
label1:
            {
                if (k >= 4 || k + j >= a.a())
                {
                    break label1;
                }
                if (a.a(j + k))
                {
                    break label0;
                }
                k++;
            }
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
        return true;
    }

    int a(int j, int k)
    {
        return a(a, j, k);
    }

    p a(int j, String s1)
    {
        c.setLength(0);
        if (s1 != null)
        {
            c.append(s1);
        }
        b.a(j);
        s1 = a();
        if (s1 != null && s1.b())
        {
            return new p(b.a(), c.toString(), s1.c());
        } else
        {
            return new p(b.a(), c.toString());
        }
    }

    String a(StringBuilder stringbuilder, int j)
    {
        String s1 = null;
        do
        {
            p p1 = a(j, s1);
            s1 = com.google.b.e.a.a.a.s.a(p1.a());
            if (s1 != null)
            {
                stringbuilder.append(s1);
            }
            if (p1.b())
            {
                s1 = String.valueOf(p1.c());
            } else
            {
                s1 = null;
            }
            if (j == p1.e())
            {
                return stringbuilder.toString();
            }
            j = p1.e();
        } while (true);
    }
}
