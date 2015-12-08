// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            mb, lx, mi, ma, 
//            md, lz, mf

public static final class nv extends mb
{

    public boolean amA;
    public amF amB[];
    public amF amC[];
    public String amD[];
    public long amE[];
    public float amF[];
    public long amG;
    public byte amt[];
    public String amu;
    public double amv;
    public float amw;
    public long amx;
    public int amy;
    public int amz;

    public void a(ma ma1)
        throws IOException
    {
        boolean flag = false;
        if (!Arrays.equals(amt, mi.anh))
        {
            ma1.a(1, amt);
        }
        if (!amu.equals(""))
        {
            ma1.b(2, amu);
        }
        if (Double.doubleToLongBits(amv) != Double.doubleToLongBits(0.0D))
        {
            ma1.a(3, amv);
        }
        if (Float.floatToIntBits(amw) != Float.floatToIntBits(0.0F))
        {
            ma1.b(4, amw);
        }
        if (amx != 0L)
        {
            ma1.b(5, amx);
        }
        if (amy != 0)
        {
            ma1.p(6, amy);
        }
        if (amz != 0)
        {
            ma1.q(7, amz);
        }
        if (amA)
        {
            ma1.a(8, amA);
        }
        if (amB != null && amB.length > 0)
        {
            for (int i = 0; i < amB.length; i++)
            {
                nv nv1 = amB[i];
                if (nv1 != null)
                {
                    ma1.a(9, nv1);
                }
            }

        }
        if (amC != null && amC.length > 0)
        {
            for (int j = 0; j < amC.length; j++)
            {
                nv nv2 = amC[j];
                if (nv2 != null)
                {
                    ma1.a(10, nv2);
                }
            }

        }
        if (amD != null && amD.length > 0)
        {
            for (int k = 0; k < amD.length; k++)
            {
                String s = amD[k];
                if (s != null)
                {
                    ma1.b(11, s);
                }
            }

        }
        if (amE != null && amE.length > 0)
        {
            for (int l = 0; l < amE.length; l++)
            {
                ma1.b(12, amE[l]);
            }

        }
        if (amG != 0L)
        {
            ma1.b(13, amG);
        }
        if (amF != null && amF.length > 0)
        {
            for (int i1 = ((flag) ? 1 : 0); i1 < amF.length; i1++)
            {
                ma1.b(14, amF[i1]);
            }

        }
        super.a(ma1);
    }

    public mf b(lz lz1)
        throws IOException
    {
        return t(lz1);
    }

