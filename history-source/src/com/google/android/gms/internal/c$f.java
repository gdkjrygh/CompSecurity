// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            qq, c, qv, qw, 
//            qp, qu, qo, qz

public static final class k extends qq
{

    public String fE[];
    public String fF[];
    public azh fG[];
    public azh fH[];
    public azh fI[];
    public azh fJ[];
    public azh fK[];
    public azh fL[];
    public String fM;
    public String fN;
    public String fO;
    public azh fP;
    public float fQ;
    public boolean fR;
    public String fS[];
    public int fT;
    public String version;

    public static k a(byte abyte0[])
        throws qv
    {
        return (k)qw.a(new <init>(), abyte0);
    }

    public void a(qp qp1)
        throws IOException
    {
        boolean flag = false;
        if (fF != null && fF.length > 0)
        {
            for (int i = 0; i < fF.length; i++)
            {
                String s = fF[i];
                if (s != null)
                {
                    qp1.b(1, s);
                }
            }

        }
        if (fG != null && fG.length > 0)
        {
            for (int j = 0; j < fG.length; j++)
            {
                <init> <init>1 = fG[j];
                if (<init>1 != null)
                {
                    qp1.a(2, <init>1);
                }
            }

        }
        if (fH != null && fH.length > 0)
        {
            for (int l = 0; l < fH.length; l++)
            {
                <init> <init>2 = fH[l];
                if (<init>2 != null)
                {
                    qp1.a(3, <init>2);
                }
            }

        }
        if (fI != null && fI.length > 0)
        {
            for (int i1 = 0; i1 < fI.length; i1++)
            {
                <init> <init>3 = fI[i1];
                if (<init>3 != null)
                {
                    qp1.a(4, <init>3);
                }
            }

        }
        if (fJ != null && fJ.length > 0)
        {
            for (int j1 = 0; j1 < fJ.length; j1++)
            {
                <init> <init>4 = fJ[j1];
                if (<init>4 != null)
                {
                    qp1.a(5, <init>4);
                }
            }

        }
        if (fK != null && fK.length > 0)
        {
            for (int k1 = 0; k1 < fK.length; k1++)
            {
                <init> <init>5 = fK[k1];
                if (<init>5 != null)
                {
                    qp1.a(6, <init>5);
                }
            }

        }
        if (fL != null && fL.length > 0)
        {
            for (int l1 = 0; l1 < fL.length; l1++)
            {
                <init> <init>6 = fL[l1];
                if (<init>6 != null)
                {
                    qp1.a(7, <init>6);
                }
            }

        }
        if (!fM.equals(""))
        {
            qp1.b(9, fM);
        }
        if (!fN.equals(""))
        {
            qp1.b(10, fN);
        }
        if (!fO.equals("0"))
        {
            qp1.b(12, fO);
        }
        if (!version.equals(""))
        {
            qp1.b(13, version);
        }
        if (fP != null)
        {
            qp1.a(14, fP);
        }
        if (Float.floatToIntBits(fQ) != Float.floatToIntBits(0.0F))
        {
            qp1.b(15, fQ);
        }
        if (fS != null && fS.length > 0)
        {
            for (int i2 = 0; i2 < fS.length; i2++)
            {
                String s1 = fS[i2];
                if (s1 != null)
                {
                    qp1.b(16, s1);
                }
            }

        }
        if (fT != 0)
        {
            qp1.t(17, fT);
        }
        if (fR)
        {
            qp1.b(18, fR);
        }
        if (fE != null && fE.length > 0)
        {
            for (int j2 = ((flag) ? 1 : 0); j2 < fE.length; j2++)
            {
                String s2 = fE[j2];
                if (s2 != null)
                {
                    qp1.b(19, s2);
                }
            }

        }
        super.a(qp1);
    }

    public qw b(qo qo1)
        throws IOException
    {
        return g(qo1);
    }

