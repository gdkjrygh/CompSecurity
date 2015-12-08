// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.b;

import java.io.IOException;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.b:
//            aB, aJ, aA, aF

public interface aK
{
    public static final class a extends aB
    {

        public String a[];
        public String b[];
        public int c[];
        public long d[];

        protected final int a()
        {
            boolean flag = false;
            int l2 = super.a();
            int i;
            int k;
            if (a != null && a.length > 0)
            {
                i = 0;
                int j = 0;
                int l;
                int l1;
                for (l = 0; i < a.length; l = l1)
                {
                    String s = a[i];
                    int j2 = j;
                    l1 = l;
                    if (s != null)
                    {
                        l1 = l + 1;
                        j2 = j + aA.a(s);
                    }
                    i++;
                    j = j2;
                }

                i = l2 + j + l * 1;
            } else
            {
                i = l2;
            }
            k = i;
            if (b != null)
            {
                k = i;
                if (b.length > 0)
                {
                    k = 0;
                    int i1 = 0;
                    int i2;
                    int k2;
                    for (i2 = 0; k < b.length; i2 = k2)
                    {
                        String s1 = b[k];
                        l2 = i1;
                        k2 = i2;
                        if (s1 != null)
                        {
                            k2 = i2 + 1;
                            l2 = i1 + aA.a(s1);
                        }
                        k++;
                        i1 = l2;
                    }

                    k = i + i1 + i2 * 1;
                }
            }
            i = k;
            if (c != null)
            {
                i = k;
                if (c.length > 0)
                {
                    i = 0;
                    int j1 = 0;
                    for (; i < c.length; i++)
                    {
                        j1 += aA.a(c[i]);
                    }

                    i = k + j1 + c.length * 1;
                }
            }
            k = i;
            if (d != null)
            {
                k = i;
                if (d.length > 0)
                {
                    int k1 = 0;
                    for (k = ((flag) ? 1 : 0); k < d.length; k++)
                    {
                        k1 += aA.b(d[k]);
                    }

                    k = i + k1 + d.length * 1;
                }
            }
            return k;
        }

