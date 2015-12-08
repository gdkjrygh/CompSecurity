// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.internal:
//            ex, ev, fc, ew, 
//            zzrx, fa, fd, fg

public static final class A extends ex
{
    public static final class a extends ex
    {

        private static volatile a c[];
        public int a;
        public a b;

        public static a[] a()
        {
            if (c == null)
            {
                synchronized (fc.a)
                {
                    if (c == null)
                    {
                        c = new a[0];
                    }
                }
            }
            return c;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public final fd a(ew ew1)
            throws IOException
        {
_L5:
            int i = ew1.a();
            i;
            JVM INSTR lookupswitch 3: default 40
        //                       0: 49
        //                       8: 51
        //                       18: 143;
               goto _L1 _L2 _L3 _L4
_L1:
            if (a(ew1, i)) goto _L5; else goto _L2
_L2:
            return this;
_L3:
            int j = ew1.e();
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
            ew1.a(b);
            if (true) goto _L5; else goto _L6
_L6:
        }

        public final void a(zzrx zzrx1)
            throws IOException
        {
            zzrx1.a(1, a);
            if (b != null)
            {
                zzrx1.a(2, b);
            }
            super.a(zzrx1);
        }

        protected final int b()
        {
            int j = super.b() + zzrx.b(1, a);
            int i = j;
            if (b != null)
            {
                i = j + zzrx.b(2, b);
            }
            return i;
        }

        public final boolean equals(Object obj)
        {
            if (obj != this)
            {
                if (!(obj instanceof a))
                {
                    return false;
                }
                obj = (a)obj;
                if (a != ((a) (obj)).a)
                {
                    return false;
                }
                if (b == null)
                {
                    if (((a) (obj)).b != null)
                    {
                        return false;
                    }
                } else
                if (!b.equals(((a) (obj)).b))
                {
                    return false;
                }
                if (o == null || o.c())
                {
                    if (((a) (obj)).o != null && !((a) (obj)).o.c())
                    {
                        return false;
                    }
                } else
                {
                    return o.equals(((a) (obj)).o);
                }
            }
            return true;
        }

        public final int hashCode()
        {
            boolean flag = false;
            int k = getClass().getName().hashCode();
            int l = a;
            int i;
            int j;
            if (b == null)
            {
                i = 0;
            } else
            {
                i = b.hashCode();
            }
            j = ((flag) ? 1 : 0);
            if (o != null)
            {
                if (o.c())
                {
                    j = ((flag) ? 1 : 0);
                } else
                {
                    j = o.hashCode();
                }
            }
            return (i + ((k + 527) * 31 + l) * 31) * 31 + j;
        }

        public a()
        {
            a = 1;
            b = null;
            o = null;
            A = -1;
        }
    }

    public static final class a.a extends ex
    {

        public byte a[];
        public String b;
        public double c;
        public float d;
        public long e;
        public int f;
        public int g;
        public boolean h;
        public ev.a i[];
        public a j[];
        public String k[];
        public long l[];
        public float m[];
        public long n;

