// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            kp, c, kq, ko, 
//            kr, kn, kw, kt

public static final class n extends kp
{

    public static final kq fx = kq.a(11, com/google/android/gms/internal/c$h, 810);
    private static final  fy[] = new [0];
    public int fA[];
    public int fB[];
    public int fC;
    public int fD[];
    public int fE;
    public int fF;
    public int fz[];

    public void a(ko ko1)
        throws IOException
    {
        boolean flag = false;
        if (fz != null && fz.length > 0)
        {
            for (int j = 0; j < fz.length; j++)
            {
                ko1.i(1, fz[j]);
            }

        }
        if (fA != null && fA.length > 0)
        {
            for (int k = 0; k < fA.length; k++)
            {
                ko1.i(2, fA[k]);
            }

        }
        if (fB != null && fB.length > 0)
        {
            for (int l = 0; l < fB.length; l++)
            {
                ko1.i(3, fB[l]);
            }

        }
        if (fC != 0)
        {
            ko1.i(4, fC);
        }
        if (fD != null && fD.length > 0)
        {
            for (int i1 = ((flag) ? 1 : 0); i1 < fD.length; i1++)
            {
                ko1.i(5, fD[i1]);
            }

        }
        if (fE != 0)
        {
            ko1.i(6, fE);
        }
        if (fF != 0)
        {
            ko1.i(7, fF);
        }
        super.a(ko1);
    }

    public kt b(kn kn1)
        throws IOException
    {
        return i(kn1);
    }

    public int c()
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
                l += ko.cX(fz[j]);
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
                    i1 += ko.cX(fA[k]);
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
                    i1 += ko.cX(fB[l]);
                }

                l = k + i1 + fB.length * 1;
            }
        }
        k = l;
        if (fC != 0)
        {
            k = l + ko.j(4, fC);
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
                    i1 += ko.cX(fD[l]);
                }

                l = k + i1 + fD.length * 1;
            }
        }
        k = l;
        if (fE != 0)
        {
            k = l + ko.j(6, fE);
        }
        l = k;
        if (fF != 0)
        {
            l = k + ko.j(7, fF);
        }
        adY = l;
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
        if (!(obj instanceof adY)) goto _L4; else goto _L3
_L3:
        obj = (adY)obj;
        flag = flag1;
        if (!kr.equals(fz, ((fz) (obj)).fz)) goto _L4; else goto _L5
_L5:
        flag = flag1;
        if (!kr.equals(fA, ((fA) (obj)).fA)) goto _L4; else goto _L6
_L6:
        flag = flag1;
        if (!kr.equals(fB, ((fB) (obj)).fB)) goto _L4; else goto _L7
_L7:
        flag = flag1;
        if (fC != ((fC) (obj)).fC) goto _L4; else goto _L8
_L8:
        flag = flag1;
        if (!kr.equals(fD, ((fD) (obj)).fD)) goto _L4; else goto _L9
_L9:
        flag = flag1;
        if (fE != ((fE) (obj)).fE) goto _L4; else goto _L10
_L10:
        flag = flag1;
        if (fF != ((fF) (obj)).fF) goto _L4; else goto _L11
_L11:
        if (adU != null && !adU.isEmpty())
        {
            break MISSING_BLOCK_LABEL_170;
        }
        if (((adU) (obj)).adU == null)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (!((adU) (obj)).adU.isEmpty()) goto _L4; else goto _L12
_L12:
        return true;
        return adU.equals(((adU) (obj)).adU);
    }

    public int hashCode()
    {
        int k = kr.hashCode(fz);
        int l = kr.hashCode(fA);
        int i1 = kr.hashCode(fB);
        int j1 = fC;
        int k1 = kr.hashCode(fD);
        int l1 = fE;
        int i2 = fF;
        int j;
        if (adU == null || adU.isEmpty())
        {
            j = 0;
        } else
        {
            j = adU.hashCode();
        }
        return j + (((((((k + 527) * 31 + l) * 31 + i1) * 31 + j1) * 31 + k1) * 31 + l1) * 31 + i2) * 31;
    }

    public adU i(kn kn1)
        throws IOException
    {
        do
        {
            int j = kn1.mh();
            switch (j)
            {
            default:
                if (a(kn1, j))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 8: // '\b'
                int k2 = kw.b(kn1, 8);
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
                    ai[k2] = kn1.mk();
                    kn1.mh();
                }

                ai[k2] = kn1.mk();
                fz = ai;
                break;

            case 10: // '\n'
                int k4 = kn1.cR(kn1.mn());
                int l = kn1.getPosition();
                int l2;
                for (l2 = 0; kn1.ms() > 0; l2++)
                {
                    kn1.mk();
                }

                kn1.cT(l);
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
                    ai1[l2] = kn1.mk();
                }

                fz = ai1;
                kn1.cS(k4);
                break;

            case 16: // '\020'
                int i3 = kw.b(kn1, 16);
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
                    ai2[i3] = kn1.mk();
                    kn1.mh();
                }

                ai2[i3] = kn1.mk();
                fA = ai2;
                break;

            case 18: // '\022'
                int l4 = kn1.cR(kn1.mn());
                int j1 = kn1.getPosition();
                int j3;
                for (j3 = 0; kn1.ms() > 0; j3++)
                {
                    kn1.mk();
                }

                kn1.cT(j1);
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
                    ai3[j3] = kn1.mk();
                }

                fA = ai3;
                kn1.cS(l4);
                break;

            case 24: // '\030'
                int k3 = kw.b(kn1, 24);
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
                    ai4[k3] = kn1.mk();
                    kn1.mh();
                }

                ai4[k3] = kn1.mk();
                fB = ai4;
                break;

            case 26: // '\032'
                int i5 = kn1.cR(kn1.mn());
                int l1 = kn1.getPosition();
                int l3;
                for (l3 = 0; kn1.ms() > 0; l3++)
                {
                    kn1.mk();
                }

                kn1.cT(l1);
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
                    ai5[l3] = kn1.mk();
                }

                fB = ai5;
                kn1.cS(i5);
                break;

            case 32: // ' '
                fC = kn1.mk();
                break;

            case 40: // '('
                int i4 = kw.b(kn1, 40);
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
                    ai6[i4] = kn1.mk();
                    kn1.mh();
                }

                ai6[i4] = kn1.mk();
                fD = ai6;
                break;

            case 42: // '*'
                int j5 = kn1.cR(kn1.mn());
                int j2 = kn1.getPosition();
                int j4;
                for (j4 = 0; kn1.ms() > 0; j4++)
                {
                    kn1.mk();
                }

                kn1.cT(j2);
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
                    ai7[j4] = kn1.mk();
                }

                fD = ai7;
                kn1.cS(j5);
                break;

            case 48: // '0'
                fE = kn1.mk();
                break;

            case 56: // '8'
                fF = kn1.mk();
                break;
            }
        } while (true);
    }

    public k n()
    {
        fz = kw.aea;
        fA = kw.aea;
        fB = kw.aea;
        fC = 0;
        fD = kw.aea;
        fE = 0;
        fF = 0;
        adU = null;
        adY = -1;
        return this;
    }


    public ()
    {
        n();
    }
}
