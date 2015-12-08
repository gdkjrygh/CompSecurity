// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.internal:
//            ph, pd, pq, pg, 
//            pl, pf, pn

public static final class qh extends ph
{

    public byte awi[];
    public String awj;
    public double awk;
    public float awl;
    public long awm;
    public int awn;
    public int awo;
    public boolean awp;
    public awu awq[];
    public awu awr[];
    public String aws[];
    public long awt[];
    public float awu[];
    public long awv;

    public void a(pg pg1)
        throws IOException
    {
        boolean flag = false;
        if (!Arrays.equals(awi, pq.axd))
        {
            pg1.a(1, awi);
        }
        if (!awj.equals(""))
        {
            pg1.b(2, awj);
        }
        if (Double.doubleToLongBits(awk) != Double.doubleToLongBits(0.0D))
        {
            pg1.a(3, awk);
        }
        if (Float.floatToIntBits(awl) != Float.floatToIntBits(0.0F))
        {
            pg1.b(4, awl);
        }
        if (awm != 0L)
        {
            pg1.b(5, awm);
        }
        if (awn != 0)
        {
            pg1.s(6, awn);
        }
        if (awo != 0)
        {
            pg1.t(7, awo);
        }
        if (awp)
        {
            pg1.b(8, awp);
        }
        if (awq != null && awq.length > 0)
        {
            for (int i = 0; i < awq.length; i++)
            {
                qh qh1 = awq[i];
                if (qh1 != null)
                {
                    pg1.a(9, qh1);
                }
            }

        }
        if (awr != null && awr.length > 0)
        {
            for (int j = 0; j < awr.length; j++)
            {
                qh qh2 = awr[j];
                if (qh2 != null)
                {
                    pg1.a(10, qh2);
                }
            }

        }
        if (aws != null && aws.length > 0)
        {
            for (int k = 0; k < aws.length; k++)
            {
                String s = aws[k];
                if (s != null)
                {
                    pg1.b(11, s);
                }
            }

        }
        if (awt != null && awt.length > 0)
        {
            for (int l = 0; l < awt.length; l++)
            {
                pg1.b(12, awt[l]);
            }

        }
        if (awv != 0L)
        {
            pg1.b(13, awv);
        }
        if (awu != null && awu.length > 0)
        {
            for (int i1 = ((flag) ? 1 : 0); i1 < awu.length; i1++)
            {
                pg1.b(14, awu[i1]);
            }

        }
        super.a(pg1);
    }

    public pn b(pf pf1)
        throws IOException
    {
        return t(pf1);
    }