        public final fd a(ew ew1)
            throws IOException
        {
label0:
            do
            {
                int i1 = ew1.a();
                switch (i1)
                {
                default:
                    if (a(ew1, i1))
                    {
                        continue;
                    }
                    // fall through

                case 0: // '\0'
                    return this;

                case 10: // '\n'
                    int j1 = ew1.e();
                    byte abyte0[];
                    if (j1 <= ew1.c - ew1.d && j1 > 0)
                    {
                        abyte0 = new byte[j1];
                        System.arraycopy(ew1.a, ew1.d, abyte0, 0, j1);
                        ew1.d = j1 + ew1.d;
                    } else
                    if (j1 == 0)
                    {
                        abyte0 = fg.h;
                    } else
                    {
                        abyte0 = ew1.f(j1);
                    }
                    a = abyte0;
                    continue;

                case 18: // '\022'
                    b = ew1.d();
                    continue;

                case 25: // '\031'
                    c = Double.longBitsToDouble(ew1.g());
                    continue;

                case 37: // '%'
                    d = Float.intBitsToFloat(ew1.f());
                    continue;

                case 40: // '('
                    e = ew1.b();
                    continue;

                case 48: // '0'
                    f = ew1.e();
                    continue;

                case 56: // '8'
                    int k1 = ew1.e();
                    g = -(k1 & 1) ^ k1 >>> 1;
                    continue;

                case 64: // '@'
                    h = ew1.c();
                    continue;

                case 74: // 'J'
                    int l3 = fg.b(ew1, 74);
                    ev.a aa[];
                    int l1;
                    if (i == null)
                    {
                        l1 = 0;
                    } else
                    {
                        l1 = i.length;
                    }
                    aa = new ev.a[l3 + l1];
                    l3 = l1;
                    if (l1 != 0)
                    {
                        System.arraycopy(i, 0, aa, 0, l1);
                        l3 = l1;
                    }
                    for (; l3 < aa.length - 1; l3++)
                    {
                        aa[l3] = new ev.a();
                        ew1.a(aa[l3]);
                        ew1.a();
                    }

                    aa[l3] = new ev.a();
                    ew1.a(aa[l3]);
                    i = aa;
                    continue;

                case 82: // 'R'
                    int i4 = fg.b(ew1, 82);
                    a aa1[];
                    int i2;
                    if (j == null)
                    {
                        i2 = 0;
                    } else
                    {
                        i2 = j.length;
                    }
                    aa1 = new a[i4 + i2];
                    i4 = i2;
                    if (i2 != 0)
                    {
                        System.arraycopy(j, 0, aa1, 0, i2);
                        i4 = i2;
                    }
                    for (; i4 < aa1.length - 1; i4++)
                    {
                        aa1[i4] = new a();
                        ew1.a(aa1[i4]);
                        ew1.a();
                    }

                    aa1[i4] = new a();
                    ew1.a(aa1[i4]);
                    j = aa1;
                    continue;

                case 90: // 'Z'
                    int j4 = fg.b(ew1, 90);
                    String as[];
                    int j2;
                    if (k == null)
                    {
                        j2 = 0;
                    } else
                    {
                        j2 = k.length;
                    }
                    as = new String[j4 + j2];
                    j4 = j2;
                    if (j2 != 0)
                    {
                        System.arraycopy(k, 0, as, 0, j2);
                        j4 = j2;
                    }
                    for (; j4 < as.length - 1; j4++)
                    {
                        as[j4] = ew1.d();
                        ew1.a();
                    }

                    as[j4] = ew1.d();
                    k = as;
                    continue;

                case 96: // '`'
                    int k4 = fg.b(ew1, 96);
                    long al[];
                    int k2;
                    if (l == null)
                    {
                        k2 = 0;
                    } else
                    {
                        k2 = l.length;
                    }
                    al = new long[k4 + k2];
                    k4 = k2;
                    if (k2 != 0)
                    {
                        System.arraycopy(l, 0, al, 0, k2);
                        k4 = k2;
                    }
                    for (; k4 < al.length - 1; k4++)
                    {
                        al[k4] = ew1.b();
                        ew1.a();
                    }

                    al[k4] = ew1.b();
                    l = al;
                    continue;

                case 98: // 'b'
                    int k5 = ew1.c(ew1.e());
                    int i6 = ew1.h();
                    int l4 = 0;
                    do
                    {
                        int l2;
                        if (ew1.e == 0x7fffffff)
                        {
                            l2 = -1;
                        } else
                        {
                            l2 = ew1.d;
                            l2 = ew1.e - l2;
                        }
                        if (l2 > 0)
                        {
                            ew1.b();
                            l4++;
                        } else
                        {
                            ew1.e(i6);
                            long al1[];
                            int i3;
                            if (l == null)
                            {
                                i3 = 0;
                            } else
                            {
                                i3 = l.length;
                            }
                            al1 = new long[l4 + i3];
                            l4 = i3;
                            if (i3 != 0)
                            {
                                System.arraycopy(l, 0, al1, 0, i3);
                                l4 = i3;
                            }
                            for (; l4 < al1.length; l4++)
                            {
                                al1[l4] = ew1.b();
                            }

                            l = al1;
                            ew1.d(k5);
                            continue label0;
                        }
                    } while (true);

                case 104: // 'h'
                    n = ew1.b();
                    break;

                case 117: // 'u'
                    int i5 = fg.b(ew1, 117);
                    float af[];
                    int j3;
                    if (m == null)
                    {
                        j3 = 0;
                    } else
                    {
                        j3 = m.length;
                    }
                    af = new float[i5 + j3];
                    i5 = j3;
                    if (j3 != 0)
                    {
                        System.arraycopy(m, 0, af, 0, j3);
                        i5 = j3;
                    }
                    for (; i5 < af.length - 1; i5++)
                    {
                        af[i5] = Float.intBitsToFloat(ew1.f());
                        ew1.a();
                    }

                    af[i5] = Float.intBitsToFloat(ew1.f());
                    m = af;
                    break;

                case 114: // 'r'
                    int k3 = ew1.e();
                    int l5 = ew1.c(k3);
                    int j5 = k3 / 4;
                    float af1[];
                    if (m == null)
                    {
                        k3 = 0;
                    } else
                    {
                        k3 = m.length;
                    }
                    af1 = new float[j5 + k3];
                    j5 = k3;
                    if (k3 != 0)
                    {
                        System.arraycopy(m, 0, af1, 0, k3);
                        j5 = k3;
                    }
                    for (; j5 < af1.length; j5++)
                    {
                        af1[j5] = Float.intBitsToFloat(ew1.f());
                    }

                    m = af1;
                    ew1.d(l5);
                    break;
                }
            } while (true);
        }

