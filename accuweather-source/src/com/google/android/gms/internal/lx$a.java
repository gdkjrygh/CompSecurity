// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            mb, lx, md, ma, 
//            lz, mf, mi

public static final class ns extends mb
{
    public static final class a extends mb
    {

        private static volatile a amr[];
        public a ams;
        public int type;

        public static a[] nt()
        {
            if (amr == null)
            {
                synchronized (md.amX)
                {
                    if (amr == null)
                    {
                        amr = new a[0];
                    }
                }
            }
            return amr;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public void a(ma ma1)
            throws IOException
        {
            ma1.p(1, type);
            if (ams != null)
            {
                ma1.a(2, ams);
            }
            super.a(ma1);
        }

        public mf b(lz lz1)
            throws IOException
        {
            return s(lz1);
        }

        protected int c()
        {
            int j = super.c() + ma.r(1, type);
            int i = j;
            if (ams != null)
            {
                i = j + ma.b(2, ams);
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
            if (!(obj instanceof a)) goto _L4; else goto _L3
_L3:
            obj = (a)obj;
            flag = flag1;
            if (type != ((a) (obj)).type) goto _L4; else goto _L5
_L5:
            if (ams != null)
            {
                break MISSING_BLOCK_LABEL_96;
            }
            flag = flag1;
            if (((a) (obj)).ams != null) goto _L4; else goto _L6
_L6:
            if (amU != null && !amU.isEmpty())
            {
                break MISSING_BLOCK_LABEL_112;
            }
            if (((a) (obj)).amU == null)
            {
                break; /* Loop/switch isn't completed */
            }
            flag = flag1;
            if (!((a) (obj)).amU.isEmpty()) goto _L4; else goto _L7
_L7:
            return true;
            if (!ams.equals(((a) (obj)).ams))
            {
                return false;
            }
              goto _L6
            return amU.equals(((a) (obj)).amU);
        }

        public int hashCode()
        {
            boolean flag = false;
            int k = type;
            int i;
            int j;
            if (ams == null)
            {
                i = 0;
            } else
            {
                i = ams.hashCode();
            }
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
            return (i + (k + 527) * 31) * 31 + j;
        }

        public a nu()
        {
            type = 1;
            ams = null;
            amU = null;
            amY = -1;
            return this;
        }

        public a s(lz lz1)
            throws IOException
        {
_L5:
            int i = lz1.nw();
            i;
            JVM INSTR lookupswitch 3: default 40
        //                       0: 49
        //                       8: 51
        //                       18: 143;
               goto _L1 _L2 _L3 _L4
_L1:
            if (a(lz1, i)) goto _L5; else goto _L2
_L2:
            return this;
_L3:
            int j = lz1.nz();
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
                type = j;
                break;
            }
            continue; /* Loop/switch isn't completed */
_L4:
            if (ams == null)
            {
                ams = new a();
            }
            lz1.a(ams);
            if (true) goto _L5; else goto _L6
_L6:
        }

        public a()
        {
            nu();
        }
    }

    public static final class a.a extends mb
    {