    protected int c()
    {
        boolean flag = false;
        int j = super.c();
        int i = j;
        if (!Arrays.equals(awi, pq.axd))
        {
            i = j + pg.b(1, awi);
        }
        j = i;
        if (!awj.equals(""))
        {
            j = i + pg.j(2, awj);
        }
        i = j;
        if (Double.doubleToLongBits(awk) != Double.doubleToLongBits(0.0D))
        {
            i = j + pg.b(3, awk);
        }
        j = i;
        if (Float.floatToIntBits(awl) != Float.floatToIntBits(0.0F))
        {
            j = i + pg.c(4, awl);
        }
        i = j;
        if (awm != 0L)
        {
            i = j + pg.d(5, awm);
        }
        j = i;
        if (awn != 0)
        {
            j = i + pg.u(6, awn);
        }
        int k = j;
        if (awo != 0)
        {
            k = j + pg.v(7, awo);
        }
        i = k;
        if (awp)
        {
            i = k + pg.c(8, awp);
        }
        j = i;
        if (awq != null)
        {
            j = i;
            if (awq.length > 0)
            {
                for (j = 0; j < awq.length;)
                {
                    t t1 = awq[j];
                    int l = i;
                    if (t1 != null)
                    {
                        l = i + pg.c(9, t1);
                    }
                    j++;
                    i = l;
                }

                j = i;
            }
        }
        i = j;
        if (awr != null)
        {
            i = j;
            if (awr.length > 0)
            {
                i = j;
                for (j = 0; j < awr.length;)
                {
                    t t2 = awr[j];
                    int i1 = i;
                    if (t2 != null)
                    {
                        i1 = i + pg.c(10, t2);
                    }
                    j++;
                    i = i1;
                }

            }
        }
        j = i;
        if (aws != null)
        {
            j = i;
            if (aws.length > 0)
            {
                j = 0;
                int j1 = 0;
                int l1;
                int i2;
                for (l1 = 0; j < aws.length; l1 = i2)
                {
                    String s = aws[j];
                    int j2 = j1;
                    i2 = l1;
                    if (s != null)
                    {
                        i2 = l1 + 1;
                        j2 = j1 + pg.di(s);
                    }
                    j++;
                    j1 = j2;
                }

                j = i + j1 + l1 * 1;
            }
        }
        i = j;
        if (awt != null)
        {
            i = j;
            if (awt.length > 0)
            {
                int k1 = 0;
                for (i = ((flag) ? 1 : 0); i < awt.length; i++)
                {
                    k1 += pg.D(awt[i]);
                }

                i = j + k1 + awt.length * 1;
            }
        }
        j = i;
        if (awv != 0L)
        {
            j = i + pg.d(13, awv);
        }
        i = j;
        if (awu != null)
        {
            i = j;
            if (awu.length > 0)
            {
                i = j + awu.length * 4 + awu.length * 1;
            }
        }
        return i;
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
        if (!(obj instanceof awu))
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = (awu)obj;
        flag = flag1;
        if (!Arrays.equals(awi, ((awi) (obj)).awi))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (awj != null)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (((awj) (obj)).awj != null)
        {
            continue; /* Loop/switch isn't completed */
        }
_L5:
        flag = flag1;
        if (Double.doubleToLongBits(awk) == Double.doubleToLongBits(((awk) (obj)).awk))
        {
            flag = flag1;
            if (Float.floatToIntBits(awl) == Float.floatToIntBits(((awl) (obj)).awl))
            {
                flag = flag1;
                if (awm == ((awm) (obj)).awm)
                {
                    flag = flag1;
                    if (awn == ((awn) (obj)).awn)
                    {
                        flag = flag1;
                        if (awo == ((awo) (obj)).awo)
                        {
                            flag = flag1;
                            if (awp == ((awp) (obj)).awp)
                            {
                                flag = flag1;
                                if (pl.equals(awq, ((awq) (obj)).awq))
                                {
                                    flag = flag1;
                                    if (pl.equals(awr, ((awr) (obj)).awr))
                                    {
                                        flag = flag1;
                                        if (pl.equals(aws, ((aws) (obj)).aws))
                                        {
                                            flag = flag1;
                                            if (pl.equals(awt, ((awt) (obj)).awt))
                                            {
                                                flag = flag1;
                                                if (pl.equals(awu, ((awu) (obj)).awu))
                                                {
                                                    flag = flag1;
                                                    if (awv == ((awv) (obj)).awv)
                                                    {
                                                        return a(((ph) (obj)));
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
        if (!awj.equals(((awj) (obj)).awj))
        {
            return false;
        }
          goto _L5
        if (true) goto _L4; else goto _L6
_L6:
    }

    public int hashCode()
    {
        int j = Arrays.hashCode(awi);
        int i;
        char c1;
        int k;
        int l;
        int i1;
        int j1;
        int k1;
        long l1;
        if (awj == null)
        {
            i = 0;
        } else
        {
            i = awj.hashCode();
        }
        l1 = Double.doubleToLongBits(awk);
        k = (int)(l1 ^ l1 >>> 32);
        l = Float.floatToIntBits(awl);
        i1 = (int)(awm ^ awm >>> 32);
        j1 = awn;
        k1 = awo;
        if (awp)
        {
            c1 = '\u04CF';
        } else
        {
            c1 = '\u04D5';
        }
        return (((((((c1 + ((((((i + (j + 527) * 31) * 31 + k) * 31 + l) * 31 + i1) * 31 + j1) * 31 + k1) * 31) * 31 + pl.hashCode(awq)) * 31 + pl.hashCode(awr)) * 31 + pl.hashCode(aws)) * 31 + pl.hashCode(awt)) * 31 + pl.hashCode(awu)) * 31 + (int)(awv ^ awv >>> 32)) * 31 + qz();
    }

    public qz qh()
    {
        awi = pq.axd;
        awj = "";
        awk = 0.0D;
        awl = 0.0F;
        awm = 0L;
        awn = 0;
        awo = 0;
        awp = false;
        awq = awq();
        awr = ();
        aws = pq.axb;
        awt = pq.awX;
        awu = pq.awY;
        awv = 0L;
        awJ = null;
        awU = -1;
        return this;
    }

    public awU t(pf pf1)
        throws IOException
    {
        do
        {
            int i = pf1.qi();
            switch (i)
            {
            default:
                if (a(pf1, i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                awi = pf1.readBytes();
                break;

            case 18: // '\022'
                awj = pf1.readString();
                break;

            case 25: // '\031'
                awk = pf1.readDouble();
                break;

            case 37: // '%'
                awl = pf1.readFloat();
                break;

            case 40: // '('
                awm = pf1.qk();
                break;

            case 48: // '0'
                awn = pf1.ql();
                break;

            case 56: // '8'
                awo = pf1.qn();
                break;

            case 64: // '@'
                awp = pf1.qm();
                break;

            case 74: // 'J'
                int i2 = pq.b(pf1, 74);
                awU aawu[];
                int j;
                if (awq == null)
                {
                    j = 0;
                } else
                {
                    j = awq.length;
                }
                aawu = new awq[i2 + j];
                i2 = j;
                if (j != 0)
                {
                    System.arraycopy(awq, 0, aawu, 0, j);
                    i2 = j;
                }
                for (; i2 < aawu.length - 1; i2++)
                {
                    aawu[i2] = new t>();
                    pf1.a(aawu[i2]);
                    pf1.qi();
                }

                aawu[i2] = new t>();
                pf1.a(aawu[i2]);
                awq = aawu;
                break;

            case 82: // 'R'
                int j2 = pq.b(pf1, 82);
                awU aawu1[];
                int k;
                if (awr == null)
                {
                    k = 0;
                } else
                {
                    k = awr.length;
                }
                aawu1 = new awr[j2 + k];
                j2 = k;
                if (k != 0)
                {
                    System.arraycopy(awr, 0, aawu1, 0, k);
                    j2 = k;
                }
                for (; j2 < aawu1.length - 1; j2++)
                {
                    aawu1[j2] = new nit>();
                    pf1.a(aawu1[j2]);
                    pf1.qi();
                }

                aawu1[j2] = new nit>();
                pf1.a(aawu1[j2]);
                awr = aawu1;
                break;

            case 90: // 'Z'
                int k2 = pq.b(pf1, 90);
                String as[];
                int l;
                if (aws == null)
                {
                    l = 0;
                } else
                {
                    l = aws.length;
                }
                as = new String[k2 + l];
                k2 = l;
                if (l != 0)
                {
                    System.arraycopy(aws, 0, as, 0, l);
                    k2 = l;
                }
                for (; k2 < as.length - 1; k2++)
                {
                    as[k2] = pf1.readString();
                    pf1.qi();
                }

                as[k2] = pf1.readString();
                aws = as;
                break;

            case 96: // '`'
                int l2 = pq.b(pf1, 96);
                long al[];
                int i1;
                if (awt == null)
                {
                    i1 = 0;
                } else
                {
                    i1 = awt.length;
                }
                al = new long[l2 + i1];
                l2 = i1;
                if (i1 != 0)
                {
                    System.arraycopy(awt, 0, al, 0, i1);
                    l2 = i1;
                }
                for (; l2 < al.length - 1; l2++)
                {
                    al[l2] = pf1.qk();
                    pf1.qi();
                }

                al[l2] = pf1.qk();
                awt = al;
                break;

            case 98: // 'b'
                int l3 = pf1.gp(pf1.qp());
                int j1 = pf1.getPosition();
                int i3;
                for (i3 = 0; pf1.qu() > 0; i3++)
                {
                    pf1.qk();
                }

                pf1.gr(j1);
                long al1[];
                if (awt == null)
                {
                    j1 = 0;
                } else
                {
                    j1 = awt.length;
                }
                al1 = new long[i3 + j1];
                i3 = j1;
                if (j1 != 0)
                {
                    System.arraycopy(awt, 0, al1, 0, j1);
                    i3 = j1;
                }
                for (; i3 < al1.length; i3++)
                {
                    al1[i3] = pf1.qk();
                }

                awt = al1;
                pf1.gq(l3);
                break;

            case 104: // 'h'
                awv = pf1.qk();
                break;

            case 117: // 'u'
                int j3 = pq.b(pf1, 117);
                float af[];
                int k1;
                if (awu == null)
                {
                    k1 = 0;
                } else
                {
                    k1 = awu.length;
                }
                af = new float[j3 + k1];
                j3 = k1;
                if (k1 != 0)
                {
                    System.arraycopy(awu, 0, af, 0, k1);
                    j3 = k1;
                }
                for (; j3 < af.length - 1; j3++)
                {
                    af[j3] = pf1.readFloat();
                    pf1.qi();
                }

                af[j3] = pf1.readFloat();
                awu = af;
                break;

            case 114: // 'r'
                int l1 = pf1.qp();
                int i4 = pf1.gp(l1);
                int k3 = l1 / 4;
                float af1[];
                if (awu == null)
                {
                    l1 = 0;
                } else
                {
                    l1 = awu.length;
                }
                af1 = new float[k3 + l1];
                k3 = l1;
                if (l1 != 0)
                {
                    System.arraycopy(awu, 0, af1, 0, l1);
                    k3 = l1;
                }
                for (; k3 < af1.length; k3++)
                {
                    af1[k3] = pf1.readFloat();
                }

                awu = af1;
                pf1.gq(i4);
                break;
            }
        } while (true);
    }

    public ()
    {
        qh();
    }
}