        public final void a(zzrx zzrx1)
            throws IOException
        {
            boolean flag = false;
            if (!Arrays.equals(a, fg.h))
            {
                byte abyte0[] = a;
                zzrx1.c(1, 2);
                zzrx1.b(abyte0.length);
                zzrx1.a(abyte0);
            }
            if (!b.equals(""))
            {
                zzrx1.a(2, b);
            }
            if (Double.doubleToLongBits(c) != Double.doubleToLongBits(0.0D))
            {
                double d1 = c;
                zzrx1.c(3, 1);
                long l2 = Double.doubleToLongBits(d1);
                if (zzrx1.a.remaining() < 8)
                {
                    throw new zzrx.zza(zzrx1.a.position(), zzrx1.a.limit());
                }
                zzrx1.a.putLong(l2);
            }
            if (Float.floatToIntBits(d) != Float.floatToIntBits(0.0F))
            {
                zzrx1.a(4, d);
            }
            if (e != 0L)
            {
                zzrx1.a(5, e);
            }
            if (f != 0)
            {
                zzrx1.a(6, f);
            }
            if (g != 0)
            {
                int i1 = g;
                zzrx1.c(7, 0);
                zzrx1.b(zzrx.d(i1));
            }
            if (h)
            {
                zzrx1.a(8, h);
            }
            if (i != null && i.length > 0)
            {
                for (int j1 = 0; j1 < i.length; j1++)
                {
                    ev.a a1 = i[j1];
                    if (a1 != null)
                    {
                        zzrx1.a(9, a1);
                    }
                }

            }
            if (j != null && j.length > 0)
            {
                for (int k1 = 0; k1 < j.length; k1++)
                {
                    a a2 = j[k1];
                    if (a2 != null)
                    {
                        zzrx1.a(10, a2);
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
                        zzrx1.a(11, s);
                    }
                }

            }
            if (l != null && l.length > 0)
            {
                for (int i2 = 0; i2 < l.length; i2++)
                {
                    zzrx1.a(12, l[i2]);
                }

            }
            if (n != 0L)
            {
                zzrx1.a(13, n);
            }
            if (m != null && m.length > 0)
            {
                for (int j2 = ((flag) ? 1 : 0); j2 < m.length; j2++)
                {
                    zzrx1.a(14, m[j2]);
                }

            }
            super.a(zzrx1);
        }