    protected int c()
    {
        boolean flag = false;
        int j = super.c();
        int i = j;
        if (!Arrays.equals(amt, mi.anh))
        {
            i = j + ma.b(1, amt);
        }
        j = i;
        if (!amu.equals(""))
        {
            j = i + ma.h(2, amu);
        }
        i = j;
        if (Double.doubleToLongBits(amv) != Double.doubleToLongBits(0.0D))
        {
            i = j + ma.b(3, amv);
        }
        j = i;
        if (Float.floatToIntBits(amw) != Float.floatToIntBits(0.0F))
        {
            j = i + ma.c(4, amw);
        }
        i = j;
        if (amx != 0L)
        {
            i = j + ma.d(5, amx);
        }
        j = i;
        if (amy != 0)
        {
            j = i + ma.r(6, amy);
        }
        int k = j;
        if (amz != 0)
        {
            k = j + ma.s(7, amz);
        }
        i = k;
        if (amA)
        {
            i = k + ma.b(8, amA);
        }
        j = i;
        if (amB != null)
        {
            j = i;
            if (amB.length > 0)
            {
                for (j = 0; j < amB.length;)
                {
                    t t1 = amB[j];
                    int l = i;
                    if (t1 != null)
                    {
                        l = i + ma.b(9, t1);
                    }
                    j++;
                    i = l;
                }

                j = i;
            }
        }
        i = j;
        if (amC != null)
        {
            i = j;
            if (amC.length > 0)
            {
                i = j;
                for (j = 0; j < amC.length;)
                {
                    t t2 = amC[j];
                    int i1 = i;
                    if (t2 != null)
                    {
                        i1 = i + ma.b(10, t2);
                    }
                    j++;
                    i = i1;
                }

            }
        }
        j = i;
        if (amD != null)
        {
            j = i;
            if (amD.length > 0)
            {
                j = 0;
                int j1 = 0;
                int l1;
                int i2;
                for (l1 = 0; j < amD.length; l1 = i2)
                {
                    String s = amD[j];
                    int j2 = j1;
                    i2 = l1;
                    if (s != null)
                    {
                        i2 = l1 + 1;
                        j2 = j1 + ma.cz(s);
                    }
                    j++;
                    j1 = j2;
                }

                j = i + j1 + l1 * 1;
            }
        }
        i = j;
        if (amE != null)
        {
            i = j;
            if (amE.length > 0)
            {
                int k1 = 0;
                for (i = ((flag) ? 1 : 0); i < amE.length; i++)
                {
                    k1 += ma.D(amE[i]);
                }

                i = j + k1 + amE.length * 1;
            }
        }
        j = i;
        if (amG != 0L)
        {
            j = i + ma.d(13, amG);
        }
        i = j;
        if (amF != null)
        {
            i = j;
            if (amF.length > 0)
            {
                i = j + amF.length * 4 + amF.length * 1;
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
        if (!(obj instanceof amF)) goto _L4; else goto _L3
_L3:
        obj = (amF)obj;
        flag = flag1;
        if (!Arrays.equals(amt, ((amt) (obj)).amt)) goto _L4; else goto _L5
_L5:
        if (amu != null)
        {
            break MISSING_BLOCK_LABEL_285;
        }
        flag = flag1;
        if (((amu) (obj)).amu != null) goto _L4; else goto _L6
_L6:
        flag = flag1;
        if (Double.doubleToLongBits(amv) != Double.doubleToLongBits(((amv) (obj)).amv)) goto _L4; else goto _L7
_L7:
        flag = flag1;
        if (Float.floatToIntBits(amw) != Float.floatToIntBits(((amw) (obj)).amw)) goto _L4; else goto _L8
_L8:
        flag = flag1;
        if (amx != ((amx) (obj)).amx) goto _L4; else goto _L9
_L9:
        flag = flag1;
        if (amy != ((amy) (obj)).amy) goto _L4; else goto _L10
_L10:
        flag = flag1;
        if (amz != ((amz) (obj)).amz) goto _L4; else goto _L11
_L11:
        flag = flag1;
        if (amA != ((amA) (obj)).amA) goto _L4; else goto _L12
_L12:
        flag = flag1;
        if (!md.equals(amB, ((amB) (obj)).amB)) goto _L4; else goto _L13
_L13:
        flag = flag1;
        if (!md.equals(amC, ((amC) (obj)).amC)) goto _L4; else goto _L14
_L14:
        flag = flag1;
        if (!md.equals(amD, ((amD) (obj)).amD)) goto _L4; else goto _L15
_L15:
        flag = flag1;
        if (!md.equals(amE, ((amE) (obj)).amE)) goto _L4; else goto _L16
_L16:
        flag = flag1;
        if (!md.equals(amF, ((amF) (obj)).amF)) goto _L4; else goto _L17
_L17:
        flag = flag1;
        if (amG != ((amG) (obj)).amG) goto _L4; else goto _L18
_L18:
        if (amU != null && !amU.isEmpty())
        {
            break MISSING_BLOCK_LABEL_301;
        }
        if (((amU) (obj)).amU == null)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (!((amU) (obj)).amU.isEmpty()) goto _L4; else goto _L19
_L19:
        return true;
        if (!amu.equals(((amu) (obj)).amu))
        {
            return false;
        }
          goto _L6
        return amU.equals(((amU) (obj)).amU);
    }

    public int hashCode()
    {
        boolean flag = false;
        int k = Arrays.hashCode(amt);
        int i;
        char c1;
        int j;
        int l;
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        int j2;
        int k2;
        int l2;
        int i3;
        int j3;
        long l3;
        if (amu == null)
        {
            i = 0;
        } else
        {
            i = amu.hashCode();
        }
        l3 = Double.doubleToLongBits(amv);
        l = (int)(l3 ^ l3 >>> 32);
        i1 = Float.floatToIntBits(amw);
        j1 = (int)(amx ^ amx >>> 32);
        k1 = amy;
        l1 = amz;
        if (amA)
        {
            c1 = '\u04CF';
        } else
        {
            c1 = '\u04D5';
        }
        i2 = md.hashCode(amB);
        j2 = md.hashCode(amC);
        k2 = md.hashCode(amD);
        l2 = md.hashCode(amE);
        i3 = md.hashCode(amF);
        j3 = (int)(amG ^ amG >>> 32);
        j = ((flag) ? 1 : 0);
        if (amU != null)
        {
            if (amU.isEmpty())
            {
                j = ((flag) ? 1 : 0);
            } else
            {
                j = amU.hashCode();
            }
        }
        return (((((((c1 + ((((((i + (k + 527) * 31) * 31 + l) * 31 + i1) * 31 + j1) * 31 + k1) * 31 + l1) * 31) * 31 + i2) * 31 + j2) * 31 + k2) * 31 + l2) * 31 + i3) * 31 + j3) * 31 + j;
    }

    public amU nv()
    {
        amt = mi.anh;
        amu = "";
        amv = 0.0D;
        amw = 0.0F;
        amx = 0L;
        amy = 0;
        amz = 0;
        amA = false;
        amB = amB();
        amC = ();
        amD = mi.anf;
        amE = mi.anb;
        amF = mi.anc;
        amG = 0L;
        amU = null;
        amY = -1;
        return this;
    }

    public amY t(lz lz1)
        throws IOException
    {
        do
        {
            int i = lz1.nw();
            switch (i)
            {
            default:
                if (a(lz1, i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                amt = lz1.readBytes();
                break;

            case 18: // '\022'
                amu = lz1.readString();
                break;

            case 25: // '\031'
                amv = lz1.readDouble();
                break;

            case 37: // '%'
                amw = lz1.readFloat();
                break;

            case 40: // '('
                amx = lz1.ny();
                break;

            case 48: // '0'
                amy = lz1.nz();
                break;

            case 56: // '8'
                amz = lz1.nB();
                break;

            case 64: // '@'
                amA = lz1.nA();
                break;

            case 74: // 'J'
                int i2 = mi.b(lz1, 74);
                amY aamy[];
                int j;
                if (amB == null)
                {
                    j = 0;
                } else
                {
                    j = amB.length;
                }
                aamy = new amB[i2 + j];
                i2 = j;
                if (j != 0)
                {
                    System.arraycopy(amB, 0, aamy, 0, j);
                    i2 = j;
                }
                for (; i2 < aamy.length - 1; i2++)
                {
                    aamy[i2] = new t>();
                    lz1.a(aamy[i2]);
                    lz1.nw();
                }

                aamy[i2] = new t>();
                lz1.a(aamy[i2]);
                amB = aamy;
                break;

            case 82: // 'R'
                int j2 = mi.b(lz1, 82);
                amY aamy1[];
                int k;
                if (amC == null)
                {
                    k = 0;
                } else
                {
                    k = amC.length;
                }
                aamy1 = new amC[j2 + k];
                j2 = k;
                if (k != 0)
                {
                    System.arraycopy(amC, 0, aamy1, 0, k);
                    j2 = k;
                }
                for (; j2 < aamy1.length - 1; j2++)
                {
                    aamy1[j2] = new nit>();
                    lz1.a(aamy1[j2]);
                    lz1.nw();
                }

                aamy1[j2] = new nit>();
                lz1.a(aamy1[j2]);
                amC = aamy1;
                break;

            case 90: // 'Z'
                int k2 = mi.b(lz1, 90);
                String as[];
                int l;
                if (amD == null)
                {
                    l = 0;
                } else
                {
                    l = amD.length;
                }
                as = new String[k2 + l];
                k2 = l;
                if (l != 0)
                {
                    System.arraycopy(amD, 0, as, 0, l);
                    k2 = l;
                }
                for (; k2 < as.length - 1; k2++)
                {
                    as[k2] = lz1.readString();
                    lz1.nw();
                }

                as[k2] = lz1.readString();
                amD = as;
                break;

            case 96: // '`'
                int l2 = mi.b(lz1, 96);
                long al[];
                int i1;
                if (amE == null)
                {
                    i1 = 0;
                } else
                {
                    i1 = amE.length;
                }
                al = new long[l2 + i1];
                l2 = i1;
                if (i1 != 0)
                {
                    System.arraycopy(amE, 0, al, 0, i1);
                    l2 = i1;
                }
                for (; l2 < al.length - 1; l2++)
                {
                    al[l2] = lz1.ny();
                    lz1.nw();
                }

                al[l2] = lz1.ny();
                amE = al;
                break;

            case 98: // 'b'
                int l3 = lz1.ex(lz1.nD());
                int j1 = lz1.getPosition();
                int i3;
                for (i3 = 0; lz1.nI() > 0; i3++)
                {
                    lz1.ny();
                }

                lz1.ez(j1);
                long al1[];
                if (amE == null)
                {
                    j1 = 0;
                } else
                {
                    j1 = amE.length;
                }
                al1 = new long[i3 + j1];
                i3 = j1;
                if (j1 != 0)
                {
                    System.arraycopy(amE, 0, al1, 0, j1);
                    i3 = j1;
                }
                for (; i3 < al1.length; i3++)
                {
                    al1[i3] = lz1.ny();
                }

                amE = al1;
                lz1.ey(l3);
                break;

            case 104: // 'h'
                amG = lz1.ny();
                break;

            case 117: // 'u'
                int j3 = mi.b(lz1, 117);
                float af[];
                int k1;
                if (amF == null)
                {
                    k1 = 0;
                } else
                {
                    k1 = amF.length;
                }
                af = new float[j3 + k1];
                j3 = k1;
                if (k1 != 0)
                {
                    System.arraycopy(amF, 0, af, 0, k1);
                    j3 = k1;
                }
                for (; j3 < af.length - 1; j3++)
                {
                    af[j3] = lz1.readFloat();
                    lz1.nw();
                }

                af[j3] = lz1.readFloat();
                amF = af;
                break;

            case 114: // 'r'
                int l1 = lz1.nD();
                int i4 = lz1.ex(l1);
                int k3 = l1 / 4;
                float af1[];
                if (amF == null)
                {
                    l1 = 0;
                } else
                {
                    l1 = amF.length;
                }
                af1 = new float[k3 + l1];
                k3 = l1;
                if (l1 != 0)
                {
                    System.arraycopy(amF, 0, af1, 0, l1);
                    k3 = l1;
                }
                for (; k3 < af1.length; k3++)
                {
                    af1[k3] = lz1.readFloat();
                }

                amF = af1;
                lz1.ey(i4);
                break;
            }
        } while (true);
    }

    public ()
    {
        nv();
    }
}
