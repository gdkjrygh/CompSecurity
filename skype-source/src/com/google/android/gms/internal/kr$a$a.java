// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.internal:
//            kv, kr, kz, ku, 
//            kt, lb, lf

public static final class s extends kv
{
    public static final class a extends kv
    {

        public byte a[];
        public String b;
        public double c;
        public float d;
        public long e;
        public int f;
        public int g;
        public boolean h;
        public kr.a i[];
        public kr.a.a j[];
        public String k[];
        public long l[];
        public float m[];
        public long n;

        protected final int a()
        {
            boolean flag = false;
            int j1 = super.a();
            int i1 = j1;
            if (!Arrays.equals(a, lf.h))
            {
                byte abyte0[] = a;
                i1 = ku.c(1);
                int k1 = ku.e(abyte0.length);
                i1 = j1 + (abyte0.length + k1 + i1);
            }
            j1 = i1;
            if (!b.equals(""))
            {
                j1 = i1 + ku.b(2, b);
            }
            i1 = j1;
            if (Double.doubleToLongBits(c) != Double.doubleToLongBits(0.0D))
            {
                i1 = j1 + (ku.c(3) + 8);
            }
            j1 = i1;
            if (Float.floatToIntBits(d) != Float.floatToIntBits(0.0F))
            {
                j1 = i1 + (ku.c(4) + 4);
            }
            int l1 = j1;
            if (e != 0L)
            {
                l1 = j1 + ku.b(5, e);
            }
            i1 = l1;
            if (f != 0)
            {
                i1 = l1 + ku.b(6, f);
            }
            j1 = i1;
            if (g != 0)
            {
                j1 = g;
                int i2 = ku.c(7);
                j1 = i1 + (ku.e(ku.f(j1)) + i2);
            }
            i1 = j1;
            if (h)
            {
                i1 = j1 + (ku.c(8) + 1);
            }
            j1 = i1;
            if (i != null)
            {
                j1 = i1;
                if (i.length > 0)
                {
                    for (j1 = 0; j1 < i.length;)
                    {
                        kr.a a1 = i[j1];
                        int j2 = i1;
                        if (a1 != null)
                        {
                            j2 = i1 + ku.b(9, a1);
                        }
                        j1++;
                        i1 = j2;
                    }

                    j1 = i1;
                }
            }
            i1 = j1;
            if (j != null)
            {
                i1 = j1;
                if (j.length > 0)
                {
                    i1 = j1;
                    for (j1 = 0; j1 < j.length;)
                    {
                        kr.a.a a2 = j[j1];
                        int k2 = i1;
                        if (a2 != null)
                        {
                            k2 = i1 + ku.b(10, a2);
                        }
                        j1++;
                        i1 = k2;
                    }

                }
            }
            j1 = i1;
            if (k != null)
            {
                j1 = i1;
                if (k.length > 0)
                {
                    j1 = 0;
                    int l2 = 0;
                    int j3;
                    int k3;
                    for (j3 = 0; j1 < k.length; j3 = k3)
                    {
                        String s = k[j1];
                        int l3 = l2;
                        k3 = j3;
                        if (s != null)
                        {
                            k3 = j3 + 1;
                            l3 = l2 + ku.a(s);
                        }
                        j1++;
                        l2 = l3;
                    }

                    j1 = i1 + l2 + j3 * 1;
                }
            }
            i1 = j1;
            if (l != null)
            {
                i1 = j1;
                if (l.length > 0)
                {
                    int i3 = 0;
                    for (i1 = ((flag) ? 1 : 0); i1 < l.length; i1++)
                    {
                        i3 += ku.a(l[i1]);
                    }

                    i1 = j1 + i3 + l.length * 1;
                }
            }
            j1 = i1;
            if (n != 0L)
            {
                j1 = i1 + ku.b(13, n);
            }
            i1 = j1;
            if (m != null)
            {
                i1 = j1;
                if (m.length > 0)
                {
                    i1 = j1 + m.length * 4 + m.length * 1;
                }
            }
            return i1;
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
                    a = kt1.e();
                    break;

                case 18: // '\022'
                    b = kt1.d();
                    break;

                case 25: // '\031'
                    c = Double.longBitsToDouble(kt1.h());
                    break;

                case 37: // '%'
                    d = Float.intBitsToFloat(kt1.g());
                    break;

                case 40: // '('
                    e = kt1.b();
                    break;

                case 48: // '0'
                    f = kt1.f();
                    break;

                case 56: // '8'
                    int j1 = kt1.f();
                    g = -(j1 & 1) ^ j1 >>> 1;
                    break;

                case 64: // '@'
                    h = kt1.c();
                    break;

                case 74: // 'J'
                    int j3 = lf.a(kt1, 74);
                    kr.a aa[];
                    int k1;
                    if (i == null)
                    {
                        k1 = 0;
                    } else
                    {
                        k1 = i.length;
                    }
                    aa = new kr.a[j3 + k1];
                    j3 = k1;
                    if (k1 != 0)
                    {
                        System.arraycopy(i, 0, aa, 0, k1);
                        j3 = k1;
                    }
                    for (; j3 < aa.length - 1; j3++)
                    {
                        aa[j3] = new kr.a();
                        kt1.a(aa[j3]);
                        kt1.a();
                    }

                    aa[j3] = new kr.a();
                    kt1.a(aa[j3]);
                    i = aa;
                    break;

                case 82: // 'R'
                    int k3 = lf.a(kt1, 82);
                    kr.a.a aa1[];
                    int l1;
                    if (j == null)
                    {
                        l1 = 0;
                    } else
                    {
                        l1 = j.length;
                    }
                    aa1 = new kr.a.a[k3 + l1];
                    k3 = l1;
                    if (l1 != 0)
                    {
                        System.arraycopy(j, 0, aa1, 0, l1);
                        k3 = l1;
                    }
                    for (; k3 < aa1.length - 1; k3++)
                    {
                        aa1[k3] = new kr.a.a();
                        kt1.a(aa1[k3]);
                        kt1.a();
                    }

                    aa1[k3] = new kr.a.a();
                    kt1.a(aa1[k3]);
                    j = aa1;
                    break;

                case 90: // 'Z'
                    int l3 = lf.a(kt1, 90);
                    String as[];
                    int i2;
                    if (k == null)
                    {
                        i2 = 0;
                    } else
                    {
                        i2 = k.length;
                    }
                    as = new String[l3 + i2];
                    l3 = i2;
                    if (i2 != 0)
                    {
                        System.arraycopy(k, 0, as, 0, i2);
                        l3 = i2;
                    }
                    for (; l3 < as.length - 1; l3++)
                    {
                        as[l3] = kt1.d();
                        kt1.a();
                    }

                    as[l3] = kt1.d();
                    k = as;
                    break;

                case 96: // '`'
                    int i4 = lf.a(kt1, 96);
                    long al[];
                    int j2;
                    if (l == null)
                    {
                        j2 = 0;
                    } else
                    {
                        j2 = l.length;
                    }
                    al = new long[i4 + j2];
                    i4 = j2;
                    if (j2 != 0)
                    {
                        System.arraycopy(l, 0, al, 0, j2);
                        i4 = j2;
                    }
                    for (; i4 < al.length - 1; i4++)
                    {
                        al[i4] = kt1.b();
                        kt1.a();
                    }

                    al[i4] = kt1.b();
                    l = al;
                    break;

                case 98: // 'b'
                    int i5 = kt1.c(kt1.f());
                    int k2 = kt1.j();
                    int j4;
                    for (j4 = 0; kt1.i() > 0; j4++)
                    {
                        kt1.b();
                    }

                    kt1.e(k2);
                    long al1[];
                    if (l == null)
                    {
                        k2 = 0;
                    } else
                    {
                        k2 = l.length;
                    }
                    al1 = new long[j4 + k2];
                    j4 = k2;
                    if (k2 != 0)
                    {
                        System.arraycopy(l, 0, al1, 0, k2);
                        j4 = k2;
                    }
                    for (; j4 < al1.length; j4++)
                    {
                        al1[j4] = kt1.b();
                    }

                    l = al1;
                    kt1.d(i5);
                    break;

                case 104: // 'h'
                    n = kt1.b();
                    break;

                case 117: // 'u'
                    int k4 = lf.a(kt1, 117);
                    float af[];
                    int l2;
                    if (m == null)
                    {
                        l2 = 0;
                    } else
                    {
                        l2 = m.length;
                    }
                    af = new float[k4 + l2];
                    k4 = l2;
                    if (l2 != 0)
                    {
                        System.arraycopy(m, 0, af, 0, l2);
                        k4 = l2;
                    }
                    for (; k4 < af.length - 1; k4++)
                    {
                        af[k4] = Float.intBitsToFloat(kt1.g());
                        kt1.a();
                    }

                    af[k4] = Float.intBitsToFloat(kt1.g());
                    m = af;
                    break;

                case 114: // 'r'
                    int i3 = kt1.f();
                    int j5 = kt1.c(i3);
                    int l4 = i3 / 4;
                    float af1[];
                    if (m == null)
                    {
                        i3 = 0;
                    } else
                    {
                        i3 = m.length;
                    }
                    af1 = new float[l4 + i3];
                    l4 = i3;
                    if (i3 != 0)
                    {
                        System.arraycopy(m, 0, af1, 0, i3);
                        l4 = i3;
                    }
                    for (; l4 < af1.length; l4++)
                    {
                        af1[l4] = Float.intBitsToFloat(kt1.g());
                    }

                    m = af1;
                    kt1.d(j5);
                    break;
                }
            } while (true);
        }

        public final void a(ku ku1)
            throws IOException
        {
            boolean flag = false;
            if (!Arrays.equals(a, lf.h))
            {
                byte abyte0[] = a;
                ku1.c(1, 2);
                ku1.d(abyte0.length);
                ku1.b(abyte0);
            }
            if (!b.equals(""))
            {
                ku1.a(2, b);
            }
            if (Double.doubleToLongBits(c) != Double.doubleToLongBits(0.0D))
            {
                double d1 = c;
                ku1.c(3, 1);
                long l2 = Double.doubleToLongBits(d1);
                ku1.b((int)l2 & 0xff);
                ku1.b((int)(l2 >> 8) & 0xff);
                ku1.b((int)(l2 >> 16) & 0xff);
                ku1.b((int)(l2 >> 24) & 0xff);
                ku1.b((int)(l2 >> 32) & 0xff);
                ku1.b((int)(l2 >> 40) & 0xff);
                ku1.b((int)(l2 >> 48) & 0xff);
                ku1.b((int)(l2 >> 56) & 0xff);
            }
            if (Float.floatToIntBits(d) != Float.floatToIntBits(0.0F))
            {
                ku1.a(4, d);
            }
            if (e != 0L)
            {
                ku1.a(5, e);
            }
            if (f != 0)
            {
                ku1.a(6, f);
            }
            if (g != 0)
            {
                int i1 = g;
                ku1.c(7, 0);
                ku1.d(ku.f(i1));
            }
            if (h)
            {
                ku1.a(8, h);
            }
            if (i != null && i.length > 0)
            {
                for (int j1 = 0; j1 < i.length; j1++)
                {
                    kr.a a1 = i[j1];
                    if (a1 != null)
                    {
                        ku1.a(9, a1);
                    }
                }

            }
            if (j != null && j.length > 0)
            {
                for (int k1 = 0; k1 < j.length; k1++)
                {
                    kr.a.a a2 = j[k1];
                    if (a2 != null)
                    {
                        ku1.a(10, a2);
                    }
                }

            }
            if (k != null && k.length > 0)
            {
                for (int l1 = 0; l1 < k.length; l1++)
                {
                    String s = k[l1];
                    if (s != null)
                    {
                        ku1.a(11, s);
                    }
                }

            }
            if (l != null && l.length > 0)
            {
                for (int i2 = 0; i2 < l.length; i2++)
                {
                    ku1.a(12, l[i2]);
                }

            }
            if (n != 0L)
            {
                ku1.a(13, n);
            }
            if (m != null && m.length > 0)
            {
                for (int j2 = ((flag) ? 1 : 0); j2 < m.length; j2++)
                {
                    ku1.a(14, m[j2]);
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
            if (!(obj instanceof a))
            {
                continue; /* Loop/switch isn't completed */
            }
            obj = (a)obj;
            flag = flag1;
            if (!Arrays.equals(a, ((a) (obj)).a))
            {
                continue; /* Loop/switch isn't completed */
            }
            if (b != null)
            {
                break; /* Loop/switch isn't completed */
            }
            flag = flag1;
            if (((a) (obj)).b != null)
            {
                continue; /* Loop/switch isn't completed */
            }
_L5:
            flag = flag1;
            if (Double.doubleToLongBits(c) == Double.doubleToLongBits(((a) (obj)).c))
            {
                flag = flag1;
                if (Float.floatToIntBits(d) == Float.floatToIntBits(((a) (obj)).d))
                {
                    flag = flag1;
                    if (e == ((a) (obj)).e)
                    {
                        flag = flag1;
                        if (f == ((a) (obj)).f)
                        {
                            flag = flag1;
                            if (g == ((a) (obj)).g)
                            {
                                flag = flag1;
                                if (h == ((a) (obj)).h)
                                {
                                    flag = flag1;
                                    if (kz.a(i, ((a) (obj)).i))
                                    {
                                        flag = flag1;
                                        if (kz.a(j, ((a) (obj)).j))
                                        {
                                            flag = flag1;
                                            if (kz.a(k, ((a) (obj)).k))
                                            {
                                                flag = flag1;
                                                if (kz.a(l, ((a) (obj)).l))
                                                {
                                                    flag = flag1;
                                                    if (kz.a(m, ((a) (obj)).m))
                                                    {
                                                        flag = flag1;
                                                        if (n == ((a) (obj)).n)
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
            if (true) goto _L4; else goto _L3
_L3:
            if (!b.equals(((a) (obj)).b))
            {
                return false;
            }
              goto _L5
            if (true) goto _L4; else goto _L6
_L6:
        }

        public final int hashCode()
        {
            int j1 = Arrays.hashCode(a);
            int i1;
            char c1;
            int k1;
            int l1;
            int i2;
            int j2;
            int k2;
            long l2;
            if (b == null)
            {
                i1 = 0;
            } else
            {
                i1 = b.hashCode();
            }
            l2 = Double.doubleToLongBits(c);
            k1 = (int)(l2 ^ l2 >>> 32);
            l1 = Float.floatToIntBits(d);
            i2 = (int)(e ^ e >>> 32);
            j2 = f;
            k2 = g;
            if (h)
            {
                c1 = '\u04CF';
            } else
            {
                c1 = '\u04D5';
            }
            return (((((((c1 + ((((((i1 + (j1 + 527) * 31) * 31 + k1) * 31 + l1) * 31 + i2) * 31 + j2) * 31 + k2) * 31) * 31 + kz.a(i)) * 31 + kz.a(j)) * 31 + kz.a(k)) * 31 + kz.a(l)) * 31 + kz.a(m)) * 31 + (int)(n ^ n >>> 32)) * 31 + c();
        }

        public a()
        {
            a = lf.h;
            b = "";
            c = 0.0D;
            d = 0.0F;
            e = 0L;
            f = 0;
            g = 0;
            h = false;
            i = kr.a.b();
            j = kr.a.a.b();
            k = lf.f;
            l = lf.b;
            m = lf.c;
            n = 0L;
            r = null;
            s = -1;
        }
    }


    private static volatile c c[];
    public int a;
    public a b;

    public static a.c[] b()
    {
        if (c == null)
        {
            synchronized (kz.a)
            {
                if (c == null)
                {
                    c = new c[0];
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
        int j = super.a() + ku.b(1, a);
        int i = j;
        if (b != null)
        {
            i = j + ku.b(2, b);
        }
        return i;
    }

    public final lb a(kt kt1)
        throws IOException
    {
_L5:
        int i = kt1.a();
        i;
        JVM INSTR lookupswitch 3: default 40
    //                   0: 49
    //                   8: 51
    //                   18: 143;
           goto _L1 _L2 _L3 _L4
_L1:
        if (a(kt1, i)) goto _L5; else goto _L2
_L2:
        return this;
_L3:
        int j = kt1.f();
        switch (j)
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
            a = j;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (b == null)
        {
            b = new a();
        }
        kt1.a(b);
        if (true) goto _L5; else goto _L6
_L6:
    }

    public final void a(ku ku1)
        throws IOException
    {
        ku1.a(1, a);
        if (b != null)
        {
            ku1.a(2, b);
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
        if (!(obj instanceof b)) goto _L4; else goto _L3
_L3:
        obj = (b)obj;
        flag = flag1;
        if (a != ((a) (obj)).a) goto _L4; else goto _L5
_L5:
        if (b != null) goto _L7; else goto _L6
_L6:
        flag = flag1;
        if (((b) (obj)).b != null) goto _L4; else goto _L8
_L8:
        return a(((kv) (obj)));
_L7:
        if (!b.equals(((a.equals) (obj)).b))
        {
            return false;
        }
        if (true) goto _L8; else goto _L9
_L9:
    }

    public final int hashCode()
    {
        int j = a;
        int i;
        if (b == null)
        {
            i = 0;
        } else
        {
            i = b.hashCode();
        }
        return (i + (j + 527) * 31) * 31 + c();
    }

    public a.s()
    {
        a = 1;
        b = null;
        r = null;
        s = -1;
    }
}
