// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            zzns, zzc, zznw, zznr, 
//            zznq, zzob, zzny

public static final class zzm extends zzns
{

    private static volatile zzaNT zzgJ[];
    public int zzgK[];
    public int zzgL[];
    public int zzgM[];
    public int zzgN[];
    public int zzgO[];
    public int zzgP[];
    public int zzgQ[];
    public int zzgR[];
    public int zzgS[];
    public int zzgT[];

    public static zzm[] zzl()
    {
        if (zzgJ == null)
        {
            synchronized (zznw.zzaNS)
            {
                if (zzgJ == null)
                {
                    zzgJ = new zzgJ[0];
                }
            }
        }
        return zzgJ;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag;
        if (obj == this)
        {
            flag = true;
        } else
        {
            flag = flag1;
            if (obj instanceof zzgJ)
            {
                obj = (zzgJ)obj;
                flag = flag1;
                if (zznw.equals(zzgK, ((zzgK) (obj)).zzgK))
                {
                    flag = flag1;
                    if (zznw.equals(zzgL, ((zzgL) (obj)).zzgL))
                    {
                        flag = flag1;
                        if (zznw.equals(zzgM, ((zzgM) (obj)).zzgM))
                        {
                            flag = flag1;
                            if (zznw.equals(zzgN, ((zzgN) (obj)).zzgN))
                            {
                                flag = flag1;
                                if (zznw.equals(zzgO, ((zzgO) (obj)).zzgO))
                                {
                                    flag = flag1;
                                    if (zznw.equals(zzgP, ((zzgP) (obj)).zzgP))
                                    {
                                        flag = flag1;
                                        if (zznw.equals(zzgQ, ((zzgQ) (obj)).zzgQ))
                                        {
                                            flag = flag1;
                                            if (zznw.equals(zzgR, ((zzgR) (obj)).zzgR))
                                            {
                                                flag = flag1;
                                                if (zznw.equals(zzgS, ((zzgS) (obj)).zzgS))
                                                {
                                                    flag = flag1;
                                                    if (zznw.equals(zzgT, ((zzgT) (obj)).zzgT))
                                                    {
                                                        return zza(((zzns) (obj)));
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
        return flag;
    }

    public int hashCode()
    {
        return ((((((((((zznw.hashCode(zzgK) + 527) * 31 + zznw.hashCode(zzgL)) * 31 + zznw.hashCode(zzgM)) * 31 + zznw.hashCode(zzgN)) * 31 + zznw.hashCode(zzgO)) * 31 + zznw.hashCode(zzgP)) * 31 + zznw.hashCode(zzgQ)) * 31 + zznw.hashCode(zzgR)) * 31 + zznw.hashCode(zzgS)) * 31 + zznw.hashCode(zzgT)) * 31 + zzzP();
    }

    public void zza(zznr zznr1)
        throws IOException
    {
        boolean flag = false;
        if (zzgK != null && zzgK.length > 0)
        {
            for (int i = 0; i < zzgK.length; i++)
            {
                zznr1.zzx(1, zzgK[i]);
            }

        }
        if (zzgL != null && zzgL.length > 0)
        {
            for (int j = 0; j < zzgL.length; j++)
            {
                zznr1.zzx(2, zzgL[j]);
            }

        }
        if (zzgM != null && zzgM.length > 0)
        {
            for (int k = 0; k < zzgM.length; k++)
            {
                zznr1.zzx(3, zzgM[k]);
            }

        }
        if (zzgN != null && zzgN.length > 0)
        {
            for (int l = 0; l < zzgN.length; l++)
            {
                zznr1.zzx(4, zzgN[l]);
            }

        }
        if (zzgO != null && zzgO.length > 0)
        {
            for (int i1 = 0; i1 < zzgO.length; i1++)
            {
                zznr1.zzx(5, zzgO[i1]);
            }

        }
        if (zzgP != null && zzgP.length > 0)
        {
            for (int j1 = 0; j1 < zzgP.length; j1++)
            {
                zznr1.zzx(6, zzgP[j1]);
            }

        }
        if (zzgQ != null && zzgQ.length > 0)
        {
            for (int k1 = 0; k1 < zzgQ.length; k1++)
            {
                zznr1.zzx(7, zzgQ[k1]);
            }

        }
        if (zzgR != null && zzgR.length > 0)
        {
            for (int l1 = 0; l1 < zzgR.length; l1++)
            {
                zznr1.zzx(8, zzgR[l1]);
            }

        }
        if (zzgS != null && zzgS.length > 0)
        {
            for (int i2 = 0; i2 < zzgS.length; i2++)
            {
                zznr1.zzx(9, zzgS[i2]);
            }

        }
        if (zzgT != null && zzgT.length > 0)
        {
            for (int j2 = ((flag) ? 1 : 0); j2 < zzgT.length; j2++)
            {
                zznr1.zzx(10, zzgT[j2]);
            }

        }
        super.zza(zznr1);
    }

    public zzny zzb(zznq zznq1)
        throws IOException
    {
        return zzh(zznq1);
    }

    protected int zzc()
    {
        boolean flag = false;
        int l = super.zzc();
        int j;
        int k;
        if (zzgK != null && zzgK.length > 0)
        {
            int i = 0;
            k = 0;
            for (; i < zzgK.length; i++)
            {
                k += zznr.zzju(zzgK[i]);
            }

            k = l + k + zzgK.length * 1;
        } else
        {
            k = l;
        }
        j = k;
        if (zzgL != null)
        {
            j = k;
            if (zzgL.length > 0)
            {
                j = 0;
                l = 0;
                for (; j < zzgL.length; j++)
                {
                    l += zznr.zzju(zzgL[j]);
                }

                j = k + l + zzgL.length * 1;
            }
        }
        k = j;
        if (zzgM != null)
        {
            k = j;
            if (zzgM.length > 0)
            {
                k = 0;
                l = 0;
                for (; k < zzgM.length; k++)
                {
                    l += zznr.zzju(zzgM[k]);
                }

                k = j + l + zzgM.length * 1;
            }
        }
        j = k;
        if (zzgN != null)
        {
            j = k;
            if (zzgN.length > 0)
            {
                j = 0;
                l = 0;
                for (; j < zzgN.length; j++)
                {
                    l += zznr.zzju(zzgN[j]);
                }

                j = k + l + zzgN.length * 1;
            }
        }
        k = j;
        if (zzgO != null)
        {
            k = j;
            if (zzgO.length > 0)
            {
                k = 0;
                l = 0;
                for (; k < zzgO.length; k++)
                {
                    l += zznr.zzju(zzgO[k]);
                }

                k = j + l + zzgO.length * 1;
            }
        }
        j = k;
        if (zzgP != null)
        {
            j = k;
            if (zzgP.length > 0)
            {
                j = 0;
                l = 0;
                for (; j < zzgP.length; j++)
                {
                    l += zznr.zzju(zzgP[j]);
                }

                j = k + l + zzgP.length * 1;
            }
        }
        k = j;
        if (zzgQ != null)
        {
            k = j;
            if (zzgQ.length > 0)
            {
                k = 0;
                l = 0;
                for (; k < zzgQ.length; k++)
                {
                    l += zznr.zzju(zzgQ[k]);
                }

                k = j + l + zzgQ.length * 1;
            }
        }
        j = k;
        if (zzgR != null)
        {
            j = k;
            if (zzgR.length > 0)
            {
                j = 0;
                l = 0;
                for (; j < zzgR.length; j++)
                {
                    l += zznr.zzju(zzgR[j]);
                }

                j = k + l + zzgR.length * 1;
            }
        }
        k = j;
        if (zzgS != null)
        {
            k = j;
            if (zzgS.length > 0)
            {
                k = 0;
                l = 0;
                for (; k < zzgS.length; k++)
                {
                    l += zznr.zzju(zzgS[k]);
                }

                k = j + l + zzgS.length * 1;
            }
        }
        j = k;
        if (zzgT != null)
        {
            j = k;
            if (zzgT.length > 0)
            {
                l = 0;
                for (j = ((flag) ? 1 : 0); j < zzgT.length; j++)
                {
                    l += zznr.zzju(zzgT[j]);
                }

                j = k + l + zzgT.length * 1;
            }
        }
        return j;
    }

    public zzgT zzh(zznq zznq1)
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

            case 8: // '\b'
                int j5 = zzob.zzb(zznq1, 8);
                int ai[];
                int j;
                if (zzgK == null)
                {
                    j = 0;
                } else
                {
                    j = zzgK.length;
                }
                ai = new int[j5 + j];
                j5 = j;
                if (j != 0)
                {
                    System.arraycopy(zzgK, 0, ai, 0, j);
                    j5 = j;
                }
                for (; j5 < ai.length - 1; j5++)
                {
                    ai[j5] = zznq1.zzzB();
                    zznq1.zzzy();
                }

                ai[j5] = zznq1.zzzB();
                zzgK = ai;
                break;

            case 10: // '\n'
                int j10 = zznq1.zzjn(zznq1.zzzF());
                int k = zznq1.getPosition();
                int k5;
                for (k5 = 0; zznq1.zzzK() > 0; k5++)
                {
                    zznq1.zzzB();
                }

                zznq1.zzjp(k);
                int ai1[];
                if (zzgK == null)
                {
                    k = 0;
                } else
                {
                    k = zzgK.length;
                }
                ai1 = new int[k5 + k];
                k5 = k;
                if (k != 0)
                {
                    System.arraycopy(zzgK, 0, ai1, 0, k);
                    k5 = k;
                }
                for (; k5 < ai1.length; k5++)
                {
                    ai1[k5] = zznq1.zzzB();
                }

                zzgK = ai1;
                zznq1.zzjo(j10);
                break;

            case 16: // '\020'
                int l5 = zzob.zzb(zznq1, 16);
                int ai2[];
                int l;
                if (zzgL == null)
                {
                    l = 0;
                } else
                {
                    l = zzgL.length;
                }
                ai2 = new int[l5 + l];
                l5 = l;
                if (l != 0)
                {
                    System.arraycopy(zzgL, 0, ai2, 0, l);
                    l5 = l;
                }
                for (; l5 < ai2.length - 1; l5++)
                {
                    ai2[l5] = zznq1.zzzB();
                    zznq1.zzzy();
                }

                ai2[l5] = zznq1.zzzB();
                zzgL = ai2;
                break;

            case 18: // '\022'
                int k10 = zznq1.zzjn(zznq1.zzzF());
                int i1 = zznq1.getPosition();
                int i6;
                for (i6 = 0; zznq1.zzzK() > 0; i6++)
                {
                    zznq1.zzzB();
                }

                zznq1.zzjp(i1);
                int ai3[];
                if (zzgL == null)
                {
                    i1 = 0;
                } else
                {
                    i1 = zzgL.length;
                }
                ai3 = new int[i6 + i1];
                i6 = i1;
                if (i1 != 0)
                {
                    System.arraycopy(zzgL, 0, ai3, 0, i1);
                    i6 = i1;
                }
                for (; i6 < ai3.length; i6++)
                {
                    ai3[i6] = zznq1.zzzB();
                }

                zzgL = ai3;
                zznq1.zzjo(k10);
                break;

            case 24: // '\030'
                int j6 = zzob.zzb(zznq1, 24);
                int ai4[];
                int j1;
                if (zzgM == null)
                {
                    j1 = 0;
                } else
                {
                    j1 = zzgM.length;
                }
                ai4 = new int[j6 + j1];
                j6 = j1;
                if (j1 != 0)
                {
                    System.arraycopy(zzgM, 0, ai4, 0, j1);
                    j6 = j1;
                }
                for (; j6 < ai4.length - 1; j6++)
                {
                    ai4[j6] = zznq1.zzzB();
                    zznq1.zzzy();
                }

                ai4[j6] = zznq1.zzzB();
                zzgM = ai4;
                break;

            case 26: // '\032'
                int l10 = zznq1.zzjn(zznq1.zzzF());
                int k1 = zznq1.getPosition();
                int k6;
                for (k6 = 0; zznq1.zzzK() > 0; k6++)
                {
                    zznq1.zzzB();
                }

                zznq1.zzjp(k1);
                int ai5[];
                if (zzgM == null)
                {
                    k1 = 0;
                } else
                {
                    k1 = zzgM.length;
                }
                ai5 = new int[k6 + k1];
                k6 = k1;
                if (k1 != 0)
                {
                    System.arraycopy(zzgM, 0, ai5, 0, k1);
                    k6 = k1;
                }
                for (; k6 < ai5.length; k6++)
                {
                    ai5[k6] = zznq1.zzzB();
                }

                zzgM = ai5;
                zznq1.zzjo(l10);
                break;

            case 32: // ' '
                int l6 = zzob.zzb(zznq1, 32);
                int ai6[];
                int l1;
                if (zzgN == null)
                {
                    l1 = 0;
                } else
                {
                    l1 = zzgN.length;
                }
                ai6 = new int[l6 + l1];
                l6 = l1;
                if (l1 != 0)
                {
                    System.arraycopy(zzgN, 0, ai6, 0, l1);
                    l6 = l1;
                }
                for (; l6 < ai6.length - 1; l6++)
                {
                    ai6[l6] = zznq1.zzzB();
                    zznq1.zzzy();
                }

                ai6[l6] = zznq1.zzzB();
                zzgN = ai6;
                break;

            case 34: // '"'
                int i11 = zznq1.zzjn(zznq1.zzzF());
                int i2 = zznq1.getPosition();
                int i7;
                for (i7 = 0; zznq1.zzzK() > 0; i7++)
                {
                    zznq1.zzzB();
                }

                zznq1.zzjp(i2);
                int ai7[];
                if (zzgN == null)
                {
                    i2 = 0;
                } else
                {
                    i2 = zzgN.length;
                }
                ai7 = new int[i7 + i2];
                i7 = i2;
                if (i2 != 0)
                {
                    System.arraycopy(zzgN, 0, ai7, 0, i2);
                    i7 = i2;
                }
                for (; i7 < ai7.length; i7++)
                {
                    ai7[i7] = zznq1.zzzB();
                }

                zzgN = ai7;
                zznq1.zzjo(i11);
                break;

            case 40: // '('
                int j7 = zzob.zzb(zznq1, 40);
                int ai8[];
                int j2;
                if (zzgO == null)
                {
                    j2 = 0;
                } else
                {
                    j2 = zzgO.length;
                }
                ai8 = new int[j7 + j2];
                j7 = j2;
                if (j2 != 0)
                {
                    System.arraycopy(zzgO, 0, ai8, 0, j2);
                    j7 = j2;
                }
                for (; j7 < ai8.length - 1; j7++)
                {
                    ai8[j7] = zznq1.zzzB();
                    zznq1.zzzy();
                }

                ai8[j7] = zznq1.zzzB();
                zzgO = ai8;
                break;

            case 42: // '*'
                int j11 = zznq1.zzjn(zznq1.zzzF());
                int k2 = zznq1.getPosition();
                int k7;
                for (k7 = 0; zznq1.zzzK() > 0; k7++)
                {
                    zznq1.zzzB();
                }

                zznq1.zzjp(k2);
                int ai9[];
                if (zzgO == null)
                {
                    k2 = 0;
                } else
                {
                    k2 = zzgO.length;
                }
                ai9 = new int[k7 + k2];
                k7 = k2;
                if (k2 != 0)
                {
                    System.arraycopy(zzgO, 0, ai9, 0, k2);
                    k7 = k2;
                }
                for (; k7 < ai9.length; k7++)
                {
                    ai9[k7] = zznq1.zzzB();
                }

                zzgO = ai9;
                zznq1.zzjo(j11);
                break;

            case 48: // '0'
                int l7 = zzob.zzb(zznq1, 48);
                int ai10[];
                int l2;
                if (zzgP == null)
                {
                    l2 = 0;
                } else
                {
                    l2 = zzgP.length;
                }
                ai10 = new int[l7 + l2];
                l7 = l2;
                if (l2 != 0)
                {
                    System.arraycopy(zzgP, 0, ai10, 0, l2);
                    l7 = l2;
                }
                for (; l7 < ai10.length - 1; l7++)
                {
                    ai10[l7] = zznq1.zzzB();
                    zznq1.zzzy();
                }

                ai10[l7] = zznq1.zzzB();
                zzgP = ai10;
                break;

            case 50: // '2'
                int k11 = zznq1.zzjn(zznq1.zzzF());
                int i3 = zznq1.getPosition();
                int i8;
                for (i8 = 0; zznq1.zzzK() > 0; i8++)
                {
                    zznq1.zzzB();
                }

                zznq1.zzjp(i3);
                int ai11[];
                if (zzgP == null)
                {
                    i3 = 0;
                } else
                {
                    i3 = zzgP.length;
                }
                ai11 = new int[i8 + i3];
                i8 = i3;
                if (i3 != 0)
                {
                    System.arraycopy(zzgP, 0, ai11, 0, i3);
                    i8 = i3;
                }
                for (; i8 < ai11.length; i8++)
                {
                    ai11[i8] = zznq1.zzzB();
                }

                zzgP = ai11;
                zznq1.zzjo(k11);
                break;

            case 56: // '8'
                int j8 = zzob.zzb(zznq1, 56);
                int ai12[];
                int j3;
                if (zzgQ == null)
                {
                    j3 = 0;
                } else
                {
                    j3 = zzgQ.length;
                }
                ai12 = new int[j8 + j3];
                j8 = j3;
                if (j3 != 0)
                {
                    System.arraycopy(zzgQ, 0, ai12, 0, j3);
                    j8 = j3;
                }
                for (; j8 < ai12.length - 1; j8++)
                {
                    ai12[j8] = zznq1.zzzB();
                    zznq1.zzzy();
                }

                ai12[j8] = zznq1.zzzB();
                zzgQ = ai12;
                break;

            case 58: // ':'
                int l11 = zznq1.zzjn(zznq1.zzzF());
                int k3 = zznq1.getPosition();
                int k8;
                for (k8 = 0; zznq1.zzzK() > 0; k8++)
                {
                    zznq1.zzzB();
                }

                zznq1.zzjp(k3);
                int ai13[];
                if (zzgQ == null)
                {
                    k3 = 0;
                } else
                {
                    k3 = zzgQ.length;
                }
                ai13 = new int[k8 + k3];
                k8 = k3;
                if (k3 != 0)
                {
                    System.arraycopy(zzgQ, 0, ai13, 0, k3);
                    k8 = k3;
                }
                for (; k8 < ai13.length; k8++)
                {
                    ai13[k8] = zznq1.zzzB();
                }

                zzgQ = ai13;
                zznq1.zzjo(l11);
                break;

            case 64: // '@'
                int l8 = zzob.zzb(zznq1, 64);
                int ai14[];
                int l3;
                if (zzgR == null)
                {
                    l3 = 0;
                } else
                {
                    l3 = zzgR.length;
                }
                ai14 = new int[l8 + l3];
                l8 = l3;
                if (l3 != 0)
                {
                    System.arraycopy(zzgR, 0, ai14, 0, l3);
                    l8 = l3;
                }
                for (; l8 < ai14.length - 1; l8++)
                {
                    ai14[l8] = zznq1.zzzB();
                    zznq1.zzzy();
                }

                ai14[l8] = zznq1.zzzB();
                zzgR = ai14;
                break;

            case 66: // 'B'
                int i12 = zznq1.zzjn(zznq1.zzzF());
                int i4 = zznq1.getPosition();
                int i9;
                for (i9 = 0; zznq1.zzzK() > 0; i9++)
                {
                    zznq1.zzzB();
                }

                zznq1.zzjp(i4);
                int ai15[];
                if (zzgR == null)
                {
                    i4 = 0;
                } else
                {
                    i4 = zzgR.length;
                }
                ai15 = new int[i9 + i4];
                i9 = i4;
                if (i4 != 0)
                {
                    System.arraycopy(zzgR, 0, ai15, 0, i4);
                    i9 = i4;
                }
                for (; i9 < ai15.length; i9++)
                {
                    ai15[i9] = zznq1.zzzB();
                }

                zzgR = ai15;
                zznq1.zzjo(i12);
                break;

            case 72: // 'H'
                int j9 = zzob.zzb(zznq1, 72);
                int ai16[];
                int j4;
                if (zzgS == null)
                {
                    j4 = 0;
                } else
                {
                    j4 = zzgS.length;
                }
                ai16 = new int[j9 + j4];
                j9 = j4;
                if (j4 != 0)
                {
                    System.arraycopy(zzgS, 0, ai16, 0, j4);
                    j9 = j4;
                }
                for (; j9 < ai16.length - 1; j9++)
                {
                    ai16[j9] = zznq1.zzzB();
                    zznq1.zzzy();
                }

                ai16[j9] = zznq1.zzzB();
                zzgS = ai16;
                break;

            case 74: // 'J'
                int j12 = zznq1.zzjn(zznq1.zzzF());
                int k4 = zznq1.getPosition();
                int k9;
                for (k9 = 0; zznq1.zzzK() > 0; k9++)
                {
                    zznq1.zzzB();
                }

                zznq1.zzjp(k4);
                int ai17[];
                if (zzgS == null)
                {
                    k4 = 0;
                } else
                {
                    k4 = zzgS.length;
                }
                ai17 = new int[k9 + k4];
                k9 = k4;
                if (k4 != 0)
                {
                    System.arraycopy(zzgS, 0, ai17, 0, k4);
                    k9 = k4;
                }
                for (; k9 < ai17.length; k9++)
                {
                    ai17[k9] = zznq1.zzzB();
                }

                zzgS = ai17;
                zznq1.zzjo(j12);
                break;

            case 80: // 'P'
                int l9 = zzob.zzb(zznq1, 80);
                int ai18[];
                int l4;
                if (zzgT == null)
                {
                    l4 = 0;
                } else
                {
                    l4 = zzgT.length;
                }
                ai18 = new int[l9 + l4];
                l9 = l4;
                if (l4 != 0)
                {
                    System.arraycopy(zzgT, 0, ai18, 0, l4);
                    l9 = l4;
                }
                for (; l9 < ai18.length - 1; l9++)
                {
                    ai18[l9] = zznq1.zzzB();
                    zznq1.zzzy();
                }

                ai18[l9] = zznq1.zzzB();
                zzgT = ai18;
                break;

            case 82: // 'R'
                int k12 = zznq1.zzjn(zznq1.zzzF());
                int i5 = zznq1.getPosition();
                int i10;
                for (i10 = 0; zznq1.zzzK() > 0; i10++)
                {
                    zznq1.zzzB();
                }

                zznq1.zzjp(i5);
                int ai19[];
                if (zzgT == null)
                {
                    i5 = 0;
                } else
                {
                    i5 = zzgT.length;
                }
                ai19 = new int[i10 + i5];
                i10 = i5;
                if (i5 != 0)
                {
                    System.arraycopy(zzgT, 0, ai19, 0, i5);
                    i10 = i5;
                }
                for (; i10 < ai19.length; i10++)
                {
                    ai19[i10] = zznq1.zzzB();
                }

                zzgT = ai19;
                zznq1.zzjo(k12);
                break;
            }
        } while (true);
    }

    public o zzm()
    {
        zzgK = zzob.zzaNV;
        zzgL = zzob.zzaNV;
        zzgM = zzob.zzaNV;
        zzgN = zzob.zzaNV;
        zzgO = zzob.zzaNV;
        zzgP = zzob.zzaNV;
        zzgQ = zzob.zzaNV;
        zzgR = zzob.zzaNV;
        zzgS = zzob.zzaNV;
        zzgT = zzob.zzaNV;
        zzaNI = null;
        zzaNT = -1;
        return this;
    }

    public ()
    {
        zzm();
    }
}
