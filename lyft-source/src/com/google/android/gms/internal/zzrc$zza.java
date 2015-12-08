// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            zzrh, zzrl, zzrf, zzrg, 
//            zzrn

public final class c extends zzrh
{

    private static volatile d c[];
    public String a;
    public zza b;

    public static c[] a()
    {
        if (c == null)
        {
            synchronized (zzrl.a)
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

    public c a(zzrf zzrf1)
    {
        do
        {
            int i = zzrf1.a();
            switch (i)
            {
            default:
                if (a(zzrf1, i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                a = zzrf1.h();
                break;

            case 18: // '\022'
                class zza extends zzrh
                {

                    private static volatile zza c[];
                    public int a;
                    public zza b;

                    public static zza[] a()
                    {
                        if (c == null)
                        {
                            synchronized (zzrl.a)
                            {
                                if (c == null)
                                {
                                    c = new zza[0];
                                }
                            }
                        }
                        return c;
                        exception;
                        obj;
                        JVM INSTR monitorexit ;
                        throw exception;
                    }

                    public zza a(zzrf zzrf2)
                    {
_L5:
                        int j = zzrf2.a();
                        j;
                        JVM INSTR lookupswitch 3: default 40
                    //                                   0: 49
                    //                                   8: 51
                    //                                   18: 143;
                           goto _L1 _L2 _L3 _L4
_L1:
                        if (a(zzrf2, j)) goto _L5; else goto _L2
_L2:
                        return this;
_L3:
                        int k = zzrf2.f();
                        switch (k)
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
                            a = k;
                            break;
                        }
                        continue; /* Loop/switch isn't completed */
_L4:
                        class zza extends zzrh
                        {

                            public byte a[];
                            public String b;
                            public double c;
                            public float d;
                            public long e;
                            public int f;
                            public int g;
                            public boolean h;
                            public zzrc.zza i[];
                            public zza j[];
                            public String k[];
                            public long l[];
                            public float m[];
                            public long n;

                            public zza a()
                            {
                                a = zzrq.h;
                                b = "";
                                c = 0.0D;
                                d = 0.0F;
                                e = 0L;
                                f = 0;
                                g = 0;
                                h = false;
                                i = zzrc.zza.a();
                                j = zza.a();
                                k = zzrq.f;
                                l = zzrq.b;
                                m = zzrq.c;
                                n = 0L;
                                o = null;
                                p = -1;
                                return this;
                            }

                            public zza a(zzrf zzrf3)
                            {
                                do
                                {
                                    int i1 = zzrf3.a();
                                    switch (i1)
                                    {
                                    default:
                                        if (a(zzrf3, i1))
                                        {
                                            continue;
                                        }
                                        // fall through

                                    case 0: // '\0'
                                        return this;

                                    case 10: // '\n'
                                        a = zzrf3.i();
                                        break;

                                    case 18: // '\022'
                                        b = zzrf3.h();
                                        break;

                                    case 25: // '\031'
                                        c = zzrf3.c();
                                        break;

                                    case 37: // '%'
                                        d = zzrf3.d();
                                        break;

                                    case 40: // '('
                                        e = zzrf3.e();
                                        break;

                                    case 48: // '0'
                                        f = zzrf3.f();
                                        break;

                                    case 56: // '8'
                                        g = zzrf3.j();
                                        break;

                                    case 64: // '@'
                                        h = zzrf3.g();
                                        break;

                                    case 74: // 'J'
                                        int i3 = zzrq.a(zzrf3, 74);
                                        zzrc.zza azza[];
                                        int j1;
                                        if (i == null)
                                        {
                                            j1 = 0;
                                        } else
                                        {
                                            j1 = i.length;
                                        }
                                        azza = new zzrc.zza[i3 + j1];
                                        i3 = j1;
                                        if (j1 != 0)
                                        {
                                            System.arraycopy(i, 0, azza, 0, j1);
                                            i3 = j1;
                                        }
                                        for (; i3 < azza.length - 1; i3++)
                                        {
                                            azza[i3] = new zzrc.zza();
                                            zzrf3.a(azza[i3]);
                                            zzrf3.a();
                                        }

                                        azza[i3] = new zzrc.zza();
                                        zzrf3.a(azza[i3]);
                                        i = azza;
                                        break;

                                    case 82: // 'R'
                                        int j3 = zzrq.a(zzrf3, 82);
                                        zza azza1[];
                                        int k1;
                                        if (j == null)
                                        {
                                            k1 = 0;
                                        } else
                                        {
                                            k1 = j.length;
                                        }
                                        azza1 = new zza[j3 + k1];
                                        j3 = k1;
                                        if (k1 != 0)
                                        {
                                            System.arraycopy(j, 0, azza1, 0, k1);
                                            j3 = k1;
                                        }
                                        for (; j3 < azza1.length - 1; j3++)
                                        {
                                            azza1[j3] = new zza();
                                            zzrf3.a(azza1[j3]);
                                            zzrf3.a();
                                        }

                                        azza1[j3] = new zza();
                                        zzrf3.a(azza1[j3]);
                                        j = azza1;
                                        break;

                                    case 90: // 'Z'
                                        int k3 = zzrq.a(zzrf3, 90);
                                        String as[];
                                        int l1;
                                        if (k == null)
                                        {
                                            l1 = 0;
                                        } else
                                        {
                                            l1 = k.length;
                                        }
                                        as = new String[k3 + l1];
                                        k3 = l1;
                                        if (l1 != 0)
                                        {
                                            System.arraycopy(k, 0, as, 0, l1);
                                            k3 = l1;
                                        }
                                        for (; k3 < as.length - 1; k3++)
                                        {
                                            as[k3] = zzrf3.h();
                                            zzrf3.a();
                                        }

                                        as[k3] = zzrf3.h();
                                        k = as;
                                        break;

                                    case 96: // '`'
                                        int l3 = zzrq.a(zzrf3, 96);
                                        long al[];
                                        int i2;
                                        if (l == null)
                                        {
                                            i2 = 0;
                                        } else
                                        {
                                            i2 = l.length;
                                        }
                                        al = new long[l3 + i2];
                                        l3 = i2;
                                        if (i2 != 0)
                                        {
                                            System.arraycopy(l, 0, al, 0, i2);
                                            l3 = i2;
                                        }
                                        for (; l3 < al.length - 1; l3++)
                                        {
                                            al[l3] = zzrf3.e();
                                            zzrf3.a();
                                        }

                                        al[l3] = zzrf3.e();
                                        l = al;
                                        break;

                                    case 98: // 'b'
                                        int l4 = zzrf3.d(zzrf3.k());
                                        int j2 = zzrf3.q();
                                        int i4;
                                        for (i4 = 0; zzrf3.o() > 0; i4++)
                                        {
                                            zzrf3.e();
                                        }

                                        zzrf3.f(j2);
                                        long al1[];
                                        if (l == null)
                                        {
                                            j2 = 0;
                                        } else
                                        {
                                            j2 = l.length;
                                        }
                                        al1 = new long[i4 + j2];
                                        i4 = j2;
                                        if (j2 != 0)
                                        {
                                            System.arraycopy(l, 0, al1, 0, j2);
                                            i4 = j2;
                                        }
                                        for (; i4 < al1.length; i4++)
                                        {
                                            al1[i4] = zzrf3.e();
                                        }

                                        l = al1;
                                        zzrf3.e(l4);
                                        break;

                                    case 104: // 'h'
                                        n = zzrf3.e();
                                        break;

                                    case 117: // 'u'
                                        int j4 = zzrq.a(zzrf3, 117);
                                        float af[];
                                        int k2;
                                        if (m == null)
                                        {
                                            k2 = 0;
                                        } else
                                        {
                                            k2 = m.length;
                                        }
                                        af = new float[j4 + k2];
                                        j4 = k2;
                                        if (k2 != 0)
                                        {
                                            System.arraycopy(m, 0, af, 0, k2);
                                            j4 = k2;
                                        }
                                        for (; j4 < af.length - 1; j4++)
                                        {
                                            af[j4] = zzrf3.d();
                                            zzrf3.a();
                                        }

                                        af[j4] = zzrf3.d();
                                        m = af;
                                        break;

                                    case 114: // 'r'
                                        int l2 = zzrf3.k();
                                        int i5 = zzrf3.d(l2);
                                        int k4 = l2 / 4;
                                        float af1[];
                                        if (m == null)
                                        {
                                            l2 = 0;
                                        } else
                                        {
                                            l2 = m.length;
                                        }
                                        af1 = new float[k4 + l2];
                                        k4 = l2;
                                        if (l2 != 0)
                                        {
                                            System.arraycopy(m, 0, af1, 0, l2);
                                            k4 = l2;
                                        }
                                        for (; k4 < af1.length; k4++)
                                        {
                                            af1[k4] = zzrf3.d();
                                        }

                                        m = af1;
                                        zzrf3.e(i5);
                                        break;
                                    }
                                } while (true);
                            }

                            public void a(zzrg zzrg1)
                            {
                                boolean flag = false;
                                if (!Arrays.equals(a, zzrq.h))
                                {
                                    zzrg1.a(1, a);
                                }
                                if (!b.equals(""))
                                {
                                    zzrg1.a(2, b);
                                }
                                if (Double.doubleToLongBits(c) != Double.doubleToLongBits(0.0D))
                                {
                                    zzrg1.a(3, c);
                                }
                                if (Float.floatToIntBits(d) != Float.floatToIntBits(0.0F))
                                {
                                    zzrg1.a(4, d);
                                }
                                if (e != 0L)
                                {
                                    zzrg1.a(5, e);
                                }
                                if (f != 0)
                                {
                                    zzrg1.a(6, f);
                                }
                                if (g != 0)
                                {
                                    zzrg1.b(7, g);
                                }
                                if (h)
                                {
                                    zzrg1.a(8, h);
                                }
                                if (i != null && i.length > 0)
                                {
                                    for (int i1 = 0; i1 < i.length; i1++)
                                    {
                                        zzrc.zza zza1 = i[i1];
                                        if (zza1 != null)
                                        {
                                            zzrg1.a(9, zza1);
                                        }
                                    }

                                }
                                if (j != null && j.length > 0)
                                {
                                    for (int j1 = 0; j1 < j.length; j1++)
                                    {
                                        zza zza2 = j[j1];
                                        if (zza2 != null)
                                        {
                                            zzrg1.a(10, zza2);
                                        }
                                    }

                                }
                                if (k != null && k.length > 0)
                                {
                                    for (int k1 = 0; k1 < k.length; k1++)
                                    {
                                        String s = k[k1];
                                        if (s != null)
                                        {
                                            zzrg1.a(11, s);
                                        }
                                    }

                                }
                                if (l != null && l.length > 0)
                                {
                                    for (int l1 = 0; l1 < l.length; l1++)
                                    {
                                        zzrg1.a(12, l[l1]);
                                    }

                                }
                                if (n != 0L)
                                {
                                    zzrg1.a(13, n);
                                }
                                if (m != null && m.length > 0)
                                {
                                    for (int i2 = ((flag) ? 1 : 0); i2 < m.length; i2++)
                                    {
                                        zzrg1.a(14, m[i2]);
                                    }

                                }
                                super.a(zzrg1);
                            }

                            protected int b()
                            {
                                boolean flag = false;
                                int j1 = super.b();
                                int i1 = j1;
                                if (!Arrays.equals(a, zzrq.h))
                                {
                                    i1 = j1 + zzrg.b(1, a);
                                }
                                j1 = i1;
                                if (!b.equals(""))
                                {
                                    j1 = i1 + zzrg.b(2, b);
                                }
                                i1 = j1;
                                if (Double.doubleToLongBits(c) != Double.doubleToLongBits(0.0D))
                                {
                                    i1 = j1 + zzrg.b(3, c);
                                }
                                j1 = i1;
                                if (Float.floatToIntBits(d) != Float.floatToIntBits(0.0F))
                                {
                                    j1 = i1 + zzrg.b(4, d);
                                }
                                i1 = j1;
                                if (e != 0L)
                                {
                                    i1 = j1 + zzrg.b(5, e);
                                }
                                j1 = i1;
                                if (f != 0)
                                {
                                    j1 = i1 + zzrg.c(6, f);
                                }
                                int k1 = j1;
                                if (g != 0)
                                {
                                    k1 = j1 + zzrg.d(7, g);
                                }
                                i1 = k1;
                                if (h)
                                {
                                    i1 = k1 + zzrg.b(8, h);
                                }
                                j1 = i1;
                                if (i != null)
                                {
                                    j1 = i1;
                                    if (i.length > 0)
                                    {
                                        for (j1 = 0; j1 < i.length;)
                                        {
                                            zzrc.zza zza1 = i[j1];
                                            int l1 = i1;
                                            if (zza1 != null)
                                            {
                                                l1 = i1 + zzrg.c(9, zza1);
                                            }
                                            j1++;
                                            i1 = l1;
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
                                            zza zza2 = j[j1];
                                            int i2 = i1;
                                            if (zza2 != null)
                                            {
                                                i2 = i1 + zzrg.c(10, zza2);
                                            }
                                            j1++;
                                            i1 = i2;
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
                                        int j2 = 0;
                                        int l2;
                                        int i3;
                                        for (l2 = 0; j1 < k.length; l2 = i3)
                                        {
                                            String s = k[j1];
                                            int j3 = j2;
                                            i3 = l2;
                                            if (s != null)
                                            {
                                                i3 = l2 + 1;
                                                j3 = j2 + zzrg.b(s);
                                            }
                                            j1++;
                                            j2 = j3;
                                        }

                                        j1 = i1 + j2 + l2 * 1;
                                    }
                                }
                                i1 = j1;
                                if (l != null)
                                {
                                    i1 = j1;
                                    if (l.length > 0)
                                    {
                                        int k2 = 0;
                                        for (i1 = ((flag) ? 1 : 0); i1 < l.length; i1++)
                                        {
                                            k2 += zzrg.b(l[i1]);
                                        }

                                        i1 = j1 + k2 + l.length * 1;
                                    }
                                }
                                j1 = i1;
                                if (n != 0L)
                                {
                                    j1 = i1 + zzrg.b(13, n);
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

                            public zzrn b(zzrf zzrf3)
                            {
                                return a(zzrf3);
                            }

                            public boolean equals(Object obj)
                            {
                                boolean flag1 = false;
                                if (obj != this) goto _L2; else goto _L1
_L1:
                                boolean flag = true;
_L4:
                                return flag;
_L2:
                                flag = flag1;
                                if (!(obj instanceof zza))
                                {
                                    continue; /* Loop/switch isn't completed */
                                }
                                obj = (zza)obj;
                                flag = flag1;
                                if (!Arrays.equals(a, ((zza) (obj)).a))
                                {
                                    continue; /* Loop/switch isn't completed */
                                }
                                if (b != null)
                                {
                                    break; /* Loop/switch isn't completed */
                                }
                                flag = flag1;
                                if (((zza) (obj)).b != null)
                                {
                                    continue; /* Loop/switch isn't completed */
                                }
_L5:
                                flag = flag1;
                                if (Double.doubleToLongBits(c) == Double.doubleToLongBits(((zza) (obj)).c))
                                {
                                    flag = flag1;
                                    if (Float.floatToIntBits(d) == Float.floatToIntBits(((zza) (obj)).d))
                                    {
                                        flag = flag1;
                                        if (e == ((zza) (obj)).e)
                                        {
                                            flag = flag1;
                                            if (f == ((zza) (obj)).f)
                                            {
                                                flag = flag1;
                                                if (g == ((zza) (obj)).g)
                                                {
                                                    flag = flag1;
                                                    if (h == ((zza) (obj)).h)
                                                    {
                                                        flag = flag1;
                                                        if (zzrl.a(i, ((zza) (obj)).i))
                                                        {
                                                            flag = flag1;
                                                            if (zzrl.a(j, ((zza) (obj)).j))
                                                            {
                                                                flag = flag1;
                                                                if (zzrl.a(k, ((zza) (obj)).k))
                                                                {
                                                                    flag = flag1;
                                                                    if (zzrl.a(l, ((zza) (obj)).l))
                                                                    {
                                                                        flag = flag1;
                                                                        if (zzrl.a(m, ((zza) (obj)).m))
                                                                        {
                                                                            flag = flag1;
                                                                            if (n == ((zza) (obj)).n)
                                                                            {
                                                                                return a(((zzrh) (obj)));
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
                                if (!b.equals(((zza) (obj)).b))
                                {
                                    return false;
                                }
                                  goto _L5
                                if (true) goto _L4; else goto _L6
_L6:
                            }

                            public int hashCode()
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
                                return (((((((c1 + ((((((i1 + (j1 + 527) * 31) * 31 + k1) * 31 + l1) * 31 + i2) * 31 + j2) * 31 + k2) * 31) * 31 + zzrl.a(i)) * 31 + zzrl.a(j)) * 31 + zzrl.a(k)) * 31 + zzrl.a(l)) * 31 + zzrl.a(m)) * 31 + (int)(n ^ n >>> 32)) * 31 + d();
                            }

                                public zza()
                                {
                                    a();
                                }
                        }

                        if (b == null)
                        {
                            b = new zza();
                        }
                        zzrf2.a(b);
                        if (true) goto _L5; else goto _L6
_L6:
                    }

                    public void a(zzrg zzrg1)
                    {
                        zzrg1.a(1, a);
                        if (b != null)
                        {
                            zzrg1.a(2, b);
                        }
                        super.a(zzrg1);
                    }

                    protected int b()
                    {
                        int k = super.b() + zzrg.c(1, a);
                        int j = k;
                        if (b != null)
                        {
                            j = k + zzrg.c(2, b);
                        }
                        return j;
                    }

                    public zzrn b(zzrf zzrf2)
                    {
                        return a(zzrf2);
                    }

                    public zza c()
                    {
                        a = 1;
                        b = null;
                        o = null;
                        p = -1;
                        return this;
                    }

                    public boolean equals(Object obj)
                    {
                        boolean flag1 = false;
                        if (obj != this) goto _L2; else goto _L1
_L1:
                        boolean flag = true;
_L4:
                        return flag;
_L2:
                        flag = flag1;
                        if (!(obj instanceof zza)) goto _L4; else goto _L3
_L3:
                        obj = (zza)obj;
                        flag = flag1;
                        if (a != ((zza) (obj)).a) goto _L4; else goto _L5
_L5:
                        if (b != null) goto _L7; else goto _L6
_L6:
                        flag = flag1;
                        if (((zza) (obj)).b != null) goto _L4; else goto _L8
_L8:
                        return a(((zzrh) (obj)));
_L7:
                        if (!b.equals(((zza) (obj)).b))
                        {
                            return false;
                        }
                        if (true) goto _L8; else goto _L9
_L9:
                    }

                    public int hashCode()
                    {
                        int k = a;
                        int j;
                        if (b == null)
                        {
                            j = 0;
                        } else
                        {
                            j = b.hashCode();
                        }
                        return (j + (k + 527) * 31) * 31 + d();
                    }

            public zza()
            {
                c();
            }
                }

                if (b == null)
                {
                    b = new zza();
                }
                zzrf1.a(b);
                break;
            }
        } while (true);
    }

    public void a(zzrg zzrg1)
    {
        zzrg1.a(1, a);
        if (b != null)
        {
            zzrg1.a(2, b);
        }
        super.a(zzrg1);
    }

    protected int b()
    {
        int j = super.b() + zzrg.b(1, a);
        int i = j;
        if (b != null)
        {
            i = j + zzrg.c(2, b);
        }
        return i;
    }

    public zzrn b(zzrf zzrf1)
    {
        return a(zzrf1);
    }

    public a c()
    {
        a = "";
        b = null;
        o = null;
        p = -1;
        return this;
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        if (obj != this) goto _L2; else goto _L1
_L1:
        boolean flag = true;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (!(obj instanceof p)) goto _L4; else goto _L3
_L3:
        obj = (p)obj;
        if (a != null) goto _L6; else goto _L5
_L5:
        flag = flag1;
        if (((a) (obj)).a != null) goto _L4; else goto _L7
_L7:
        if (b != null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        flag = flag1;
        if (((b) (obj)).b != null) goto _L4; else goto _L8
_L8:
        return a(((zzrh) (obj)));
_L6:
        if (!a.equals(((a) (obj)).a))
        {
            return false;
        }
          goto _L7
        if (!b.equals(((zza.equals) (obj)).b))
        {
            return false;
        }
          goto _L8
    }

    public int hashCode()
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
        return ((i + 527) * 31 + j) * 31 + d();
    }

    public zza()
    {
        c();
    }
}