    protected int c()
    {
        boolean flag = false;
        int l4 = super.c();
        int j;
        int l;
        int l2;
        if (fF != null && fF.length > 0)
        {
            int i = 0;
            l = 0;
            int i1;
            int j3;
            for (i1 = 0; i < fF.length; i1 = j3)
            {
                String s = fF[i];
                int i4 = l;
                j3 = i1;
                if (s != null)
                {
                    j3 = i1 + 1;
                    i4 = l + qp.dk(s);
                }
                i++;
                l = i4;
            }

            l = l4 + l + i1 * 1;
        } else
        {
            l = l4;
        }
        j = l;
        if (fG != null)
        {
            j = l;
            if (fG.length > 0)
            {
                j = l;
                for (l = 0; l < fG.length;)
                {
                    g g1 = fG[l];
                    int j1 = j;
                    if (g1 != null)
                    {
                        j1 = j + qp.c(2, g1);
                    }
                    l++;
                    j = j1;
                }

            }
        }
        l = j;
        if (fH != null)
        {
            l = j;
            if (fH.length > 0)
            {
                for (l = 0; l < fH.length;)
                {
                    g g2 = fH[l];
                    int k1 = j;
                    if (g2 != null)
                    {
                        k1 = j + qp.c(3, g2);
                    }
                    l++;
                    j = k1;
                }

                l = j;
            }
        }
        j = l;
        if (fI != null)
        {
            j = l;
            if (fI.length > 0)
            {
                j = l;
                for (l = 0; l < fI.length;)
                {
                    g g3 = fI[l];
                    int l1 = j;
                    if (g3 != null)
                    {
                        l1 = j + qp.c(4, g3);
                    }
                    l++;
                    j = l1;
                }

            }
        }
        l = j;
        if (fJ != null)
        {
            l = j;
            if (fJ.length > 0)
            {
                for (l = 0; l < fJ.length;)
                {
                    g g4 = fJ[l];
                    int i2 = j;
                    if (g4 != null)
                    {
                        i2 = j + qp.c(5, g4);
                    }
                    l++;
                    j = i2;
                }

                l = j;
            }
        }
        j = l;
        if (fK != null)
        {
            j = l;
            if (fK.length > 0)
            {
                j = l;
                for (l = 0; l < fK.length;)
                {
                    g g5 = fK[l];
                    int j2 = j;
                    if (g5 != null)
                    {
                        j2 = j + qp.c(6, g5);
                    }
                    l++;
                    j = j2;
                }

            }
        }
        l = j;
        if (fL != null)
        {
            l = j;
            if (fL.length > 0)
            {
                for (l = 0; l < fL.length;)
                {
                    g g6 = fL[l];
                    int k2 = j;
                    if (g6 != null)
                    {
                        k2 = j + qp.c(7, g6);
                    }
                    l++;
                    j = k2;
                }

                l = j;
            }
        }
        j = l;
        if (!fM.equals(""))
        {
            j = l + qp.j(9, fM);
        }
        l = j;
        if (!fN.equals(""))
        {
            l = j + qp.j(10, fN);
        }
        j = l;
        if (!fO.equals("0"))
        {
            j = l + qp.j(12, fO);
        }
        l = j;
        if (!version.equals(""))
        {
            l = j + qp.j(13, version);
        }
        l2 = l;
        if (fP != null)
        {
            l2 = l + qp.c(14, fP);
        }
        j = l2;
        if (Float.floatToIntBits(fQ) != Float.floatToIntBits(0.0F))
        {
            j = l2 + qp.c(15, fQ);
        }
        l = j;
        if (fS != null)
        {
            l = j;
            if (fS.length > 0)
            {
                l = 0;
                l2 = 0;
                int k3;
                int j4;
                for (k3 = 0; l < fS.length; k3 = j4)
                {
                    String s1 = fS[l];
                    l4 = l2;
                    j4 = k3;
                    if (s1 != null)
                    {
                        j4 = k3 + 1;
                        l4 = l2 + qp.dk(s1);
                    }
                    l++;
                    l2 = l4;
                }

                l = j + l2 + k3 * 2;
            }
        }
        l2 = l;
        if (fT != 0)
        {
            l2 = l + qp.v(17, fT);
        }
        j = l2;
        if (fR)
        {
            j = l2 + qp.c(18, fR);
        }
        l = j;
        if (fE != null)
        {
            l = j;
            if (fE.length > 0)
            {
                int i3 = 0;
                int l3 = 0;
                for (l = ((flag) ? 1 : 0); l < fE.length;)
                {
                    String s2 = fE[l];
                    l4 = i3;
                    int k4 = l3;
                    if (s2 != null)
                    {
                        k4 = l3 + 1;
                        l4 = i3 + qp.dk(s2);
                    }
                    l++;
                    i3 = l4;
                    l3 = k4;
                }

                l = j + i3 + l3 * 2;
            }
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
        if (!(obj instanceof k)) goto _L4; else goto _L3
_L3:
        obj = (k)obj;
        flag = flag1;
        if (!qu.equals(fE, ((fE) (obj)).fE)) goto _L4; else goto _L5
_L5:
        flag = flag1;
        if (!qu.equals(fF, ((fF) (obj)).fF)) goto _L4; else goto _L6
_L6:
        flag = flag1;
        if (!qu.equals(fG, ((fG) (obj)).fG)) goto _L4; else goto _L7
_L7:
        flag = flag1;
        if (!qu.equals(fH, ((fH) (obj)).fH)) goto _L4; else goto _L8
_L8:
        flag = flag1;
        if (!qu.equals(fI, ((fI) (obj)).fI)) goto _L4; else goto _L9
_L9:
        flag = flag1;
        if (!qu.equals(fJ, ((fJ) (obj)).fJ)) goto _L4; else goto _L10
_L10:
        flag = flag1;
        if (!qu.equals(fK, ((fK) (obj)).fK)) goto _L4; else goto _L11
_L11:
        flag = flag1;
        if (!qu.equals(fL, ((fL) (obj)).fL)) goto _L4; else goto _L12
_L12:
        if (fM != null) goto _L14; else goto _L13
_L13:
        flag = flag1;
        if (((fM) (obj)).fM != null) goto _L4; else goto _L15
_L15:
        if (fN != null) goto _L17; else goto _L16
_L16:
        flag = flag1;
        if (((fN) (obj)).fN != null) goto _L4; else goto _L18
_L18:
        if (fO != null) goto _L20; else goto _L19
_L19:
        flag = flag1;
        if (((fO) (obj)).fO != null) goto _L4; else goto _L21
_L21:
        if (version != null) goto _L23; else goto _L22
_L22:
        flag = flag1;
        if (((version) (obj)).version != null) goto _L4; else goto _L24
_L24:
        if (fP != null)
        {
            break MISSING_BLOCK_LABEL_364;
        }
        flag = flag1;
        if (((fP) (obj)).fP != null) goto _L4; else goto _L25
_L25:
        flag = flag1;
        if (Float.floatToIntBits(fQ) == Float.floatToIntBits(((fQ) (obj)).fQ))
        {
            flag = flag1;
            if (fR == ((fR) (obj)).fR)
            {
                flag = flag1;
                if (qu.equals(fS, ((fS) (obj)).fS))
                {
                    flag = flag1;
                    if (fT == ((fT) (obj)).fT)
                    {
                        return a(((qq) (obj)));
                    }
                }
            }
        }
          goto _L4
_L14:
        if (!fM.equals(((fM) (obj)).fM))
        {
            return false;
        }
          goto _L15
_L17:
        if (!fN.equals(((fN) (obj)).fN))
        {
            return false;
        }
          goto _L18
_L20:
        if (!fO.equals(((fO) (obj)).fO))
        {
            return false;
        }
          goto _L21
_L23:
        if (!version.equals(((version) (obj)).version))
        {
            return false;
        }
          goto _L24
        if (!fP.equals(((equals) (obj)).fP))
        {
            return false;
        }
          goto _L25
    }

    public fP g(qo qo1)
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
                int l2 = qz.b(qo1, 10);
                String as[];
                int j;
                if (fF == null)
                {
                    j = 0;
                } else
                {
                    j = fF.length;
                }
                as = new String[l2 + j];
                l2 = j;
                if (j != 0)
                {
                    System.arraycopy(fF, 0, as, 0, j);
                    l2 = j;
                }
                for (; l2 < as.length - 1; l2++)
                {
                    as[l2] = qo1.readString();
                    qo1.rz();
                }

                as[l2] = qo1.readString();
                fF = as;
                break;

            case 18: // '\022'
                int i3 = qz.b(qo1, 18);
                fP afp[];
                int l;
                if (fG == null)
                {
                    l = 0;
                } else
                {
                    l = fG.length;
                }
                afp = new fG[i3 + l];
                i3 = l;
                if (l != 0)
                {
                    System.arraycopy(fG, 0, afp, 0, l);
                    i3 = l;
                }
                for (; i3 < afp.length - 1; i3++)
                {
                    afp[i3] = new <init>();
                    qo1.a(afp[i3]);
                    qo1.rz();
                }

                afp[i3] = new <init>();
                qo1.a(afp[i3]);
                fG = afp;
                break;

            case 26: // '\032'
                int j3 = qz.b(qo1, 26);
                fP afp1[];
                int i1;
                if (fH == null)
                {
                    i1 = 0;
                } else
                {
                    i1 = fH.length;
                }
                afp1 = new fH[j3 + i1];
                j3 = i1;
                if (i1 != 0)
                {
                    System.arraycopy(fH, 0, afp1, 0, i1);
                    j3 = i1;
                }
                for (; j3 < afp1.length - 1; j3++)
                {
                    afp1[j3] = new <init>();
                    qo1.a(afp1[j3]);
                    qo1.rz();
                }

                afp1[j3] = new <init>();
                qo1.a(afp1[j3]);
                fH = afp1;
                break;

            case 34: // '"'
                int k3 = qz.b(qo1, 34);
                fP afp2[];
                int j1;
                if (fI == null)
                {
                    j1 = 0;
                } else
                {
                    j1 = fI.length;
                }
                afp2 = new fI[k3 + j1];
                k3 = j1;
                if (j1 != 0)
                {
                    System.arraycopy(fI, 0, afp2, 0, j1);
                    k3 = j1;
                }
                for (; k3 < afp2.length - 1; k3++)
                {
                    afp2[k3] = new <init>();
                    qo1.a(afp2[k3]);
                    qo1.rz();
                }

                afp2[k3] = new <init>();
                qo1.a(afp2[k3]);
                fI = afp2;
                break;

            case 42: // '*'
                int l3 = qz.b(qo1, 42);
                fP afp3[];
                int k1;
                if (fJ == null)
                {
                    k1 = 0;
                } else
                {
                    k1 = fJ.length;
                }
                afp3 = new fJ[l3 + k1];
                l3 = k1;
                if (k1 != 0)
                {
                    System.arraycopy(fJ, 0, afp3, 0, k1);
                    l3 = k1;
                }
                for (; l3 < afp3.length - 1; l3++)
                {
                    afp3[l3] = new <init>();
                    qo1.a(afp3[l3]);
                    qo1.rz();
                }

                afp3[l3] = new <init>();
                qo1.a(afp3[l3]);
                fJ = afp3;
                break;

            case 50: // '2'
                int i4 = qz.b(qo1, 50);
                fP afp4[];
                int l1;
                if (fK == null)
                {
                    l1 = 0;
                } else
                {
                    l1 = fK.length;
                }
                afp4 = new fK[i4 + l1];
                i4 = l1;
                if (l1 != 0)
                {
                    System.arraycopy(fK, 0, afp4, 0, l1);
                    i4 = l1;
                }
                for (; i4 < afp4.length - 1; i4++)
                {
                    afp4[i4] = new <init>();
                    qo1.a(afp4[i4]);
                    qo1.rz();
                }

                afp4[i4] = new <init>();
                qo1.a(afp4[i4]);
                fK = afp4;
                break;

            case 58: // ':'
                int j4 = qz.b(qo1, 58);
                fP afp5[];
                int i2;
                if (fL == null)
                {
                    i2 = 0;
                } else
                {
                    i2 = fL.length;
                }
                afp5 = new fL[j4 + i2];
                j4 = i2;
                if (i2 != 0)
                {
                    System.arraycopy(fL, 0, afp5, 0, i2);
                    j4 = i2;
                }
                for (; j4 < afp5.length - 1; j4++)
                {
                    afp5[j4] = new <init>();
                    qo1.a(afp5[j4]);
                    qo1.rz();
                }

                afp5[j4] = new <init>();
                qo1.a(afp5[j4]);
                fL = afp5;
                break;

            case 74: // 'J'
                fM = qo1.readString();
                break;

            case 82: // 'R'
                fN = qo1.readString();
                break;

            case 98: // 'b'
                fO = qo1.readString();
                break;

            case 106: // 'j'
                version = qo1.readString();
                break;

            case 114: // 'r'
                if (fP == null)
                {
                    fP = new <init>();
                }
                qo1.a(fP);
                break;

            case 125: // '}'
                fQ = qo1.readFloat();
                break;

            case 130: 
                int k4 = qz.b(qo1, 130);
                String as1[];
                int j2;
                if (fS == null)
                {
                    j2 = 0;
                } else
                {
                    j2 = fS.length;
                }
                as1 = new String[k4 + j2];
                k4 = j2;
                if (j2 != 0)
                {
                    System.arraycopy(fS, 0, as1, 0, j2);
                    k4 = j2;
                }
                for (; k4 < as1.length - 1; k4++)
                {
                    as1[k4] = qo1.readString();
                    qo1.rz();
                }

                as1[k4] = qo1.readString();
                fS = as1;
                break;

            case 136: 
                fT = qo1.rC();
                break;

            case 144: 
                fR = qo1.rD();
                break;

            case 154: 
                int l4 = qz.b(qo1, 154);
                String as2[];
                int k2;
                if (fE == null)
                {
                    k2 = 0;
                } else
                {
                    k2 = fE.length;
                }
                as2 = new String[l4 + k2];
                l4 = k2;
                if (k2 != 0)
                {
                    System.arraycopy(fE, 0, as2, 0, k2);
                    l4 = k2;
                }
                for (; l4 < as2.length - 1; l4++)
                {
                    as2[l4] = qo1.readString();
                    qo1.rz();
                }

                as2[l4] = qo1.readString();
                fE = as2;
                break;
            }
        } while (true);
    }

    public int hashCode()
    {
        int j1 = 0;
        int k1 = qu.hashCode(fE);
        int l1 = qu.hashCode(fF);
        int i2 = qu.hashCode(fG);
        int j2 = qu.hashCode(fH);
        int k2 = qu.hashCode(fI);
        int l2 = qu.hashCode(fJ);
        int i3 = qu.hashCode(fK);
        int j3 = qu.hashCode(fL);
        int i;
        int j;
        int l;
        int i1;
        char c1;
        int k3;
        if (fM == null)
        {
            i = 0;
        } else
        {
            i = fM.hashCode();
        }
        if (fN == null)
        {
            j = 0;
        } else
        {
            j = fN.hashCode();
        }
        if (fO == null)
        {
            l = 0;
        } else
        {
            l = fO.hashCode();
        }
        if (version == null)
        {
            i1 = 0;
        } else
        {
            i1 = version.hashCode();
        }
        if (fP != null)
        {
            j1 = fP.hashCode();
        }
        k3 = Float.floatToIntBits(fQ);
        if (fR)
        {
            c1 = '\u04CF';
        } else
        {
            c1 = '\u04D5';
        }
        return (((c1 + (((i1 + (l + (j + (i + ((((((((k1 + 527) * 31 + l1) * 31 + i2) * 31 + j2) * 31 + k2) * 31 + l2) * 31 + i3) * 31 + j3) * 31) * 31) * 31) * 31) * 31 + j1) * 31 + k3) * 31) * 31 + qu.hashCode(fS)) * 31 + fT) * 31 + rQ();
    }

    public rQ k()
    {
        fE = qz.azo;
        fF = qz.azo;
        fG = r();
        fH = i();
        fI = d();
        fJ = d();
        fK = d();
        fL = l();
        fM = "";
        fN = "";
        fO = "0";
        version = "";
        fP = null;
        fQ = 0.0F;
        fR = false;
        fS = qz.azo;
        fT = 0;
        ayW = null;
        azh = -1;
        return this;
    }

    public ()
    {
        k();
    }
}
