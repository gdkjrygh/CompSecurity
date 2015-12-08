// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            zzws, zzc, zzww, zzwr, 
//            zzwq, zzxb, zzwy

public static final class zzk extends zzws
{

    public String version;
    public String zzfE[];
    public String zzfF[];
    public zzaHM zzfG[];
    public zzaHM zzfH[];
    public zzaHM zzfI[];
    public zzaHM zzfJ[];
    public zzaHM zzfK[];
    public zzaHM zzfL[];
    public String zzfM;
    public String zzfN;
    public String zzfO;
    public zzaHM zzfP;
    public float zzfQ;
    public boolean zzfR;
    public String zzfS[];
    public int zzfT;

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        if (obj != this) goto _L2; else goto _L1
_L1:
        boolean flag = true;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (!(obj instanceof zzk)) goto _L4; else goto _L3
_L3:
        obj = (zzk)obj;
        flag = flag1;
        if (!zzww.equals(zzfE, ((zzfE) (obj)).zzfE)) goto _L4; else goto _L5
_L5:
        flag = flag1;
        if (!zzww.equals(zzfF, ((zzfF) (obj)).zzfF)) goto _L4; else goto _L6
_L6:
        flag = flag1;
        if (!zzww.equals(zzfG, ((zzfG) (obj)).zzfG)) goto _L4; else goto _L7
_L7:
        flag = flag1;
        if (!zzww.equals(zzfH, ((zzfH) (obj)).zzfH)) goto _L4; else goto _L8
_L8:
        flag = flag1;
        if (!zzww.equals(zzfI, ((zzfI) (obj)).zzfI)) goto _L4; else goto _L9
_L9:
        flag = flag1;
        if (!zzww.equals(zzfJ, ((zzfJ) (obj)).zzfJ)) goto _L4; else goto _L10
_L10:
        flag = flag1;
        if (!zzww.equals(zzfK, ((zzfK) (obj)).zzfK)) goto _L4; else goto _L11
_L11:
        flag = flag1;
        if (!zzww.equals(zzfL, ((zzfL) (obj)).zzfL)) goto _L4; else goto _L12
_L12:
        if (zzfM != null) goto _L14; else goto _L13
_L13:
        flag = flag1;
        if (((zzfM) (obj)).zzfM != null) goto _L4; else goto _L15
_L15:
        if (zzfN != null) goto _L17; else goto _L16
_L16:
        flag = flag1;
        if (((zzfN) (obj)).zzfN != null) goto _L4; else goto _L18
_L18:
        if (zzfO != null) goto _L20; else goto _L19
_L19:
        flag = flag1;
        if (((zzfO) (obj)).zzfO != null) goto _L4; else goto _L21
_L21:
        if (version != null) goto _L23; else goto _L22
_L22:
        flag = flag1;
        if (((version) (obj)).version != null) goto _L4; else goto _L24
_L24:
        if (zzfP != null)
        {
            break MISSING_BLOCK_LABEL_364;
        }
        flag = flag1;
        if (((zzfP) (obj)).zzfP != null) goto _L4; else goto _L25
_L25:
        flag = flag1;
        if (Float.floatToIntBits(zzfQ) == Float.floatToIntBits(((zzfQ) (obj)).zzfQ))
        {
            flag = flag1;
            if (zzfR == ((zzfR) (obj)).zzfR)
            {
                flag = flag1;
                if (zzww.equals(zzfS, ((zzfS) (obj)).zzfS))
                {
                    flag = flag1;
                    if (zzfT == ((zzfT) (obj)).zzfT)
                    {
                        return zza(((zzws) (obj)));
                    }
                }
            }
        }
          goto _L4
_L14:
        if (!zzfM.equals(((zzfM) (obj)).zzfM))
        {
            return false;
        }
          goto _L15
_L17:
        if (!zzfN.equals(((zzfN) (obj)).zzfN))
        {
            return false;
        }
          goto _L18
_L20:
        if (!zzfO.equals(((zzfO) (obj)).zzfO))
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
        if (!zzfP.equals(((equals) (obj)).zzfP))
        {
            return false;
        }
          goto _L25
    }

    public final int hashCode()
    {
        int i1 = 0;
        int j1 = zzww.hashCode(zzfE);
        int k1 = zzww.hashCode(zzfF);
        int l1 = zzww.hashCode(zzfG);
        int i2 = zzww.hashCode(zzfH);
        int j2 = zzww.hashCode(zzfI);
        int k2 = zzww.hashCode(zzfJ);
        int l2 = zzww.hashCode(zzfK);
        int i3 = zzww.hashCode(zzfL);
        int i;
        int j;
        int k;
        int l;
        char c;
        int j3;
        if (zzfM == null)
        {
            i = 0;
        } else
        {
            i = zzfM.hashCode();
        }
        if (zzfN == null)
        {
            j = 0;
        } else
        {
            j = zzfN.hashCode();
        }
        if (zzfO == null)
        {
            k = 0;
        } else
        {
            k = zzfO.hashCode();
        }
        if (version == null)
        {
            l = 0;
        } else
        {
            l = version.hashCode();
        }
        if (zzfP != null)
        {
            i1 = zzfP.hashCode();
        }
        j3 = Float.floatToIntBits(zzfQ);
        if (zzfR)
        {
            c = '\u04CF';
        } else
        {
            c = '\u04D5';
        }
        return (((c + (((l + (k + (j + (i + ((((((((j1 + 527) * 31 + k1) * 31 + l1) * 31 + i2) * 31 + j2) * 31 + k2) * 31 + l2) * 31 + i3) * 31) * 31) * 31) * 31) * 31 + i1) * 31 + j3) * 31) * 31 + zzww.hashCode(zzfS)) * 31 + zzfT) * 31 + zzvL();
    }

    public final void zza(zzwr zzwr1)
    {
        boolean flag = false;
        if (zzfF != null && zzfF.length > 0)
        {
            for (int i = 0; i < zzfF.length; i++)
            {
                String s = zzfF[i];
                if (s != null)
                {
                    zzwr1.zzb(1, s);
                }
            }

        }
        if (zzfG != null && zzfG.length > 0)
        {
            for (int j = 0; j < zzfG.length; j++)
            {
                zzvL zzvl = zzfG[j];
                if (zzvl != null)
                {
                    zzwr1.zza(2, zzvl);
                }
            }

        }
        if (zzfH != null && zzfH.length > 0)
        {
            for (int k = 0; k < zzfH.length; k++)
            {
                zzvL zzvl1 = zzfH[k];
                if (zzvl1 != null)
                {
                    zzwr1.zza(3, zzvl1);
                }
            }

        }
        if (zzfI != null && zzfI.length > 0)
        {
            for (int l = 0; l < zzfI.length; l++)
            {
                zzvL zzvl2 = zzfI[l];
                if (zzvl2 != null)
                {
                    zzwr1.zza(4, zzvl2);
                }
            }

        }
        if (zzfJ != null && zzfJ.length > 0)
        {
            for (int i1 = 0; i1 < zzfJ.length; i1++)
            {
                zzvL zzvl3 = zzfJ[i1];
                if (zzvl3 != null)
                {
                    zzwr1.zza(5, zzvl3);
                }
            }

        }
        if (zzfK != null && zzfK.length > 0)
        {
            for (int j1 = 0; j1 < zzfK.length; j1++)
            {
                zzvL zzvl4 = zzfK[j1];
                if (zzvl4 != null)
                {
                    zzwr1.zza(6, zzvl4);
                }
            }

        }
        if (zzfL != null && zzfL.length > 0)
        {
            for (int k1 = 0; k1 < zzfL.length; k1++)
            {
                zzvL zzvl5 = zzfL[k1];
                if (zzvl5 != null)
                {
                    zzwr1.zza(7, zzvl5);
                }
            }

        }
        if (!zzfM.equals(""))
        {
            zzwr1.zzb(9, zzfM);
        }
        if (!zzfN.equals(""))
        {
            zzwr1.zzb(10, zzfN);
        }
        if (!zzfO.equals("0"))
        {
            zzwr1.zzb(12, zzfO);
        }
        if (!version.equals(""))
        {
            zzwr1.zzb(13, version);
        }
        if (zzfP != null)
        {
            zzwr1.zza(14, zzfP);
        }
        if (Float.floatToIntBits(zzfQ) != Float.floatToIntBits(0.0F))
        {
            zzwr1.zzb(15, zzfQ);
        }
        if (zzfS != null && zzfS.length > 0)
        {
            for (int l1 = 0; l1 < zzfS.length; l1++)
            {
                String s1 = zzfS[l1];
                if (s1 != null)
                {
                    zzwr1.zzb(16, s1);
                }
            }

        }
        if (zzfT != 0)
        {
            zzwr1.zzy(17, zzfT);
        }
        if (zzfR)
        {
            zzwr1.zzb(18, zzfR);
        }
        if (zzfE != null && zzfE.length > 0)
        {
            for (int i2 = ((flag) ? 1 : 0); i2 < zzfE.length; i2++)
            {
                String s2 = zzfE[i2];
                if (s2 != null)
                {
                    zzwr1.zzb(19, s2);
                }
            }

        }
        super.zza(zzwr1);
    }

    public final zzwy zzb(zzwq zzwq1)
    {
        return zzg(zzwq1);
    }

    protected final int zzc()
    {
        boolean flag = false;
        int k4 = super.zzc();
        int j;
        int k;
        int k2;
        if (zzfF != null && zzfF.length > 0)
        {
            int i = 0;
            k = 0;
            int l;
            int i3;
            for (l = 0; i < zzfF.length; l = i3)
            {
                String s = zzfF[i];
                int l3 = k;
                i3 = l;
                if (s != null)
                {
                    i3 = l + 1;
                    l3 = k + zzwr.zzdM(s);
                }
                i++;
                k = l3;
            }

            k = k4 + k + l * 1;
        } else
        {
            k = k4;
        }
        j = k;
        if (zzfG != null)
        {
            j = k;
            if (zzfG.length > 0)
            {
                j = k;
                for (k = 0; k < zzfG.length;)
                {
                    zzg zzg1 = zzfG[k];
                    int i1 = j;
                    if (zzg1 != null)
                    {
                        i1 = j + zzwr.zzc(2, zzg1);
                    }
                    k++;
                    j = i1;
                }

            }
        }
        k = j;
        if (zzfH != null)
        {
            k = j;
            if (zzfH.length > 0)
            {
                for (k = 0; k < zzfH.length;)
                {
                    zzg zzg2 = zzfH[k];
                    int j1 = j;
                    if (zzg2 != null)
                    {
                        j1 = j + zzwr.zzc(3, zzg2);
                    }
                    k++;
                    j = j1;
                }

                k = j;
            }
        }
        j = k;
        if (zzfI != null)
        {
            j = k;
            if (zzfI.length > 0)
            {
                j = k;
                for (k = 0; k < zzfI.length;)
                {
                    zzg zzg3 = zzfI[k];
                    int k1 = j;
                    if (zzg3 != null)
                    {
                        k1 = j + zzwr.zzc(4, zzg3);
                    }
                    k++;
                    j = k1;
                }

            }
        }
        k = j;
        if (zzfJ != null)
        {
            k = j;
            if (zzfJ.length > 0)
            {
                for (k = 0; k < zzfJ.length;)
                {
                    zzg zzg4 = zzfJ[k];
                    int l1 = j;
                    if (zzg4 != null)
                    {
                        l1 = j + zzwr.zzc(5, zzg4);
                    }
                    k++;
                    j = l1;
                }

                k = j;
            }
        }
        j = k;
        if (zzfK != null)
        {
            j = k;
            if (zzfK.length > 0)
            {
                j = k;
                for (k = 0; k < zzfK.length;)
                {
                    zzg zzg5 = zzfK[k];
                    int i2 = j;
                    if (zzg5 != null)
                    {
                        i2 = j + zzwr.zzc(6, zzg5);
                    }
                    k++;
                    j = i2;
                }

            }
        }
        k = j;
        if (zzfL != null)
        {
            k = j;
            if (zzfL.length > 0)
            {
                for (k = 0; k < zzfL.length;)
                {
                    zzg zzg6 = zzfL[k];
                    int j2 = j;
                    if (zzg6 != null)
                    {
                        j2 = j + zzwr.zzc(7, zzg6);
                    }
                    k++;
                    j = j2;
                }

                k = j;
            }
        }
        j = k;
        if (!zzfM.equals(""))
        {
            j = k + zzwr.zzj(9, zzfM);
        }
        k = j;
        if (!zzfN.equals(""))
        {
            k = j + zzwr.zzj(10, zzfN);
        }
        j = k;
        if (!zzfO.equals("0"))
        {
            j = k + zzwr.zzj(12, zzfO);
        }
        k = j;
        if (!version.equals(""))
        {
            k = j + zzwr.zzj(13, version);
        }
        k2 = k;
        if (zzfP != null)
        {
            k2 = k + zzwr.zzc(14, zzfP);
        }
        j = k2;
        if (Float.floatToIntBits(zzfQ) != Float.floatToIntBits(0.0F))
        {
            j = k2 + zzwr.zzc(15, zzfQ);
        }
        k = j;
        if (zzfS != null)
        {
            k = j;
            if (zzfS.length > 0)
            {
                k = 0;
                k2 = 0;
                int j3;
                int i4;
                for (j3 = 0; k < zzfS.length; j3 = i4)
                {
                    String s1 = zzfS[k];
                    k4 = k2;
                    i4 = j3;
                    if (s1 != null)
                    {
                        i4 = j3 + 1;
                        k4 = k2 + zzwr.zzdM(s1);
                    }
                    k++;
                    k2 = k4;
                }

                k = j + k2 + j3 * 2;
            }
        }
        k2 = k;
        if (zzfT != 0)
        {
            k2 = k + zzwr.zzA(17, zzfT);
        }
        j = k2;
        if (zzfR)
        {
            j = k2 + zzwr.zzc(18, zzfR);
        }
        k = j;
        if (zzfE != null)
        {
            k = j;
            if (zzfE.length > 0)
            {
                int l2 = 0;
                int k3 = 0;
                for (k = ((flag) ? 1 : 0); k < zzfE.length;)
                {
                    String s2 = zzfE[k];
                    k4 = l2;
                    int j4 = k3;
                    if (s2 != null)
                    {
                        j4 = k3 + 1;
                        k4 = l2 + zzwr.zzdM(s2);
                    }
                    k++;
                    l2 = k4;
                    k3 = j4;
                }

                k = j + l2 + k3 * 2;
            }
        }
        return k;
    }

    public final M zzg(zzwq zzwq1)
    {
        do
        {
            int i = zzwq1.zzvu();
            switch (i)
            {
            default:
                if (zza(zzwq1, i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                int k2 = zzxb.zzc(zzwq1, 10);
                String as[];
                int j;
                if (zzfF == null)
                {
                    j = 0;
                } else
                {
                    j = zzfF.length;
                }
                as = new String[k2 + j];
                k2 = j;
                if (j != 0)
                {
                    System.arraycopy(zzfF, 0, as, 0, j);
                    k2 = j;
                }
                for (; k2 < as.length - 1; k2++)
                {
                    as[k2] = zzwq1.readString();
                    zzwq1.zzvu();
                }

                as[k2] = zzwq1.readString();
                zzfF = as;
                break;

            case 18: // '\022'
                int l2 = zzxb.zzc(zzwq1, 18);
                M am[];
                int k;
                if (zzfG == null)
                {
                    k = 0;
                } else
                {
                    k = zzfG.length;
                }
                am = new zzfG[l2 + k];
                l2 = k;
                if (k != 0)
                {
                    System.arraycopy(zzfG, 0, am, 0, k);
                    l2 = k;
                }
                for (; l2 < am.length - 1; l2++)
                {
                    am[l2] = new <init>();
                    zzwq1.zza(am[l2]);
                    zzwq1.zzvu();
                }

                am[l2] = new <init>();
                zzwq1.zza(am[l2]);
                zzfG = am;
                break;

            case 26: // '\032'
                int i3 = zzxb.zzc(zzwq1, 26);
                M am1[];
                int l;
                if (zzfH == null)
                {
                    l = 0;
                } else
                {
                    l = zzfH.length;
                }
                am1 = new zzfH[i3 + l];
                i3 = l;
                if (l != 0)
                {
                    System.arraycopy(zzfH, 0, am1, 0, l);
                    i3 = l;
                }
                for (; i3 < am1.length - 1; i3++)
                {
                    am1[i3] = new <init>();
                    zzwq1.zza(am1[i3]);
                    zzwq1.zzvu();
                }

                am1[i3] = new <init>();
                zzwq1.zza(am1[i3]);
                zzfH = am1;
                break;

            case 34: // '"'
                int j3 = zzxb.zzc(zzwq1, 34);
                M am2[];
                int i1;
                if (zzfI == null)
                {
                    i1 = 0;
                } else
                {
                    i1 = zzfI.length;
                }
                am2 = new zzfI[j3 + i1];
                j3 = i1;
                if (i1 != 0)
                {
                    System.arraycopy(zzfI, 0, am2, 0, i1);
                    j3 = i1;
                }
                for (; j3 < am2.length - 1; j3++)
                {
                    am2[j3] = new <init>();
                    zzwq1.zza(am2[j3]);
                    zzwq1.zzvu();
                }

                am2[j3] = new <init>();
                zzwq1.zza(am2[j3]);
                zzfI = am2;
                break;

            case 42: // '*'
                int k3 = zzxb.zzc(zzwq1, 42);
                M am3[];
                int j1;
                if (zzfJ == null)
                {
                    j1 = 0;
                } else
                {
                    j1 = zzfJ.length;
                }
                am3 = new zzfJ[k3 + j1];
                k3 = j1;
                if (j1 != 0)
                {
                    System.arraycopy(zzfJ, 0, am3, 0, j1);
                    k3 = j1;
                }
                for (; k3 < am3.length - 1; k3++)
                {
                    am3[k3] = new <init>();
                    zzwq1.zza(am3[k3]);
                    zzwq1.zzvu();
                }

                am3[k3] = new <init>();
                zzwq1.zza(am3[k3]);
                zzfJ = am3;
                break;

            case 50: // '2'
                int l3 = zzxb.zzc(zzwq1, 50);
                M am4[];
                int k1;
                if (zzfK == null)
                {
                    k1 = 0;
                } else
                {
                    k1 = zzfK.length;
                }
                am4 = new zzfK[l3 + k1];
                l3 = k1;
                if (k1 != 0)
                {
                    System.arraycopy(zzfK, 0, am4, 0, k1);
                    l3 = k1;
                }
                for (; l3 < am4.length - 1; l3++)
                {
                    am4[l3] = new <init>();
                    zzwq1.zza(am4[l3]);
                    zzwq1.zzvu();
                }

                am4[l3] = new <init>();
                zzwq1.zza(am4[l3]);
                zzfK = am4;
                break;

            case 58: // ':'
                int i4 = zzxb.zzc(zzwq1, 58);
                M am5[];
                int l1;
                if (zzfL == null)
                {
                    l1 = 0;
                } else
                {
                    l1 = zzfL.length;
                }
                am5 = new zzfL[i4 + l1];
                i4 = l1;
                if (l1 != 0)
                {
                    System.arraycopy(zzfL, 0, am5, 0, l1);
                    i4 = l1;
                }
                for (; i4 < am5.length - 1; i4++)
                {
                    am5[i4] = new <init>();
                    zzwq1.zza(am5[i4]);
                    zzwq1.zzvu();
                }

                am5[i4] = new <init>();
                zzwq1.zza(am5[i4]);
                zzfL = am5;
                break;

            case 74: // 'J'
                zzfM = zzwq1.readString();
                break;

            case 82: // 'R'
                zzfN = zzwq1.readString();
                break;

            case 98: // 'b'
                zzfO = zzwq1.readString();
                break;

            case 106: // 'j'
                version = zzwq1.readString();
                break;

            case 114: // 'r'
                if (zzfP == null)
                {
                    zzfP = new <init>();
                }
                zzwq1.zza(zzfP);
                break;

            case 125: // '}'
                zzfQ = zzwq1.readFloat();
                break;

            case 130: 
                int j4 = zzxb.zzc(zzwq1, 130);
                String as1[];
                int i2;
                if (zzfS == null)
                {
                    i2 = 0;
                } else
                {
                    i2 = zzfS.length;
                }
                as1 = new String[j4 + i2];
                j4 = i2;
                if (i2 != 0)
                {
                    System.arraycopy(zzfS, 0, as1, 0, i2);
                    j4 = i2;
                }
                for (; j4 < as1.length - 1; j4++)
                {
                    as1[j4] = zzwq1.readString();
                    zzwq1.zzvu();
                }

                as1[j4] = zzwq1.readString();
                zzfS = as1;
                break;

            case 136: 
                zzfT = zzwq1.zzvx();
                break;

            case 144: 
                zzfR = zzwq1.zzvy();
                break;

            case 154: 
                int k4 = zzxb.zzc(zzwq1, 154);
                String as2[];
                int j2;
                if (zzfE == null)
                {
                    j2 = 0;
                } else
                {
                    j2 = zzfE.length;
                }
                as2 = new String[k4 + j2];
                k4 = j2;
                if (j2 != 0)
                {
                    System.arraycopy(zzfE, 0, as2, 0, j2);
                    k4 = j2;
                }
                for (; k4 < as2.length - 1; k4++)
                {
                    as2[k4] = zzwq1.readString();
                    zzwq1.zzvu();
                }

                as2[k4] = zzwq1.readString();
                zzfE = as2;
                break;
            }
        } while (true);
    }

    public final zzfE zzk()
    {
        zzfE = zzxb.zzaHT;
        zzfF = zzxb.zzaHT;
        zzfG = zzr();
        zzfH = zzi();
        zzfI = zzd();
        zzfJ = zzd();
        zzfK = zzd();
        zzfL = zzl();
        zzfM = "";
        zzfN = "";
        zzfO = "0";
        version = "";
        zzfP = null;
        zzfQ = 0.0F;
        zzfR = false;
        zzfS = zzxb.zzaHT;
        zzfT = 0;
        zzaHB = null;
        zzaHM = -1;
        return this;
    }

    public ()
    {
        zzk();
    }
}
