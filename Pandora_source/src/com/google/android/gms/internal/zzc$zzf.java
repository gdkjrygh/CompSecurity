// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            zzns, zzc, zznx, zzny, 
//            zznw, zznr, zznq, zzob

public static final class zzk extends zzns
{

    public String version;
    public zzaNT zzgA[];
    public String zzgB;
    public String zzgC;
    public String zzgD;
    public zzaNT zzgE;
    public float zzgF;
    public boolean zzgG;
    public String zzgH[];
    public int zzgI;
    public String zzgt[];
    public String zzgu[];
    public zzaNT zzgv[];
    public zzaNT zzgw[];
    public zzaNT zzgx[];
    public zzaNT zzgy[];
    public zzaNT zzgz[];

    public static zzk zza(byte abyte0[])
        throws zznx
    {
        return (zzk)zzny.zza(new <init>(), abyte0);
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
        if (!(obj instanceof <init>)) goto _L4; else goto _L3
_L3:
        obj = (<init>)obj;
        flag = flag1;
        if (!zznw.equals(zzgt, ((zzgt) (obj)).zzgt)) goto _L4; else goto _L5
_L5:
        flag = flag1;
        if (!zznw.equals(zzgu, ((zzgu) (obj)).zzgu)) goto _L4; else goto _L6
_L6:
        flag = flag1;
        if (!zznw.equals(zzgv, ((zzgv) (obj)).zzgv)) goto _L4; else goto _L7
_L7:
        flag = flag1;
        if (!zznw.equals(zzgw, ((zzgw) (obj)).zzgw)) goto _L4; else goto _L8
_L8:
        flag = flag1;
        if (!zznw.equals(zzgx, ((zzgx) (obj)).zzgx)) goto _L4; else goto _L9
_L9:
        flag = flag1;
        if (!zznw.equals(zzgy, ((zzgy) (obj)).zzgy)) goto _L4; else goto _L10
_L10:
        flag = flag1;
        if (!zznw.equals(zzgz, ((zzgz) (obj)).zzgz)) goto _L4; else goto _L11
_L11:
        flag = flag1;
        if (!zznw.equals(zzgA, ((zzgA) (obj)).zzgA)) goto _L4; else goto _L12
_L12:
        if (zzgB != null) goto _L14; else goto _L13
_L13:
        flag = flag1;
        if (((zzgB) (obj)).zzgB != null) goto _L4; else goto _L15
_L15:
        if (zzgC != null) goto _L17; else goto _L16
_L16:
        flag = flag1;
        if (((zzgC) (obj)).zzgC != null) goto _L4; else goto _L18
_L18:
        if (zzgD != null) goto _L20; else goto _L19
_L19:
        flag = flag1;
        if (((zzgD) (obj)).zzgD != null) goto _L4; else goto _L21
_L21:
        if (version != null) goto _L23; else goto _L22
_L22:
        flag = flag1;
        if (((version) (obj)).version != null) goto _L4; else goto _L24
_L24:
        if (zzgE != null)
        {
            break MISSING_BLOCK_LABEL_364;
        }
        flag = flag1;
        if (((zzgE) (obj)).zzgE != null) goto _L4; else goto _L25
_L25:
        flag = flag1;
        if (Float.floatToIntBits(zzgF) == Float.floatToIntBits(((zzgF) (obj)).zzgF))
        {
            flag = flag1;
            if (zzgG == ((zzgG) (obj)).zzgG)
            {
                flag = flag1;
                if (zznw.equals(zzgH, ((zzgH) (obj)).zzgH))
                {
                    flag = flag1;
                    if (zzgI == ((zzgI) (obj)).zzgI)
                    {
                        return zza(((zzns) (obj)));
                    }
                }
            }
        }
          goto _L4
_L14:
        if (!zzgB.equals(((zzgB) (obj)).zzgB))
        {
            return false;
        }
          goto _L15
_L17:
        if (!zzgC.equals(((zzgC) (obj)).zzgC))
        {
            return false;
        }
          goto _L18
_L20:
        if (!zzgD.equals(((zzgD) (obj)).zzgD))
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
        if (!zzgE.equals(((equals) (obj)).zzgE))
        {
            return false;
        }
          goto _L25
    }

