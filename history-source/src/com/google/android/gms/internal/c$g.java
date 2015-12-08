// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            qq, c, qu, qp, 
//            qo, qz, qw

public static final class m extends qq
{

    private static volatile azh fU[];
    public int fV[];
    public int fW[];
    public int fX[];
    public int fY[];
    public int fZ[];
    public int ga[];
    public int gb[];
    public int gc[];
    public int gd[];
    public int ge[];

    public static m[] l()
    {
        if (fU == null)
        {
            synchronized (qu.azg)
            {
                if (fU == null)
                {
                    fU = new fU[0];
                }
            }
        }
        return fU;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void a(qp qp1)
        throws IOException
    {
        boolean flag = false;
        if (fV != null && fV.length > 0)
        {
            for (int i = 0; i < fV.length; i++)
            {
                qp1.t(1, fV[i]);
            }

        }
        if (fW != null && fW.length > 0)
        {
            for (int j = 0; j < fW.length; j++)
            {
                qp1.t(2, fW[j]);
            }

        }
        if (fX != null && fX.length > 0)
        {
            for (int k = 0; k < fX.length; k++)
            {
                qp1.t(3, fX[k]);
            }

        }
        if (fY != null && fY.length > 0)
        {
            for (int i1 = 0; i1 < fY.length; i1++)
            {
                qp1.t(4, fY[i1]);
            }

        }
        if (fZ != null && fZ.length > 0)
        {
            for (int j1 = 0; j1 < fZ.length; j1++)
            {
                qp1.t(5, fZ[j1]);
            }

        }
        if (ga != null && ga.length > 0)
        {
            for (int k1 = 0; k1 < ga.length; k1++)
            {
                qp1.t(6, ga[k1]);
            }

        }
        if (gb != null && gb.length > 0)
        {
            for (int l1 = 0; l1 < gb.length; l1++)
            {
                qp1.t(7, gb[l1]);
            }

        }
        if (gc != null && gc.length > 0)
        {
            for (int i2 = 0; i2 < gc.length; i2++)
            {
                qp1.t(8, gc[i2]);
            }

        }
        if (gd != null && gd.length > 0)
        {
            for (int j2 = 0; j2 < gd.length; j2++)
            {
                qp1.t(9, gd[j2]);
            }

        }
        if (ge != null && ge.length > 0)
        {
            for (int k2 = ((flag) ? 1 : 0); k2 < ge.length; k2++)
            {
                qp1.t(10, ge[k2]);
            }

        }
        super.a(qp1);
    }

    public qw b(qo qo1)
        throws IOException
    {
        return h(qo1);
    }

    protected int c()
    {
        boolean flag = false;
        int i1 = super.c();
        int j;
        int k;
        if (fV != null && fV.length > 0)
        {
            int i = 0;
            k = 0;
            for (; i < fV.length; i++)
            {
                k += qp.gZ(fV[i]);
            }

            k = i1 + k + fV.length * 1;
        } else
        {
            k = i1;
        }
        j = k;
        if (fW != null)
        {
            j = k;
            if (fW.length > 0)
            {
                j = 0;
                i1 = 0;
                for (; j < fW.length; j++)
                {
                    i1 += qp.gZ(fW[j]);
                }

                j = k + i1 + fW.length * 1;
            }
        }
        k = j;
        if (fX != null)
        {
            k = j;
            if (fX.length > 0)
            {
                k = 0;
                i1 = 0;
                for (; k < fX.length; k++)
                {
                    i1 += qp.gZ(fX[k]);
                }

                k = j + i1 + fX.length * 1;
            }
        }
        j = k;
        if (fY != null)
        {
            j = k;
            if (fY.length > 0)
            {
                j = 0;
                i1 = 0;
                for (; j < fY.length; j++)
                {
                    i1 += qp.gZ(fY[j]);
                }

                j = k + i1 + fY.length * 1;
            }
        }
        k = j;
        if (fZ != null)
        {
            k = j;
            if (fZ.length > 0)
            {
                k = 0;
                i1 = 0;
                for (; k < fZ.length; k++)
                {
                    i1 += qp.gZ(fZ[k]);
                }

                k = j + i1 + fZ.length * 1;
            }
        }
        j = k;
        if (ga != null)
        {
            j = k;
            if (ga.length > 0)
            {
                j = 0;
                i1 = 0;
                for (; j < ga.length; j++)
                {
                    i1 += qp.gZ(ga[j]);
                }

                j = k + i1 + ga.length * 1;
            }
        }
        k = j;
        if (gb != null)
        {
            k = j;
            if (gb.length > 0)
            {
                k = 0;
                i1 = 0;
                for (; k < gb.length; k++)
                {
                    i1 += qp.gZ(gb[k]);
                }

                k = j + i1 + gb.length * 1;
            }
        }
        j = k;
        if (gc != null)
        {
            j = k;
            if (gc.length > 0)
            {
                j = 0;
                i1 = 0;
                for (; j < gc.length; j++)
                {
                    i1 += qp.gZ(gc[j]);
                }

                j = k + i1 + gc.length * 1;
            }
        }
        k = j;
        if (gd != null)
        {
            k = j;
            if (gd.length > 0)
            {
                k = 0;
                i1 = 0;
                for (; k < gd.length; k++)
                {
                    i1 += qp.gZ(gd[k]);
                }

                k = j + i1 + gd.length * 1;
            }
        }
        j = k;
        if (ge != null)
        {
            j = k;
            if (ge.length > 0)
            {
                i1 = 0;
                for (j = ((flag) ? 1 : 0); j < ge.length; j++)
                {
                    i1 += qp.gZ(ge[j]);
                }

                j = k + i1 + ge.length * 1;
            }
        }
        return j;
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
            if (obj instanceof ge)
            {
                obj = (ge)obj;
                flag = flag1;
                if (qu.equals(fV, ((fV) (obj)).fV))
                {
                    flag = flag1;
                    if (qu.equals(fW, ((fW) (obj)).fW))
                    {
                        flag = flag1;
                        if (qu.equals(fX, ((fX) (obj)).fX))
                        {
                            flag = flag1;
                            if (qu.equals(fY, ((fY) (obj)).fY))
                            {
                                flag = flag1;
                                if (qu.equals(fZ, ((fZ) (obj)).fZ))
                                {
                                    flag = flag1;
                                    if (qu.equals(ga, ((ga) (obj)).ga))
                                    {
                                        flag = flag1;
                                        if (qu.equals(gb, ((gb) (obj)).gb))
                                        {
                                            flag = flag1;
                                            if (qu.equals(gc, ((gc) (obj)).gc))
                                            {
                                                flag = flag1;
                                                if (qu.equals(gd, ((gd) (obj)).gd))
                                                {
                                                    flag = flag1;
                                                    if (qu.equals(ge, ((ge) (obj)).ge))
                                                    {
                                                        return a(((qq) (obj)));
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

    public a h(qo qo1)
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

            case 8: // '\b'
                int k5 = qz.b(qo1, 8);
                int ai[];
                int j;
                if (fV == null)
                {
                    j = 0;
                } else
                {
                    j = fV.length;
                }
                ai = new int[k5 + j];
                k5 = j;
                if (j != 0)
                {
                    System.arraycopy(fV, 0, ai, 0, j);
                    k5 = j;
                }
                for (; k5 < ai.length - 1; k5++)
                {
                    ai[k5] = qo1.rC();
                    qo1.rz();
                }

                ai[k5] = qo1.rC();
                fV = ai;
                break;

            case 10: // '\n'
                int k10 = qo1.gS(qo1.rG());
                int k = qo1.getPosition();
                int l5;
                for (l5 = 0; qo1.rL() > 0; l5++)
                {
                    qo1.rC();
                }

                qo1.gU(k);
                int ai1[];
                if (fV == null)
                {
                    k = 0;
                } else
                {
                    k = fV.length;
                }
                ai1 = new int[l5 + k];
                l5 = k;
                if (k != 0)
                {
                    System.arraycopy(fV, 0, ai1, 0, k);
                    l5 = k;
                }
                for (; l5 < ai1.length; l5++)
                {
                    ai1[l5] = qo1.rC();
                }

                fV = ai1;
                qo1.gT(k10);
                break;

            case 16: // '\020'
                int i6 = qz.b(qo1, 16);
                int ai2[];
                int i1;
                if (fW == null)
                {
                    i1 = 0;
                } else
                {
                    i1 = fW.length;
                }
                ai2 = new int[i6 + i1];
                i6 = i1;
                if (i1 != 0)
                {
                    System.arraycopy(fW, 0, ai2, 0, i1);
                    i6 = i1;
                }
                for (; i6 < ai2.length - 1; i6++)
                {
                    ai2[i6] = qo1.rC();
                    qo1.rz();
                }

                ai2[i6] = qo1.rC();
                fW = ai2;
                break;

            case 18: // '\022'
                int l10 = qo1.gS(qo1.rG());
                int j1 = qo1.getPosition();
                int j6;
                for (j6 = 0; qo1.rL() > 0; j6++)
                {
                    qo1.rC();
                }

                qo1.gU(j1);
                int ai3[];
                if (fW == null)
                {
                    j1 = 0;
                } else
                {
                    j1 = fW.length;
                }
                ai3 = new int[j6 + j1];
                j6 = j1;
                if (j1 != 0)
                {
                    System.arraycopy(fW, 0, ai3, 0, j1);
                    j6 = j1;
                }
                for (; j6 < ai3.length; j6++)
                {
                    ai3[j6] = qo1.rC();
                }

                fW = ai3;
                qo1.gT(l10);
                break;

            case 24: // '\030'
                int k6 = qz.b(qo1, 24);
                int ai4[];
                int k1;
                if (fX == null)
                {
                    k1 = 0;
                } else
                {
                    k1 = fX.length;
                }
                ai4 = new int[k6 + k1];
                k6 = k1;
                if (k1 != 0)
                {
                    System.arraycopy(fX, 0, ai4, 0, k1);
                    k6 = k1;
                }
                for (; k6 < ai4.length - 1; k6++)
                {
                    ai4[k6] = qo1.rC();
                    qo1.rz();
                }

                ai4[k6] = qo1.rC();
                fX = ai4;
                break;

            case 26: // '\032'
                int i11 = qo1.gS(qo1.rG());
                int l1 = qo1.getPosition();
                int l6;
                for (l6 = 0; qo1.rL() > 0; l6++)
                {
                    qo1.rC();
                }

                qo1.gU(l1);
                int ai5[];
                if (fX == null)
                {
                    l1 = 0;
                } else
                {
                    l1 = fX.length;
                }
                ai5 = new int[l6 + l1];
                l6 = l1;
                if (l1 != 0)
                {
                    System.arraycopy(fX, 0, ai5, 0, l1);
                    l6 = l1;
                }
                for (; l6 < ai5.length; l6++)
                {
                    ai5[l6] = qo1.rC();
                }

                fX = ai5;
                qo1.gT(i11);
                break;

            case 32: // ' '
                int i7 = qz.b(qo1, 32);
                int ai6[];
                int i2;
                if (fY == null)
                {
                    i2 = 0;
                } else
                {
                    i2 = fY.length;
                }
                ai6 = new int[i7 + i2];
                i7 = i2;
                if (i2 != 0)
                {
                    System.arraycopy(fY, 0, ai6, 0, i2);
                    i7 = i2;
                }
                for (; i7 < ai6.length - 1; i7++)
                {
                    ai6[i7] = qo1.rC();
                    qo1.rz();
                }

                ai6[i7] = qo1.rC();
                fY = ai6;
                break;

            case 34: // '"'
                int j11 = qo1.gS(qo1.rG());
                int j2 = qo1.getPosition();
                int j7;
                for (j7 = 0; qo1.rL() > 0; j7++)
                {
                    qo1.rC();
                }

                qo1.gU(j2);
                int ai7[];
                if (fY == null)
                {
                    j2 = 0;
                } else
                {
                    j2 = fY.length;
                }
                ai7 = new int[j7 + j2];
                j7 = j2;
                if (j2 != 0)
                {
                    System.arraycopy(fY, 0, ai7, 0, j2);
                    j7 = j2;
                }
                for (; j7 < ai7.length; j7++)
                {
                    ai7[j7] = qo1.rC();
                }

                fY = ai7;
                qo1.gT(j11);
                break;

            case 40: // '('
                int k7 = qz.b(qo1, 40);
                int ai8[];
                int k2;
                if (fZ == null)
                {
                    k2 = 0;
                } else
                {
                    k2 = fZ.length;
                }
                ai8 = new int[k7 + k2];
                k7 = k2;
                if (k2 != 0)
                {
                    System.arraycopy(fZ, 0, ai8, 0, k2);
                    k7 = k2;
                }
                for (; k7 < ai8.length - 1; k7++)
                {
                    ai8[k7] = qo1.rC();
                    qo1.rz();
                }

                ai8[k7] = qo1.rC();
                fZ = ai8;
                break;

            case 42: // '*'
                int k11 = qo1.gS(qo1.rG());
                int l2 = qo1.getPosition();
                int l7;
                for (l7 = 0; qo1.rL() > 0; l7++)
                {
                    qo1.rC();
                }

                qo1.gU(l2);
                int ai9[];
                if (fZ == null)
                {
                    l2 = 0;
                } else
                {
                    l2 = fZ.length;
                }
                ai9 = new int[l7 + l2];
                l7 = l2;
                if (l2 != 0)
                {
                    System.arraycopy(fZ, 0, ai9, 0, l2);
                    l7 = l2;
                }
                for (; l7 < ai9.length; l7++)
                {
                    ai9[l7] = qo1.rC();
                }

                fZ = ai9;
                qo1.gT(k11);
                break;

            case 48: // '0'
                int i8 = qz.b(qo1, 48);
                int ai10[];
                int i3;
                if (ga == null)
                {
                    i3 = 0;
                } else
                {
                    i3 = ga.length;
                }
                ai10 = new int[i8 + i3];
                i8 = i3;
                if (i3 != 0)
                {
                    System.arraycopy(ga, 0, ai10, 0, i3);
                    i8 = i3;
                }
                for (; i8 < ai10.length - 1; i8++)
                {
                    ai10[i8] = qo1.rC();
                    qo1.rz();
                }

                ai10[i8] = qo1.rC();
                ga = ai10;
                break;

            case 50: // '2'
                int l11 = qo1.gS(qo1.rG());
                int j3 = qo1.getPosition();
                int j8;
                for (j8 = 0; qo1.rL() > 0; j8++)
                {
                    qo1.rC();
                }

                qo1.gU(j3);
                int ai11[];
                if (ga == null)
                {
                    j3 = 0;
                } else
                {
                    j3 = ga.length;
                }
                ai11 = new int[j8 + j3];
                j8 = j3;
                if (j3 != 0)
                {
                    System.arraycopy(ga, 0, ai11, 0, j3);
                    j8 = j3;
                }
                for (; j8 < ai11.length; j8++)
                {
                    ai11[j8] = qo1.rC();
                }

                ga = ai11;
                qo1.gT(l11);
                break;

            case 56: // '8'
                int k8 = qz.b(qo1, 56);
                int ai12[];
                int k3;
                if (gb == null)
                {
                    k3 = 0;
                } else
                {
                    k3 = gb.length;
                }
                ai12 = new int[k8 + k3];
                k8 = k3;
                if (k3 != 0)
                {
                    System.arraycopy(gb, 0, ai12, 0, k3);
                    k8 = k3;
                }
                for (; k8 < ai12.length - 1; k8++)
                {
                    ai12[k8] = qo1.rC();
                    qo1.rz();
                }

                ai12[k8] = qo1.rC();
                gb = ai12;
                break;

            case 58: // ':'
                int i12 = qo1.gS(qo1.rG());
                int l3 = qo1.getPosition();
                int l8;
                for (l8 = 0; qo1.rL() > 0; l8++)
                {
                    qo1.rC();
                }

                qo1.gU(l3);
                int ai13[];
                if (gb == null)
                {
                    l3 = 0;
                } else
                {
                    l3 = gb.length;
                }
                ai13 = new int[l8 + l3];
                l8 = l3;
                if (l3 != 0)
                {
                    System.arraycopy(gb, 0, ai13, 0, l3);
                    l8 = l3;
                }
                for (; l8 < ai13.length; l8++)
                {
                    ai13[l8] = qo1.rC();
                }

                gb = ai13;
                qo1.gT(i12);
                break;

            case 64: // '@'
                int i9 = qz.b(qo1, 64);
                int ai14[];
                int i4;
                if (gc == null)
                {
                    i4 = 0;
                } else
                {
                    i4 = gc.length;
                }
                ai14 = new int[i9 + i4];
                i9 = i4;
                if (i4 != 0)
                {
                    System.arraycopy(gc, 0, ai14, 0, i4);
                    i9 = i4;
                }
                for (; i9 < ai14.length - 1; i9++)
                {
                    ai14[i9] = qo1.rC();
                    qo1.rz();
                }

                ai14[i9] = qo1.rC();
                gc = ai14;
                break;

            case 66: // 'B'
                int j12 = qo1.gS(qo1.rG());
                int j4 = qo1.getPosition();
                int j9;
                for (j9 = 0; qo1.rL() > 0; j9++)
                {
                    qo1.rC();
                }

                qo1.gU(j4);
                int ai15[];
                if (gc == null)
                {
                    j4 = 0;
                } else
                {
                    j4 = gc.length;
                }
                ai15 = new int[j9 + j4];
                j9 = j4;
                if (j4 != 0)
                {
                    System.arraycopy(gc, 0, ai15, 0, j4);
                    j9 = j4;
                }
                for (; j9 < ai15.length; j9++)
                {
                    ai15[j9] = qo1.rC();
                }

                gc = ai15;
                qo1.gT(j12);
                break;

            case 72: // 'H'
                int k9 = qz.b(qo1, 72);
                int ai16[];
                int k4;
                if (gd == null)
                {
                    k4 = 0;
                } else
                {
                    k4 = gd.length;
                }
                ai16 = new int[k9 + k4];
                k9 = k4;
                if (k4 != 0)
                {
                    System.arraycopy(gd, 0, ai16, 0, k4);
                    k9 = k4;
                }
                for (; k9 < ai16.length - 1; k9++)
                {
                    ai16[k9] = qo1.rC();
                    qo1.rz();
                }

                ai16[k9] = qo1.rC();
                gd = ai16;
                break;

            case 74: // 'J'
                int k12 = qo1.gS(qo1.rG());
                int l4 = qo1.getPosition();
                int l9;
                for (l9 = 0; qo1.rL() > 0; l9++)
                {
                    qo1.rC();
                }

                qo1.gU(l4);
                int ai17[];
                if (gd == null)
                {
                    l4 = 0;
                } else
                {
                    l4 = gd.length;
                }
                ai17 = new int[l9 + l4];
                l9 = l4;
                if (l4 != 0)
                {
                    System.arraycopy(gd, 0, ai17, 0, l4);
                    l9 = l4;
                }
                for (; l9 < ai17.length; l9++)
                {
                    ai17[l9] = qo1.rC();
                }

                gd = ai17;
                qo1.gT(k12);
                break;

            case 80: // 'P'
                int i10 = qz.b(qo1, 80);
                int ai18[];
                int i5;
                if (ge == null)
                {
                    i5 = 0;
                } else
                {
                    i5 = ge.length;
                }
                ai18 = new int[i10 + i5];
                i10 = i5;
                if (i5 != 0)
                {
                    System.arraycopy(ge, 0, ai18, 0, i5);
                    i10 = i5;
                }
                for (; i10 < ai18.length - 1; i10++)
                {
                    ai18[i10] = qo1.rC();
                    qo1.rz();
                }

                ai18[i10] = qo1.rC();
                ge = ai18;
                break;

            case 82: // 'R'
                int l12 = qo1.gS(qo1.rG());
                int j5 = qo1.getPosition();
                int j10;
                for (j10 = 0; qo1.rL() > 0; j10++)
                {
                    qo1.rC();
                }

                qo1.gU(j5);
                int ai19[];
                if (ge == null)
                {
                    j5 = 0;
                } else
                {
                    j5 = ge.length;
                }
                ai19 = new int[j10 + j5];
                j10 = j5;
                if (j5 != 0)
                {
                    System.arraycopy(ge, 0, ai19, 0, j5);
                    j10 = j5;
                }
                for (; j10 < ai19.length; j10++)
                {
                    ai19[j10] = qo1.rC();
                }

                ge = ai19;
                qo1.gT(l12);
                break;
            }
        } while (true);
    }

    public int hashCode()
    {
        return ((((((((((qu.hashCode(fV) + 527) * 31 + qu.hashCode(fW)) * 31 + qu.hashCode(fX)) * 31 + qu.hashCode(fY)) * 31 + qu.hashCode(fZ)) * 31 + qu.hashCode(ga)) * 31 + qu.hashCode(gb)) * 31 + qu.hashCode(gc)) * 31 + qu.hashCode(gd)) * 31 + qu.hashCode(ge)) * 31 + rQ();
    }

    public rQ m()
    {
        fV = qz.azj;
        fW = qz.azj;
        fX = qz.azj;
        fY = qz.azj;
        fZ = qz.azj;
        ga = qz.azj;
        gb = qz.azj;
        gc = qz.azj;
        gd = qz.azj;
        ge = qz.azj;
        ayW = null;
        azh = -1;
        return this;
    }

    public ()
    {
        m();
    }
}
