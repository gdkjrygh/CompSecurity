// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            ma, lw, mh, lz, 
//            mc, ly, me

public static final class nA extends ma
{

    public long amA;
    public int amB;
    public int amC;
    public boolean amD;
    public amI amE[];
    public amI amF[];
    public String amG[];
    public long amH[];
    public float amI[];
    public long amJ;
    public byte amw[];
    public String amx;
    public double amy;
    public float amz;

    public void a(lz lz1)
        throws IOException
    {
        boolean flag = false;
        if (!Arrays.equals(amw, mh.ank))
        {
            lz1.a(1, amw);
        }
        if (!amx.equals(""))
        {
            lz1.b(2, amx);
        }
        if (Double.doubleToLongBits(amy) != Double.doubleToLongBits(0.0D))
        {
            lz1.a(3, amy);
        }
        if (Float.floatToIntBits(amz) != Float.floatToIntBits(0.0F))
        {
            lz1.b(4, amz);
        }
        if (amA != 0L)
        {
            lz1.b(5, amA);
        }
        if (amB != 0)
        {
            lz1.p(6, amB);
        }
        if (amC != 0)
        {
            lz1.q(7, amC);
        }
        if (amD)
        {
            lz1.a(8, amD);
        }
        if (amE != null && amE.length > 0)
        {
            for (int i = 0; i < amE.length; i++)
            {
                nA na = amE[i];
                if (na != null)
                {
                    lz1.a(9, na);
                }
            }

        }
        if (amF != null && amF.length > 0)
        {
            for (int j = 0; j < amF.length; j++)
            {
                nA na1 = amF[j];
                if (na1 != null)
                {
                    lz1.a(10, na1);
                }
            }

        }
        if (amG != null && amG.length > 0)
        {
            for (int k = 0; k < amG.length; k++)
            {
                String s = amG[k];
                if (s != null)
                {
                    lz1.b(11, s);
                }
            }

        }
        if (amH != null && amH.length > 0)
        {
            for (int l = 0; l < amH.length; l++)
            {
                lz1.b(12, amH[l]);
            }

        }
        if (amJ != 0L)
        {
            lz1.b(13, amJ);
        }
        if (amI != null && amI.length > 0)
        {
            for (int i1 = ((flag) ? 1 : 0); i1 < amI.length; i1++)
            {
                lz1.b(14, amI[i1]);
            }

        }
        super.a(lz1);
    }

    public me b(ly ly1)
        throws IOException
    {
        return t(ly1);
    }

