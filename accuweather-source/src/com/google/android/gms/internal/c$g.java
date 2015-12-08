// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            mb, c, md, ma, 
//            lz, mi, mf

public static final class m extends mb
{

    private static volatile amY fm[];
    public int fn[];
    public int fo[];
    public int fp[];
    public int fq[];
    public int fr[];
    public int fs[];
    public int ft[];
    public int fu[];
    public int fv[];
    public int fw[];

    public static m[] l()
    {
        if (fm == null)
        {
            synchronized (md.amX)
            {
                if (fm == null)
                {
                    fm = new fm[0];
                }
            }
        }
        return fm;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void a(ma ma1)
        throws IOException
    {
        boolean flag = false;
        if (fn != null && fn.length > 0)
        {
            for (int i = 0; i < fn.length; i++)
            {
                ma1.p(1, fn[i]);
            }

        }
        if (fo != null && fo.length > 0)
        {
            for (int j = 0; j < fo.length; j++)
            {
                ma1.p(2, fo[j]);
            }

        }
        if (fp != null && fp.length > 0)
        {
            for (int k = 0; k < fp.length; k++)
            {
                ma1.p(3, fp[k]);
            }

        }
        if (fq != null && fq.length > 0)
        {
            for (int i1 = 0; i1 < fq.length; i1++)
            {
                ma1.p(4, fq[i1]);
            }

        }
        if (fr != null && fr.length > 0)
        {
            for (int j1 = 0; j1 < fr.length; j1++)
            {
                ma1.p(5, fr[j1]);
            }

        }
        if (fs != null && fs.length > 0)
        {
            for (int k1 = 0; k1 < fs.length; k1++)
            {
                ma1.p(6, fs[k1]);
            }

        }
        if (ft != null && ft.length > 0)
        {
            for (int l1 = 0; l1 < ft.length; l1++)
            {
                ma1.p(7, ft[l1]);
            }

        }
        if (fu != null && fu.length > 0)
        {
            for (int i2 = 0; i2 < fu.length; i2++)
            {
                ma1.p(8, fu[i2]);
            }

        }
        if (fv != null && fv.length > 0)
        {
            for (int j2 = 0; j2 < fv.length; j2++)
            {
                ma1.p(9, fv[j2]);
            }

        }
        if (fw != null && fw.length > 0)
        {
            for (int k2 = ((flag) ? 1 : 0); k2 < fw.length; k2++)
            {
                ma1.p(10, fw[k2]);
            }

        }
        super.a(ma1);
    }

    public mf b(lz lz1)
        throws IOException
    {
        return h(lz1);
    }

    protected int c()
    {
        boolean flag = false;
        int i1 = super.c();
        int j;
        int k;
        if (fn != null && fn.length > 0)
        {
            int i = 0;
            k = 0;
            for (; i < fn.length; i++)
            {
                k += ma.eE(fn[i]);
            }

            k = i1 + k + fn.length * 1;
        } else
        {
            k = i1;
        }
        j = k;
        if (fo != null)
        {
            j = k;
            if (fo.length > 0)
            {
                j = 0;
                i1 = 0;
                for (; j < fo.length; j++)
                {
                    i1 += ma.eE(fo[j]);
                }

                j = k + i1 + fo.length * 1;
            }
        }
        k = j;
        if (fp != null)
        {
            k = j;
            if (fp.length > 0)
            {
                k = 0;
                i1 = 0;
                for (; k < fp.length; k++)
                {
                    i1 += ma.eE(fp[k]);
                }

                k = j + i1 + fp.length * 1;
            }
        }
        j = k;
        if (fq != null)
        {
            j = k;
            if (fq.length > 0)
            {
                j = 0;
                i1 = 0;
                for (; j < fq.length; j++)
                {
                    i1 += ma.eE(fq[j]);
                }

                j = k + i1 + fq.length * 1;
            }
        }
        k = j;
        if (fr != null)
        {
            k = j;
            if (fr.length > 0)
            {
                k = 0;
                i1 = 0;
                for (; k < fr.length; k++)
                {
                    i1 += ma.eE(fr[k]);
                }

                k = j + i1 + fr.length * 1;
            }
        }
        j = k;
        if (fs != null)
        {
            j = k;
            if (fs.length > 0)
            {
                j = 0;
                i1 = 0;
                for (; j < fs.length; j++)
                {
                    i1 += ma.eE(fs[j]);
                }

                j = k + i1 + fs.length * 1;
            }
        }
        k = j;
        if (ft != null)
        {
            k = j;
            if (ft.length > 0)
            {
                k = 0;
                i1 = 0;
                for (; k < ft.length; k++)
                {
                    i1 += ma.eE(ft[k]);
                }

                k = j + i1 + ft.length * 1;
            }
        }
        j = k;
        if (fu != null)
        {
            j = k;
            if (fu.length > 0)
            {
                j = 0;
                i1 = 0;
                for (; j < fu.length; j++)
                {
                    i1 += ma.eE(fu[j]);
                }

                j = k + i1 + fu.length * 1;
            }
        }
        k = j;
        if (fv != null)
        {
            k = j;
            if (fv.length > 0)
            {
                k = 0;
                i1 = 0;
                for (; k < fv.length; k++)
                {
                    i1 += ma.eE(fv[k]);
                }

                k = j + i1 + fv.length * 1;
            }
        }
        j = k;
        if (fw != null)
        {
            j = k;
            if (fw.length > 0)
            {
                i1 = 0;
                for (j = ((flag) ? 1 : 0); j < fw.length; j++)
                {
                    i1 += ma.eE(fw[j]);
                }

                j = k + i1 + fw.length * 1;
            }
        }
        return j;
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
        if (!(obj instanceof fw)) goto _L4; else goto _L3
_L3:
        obj = (fw)obj;
        flag = flag1;
        if (!md.equals(fn, ((fn) (obj)).fn)) goto _L4; else goto _L5
_L5:
        flag = flag1;
        if (!md.equals(fo, ((fo) (obj)).fo)) goto _L4; else goto _L6
_L6:
        flag = flag1;
        if (!md.equals(fp, ((fp) (obj)).fp)) goto _L4; else goto _L7
_L7:
        flag = flag1;
        if (!md.equals(fq, ((fq) (obj)).fq)) goto _L4; else goto _L8
_L8:
        flag = flag1;
        if (!md.equals(fr, ((fr) (obj)).fr)) goto _L4; else goto _L9
_L9:
        flag = flag1;
        if (!md.equals(fs, ((fs) (obj)).fs)) goto _L4; else goto _L10
_L10:
        flag = flag1;
        if (!md.equals(ft, ((ft) (obj)).ft)) goto _L4; else goto _L11
_L11:
        flag = flag1;
        if (!md.equals(fu, ((fu) (obj)).fu)) goto _L4; else goto _L12
_L12:
        flag = flag1;
        if (!md.equals(fv, ((fv) (obj)).fv)) goto _L4; else goto _L13
_L13:
        flag = flag1;
        if (!md.equals(fw, ((fw) (obj)).fw)) goto _L4; else goto _L14
_L14:
        if (amU != null && !amU.isEmpty())
        {
            break MISSING_BLOCK_LABEL_227;
        }
        if (((amU) (obj)).amU == null)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (!((amU) (obj)).amU.isEmpty()) goto _L4; else goto _L15
_L15:
        return true;
        return amU.equals(((amU) (obj)).amU);
    }

    public amU h(lz lz1)
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

            case 8: // '\b'
                int k5 = mi.b(lz1, 8);
                int ai[];
                int j;
                if (fn == null)
                {
                    j = 0;
                } else
                {
                    j = fn.length;
                }
                ai = new int[k5 + j];
                k5 = j;
                if (j != 0)
                {
                    System.arraycopy(fn, 0, ai, 0, j);
                    k5 = j;
                }
                for (; k5 < ai.length - 1; k5++)
                {
                    ai[k5] = lz1.nz();
                    lz1.nw();
                }

                ai[k5] = lz1.nz();
                fn = ai;
                break;

            case 10: // '\n'
                int k10 = lz1.ex(lz1.nD());
                int k = lz1.getPosition();
                int l5;
                for (l5 = 0; lz1.nI() > 0; l5++)
                {
                    lz1.nz();
                }

                lz1.ez(k);
                int ai1[];
                if (fn == null)
                {
                    k = 0;
                } else
                {
                    k = fn.length;
                }
                ai1 = new int[l5 + k];
                l5 = k;
                if (k != 0)
                {
                    System.arraycopy(fn, 0, ai1, 0, k);
                    l5 = k;
                }
                for (; l5 < ai1.length; l5++)
                {
                    ai1[l5] = lz1.nz();
                }

                fn = ai1;
                lz1.ey(k10);
                break;

            case 16: // '\020'
                int i6 = mi.b(lz1, 16);
                int ai2[];
                int i1;
                if (fo == null)
                {
                    i1 = 0;
                } else
                {
                    i1 = fo.length;
                }
                ai2 = new int[i6 + i1];
                i6 = i1;
                if (i1 != 0)
                {
                    System.arraycopy(fo, 0, ai2, 0, i1);
                    i6 = i1;
                }
                for (; i6 < ai2.length - 1; i6++)
                {
                    ai2[i6] = lz1.nz();
                    lz1.nw();
                }

                ai2[i6] = lz1.nz();
                fo = ai2;
                break;

            case 18: // '\022'
                int l10 = lz1.ex(lz1.nD());
                int j1 = lz1.getPosition();
                int j6;
                for (j6 = 0; lz1.nI() > 0; j6++)
                {
                    lz1.nz();
                }

                lz1.ez(j1);
                int ai3[];
                if (fo == null)
                {
                    j1 = 0;
                } else
                {
                    j1 = fo.length;
                }
                ai3 = new int[j6 + j1];
                j6 = j1;
                if (j1 != 0)
                {
                    System.arraycopy(fo, 0, ai3, 0, j1);
                    j6 = j1;
                }
                for (; j6 < ai3.length; j6++)
                {
                    ai3[j6] = lz1.nz();
                }

                fo = ai3;
                lz1.ey(l10);
                break;

            case 24: // '\030'
                int k6 = mi.b(lz1, 24);
                int ai4[];
                int k1;
                if (fp == null)
                {
                    k1 = 0;
                } else
                {
                    k1 = fp.length;
                }
                ai4 = new int[k6 + k1];
                k6 = k1;
                if (k1 != 0)
                {
                    System.arraycopy(fp, 0, ai4, 0, k1);
                    k6 = k1;
                }
                for (; k6 < ai4.length - 1; k6++)
                {
                    ai4[k6] = lz1.nz();
                    lz1.nw();
                }

                ai4[k6] = lz1.nz();
                fp = ai4;
                break;

            case 26: // '\032'
                int i11 = lz1.ex(lz1.nD());
                int l1 = lz1.getPosition();
                int l6;
                for (l6 = 0; lz1.nI() > 0; l6++)
                {
                    lz1.nz();
                }

                lz1.ez(l1);
                int ai5[];
                if (fp == null)
                {
                    l1 = 0;
                } else
                {
                    l1 = fp.length;
                }
                ai5 = new int[l6 + l1];
                l6 = l1;
                if (l1 != 0)
                {
                    System.arraycopy(fp, 0, ai5, 0, l1);
                    l6 = l1;
                }
                for (; l6 < ai5.length; l6++)
                {
                    ai5[l6] = lz1.nz();
                }

                fp = ai5;
                lz1.ey(i11);
                break;

            case 32: // ' '
                int i7 = mi.b(lz1, 32);
                int ai6[];
                int i2;
                if (fq == null)
                {
                    i2 = 0;
                } else
                {
                    i2 = fq.length;
                }
                ai6 = new int[i7 + i2];
                i7 = i2;
                if (i2 != 0)
                {
                    System.arraycopy(fq, 0, ai6, 0, i2);
                    i7 = i2;
                }
                for (; i7 < ai6.length - 1; i7++)
                {
                    ai6[i7] = lz1.nz();
                    lz1.nw();
                }

                ai6[i7] = lz1.nz();
                fq = ai6;
                break;

            case 34: // '"'
                int j11 = lz1.ex(lz1.nD());
                int j2 = lz1.getPosition();
                int j7;
                for (j7 = 0; lz1.nI() > 0; j7++)
                {
                    lz1.nz();
                }

                lz1.ez(j2);
                int ai7[];
                if (fq == null)
                {
                    j2 = 0;
                } else
                {
                    j2 = fq.length;
                }
                ai7 = new int[j7 + j2];
                j7 = j2;
                if (j2 != 0)
                {
                    System.arraycopy(fq, 0, ai7, 0, j2);
                    j7 = j2;
                }
                for (; j7 < ai7.length; j7++)
                {
                    ai7[j7] = lz1.nz();
                }

                fq = ai7;
                lz1.ey(j11);
                break;

            case 40: // '('
                int k7 = mi.b(lz1, 40);
                int ai8[];
                int k2;
                if (fr == null)
                {
                    k2 = 0;
                } else
                {
                    k2 = fr.length;
                }
                ai8 = new int[k7 + k2];
                k7 = k2;
                if (k2 != 0)
                {
                    System.arraycopy(fr, 0, ai8, 0, k2);
                    k7 = k2;
                }
                for (; k7 < ai8.length - 1; k7++)
                {
                    ai8[k7] = lz1.nz();
                    lz1.nw();
                }

                ai8[k7] = lz1.nz();
                fr = ai8;
                break;

            case 42: // '*'
                int k11 = lz1.ex(lz1.nD());
                int l2 = lz1.getPosition();
                int l7;
                for (l7 = 0; lz1.nI() > 0; l7++)
                {
                    lz1.nz();
                }

                lz1.ez(l2);
                int ai9[];
                if (fr == null)
                {
                    l2 = 0;
                } else
                {
                    l2 = fr.length;
                }
                ai9 = new int[l7 + l2];
                l7 = l2;
                if (l2 != 0)
                {
                    System.arraycopy(fr, 0, ai9, 0, l2);
                    l7 = l2;
                }
                for (; l7 < ai9.length; l7++)
                {
                    ai9[l7] = lz1.nz();
                }

                fr = ai9;
                lz1.ey(k11);
                break;

            case 48: // '0'
                int i8 = mi.b(lz1, 48);
                int ai10[];
                int i3;
                if (fs == null)
                {
                    i3 = 0;
                } else
                {
                    i3 = fs.length;
                }
                ai10 = new int[i8 + i3];
                i8 = i3;
                if (i3 != 0)
                {
                    System.arraycopy(fs, 0, ai10, 0, i3);
                    i8 = i3;
                }
                for (; i8 < ai10.length - 1; i8++)
                {
                    ai10[i8] = lz1.nz();
                    lz1.nw();
                }

                ai10[i8] = lz1.nz();
                fs = ai10;
                break;

            case 50: // '2'
                int l11 = lz1.ex(lz1.nD());
                int j3 = lz1.getPosition();
                int j8;
                for (j8 = 0; lz1.nI() > 0; j8++)
                {
                    lz1.nz();
                }

                lz1.ez(j3);
                int ai11[];
                if (fs == null)
                {
                    j3 = 0;
                } else
                {
                    j3 = fs.length;
                }
                ai11 = new int[j8 + j3];
                j8 = j3;
                if (j3 != 0)
                {
                    System.arraycopy(fs, 0, ai11, 0, j3);
                    j8 = j3;
                }
                for (; j8 < ai11.length; j8++)
                {
                    ai11[j8] = lz1.nz();
                }

                fs = ai11;
                lz1.ey(l11);
                break;

            case 56: // '8'
                int k8 = mi.b(lz1, 56);
                int ai12[];
                int k3;
                if (ft == null)
                {
                    k3 = 0;
                } else
                {
                    k3 = ft.length;
                }
                ai12 = new int[k8 + k3];
                k8 = k3;
                if (k3 != 0)
                {
                    System.arraycopy(ft, 0, ai12, 0, k3);
                    k8 = k3;
                }
                for (; k8 < ai12.length - 1; k8++)
                {
                    ai12[k8] = lz1.nz();
                    lz1.nw();
                }

                ai12[k8] = lz1.nz();
                ft = ai12;
                break;

            case 58: // ':'
                int i12 = lz1.ex(lz1.nD());
                int l3 = lz1.getPosition();
                int l8;
                for (l8 = 0; lz1.nI() > 0; l8++)
                {
                    lz1.nz();
                }

                lz1.ez(l3);
                int ai13[];
                if (ft == null)
                {
                    l3 = 0;
                } else
                {
                    l3 = ft.length;
                }
                ai13 = new int[l8 + l3];
                l8 = l3;
                if (l3 != 0)
                {
                    System.arraycopy(ft, 0, ai13, 0, l3);
                    l8 = l3;
                }
                for (; l8 < ai13.length; l8++)
                {
                    ai13[l8] = lz1.nz();
                }

                ft = ai13;
                lz1.ey(i12);
                break;

            case 64: // '@'
                int i9 = mi.b(lz1, 64);
                int ai14[];
                int i4;
                if (fu == null)
                {
                    i4 = 0;
                } else
                {
                    i4 = fu.length;
                }
                ai14 = new int[i9 + i4];
                i9 = i4;
                if (i4 != 0)
                {
                    System.arraycopy(fu, 0, ai14, 0, i4);
                    i9 = i4;
                }
                for (; i9 < ai14.length - 1; i9++)
                {
                    ai14[i9] = lz1.nz();
                    lz1.nw();
                }

                ai14[i9] = lz1.nz();
                fu = ai14;
                break;

            case 66: // 'B'
                int j12 = lz1.ex(lz1.nD());
                int j4 = lz1.getPosition();
                int j9;
                for (j9 = 0; lz1.nI() > 0; j9++)
                {
                    lz1.nz();
                }

                lz1.ez(j4);
                int ai15[];
                if (fu == null)
                {
                    j4 = 0;
                } else
                {
                    j4 = fu.length;
                }
                ai15 = new int[j9 + j4];
                j9 = j4;
                if (j4 != 0)
                {
                    System.arraycopy(fu, 0, ai15, 0, j4);
                    j9 = j4;
                }
                for (; j9 < ai15.length; j9++)
                {
                    ai15[j9] = lz1.nz();
                }

                fu = ai15;
                lz1.ey(j12);
                break;

            case 72: // 'H'
                int k9 = mi.b(lz1, 72);
                int ai16[];
                int k4;
                if (fv == null)
                {
                    k4 = 0;
                } else
                {
                    k4 = fv.length;
                }
                ai16 = new int[k9 + k4];
                k9 = k4;
                if (k4 != 0)
                {
                    System.arraycopy(fv, 0, ai16, 0, k4);
                    k9 = k4;
                }
                for (; k9 < ai16.length - 1; k9++)
                {
                    ai16[k9] = lz1.nz();
                    lz1.nw();
                }

                ai16[k9] = lz1.nz();
                fv = ai16;
                break;

            case 74: // 'J'
                int k12 = lz1.ex(lz1.nD());
                int l4 = lz1.getPosition();
                int l9;
                for (l9 = 0; lz1.nI() > 0; l9++)
                {
                    lz1.nz();
                }

                lz1.ez(l4);
                int ai17[];
                if (fv == null)
                {
                    l4 = 0;
                } else
                {
                    l4 = fv.length;
                }
                ai17 = new int[l9 + l4];
                l9 = l4;
                if (l4 != 0)
                {
                    System.arraycopy(fv, 0, ai17, 0, l4);
                    l9 = l4;
                }
                for (; l9 < ai17.length; l9++)
                {
                    ai17[l9] = lz1.nz();
                }

                fv = ai17;
                lz1.ey(k12);
                break;

            case 80: // 'P'
                int i10 = mi.b(lz1, 80);
                int ai18[];
                int i5;
                if (fw == null)
                {
                    i5 = 0;
                } else
                {
                    i5 = fw.length;
                }
                ai18 = new int[i10 + i5];
                i10 = i5;
                if (i5 != 0)
                {
                    System.arraycopy(fw, 0, ai18, 0, i5);
                    i10 = i5;
                }
                for (; i10 < ai18.length - 1; i10++)
                {
                    ai18[i10] = lz1.nz();
                    lz1.nw();
                }

                ai18[i10] = lz1.nz();
                fw = ai18;
                break;

            case 82: // 'R'
                int l12 = lz1.ex(lz1.nD());
                int j5 = lz1.getPosition();
                int j10;
                for (j10 = 0; lz1.nI() > 0; j10++)
                {
                    lz1.nz();
                }

                lz1.ez(j5);
                int ai19[];
                if (fw == null)
                {
                    j5 = 0;
                } else
                {
                    j5 = fw.length;
                }
                ai19 = new int[j10 + j5];
                j10 = j5;
                if (j5 != 0)
                {
                    System.arraycopy(fw, 0, ai19, 0, j5);
                    j10 = j5;
                }
                for (; j10 < ai19.length; j10++)
                {
                    ai19[j10] = lz1.nz();
                }

                fw = ai19;
                lz1.ey(l12);
                break;
            }
        } while (true);
    }

    public int hashCode()
    {
        int j = md.hashCode(fn);
        int k = md.hashCode(fo);
        int i1 = md.hashCode(fp);
        int j1 = md.hashCode(fq);
        int k1 = md.hashCode(fr);
        int l1 = md.hashCode(fs);
        int i2 = md.hashCode(ft);
        int j2 = md.hashCode(fu);
        int k2 = md.hashCode(fv);
        int l2 = md.hashCode(fw);
        int i;
        if (amU == null || amU.isEmpty())
        {
            i = 0;
        } else
        {
            i = amU.hashCode();
        }
        return i + ((((((((((j + 527) * 31 + k) * 31 + i1) * 31 + j1) * 31 + k1) * 31 + l1) * 31 + i2) * 31 + j2) * 31 + k2) * 31 + l2) * 31;
    }

    public amU m()
    {
        fn = mi.ana;
        fo = mi.ana;
        fp = mi.ana;
        fq = mi.ana;
        fr = mi.ana;
        fs = mi.ana;
        ft = mi.ana;
        fu = mi.ana;
        fv = mi.ana;
        fw = mi.ana;
        amU = null;
        amY = -1;
        return this;
    }

    public ()
    {
        m();
    }
}