    public int hashCode()
    {
        int i1 = 0;
        int j1 = zznw.hashCode(zzgt);
        int k1 = zznw.hashCode(zzgu);
        int l1 = zznw.hashCode(zzgv);
        int i2 = zznw.hashCode(zzgw);
        int j2 = zznw.hashCode(zzgx);
        int k2 = zznw.hashCode(zzgy);
        int l2 = zznw.hashCode(zzgz);
        int i3 = zznw.hashCode(zzgA);
        int i;
        int j;
        int k;
        int l;
        char c;
        int j3;
        if (zzgB == null)
        {
            i = 0;
        } else
        {
            i = zzgB.hashCode();
        }
        if (zzgC == null)
        {
            j = 0;
        } else
        {
            j = zzgC.hashCode();
        }
        if (zzgD == null)
        {
            k = 0;
        } else
        {
            k = zzgD.hashCode();
        }
        if (version == null)
        {
            l = 0;
        } else
        {
            l = version.hashCode();
        }
        if (zzgE != null)
        {
            i1 = zzgE.hashCode();
        }
        j3 = Float.floatToIntBits(zzgF);
        if (zzgG)
        {
            c = '\u04CF';
        } else
        {
            c = '\u04D5';
        }
        return (((c + (((l + (k + (j + (i + ((((((((j1 + 527) * 31 + k1) * 31 + l1) * 31 + i2) * 31 + j2) * 31 + k2) * 31 + l2) * 31 + i3) * 31) * 31) * 31) * 31) * 31 + i1) * 31 + j3) * 31) * 31 + zznw.hashCode(zzgH)) * 31 + zzgI) * 31 + zzzP();
    }

    public void zza(zznr zznr1)
        throws IOException
    {
        boolean flag = false;
        if (zzgu != null && zzgu.length > 0)
        {
            for (int i = 0; i < zzgu.length; i++)
            {
                String s = zzgu[i];
                if (s != null)
                {
                    zznr1.zzb(1, s);
                }
            }

        }
        if (zzgv != null && zzgv.length > 0)
        {
            for (int j = 0; j < zzgv.length; j++)
            {
                zzzP zzzp = zzgv[j];
                if (zzzp != null)
                {
                    zznr1.zza(2, zzzp);
                }
            }

        }
        if (zzgw != null && zzgw.length > 0)
        {
            for (int k = 0; k < zzgw.length; k++)
            {
                zzzP zzzp1 = zzgw[k];
                if (zzzp1 != null)
                {
                    zznr1.zza(3, zzzp1);
                }
            }

        }
        if (zzgx != null && zzgx.length > 0)
        {
            for (int l = 0; l < zzgx.length; l++)
            {
                zzzP zzzp2 = zzgx[l];
                if (zzzp2 != null)
                {
                    zznr1.zza(4, zzzp2);
                }
            }

        }
        if (zzgy != null && zzgy.length > 0)
        {
            for (int i1 = 0; i1 < zzgy.length; i1++)
            {
                zzzP zzzp3 = zzgy[i1];
                if (zzzp3 != null)
                {
                    zznr1.zza(5, zzzp3);
                }
            }

        }
        if (zzgz != null && zzgz.length > 0)
        {
            for (int j1 = 0; j1 < zzgz.length; j1++)
            {
                zzzP zzzp4 = zzgz[j1];
                if (zzzp4 != null)
                {
                    zznr1.zza(6, zzzp4);
                }
            }

        }
        if (zzgA != null && zzgA.length > 0)
        {
            for (int k1 = 0; k1 < zzgA.length; k1++)
            {
                zzzP zzzp5 = zzgA[k1];
                if (zzzp5 != null)
                {
                    zznr1.zza(7, zzzp5);
                }
            }

        }
        if (!zzgB.equals(""))
        {
            zznr1.zzb(9, zzgB);
        }
        if (!zzgC.equals(""))
        {
            zznr1.zzb(10, zzgC);
        }
        if (!zzgD.equals("0"))
        {
            zznr1.zzb(12, zzgD);
        }
        if (!version.equals(""))
        {
            zznr1.zzb(13, version);
        }
        if (zzgE != null)
        {
            zznr1.zza(14, zzgE);
        }
        if (Float.floatToIntBits(zzgF) != Float.floatToIntBits(0.0F))
        {
            zznr1.zzb(15, zzgF);
        }
        if (zzgH != null && zzgH.length > 0)
        {
            for (int l1 = 0; l1 < zzgH.length; l1++)
            {
                String s1 = zzgH[l1];
                if (s1 != null)
                {
                    zznr1.zzb(16, s1);
                }
            }

        }
        if (zzgI != 0)
        {
            zznr1.zzx(17, zzgI);
        }
        if (zzgG)
        {
            zznr1.zzb(18, zzgG);
        }
        if (zzgt != null && zzgt.length > 0)
        {
            for (int i2 = ((flag) ? 1 : 0); i2 < zzgt.length; i2++)
            {
                String s2 = zzgt[i2];
                if (s2 != null)
                {
                    zznr1.zzb(19, s2);
                }
            }

        }
        super.zza(zznr1);
    }

