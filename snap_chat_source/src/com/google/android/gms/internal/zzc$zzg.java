// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            zzws, zzc, zzww, zzwr, 
//            zzwq, zzxb, zzwy

public static final class zzm extends zzws
{

    private static volatile zzaHM zzfU[];
    public int zzfV[];
    public int zzfW[];
    public int zzfX[];
    public int zzfY[];
    public int zzfZ[];
    public int zzga[];
    public int zzgb[];
    public int zzgc[];
    public int zzgd[];
    public int zzge[];

    public static zzm[] zzl()
    {
        if (zzfU == null)
        {
            synchronized (zzww.zzaHL)
            {
                if (zzfU == null)
                {
                    zzfU = new zzfU[0];
                }
            }
        }
        return zzfU;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag;
        if (obj == this)
        {
            flag = true;
        } else
        {
            flag = flag1;
            if (obj instanceof zzfU)
            {
                obj = (zzfU)obj;
                flag = flag1;
                if (zzww.equals(zzfV, ((zzfV) (obj)).zzfV))
                {
                    flag = flag1;
                    if (zzww.equals(zzfW, ((zzfW) (obj)).zzfW))
                    {
                        flag = flag1;
                        if (zzww.equals(zzfX, ((zzfX) (obj)).zzfX))
                        {
                            flag = flag1;
                            if (zzww.equals(zzfY, ((zzfY) (obj)).zzfY))
                            {
                                flag = flag1;
                                if (zzww.equals(zzfZ, ((zzfZ) (obj)).zzfZ))
                                {
                                    flag = flag1;
                                    if (zzww.equals(zzga, ((zzga) (obj)).zzga))
                                    {
                                        flag = flag1;
                                        if (zzww.equals(zzgb, ((zzgb) (obj)).zzgb))
                                        {
                                            flag = flag1;
                                            if (zzww.equals(zzgc, ((zzgc) (obj)).zzgc))
                                            {
                                                flag = flag1;
                                                if (zzww.equals(zzgd, ((zzgd) (obj)).zzgd))
                                                {
                                                    flag = flag1;
                                                    if (zzww.equals(zzge, ((zzge) (obj)).zzge))
                                                    {
                                                        return zza(((zzws) (obj)));
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

    public final int hashCode()
    {
        return ((((((((((zzww.hashCode(zzfV) + 527) * 31 + zzww.hashCode(zzfW)) * 31 + zzww.hashCode(zzfX)) * 31 + zzww.hashCode(zzfY)) * 31 + zzww.hashCode(zzfZ)) * 31 + zzww.hashCode(zzga)) * 31 + zzww.hashCode(zzgb)) * 31 + zzww.hashCode(zzgc)) * 31 + zzww.hashCode(zzgd)) * 31 + zzww.hashCode(zzge)) * 31 + zzvL();
    }

    public final void zza(zzwr zzwr1)
    {
        boolean flag = false;
        if (zzfV != null && zzfV.length > 0)
        {
            for (int i = 0; i < zzfV.length; i++)
            {
                zzwr1.zzy(1, zzfV[i]);
            }

        }
        if (zzfW != null && zzfW.length > 0)
        {
            for (int j = 0; j < zzfW.length; j++)
            {
                zzwr1.zzy(2, zzfW[j]);
            }

        }
        if (zzfX != null && zzfX.length > 0)
        {
            for (int k = 0; k < zzfX.length; k++)
            {
                zzwr1.zzy(3, zzfX[k]);
            }

        }
        if (zzfY != null && zzfY.length > 0)
        {
            for (int l = 0; l < zzfY.length; l++)
            {
                zzwr1.zzy(4, zzfY[l]);
            }

        }
        if (zzfZ != null && zzfZ.length > 0)
        {
            for (int i1 = 0; i1 < zzfZ.length; i1++)
            {
                zzwr1.zzy(5, zzfZ[i1]);
            }

        }
        if (zzga != null && zzga.length > 0)
        {
            for (int j1 = 0; j1 < zzga.length; j1++)
            {
                zzwr1.zzy(6, zzga[j1]);
            }

        }
        if (zzgb != null && zzgb.length > 0)
        {
            for (int k1 = 0; k1 < zzgb.length; k1++)
            {
                zzwr1.zzy(7, zzgb[k1]);
            }

        }
        if (zzgc != null && zzgc.length > 0)
        {
            for (int l1 = 0; l1 < zzgc.length; l1++)
            {
                zzwr1.zzy(8, zzgc[l1]);
            }

        }
        if (zzgd != null && zzgd.length > 0)
        {
            for (int i2 = 0; i2 < zzgd.length; i2++)
            {
                zzwr1.zzy(9, zzgd[i2]);
            }

        }
        if (zzge != null && zzge.length > 0)
        {
            for (int j2 = ((flag) ? 1 : 0); j2 < zzge.length; j2++)
            {
                zzwr1.zzy(10, zzge[j2]);
            }

        }
        super.zza(zzwr1);
    }

    public final zzwy zzb(zzwq zzwq1)
    {
        return zzh(zzwq1);
    }

    protected final int zzc()
    {
        boolean flag = false;
        int l = super.zzc();
        int j;
        int k;
        if (zzfV != null && zzfV.length > 0)
        {
            int i = 0;
            k = 0;
            for (; i < zzfV.length; i++)
            {
                k += zzwr.zziw(zzfV[i]);
            }

            k = l + k + zzfV.length * 1;
        } else
        {
            k = l;
        }
        j = k;
        if (zzfW != null)
        {
            j = k;
            if (zzfW.length > 0)
            {
                j = 0;
                l = 0;
                for (; j < zzfW.length; j++)
                {
                    l += zzwr.zziw(zzfW[j]);
                }

                j = k + l + zzfW.length * 1;
            }
        }
        k = j;
        if (zzfX != null)
        {
            k = j;
            if (zzfX.length > 0)
            {
                k = 0;
                l = 0;
                for (; k < zzfX.length; k++)
                {
                    l += zzwr.zziw(zzfX[k]);
                }

                k = j + l + zzfX.length * 1;
            }
        }
        j = k;
        if (zzfY != null)
        {
            j = k;
            if (zzfY.length > 0)
            {
                j = 0;
                l = 0;
                for (; j < zzfY.length; j++)
                {
                    l += zzwr.zziw(zzfY[j]);
                }

                j = k + l + zzfY.length * 1;
            }
        }
        k = j;
        if (zzfZ != null)
        {
            k = j;
            if (zzfZ.length > 0)
            {
                k = 0;
                l = 0;
                for (; k < zzfZ.length; k++)
                {
                    l += zzwr.zziw(zzfZ[k]);
                }

                k = j + l + zzfZ.length * 1;
            }
        }
        j = k;
        if (zzga != null)
        {
            j = k;
            if (zzga.length > 0)
            {
                j = 0;
                l = 0;
                for (; j < zzga.length; j++)
                {
                    l += zzwr.zziw(zzga[j]);
                }

                j = k + l + zzga.length * 1;
            }
        }
        k = j;
        if (zzgb != null)
        {
            k = j;
            if (zzgb.length > 0)
            {
                k = 0;
                l = 0;
                for (; k < zzgb.length; k++)
                {
                    l += zzwr.zziw(zzgb[k]);
                }

                k = j + l + zzgb.length * 1;
            }
        }
        j = k;
        if (zzgc != null)
        {
            j = k;
            if (zzgc.length > 0)
            {
                j = 0;
                l = 0;
                for (; j < zzgc.length; j++)
                {
                    l += zzwr.zziw(zzgc[j]);
                }

                j = k + l + zzgc.length * 1;
            }
        }
        k = j;
        if (zzgd != null)
        {
            k = j;
            if (zzgd.length > 0)
            {
                k = 0;
                l = 0;
                for (; k < zzgd.length; k++)
                {
                    l += zzwr.zziw(zzgd[k]);
                }

                k = j + l + zzgd.length * 1;
            }
        }
        j = k;
        if (zzge != null)
        {
            j = k;
            if (zzge.length > 0)
            {
                l = 0;
                for (j = ((flag) ? 1 : 0); j < zzge.length; j++)
                {
                    l += zzwr.zziw(zzge[j]);
                }

                j = k + l + zzge.length * 1;
            }
        }
        return j;
    }

    public final zzge zzh(zzwq zzwq1)
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

            case 8: // '\b'
                int j5 = zzxb.zzc(zzwq1, 8);
                int ai[];
                int j;
                if (zzfV == null)
                {
                    j = 0;
                } else
                {
                    j = zzfV.length;
                }
                ai = new int[j5 + j];
                j5 = j;
                if (j != 0)
                {
                    System.arraycopy(zzfV, 0, ai, 0, j);
                    j5 = j;
                }
                for (; j5 < ai.length - 1; j5++)
                {
                    ai[j5] = zzwq1.zzvx();
                    zzwq1.zzvu();
                }

                ai[j5] = zzwq1.zzvx();
                zzfV = ai;
                break;

            case 10: // '\n'
                int j10 = zzwq1.zzip(zzwq1.zzvB());
                int k = zzwq1.getPosition();
                int k5;
                for (k5 = 0; zzwq1.zzvG() > 0; k5++)
                {
                    zzwq1.zzvx();
                }

                zzwq1.zzir(k);
                int ai1[];
                if (zzfV == null)
                {
                    k = 0;
                } else
                {
                    k = zzfV.length;
                }
                ai1 = new int[k5 + k];
                k5 = k;
                if (k != 0)
                {
                    System.arraycopy(zzfV, 0, ai1, 0, k);
                    k5 = k;
                }
                for (; k5 < ai1.length; k5++)
                {
                    ai1[k5] = zzwq1.zzvx();
                }

                zzfV = ai1;
                zzwq1.zziq(j10);
                break;

            case 16: // '\020'
                int l5 = zzxb.zzc(zzwq1, 16);
                int ai2[];
                int l;
                if (zzfW == null)
                {
                    l = 0;
                } else
                {
                    l = zzfW.length;
                }
                ai2 = new int[l5 + l];
                l5 = l;
                if (l != 0)
                {
                    System.arraycopy(zzfW, 0, ai2, 0, l);
                    l5 = l;
                }
                for (; l5 < ai2.length - 1; l5++)
                {
                    ai2[l5] = zzwq1.zzvx();
                    zzwq1.zzvu();
                }

                ai2[l5] = zzwq1.zzvx();
                zzfW = ai2;
                break;

            case 18: // '\022'
                int k10 = zzwq1.zzip(zzwq1.zzvB());
                int i1 = zzwq1.getPosition();
                int i6;
                for (i6 = 0; zzwq1.zzvG() > 0; i6++)
                {
                    zzwq1.zzvx();
                }

                zzwq1.zzir(i1);
                int ai3[];
                if (zzfW == null)
                {
                    i1 = 0;
                } else
                {
                    i1 = zzfW.length;
                }
                ai3 = new int[i6 + i1];
                i6 = i1;
                if (i1 != 0)
                {
                    System.arraycopy(zzfW, 0, ai3, 0, i1);
                    i6 = i1;
                }
                for (; i6 < ai3.length; i6++)
                {
                    ai3[i6] = zzwq1.zzvx();
                }

                zzfW = ai3;
                zzwq1.zziq(k10);
                break;

            case 24: // '\030'
                int j6 = zzxb.zzc(zzwq1, 24);
                int ai4[];
                int j1;
                if (zzfX == null)
                {
                    j1 = 0;
                } else
                {
                    j1 = zzfX.length;
                }
                ai4 = new int[j6 + j1];
                j6 = j1;
                if (j1 != 0)
                {
                    System.arraycopy(zzfX, 0, ai4, 0, j1);
                    j6 = j1;
                }
                for (; j6 < ai4.length - 1; j6++)
                {
                    ai4[j6] = zzwq1.zzvx();
                    zzwq1.zzvu();
                }

                ai4[j6] = zzwq1.zzvx();
                zzfX = ai4;
                break;

            case 26: // '\032'
                int l10 = zzwq1.zzip(zzwq1.zzvB());
                int k1 = zzwq1.getPosition();
                int k6;
                for (k6 = 0; zzwq1.zzvG() > 0; k6++)
                {
                    zzwq1.zzvx();
                }

                zzwq1.zzir(k1);
                int ai5[];
                if (zzfX == null)
                {
                    k1 = 0;
                } else
                {
                    k1 = zzfX.length;
                }
                ai5 = new int[k6 + k1];
                k6 = k1;
                if (k1 != 0)
                {
                    System.arraycopy(zzfX, 0, ai5, 0, k1);
                    k6 = k1;
                }
                for (; k6 < ai5.length; k6++)
                {
                    ai5[k6] = zzwq1.zzvx();
                }

                zzfX = ai5;
                zzwq1.zziq(l10);
                break;

            case 32: // ' '
                int l6 = zzxb.zzc(zzwq1, 32);
                int ai6[];
                int l1;
                if (zzfY == null)
                {
                    l1 = 0;
                } else
                {
                    l1 = zzfY.length;
                }
                ai6 = new int[l6 + l1];
                l6 = l1;
                if (l1 != 0)
                {
                    System.arraycopy(zzfY, 0, ai6, 0, l1);
                    l6 = l1;
                }
                for (; l6 < ai6.length - 1; l6++)
                {
                    ai6[l6] = zzwq1.zzvx();
                    zzwq1.zzvu();
                }

                ai6[l6] = zzwq1.zzvx();
                zzfY = ai6;
                break;

            case 34: // '"'
                int i11 = zzwq1.zzip(zzwq1.zzvB());
                int i2 = zzwq1.getPosition();
                int i7;
                for (i7 = 0; zzwq1.zzvG() > 0; i7++)
                {
                    zzwq1.zzvx();
                }

                zzwq1.zzir(i2);
                int ai7[];
                if (zzfY == null)
                {
                    i2 = 0;
                } else
                {
                    i2 = zzfY.length;
                }
                ai7 = new int[i7 + i2];
                i7 = i2;
                if (i2 != 0)
                {
                    System.arraycopy(zzfY, 0, ai7, 0, i2);
                    i7 = i2;
                }
                for (; i7 < ai7.length; i7++)
                {
                    ai7[i7] = zzwq1.zzvx();
                }

                zzfY = ai7;
                zzwq1.zziq(i11);
                break;

            case 40: // '('
                int j7 = zzxb.zzc(zzwq1, 40);
                int ai8[];
                int j2;
                if (zzfZ == null)
                {
                    j2 = 0;
                } else
                {
                    j2 = zzfZ.length;
                }
                ai8 = new int[j7 + j2];
                j7 = j2;
                if (j2 != 0)
                {
                    System.arraycopy(zzfZ, 0, ai8, 0, j2);
                    j7 = j2;
                }
                for (; j7 < ai8.length - 1; j7++)
                {
                    ai8[j7] = zzwq1.zzvx();
                    zzwq1.zzvu();
                }

                ai8[j7] = zzwq1.zzvx();
                zzfZ = ai8;
                break;

            case 42: // '*'
                int j11 = zzwq1.zzip(zzwq1.zzvB());
                int k2 = zzwq1.getPosition();
                int k7;
                for (k7 = 0; zzwq1.zzvG() > 0; k7++)
                {
                    zzwq1.zzvx();
                }

                zzwq1.zzir(k2);
                int ai9[];
                if (zzfZ == null)
                {
                    k2 = 0;
                } else
                {
                    k2 = zzfZ.length;
                }
                ai9 = new int[k7 + k2];
                k7 = k2;
                if (k2 != 0)
                {
                    System.arraycopy(zzfZ, 0, ai9, 0, k2);
                    k7 = k2;
                }
                for (; k7 < ai9.length; k7++)
                {
                    ai9[k7] = zzwq1.zzvx();
                }

                zzfZ = ai9;
                zzwq1.zziq(j11);
                break;

            case 48: // '0'
                int l7 = zzxb.zzc(zzwq1, 48);
                int ai10[];
                int l2;
                if (zzga == null)
                {
                    l2 = 0;
                } else
                {
                    l2 = zzga.length;
                }
                ai10 = new int[l7 + l2];
                l7 = l2;
                if (l2 != 0)
                {
                    System.arraycopy(zzga, 0, ai10, 0, l2);
                    l7 = l2;
                }
                for (; l7 < ai10.length - 1; l7++)
                {
                    ai10[l7] = zzwq1.zzvx();
                    zzwq1.zzvu();
                }

                ai10[l7] = zzwq1.zzvx();
                zzga = ai10;
                break;

            case 50: // '2'
                int k11 = zzwq1.zzip(zzwq1.zzvB());
                int i3 = zzwq1.getPosition();
                int i8;
                for (i8 = 0; zzwq1.zzvG() > 0; i8++)
                {
                    zzwq1.zzvx();
                }

                zzwq1.zzir(i3);
                int ai11[];
                if (zzga == null)
                {
                    i3 = 0;
                } else
                {
                    i3 = zzga.length;
                }
                ai11 = new int[i8 + i3];
                i8 = i3;
                if (i3 != 0)
                {
                    System.arraycopy(zzga, 0, ai11, 0, i3);
                    i8 = i3;
                }
                for (; i8 < ai11.length; i8++)
                {
                    ai11[i8] = zzwq1.zzvx();
                }

                zzga = ai11;
                zzwq1.zziq(k11);
                break;

            case 56: // '8'
                int j8 = zzxb.zzc(zzwq1, 56);
                int ai12[];
                int j3;
                if (zzgb == null)
                {
                    j3 = 0;
                } else
                {
                    j3 = zzgb.length;
                }
                ai12 = new int[j8 + j3];
                j8 = j3;
                if (j3 != 0)
                {
                    System.arraycopy(zzgb, 0, ai12, 0, j3);
                    j8 = j3;
                }
                for (; j8 < ai12.length - 1; j8++)
                {
                    ai12[j8] = zzwq1.zzvx();
                    zzwq1.zzvu();
                }

                ai12[j8] = zzwq1.zzvx();
                zzgb = ai12;
                break;

            case 58: // ':'
                int l11 = zzwq1.zzip(zzwq1.zzvB());
                int k3 = zzwq1.getPosition();
                int k8;
                for (k8 = 0; zzwq1.zzvG() > 0; k8++)
                {
                    zzwq1.zzvx();
                }

                zzwq1.zzir(k3);
                int ai13[];
                if (zzgb == null)
                {
                    k3 = 0;
                } else
                {
                    k3 = zzgb.length;
                }
                ai13 = new int[k8 + k3];
                k8 = k3;
                if (k3 != 0)
                {
                    System.arraycopy(zzgb, 0, ai13, 0, k3);
                    k8 = k3;
                }
                for (; k8 < ai13.length; k8++)
                {
                    ai13[k8] = zzwq1.zzvx();
                }

                zzgb = ai13;
                zzwq1.zziq(l11);
                break;

            case 64: // '@'
                int l8 = zzxb.zzc(zzwq1, 64);
                int ai14[];
                int l3;
                if (zzgc == null)
                {
                    l3 = 0;
                } else
                {
                    l3 = zzgc.length;
                }
                ai14 = new int[l8 + l3];
                l8 = l3;
                if (l3 != 0)
                {
                    System.arraycopy(zzgc, 0, ai14, 0, l3);
                    l8 = l3;
                }
                for (; l8 < ai14.length - 1; l8++)
                {
                    ai14[l8] = zzwq1.zzvx();
                    zzwq1.zzvu();
                }

                ai14[l8] = zzwq1.zzvx();
                zzgc = ai14;
                break;

            case 66: // 'B'
                int i12 = zzwq1.zzip(zzwq1.zzvB());
                int i4 = zzwq1.getPosition();
                int i9;
                for (i9 = 0; zzwq1.zzvG() > 0; i9++)
                {
                    zzwq1.zzvx();
                }

                zzwq1.zzir(i4);
                int ai15[];
                if (zzgc == null)
                {
                    i4 = 0;
                } else
                {
                    i4 = zzgc.length;
                }
                ai15 = new int[i9 + i4];
                i9 = i4;
                if (i4 != 0)
                {
                    System.arraycopy(zzgc, 0, ai15, 0, i4);
                    i9 = i4;
                }
                for (; i9 < ai15.length; i9++)
                {
                    ai15[i9] = zzwq1.zzvx();
                }

                zzgc = ai15;
                zzwq1.zziq(i12);
                break;

            case 72: // 'H'
                int j9 = zzxb.zzc(zzwq1, 72);
                int ai16[];
                int j4;
                if (zzgd == null)
                {
                    j4 = 0;
                } else
                {
                    j4 = zzgd.length;
                }
                ai16 = new int[j9 + j4];
                j9 = j4;
                if (j4 != 0)
                {
                    System.arraycopy(zzgd, 0, ai16, 0, j4);
                    j9 = j4;
                }
                for (; j9 < ai16.length - 1; j9++)
                {
                    ai16[j9] = zzwq1.zzvx();
                    zzwq1.zzvu();
                }

                ai16[j9] = zzwq1.zzvx();
                zzgd = ai16;
                break;

            case 74: // 'J'
                int j12 = zzwq1.zzip(zzwq1.zzvB());
                int k4 = zzwq1.getPosition();
                int k9;
                for (k9 = 0; zzwq1.zzvG() > 0; k9++)
                {
                    zzwq1.zzvx();
                }

                zzwq1.zzir(k4);
                int ai17[];
                if (zzgd == null)
                {
                    k4 = 0;
                } else
                {
                    k4 = zzgd.length;
                }
                ai17 = new int[k9 + k4];
                k9 = k4;
                if (k4 != 0)
                {
                    System.arraycopy(zzgd, 0, ai17, 0, k4);
                    k9 = k4;
                }
                for (; k9 < ai17.length; k9++)
                {
                    ai17[k9] = zzwq1.zzvx();
                }

                zzgd = ai17;
                zzwq1.zziq(j12);
                break;

            case 80: // 'P'
                int l9 = zzxb.zzc(zzwq1, 80);
                int ai18[];
                int l4;
                if (zzge == null)
                {
                    l4 = 0;
                } else
                {
                    l4 = zzge.length;
                }
                ai18 = new int[l9 + l4];
                l9 = l4;
                if (l4 != 0)
                {
                    System.arraycopy(zzge, 0, ai18, 0, l4);
                    l9 = l4;
                }
                for (; l9 < ai18.length - 1; l9++)
                {
                    ai18[l9] = zzwq1.zzvx();
                    zzwq1.zzvu();
                }

                ai18[l9] = zzwq1.zzvx();
                zzge = ai18;
                break;

            case 82: // 'R'
                int k12 = zzwq1.zzip(zzwq1.zzvB());
                int i5 = zzwq1.getPosition();
                int i10;
                for (i10 = 0; zzwq1.zzvG() > 0; i10++)
                {
                    zzwq1.zzvx();
                }

                zzwq1.zzir(i5);
                int ai19[];
                if (zzge == null)
                {
                    i5 = 0;
                } else
                {
                    i5 = zzge.length;
                }
                ai19 = new int[i10 + i5];
                i10 = i5;
                if (i5 != 0)
                {
                    System.arraycopy(zzge, 0, ai19, 0, i5);
                    i10 = i5;
                }
                for (; i10 < ai19.length; i10++)
                {
                    ai19[i10] = zzwq1.zzvx();
                }

                zzge = ai19;
                zzwq1.zziq(k12);
                break;
            }
        } while (true);
    }

    public final q zzm()
    {
        zzfV = zzxb.zzaHO;
        zzfW = zzxb.zzaHO;
        zzfX = zzxb.zzaHO;
        zzfY = zzxb.zzaHO;
        zzfZ = zzxb.zzaHO;
        zzga = zzxb.zzaHO;
        zzgb = zzxb.zzaHO;
        zzgc = zzxb.zzaHO;
        zzgd = zzxb.zzaHO;
        zzge = zzxb.zzaHO;
        zzaHB = null;
        zzaHM = -1;
        return this;
    }

    public ()
    {
        zzm();
    }
}