        public final void a(aA aa)
            throws IOException
        {
            boolean flag = false;
            if (a != null && a.length > 0)
            {
                for (int i = 0; i < a.length; i++)
                {
                    String s = a[i];
                    if (s != null)
                    {
                        aa.a(1, s);
                    }
                }

            }
            if (b != null && b.length > 0)
            {
                for (int j = 0; j < b.length; j++)
                {
                    String s1 = b[j];
                    if (s1 != null)
                    {
                        aa.a(2, s1);
                    }
                }

            }
            if (c != null && c.length > 0)
            {
                for (int k = 0; k < c.length; k++)
                {
                    aa.a(3, c[k]);
                }

            }
            if (d != null && d.length > 0)
            {
                for (int l = ((flag) ? 1 : 0); l < d.length; l++)
                {
                    aa.a(4, d[l]);
                }

            }
            super.a(aa);
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
                    if (aF.a(a, ((a) (obj)).a))
                    {
                        flag = flag1;
                        if (aF.a(b, ((a) (obj)).b))
                        {
                            flag = flag1;
                            if (aF.a(c, ((a) (obj)).c))
                            {
                                flag = flag1;
                                if (aF.a(d, ((a) (obj)).d))
                                {
                                    return a(((aB) (obj)));
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
            return ((((aF.a(a) + 527) * 31 + aF.a(b)) * 31 + aF.a(c)) * 31 + aF.a(d)) * 31 + b();
        }

        public a()
        {
            a = aJ.f;
            b = aJ.f;
            c = aJ.a;
            d = aJ.b;
            m = null;
            n = -1;
        }
    }

    public static final class b extends aB
    {

        public int a;
        public String b;
        public String c;

        protected final int a()
        {
            int j = super.a();
            int i = j;
            if (a != 0)
            {
                i = j + aA.b(1, a);
            }
            j = i;
            if (!b.equals(""))
            {
                j = i + aA.b(2, b);
            }
            i = j;
            if (!c.equals(""))
            {
                i = j + aA.b(3, c);
            }
            return i;
        }

        public final void a(aA aa)
            throws IOException
        {
            if (a != 0)
            {
                aa.a(1, a);
            }
            if (!b.equals(""))
            {
                aa.a(2, b);
            }
            if (!c.equals(""))
            {
                aa.a(3, c);
            }
            super.a(aa);
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
            if (!(obj instanceof b)) goto _L4; else goto _L3
_L3:
            obj = (b)obj;
            flag = flag1;
            if (a != ((b) (obj)).a) goto _L4; else goto _L5
_L5:
            if (b != null) goto _L7; else goto _L6
_L6:
            flag = flag1;
            if (((b) (obj)).b != null) goto _L4; else goto _L8
_L8:
            if (c != null)
            {
                break MISSING_BLOCK_LABEL_92;
            }
            flag = flag1;
            if (((b) (obj)).c != null) goto _L4; else goto _L9
_L9:
            return a(((aB) (obj)));
_L7:
            if (!b.equals(((b) (obj)).b))
            {
                return false;
            }
              goto _L8
            if (!c.equals(((b) (obj)).c))
            {
                return false;
            }
              goto _L9
        }

        public final int hashCode()
        {
            int j = 0;
            int k = a;
            int i;
            if (b == null)
            {
                i = 0;
            } else
            {
                i = b.hashCode();
            }
            if (c != null)
            {
                j = c.hashCode();
            }
            return ((i + (k + 527) * 31) * 31 + j) * 31 + b();
        }

        public b()
        {
            a = 0;
            b = "";
            c = "";
            m = null;
            n = -1;
        }
    }

    public static final class c extends aB
    {

        public byte a[];
        public byte b[][];
        public boolean c;

        protected final int a()
        {
            boolean flag = false;
            int j = super.a();
            int i = j;
            if (!Arrays.equals(a, aJ.h))
            {
                i = j + aA.b(1, a);
            }
            j = i;
            if (b != null)
            {
                j = i;
                if (b.length > 0)
                {
                    int k = 0;
                    int l = 0;
                    for (j = ((flag) ? 1 : 0); j < b.length;)
                    {
                        byte abyte0[] = b[j];
                        int j1 = k;
                        int i1 = l;
                        if (abyte0 != null)
                        {
                            i1 = l + 1;
                            j1 = k + aA.a(abyte0);
                        }
                        j++;
                        k = j1;
                        l = i1;
                    }

                    j = i + k + l * 1;
                }
            }
            i = j;
            if (c)
            {
                i = j + (aA.b(3) + 1);
            }
            return i;
        }

        public final void a(aA aa)
            throws IOException
        {
            if (!Arrays.equals(a, aJ.h))
            {
                aa.a(1, a);
            }
            if (b != null && b.length > 0)
            {
                for (int i = 0; i < b.length; i++)
                {
                    byte abyte0[] = b[i];
                    if (abyte0 != null)
                    {
                        aa.a(2, abyte0);
                    }
                }

            }
            if (c)
            {
                aa.a(3, c);
            }
            super.a(aa);
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
                if (obj instanceof c)
                {
                    obj = (c)obj;
                    flag = flag1;
                    if (Arrays.equals(a, ((c) (obj)).a))
                    {
                        flag = flag1;
                        if (aF.a(b, ((c) (obj)).b))
                        {
                            flag = flag1;
                            if (c == ((c) (obj)).c)
                            {
                                return a(((aB) (obj)));
                            }
                        }
                    }
                }
            }
            return flag;
        }

        public final int hashCode()
        {
            int i = Arrays.hashCode(a);
            int j = aF.a(b);
            char c1;
            if (c)
            {
                c1 = '\u04CF';
            } else
            {
                c1 = '\u04D5';
            }
            return (c1 + ((i + 527) * 31 + j) * 31) * 31 + b();
        }

        public c()
        {
            a = aJ.h;
            b = aJ.g;
            c = false;
            m = null;
            n = -1;
        }
    }

    public static final class d extends aB
    {

        public long a;
        public long b;
        public String c;
        public int d;
        public int e;
        public boolean f;
        public e g[];
        public b h;
        public byte i[];
        public byte j[];
        public byte k[];
        public a l;
        public String o;
        public long p;
        public c q;
        public byte r[];
        public int s;
        public int t[];

        protected final int a()
        {
            boolean flag = false;
            int i1 = super.a();
            int j1 = i1;
            if (a != 0L)
            {
                j1 = i1 + aA.b(1, a);
            }
            i1 = j1;
            if (!c.equals(""))
            {
                i1 = j1 + aA.b(2, c);
            }
            j1 = i1;
            if (g != null)
            {
                j1 = i1;
                if (g.length > 0)
                {
                    for (j1 = 0; j1 < g.length;)
                    {
                        e e1 = g[j1];
                        int k1 = i1;
                        if (e1 != null)
                        {
                            k1 = i1 + aA.b(3, e1);
                        }
                        j1++;
                        i1 = k1;
                    }

                    j1 = i1;
                }
            }
            i1 = j1;
            if (!Arrays.equals(i, aJ.h))
            {
                i1 = j1 + aA.b(6, i);
            }
            j1 = i1;
            if (l != null)
            {
                j1 = i1 + aA.b(7, l);
            }
            i1 = j1;
            if (!Arrays.equals(j, aJ.h))
            {
                i1 = j1 + aA.b(8, j);
            }
            j1 = i1;
            if (h != null)
            {
                j1 = i1 + aA.b(9, h);
            }
            i1 = j1;
            if (f)
            {
                i1 = j1 + (aA.b(10) + 1);
            }
            j1 = i1;
            if (d != 0)
            {
                j1 = i1 + aA.b(11, d);
            }
            i1 = j1;
            if (e != 0)
            {
                i1 = j1 + aA.b(12, e);
            }
            j1 = i1;
            if (!Arrays.equals(k, aJ.h))
            {
                j1 = i1 + aA.b(13, k);
            }
            i1 = j1;
            if (!o.equals(""))
            {
                i1 = j1 + aA.b(14, o);
            }
            j1 = i1;
            if (p != 0x2bf20L)
            {
                long l2 = p;
                j1 = aA.b(15);
                j1 = i1 + (aA.b(aA.c(l2)) + j1);
            }
            i1 = j1;
            if (q != null)
            {
                i1 = j1 + aA.b(16, q);
            }
            j1 = i1;
            if (b != 0L)
            {
                j1 = i1 + aA.b(17, b);
            }
            int l1 = j1;
            if (!Arrays.equals(r, aJ.h))
            {
                l1 = j1 + aA.b(18, r);
            }
            i1 = l1;
            if (s != 0)
            {
                i1 = l1 + aA.b(19, s);
            }
            j1 = i1;
            if (t != null)
            {
                j1 = i1;
                if (t.length > 0)
                {
                    int i2 = 0;
                    for (j1 = ((flag) ? 1 : 0); j1 < t.length; j1++)
                    {
                        i2 += aA.a(t[j1]);
                    }

                    j1 = i1 + i2 + t.length * 2;
                }
            }
            return j1;
        }

        public final void a(aA aa)
            throws IOException
        {
            boolean flag = false;
            if (a != 0L)
            {
                aa.a(1, a);
            }
            if (!c.equals(""))
            {
                aa.a(2, c);
            }
            if (g != null && g.length > 0)
            {
                for (int i1 = 0; i1 < g.length; i1++)
                {
                    e e1 = g[i1];
                    if (e1 != null)
                    {
                        aa.a(3, e1);
                    }
                }

            }
            if (!Arrays.equals(i, aJ.h))
            {
                aa.a(6, i);
            }
            if (l != null)
            {
                aa.a(7, l);
            }
            if (!Arrays.equals(j, aJ.h))
            {
                aa.a(8, j);
            }
            if (h != null)
            {
                aa.a(9, h);
            }
            if (f)
            {
                aa.a(10, f);
            }
            if (d != 0)
            {
                aa.a(11, d);
            }
            if (e != 0)
            {
                aa.a(12, e);
            }
            if (!Arrays.equals(k, aJ.h))
            {
                aa.a(13, k);
            }
            if (!o.equals(""))
            {
                aa.a(14, o);
            }
            if (p != 0x2bf20L)
            {
                long l1 = p;
                aa.c(15, 0);
                aa.a(aA.c(l1));
            }
            if (q != null)
            {
                aa.a(16, q);
            }
            if (b != 0L)
            {
                aa.a(17, b);
            }
            if (!Arrays.equals(r, aJ.h))
            {
                aa.a(18, r);
            }
            if (s != 0)
            {
                aa.a(19, s);
            }
            if (t != null && t.length > 0)
            {
                for (int j1 = ((flag) ? 1 : 0); j1 < t.length; j1++)
                {
                    aa.a(20, t[j1]);
                }

            }
            super.a(aa);
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
            if (!(obj instanceof d)) goto _L4; else goto _L3
_L3:
            obj = (d)obj;
            flag = flag1;
            if (a != ((d) (obj)).a) goto _L4; else goto _L5
_L5:
            flag = flag1;
            if (b != ((d) (obj)).b) goto _L4; else goto _L6
_L6:
            if (c != null) goto _L8; else goto _L7
_L7:
            flag = flag1;
            if (((d) (obj)).c != null) goto _L4; else goto _L9
_L9:
            flag = flag1;
            if (d != ((d) (obj)).d) goto _L4; else goto _L10
_L10:
            flag = flag1;
            if (e != ((d) (obj)).e) goto _L4; else goto _L11
_L11:
            flag = flag1;
            if (f != ((d) (obj)).f) goto _L4; else goto _L12
_L12:
            flag = flag1;
            if (!aF.a(g, ((d) (obj)).g)) goto _L4; else goto _L13
_L13:
            if (h != null) goto _L15; else goto _L14
_L14:
            flag = flag1;
            if (((d) (obj)).h != null) goto _L4; else goto _L16
_L16:
            flag = flag1;
            if (!Arrays.equals(i, ((d) (obj)).i)) goto _L4; else goto _L17
_L17:
            flag = flag1;
            if (!Arrays.equals(j, ((d) (obj)).j)) goto _L4; else goto _L18
_L18:
            flag = flag1;
            if (!Arrays.equals(k, ((d) (obj)).k)) goto _L4; else goto _L19
_L19:
            if (l != null) goto _L21; else goto _L20
_L20:
            flag = flag1;
            if (((d) (obj)).l != null) goto _L4; else goto _L22
_L22:
            if (o != null) goto _L24; else goto _L23
_L23:
            flag = flag1;
            if (((d) (obj)).o != null) goto _L4; else goto _L25
_L25:
            flag = flag1;
            if (p != ((d) (obj)).p) goto _L4; else goto _L26
_L26:
            if (q != null)
            {
                break MISSING_BLOCK_LABEL_365;
            }
            flag = flag1;
            if (((d) (obj)).q != null) goto _L4; else goto _L27
_L27:
            flag = flag1;
            if (Arrays.equals(r, ((d) (obj)).r))
            {
                flag = flag1;
                if (s == ((d) (obj)).s)
                {
                    flag = flag1;
                    if (aF.a(t, ((d) (obj)).t))
                    {
                        return a(((aB) (obj)));
                    }
                }
            }
              goto _L4
_L8:
            if (!c.equals(((d) (obj)).c))
            {
                return false;
            }
              goto _L9
_L15:
            if (!h.equals(((d) (obj)).h))
            {
                return false;
            }
              goto _L16
_L21:
            if (!l.equals(((d) (obj)).l))
            {
                return false;
            }
              goto _L22
_L24:
            if (!o.equals(((d) (obj)).o))
            {
                return false;
            }
              goto _L25
            if (!q.equals(((d) (obj)).q))
            {
                return false;
            }
              goto _L27
        }

        public final int hashCode()
        {
            int i2 = 0;
            int j2 = (int)(a ^ a >>> 32);
            int k2 = (int)(b ^ b >>> 32);
            int i1;
            char c1;
            int j1;
            int k1;
            int l1;
            int l2;
            int i3;
            int j3;
            int k3;
            int l3;
            int i4;
            int j4;
            if (c == null)
            {
                i1 = 0;
            } else
            {
                i1 = c.hashCode();
            }
            l2 = d;
            i3 = e;
            if (f)
            {
                c1 = '\u04CF';
            } else
            {
                c1 = '\u04D5';
            }
            j3 = aF.a(g);
            if (h == null)
            {
                j1 = 0;
            } else
            {
                j1 = h.hashCode();
            }
            k3 = Arrays.hashCode(i);
            l3 = Arrays.hashCode(j);
            i4 = Arrays.hashCode(k);
            if (l == null)
            {
                k1 = 0;
            } else
            {
                k1 = l.hashCode();
            }
            if (o == null)
            {
                l1 = 0;
            } else
            {
                l1 = o.hashCode();
            }
            j4 = (int)(p ^ p >>> 32);
            if (q != null)
            {
                i2 = q.hashCode();
            }
            return ((((((l1 + (k1 + ((((j1 + ((c1 + (((i1 + ((j2 + 527) * 31 + k2) * 31) * 31 + l2) * 31 + i3) * 31) * 31 + j3) * 31) * 31 + k3) * 31 + l3) * 31 + i4) * 31) * 31) * 31 + j4) * 31 + i2) * 31 + Arrays.hashCode(r)) * 31 + s) * 31 + aF.a(t)) * 31 + b();
        }

        public d()
        {
            a = 0L;
            b = 0L;
            c = "";
            d = 0;
            e = 0;
            f = false;
            g = e.f();
            h = null;
            i = aJ.h;
            j = aJ.h;
            k = aJ.h;
            l = null;
            o = "";
            p = 0x2bf20L;
            q = null;
            r = aJ.h;
            s = 0;
            t = aJ.a;
            m = null;
            n = -1;
        }
    }

    public static final class e extends aB
    {

        private static volatile e c[];
        public String a;
        public String b;

        public static e[] f()
        {
            if (c == null)
            {
                synchronized (aF.a)
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
            int j = super.a();
            int i = j;
            if (!a.equals(""))
            {
                i = j + aA.b(1, a);
            }
            j = i;
            if (!b.equals(""))
            {
                j = i + aA.b(2, b);
            }
            return j;
        }

        public final void a(aA aa)
            throws IOException
        {
            if (!a.equals(""))
            {
                aa.a(1, a);
            }
            if (!b.equals(""))
            {
                aa.a(2, b);
            }
            super.a(aa);
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
            if (!(obj instanceof e)) goto _L4; else goto _L3
_L3:
            obj = (e)obj;
            if (a != null) goto _L6; else goto _L5
_L5:
            flag = flag1;
            if (((e) (obj)).a != null) goto _L4; else goto _L7
_L7:
            if (b != null)
            {
                break MISSING_BLOCK_LABEL_79;
            }
            flag = flag1;
            if (((e) (obj)).b != null) goto _L4; else goto _L8
_L8:
            return a(((aB) (obj)));
_L6:
            if (!a.equals(((e) (obj)).a))
            {
                return false;
            }
              goto _L7
            if (!b.equals(((e) (obj)).b))
            {
                return false;
            }
              goto _L8
        }

        public final int hashCode()
        {
            int j = 0;
            int i;
            if (a == null)
            {
                i = 0;
            } else
            {
                i = a.hashCode();
            }
            if (b != null)
            {
                j = b.hashCode();
            }
            return ((i + 527) * 31 + j) * 31 + b();
        }

        public e()
        {
            a = "";
            b = "";
            m = null;
            n = -1;
        }
    }

}