        public boolean amA;
        public lx.a amB[];
        public a amC[];
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
                    lx.a a1 = amB[i];
                    if (a1 != null)
                    {
                        ma1.a(9, a1);
                    }
                }

            }
            if (amC != null && amC.length > 0)
            {
                for (int j = 0; j < amC.length; j++)
                {
                    a a2 = amC[j];
                    if (a2 != null)
                    {
                        ma1.a(10, a2);
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
                        lx.a a1 = amB[j];
                        int l = i;
                        if (a1 != null)
                        {
                            l = i + ma.b(9, a1);
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
                        a a2 = amC[j];
                        int i1 = i;
                        if (a2 != null)
                        {
                            i1 = i + ma.b(10, a2);
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
            if (!(obj instanceof a.a)) goto _L4; else goto _L3
_L3:
            obj = (a.a)obj;
            flag = flag1;
            if (!Arrays.equals(amt, ((a.a) (obj)).amt)) goto _L4; else goto _L5
_L5:
            if (amu != null)
            {
                break MISSING_BLOCK_LABEL_285;
            }
            flag = flag1;
            if (((a.a) (obj)).amu != null) goto _L4; else goto _L6
_L6:
            flag = flag1;
            if (Double.doubleToLongBits(amv) != Double.doubleToLongBits(((a.a) (obj)).amv)) goto _L4; else goto _L7
_L7:
            flag = flag1;
            if (Float.floatToIntBits(amw) != Float.floatToIntBits(((a.a) (obj)).amw)) goto _L4; else goto _L8
_L8:
            flag = flag1;
            if (amx != ((a.a) (obj)).amx) goto _L4; else goto _L9
_L9:
            flag = flag1;
            if (amy != ((a.a) (obj)).amy) goto _L4; else goto _L10
_L10:
            flag = flag1;
            if (amz != ((a.a) (obj)).amz) goto _L4; else goto _L11
_L11:
            flag = flag1;
            if (amA != ((a.a) (obj)).amA) goto _L4; else goto _L12
_L12:
            flag = flag1;
            if (!md.equals(amB, ((a.a) (obj)).amB)) goto _L4; else goto _L13
_L13:
            flag = flag1;
            if (!md.equals(amC, ((a.a) (obj)).amC)) goto _L4; else goto _L14
_L14:
            flag = flag1;
            if (!md.equals(amD, ((a.a) (obj)).amD)) goto _L4; else goto _L15
_L15:
            flag = flag1;
            if (!md.equals(amE, ((a.a) (obj)).amE)) goto _L4; else goto _L16
_L16:
            flag = flag1;
            if (!md.equals(amF, ((a.a) (obj)).amF)) goto _L4; else goto _L17
_L17:
            flag = flag1;
            if (amG != ((a.a) (obj)).amG) goto _L4; else goto _L18
_L18:
            if (amU != null && !amU.isEmpty())
            {
                break MISSING_BLOCK_LABEL_301;
            }
            if (((a.a) (obj)).amU == null)
            {
                break; /* Loop/switch isn't completed */
            }
            flag = flag1;
            if (!((a.a) (obj)).amU.isEmpty()) goto _L4; else goto _L19
_L19:
            return true;
            if (!amu.equals(((a.a) (obj)).amu))
            {
                return false;
            }
              goto _L6
            return amU.equals(((a.a) (obj)).amU);
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

        public a.a nv()
        {
            amt = mi.anh;
            amu = "";
            amv = 0.0D;
            amw = 0.0F;
            amx = 0L;
            amy = 0;
            amz = 0;
            amA = false;
            amB = lx.a.nr();
            amC = a.nt();
            amD = mi.anf;
            amE = mi.anb;
            amF = mi.anc;
            amG = 0L;
            amU = null;
            amY = -1;
            return this;
        }

        public a.a t(lz lz1)
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
                    lx.a aa[];
                    int j;
                    if (amB == null)
                    {
                        j = 0;
                    } else
                    {
                        j = amB.length;
                    }
                    aa = new lx.a[i2 + j];
                    i2 = j;
                    if (j != 0)
                    {
                        System.arraycopy(amB, 0, aa, 0, j);
                        i2 = j;
                    }
                    for (; i2 < aa.length - 1; i2++)
                    {
                        aa[i2] = new lx.a();
                        lz1.a(aa[i2]);
                        lz1.nw();
                    }

                    aa[i2] = new lx.a();
                    lz1.a(aa[i2]);
                    amB = aa;
                    break;

                case 82: // 'R'
                    int j2 = mi.b(lz1, 82);
                    a aa1[];
                    int k;
                    if (amC == null)
                    {
                        k = 0;
                    } else
                    {
                        k = amC.length;
                    }
                    aa1 = new a[j2 + k];
                    j2 = k;
                    if (k != 0)
                    {
                        System.arraycopy(amC, 0, aa1, 0, k);
                        j2 = k;
                    }
                    for (; j2 < aa1.length - 1; j2++)
                    {
                        aa1[j2] = new a();
                        lz1.a(aa1[j2]);
                        lz1.nw();
                    }

                    aa1[j2] = new a();
                    lz1.a(aa1[j2]);
                    amC = aa1;
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

        public a.a()
        {
            nv();
        }
    }


    private static volatile amq amp[];
    public a amq;
    public String name;

    public static a[] nr()
    {
        if (amp == null)
        {
            synchronized (md.amX)
            {
                if (amp == null)
                {
                    amp = new amp[0];
                }
            }
        }
        return amp;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void a(ma ma1)
        throws IOException
    {
        ma1.b(1, name);
        if (amq != null)
        {
            ma1.a(2, amq);
        }
        super.a(ma1);
    }

    public mf b(lz lz1)
        throws IOException
    {
        return r(lz1);
    }

    protected int c()
    {
        int j = super.c() + ma.h(1, name);
        int i = j;
        if (amq != null)
        {
            i = j + ma.b(2, amq);
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
        if (!(obj instanceof amq)) goto _L4; else goto _L3
_L3:
        obj = (amq)obj;
        if (name != null) goto _L6; else goto _L5
_L5:
        flag = flag1;
        if (((name) (obj)).name != null) goto _L4; else goto _L7
_L7:
        if (amq != null) goto _L9; else goto _L8
_L8:
        flag = flag1;
        if (((amq) (obj)).amq != null) goto _L4; else goto _L10
_L10:
        if (amU != null && !amU.isEmpty())
        {
            break MISSING_BLOCK_LABEL_131;
        }
        if (((amU) (obj)).amU == null)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (!((amU) (obj)).amU.isEmpty()) goto _L4; else goto _L11
_L11:
        return true;
_L6:
        if (!name.equals(((name) (obj)).name))
        {
            return false;
        }
          goto _L7
_L9:
        if (!amq.equals(((a.equals) (obj)).amq))
        {
            return false;
        }
          goto _L10
        return amU.equals(((amU) (obj)).amU);
          goto _L7
    }

    public int hashCode()
    {
        boolean flag = false;
        int i;
        int j;
        int k;
        if (name == null)
        {
            i = 0;
        } else
        {
            i = name.hashCode();
        }
        if (amq == null)
        {
            j = 0;
        } else
        {
            j = amq.hashCode();
        }
        k = ((flag) ? 1 : 0);
        if (amU != null)
        {
            if (amU.isEmpty())
            {
                k = ((flag) ? 1 : 0);
            } else
            {
                k = amU.hashCode();
            }
        }
        return (j + (i + 527) * 31) * 31 + k;
    }

    public amU ns()
    {
        name = "";
        amq = null;
        amU = null;
        amY = -1;
        return this;
    }

    public amY r(lz lz1)
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
                name = lz1.readString();
                break;

            case 18: // '\022'
                if (amq == null)
                {
                    amq = new a();
                }
                lz1.a(amq);
                break;
            }
        } while (true);
    }

    public a.nu()
    {
        ns();
    }
}
