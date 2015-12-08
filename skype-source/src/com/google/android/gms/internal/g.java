// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            kv, ku, kt, lb, 
//            lf, kz

public interface com.google.android.gms.internal.g
{
    public static final class a extends kv
    {

        public int a;
        public int b;
        public int c;

        protected final int a()
        {
            int k = super.a();
            int j = k;
            if (a != 1)
            {
                j = k + ku.b(1, a);
            }
            k = j;
            if (b != 0)
            {
                k = j + ku.b(2, b);
            }
            j = k;
            if (c != 0)
            {
                j = k + ku.b(3, c);
            }
            return j;
        }

        public final lb a(kt kt1)
            throws IOException
        {
_L6:
            int j = kt1.a();
            j;
            JVM INSTR lookupswitch 4: default 48
        //                       0: 57
        //                       8: 59
        //                       16: 103
        //                       24: 114;
               goto _L1 _L2 _L3 _L4 _L5
_L1:
            if (a(kt1, j)) goto _L6; else goto _L2
_L2:
            return this;
_L3:
            int k = kt1.f();
            switch (k)
            {
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
                a = k;
                break;
            }
            continue; /* Loop/switch isn't completed */
_L4:
            b = kt1.f();
            continue; /* Loop/switch isn't completed */
_L5:
            c = kt1.f();
            if (true) goto _L6; else goto _L7
_L7:
        }

        public final void a(ku ku1)
            throws IOException
        {
            if (a != 1)
            {
                ku1.a(1, a);
            }
            if (b != 0)
            {
                ku1.a(2, b);
            }
            if (c != 0)
            {
                ku1.a(3, c);
            }
            super.a(ku1);
        }

        public final boolean equals(Object obj)
        {
            boolean flag1 = false;
            boolean flag;
            if (obj == this)
            {
                flag = true;
            } else
            {
                flag = flag1;
                if (obj instanceof a)
                {
                    obj = (a)obj;
                    flag = flag1;
                    if (a == ((a) (obj)).a)
                    {
                        flag = flag1;
                        if (b == ((a) (obj)).b)
                        {
                            flag = flag1;
                            if (c == ((a) (obj)).c)
                            {
                                return a(((kv) (obj)));
                            }
                        }
                    }
                }
            }
            return flag;
        }

        public final int hashCode()
        {
            return (((a + 527) * 31 + b) * 31 + c) * 31 + c();
        }

        public a()
        {
            a = 1;
            b = 0;
            c = 0;
            r = null;
            s = -1;
        }
    }

    public static final class b extends kv
    {

        private static volatile b f[];
        public int a[];
        public int b;
        public int c;
        public boolean d;
        public boolean e;

