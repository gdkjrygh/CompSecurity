// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            mb, c, mc, ma, 
//            md, lz, mi, mf

public static final class n extends mb
{

    public static final mc fx = mc.a(11, com/google/android/gms/internal/c$h, 810);
    private static final  fy[] = new [0];
    public int fA[];
    public int fB[];
    public int fC;
    public int fD[];
    public int fE;
    public int fF;
    public int fz[];

    public void a(ma ma1)
        throws IOException
    {
        boolean flag = false;
        if (fz != null && fz.length > 0)
        {
            for (int j = 0; j < fz.length; j++)
            {
                ma1.p(1, fz[j]);
            }

        }
        if (fA != null && fA.length > 0)
        {
            for (int k = 0; k < fA.length; k++)
            {
                ma1.p(2, fA[k]);
            }

        }
        if (fB != null && fB.length > 0)
        {
            for (int l = 0; l < fB.length; l++)
            {
                ma1.p(3, fB[l]);
            }

        }
        if (fC != 0)
        {
            ma1.p(4, fC);
        }
        if (fD != null && fD.length > 0)
        {
            for (int i1 = ((flag) ? 1 : 0); i1 < fD.length; i1++)
            {
                ma1.p(5, fD[i1]);
            }

        }
        if (fE != 0)
        {
            ma1.p(6, fE);
        }
        if (fF != 0)
        {
            ma1.p(7, fF);
        }
        super.a(ma1);
    }

    public mf b(lz lz1)
        throws IOException
    {
        return i(lz1);
    }

    protected int c()
    {
        boolean flag = false;
        int i1 = super.c();
        int k;
        int l;
        if (fz != null && fz.length > 0)
        {
            int j = 0;
            l = 0;
            for (; j < fz.length; j++)
            {
                l += ma.eE(fz[j]);
            }

            l = i1 + l + fz.length * 1;
        } else
        {
            l = i1;
        }
        k = l;
        if (fA != null)
        {
            k = l;
            if (fA.length > 0)
            {
                k = 0;
                i1 = 0;
                for (; k < fA.length; k++)
                {
                    i1 += ma.eE(fA[k]);
                }

                k = l + i1 + fA.length * 1;
            }
        }
        l = k;
        if (fB != null)
        {
            l = k;
            if (fB.length > 0)
            {
                l = 0;
                i1 = 0;
                for (; l < fB.length; l++)
                {
                    i1 += ma.eE(fB[l]);
                }

                l = k + i1 + fB.length * 1;
            }
        }
        k = l;
        if (fC != 0)
        {
            k = l + ma.r(4, fC);
        }
        l = k;
        if (fD != null)
        {
            l = k;
            if (fD.length > 0)
            {
                i1 = 0;
                for (l = ((flag) ? 1 : 0); l < fD.length; l++)
                {
                    i1 += ma.eE(fD[l]);
                }

                l = k + i1 + fD.length * 1;
            }
        }
        k = l;
        if (fE != 0)
        {
            k = l + ma.r(6, fE);
        }
        l = k;
        if (fF != 0)
        {
            l = k + ma.r(7, fF);
        }
        return l;
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
        if (!(obj instanceof fF)) goto _L4; else goto _L3
_L3:
        obj = (fF)obj;
        flag = flag1;
        if (!md.equals(fz, ((fz) (obj)).fz)) goto _L4; else goto _L5
_L5:
        flag = flag1;
        if (!md.equals(fA, ((fA) (obj)).fA)) goto _L4; else goto _L6
_L6:
        flag = flag1;
        if (!md.equals(fB, ((fB) (obj)).fB)) goto _L4; else goto _L7
_L7:
        flag = flag1;
        if (fC != ((fC) (obj)).fC) goto _L4; else goto _L8
_L8:
        flag = flag1;
        if (!md.equals(fD, ((fD) (obj)).fD)) goto _L4; else goto _L9
_L9:
        flag = flag1;
        if (fE != ((fE) (obj)).fE) goto _L4; else goto _L10
_L10:
        flag = flag1;
        if (fF != ((fF) (obj)).fF) goto _L4; else goto _L11
_L11:
        if (amU != null && !amU.isEmpty())
        {
            break MISSING_BLOCK_LABEL_170;
        }
        if (((amU) (obj)).amU == null)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (!((amU) (obj)).amU.isEmpty()) goto _L4; else goto _L12
_L12:
        return true;
        return amU.equals(((amU) (obj)).amU);
    }

    public int hashCode()
    {
        int k = md.hashCode(fz);
        int l = md.hashCode(fA);
        int i1 = md.hashCode(fB);
        int j1 = fC;
        int k1 = md.hashCode(fD);
        int l1 = fE;
        int i2 = fF;
        int j;
        if (amU == null || amU.isEmpty())
        {
            j = 0;
        } else
        {
            j = amU.hashCode();
        }
        return j + (((((((k + 527) * 31 + l) * 31 + i1) * 31 + j1) * 31 + k1) * 31 + l1) * 31 + i2) * 31;
    }

