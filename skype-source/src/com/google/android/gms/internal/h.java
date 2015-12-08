// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            kv, lf, kz, ku, 
//            kt, lb

public interface h
{
    public static final class a extends kv
    {

        private static volatile a m[];
        public int a;
        public String b;
        public a c[];
        public a d[];
        public a e[];
        public String f;
        public String g;
        public long h;
        public boolean i;
        public a j[];
        public int k[];
        public boolean l;

        public static a[] b()
        {
            if (m == null)
            {
                synchronized (kz.a)
                {
                    if (m == null)
                    {
                        m = new a[0];
                    }
                }
            }
            return m;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        protected final int a()
        {
            boolean flag = false;
            int j1 = super.a() + ku.b(1, a);
            int i1 = j1;
            if (!b.equals(""))
            {
                i1 = j1 + ku.b(2, b);
            }
            j1 = i1;
            if (c != null)
            {
                j1 = i1;
                if (c.length > 0)
                {
                    for (j1 = 0; j1 < c.length;)
                    {
                        a a1 = c[j1];
                        int k1 = i1;
                        if (a1 != null)
                        {
                            k1 = i1 + ku.b(3, a1);
                        }
                        j1++;
                        i1 = k1;
                    }

                    j1 = i1;
                }
            }
            i1 = j1;
            if (d != null)
            {
                i1 = j1;
                if (d.length > 0)
                {
                    i1 = j1;
                    for (j1 = 0; j1 < d.length;)
                    {
                        a a2 = d[j1];
                        int l1 = i1;
                        if (a2 != null)
                        {
                            l1 = i1 + ku.b(4, a2);
                        }
                        j1++;
                        i1 = l1;
                    }

                }
            }
            j1 = i1;
            if (e != null)
            {
                j1 = i1;
                if (e.length > 0)
                {
                    for (j1 = 0; j1 < e.length;)
                    {
                        a a3 = e[j1];
                        int i2 = i1;
                        if (a3 != null)
                        {
                            i2 = i1 + ku.b(5, a3);
                        }
                        j1++;
                        i1 = i2;
                    }

                    j1 = i1;
                }
            }
            i1 = j1;
            if (!f.equals(""))
            {
                i1 = j1 + ku.b(6, f);
            }
            j1 = i1;
            if (!g.equals(""))
            {
                j1 = i1 + ku.b(7, g);
            }
            i1 = j1;
            if (h != 0L)
            {
                i1 = j1 + ku.b(8, h);
            }
            j1 = i1;
            if (l)
            {
                j1 = i1 + (ku.c(9) + 1);
            }
            i1 = j1;
            if (k != null)
            {
                i1 = j1;
                if (k.length > 0)
                {
                    i1 = 0;
                    int j2 = 0;
                    for (; i1 < k.length; i1++)
                    {
                        j2 += ku.a(k[i1]);
                    }

                    i1 = j1 + j2 + k.length * 1;
                }
            }
            j1 = i1;
            if (j != null)
            {
                j1 = i1;
                if (j.length > 0)
                {
                    int k2 = ((flag) ? 1 : 0);
                    do
                    {
                        j1 = i1;
                        if (k2 >= j.length)
                        {
                            break;
                        }
                        a a4 = j[k2];
                        j1 = i1;
                        if (a4 != null)
                        {
                            j1 = i1 + ku.b(11, a4);
                        }
                        k2++;
                        i1 = j1;
                    } while (true);
                }
            }
            i1 = j1;
            if (i)
            {
                i1 = j1 + (ku.c(12) + 1);
            }
            return i1;
        }

        public final lb a(kt kt1)
            throws IOException
        {
_L16:
            int i1 = kt1.a();
            i1;
            JVM INSTR lookupswitch 14: default 132
        //                       0: 142
        //                       8: 144
        //                       18: 212
        //                       26: 223
        //                       34: 354
        //                       42: 485
        //                       50: 616
        //                       58: 627
        //                       64: 638
        //                       72: 649
        //                       80: 660
        //                       82: 904
        //                       90: 1222
        //                       96: 1353;
               goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15
_L1:
            if (a(kt1, i1)) goto _L16; else goto _L2
_L2:
            return this;
_L3:
            i1 = kt1.f();
            switch (i1)
            {
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
            case 4: // '\004'
            case 5: // '\005'
            case 6: // '\006'
            case 7: // '\007'
            case 8: // '\b'
                a = i1;
                break;
            }
            continue; /* Loop/switch isn't completed */
_L4:
            b = kt1.d();
            continue; /* Loop/switch isn't completed */
_L5:
            int k1 = lf.a(kt1, 26);
            a aa[];
            if (c == null)
            {
                i1 = 0;
            } else
            {
                i1 = c.length;
            }
            aa = new a[k1 + i1];
            k1 = i1;
            if (i1 != 0)
            {
                System.arraycopy(c, 0, aa, 0, i1);
                k1 = i1;
            }
            for (; k1 < aa.length - 1; k1++)
            {
                aa[k1] = new a();
                kt1.a(aa[k1]);
                kt1.a();
            }

            aa[k1] = new a();
            kt1.a(aa[k1]);
            c = aa;
            continue; /* Loop/switch isn't completed */
_L6:
            int l1 = lf.a(kt1, 34);
            a aa1[];
            if (d == null)
            {
                i1 = 0;
            } else
            {
                i1 = d.length;
            }
            aa1 = new a[l1 + i1];
            l1 = i1;
            if (i1 != 0)
            {
                System.arraycopy(d, 0, aa1, 0, i1);
                l1 = i1;
            }
            for (; l1 < aa1.length - 1; l1++)
            {
                aa1[l1] = new a();
                kt1.a(aa1[l1]);
                kt1.a();
            }

            aa1[l1] = new a();
            kt1.a(aa1[l1]);
            d = aa1;
            continue; /* Loop/switch isn't completed */
_L7:
            int i2 = lf.a(kt1, 42);
            a aa2[];
            if (e == null)
            {
                i1 = 0;
            } else
            {
                i1 = e.length;
            }
            aa2 = new a[i2 + i1];
            i2 = i1;
            if (i1 != 0)
            {
                System.arraycopy(e, 0, aa2, 0, i1);
                i2 = i1;
            }
            for (; i2 < aa2.length - 1; i2++)
            {
                aa2[i2] = new a();
                kt1.a(aa2[i2]);
                kt1.a();
            }

            aa2[i2] = new a();
            kt1.a(aa2[i2]);
            e = aa2;
            continue; /* Loop/switch isn't completed */
_L8:
            f = kt1.d();
            continue; /* Loop/switch isn't completed */
_L9:
            g = kt1.d();
            continue; /* Loop/switch isn't completed */
_L10:
            h = kt1.b();
            continue; /* Loop/switch isn't completed */
_L11:
            l = kt1.c();
            continue; /* Loop/switch isn't completed */
_L12:
            int ai[];
            int j2;
            int j3;
            j3 = lf.a(kt1, 80);
            ai = new int[j3];
            j2 = 0;
            i1 = 0;
_L22:
            if (j2 >= j3) goto _L18; else goto _L17
_L17:
            int k3;
            if (j2 != 0)
            {
                kt1.a();
            }
            k3 = kt1.f();
            k3;
            JVM INSTR tableswitch 1 17: default 788
        //                       1 797
        //                       2 797
        //                       3 797
        //                       4 797
        //                       5 797
        //                       6 797
        //                       7 797
        //                       8 797
        //                       9 797
        //                       10 797
        //                       11 797
        //                       12 797
        //                       13 797
        //                       14 797
        //                       15 797
        //                       16 797
        //                       17 797;
               goto _L19 _L20 _L20 _L20 _L20 _L20 _L20 _L20 _L20 _L20 _L20 _L20 _L20 _L20 _L20 _L20 _L20 _L20
_L19:
            j2++;
            continue; /* Loop/switch isn't completed */
_L20:
            int l2 = i1 + 1;
            ai[i1] = k3;
            i1 = l2;
            if (true) goto _L19; else goto _L18
_L18:
            if (i1 != 0)
            {
                if (k == null)
                {
                    j2 = 0;
                } else
                {
                    j2 = k.length;
                }
                if (j2 == 0 && i1 == ai.length)
                {
                    k = ai;
                } else
                {
                    int ai1[] = new int[j2 + i1];
                    if (j2 != 0)
                    {
                        System.arraycopy(k, 0, ai1, 0, j2);
                    }
                    System.arraycopy(ai, 0, ai1, j2, i1);
                    k = ai1;
                }
            }
            continue; /* Loop/switch isn't completed */
            if (true) goto _L22; else goto _L21
_L21:
_L13:
            int i3;
            i3 = kt1.c(kt1.f());
            i1 = kt1.j();
            j2 = 0;
_L28:
            if (kt1.i() > 0)
            {
                switch (kt1.f())
                {
                case 1: // '\001'
                case 2: // '\002'
                case 3: // '\003'
                case 4: // '\004'
                case 5: // '\005'
                case 6: // '\006'
                case 7: // '\007'
                case 8: // '\b'
                case 9: // '\t'
                case 10: // '\n'
                case 11: // '\013'
                case 12: // '\f'
                case 13: // '\r'
                case 14: // '\016'
                case 15: // '\017'
                case 16: // '\020'
                case 17: // '\021'
                    j2++;
                    break;
                }
                continue; /* Loop/switch isn't completed */
            }
            if (j2 == 0) goto _L24; else goto _L23
_L23:
            kt1.e(i1);
            if (k == null)
            {
                i1 = 0;
            } else
            {
                i1 = k.length;
            }
            ai = new int[j2 + i1];
            j2 = i1;
            if (i1 != 0)
            {
                System.arraycopy(k, 0, ai, 0, i1);
                j2 = i1;
            }
_L26:
            if (kt1.i() > 0)
            {
                i1 = kt1.f();
                switch (i1)
                {
                case 1: // '\001'
                case 2: // '\002'
                case 3: // '\003'
                case 4: // '\004'
                case 5: // '\005'
                case 6: // '\006'
                case 7: // '\007'
                case 8: // '\b'
                case 9: // '\t'
                case 10: // '\n'
                case 11: // '\013'
                case 12: // '\f'
                case 13: // '\r'
                case 14: // '\016'
                case 15: // '\017'
                case 16: // '\020'
                case 17: // '\021'
                    ai[j2] = i1;
                    j2++;
                    break;
                }
                continue; /* Loop/switch isn't completed */
            }
            k = ai;
_L24:
            kt1.d(i3);
            continue; /* Loop/switch isn't completed */
            if (true) goto _L26; else goto _L25
_L25:
            if (true) goto _L28; else goto _L27
_L27:
_L14:
            int k2 = lf.a(kt1, 90);
            a aa3[];
            int j1;
            if (j == null)
            {
                j1 = 0;
            } else
            {
                j1 = j.length;
            }
            aa3 = new a[k2 + j1];
            k2 = j1;
            if (j1 != 0)
            {
                System.arraycopy(j, 0, aa3, 0, j1);
                k2 = j1;
            }
            for (; k2 < aa3.length - 1; k2++)
            {
                aa3[k2] = new a();
                kt1.a(aa3[k2]);
                kt1.a();
            }

            aa3[k2] = new a();
            kt1.a(aa3[k2]);
            j = aa3;
            continue; /* Loop/switch isn't completed */
_L15:
            i = kt1.c();
            if (true) goto _L16; else goto _L29
_L29:
        }

        public final void a(ku ku1)
            throws IOException
        {
            boolean flag = false;
            ku1.a(1, a);
            if (!b.equals(""))
            {
                ku1.a(2, b);
            }
            if (c != null && c.length > 0)
            {
                for (int i1 = 0; i1 < c.length; i1++)
                {
                    a a1 = c[i1];
                    if (a1 != null)
                    {
                        ku1.a(3, a1);
                    }
                }

            }
            if (d != null && d.length > 0)
            {
                for (int j1 = 0; j1 < d.length; j1++)
                {
                    a a2 = d[j1];
                    if (a2 != null)
                    {
                        ku1.a(4, a2);
                    }
                }

            }
            if (e != null && e.length > 0)
            {
                for (int k1 = 0; k1 < e.length; k1++)
                {
                    a a3 = e[k1];
                    if (a3 != null)
                    {
                        ku1.a(5, a3);
                    }
                }

            }
            if (!f.equals(""))
            {
                ku1.a(6, f);
            }
            if (!g.equals(""))
            {
                ku1.a(7, g);
            }
            if (h != 0L)
            {
                ku1.a(8, h);
            }
            if (l)
            {
                ku1.a(9, l);
            }
            if (k != null && k.length > 0)
            {
                for (int l1 = 0; l1 < k.length; l1++)
                {
                    ku1.a(10, k[l1]);
                }

            }
            if (j != null && j.length > 0)
            {
                for (int i2 = ((flag) ? 1 : 0); i2 < j.length; i2++)
                {
                    a a4 = j[i2];
                    if (a4 != null)
                    {
                        ku1.a(11, a4);
                    }
                }

            }
            if (i)
            {
                ku1.a(12, i);
            }
            super.a(ku1);
        }

        public final boolean equals(Object obj)
        {
            boolean flag1 = false;
            if (obj != this) goto _L2; else goto _L1
_L1:
            boolean flag = true;
_L4:
            return flag;
_L2:
            flag = flag1;
            if (!(obj instanceof a)) goto _L4; else goto _L3
_L3:
            obj = (a)obj;
            flag = flag1;
            if (a != ((a) (obj)).a) goto _L4; else goto _L5
_L5:
            if (b != null) goto _L7; else goto _L6
_L6:
            flag = flag1;
            if (((a) (obj)).b != null) goto _L4; else goto _L8
_L8:
            flag = flag1;
            if (!kz.a(c, ((a) (obj)).c)) goto _L4; else goto _L9
_L9:
            flag = flag1;
            if (!kz.a(d, ((a) (obj)).d)) goto _L4; else goto _L10
_L10:
            flag = flag1;
            if (!kz.a(e, ((a) (obj)).e)) goto _L4; else goto _L11
_L11:
            if (f != null) goto _L13; else goto _L12
_L12:
            flag = flag1;
            if (((a) (obj)).f != null) goto _L4; else goto _L14
_L14:
            if (g != null)
            {
                break MISSING_BLOCK_LABEL_244;
            }
            flag = flag1;
            if (((a) (obj)).g != null) goto _L4; else goto _L15
_L15:
            flag = flag1;
            if (h == ((a) (obj)).h)
            {
                flag = flag1;
                if (i == ((a) (obj)).i)
                {
                    flag = flag1;
                    if (kz.a(j, ((a) (obj)).j))
                    {
                        flag = flag1;
                        if (kz.a(k, ((a) (obj)).k))
                        {
                            flag = flag1;
                            if (l == ((a) (obj)).l)
                            {
                                return a(((kv) (obj)));
                            }
                        }
                    }
                }
            }
              goto _L4
_L7:
            if (!b.equals(((a) (obj)).b))
            {
                return false;
            }
              goto _L8
_L13:
            if (!f.equals(((a) (obj)).f))
            {
                return false;
            }
              goto _L14
            if (!g.equals(((a) (obj)).g))
            {
                return false;
            }
              goto _L15
        }

        public final int hashCode()
        {
            char c2 = '\u04CF';
            int k1 = 0;
            int l1 = a;
            int i1;
            int j1;
            char c1;
            int i2;
            int j2;
            int k2;
            int l2;
            int i3;
            int j3;
            if (b == null)
            {
                i1 = 0;
            } else
            {
                i1 = b.hashCode();
            }
            i2 = kz.a(c);
            j2 = kz.a(d);
            k2 = kz.a(e);
            if (f == null)
            {
                j1 = 0;
            } else
            {
                j1 = f.hashCode();
            }
            if (g != null)
            {
                k1 = g.hashCode();
            }
            l2 = (int)(h ^ h >>> 32);
            if (i)
            {
                c1 = '\u04CF';
            } else
            {
                c1 = '\u04D5';
            }
            i3 = kz.a(j);
            j3 = kz.a(k);
            if (!l)
            {
                c2 = '\u04D5';
            }
            return ((((c1 + (((j1 + ((((i1 + (l1 + 527) * 31) * 31 + i2) * 31 + j2) * 31 + k2) * 31) * 31 + k1) * 31 + l2) * 31) * 31 + i3) * 31 + j3) * 31 + c2) * 31 + c();
        }

        public a()
        {
            a = 1;
            b = "";
            c = b();
            d = b();
            e = b();
            f = "";
            g = "";
            h = 0L;
            i = false;
            j = b();
            k = lf.a;
            l = false;
            r = null;
            s = -1;
        }
    }

}
