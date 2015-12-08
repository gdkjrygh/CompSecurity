// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.internal:
//            qq, qm, qz, qp, 
//            qu, qo, qw

public static final class ry extends qq
{

    public int ayA;
    public int ayB;
    public boolean ayC;
    public ayH ayD[];
    public ayH ayE[];
    public String ayF[];
    public long ayG[];
    public float ayH[];
    public long ayI;
    public byte ayv[];
    public String ayw;
    public double ayx;
    public float ayy;
    public long ayz;

    public void a(qp qp1)
        throws IOException
    {
        boolean flag = false;
        if (!Arrays.equals(ayv, qz.azq))
        {
            qp1.a(1, ayv);
        }
        if (!ayw.equals(""))
        {
            qp1.b(2, ayw);
        }
        if (Double.doubleToLongBits(ayx) != Double.doubleToLongBits(0.0D))
        {
            qp1.a(3, ayx);
        }
        if (Float.floatToIntBits(ayy) != Float.floatToIntBits(0.0F))
        {
            qp1.b(4, ayy);
        }
        if (ayz != 0L)
        {
            qp1.b(5, ayz);
        }
        if (ayA != 0)
        {
            qp1.t(6, ayA);
        }
        if (ayB != 0)
        {
            qp1.u(7, ayB);
        }
        if (ayC)
        {
            qp1.b(8, ayC);
        }
        if (ayD != null && ayD.length > 0)
        {
            for (int i = 0; i < ayD.length; i++)
            {
                ry ry1 = ayD[i];
                if (ry1 != null)
                {
                    qp1.a(9, ry1);
                }
            }

        }
        if (ayE != null && ayE.length > 0)
        {
            for (int j = 0; j < ayE.length; j++)
            {
                ry ry2 = ayE[j];
                if (ry2 != null)
                {
                    qp1.a(10, ry2);
                }
            }

        }
        if (ayF != null && ayF.length > 0)
        {
            for (int k = 0; k < ayF.length; k++)
            {
                String s = ayF[k];
                if (s != null)
                {
                    qp1.b(11, s);
                }
            }

        }
        if (ayG != null && ayG.length > 0)
        {
            for (int l = 0; l < ayG.length; l++)
            {
                qp1.b(12, ayG[l]);
            }

        }
        if (ayI != 0L)
        {
            qp1.b(13, ayI);
        }
        if (ayH != null && ayH.length > 0)
        {
            for (int i1 = ((flag) ? 1 : 0); i1 < ayH.length; i1++)
            {
                qp1.b(14, ayH[i1]);
            }

        }
        super.a(qp1);
    }

    public qw b(qo qo1)
        throws IOException
    {
        return w(qo1);
    }