    public amU i(lz lz1)
        throws IOException
    {
        do
        {
            int j = lz1.nw();
            switch (j)
            {
            default:
                if (a(lz1, j))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 8: // '\b'
                int k2 = mi.b(lz1, 8);
                int ai[];
                int k;
                if (fz == null)
                {
                    k = 0;
                } else
                {
                    k = fz.length;
                }
                ai = new int[k2 + k];
                k2 = k;
                if (k != 0)
                {
                    System.arraycopy(fz, 0, ai, 0, k);
                    k2 = k;
                }
                for (; k2 < ai.length - 1; k2++)
                {
                    ai[k2] = lz1.nz();
                    lz1.nw();
                }

                ai[k2] = lz1.nz();
                fz = ai;
                break;

            case 10: // '\n'
                int k4 = lz1.ex(lz1.nD());
                int l = lz1.getPosition();
                int l2;
                for (l2 = 0; lz1.nI() > 0; l2++)
                {
                    lz1.nz();
                }

                lz1.ez(l);
                int ai1[];
                if (fz == null)
                {
                    l = 0;
                } else
                {
                    l = fz.length;
                }
                ai1 = new int[l2 + l];
                l2 = l;
                if (l != 0)
                {
                    System.arraycopy(fz, 0, ai1, 0, l);
                    l2 = l;
                }
                for (; l2 < ai1.length; l2++)
                {
                    ai1[l2] = lz1.nz();
                }

                fz = ai1;
                lz1.ey(k4);
                break;

            case 16: // '\020'
                int i3 = mi.b(lz1, 16);
                int ai2[];
                int i1;
                if (fA == null)
                {
                    i1 = 0;
                } else
                {
                    i1 = fA.length;
                }
                ai2 = new int[i3 + i1];
                i3 = i1;
                if (i1 != 0)
                {
                    System.arraycopy(fA, 0, ai2, 0, i1);
                    i3 = i1;
                }
                for (; i3 < ai2.length - 1; i3++)
                {
                    ai2[i3] = lz1.nz();
                    lz1.nw();
                }

                ai2[i3] = lz1.nz();
                fA = ai2;
                break;

            case 18: // '\022'
                int l4 = lz1.ex(lz1.nD());
                int j1 = lz1.getPosition();
                int j3;
                for (j3 = 0; lz1.nI() > 0; j3++)
                {
                    lz1.nz();
                }

                lz1.ez(j1);
                int ai3[];
                if (fA == null)
                {
                    j1 = 0;
                } else
                {
                    j1 = fA.length;
                }
                ai3 = new int[j3 + j1];
                j3 = j1;
                if (j1 != 0)
                {
                    System.arraycopy(fA, 0, ai3, 0, j1);
                    j3 = j1;
                }
                for (; j3 < ai3.length; j3++)
                {
                    ai3[j3] = lz1.nz();
                }

                fA = ai3;
                lz1.ey(l4);
                break;

            case 24: // '\030'
                int k3 = mi.b(lz1, 24);
                int ai4[];
                int k1;
                if (fB == null)
                {
                    k1 = 0;
                } else
                {
                    k1 = fB.length;
                }
                ai4 = new int[k3 + k1];
                k3 = k1;
                if (k1 != 0)
                {
                    System.arraycopy(fB, 0, ai4, 0, k1);
                    k3 = k1;
                }
                for (; k3 < ai4.length - 1; k3++)
                {
                    ai4[k3] = lz1.nz();
                    lz1.nw();
                }

                ai4[k3] = lz1.nz();
                fB = ai4;
                break;

            case 26: // '\032'
                int i5 = lz1.ex(lz1.nD());
                int l1 = lz1.getPosition();
                int l3;
                for (l3 = 0; lz1.nI() > 0; l3++)
                {
                    lz1.nz();
                }

                lz1.ez(l1);
                int ai5[];
                if (fB == null)
                {
                    l1 = 0;
                } else
                {
                    l1 = fB.length;
                }
                ai5 = new int[l3 + l1];
                l3 = l1;
                if (l1 != 0)
                {
                    System.arraycopy(fB, 0, ai5, 0, l1);
                    l3 = l1;
                }
                for (; l3 < ai5.length; l3++)
                {
                    ai5[l3] = lz1.nz();
                }

                fB = ai5;
                lz1.ey(i5);
                break;

            case 32: // ' '
                fC = lz1.nz();
                break;

            case 40: // '('
                int i4 = mi.b(lz1, 40);
                int ai6[];
                int i2;
                if (fD == null)
                {
                    i2 = 0;
                } else
                {
                    i2 = fD.length;
                }
                ai6 = new int[i4 + i2];
                i4 = i2;
                if (i2 != 0)
                {
                    System.arraycopy(fD, 0, ai6, 0, i2);
                    i4 = i2;
                }
                for (; i4 < ai6.length - 1; i4++)
                {
                    ai6[i4] = lz1.nz();
                    lz1.nw();
                }

                ai6[i4] = lz1.nz();
                fD = ai6;
                break;

            case 42: // '*'
                int j5 = lz1.ex(lz1.nD());
                int j2 = lz1.getPosition();
                int j4;
                for (j4 = 0; lz1.nI() > 0; j4++)
                {
                    lz1.nz();
                }

                lz1.ez(j2);
                int ai7[];
                if (fD == null)
                {
                    j2 = 0;
                } else
                {
                    j2 = fD.length;
                }
                ai7 = new int[j4 + j2];
                j4 = j2;
                if (j2 != 0)
                {
                    System.arraycopy(fD, 0, ai7, 0, j2);
                    j4 = j2;
                }
                for (; j4 < ai7.length; j4++)
                {
                    ai7[j4] = lz1.nz();
                }

                fD = ai7;
                lz1.ey(j5);
                break;

            case 48: // '0'
                fE = lz1.nz();
                break;

            case 56: // '8'
                fF = lz1.nz();
                break;
            }
        } while (true);
    }

    public z n()
    {
        fz = mi.ana;
        fA = mi.ana;
        fB = mi.ana;
        fC = 0;
        fD = mi.ana;
        fE = 0;
        fF = 0;
        amU = null;
        amY = -1;
        return this;
    }


    public ()
    {
        n();
    }
}