    protected int c()
    {
        boolean flag = false;
        int j = super.c();
        int i = j;
        if (!Arrays.equals(amw, mh.ank))
        {
            i = j + lz.b(1, amw);
        }
        j = i;
        if (!amx.equals(""))
        {
            j = i + lz.h(2, amx);
        }
        i = j;
        if (Double.doubleToLongBits(amy) != Double.doubleToLongBits(0.0D))
        {
            i = j + lz.b(3, amy);
        }
        j = i;
        if (Float.floatToIntBits(amz) != Float.floatToIntBits(0.0F))
        {
            j = i + lz.c(4, amz);
        }
        i = j;
        if (amA != 0L)
        {
            i = j + lz.d(5, amA);
        }
        j = i;
        if (amB != 0)
        {
            j = i + lz.r(6, amB);
        }
        int k = j;
        if (amC != 0)
        {
            k = j + lz.s(7, amC);
        }
        i = k;
        if (amD)
        {
            i = k + lz.b(8, amD);
        }
        j = i;
        if (amE != null)
        {
            j = i;
            if (amE.length > 0)
            {
                for (j = 0; j < amE.length;)
                {
                    t t1 = amE[j];
                    int l = i;
                    if (t1 != null)
                    {
                        l = i + lz.b(9, t1);
                    }
                    j++;
                    i = l;
                }

                j = i;
            }
        }
        i = j;
        if (amF != null)
        {
            i = j;
            if (amF.length > 0)
            {
                i = j;
                for (j = 0; j < amF.length;)
                {
                    t t2 = amF[j];
                    int i1 = i;
                    if (t2 != null)
                    {
                        i1 = i + lz.b(10, t2);
                    }
                    j++;
                    i = i1;
                }

            }
        }
        j = i;
        if (amG != null)
        {
            j = i;
            if (amG.length > 0)
            {
                j = 0;
                int j1 = 0;
                int l1;
                int i2;
                for (l1 = 0; j < amG.length; l1 = i2)
                {
                    String s = amG[j];
                    int j2 = j1;
                    i2 = l1;
                    if (s != null)
                    {
                        i2 = l1 + 1;
                        j2 = j1 + lz.cz(s);
                    }
                    j++;
                    j1 = j2;
                }

                j = i + j1 + l1 * 1;
            }
        }
        i = j;
        if (amH != null)
        {
            i = j;
            if (amH.length > 0)
            {
                int k1 = 0;
                for (i = ((flag) ? 1 : 0); i < amH.length; i++)
                {
                    k1 += lz.D(amH[i]);
                }

                i = j + k1 + amH.length * 1;
            }
        }
        j = i;
        if (amJ != 0L)
        {
            j = i + lz.d(13, amJ);
        }
        i = j;
        if (amI != null)
        {
            i = j;
            if (amI.length > 0)
            {
                i = j + amI.length * 4 + amI.length * 1;
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
        if (!(obj instanceof amI)) goto _L4; else goto _L3
_L3:
        obj = (amI)obj;
        flag = flag1;
        if (!Arrays.equals(amw, ((amw) (obj)).amw)) goto _L4; else goto _L5
_L5:
        if (amx != null)
        {
            break MISSING_BLOCK_LABEL_285;
        }
        flag = flag1;
        if (((amx) (obj)).amx != null) goto _L4; else goto _L6
_L6:
        flag = flag1;
        if (Double.doubleToLongBits(amy) != Double.doubleToLongBits(((amy) (obj)).amy)) goto _L4; else goto _L7
_L7:
        flag = flag1;
        if (Float.floatToIntBits(amz) != Float.floatToIntBits(((amz) (obj)).amz)) goto _L4; else goto _L8
_L8:
        flag = flag1;
        if (amA != ((amA) (obj)).amA) goto _L4; else goto _L9
_L9:
        flag = flag1;
        if (amB != ((amB) (obj)).amB) goto _L4; else goto _L10
_L10:
        flag = flag1;
        if (amC != ((amC) (obj)).amC) goto _L4; else goto _L11
_L11:
        flag = flag1;
        if (amD != ((amD) (obj)).amD) goto _L4; else goto _L12
_L12:
        flag = flag1;
        if (!mc.equals(amE, ((amE) (obj)).amE)) goto _L4; else goto _L13
_L13:
        flag = flag1;
        if (!mc.equals(amF, ((amF) (obj)).amF)) goto _L4; else goto _L14
_L14:
        flag = flag1;
        if (!mc.equals(amG, ((amG) (obj)).amG)) goto _L4; else goto _L15
_L15:
        flag = flag1;
        if (!mc.equals(amH, ((amH) (obj)).amH)) goto _L4; else goto _L16
_L16:
        flag = flag1;
        if (!mc.equals(amI, ((amI) (obj)).amI)) goto _L4; else goto _L17
_L17:
        flag = flag1;
        if (amJ != ((amJ) (obj)).amJ) goto _L4; else goto _L18
_L18:
        if (amX != null && !amX.isEmpty())
        {
            break MISSING_BLOCK_LABEL_301;
        }
        if (((amX) (obj)).amX == null)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (!((amX) (obj)).amX.isEmpty()) goto _L4; else goto _L19
_L19:
        return true;
        if (!amx.equals(((amx) (obj)).amx))
        {
            return false;
        }
          goto _L6
        return amX.equals(((amX) (obj)).amX);
    }

    public int hashCode()
    {
        boolean flag = false;
        int k = Arrays.hashCode(amw);
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
        if (amx == null)
        {
            i = 0;
        } else
        {
            i = amx.hashCode();
        }
        l3 = Double.doubleToLongBits(amy);
        l = (int)(l3 ^ l3 >>> 32);
        i1 = Float.floatToIntBits(amz);
        j1 = (int)(amA ^ amA >>> 32);
        k1 = amB;
        l1 = amC;
        if (amD)
        {
            c1 = '\u04CF';
        } else
        {
            c1 = '\u04D5';
        }
        i2 = mc.hashCode(amE);
        j2 = mc.hashCode(amF);
        k2 = mc.hashCode(amG);
        l2 = mc.hashCode(amH);
        i3 = mc.hashCode(amI);
        j3 = (int)(amJ ^ amJ >>> 32);
        j = ((flag) ? 1 : 0);
        if (amX != null)
        {
            if (amX.isEmpty())
            {
                j = ((flag) ? 1 : 0);
            } else
            {
                j = amX.hashCode();
            }
        }
        return (((((((c1 + ((((((i + (k + 527) * 31) * 31 + l) * 31 + i1) * 31 + j1) * 31 + k1) * 31 + l1) * 31) * 31 + i2) * 31 + j2) * 31 + k2) * 31 + l2) * 31 + i3) * 31 + j3) * 31 + j;
    }

    public amX nA()
    {
        amw = mh.ank;
        amx = "";
        amy = 0.0D;
        amz = 0.0F;
        amA = 0L;
        amB = 0;
        amC = 0;
        amD = false;
        amE = amE();
        amF = ();
        amG = mh.ani;
        amH = mh.ane;
        amI = mh.anf;
        amJ = 0L;
        amX = null;
        anb = -1;
        return this;
    }

    public anb t(ly ly1)
        throws IOException
    {
        do
        {
            int i = ly1.nB();
            switch (i)
            {
            default:
                if (a(ly1, i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                amw = ly1.readBytes();
                break;

            case 18: // '\022'
                amx = ly1.readString();
                break;

            case 25: // '\031'
                amy = ly1.readDouble();
                break;

            case 37: // '%'
                amz = ly1.readFloat();
                break;

            case 40: // '('
                amA = ly1.nD();
                break;

            case 48: // '0'
                amB = ly1.nE();
                break;

            case 56: // '8'
                amC = ly1.nG();
                break;

            case 64: // '@'
                amD = ly1.nF();
                break;

            case 74: // 'J'
                int i2 = mh.b(ly1, 74);
                anb aanb[];
                int j;
                if (amE == null)
                {
                    j = 0;
                } else
                {
                    j = amE.length;
                }
                aanb = new amE[i2 + j];
                i2 = j;
                if (j != 0)
                {
                    System.arraycopy(amE, 0, aanb, 0, j);
                    i2 = j;
                }
                for (; i2 < aanb.length - 1; i2++)
                {
                    aanb[i2] = new t>();
                    ly1.a(aanb[i2]);
                    ly1.nB();
                }

                aanb[i2] = new t>();
                ly1.a(aanb[i2]);
                amE = aanb;
                break;

            case 82: // 'R'
                int j2 = mh.b(ly1, 82);
                anb aanb1[];
                int k;
                if (amF == null)
                {
                    k = 0;
                } else
                {
                    k = amF.length;
                }
                aanb1 = new amF[j2 + k];
                j2 = k;
                if (k != 0)
                {
                    System.arraycopy(amF, 0, aanb1, 0, k);
                    j2 = k;
                }
                for (; j2 < aanb1.length - 1; j2++)
                {
                    aanb1[j2] = new nit>();
                    ly1.a(aanb1[j2]);
                    ly1.nB();
                }

                aanb1[j2] = new nit>();
                ly1.a(aanb1[j2]);
                amF = aanb1;
                break;

            case 90: // 'Z'
                int k2 = mh.b(ly1, 90);
                String as[];
                int l;
                if (amG == null)
                {
                    l = 0;
                } else
                {
                    l = amG.length;
                }
                as = new String[k2 + l];
                k2 = l;
                if (l != 0)
                {
                    System.arraycopy(amG, 0, as, 0, l);
                    k2 = l;
                }
                for (; k2 < as.length - 1; k2++)
                {
                    as[k2] = ly1.readString();
                    ly1.nB();
                }

                as[k2] = ly1.readString();
                amG = as;
                break;

            case 96: // '`'
                int l2 = mh.b(ly1, 96);
                long al[];
                int i1;
                if (amH == null)
                {
                    i1 = 0;
                } else
                {
                    i1 = amH.length;
                }
                al = new long[l2 + i1];
                l2 = i1;
                if (i1 != 0)
                {
                    System.arraycopy(amH, 0, al, 0, i1);
                    l2 = i1;
                }
                for (; l2 < al.length - 1; l2++)
                {
                    al[l2] = ly1.nD();
                    ly1.nB();
                }

                al[l2] = ly1.nD();
                amH = al;
                break;

            case 98: // 'b'
                int l3 = ly1.ex(ly1.nI());
                int j1 = ly1.getPosition();
                int i3;
                for (i3 = 0; ly1.nN() > 0; i3++)
                {
                    ly1.nD();
                }

                ly1.ez(j1);
                long al1[];
                if (amH == null)
                {
                    j1 = 0;
                } else
                {
                    j1 = amH.length;
                }
                al1 = new long[i3 + j1];
                i3 = j1;
                if (j1 != 0)
                {
                    System.arraycopy(amH, 0, al1, 0, j1);
                    i3 = j1;
                }
                for (; i3 < al1.length; i3++)
                {
                    al1[i3] = ly1.nD();
                }

                amH = al1;
                ly1.ey(l3);
                break;

            case 104: // 'h'
                amJ = ly1.nD();
                break;

            case 117: // 'u'
                int j3 = mh.b(ly1, 117);
                float af[];
                int k1;
                if (amI == null)
                {
                    k1 = 0;
                } else
                {
                    k1 = amI.length;
                }
                af = new float[j3 + k1];
                j3 = k1;
                if (k1 != 0)
                {
                    System.arraycopy(amI, 0, af, 0, k1);
                    j3 = k1;
                }
                for (; j3 < af.length - 1; j3++)
                {
                    af[j3] = ly1.readFloat();
                    ly1.nB();
                }

                af[j3] = ly1.readFloat();
                amI = af;
                break;

            case 114: // 'r'
                int l1 = ly1.nI();
                int i4 = ly1.ex(l1);
                int k3 = l1 / 4;
                float af1[];
                if (amI == null)
                {
                    l1 = 0;
                } else
                {
                    l1 = amI.length;
                }
                af1 = new float[k3 + l1];
                k3 = l1;
                if (l1 != 0)
                {
                    System.arraycopy(amI, 0, af1, 0, l1);
                    k3 = l1;
                }
                for (; k3 < af1.length; k3++)
                {
                    af1[k3] = ly1.readFloat();
                }

                amI = af1;
                ly1.ey(i4);
                break;
            }
        } while (true);
    }

    public ()
    {
        nA();
    }
}