    public zzny zzb(zznq zznq1)
        throws IOException
    {
        return zzg(zznq1);
    }

    protected int zzc()
    {
        boolean flag = false;
        int k4 = super.zzc();
        int j;
        int k;
        int k2;
        if (zzgu != null && zzgu.length > 0)
        {
            int i = 0;
            k = 0;
            int l;
            int i3;
            for (l = 0; i < zzgu.length; l = i3)
            {
                String s = zzgu[i];
                int l3 = k;
                i3 = l;
                if (s != null)
                {
                    i3 = l + 1;
                    l3 = k + zznr.zzeB(s);
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
        if (zzgv != null)
        {
            j = k;
            if (zzgv.length > 0)
            {
                j = k;
                for (k = 0; k < zzgv.length;)
                {
                    zzg zzg1 = zzgv[k];
                    int i1 = j;
                    if (zzg1 != null)
                    {
                        i1 = j + zznr.zzc(2, zzg1);
                    }
                    k++;
                    j = i1;
                }

            }
        }
        k = j;
        if (zzgw != null)
        {
            k = j;
            if (zzgw.length > 0)
            {
                for (k = 0; k < zzgw.length;)
                {
                    zzg zzg2 = zzgw[k];
                    int j1 = j;
                    if (zzg2 != null)
                    {
                        j1 = j + zznr.zzc(3, zzg2);
                    }
                    k++;
                    j = j1;
                }

                k = j;
            }
        }
        j = k;
        if (zzgx != null)
        {
            j = k;
            if (zzgx.length > 0)
            {
                j = k;
                for (k = 0; k < zzgx.length;)
                {
                    zzg zzg3 = zzgx[k];
                    int k1 = j;
                    if (zzg3 != null)
                    {
                        k1 = j + zznr.zzc(4, zzg3);
                    }
                    k++;
                    j = k1;
                }

            }
        }
        k = j;
        if (zzgy != null)
        {
            k = j;
            if (zzgy.length > 0)
            {
                for (k = 0; k < zzgy.length;)
                {
                    zzg zzg4 = zzgy[k];
                    int l1 = j;
                    if (zzg4 != null)
                    {
                        l1 = j + zznr.zzc(5, zzg4);
                    }
                    k++;
                    j = l1;
                }

                k = j;
            }
        }
        j = k;
        if (zzgz != null)
        {
            j = k;
            if (zzgz.length > 0)
            {
                j = k;
                for (k = 0; k < zzgz.length;)
                {
                    zzg zzg5 = zzgz[k];
                    int i2 = j;
                    if (zzg5 != null)
                    {
                        i2 = j + zznr.zzc(6, zzg5);
                    }
                    k++;
                    j = i2;
                }

            }
        }
        k = j;
        if (zzgA != null)
        {
            k = j;
            if (zzgA.length > 0)
            {
                for (k = 0; k < zzgA.length;)
                {
                    zzg zzg6 = zzgA[k];
                    int j2 = j;
                    if (zzg6 != null)
                    {
                        j2 = j + zznr.zzc(7, zzg6);
                    }
                    k++;
                    j = j2;
                }

                k = j;
            }
        }
        j = k;
        if (!zzgB.equals(""))
        {
            j = k + zznr.zzj(9, zzgB);
        }
        k = j;
        if (!zzgC.equals(""))
        {
            k = j + zznr.zzj(10, zzgC);
        }
        j = k;
        if (!zzgD.equals("0"))
        {
            j = k + zznr.zzj(12, zzgD);
        }
        k = j;
        if (!version.equals(""))
        {
            k = j + zznr.zzj(13, version);
        }
        k2 = k;
        if (zzgE != null)
        {
            k2 = k + zznr.zzc(14, zzgE);
        }
        j = k2;
        if (Float.floatToIntBits(zzgF) != Float.floatToIntBits(0.0F))
        {
            j = k2 + zznr.zzc(15, zzgF);
        }
        k = j;
        if (zzgH != null)
        {
            k = j;
            if (zzgH.length > 0)
            {
                k = 0;
                k2 = 0;
                int j3;
                int i4;
                for (j3 = 0; k < zzgH.length; j3 = i4)
                {
                    String s1 = zzgH[k];
                    k4 = k2;
                    i4 = j3;
                    if (s1 != null)
                    {
                        i4 = j3 + 1;
                        k4 = k2 + zznr.zzeB(s1);
                    }
                    k++;
                    k2 = k4;
                }

                k = j + k2 + j3 * 2;
            }
        }
        k2 = k;
        if (zzgI != 0)
        {
            k2 = k + zznr.zzz(17, zzgI);
        }
        j = k2;
        if (zzgG)
        {
            j = k2 + zznr.zzc(18, zzgG);
        }
        k = j;
        if (zzgt != null)
        {
            k = j;
            if (zzgt.length > 0)
            {
                int l2 = 0;
                int k3 = 0;
                for (k = ((flag) ? 1 : 0); k < zzgt.length;)
                {
                    String s2 = zzgt[k];
                    k4 = l2;
                    int j4 = k3;
                    if (s2 != null)
                    {
                        j4 = k3 + 1;
                        k4 = l2 + zznr.zzeB(s2);
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

    public B zzg(zznq zznq1)
        throws IOException
    {
        do
        {
            int i = zznq1.zzzy();
            switch (i)
            {
            default:
                if (zza(zznq1, i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                int k2 = zzob.zzb(zznq1, 10);
                String as[];
                int j;
                if (zzgu == null)
                {
                    j = 0;
                } else
                {
                    j = zzgu.length;
                }
                as = new String[k2 + j];
                k2 = j;
                if (j != 0)
                {
                    System.arraycopy(zzgu, 0, as, 0, j);
                    k2 = j;
                }
                for (; k2 < as.length - 1; k2++)
                {
                    as[k2] = zznq1.readString();
                    zznq1.zzzy();
                }

                as[k2] = zznq1.readString();
                zzgu = as;
                break;

            case 18: // '\022'
                int l2 = zzob.zzb(zznq1, 18);
                B ab[];
                int k;
                if (zzgv == null)
                {
                    k = 0;
                } else
                {
                    k = zzgv.length;
                }
                ab = new zzgv[l2 + k];
                l2 = k;
                if (k != 0)
                {
                    System.arraycopy(zzgv, 0, ab, 0, k);
                    l2 = k;
                }
                for (; l2 < ab.length - 1; l2++)
                {
                    ab[l2] = new <init>();
                    zznq1.zza(ab[l2]);
                    zznq1.zzzy();
                }

                ab[l2] = new <init>();
                zznq1.zza(ab[l2]);
                zzgv = ab;
                break;

            case 26: // '\032'
                int i3 = zzob.zzb(zznq1, 26);
                B ab1[];
                int l;
                if (zzgw == null)
                {
                    l = 0;
                } else
                {
                    l = zzgw.length;
                }
                ab1 = new zzgw[i3 + l];
                i3 = l;
                if (l != 0)
                {
                    System.arraycopy(zzgw, 0, ab1, 0, l);
                    i3 = l;
                }
                for (; i3 < ab1.length - 1; i3++)
                {
                    ab1[i3] = new <init>();
                    zznq1.zza(ab1[i3]);
                    zznq1.zzzy();
                }

                ab1[i3] = new <init>();
                zznq1.zza(ab1[i3]);
                zzgw = ab1;
                break;

            case 34: // '"'
                int j3 = zzob.zzb(zznq1, 34);
                B ab2[];
                int i1;
                if (zzgx == null)
                {
                    i1 = 0;
                } else
                {
                    i1 = zzgx.length;
                }
                ab2 = new zzgx[j3 + i1];
                j3 = i1;
                if (i1 != 0)
                {
                    System.arraycopy(zzgx, 0, ab2, 0, i1);
                    j3 = i1;
                }
                for (; j3 < ab2.length - 1; j3++)
                {
                    ab2[j3] = new <init>();
                    zznq1.zza(ab2[j3]);
                    zznq1.zzzy();
                }

                ab2[j3] = new <init>();
                zznq1.zza(ab2[j3]);
                zzgx = ab2;
                break;

            case 42: // '*'
                int k3 = zzob.zzb(zznq1, 42);
                B ab3[];
                int j1;
                if (zzgy == null)
                {
                    j1 = 0;
                } else
                {
                    j1 = zzgy.length;
                }
                ab3 = new zzgy[k3 + j1];
                k3 = j1;
                if (j1 != 0)
                {
                    System.arraycopy(zzgy, 0, ab3, 0, j1);
                    k3 = j1;
                }
                for (; k3 < ab3.length - 1; k3++)
                {
                    ab3[k3] = new <init>();
                    zznq1.zza(ab3[k3]);
                    zznq1.zzzy();
                }

                ab3[k3] = new <init>();
                zznq1.zza(ab3[k3]);
                zzgy = ab3;
                break;

            case 50: // '2'
                int l3 = zzob.zzb(zznq1, 50);
                B ab4[];
                int k1;
                if (zzgz == null)
                {
                    k1 = 0;
                } else
                {
                    k1 = zzgz.length;
                }
                ab4 = new zzgz[l3 + k1];
                l3 = k1;
                if (k1 != 0)
                {
                    System.arraycopy(zzgz, 0, ab4, 0, k1);
                    l3 = k1;
                }
                for (; l3 < ab4.length - 1; l3++)
                {
                    ab4[l3] = new <init>();
                    zznq1.zza(ab4[l3]);
                    zznq1.zzzy();
                }

                ab4[l3] = new <init>();
                zznq1.zza(ab4[l3]);
                zzgz = ab4;
                break;

            case 58: // ':'
                int i4 = zzob.zzb(zznq1, 58);
                B ab5[];
                int l1;
                if (zzgA == null)
                {
                    l1 = 0;
                } else
                {
                    l1 = zzgA.length;
                }
                ab5 = new zzgA[i4 + l1];
                i4 = l1;
                if (l1 != 0)
                {
                    System.arraycopy(zzgA, 0, ab5, 0, l1);
                    i4 = l1;
                }
                for (; i4 < ab5.length - 1; i4++)
                {
                    ab5[i4] = new <init>();
                    zznq1.zza(ab5[i4]);
                    zznq1.zzzy();
                }

                ab5[i4] = new <init>();
                zznq1.zza(ab5[i4]);
                zzgA = ab5;
                break;

            case 74: // 'J'
                zzgB = zznq1.readString();
                break;

            case 82: // 'R'
                zzgC = zznq1.readString();
                break;

            case 98: // 'b'
                zzgD = zznq1.readString();
                break;

            case 106: // 'j'
                version = zznq1.readString();
                break;

            case 114: // 'r'
                if (zzgE == null)
                {
                    zzgE = new <init>();
                }
                zznq1.zza(zzgE);
                break;

            case 125: // '}'
                zzgF = zznq1.readFloat();
                break;

            case 130: 
                int j4 = zzob.zzb(zznq1, 130);
                String as1[];
                int i2;
                if (zzgH == null)
                {
                    i2 = 0;
                } else
                {
                    i2 = zzgH.length;
                }
                as1 = new String[j4 + i2];
                j4 = i2;
                if (i2 != 0)
                {
                    System.arraycopy(zzgH, 0, as1, 0, i2);
                    j4 = i2;
                }
                for (; j4 < as1.length - 1; j4++)
                {
                    as1[j4] = zznq1.readString();
                    zznq1.zzzy();
                }

                as1[j4] = zznq1.readString();
                zzgH = as1;
                break;

            case 136: 
                zzgI = zznq1.zzzB();
                break;

            case 144: 
                zzgG = zznq1.zzzC();
                break;

            case 154: 
                int k4 = zzob.zzb(zznq1, 154);
                String as2[];
                int j2;
                if (zzgt == null)
                {
                    j2 = 0;
                } else
                {
                    j2 = zzgt.length;
                }
                as2 = new String[k4 + j2];
                k4 = j2;
                if (j2 != 0)
                {
                    System.arraycopy(zzgt, 0, as2, 0, j2);
                    k4 = j2;
                }
                for (; k4 < as2.length - 1; k4++)
                {
                    as2[k4] = zznq1.readString();
                    zznq1.zzzy();
                }

                as2[k4] = zznq1.readString();
                zzgt = as2;
                break;
            }
        } while (true);
    }

    public zzgt zzk()
    {
        zzgt = zzob.zzaOa;
        zzgu = zzob.zzaOa;
        zzgv = zzr();
        zzgw = zzi();
        zzgx = zzd();
        zzgy = zzd();
        zzgz = zzd();
        zzgA = zzl();
        zzgB = "";
        zzgC = "";
        zzgD = "0";
        version = "";
        zzgE = null;
        zzgF = 0.0F;
        zzgG = false;
        zzgH = zzob.zzaOa;
        zzgI = 0;
        zzaNI = null;
        zzaNT = -1;
        return this;
    }

    public ()
    {
        zzk();
    }
}