        public static b[] b()
        {
            if (f == null)
            {
                synchronized (kz.a)
                {
                    if (f == null)
                    {
                        f = new b[0];
                    }
                }
            }
            return f;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        protected final int a()
        {
            int k = 0;
            int l = super.a();
            int j = l;
            if (e)
            {
                j = l + (ku.c(1) + 1);
            }
            l = ku.b(2, b) + j;
            if (a != null && a.length > 0)
            {
                for (j = 0; j < a.length; j++)
                {
                    k += ku.a(a[j]);
                }

                k = l + k + a.length * 1;
            } else
            {
                k = l;
            }
            j = k;
            if (c != 0)
            {
                j = k + ku.b(4, c);
            }
            k = j;
            if (d)
            {
                k = j + (ku.c(6) + 1);
            }
            return k;
        }

        public final lb a(kt kt1)
            throws IOException
        {
            do
            {
                int j = kt1.a();
                switch (j)
                {
                default:
                    if (a(kt1, j))
                    {
                        continue;
                    }
                    // fall through

                case 0: // '\0'
                    return this;

                case 8: // '\b'
                    e = kt1.c();
                    break;

                case 16: // '\020'
                    b = kt1.f();
                    break;

                case 24: // '\030'
                    int i1 = lf.a(kt1, 24);
                    int ai[];
                    int k;
                    if (a == null)
                    {
                        k = 0;
                    } else
                    {
                        k = a.length;
                    }
                    ai = new int[i1 + k];
                    i1 = k;
                    if (k != 0)
                    {
                        System.arraycopy(a, 0, ai, 0, k);
                        i1 = k;
                    }
                    for (; i1 < ai.length - 1; i1++)
                    {
                        ai[i1] = kt1.f();
                        kt1.a();
                    }

                    ai[i1] = kt1.f();
                    a = ai;
                    break;

                case 26: // '\032'
                    int k1 = kt1.c(kt1.f());
                    int l = kt1.j();
                    int j1;
                    for (j1 = 0; kt1.i() > 0; j1++)
                    {
                        kt1.f();
                    }

                    kt1.e(l);
                    int ai1[];
                    if (a == null)
                    {
                        l = 0;
                    } else
                    {
                        l = a.length;
                    }
                    ai1 = new int[j1 + l];
                    j1 = l;
                    if (l != 0)
                    {
                        System.arraycopy(a, 0, ai1, 0, l);
                        j1 = l;
                    }
                    for (; j1 < ai1.length; j1++)
                    {
                        ai1[j1] = kt1.f();
                    }

                    a = ai1;
                    kt1.d(k1);
                    break;

                case 32: // ' '
                    c = kt1.f();
                    break;

                case 48: // '0'
                    d = kt1.c();
                    break;
                }
            } while (true);
        }

        public final void a(ku ku1)
            throws IOException
        {
            if (e)
            {
                ku1.a(1, e);
            }
            ku1.a(2, b);
            if (a != null && a.length > 0)
            {
                for (int j = 0; j < a.length; j++)
                {
                    ku1.a(3, a[j]);
                }

            }
            if (c != 0)
            {
                ku1.a(4, c);
            }
            if (d)
            {
                ku1.a(6, d);
            }
            super.a(ku1);
        }

        public final boolean equals(Object obj)
        {
            boolean flag1 = false;
            boolean flag;
            if (obj == this)
            {
                flag = true;
            } else
            {
                flag = flag1;
                if (obj instanceof b)
                {
                    obj = (b)obj;
                    flag = flag1;
                    if (kz.a(a, ((b) (obj)).a))
                    {
                        flag = flag1;
                        if (b == ((b) (obj)).b)
                        {
                            flag = flag1;
                            if (c == ((b) (obj)).c)
                            {
                                flag = flag1;
                                if (d == ((b) (obj)).d)
                                {
                                    flag = flag1;
                                    if (e == ((b) (obj)).e)
                                    {
                                        return a(((kv) (obj)));
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return flag;
        }

        public final int hashCode()
        {
            char c2 = '\u04CF';
            int j = kz.a(a);
            int k = b;
            int l = c;
            char c1;
            if (d)
            {
                c1 = '\u04CF';
            } else
            {
                c1 = '\u04D5';
            }
            if (!e)
            {
                c2 = '\u04D5';
            }
            return ((c1 + (((j + 527) * 31 + k) * 31 + l) * 31) * 31 + c2) * 31 + c();
        }

        public b()
        {
            a = lf.a;
            b = 0;
            c = 0;
            d = false;
            e = false;
            r = null;
            s = -1;
        }
    }

    public static final class c extends kv
    {

        private static volatile c f[];
        public String a;
        public long b;
        public long c;
        public boolean d;
        public long e;

        public static c[] b()
        {
            if (f == null)
            {
                synchronized (kz.a)
                {
                    if (f == null)
                    {
                        f = new c[0];
                    }
                }
            }
            return f;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        protected final int a()
        {
            int k = super.a();
            int j = k;
            if (!a.equals(""))
            {
                j = k + ku.b(1, a);
            }
            k = j;
            if (b != 0L)
            {
                k = j + ku.b(2, b);
            }
            j = k;
            if (c != 0x7fffffffL)
            {
                j = k + ku.b(3, c);
            }
            k = j;
            if (d)
            {
                k = j + (ku.c(4) + 1);
            }
            j = k;
            if (e != 0L)
            {
                j = k + ku.b(5, e);
            }
            return j;
        }

        public final lb a(kt kt1)
            throws IOException
        {
            do
            {
                int j = kt1.a();
                switch (j)
                {
                default:
                    if (a(kt1, j))
                    {
                        continue;
                    }
                    // fall through

                case 0: // '\0'
                    return this;

                case 10: // '\n'
                    a = kt1.d();
                    break;

                case 16: // '\020'
                    b = kt1.b();
                    break;

                case 24: // '\030'
                    c = kt1.b();
                    break;

                case 32: // ' '
                    d = kt1.c();
                    break;

                case 40: // '('
                    e = kt1.b();
                    break;
                }
            } while (true);
        }

        public final void a(ku ku1)
            throws IOException
        {
            if (!a.equals(""))
            {
                ku1.a(1, a);
            }
            if (b != 0L)
            {
                ku1.a(2, b);
            }
            if (c != 0x7fffffffL)
            {
                ku1.a(3, c);
            }
            if (d)
            {
                ku1.a(4, d);
            }
            if (e != 0L)
            {
                ku1.a(5, e);
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
            if (!(obj instanceof c))
            {
                continue; /* Loop/switch isn't completed */
            }
            obj = (c)obj;
            if (a != null)
            {
                break; /* Loop/switch isn't completed */
            }
            flag = flag1;
            if (((c) (obj)).a != null)
            {
                continue; /* Loop/switch isn't completed */
            }
_L5:
            flag = flag1;
            if (b == ((c) (obj)).b)
            {
                flag = flag1;
                if (c == ((c) (obj)).c)
                {
                    flag = flag1;
                    if (d == ((c) (obj)).d)
                    {
                        flag = flag1;
                        if (e == ((c) (obj)).e)
                        {
                            return a(((kv) (obj)));
                        }
                    }
                }
            }
            if (true) goto _L4; else goto _L3
_L3:
            if (!a.equals(((c) (obj)).a))
            {
                return false;
            }
              goto _L5
            if (true) goto _L4; else goto _L6
_L6:
        }

        public final int hashCode()
        {
            int j;
            char c1;
            int k;
            int l;
            if (a == null)
            {
                j = 0;
            } else
            {
                j = a.hashCode();
            }
            k = (int)(b ^ b >>> 32);
            l = (int)(c ^ c >>> 32);
            if (d)
            {
                c1 = '\u04CF';
            } else
            {
                c1 = '\u04D5';
            }
            return ((c1 + (((j + 527) * 31 + k) * 31 + l) * 31) * 31 + (int)(e ^ e >>> 32)) * 31 + c();
        }

        public c()
        {
            a = "";
            b = 0L;
            c = 0x7fffffffL;
            d = false;
            e = 0L;
            r = null;
            s = -1;
        }
    }

    public static final class d extends kv
    {

        public h.a a[];
        public h.a b[];
        public c c[];

        protected final int a()
        {
            boolean flag = false;
            int j = super.a();
            int k = j;
            if (a != null)
            {
                k = j;
                if (a.length > 0)
                {
                    for (k = 0; k < a.length;)
                    {
                        h.a a1 = a[k];
                        int j1 = j;
                        if (a1 != null)
                        {
                            j1 = j + ku.b(1, a1);
                        }
                        k++;
                        j = j1;
                    }

                    k = j;
                }
            }
            j = k;
            if (b != null)
            {
                j = k;
                if (b.length > 0)
                {
                    j = k;
                    for (int l = 0; l < b.length;)
                    {
                        h.a a2 = b[l];
                        int k1 = j;
                        if (a2 != null)
                        {
                            k1 = j + ku.b(2, a2);
                        }
                        l++;
                        j = k1;
                    }

                }
            }
            int l1 = j;
            if (c != null)
            {
                l1 = j;
                if (c.length > 0)
                {
                    int i1 = ((flag) ? 1 : 0);
                    do
                    {
                        l1 = j;
                        if (i1 >= c.length)
                        {
                            break;
                        }
                        c c1 = c[i1];
                        l1 = j;
                        if (c1 != null)
                        {
                            l1 = j + ku.b(3, c1);
                        }
                        i1++;
                        j = l1;
                    } while (true);
                }
            }
            return l1;
        }

        public final lb a(kt kt1)
            throws IOException
        {
            do
            {
                int j = kt1.a();
                switch (j)
                {
                default:
                    if (a(kt1, j))
                    {
                        continue;
                    }
                    // fall through

                case 0: // '\0'
                    return this;

                case 10: // '\n'
                    int j1 = lf.a(kt1, 10);
                    h.a aa[];
                    int k;
                    if (a == null)
                    {
                        k = 0;
                    } else
                    {
                        k = a.length;
                    }
                    aa = new h.a[j1 + k];
                    j1 = k;
                    if (k != 0)
                    {
                        System.arraycopy(a, 0, aa, 0, k);
                        j1 = k;
                    }
                    for (; j1 < aa.length - 1; j1++)
                    {
                        aa[j1] = new h.a();
                        kt1.a(aa[j1]);
                        kt1.a();
                    }

                    aa[j1] = new h.a();
                    kt1.a(aa[j1]);
                    a = aa;
                    break;

                case 18: // '\022'
                    int k1 = lf.a(kt1, 18);
                    h.a aa1[];
                    int l;
                    if (b == null)
                    {
                        l = 0;
                    } else
                    {
                        l = b.length;
                    }
                    aa1 = new h.a[k1 + l];
                    k1 = l;
                    if (l != 0)
                    {
                        System.arraycopy(b, 0, aa1, 0, l);
                        k1 = l;
                    }
                    for (; k1 < aa1.length - 1; k1++)
                    {
                        aa1[k1] = new h.a();
                        kt1.a(aa1[k1]);
                        kt1.a();
                    }

                    aa1[k1] = new h.a();
                    kt1.a(aa1[k1]);
                    b = aa1;
                    break;

                case 26: // '\032'
                    int l1 = lf.a(kt1, 26);
                    c ac[];
                    int i1;
                    if (c == null)
                    {
                        i1 = 0;
                    } else
                    {
                        i1 = c.length;
                    }
                    ac = new c[l1 + i1];
                    l1 = i1;
                    if (i1 != 0)
                    {
                        System.arraycopy(c, 0, ac, 0, i1);
                        l1 = i1;
                    }
                    for (; l1 < ac.length - 1; l1++)
                    {
                        ac[l1] = new c();
                        kt1.a(ac[l1]);
                        kt1.a();
                    }

                    ac[l1] = new c();
                    kt1.a(ac[l1]);
                    c = ac;
                    break;
                }
            } while (true);
        }

        public final void a(ku ku1)
            throws IOException
        {
            boolean flag = false;
            if (a != null && a.length > 0)
            {
                for (int j = 0; j < a.length; j++)
                {
                    h.a a1 = a[j];
                    if (a1 != null)
                    {
                        ku1.a(1, a1);
                    }
                }

            }
            if (b != null && b.length > 0)
            {
                for (int k = 0; k < b.length; k++)
                {
                    h.a a2 = b[k];
                    if (a2 != null)
                    {
                        ku1.a(2, a2);
                    }
                }

            }
            if (c != null && c.length > 0)
            {
                for (int l = ((flag) ? 1 : 0); l < c.length; l++)
                {
                    c c1 = c[l];
                    if (c1 != null)
                    {
                        ku1.a(3, c1);
                    }
                }

            }
            super.a(ku1);
        }

        public final boolean equals(Object obj)
        {
            boolean flag1 = false;
            boolean flag;
            if (obj == this)
            {
                flag = true;
            } else
            {
                flag = flag1;
                if (obj instanceof d)
                {
                    obj = (d)obj;
                    flag = flag1;
                    if (kz.a(a, ((d) (obj)).a))
                    {
                        flag = flag1;
                        if (kz.a(b, ((d) (obj)).b))
                        {
                            flag = flag1;
                            if (kz.a(c, ((d) (obj)).c))
                            {
                                return a(((kv) (obj)));
                            }
                        }
                    }
                }
            }
            return flag;
        }

        public final int hashCode()
        {
            return (((kz.a(a) + 527) * 31 + kz.a(b)) * 31 + kz.a(c)) * 31 + c();
        }

        public d()
        {
            a = com.google.android.gms.internal.h.a.b();
            b = com.google.android.gms.internal.h.a.b();
            c = c.b();
            r = null;
            s = -1;
        }
    }

    public static final class e extends kv
    {

        private static volatile e c[];
        public int a;
        public int b;

        public static e[] b()
        {
            if (c == null)
            {
                synchronized (kz.a)
                {
                    if (c == null)
                    {
                        c = new e[0];
                    }
                }
            }
            return c;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        protected final int a()
        {
            return super.a() + ku.b(1, a) + ku.b(2, b);
        }

        public final lb a(kt kt1)
            throws IOException
        {
            do
            {
                int j = kt1.a();
                switch (j)
                {
                default:
                    if (a(kt1, j))
                    {
                        continue;
                    }
                    // fall through

                case 0: // '\0'
                    return this;

                case 8: // '\b'
                    a = kt1.f();
                    break;

                case 16: // '\020'
                    b = kt1.f();
                    break;
                }
            } while (true);
        }

        public final void a(ku ku1)
            throws IOException
        {
            ku1.a(1, a);
            ku1.a(2, b);
            super.a(ku1);
        }

        public final boolean equals(Object obj)
        {
            boolean flag1 = false;
            boolean flag;
            if (obj == this)
            {
                flag = true;
            } else
            {
                flag = flag1;
                if (obj instanceof e)
                {
                    obj = (e)obj;
                    flag = flag1;
                    if (a == ((e) (obj)).a)
                    {
                        flag = flag1;
                        if (b == ((e) (obj)).b)
                        {
                            return a(((kv) (obj)));
                        }
                    }
                }
            }
            return flag;
        }

        public final int hashCode()
        {
            return ((a + 527) * 31 + b) * 31 + c();
        }

        public e()
        {
            a = 0;
            b = 0;
            r = null;
            s = -1;
        }
    }

    public static final class f extends kv
    {

        public String a[];
        public String b[];
        public h.a c[];
        public e d[];
        public b e[];
        public b f[];
        public b g[];
        public g h[];
        public String i;
        public String j;
        public String k;
        public String l;
        public a m;
        public float n;
        public boolean o;
        public String p[];
        public int q;

        protected final int a()
        {
            boolean flag = false;
            int k5 = super.a();
            int j1;
            int k1;
            int k3;
            if (b != null && b.length > 0)
            {
                int i1 = 0;
                k1 = 0;
                int l1;
                int i4;
                for (l1 = 0; i1 < b.length; l1 = i4)
                {
                    String s = b[i1];
                    int l4 = k1;
                    i4 = l1;
                    if (s != null)
                    {
                        i4 = l1 + 1;
                        l4 = k1 + ku.a(s);
                    }
                    i1++;
                    k1 = l4;
                }

                k1 = k5 + k1 + l1 * 1;
            } else
            {
                k1 = k5;
            }
            j1 = k1;
            if (c != null)
            {
                j1 = k1;
                if (c.length > 0)
                {
                    j1 = k1;
                    for (k1 = 0; k1 < c.length;)
                    {
                        h.a a1 = c[k1];
                        int i2 = j1;
                        if (a1 != null)
                        {
                            i2 = j1 + ku.b(2, a1);
                        }
                        k1++;
                        j1 = i2;
                    }

                }
            }
            k1 = j1;
            if (d != null)
            {
                k1 = j1;
                if (d.length > 0)
                {
                    for (k1 = 0; k1 < d.length;)
                    {
                        e e1 = d[k1];
                        int j2 = j1;
                        if (e1 != null)
                        {
                            j2 = j1 + ku.b(3, e1);
                        }
                        k1++;
                        j1 = j2;
                    }

                    k1 = j1;
                }
            }
            j1 = k1;
            if (e != null)
            {
                j1 = k1;
                if (e.length > 0)
                {
                    j1 = k1;
                    for (k1 = 0; k1 < e.length;)
                    {
                        b b1 = e[k1];
                        int k2 = j1;
                        if (b1 != null)
                        {
                            k2 = j1 + ku.b(4, b1);
                        }
                        k1++;
                        j1 = k2;
                    }

                }
            }
            k1 = j1;
            if (f != null)
            {
                k1 = j1;
                if (f.length > 0)
                {
                    for (k1 = 0; k1 < f.length;)
                    {
                        b b2 = f[k1];
                        int l2 = j1;
                        if (b2 != null)
                        {
                            l2 = j1 + ku.b(5, b2);
                        }
                        k1++;
                        j1 = l2;
                    }

                    k1 = j1;
                }
            }
            j1 = k1;
            if (g != null)
            {
                j1 = k1;
                if (g.length > 0)
                {
                    j1 = k1;
                    for (k1 = 0; k1 < g.length;)
                    {
                        b b3 = g[k1];
                        int i3 = j1;
                        if (b3 != null)
                        {
                            i3 = j1 + ku.b(6, b3);
                        }
                        k1++;
                        j1 = i3;
                    }

                }
            }
            k1 = j1;
            if (h != null)
            {
                k1 = j1;
                if (h.length > 0)
                {
                    for (k1 = 0; k1 < h.length;)
                    {
                        g g1 = h[k1];
                        int j3 = j1;
                        if (g1 != null)
                        {
                            j3 = j1 + ku.b(7, g1);
                        }
                        k1++;
                        j1 = j3;
                    }

                    k1 = j1;
                }
            }
            j1 = k1;
            if (!i.equals(""))
            {
                j1 = k1 + ku.b(9, i);
            }
            k1 = j1;
            if (!j.equals(""))
            {
                k1 = j1 + ku.b(10, j);
            }
            j1 = k1;
            if (!k.equals("0"))
            {
                j1 = k1 + ku.b(12, k);
            }
            k1 = j1;
            if (!l.equals(""))
            {
                k1 = j1 + ku.b(13, l);
            }
            k3 = k1;
            if (m != null)
            {
                k3 = k1 + ku.b(14, m);
            }
            j1 = k3;
            if (Float.floatToIntBits(n) != Float.floatToIntBits(0.0F))
            {
                j1 = k3 + (ku.c(15) + 4);
            }
            k1 = j1;
            if (p != null)
            {
                k1 = j1;
                if (p.length > 0)
                {
                    k1 = 0;
                    k3 = 0;
                    int j4;
                    int i5;
                    for (j4 = 0; k1 < p.length; j4 = i5)
                    {
                        String s1 = p[k1];
                        k5 = k3;
                        i5 = j4;
                        if (s1 != null)
                        {
                            i5 = j4 + 1;
                            k5 = k3 + ku.a(s1);
                        }
                        k1++;
                        k3 = k5;
                    }

                    k1 = j1 + k3 + j4 * 2;
                }
            }
            k3 = k1;
            if (q != 0)
            {
                k3 = k1 + ku.b(17, q);
            }
            j1 = k3;
            if (o)
            {
                j1 = k3 + (ku.c(18) + 1);
            }
            k1 = j1;
            if (a != null)
            {
                k1 = j1;
                if (a.length > 0)
                {
                    int l3 = 0;
                    int k4 = 0;
                    for (k1 = ((flag) ? 1 : 0); k1 < a.length;)
                    {
                        String s2 = a[k1];
                        k5 = l3;
                        int j5 = k4;
                        if (s2 != null)
                        {
                            j5 = k4 + 1;
                            k5 = l3 + ku.a(s2);
                        }
                        k1++;
                        l3 = k5;
                        k4 = j5;
                    }

                    k1 = j1 + l3 + k4 * 2;
                }
            }
            return k1;
        }

        public final lb a(kt kt1)
            throws IOException
        {
            do
            {
                int i1 = kt1.a();
                switch (i1)
                {
                default:
                    if (a(kt1, i1))
                    {
                        continue;
                    }
                    // fall through

                case 0: // '\0'
                    return this;

                case 10: // '\n'
                    int k3 = lf.a(kt1, 10);
                    String as[];
                    int j1;
                    if (b == null)
                    {
                        j1 = 0;
                    } else
                    {
                        j1 = b.length;
                    }
                    as = new String[k3 + j1];
                    k3 = j1;
                    if (j1 != 0)
                    {
                        System.arraycopy(b, 0, as, 0, j1);
                        k3 = j1;
                    }
                    for (; k3 < as.length - 1; k3++)
                    {
                        as[k3] = kt1.d();
                        kt1.a();
                    }

                    as[k3] = kt1.d();
                    b = as;
                    break;

                case 18: // '\022'
                    int l3 = lf.a(kt1, 18);
                    h.a aa[];
                    int k1;
                    if (c == null)
                    {
                        k1 = 0;
                    } else
                    {
                        k1 = c.length;
                    }
                    aa = new h.a[l3 + k1];
                    l3 = k1;
                    if (k1 != 0)
                    {
                        System.arraycopy(c, 0, aa, 0, k1);
                        l3 = k1;
                    }
                    for (; l3 < aa.length - 1; l3++)
                    {
                        aa[l3] = new h.a();
                        kt1.a(aa[l3]);
                        kt1.a();
                    }

                    aa[l3] = new h.a();
                    kt1.a(aa[l3]);
                    c = aa;
                    break;

                case 26: // '\032'
                    int i4 = lf.a(kt1, 26);
                    e ae[];
                    int l1;
                    if (d == null)
                    {
                        l1 = 0;
                    } else
                    {
                        l1 = d.length;
                    }
                    ae = new e[i4 + l1];
                    i4 = l1;
                    if (l1 != 0)
                    {
                        System.arraycopy(d, 0, ae, 0, l1);
                        i4 = l1;
                    }
                    for (; i4 < ae.length - 1; i4++)
                    {
                        ae[i4] = new e();
                        kt1.a(ae[i4]);
                        kt1.a();
                    }

                    ae[i4] = new e();
                    kt1.a(ae[i4]);
                    d = ae;
                    break;

                case 34: // '"'
                    int j4 = lf.a(kt1, 34);
                    b ab[];
                    int i2;
                    if (e == null)
                    {
                        i2 = 0;
                    } else
                    {
                        i2 = e.length;
                    }
                    ab = new b[j4 + i2];
                    j4 = i2;
                    if (i2 != 0)
                    {
                        System.arraycopy(e, 0, ab, 0, i2);
                        j4 = i2;
                    }
                    for (; j4 < ab.length - 1; j4++)
                    {
                        ab[j4] = new b();
                        kt1.a(ab[j4]);
                        kt1.a();
                    }

                    ab[j4] = new b();
                    kt1.a(ab[j4]);
                    e = ab;
                    break;

                case 42: // '*'
                    int k4 = lf.a(kt1, 42);
                    b ab1[];
                    int j2;
                    if (f == null)
                    {
                        j2 = 0;
                    } else
                    {
                        j2 = f.length;
                    }
                    ab1 = new b[k4 + j2];
                    k4 = j2;
                    if (j2 != 0)
                    {
                        System.arraycopy(f, 0, ab1, 0, j2);
                        k4 = j2;
                    }
                    for (; k4 < ab1.length - 1; k4++)
                    {
                        ab1[k4] = new b();
                        kt1.a(ab1[k4]);
                        kt1.a();
                    }

                    ab1[k4] = new b();
                    kt1.a(ab1[k4]);
                    f = ab1;
                    break;

                case 50: // '2'
                    int l4 = lf.a(kt1, 50);
                    b ab2[];
                    int k2;
                    if (g == null)
                    {
                        k2 = 0;
                    } else
                    {
                        k2 = g.length;
                    }
                    ab2 = new b[l4 + k2];
                    l4 = k2;
                    if (k2 != 0)
                    {
                        System.arraycopy(g, 0, ab2, 0, k2);
                        l4 = k2;
                    }
                    for (; l4 < ab2.length - 1; l4++)
                    {
                        ab2[l4] = new b();
                        kt1.a(ab2[l4]);
                        kt1.a();
                    }

                    ab2[l4] = new b();
                    kt1.a(ab2[l4]);
                    g = ab2;
                    break;

                case 58: // ':'
                    int i5 = lf.a(kt1, 58);
                    g ag[];
                    int l2;
                    if (h == null)
                    {
                        l2 = 0;
                    } else
                    {
                        l2 = h.length;
                    }
                    ag = new g[i5 + l2];
                    i5 = l2;
                    if (l2 != 0)
                    {
                        System.arraycopy(h, 0, ag, 0, l2);
                        i5 = l2;
                    }
                    for (; i5 < ag.length - 1; i5++)
                    {
                        ag[i5] = new g();
                        kt1.a(ag[i5]);
                        kt1.a();
                    }

                    ag[i5] = new g();
                    kt1.a(ag[i5]);
                    h = ag;
                    break;

                case 74: // 'J'
                    i = kt1.d();
                    break;

                case 82: // 'R'
                    j = kt1.d();
                    break;

                case 98: // 'b'
                    k = kt1.d();
                    break;

                case 106: // 'j'
                    l = kt1.d();
                    break;

                case 114: // 'r'
                    if (m == null)
                    {
                        m = new a();
                    }
                    kt1.a(m);
                    break;

                case 125: // '}'
                    n = Float.intBitsToFloat(kt1.g());
                    break;

                case 130: 
                    int j5 = lf.a(kt1, 130);
                    String as1[];
                    int i3;
                    if (p == null)
                    {
                        i3 = 0;
                    } else
                    {
                        i3 = p.length;
                    }
                    as1 = new String[j5 + i3];
                    j5 = i3;
                    if (i3 != 0)
                    {
                        System.arraycopy(p, 0, as1, 0, i3);
                        j5 = i3;
                    }
                    for (; j5 < as1.length - 1; j5++)
                    {
                        as1[j5] = kt1.d();
                        kt1.a();
                    }

                    as1[j5] = kt1.d();
                    p = as1;
                    break;

                case 136: 
                    q = kt1.f();
                    break;

                case 144: 
                    o = kt1.c();
                    break;

                case 154: 
                    int k5 = lf.a(kt1, 154);
                    String as2[];
                    int j3;
                    if (a == null)
                    {
                        j3 = 0;
                    } else
                    {
                        j3 = a.length;
                    }
                    as2 = new String[k5 + j3];
                    k5 = j3;
                    if (j3 != 0)
                    {
                        System.arraycopy(a, 0, as2, 0, j3);
                        k5 = j3;
                    }
                    for (; k5 < as2.length - 1; k5++)
                    {
                        as2[k5] = kt1.d();
                        kt1.a();
                    }

                    as2[k5] = kt1.d();
                    a = as2;
                    break;
                }
            } while (true);
        }

        public final void a(ku ku1)
            throws IOException
        {
            boolean flag = false;
            if (b != null && b.length > 0)
            {
                for (int i1 = 0; i1 < b.length; i1++)
                {
                    String s = b[i1];
                    if (s != null)
                    {
                        ku1.a(1, s);
                    }
                }

            }
            if (c != null && c.length > 0)
            {
                for (int j1 = 0; j1 < c.length; j1++)
                {
                    h.a a1 = c[j1];
                    if (a1 != null)
                    {
                        ku1.a(2, a1);
                    }
                }

            }
            if (d != null && d.length > 0)
            {
                for (int k1 = 0; k1 < d.length; k1++)
                {
                    e e1 = d[k1];
                    if (e1 != null)
                    {
                        ku1.a(3, e1);
                    }
                }

            }
            if (e != null && e.length > 0)
            {
                for (int l1 = 0; l1 < e.length; l1++)
                {
                    b b1 = e[l1];
                    if (b1 != null)
                    {
                        ku1.a(4, b1);
                    }
                }

            }
            if (f != null && f.length > 0)
            {
                for (int i2 = 0; i2 < f.length; i2++)
                {
                    b b2 = f[i2];
                    if (b2 != null)
                    {
                        ku1.a(5, b2);
                    }
                }

            }
            if (g != null && g.length > 0)
            {
                for (int j2 = 0; j2 < g.length; j2++)
                {
                    b b3 = g[j2];
                    if (b3 != null)
                    {
                        ku1.a(6, b3);
                    }
                }

            }
            if (h != null && h.length > 0)
            {
                for (int k2 = 0; k2 < h.length; k2++)
                {
                    g g1 = h[k2];
                    if (g1 != null)
                    {
                        ku1.a(7, g1);
                    }
                }

            }
            if (!i.equals(""))
            {
                ku1.a(9, i);
            }
            if (!j.equals(""))
            {
                ku1.a(10, j);
            }
            if (!k.equals("0"))
            {
                ku1.a(12, k);
            }
            if (!l.equals(""))
            {
                ku1.a(13, l);
            }
            if (m != null)
            {
                ku1.a(14, m);
            }
            if (Float.floatToIntBits(n) != Float.floatToIntBits(0.0F))
            {
                ku1.a(15, n);
            }
            if (p != null && p.length > 0)
            {
                for (int l2 = 0; l2 < p.length; l2++)
                {
                    String s1 = p[l2];
                    if (s1 != null)
                    {
                        ku1.a(16, s1);
                    }
                }

            }
            if (q != 0)
            {
                ku1.a(17, q);
            }
            if (o)
            {
                ku1.a(18, o);
            }
            if (a != null && a.length > 0)
            {
                for (int i3 = ((flag) ? 1 : 0); i3 < a.length; i3++)
                {
                    String s2 = a[i3];
                    if (s2 != null)
                    {
                        ku1.a(19, s2);
                    }
                }

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
            if (!(obj instanceof f)) goto _L4; else goto _L3
_L3:
            obj = (f)obj;
            flag = flag1;
            if (!kz.a(a, ((f) (obj)).a)) goto _L4; else goto _L5
_L5:
            flag = flag1;
            if (!kz.a(b, ((f) (obj)).b)) goto _L4; else goto _L6
_L6:
            flag = flag1;
            if (!kz.a(c, ((f) (obj)).c)) goto _L4; else goto _L7
_L7:
            flag = flag1;
            if (!kz.a(d, ((f) (obj)).d)) goto _L4; else goto _L8
_L8:
            flag = flag1;
            if (!kz.a(e, ((f) (obj)).e)) goto _L4; else goto _L9
_L9:
            flag = flag1;
            if (!kz.a(f, ((f) (obj)).f)) goto _L4; else goto _L10
_L10:
            flag = flag1;
            if (!kz.a(g, ((f) (obj)).g)) goto _L4; else goto _L11
_L11:
            flag = flag1;
            if (!kz.a(h, ((f) (obj)).h)) goto _L4; else goto _L12
_L12:
            if (i != null) goto _L14; else goto _L13
_L13:
            flag = flag1;
            if (((f) (obj)).i != null) goto _L4; else goto _L15
_L15:
            if (j != null) goto _L17; else goto _L16
_L16:
            flag = flag1;
            if (((f) (obj)).j != null) goto _L4; else goto _L18
_L18:
            if (k != null) goto _L20; else goto _L19
_L19:
            flag = flag1;
            if (((f) (obj)).k != null) goto _L4; else goto _L21
_L21:
            if (l != null) goto _L23; else goto _L22
_L22:
            flag = flag1;
            if (((f) (obj)).l != null) goto _L4; else goto _L24
_L24:
            if (m != null)
            {
                break MISSING_BLOCK_LABEL_364;
            }
            flag = flag1;
            if (((f) (obj)).m != null) goto _L4; else goto _L25
_L25:
            flag = flag1;
            if (Float.floatToIntBits(n) == Float.floatToIntBits(((f) (obj)).n))
            {
                flag = flag1;
                if (o == ((f) (obj)).o)
                {
                    flag = flag1;
                    if (kz.a(p, ((f) (obj)).p))
                    {
                        flag = flag1;
                        if (q == ((f) (obj)).q)
                        {
                            return a(((kv) (obj)));
                        }
                    }
                }
            }
              goto _L4
_L14:
            if (!i.equals(((f) (obj)).i))
            {
                return false;
            }
              goto _L15
_L17:
            if (!j.equals(((f) (obj)).j))
            {
                return false;
            }
              goto _L18
_L20:
            if (!k.equals(((f) (obj)).k))
            {
                return false;
            }
              goto _L21
_L23:
            if (!l.equals(((f) (obj)).l))
            {
                return false;
            }
              goto _L24
            if (!m.equals(((f) (obj)).m))
            {
                return false;
            }
              goto _L25
        }

        public final int hashCode()
        {
            int i2 = 0;
            int j2 = kz.a(a);
            int k2 = kz.a(b);
            int l2 = kz.a(c);
            int i3 = kz.a(d);
            int j3 = kz.a(e);
            int k3 = kz.a(f);
            int l3 = kz.a(g);
            int i4 = kz.a(h);
            int i1;
            int j1;
            int k1;
            int l1;
            char c1;
            int j4;
            if (i == null)
            {
                i1 = 0;
            } else
            {
                i1 = i.hashCode();
            }
            if (j == null)
            {
                j1 = 0;
            } else
            {
                j1 = j.hashCode();
            }
            if (k == null)
            {
                k1 = 0;
            } else
            {
                k1 = k.hashCode();
            }
            if (l == null)
            {
                l1 = 0;
            } else
            {
                l1 = l.hashCode();
            }
            if (m != null)
            {
                i2 = m.hashCode();
            }
            j4 = Float.floatToIntBits(n);
            if (o)
            {
                c1 = '\u04CF';
            } else
            {
                c1 = '\u04D5';
            }
            return (((c1 + (((l1 + (k1 + (j1 + (i1 + ((((((((j2 + 527) * 31 + k2) * 31 + l2) * 31 + i3) * 31 + j3) * 31 + k3) * 31 + l3) * 31 + i4) * 31) * 31) * 31) * 31) * 31 + i2) * 31 + j4) * 31) * 31 + kz.a(p)) * 31 + q) * 31 + c();
        }

        public f()
        {
            a = lf.f;
            b = lf.f;
            c = com.google.android.gms.internal.h.a.b();
            d = e.b();
            e = b.b();
            f = b.b();
            g = b.b();
            h = g.b();
            i = "";
            j = "";
            k = "0";
            l = "";
            m = null;
            n = 0.0F;
            o = false;
            p = lf.f;
            q = 0;
            r = null;
            s = -1;
        }
    }

    public static final class g extends kv
    {

        private static volatile g k[];
        public int a[];
        public int b[];
        public int c[];
        public int d[];
        public int e[];
        public int f[];
        public int g[];
        public int h[];
        public int i[];
        public int j[];

        public static g[] b()
        {
            if (k == null)
            {
                synchronized (kz.a)
                {
                    if (k == null)
                    {
                        k = new g[0];
                    }
                }
            }
            return k;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        protected final int a()
        {
            boolean flag = false;
            int k1 = super.a();
            int i1;
            int j1;
            if (a != null && a.length > 0)
            {
                int l = 0;
                j1 = 0;
                for (; l < a.length; l++)
                {
                    j1 += ku.a(a[l]);
                }

                j1 = k1 + j1 + a.length * 1;
            } else
            {
                j1 = k1;
            }
            i1 = j1;
            if (b != null)
            {
                i1 = j1;
                if (b.length > 0)
                {
                    i1 = 0;
                    k1 = 0;
                    for (; i1 < b.length; i1++)
                    {
                        k1 += ku.a(b[i1]);
                    }

                    i1 = j1 + k1 + b.length * 1;
                }
            }
            j1 = i1;
            if (c != null)
            {
                j1 = i1;
                if (c.length > 0)
                {
                    j1 = 0;
                    k1 = 0;
                    for (; j1 < c.length; j1++)
                    {
                        k1 += ku.a(c[j1]);
                    }

                    j1 = i1 + k1 + c.length * 1;
                }
            }
            i1 = j1;
            if (d != null)
            {
                i1 = j1;
                if (d.length > 0)
                {
                    i1 = 0;
                    k1 = 0;
                    for (; i1 < d.length; i1++)
                    {
                        k1 += ku.a(d[i1]);
                    }

                    i1 = j1 + k1 + d.length * 1;
                }
            }
            j1 = i1;
            if (e != null)
            {
                j1 = i1;
                if (e.length > 0)
                {
                    j1 = 0;
                    k1 = 0;
                    for (; j1 < e.length; j1++)
                    {
                        k1 += ku.a(e[j1]);
                    }

                    j1 = i1 + k1 + e.length * 1;
                }
            }
            i1 = j1;
            if (f != null)
            {
                i1 = j1;
                if (f.length > 0)
                {
                    i1 = 0;
                    k1 = 0;
                    for (; i1 < f.length; i1++)
                    {
                        k1 += ku.a(f[i1]);
                    }

                    i1 = j1 + k1 + f.length * 1;
                }
            }
            j1 = i1;
            if (g != null)
            {
                j1 = i1;
                if (g.length > 0)
                {
                    j1 = 0;
                    k1 = 0;
                    for (; j1 < g.length; j1++)
                    {
                        k1 += ku.a(g[j1]);
                    }

                    j1 = i1 + k1 + g.length * 1;
                }
            }
            i1 = j1;
            if (h != null)
            {
                i1 = j1;
                if (h.length > 0)
                {
                    i1 = 0;
                    k1 = 0;
                    for (; i1 < h.length; i1++)
                    {
                        k1 += ku.a(h[i1]);
                    }

                    i1 = j1 + k1 + h.length * 1;
                }
            }
            j1 = i1;
            if (i != null)
            {
                j1 = i1;
                if (i.length > 0)
                {
                    j1 = 0;
                    k1 = 0;
                    for (; j1 < i.length; j1++)
                    {
                        k1 += ku.a(i[j1]);
                    }

                    j1 = i1 + k1 + i.length * 1;
                }
            }
            i1 = j1;
            if (j != null)
            {
                i1 = j1;
                if (j.length > 0)
                {
                    k1 = 0;
                    for (i1 = ((flag) ? 1 : 0); i1 < j.length; i1++)
                    {
                        k1 += ku.a(j[i1]);
                    }

                    i1 = j1 + k1 + j.length * 1;
                }
            }
            return i1;
        }

        public final lb a(kt kt1)
            throws IOException
        {
            do
            {
                int l = kt1.a();
                switch (l)
                {
                default:
                    if (a(kt1, l))
                    {
                        continue;
                    }
                    // fall through

                case 0: // '\0'
                    return this;

                case 8: // '\b'
                    int i6 = lf.a(kt1, 8);
                    int ai[];
                    int i1;
                    if (a == null)
                    {
                        i1 = 0;
                    } else
                    {
                        i1 = a.length;
                    }
                    ai = new int[i6 + i1];
                    i6 = i1;
                    if (i1 != 0)
                    {
                        System.arraycopy(a, 0, ai, 0, i1);
                        i6 = i1;
                    }
                    for (; i6 < ai.length - 1; i6++)
                    {
                        ai[i6] = kt1.f();
                        kt1.a();
                    }

                    ai[i6] = kt1.f();
                    a = ai;
                    break;

                case 10: // '\n'
                    int i11 = kt1.c(kt1.f());
                    int j1 = kt1.j();
                    int j6;
                    for (j6 = 0; kt1.i() > 0; j6++)
                    {
                        kt1.f();
                    }

                    kt1.e(j1);
                    int ai1[];
                    if (a == null)
                    {
                        j1 = 0;
                    } else
                    {
                        j1 = a.length;
                    }
                    ai1 = new int[j6 + j1];
                    j6 = j1;
                    if (j1 != 0)
                    {
                        System.arraycopy(a, 0, ai1, 0, j1);
                        j6 = j1;
                    }
                    for (; j6 < ai1.length; j6++)
                    {
                        ai1[j6] = kt1.f();
                    }

                    a = ai1;
                    kt1.d(i11);
                    break;

                case 16: // '\020'
                    int k6 = lf.a(kt1, 16);
                    int ai2[];
                    int k1;
                    if (b == null)
                    {
                        k1 = 0;
                    } else
                    {
                        k1 = b.length;
                    }
                    ai2 = new int[k6 + k1];
                    k6 = k1;
                    if (k1 != 0)
                    {
                        System.arraycopy(b, 0, ai2, 0, k1);
                        k6 = k1;
                    }
                    for (; k6 < ai2.length - 1; k6++)
                    {
                        ai2[k6] = kt1.f();
                        kt1.a();
                    }

                    ai2[k6] = kt1.f();
                    b = ai2;
                    break;

                case 18: // '\022'
                    int j11 = kt1.c(kt1.f());
                    int l1 = kt1.j();
                    int l6;
                    for (l6 = 0; kt1.i() > 0; l6++)
                    {
                        kt1.f();
                    }

                    kt1.e(l1);
                    int ai3[];
                    if (b == null)
                    {
                        l1 = 0;
                    } else
                    {
                        l1 = b.length;
                    }
                    ai3 = new int[l6 + l1];
                    l6 = l1;
                    if (l1 != 0)
                    {
                        System.arraycopy(b, 0, ai3, 0, l1);
                        l6 = l1;
                    }
                    for (; l6 < ai3.length; l6++)
                    {
                        ai3[l6] = kt1.f();
                    }

                    b = ai3;
                    kt1.d(j11);
                    break;

                case 24: // '\030'
                    int i7 = lf.a(kt1, 24);
                    int ai4[];
                    int i2;
                    if (c == null)
                    {
                        i2 = 0;
                    } else
                    {
                        i2 = c.length;
                    }
                    ai4 = new int[i7 + i2];
                    i7 = i2;
                    if (i2 != 0)
                    {
                        System.arraycopy(c, 0, ai4, 0, i2);
                        i7 = i2;
                    }
                    for (; i7 < ai4.length - 1; i7++)
                    {
                        ai4[i7] = kt1.f();
                        kt1.a();
                    }

                    ai4[i7] = kt1.f();
                    c = ai4;
                    break;

                case 26: // '\032'
                    int k11 = kt1.c(kt1.f());
                    int j2 = kt1.j();
                    int j7;
                    for (j7 = 0; kt1.i() > 0; j7++)
                    {
                        kt1.f();
                    }

                    kt1.e(j2);
                    int ai5[];
                    if (c == null)
                    {
                        j2 = 0;
                    } else
                    {
                        j2 = c.length;
                    }
                    ai5 = new int[j7 + j2];
                    j7 = j2;
                    if (j2 != 0)
                    {
                        System.arraycopy(c, 0, ai5, 0, j2);
                        j7 = j2;
                    }
                    for (; j7 < ai5.length; j7++)
                    {
                        ai5[j7] = kt1.f();
                    }

                    c = ai5;
                    kt1.d(k11);
                    break;

                case 32: // ' '
                    int k7 = lf.a(kt1, 32);
                    int ai6[];
                    int k2;
                    if (d == null)
                    {
                        k2 = 0;
                    } else
                    {
                        k2 = d.length;
                    }
                    ai6 = new int[k7 + k2];
                    k7 = k2;
                    if (k2 != 0)
                    {
                        System.arraycopy(d, 0, ai6, 0, k2);
                        k7 = k2;
                    }
                    for (; k7 < ai6.length - 1; k7++)
                    {
                        ai6[k7] = kt1.f();
                        kt1.a();
                    }

                    ai6[k7] = kt1.f();
                    d = ai6;
                    break;

                case 34: // '"'
                    int l11 = kt1.c(kt1.f());
                    int l2 = kt1.j();
                    int l7;
                    for (l7 = 0; kt1.i() > 0; l7++)
                    {
                        kt1.f();
                    }

                    kt1.e(l2);
                    int ai7[];
                    if (d == null)
                    {
                        l2 = 0;
                    } else
                    {
                        l2 = d.length;
                    }
                    ai7 = new int[l7 + l2];
                    l7 = l2;
                    if (l2 != 0)
                    {
                        System.arraycopy(d, 0, ai7, 0, l2);
                        l7 = l2;
                    }
                    for (; l7 < ai7.length; l7++)
                    {
                        ai7[l7] = kt1.f();
                    }

                    d = ai7;
                    kt1.d(l11);
                    break;

                case 40: // '('
                    int i8 = lf.a(kt1, 40);
                    int ai8[];
                    int i3;
                    if (e == null)
                    {
                        i3 = 0;
                    } else
                    {
                        i3 = e.length;
                    }
                    ai8 = new int[i8 + i3];
                    i8 = i3;
                    if (i3 != 0)
                    {
                        System.arraycopy(e, 0, ai8, 0, i3);
                        i8 = i3;
                    }
                    for (; i8 < ai8.length - 1; i8++)
                    {
                        ai8[i8] = kt1.f();
                        kt1.a();
                    }

                    ai8[i8] = kt1.f();
                    e = ai8;
                    break;

                case 42: // '*'
                    int i12 = kt1.c(kt1.f());
                    int j3 = kt1.j();
                    int j8;
                    for (j8 = 0; kt1.i() > 0; j8++)
                    {
                        kt1.f();
                    }

                    kt1.e(j3);
                    int ai9[];
                    if (e == null)
                    {
                        j3 = 0;
                    } else
                    {
                        j3 = e.length;
                    }
                    ai9 = new int[j8 + j3];
                    j8 = j3;
                    if (j3 != 0)
                    {
                        System.arraycopy(e, 0, ai9, 0, j3);
                        j8 = j3;
                    }
                    for (; j8 < ai9.length; j8++)
                    {
                        ai9[j8] = kt1.f();
                    }

                    e = ai9;
                    kt1.d(i12);
                    break;

                case 48: // '0'
                    int k8 = lf.a(kt1, 48);
                    int ai10[];
                    int k3;
                    if (f == null)
                    {
                        k3 = 0;
                    } else
                    {
                        k3 = f.length;
                    }
                    ai10 = new int[k8 + k3];
                    k8 = k3;
                    if (k3 != 0)
                    {
                        System.arraycopy(f, 0, ai10, 0, k3);
                        k8 = k3;
                    }
                    for (; k8 < ai10.length - 1; k8++)
                    {
                        ai10[k8] = kt1.f();
                        kt1.a();
                    }

                    ai10[k8] = kt1.f();
                    f = ai10;
                    break;

                case 50: // '2'
                    int j12 = kt1.c(kt1.f());
                    int l3 = kt1.j();
                    int l8;
                    for (l8 = 0; kt1.i() > 0; l8++)
                    {
                        kt1.f();
                    }

                    kt1.e(l3);
                    int ai11[];
                    if (f == null)
                    {
                        l3 = 0;
                    } else
                    {
                        l3 = f.length;
                    }
                    ai11 = new int[l8 + l3];
                    l8 = l3;
                    if (l3 != 0)
                    {
                        System.arraycopy(f, 0, ai11, 0, l3);
                        l8 = l3;
                    }
                    for (; l8 < ai11.length; l8++)
                    {
                        ai11[l8] = kt1.f();
                    }

                    f = ai11;
                    kt1.d(j12);
                    break;

                case 56: // '8'
                    int i9 = lf.a(kt1, 56);
                    int ai12[];
                    int i4;
                    if (g == null)
                    {
                        i4 = 0;
                    } else
                    {
                        i4 = g.length;
                    }
                    ai12 = new int[i9 + i4];
                    i9 = i4;
                    if (i4 != 0)
                    {
                        System.arraycopy(g, 0, ai12, 0, i4);
                        i9 = i4;
                    }
                    for (; i9 < ai12.length - 1; i9++)
                    {
                        ai12[i9] = kt1.f();
                        kt1.a();
                    }

                    ai12[i9] = kt1.f();
                    g = ai12;
                    break;

                case 58: // ':'
                    int k12 = kt1.c(kt1.f());
                    int j4 = kt1.j();
                    int j9;
                    for (j9 = 0; kt1.i() > 0; j9++)
                    {
                        kt1.f();
                    }

                    kt1.e(j4);
                    int ai13[];
                    if (g == null)
                    {
                        j4 = 0;
                    } else
                    {
                        j4 = g.length;
                    }
                    ai13 = new int[j9 + j4];
                    j9 = j4;
                    if (j4 != 0)
                    {
                        System.arraycopy(g, 0, ai13, 0, j4);
                        j9 = j4;
                    }
                    for (; j9 < ai13.length; j9++)
                    {
                        ai13[j9] = kt1.f();
                    }

                    g = ai13;
                    kt1.d(k12);
                    break;

                case 64: // '@'
                    int k9 = lf.a(kt1, 64);
                    int ai14[];
                    int k4;
                    if (h == null)
                    {
                        k4 = 0;
                    } else
                    {
                        k4 = h.length;
                    }
                    ai14 = new int[k9 + k4];
                    k9 = k4;
                    if (k4 != 0)
                    {
                        System.arraycopy(h, 0, ai14, 0, k4);
                        k9 = k4;
                    }
                    for (; k9 < ai14.length - 1; k9++)
                    {
                        ai14[k9] = kt1.f();
                        kt1.a();
                    }

                    ai14[k9] = kt1.f();
                    h = ai14;
                    break;

                case 66: // 'B'
                    int l12 = kt1.c(kt1.f());
                    int l4 = kt1.j();
                    int l9;
                    for (l9 = 0; kt1.i() > 0; l9++)
                    {
                        kt1.f();
                    }

                    kt1.e(l4);
                    int ai15[];
                    if (h == null)
                    {
                        l4 = 0;
                    } else
                    {
                        l4 = h.length;
                    }
                    ai15 = new int[l9 + l4];
                    l9 = l4;
                    if (l4 != 0)
                    {
                        System.arraycopy(h, 0, ai15, 0, l4);
                        l9 = l4;
                    }
                    for (; l9 < ai15.length; l9++)
                    {
                        ai15[l9] = kt1.f();
                    }

                    h = ai15;
                    kt1.d(l12);
                    break;

                case 72: // 'H'
                    int i10 = lf.a(kt1, 72);
                    int ai16[];
                    int i5;
                    if (i == null)
                    {
                        i5 = 0;
                    } else
                    {
                        i5 = i.length;
                    }
                    ai16 = new int[i10 + i5];
                    i10 = i5;
                    if (i5 != 0)
                    {
                        System.arraycopy(i, 0, ai16, 0, i5);
                        i10 = i5;
                    }
                    for (; i10 < ai16.length - 1; i10++)
                    {
                        ai16[i10] = kt1.f();
                        kt1.a();
                    }

                    ai16[i10] = kt1.f();
                    i = ai16;
                    break;

                case 74: // 'J'
                    int i13 = kt1.c(kt1.f());
                    int j5 = kt1.j();
                    int j10;
                    for (j10 = 0; kt1.i() > 0; j10++)
                    {
                        kt1.f();
                    }

                    kt1.e(j5);
                    int ai17[];
                    if (i == null)
                    {
                        j5 = 0;
                    } else
                    {
                        j5 = i.length;
                    }
                    ai17 = new int[j10 + j5];
                    j10 = j5;
                    if (j5 != 0)
                    {
                        System.arraycopy(i, 0, ai17, 0, j5);
                        j10 = j5;
                    }
                    for (; j10 < ai17.length; j10++)
                    {
                        ai17[j10] = kt1.f();
                    }

                    i = ai17;
                    kt1.d(i13);
                    break;

                case 80: // 'P'
                    int k10 = lf.a(kt1, 80);
                    int ai18[];
                    int k5;
                    if (j == null)
                    {
                        k5 = 0;
                    } else
                    {
                        k5 = j.length;
                    }
                    ai18 = new int[k10 + k5];
                    k10 = k5;
                    if (k5 != 0)
                    {
                        System.arraycopy(j, 0, ai18, 0, k5);
                        k10 = k5;
                    }
                    for (; k10 < ai18.length - 1; k10++)
                    {
                        ai18[k10] = kt1.f();
                        kt1.a();
                    }

                    ai18[k10] = kt1.f();
                    j = ai18;
                    break;

                case 82: // 'R'
                    int j13 = kt1.c(kt1.f());
                    int l5 = kt1.j();
                    int l10;
                    for (l10 = 0; kt1.i() > 0; l10++)
                    {
                        kt1.f();
                    }

                    kt1.e(l5);
                    int ai19[];
                    if (j == null)
                    {
                        l5 = 0;
                    } else
                    {
                        l5 = j.length;
                    }
                    ai19 = new int[l10 + l5];
                    l10 = l5;
                    if (l5 != 0)
                    {
                        System.arraycopy(j, 0, ai19, 0, l5);
                        l10 = l5;
                    }
                    for (; l10 < ai19.length; l10++)
                    {
                        ai19[l10] = kt1.f();
                    }

                    j = ai19;
                    kt1.d(j13);
                    break;
                }
            } while (true);
        }

        public final void a(ku ku1)
            throws IOException
        {
            boolean flag = false;
            if (a != null && a.length > 0)
            {
                for (int l = 0; l < a.length; l++)
                {
                    ku1.a(1, a[l]);
                }

            }
            if (b != null && b.length > 0)
            {
                for (int i1 = 0; i1 < b.length; i1++)
                {
                    ku1.a(2, b[i1]);
                }

            }
            if (c != null && c.length > 0)
            {
                for (int j1 = 0; j1 < c.length; j1++)
                {
                    ku1.a(3, c[j1]);
                }

            }
            if (d != null && d.length > 0)
            {
                for (int k1 = 0; k1 < d.length; k1++)
                {
                    ku1.a(4, d[k1]);
                }

            }
            if (e != null && e.length > 0)
            {
                for (int l1 = 0; l1 < e.length; l1++)
                {
                    ku1.a(5, e[l1]);
                }

            }
            if (f != null && f.length > 0)
            {
                for (int i2 = 0; i2 < f.length; i2++)
                {
                    ku1.a(6, f[i2]);
                }

            }
            if (g != null && g.length > 0)
            {
                for (int j2 = 0; j2 < g.length; j2++)
                {
                    ku1.a(7, g[j2]);
                }

            }
            if (h != null && h.length > 0)
            {
                for (int k2 = 0; k2 < h.length; k2++)
                {
                    ku1.a(8, h[k2]);
                }

            }
            if (i != null && i.length > 0)
            {
                for (int l2 = 0; l2 < i.length; l2++)
                {
                    ku1.a(9, i[l2]);
                }

            }
            if (j != null && j.length > 0)
            {
                for (int i3 = ((flag) ? 1 : 0); i3 < j.length; i3++)
                {
                    ku1.a(10, j[i3]);
                }

            }
            super.a(ku1);
        }

        public final boolean equals(Object obj)
        {
            boolean flag1 = false;
            boolean flag;
            if (obj == this)
            {
                flag = true;
            } else
            {
                flag = flag1;
                if (obj instanceof g)
                {
                    obj = (g)obj;
                    flag = flag1;
                    if (kz.a(a, ((g) (obj)).a))
                    {
                        flag = flag1;
                        if (kz.a(b, ((g) (obj)).b))
                        {
                            flag = flag1;
                            if (kz.a(c, ((g) (obj)).c))
                            {
                                flag = flag1;
                                if (kz.a(d, ((g) (obj)).d))
                                {
                                    flag = flag1;
                                    if (kz.a(e, ((g) (obj)).e))
                                    {
                                        flag = flag1;
                                        if (kz.a(f, ((g) (obj)).f))
                                        {
                                            flag = flag1;
                                            if (kz.a(g, ((g) (obj)).g))
                                            {
                                                flag = flag1;
                                                if (kz.a(h, ((g) (obj)).h))
                                                {
                                                    flag = flag1;
                                                    if (kz.a(i, ((g) (obj)).i))
                                                    {
                                                        flag = flag1;
                                                        if (kz.a(j, ((g) (obj)).j))
                                                        {
                                                            return a(((kv) (obj)));
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return flag;
        }

        public final int hashCode()
        {
            return ((((((((((kz.a(a) + 527) * 31 + kz.a(b)) * 31 + kz.a(c)) * 31 + kz.a(d)) * 31 + kz.a(e)) * 31 + kz.a(f)) * 31 + kz.a(g)) * 31 + kz.a(h)) * 31 + kz.a(i)) * 31 + kz.a(j)) * 31 + c();
        }

        public g()
        {
            a = lf.a;
            b = lf.a;
            c = lf.a;
            d = lf.a;
            e = lf.a;
            f = lf.a;
            g = lf.a;
            h = lf.a;
            i = lf.a;
            j = lf.a;
            r = null;
            s = -1;
        }
    }

    public static final class h extends kv
    {

        private static volatile h d[];
        public String a;
        public h.a b;
        public d c;

        public static h[] b()
        {
            if (d == null)
            {
                synchronized (kz.a)
                {
                    if (d == null)
                    {
                        d = new h[0];
                    }
                }
            }
            return d;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        protected final int a()
        {
            int k = super.a();
            int j = k;
            if (!a.equals(""))
            {
                j = k + ku.b(1, a);
            }
            k = j;
            if (b != null)
            {
                k = j + ku.b(2, b);
            }
            j = k;
            if (c != null)
            {
                j = k + ku.b(3, c);
            }
            return j;
        }

        public final lb a(kt kt1)
            throws IOException
        {
            do
            {
                int j = kt1.a();
                switch (j)
                {
                default:
                    if (a(kt1, j))
                    {
                        continue;
                    }
                    // fall through

                case 0: // '\0'
                    return this;

                case 10: // '\n'
                    a = kt1.d();
                    break;

                case 18: // '\022'
                    if (b == null)
                    {
                        b = new h.a();
                    }
                    kt1.a(b);
                    break;

                case 26: // '\032'
                    if (c == null)
                    {
                        c = new d();
                    }
                    kt1.a(c);
                    break;
                }
            } while (true);
        }

        public final void a(ku ku1)
            throws IOException
        {
            if (!a.equals(""))
            {
                ku1.a(1, a);
            }
            if (b != null)
            {
                ku1.a(2, b);
            }
            if (c != null)
            {
                ku1.a(3, c);
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
            if (!(obj instanceof h)) goto _L4; else goto _L3
_L3:
            obj = (h)obj;
            if (a != null) goto _L6; else goto _L5
_L5:
            flag = flag1;
            if (((h) (obj)).a != null) goto _L4; else goto _L7
_L7:
            if (b != null) goto _L9; else goto _L8
_L8:
            flag = flag1;
            if (((h) (obj)).b != null) goto _L4; else goto _L10
_L10:
            if (c != null)
            {
                break MISSING_BLOCK_LABEL_111;
            }
            flag = flag1;
            if (((h) (obj)).c != null) goto _L4; else goto _L11
_L11:
            return a(((kv) (obj)));
_L6:
            if (!a.equals(((h) (obj)).a))
            {
                return false;
            }
              goto _L7
_L9:
            if (!b.equals(((h) (obj)).b))
            {
                return false;
            }
              goto _L10
            if (!c.equals(((h) (obj)).c))
            {
                return false;
            }
              goto _L11
        }

        public final int hashCode()
        {
            int l = 0;
            int j;
            int k;
            if (a == null)
            {
                j = 0;
            } else
            {
                j = a.hashCode();
            }
            if (b == null)
            {
                k = 0;
            } else
            {
                k = b.hashCode();
            }
            if (c != null)
            {
                l = c.hashCode();
            }
            return ((k + (j + 527) * 31) * 31 + l) * 31 + c();
        }

        public h()
        {
            a = "";
            b = null;
            c = null;
            r = null;
            s = -1;
        }
    }

    public static final class i extends kv
    {

        public h a[];
        public f b;
        public String c;

        protected final int a()
        {
            int j = super.a();
            int k = j;
            if (a != null)
            {
                k = j;
                if (a.length > 0)
                {
                    int l = 0;
                    do
                    {
                        k = j;
                        if (l >= a.length)
                        {
                            break;
                        }
                        h h1 = a[l];
                        k = j;
                        if (h1 != null)
                        {
                            k = j + ku.b(1, h1);
                        }
                        l++;
                        j = k;
                    } while (true);
                }
            }
            j = k;
            if (b != null)
            {
                j = k + ku.b(2, b);
            }
            k = j;
            if (!c.equals(""))
            {
                k = j + ku.b(3, c);
            }
            return k;
        }

        public final lb a(kt kt1)
            throws IOException
        {
            do
            {
                int j = kt1.a();
                switch (j)
                {
                default:
                    if (a(kt1, j))
                    {
                        continue;
                    }
                    // fall through

                case 0: // '\0'
                    return this;

                case 10: // '\n'
                    int l = lf.a(kt1, 10);
                    h ah[];
                    int k;
                    if (a == null)
                    {
                        k = 0;
                    } else
                    {
                        k = a.length;
                    }
                    ah = new h[l + k];
                    l = k;
                    if (k != 0)
                    {
                        System.arraycopy(a, 0, ah, 0, k);
                        l = k;
                    }
                    for (; l < ah.length - 1; l++)
                    {
                        ah[l] = new h();
                        kt1.a(ah[l]);
                        kt1.a();
                    }

                    ah[l] = new h();
                    kt1.a(ah[l]);
                    a = ah;
                    break;

                case 18: // '\022'
                    if (b == null)
                    {
                        b = new f();
                    }
                    kt1.a(b);
                    break;

                case 26: // '\032'
                    c = kt1.d();
                    break;
                }
            } while (true);
        }

        public final void a(ku ku1)
            throws IOException
        {
            if (a != null && a.length > 0)
            {
                for (int j = 0; j < a.length; j++)
                {
                    h h1 = a[j];
                    if (h1 != null)
                    {
                        ku1.a(1, h1);
                    }
                }

            }
            if (b != null)
            {
                ku1.a(2, b);
            }
            if (!c.equals(""))
            {
                ku1.a(3, c);
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
            if (!(obj instanceof i)) goto _L4; else goto _L3
_L3:
            obj = (i)obj;
            flag = flag1;
            if (!kz.a(a, ((i) (obj)).a)) goto _L4; else goto _L5
_L5:
            if (b != null) goto _L7; else goto _L6
_L6:
            flag = flag1;
            if (((i) (obj)).b != null) goto _L4; else goto _L8
_L8:
            if (c != null)
            {
                break MISSING_BLOCK_LABEL_95;
            }
            flag = flag1;
            if (((i) (obj)).c != null) goto _L4; else goto _L9
_L9:
            return a(((kv) (obj)));
_L7:
            if (!b.equals(((i) (obj)).b))
            {
                return false;
            }
              goto _L8
            if (!c.equals(((i) (obj)).c))
            {
                return false;
            }
              goto _L9
        }

        public final int hashCode()
        {
            int k = 0;
            int l = kz.a(a);
            int j;
            if (b == null)
            {
                j = 0;
            } else
            {
                j = b.hashCode();
            }
            if (c != null)
            {
                k = c.hashCode();
            }
            return ((j + (l + 527) * 31) * 31 + k) * 31 + c();
        }

        public i()
        {
            a = h.b();
            b = null;
            c = "";
            r = null;
            s = -1;
        }
    }

}