        protected final int b()
        {
            boolean flag = false;
            int j1 = super.b();
            int i1 = j1;
            if (!Arrays.equals(a, fg.h))
            {
                byte abyte0[] = a;
                i1 = zzrx.a(1);
                int k1 = zzrx.c(abyte0.length);
                i1 = j1 + (abyte0.length + k1 + i1);
            }
            j1 = i1;
            if (!b.equals(""))
            {
                j1 = i1 + zzrx.b(2, b);
            }
            i1 = j1;
            if (Double.doubleToLongBits(c) != Double.doubleToLongBits(0.0D))
            {
                i1 = j1 + (zzrx.a(3) + 8);
            }
            j1 = i1;
            if (Float.floatToIntBits(d) != Float.floatToIntBits(0.0F))
            {
                j1 = i1 + (zzrx.a(4) + 4);
            }
            int l1 = j1;
            if (e != 0L)
            {
                l1 = j1 + zzrx.b(5, e);
            }
            i1 = l1;
            if (f != 0)
            {
                i1 = l1 + zzrx.b(6, f);
            }
            j1 = i1;
            if (g != 0)
            {
                j1 = g;
                int i2 = zzrx.a(7);
                j1 = i1 + (zzrx.c(zzrx.d(j1)) + i2);
            }
            i1 = j1;
            if (h)
            {
                i1 = j1 + (zzrx.a(8) + 1);
            }
            j1 = i1;
            if (i != null)
            {
                j1 = i1;
                if (i.length > 0)
                {
                    for (j1 = 0; j1 < i.length;)
                    {
                        ev.a a1 = i[j1];
                        int j2 = i1;
                        if (a1 != null)
                        {
                            j2 = i1 + zzrx.b(9, a1);
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
                        a a2 = j[j1];
                        int k2 = i1;
                        if (a2 != null)
                        {
                            k2 = i1 + zzrx.b(10, a2);
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
                            l3 = l2 + zzrx.a(s);
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
                        i3 += zzrx.a(l[i1]);
                    }

                    i1 = j1 + i3 + l.length * 1;
                }
            }
            j1 = i1;
            if (n != 0L)
            {
                j1 = i1 + zzrx.b(13, n);
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

        public final boolean equals(Object obj)
        {
            if (obj != this)
            {
                if (!(obj instanceof a.a))
                {
                    return false;
                }
                obj = (a.a)obj;
                if (!Arrays.equals(a, ((a.a) (obj)).a))
                {
                    return false;
                }
                if (b == null)
                {
                    if (((a.a) (obj)).b != null)
                    {
                        return false;
                    }
                } else
                if (!b.equals(((a.a) (obj)).b))
                {
                    return false;
                }
                if (Double.doubleToLongBits(c) != Double.doubleToLongBits(((a.a) (obj)).c))
                {
                    return false;
                }
                if (Float.floatToIntBits(d) != Float.floatToIntBits(((a.a) (obj)).d))
                {
                    return false;
                }
                if (e != ((a.a) (obj)).e)
                {
                    return false;
                }
                if (f != ((a.a) (obj)).f)
                {
                    return false;
                }
                if (g != ((a.a) (obj)).g)
                {
                    return false;
                }
                if (h != ((a.a) (obj)).h)
                {
                    return false;
                }
                if (!fc.a(i, ((a.a) (obj)).i))
                {
                    return false;
                }
                if (!fc.a(j, ((a.a) (obj)).j))
                {
                    return false;
                }
                if (!fc.a(k, ((a.a) (obj)).k))
                {
                    return false;
                }
                if (!fc.a(l, ((a.a) (obj)).l))
                {
                    return false;
                }
                if (!fc.a(m, ((a.a) (obj)).m))
                {
                    return false;
                }
                if (n != ((a.a) (obj)).n)
                {
                    return false;
                }
                if (o == null || o.c())
                {
                    if (((a.a) (obj)).o != null && !((a.a) (obj)).o.c())
                    {
                        return false;
                    }
                } else
                {
                    return o.equals(((a.a) (obj)).o);
                }
            }
            return true;
        }

        public final int hashCode()
        {
            boolean flag = false;
            int k1 = getClass().getName().hashCode();
            int l1 = Arrays.hashCode(a);
            int i1;
            char c1;
            int j1;
            int i2;
            int j2;
            int k2;
            int l2;
            int i3;
            int j3;
            int k3;
            int l3;
            int i4;
            int j4;
            int k4;
            long l4;
            if (b == null)
            {
                i1 = 0;
            } else
            {
                i1 = b.hashCode();
            }
            l4 = Double.doubleToLongBits(c);
            i2 = (int)(l4 ^ l4 >>> 32);
            j2 = Float.floatToIntBits(d);
            k2 = (int)(e ^ e >>> 32);
            l2 = f;
            i3 = g;
            if (h)
            {
                c1 = '\u04CF';
            } else
            {
                c1 = '\u04D5';
            }
            j3 = fc.a(i);
            k3 = fc.a(j);
            l3 = fc.a(k);
            i4 = fc.a(l);
            j4 = fc.a(m);
            k4 = (int)(n ^ n >>> 32);
            j1 = ((flag) ? 1 : 0);
            if (o != null)
            {
                if (o.c())
                {
                    j1 = ((flag) ? 1 : 0);
                } else
                {
                    j1 = o.hashCode();
                }
            }
            return (((((((c1 + ((((((i1 + ((k1 + 527) * 31 + l1) * 31) * 31 + i2) * 31 + j2) * 31 + k2) * 31 + l2) * 31 + i3) * 31) * 31 + j3) * 31 + k3) * 31 + l3) * 31 + i4) * 31 + j4) * 31 + k4) * 31 + j1;
        }

        public a.a()
        {
            a = fg.h;
            b = "";
            c = 0.0D;
            d = 0.0F;
            e = 0L;
            f = 0;
            g = 0;
            h = false;
            i = ev.a.a();
            j = a.a();
            k = fg.f;
            l = fg.b;
            m = fg.c;
            n = 0L;
            o = null;
            A = -1;
        }
    }


    private static volatile shCode c[];
    public String a;
    public a b;

    public static a[] a()
    {
        if (c == null)
        {
            synchronized (fc.a)
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

    public final fd a(ew ew1)
        throws IOException
    {
        do
        {
            int i = ew1.a();
            switch (i)
            {
            default:
                if (a(ew1, i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                a = ew1.d();
                break;

            case 18: // '\022'
                if (b == null)
                {
                    b = new a();
                }
                ew1.a(b);
                break;
            }
        } while (true);
    }

    public final void a(zzrx zzrx1)
        throws IOException
    {
        zzrx1.a(1, a);
        if (b != null)
        {
            zzrx1.a(2, b);
        }
        super.a(zzrx1);
    }

    protected final int b()
    {
        int j = super.b() + zzrx.b(1, a);
        int i = j;
        if (b != null)
        {
            i = j + zzrx.b(2, b);
        }
        return i;
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof b))
            {
                return false;
            }
            obj = (b)obj;
            if (a == null)
            {
                if (((a) (obj)).a != null)
                {
                    return false;
                }
            } else
            if (!a.equals(((a) (obj)).a))
            {
                return false;
            }
            if (b == null)
            {
                if (((b) (obj)).b != null)
                {
                    return false;
                }
            } else
            if (!b.equals(((a.equals) (obj)).b))
            {
                return false;
            }
            if (o == null || o.c())
            {
                if (((o) (obj)).o != null && !((o) (obj)).o.c())
                {
                    return false;
                }
            } else
            {
                return o.equals(((uals) (obj)).o);
            }
        }
        return true;
    }

    public final int hashCode()
    {
        boolean flag = false;
        int l = getClass().getName().hashCode();
        int i;
        int j;
        int k;
        if (a == null)
        {
            i = 0;
        } else
        {
            i = a.hashCode();
        }
        if (b == null)
        {
            j = 0;
        } else
        {
            j = b.hashCode();
        }
        k = ((flag) ? 1 : 0);
        if (o != null)
        {
            if (o.c())
            {
                k = ((flag) ? 1 : 0);
            } else
            {
                k = o.hashCode();
            }
        }
        return (j + (i + (l + 527) * 31) * 31) * 31 + k;
    }

    public a.A()
    {
        a = "";
        b = null;
        o = null;
        A = -1;
    }
}