    protected int c()
    {
        boolean flag = false;
        int j = super.c();
        int i = j;
        if (!Arrays.equals(ayv, qz.azq))
        {
            i = j + qp.b(1, ayv);
        }
        j = i;
        if (!ayw.equals(""))
        {
            j = i + qp.j(2, ayw);
        }
        i = j;
        if (Double.doubleToLongBits(ayx) != Double.doubleToLongBits(0.0D))
        {
            i = j + qp.b(3, ayx);
        }
        j = i;
        if (Float.floatToIntBits(ayy) != Float.floatToIntBits(0.0F))
        {
            j = i + qp.c(4, ayy);
        }
        i = j;
        if (ayz != 0L)
        {
            i = j + qp.d(5, ayz);
        }
        j = i;
        if (ayA != 0)
        {
            j = i + qp.v(6, ayA);
        }
        int k = j;
        if (ayB != 0)
        {
            k = j + qp.w(7, ayB);
        }
        i = k;
        if (ayC)
        {
            i = k + qp.c(8, ayC);
        }
        j = i;
        if (ayD != null)
        {
            j = i;
            if (ayD.length > 0)
            {
                for (j = 0; j < ayD.length;)
                {
                    w w1 = ayD[j];
                    int l = i;
                    if (w1 != null)
                    {
                        l = i + qp.c(9, w1);
                    }
                    j++;
                    i = l;
                }

                j = i;
            }
        }
        i = j;
        if (ayE != null)
        {
            i = j;
            if (ayE.length > 0)
            {
                i = j;
                for (j = 0; j < ayE.length;)
                {
                    w w2 = ayE[j];
                    int i1 = i;
                    if (w2 != null)
                    {
                        i1 = i + qp.c(10, w2);
                    }
                    j++;
                    i = i1;
                }

            }
        }
        j = i;
        if (ayF != null)
        {
            j = i;
            if (ayF.length > 0)
            {
                j = 0;
                int j1 = 0;
                int l1;
                int i2;
                for (l1 = 0; j < ayF.length; l1 = i2)
                {
                    String s = ayF[j];
                    int j2 = j1;
                    i2 = l1;
                    if (s != null)
                    {
                        i2 = l1 + 1;
                        j2 = j1 + qp.dk(s);
                    }
                    j++;
                    j1 = j2;
                }

                j = i + j1 + l1 * 1;
            }
        }
        i = j;
        if (ayG != null)
        {
            i = j;
            if (ayG.length > 0)
            {
                int k1 = 0;
                for (i = ((flag) ? 1 : 0); i < ayG.length; i++)
                {
                    k1 += qp.D(ayG[i]);
                }

                i = j + k1 + ayG.length * 1;
            }
        }
        j = i;
        if (ayI != 0L)
        {
            j = i + qp.d(13, ayI);
        }
        i = j;
        if (ayH != null)
        {
            i = j;
            if (ayH.length > 0)
            {
                i = j + ayH.length * 4 + ayH.length * 1;
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
        if (!(obj instanceof ayH))
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = (ayH)obj;
        flag = flag1;
        if (!Arrays.equals(ayv, ((ayv) (obj)).ayv))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (ayw != null)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (((ayw) (obj)).ayw != null)
        {
            continue; /* Loop/switch isn't completed */
        }
_L5:
        flag = flag1;
        if (Double.doubleToLongBits(ayx) == Double.doubleToLongBits(((ayx) (obj)).ayx))
        {
            flag = flag1;
            if (Float.floatToIntBits(ayy) == Float.floatToIntBits(((ayy) (obj)).ayy))
            {
                flag = flag1;
                if (ayz == ((ayz) (obj)).ayz)
                {
                    flag = flag1;
                    if (ayA == ((ayA) (obj)).ayA)
                    {
                        flag = flag1;
                        if (ayB == ((ayB) (obj)).ayB)
                        {
                            flag = flag1;
                            if (ayC == ((ayC) (obj)).ayC)
                            {
                                flag = flag1;
                                if (qu.equals(ayD, ((ayD) (obj)).ayD))
                                {
                                    flag = flag1;
                                    if (qu.equals(ayE, ((ayE) (obj)).ayE))
                                    {
                                        flag = flag1;
                                        if (qu.equals(ayF, ((ayF) (obj)).ayF))
                                        {
                                            flag = flag1;
                                            if (qu.equals(ayG, ((ayG) (obj)).ayG))
                                            {
                                                flag = flag1;
                                                if (qu.equals(ayH, ((ayH) (obj)).ayH))
                                                {
                                                    flag = flag1;
                                                    if (ayI == ((ayI) (obj)).ayI)
                                                    {
                                                        return a(((qq) (obj)));
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
        if (!ayw.equals(((ayw) (obj)).ayw))
        {
            return false;
        }
          goto _L5
        if (true) goto _L4; else goto _L6
_L6:
    }

    public int hashCode()
    {
        int j = Arrays.hashCode(ayv);
        int i;
        char c1;
        int k;
        int l;
        int i1;
        int j1;
        int k1;
        long l1;
        if (ayw == null)
        {
            i = 0;
        } else
        {
            i = ayw.hashCode();
        }
        l1 = Double.doubleToLongBits(ayx);
        k = (int)(l1 ^ l1 >>> 32);
        l = Float.floatToIntBits(ayy);
        i1 = (int)(ayz ^ ayz >>> 32);
        j1 = ayA;
        k1 = ayB;
        if (ayC)
        {
            c1 = '\u04CF';
        } else
        {
            c1 = '\u04D5';
        }
        return (((((((c1 + ((((((i + (j + 527) * 31) * 31 + k) * 31 + l) * 31 + i1) * 31 + j1) * 31 + k1) * 31) * 31 + qu.hashCode(ayD)) * 31 + qu.hashCode(ayE)) * 31 + qu.hashCode(ayF)) * 31 + qu.hashCode(ayG)) * 31 + qu.hashCode(ayH)) * 31 + (int)(ayI ^ ayI >>> 32)) * 31 + rQ();
    }

    public rQ ry()
    {
        ayv = qz.azq;
        ayw = "";
        ayx = 0.0D;
        ayy = 0.0F;
        ayz = 0L;
        ayA = 0;
        ayB = 0;
        ayC = false;
        ayD = ayD();
        ayE = ();
        ayF = qz.azo;
        ayG = qz.azk;
        ayH = qz.azl;
        ayI = 0L;
        ayW = null;
        azh = -1;
        return this;
    }

    public azh w(qo qo1)
        throws IOException
    {
        do
        {
            int i = qo1.rz();
            switch (i)
            {
            default:
                if (a(qo1, i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                ayv = qo1.readBytes();
                break;

            case 18: // '\022'
                ayw = qo1.readString();
                break;

            case 25: // '\031'
                ayx = qo1.readDouble();
                break;

            case 37: // '%'
                ayy = qo1.readFloat();
                break;

            case 40: // '('
                ayz = qo1.rB();
                break;

            case 48: // '0'
                ayA = qo1.rC();
                break;

            case 56: // '8'
                ayB = qo1.rE();
                break;

            case 64: // '@'
                ayC = qo1.rD();
                break;

            case 74: // 'J'
                int i2 = qz.b(qo1, 74);
                azh aazh[];
                int j;
                if (ayD == null)
                {
                    j = 0;
                } else
                {
                    j = ayD.length;
                }
                aazh = new ayD[i2 + j];
                i2 = j;
                if (j != 0)
                {
                    System.arraycopy(ayD, 0, aazh, 0, j);
                    i2 = j;
                }
                for (; i2 < aazh.length - 1; i2++)
                {
                    aazh[i2] = new t>();
                    qo1.a(aazh[i2]);
                    qo1.rz();
                }

                aazh[i2] = new t>();
                qo1.a(aazh[i2]);
                ayD = aazh;
                break;

            case 82: // 'R'
                int j2 = qz.b(qo1, 82);
                azh aazh1[];
                int k;
                if (ayE == null)
                {
                    k = 0;
                } else
                {
                    k = ayE.length;
                }
                aazh1 = new ayE[j2 + k];
                j2 = k;
                if (k != 0)
                {
                    System.arraycopy(ayE, 0, aazh1, 0, k);
                    j2 = k;
                }
                for (; j2 < aazh1.length - 1; j2++)
                {
                    aazh1[j2] = new nit>();
                    qo1.a(aazh1[j2]);
                    qo1.rz();
                }

                aazh1[j2] = new nit>();
                qo1.a(aazh1[j2]);
                ayE = aazh1;
                break;

            case 90: // 'Z'
                int k2 = qz.b(qo1, 90);
                String as[];
                int l;
                if (ayF == null)
                {
                    l = 0;
                } else
                {
                    l = ayF.length;
                }
                as = new String[k2 + l];
                k2 = l;
                if (l != 0)
                {
                    System.arraycopy(ayF, 0, as, 0, l);
                    k2 = l;
                }
                for (; k2 < as.length - 1; k2++)
                {
                    as[k2] = qo1.readString();
                    qo1.rz();
                }

                as[k2] = qo1.readString();
                ayF = as;
                break;

            case 96: // '`'
                int l2 = qz.b(qo1, 96);
                long al[];
                int i1;
                if (ayG == null)
                {
                    i1 = 0;
                } else
                {
                    i1 = ayG.length;
                }
                al = new long[l2 + i1];
                l2 = i1;
                if (i1 != 0)
                {
                    System.arraycopy(ayG, 0, al, 0, i1);
                    l2 = i1;
                }
                for (; l2 < al.length - 1; l2++)
                {
                    al[l2] = qo1.rB();
                    qo1.rz();
                }

                al[l2] = qo1.rB();
                ayG = al;
                break;

            case 98: // 'b'
                int l3 = qo1.gS(qo1.rG());
                int j1 = qo1.getPosition();
                int i3;
                for (i3 = 0; qo1.rL() > 0; i3++)
                {
                    qo1.rB();
                }

                qo1.gU(j1);
                long al1[];
                if (ayG == null)
                {
                    j1 = 0;
                } else
                {
                    j1 = ayG.length;
                }
                al1 = new long[i3 + j1];
                i3 = j1;
                if (j1 != 0)
                {
                    System.arraycopy(ayG, 0, al1, 0, j1);
                    i3 = j1;
                }
                for (; i3 < al1.length; i3++)
                {
                    al1[i3] = qo1.rB();
                }

                ayG = al1;
                qo1.gT(l3);
                break;

            case 104: // 'h'
                ayI = qo1.rB();
                break;

            case 117: // 'u'
                int j3 = qz.b(qo1, 117);
                float af[];
                int k1;
                if (ayH == null)
                {
                    k1 = 0;
                } else
                {
                    k1 = ayH.length;
                }
                af = new float[j3 + k1];
                j3 = k1;
                if (k1 != 0)
                {
                    System.arraycopy(ayH, 0, af, 0, k1);
                    j3 = k1;
                }
                for (; j3 < af.length - 1; j3++)
                {
                    af[j3] = qo1.readFloat();
                    qo1.rz();
                }

                af[j3] = qo1.readFloat();
                ayH = af;
                break;

            case 114: // 'r'
                int l1 = qo1.rG();
                int i4 = qo1.gS(l1);
                int k3 = l1 / 4;
                float af1[];
                if (ayH == null)
                {
                    l1 = 0;
                } else
                {
                    l1 = ayH.length;
                }
                af1 = new float[k3 + l1];
                k3 = l1;
                if (l1 != 0)
                {
                    System.arraycopy(ayH, 0, af1, 0, l1);
                    k3 = l1;
                }
                for (; k3 < af1.length; k3++)
                {
                    af1[k3] = qo1.readFloat();
                }

                ayH = af1;
                qo1.gT(i4);
                break;
            }
        } while (true);
    }

    public ()
    {
        ry();
    }
}
