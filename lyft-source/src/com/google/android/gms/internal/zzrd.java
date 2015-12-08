// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            zzrh, zzrn, zzrq, zzrf, 
//            zzrg, zzrl

public final class zzrd extends zzrh
{

    public String a[];
    public int b[];
    public byte c[][];

    public zzrd()
    {
        a();
    }

    public static zzrd a(byte abyte0[])
    {
        return (zzrd)zzrn.a(new zzrd(), abyte0);
    }

    public zzrd a()
    {
        a = zzrq.f;
        b = zzrq.a;
        c = zzrq.g;
        o = null;
        p = -1;
        return this;
    }

    public zzrd a(zzrf zzrf1)
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
                int j1 = zzrq.a(zzrf1, 10);
                String as[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                as = new String[j1 + j];
                j1 = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, as, 0, j);
                    j1 = j;
                }
                for (; j1 < as.length - 1; j1++)
                {
                    as[j1] = zzrf1.h();
                    zzrf1.a();
                }

                as[j1] = zzrf1.h();
                a = as;
                break;

            case 16: // '\020'
                int k1 = zzrq.a(zzrf1, 16);
                int ai[];
                int k;
                if (b == null)
                {
                    k = 0;
                } else
                {
                    k = b.length;
                }
                ai = new int[k1 + k];
                k1 = k;
                if (k != 0)
                {
                    System.arraycopy(b, 0, ai, 0, k);
                    k1 = k;
                }
                for (; k1 < ai.length - 1; k1++)
                {
                    ai[k1] = zzrf1.f();
                    zzrf1.a();
                }

                ai[k1] = zzrf1.f();
                b = ai;
                break;

            case 18: // '\022'
                int j2 = zzrf1.d(zzrf1.k());
                int l = zzrf1.q();
                int l1;
                for (l1 = 0; zzrf1.o() > 0; l1++)
                {
                    zzrf1.f();
                }

                zzrf1.f(l);
                int ai1[];
                if (b == null)
                {
                    l = 0;
                } else
                {
                    l = b.length;
                }
                ai1 = new int[l1 + l];
                l1 = l;
                if (l != 0)
                {
                    System.arraycopy(b, 0, ai1, 0, l);
                    l1 = l;
                }
                for (; l1 < ai1.length; l1++)
                {
                    ai1[l1] = zzrf1.f();
                }

                b = ai1;
                zzrf1.e(j2);
                break;

            case 26: // '\032'
                int i2 = zzrq.a(zzrf1, 26);
                byte abyte0[][];
                int i1;
                if (c == null)
                {
                    i1 = 0;
                } else
                {
                    i1 = c.length;
                }
                abyte0 = new byte[i2 + i1][];
                i2 = i1;
                if (i1 != 0)
                {
                    System.arraycopy(c, 0, abyte0, 0, i1);
                    i2 = i1;
                }
                for (; i2 < abyte0.length - 1; i2++)
                {
                    abyte0[i2] = zzrf1.i();
                    zzrf1.a();
                }

                abyte0[i2] = zzrf1.i();
                c = abyte0;
                break;
            }
        } while (true);
    }

    public void a(zzrg zzrg1)
    {
        boolean flag = false;
        if (a != null && a.length > 0)
        {
            for (int i = 0; i < a.length; i++)
            {
                String s = a[i];
                if (s != null)
                {
                    zzrg1.a(1, s);
                }
            }

        }
        if (b != null && b.length > 0)
        {
            for (int j = 0; j < b.length; j++)
            {
                zzrg1.a(2, b[j]);
            }

        }
        if (c != null && c.length > 0)
        {
            for (int k = ((flag) ? 1 : 0); k < c.length; k++)
            {
                byte abyte0[] = c[k];
                if (abyte0 != null)
                {
                    zzrg1.a(3, abyte0);
                }
            }

        }
        super.a(zzrg1);
    }

    protected int b()
    {
        boolean flag = false;
        int l2 = super.b();
        int j;
        int k;
        if (a != null && a.length > 0)
        {
            int i = 0;
            k = 0;
            int l;
            int k1;
            for (l = 0; i < a.length; l = k1)
            {
                String s = a[i];
                int i2 = k;
                k1 = l;
                if (s != null)
                {
                    k1 = l + 1;
                    i2 = k + zzrg.b(s);
                }
                i++;
                k = i2;
            }

            k = l2 + k + l * 1;
        } else
        {
            k = l2;
        }
        j = k;
        if (b != null)
        {
            j = k;
            if (b.length > 0)
            {
                j = 0;
                int i1 = 0;
                for (; j < b.length; j++)
                {
                    i1 += zzrg.c(b[j]);
                }

                j = k + i1 + b.length * 1;
            }
        }
        k = j;
        if (c != null)
        {
            k = j;
            if (c.length > 0)
            {
                int j1 = 0;
                int l1 = 0;
                for (k = ((flag) ? 1 : 0); k < c.length;)
                {
                    byte abyte0[] = c[k];
                    int k2 = j1;
                    int j2 = l1;
                    if (abyte0 != null)
                    {
                        j2 = l1 + 1;
                        k2 = j1 + zzrg.c(abyte0);
                    }
                    k++;
                    j1 = k2;
                    l1 = j2;
                }

                k = j + j1 + l1 * 1;
            }
        }
        return k;
    }

    public zzrn b(zzrf zzrf1)
    {
        return a(zzrf1);
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag;
        if (obj == this)
        {
            flag = true;
        } else
        {
            flag = flag1;
            if (obj instanceof zzrd)
            {
                obj = (zzrd)obj;
                flag = flag1;
                if (zzrl.a(a, ((zzrd) (obj)).a))
                {
                    flag = flag1;
                    if (zzrl.a(b, ((zzrd) (obj)).b))
                    {
                        flag = flag1;
                        if (zzrl.a(c, ((zzrd) (obj)).c))
                        {
                            return a(((zzrh) (obj)));
                        }
                    }
                }
            }
        }
        return flag;
    }

    public int hashCode()
    {
        return (((zzrl.a(a) + 527) * 31 + zzrl.a(b)) * 31 + zzrl.a(c)) * 31 + d();
    }
}
