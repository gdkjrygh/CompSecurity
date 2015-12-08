// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            ma, c, md, me, 
//            lz, mc, ly, mh

public static final class k extends ma
{

    public String eV[];
    public String eW[];
    public anb eX[];
    public anb eY[];
    public anb eZ[];
    public anb fa[];
    public anb fb[];
    public anb fc[];
    public String fd;
    public String fe;
    public String ff;
    public String fg;
    public anb fh;
    public float fi;
    public boolean fj;
    public String fk[];
    public int fl;

    public static k a(byte abyte0[])
        throws md
    {
        return (k)me.a(new <init>(), abyte0);
    }

    public void a(lz lz1)
        throws IOException
    {
        boolean flag = false;
        if (eW != null && eW.length > 0)
        {
            for (int i = 0; i < eW.length; i++)
            {
                String s = eW[i];
                if (s != null)
                {
                    lz1.b(1, s);
                }
            }

        }
        if (eX != null && eX.length > 0)
        {
            for (int j = 0; j < eX.length; j++)
            {
                <init> <init>1 = eX[j];
                if (<init>1 != null)
                {
                    lz1.a(2, <init>1);
                }
            }

        }
        if (eY != null && eY.length > 0)
        {
            for (int l = 0; l < eY.length; l++)
            {
                <init> <init>2 = eY[l];
                if (<init>2 != null)
                {
                    lz1.a(3, <init>2);
                }
            }

        }
        if (eZ != null && eZ.length > 0)
        {
            for (int i1 = 0; i1 < eZ.length; i1++)
            {
                <init> <init>3 = eZ[i1];
                if (<init>3 != null)
                {
                    lz1.a(4, <init>3);
                }
            }

        }
        if (fa != null && fa.length > 0)
        {
            for (int j1 = 0; j1 < fa.length; j1++)
            {
                <init> <init>4 = fa[j1];
                if (<init>4 != null)
                {
                    lz1.a(5, <init>4);
                }
            }

        }
        if (fb != null && fb.length > 0)
        {
            for (int k1 = 0; k1 < fb.length; k1++)
            {
                <init> <init>5 = fb[k1];
                if (<init>5 != null)
                {
                    lz1.a(6, <init>5);
                }
            }

        }
        if (fc != null && fc.length > 0)
        {
            for (int l1 = 0; l1 < fc.length; l1++)
            {
                <init> <init>6 = fc[l1];
                if (<init>6 != null)
                {
                    lz1.a(7, <init>6);
                }
            }

        }
        if (!fd.equals(""))
        {
            lz1.b(9, fd);
        }
        if (!fe.equals(""))
        {
            lz1.b(10, fe);
        }
        if (!ff.equals("0"))
        {
            lz1.b(12, ff);
        }
        if (!fg.equals(""))
        {
            lz1.b(13, fg);
        }
        if (fh != null)
        {
            lz1.a(14, fh);
        }
        if (Float.floatToIntBits(fi) != Float.floatToIntBits(0.0F))
        {
            lz1.b(15, fi);
        }
        if (fk != null && fk.length > 0)
        {
            for (int i2 = 0; i2 < fk.length; i2++)
            {
                String s1 = fk[i2];
                if (s1 != null)
                {
                    lz1.b(16, s1);
                }
            }

        }
        if (fl != 0)
        {
            lz1.p(17, fl);
        }
        if (fj)
        {
            lz1.a(18, fj);
        }
        if (eV != null && eV.length > 0)
        {
            for (int j2 = ((flag) ? 1 : 0); j2 < eV.length; j2++)
            {
                String s2 = eV[j2];
                if (s2 != null)
                {
                    lz1.b(19, s2);
                }
            }

        }
        super.a(lz1);
    }

    public me b(ly ly1)
        throws IOException
    {
        return g(ly1);
    }

    protected int c()
    {
        boolean flag = false;
        int l4 = super.c();
        int j;
        int l;
        int l2;
        if (eW != null && eW.length > 0)
        {
            int i = 0;
            l = 0;
            int i1;
            int j3;
            for (i1 = 0; i < eW.length; i1 = j3)
            {
                String s = eW[i];
                int i4 = l;
                j3 = i1;
                if (s != null)
                {
                    j3 = i1 + 1;
                    i4 = l + lz.cz(s);
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
        if (eX != null)
        {
            j = l;
            if (eX.length > 0)
            {
                j = l;
                for (l = 0; l < eX.length;)
                {
                    g g1 = eX[l];
                    int j1 = j;
                    if (g1 != null)
                    {
                        j1 = j + lz.b(2, g1);
                    }
                    l++;
                    j = j1;
                }

            }
        }
        l = j;
        if (eY != null)
        {
            l = j;
            if (eY.length > 0)
            {
                for (l = 0; l < eY.length;)
                {
                    g g2 = eY[l];
                    int k1 = j;
                    if (g2 != null)
                    {
                        k1 = j + lz.b(3, g2);
                    }
                    l++;
                    j = k1;
                }

                l = j;
            }
        }
        j = l;
        if (eZ != null)
        {
            j = l;
            if (eZ.length > 0)
            {
                j = l;
                for (l = 0; l < eZ.length;)
                {
                    g g3 = eZ[l];
                    int l1 = j;
                    if (g3 != null)
                    {
                        l1 = j + lz.b(4, g3);
                    }
                    l++;
                    j = l1;
                }

            }
        }
        l = j;
        if (fa != null)
        {
            l = j;
            if (fa.length > 0)
            {
                for (l = 0; l < fa.length;)
                {
                    g g4 = fa[l];
                    int i2 = j;
                    if (g4 != null)
                    {
                        i2 = j + lz.b(5, g4);
                    }
                    l++;
                    j = i2;
                }

                l = j;
            }
        }
        j = l;
        if (fb != null)
        {
            j = l;
            if (fb.length > 0)
            {
                j = l;
                for (l = 0; l < fb.length;)
                {
                    g g5 = fb[l];
                    int j2 = j;
                    if (g5 != null)
                    {
                        j2 = j + lz.b(6, g5);
                    }
                    l++;
                    j = j2;
                }

            }
        }
        l = j;
        if (fc != null)
        {
            l = j;
            if (fc.length > 0)
            {
                for (l = 0; l < fc.length;)
                {
                    g g6 = fc[l];
                    int k2 = j;
                    if (g6 != null)
                    {
                        k2 = j + lz.b(7, g6);
                    }
                    l++;
                    j = k2;
                }

                l = j;
            }
        }
        j = l;
        if (!fd.equals(""))
        {
            j = l + lz.h(9, fd);
        }
        l = j;
        if (!fe.equals(""))
        {
            l = j + lz.h(10, fe);
        }
        j = l;
        if (!ff.equals("0"))
        {
            j = l + lz.h(12, ff);
        }
        l = j;
        if (!fg.equals(""))
        {
            l = j + lz.h(13, fg);
        }
        l2 = l;
        if (fh != null)
        {
            l2 = l + lz.b(14, fh);
        }
        j = l2;
        if (Float.floatToIntBits(fi) != Float.floatToIntBits(0.0F))
        {
            j = l2 + lz.c(15, fi);
        }
        l = j;
        if (fk != null)
        {
            l = j;
            if (fk.length > 0)
            {
                l = 0;
                l2 = 0;
                int k3;
                int j4;
                for (k3 = 0; l < fk.length; k3 = j4)
                {
                    String s1 = fk[l];
                    l4 = l2;
                    j4 = k3;
                    if (s1 != null)
                    {
                        j4 = k3 + 1;
                        l4 = l2 + lz.cz(s1);
                    }
                    l++;
                    l2 = l4;
                }

                l = j + l2 + k3 * 2;
            }
        }
        l2 = l;
        if (fl != 0)
        {
            l2 = l + lz.r(17, fl);
        }
        j = l2;
        if (fj)
        {
            j = l2 + lz.b(18, fj);
        }
        l = j;
        if (eV != null)
        {
            l = j;
            if (eV.length > 0)
            {
                int i3 = 0;
                int l3 = 0;
                for (l = ((flag) ? 1 : 0); l < eV.length;)
                {
                    String s2 = eV[l];
                    l4 = i3;
                    int k4 = l3;
                    if (s2 != null)
                    {
                        k4 = l3 + 1;
                        l4 = i3 + lz.cz(s2);
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
        if (!(obj instanceof z)) goto _L4; else goto _L3
_L3:
        obj = (z)obj;
        flag = flag1;
        if (!mc.equals(eV, ((eV) (obj)).eV)) goto _L4; else goto _L5
_L5:
        flag = flag1;
        if (!mc.equals(eW, ((eW) (obj)).eW)) goto _L4; else goto _L6
_L6:
        flag = flag1;
        if (!mc.equals(eX, ((eX) (obj)).eX)) goto _L4; else goto _L7
_L7:
        flag = flag1;
        if (!mc.equals(eY, ((eY) (obj)).eY)) goto _L4; else goto _L8
_L8:
        flag = flag1;
        if (!mc.equals(eZ, ((eZ) (obj)).eZ)) goto _L4; else goto _L9
_L9:
        flag = flag1;
        if (!mc.equals(fa, ((fa) (obj)).fa)) goto _L4; else goto _L10
_L10:
        flag = flag1;
        if (!mc.equals(fb, ((fb) (obj)).fb)) goto _L4; else goto _L11
_L11:
        flag = flag1;
        if (!mc.equals(fc, ((fc) (obj)).fc)) goto _L4; else goto _L12
_L12:
        if (fd != null) goto _L14; else goto _L13
_L13:
        flag = flag1;
        if (((fd) (obj)).fd != null) goto _L4; else goto _L15
_L15:
        if (fe != null) goto _L17; else goto _L16
_L16:
        flag = flag1;
        if (((fe) (obj)).fe != null) goto _L4; else goto _L18
_L18:
        if (ff != null) goto _L20; else goto _L19
_L19:
        flag = flag1;
        if (((ff) (obj)).ff != null) goto _L4; else goto _L21
_L21:
        if (fg != null) goto _L23; else goto _L22
_L22:
        flag = flag1;
        if (((fg) (obj)).fg != null) goto _L4; else goto _L24
_L24:
        if (fh != null) goto _L26; else goto _L25
_L25:
        flag = flag1;
        if (((fh) (obj)).fh != null) goto _L4; else goto _L27
_L27:
        flag = flag1;
        if (Float.floatToIntBits(fi) != Float.floatToIntBits(((fi) (obj)).fi)) goto _L4; else goto _L28
_L28:
        flag = flag1;
        if (fj != ((fj) (obj)).fj) goto _L4; else goto _L29
_L29:
        flag = flag1;
        if (!mc.equals(fk, ((fk) (obj)).fk)) goto _L4; else goto _L30
_L30:
        flag = flag1;
        if (fl != ((fl) (obj)).fl) goto _L4; else goto _L31
_L31:
        if (amX != null && !amX.isEmpty())
        {
            break MISSING_BLOCK_LABEL_416;
        }
        if (((amX) (obj)).amX == null)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (!((amX) (obj)).amX.isEmpty()) goto _L4; else goto _L32
_L32:
        return true;
_L14:
        if (!fd.equals(((fd) (obj)).fd))
        {
            return false;
        }
          goto _L15
_L17:
        if (!fe.equals(((fe) (obj)).fe))
        {
            return false;
        }
          goto _L18
_L20:
        if (!ff.equals(((ff) (obj)).ff))
        {
            return false;
        }
          goto _L21
_L23:
        if (!fg.equals(((fg) (obj)).fg))
        {
            return false;
        }
          goto _L24
_L26:
        if (!fh.equals(((equals) (obj)).fh))
        {
            return false;
        }
          goto _L27
        return amX.equals(((amX) (obj)).amX);
          goto _L15
    }

    public amX g(ly ly1)
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
                int l2 = mh.b(ly1, 10);
                String as[];
                int j;
                if (eW == null)
                {
                    j = 0;
                } else
                {
                    j = eW.length;
                }
                as = new String[l2 + j];
                l2 = j;
                if (j != 0)
                {
                    System.arraycopy(eW, 0, as, 0, j);
                    l2 = j;
                }
                for (; l2 < as.length - 1; l2++)
                {
                    as[l2] = ly1.readString();
                    ly1.nB();
                }

                as[l2] = ly1.readString();
                eW = as;
                break;

            case 18: // '\022'
                int i3 = mh.b(ly1, 18);
                amX aamx[];
                int l;
                if (eX == null)
                {
                    l = 0;
                } else
                {
                    l = eX.length;
                }
                aamx = new eX[i3 + l];
                i3 = l;
                if (l != 0)
                {
                    System.arraycopy(eX, 0, aamx, 0, l);
                    i3 = l;
                }
                for (; i3 < aamx.length - 1; i3++)
                {
                    aamx[i3] = new <init>();
                    ly1.a(aamx[i3]);
                    ly1.nB();
                }

                aamx[i3] = new <init>();
                ly1.a(aamx[i3]);
                eX = aamx;
                break;

            case 26: // '\032'
                int j3 = mh.b(ly1, 26);
                amX aamx1[];
                int i1;
                if (eY == null)
                {
                    i1 = 0;
                } else
                {
                    i1 = eY.length;
                }
                aamx1 = new eY[j3 + i1];
                j3 = i1;
                if (i1 != 0)
                {
                    System.arraycopy(eY, 0, aamx1, 0, i1);
                    j3 = i1;
                }
                for (; j3 < aamx1.length - 1; j3++)
                {
                    aamx1[j3] = new <init>();
                    ly1.a(aamx1[j3]);
                    ly1.nB();
                }

                aamx1[j3] = new <init>();
                ly1.a(aamx1[j3]);
                eY = aamx1;
                break;

            case 34: // '"'
                int k3 = mh.b(ly1, 34);
                amX aamx2[];
                int j1;
                if (eZ == null)
                {
                    j1 = 0;
                } else
                {
                    j1 = eZ.length;
                }
                aamx2 = new eZ[k3 + j1];
                k3 = j1;
                if (j1 != 0)
                {
                    System.arraycopy(eZ, 0, aamx2, 0, j1);
                    k3 = j1;
                }
                for (; k3 < aamx2.length - 1; k3++)
                {
                    aamx2[k3] = new <init>();
                    ly1.a(aamx2[k3]);
                    ly1.nB();
                }

                aamx2[k3] = new <init>();
                ly1.a(aamx2[k3]);
                eZ = aamx2;
                break;

            case 42: // '*'
                int l3 = mh.b(ly1, 42);
                amX aamx3[];
                int k1;
                if (fa == null)
                {
                    k1 = 0;
                } else
                {
                    k1 = fa.length;
                }
                aamx3 = new fa[l3 + k1];
                l3 = k1;
                if (k1 != 0)
                {
                    System.arraycopy(fa, 0, aamx3, 0, k1);
                    l3 = k1;
                }
                for (; l3 < aamx3.length - 1; l3++)
                {
                    aamx3[l3] = new <init>();
                    ly1.a(aamx3[l3]);
                    ly1.nB();
                }

                aamx3[l3] = new <init>();
                ly1.a(aamx3[l3]);
                fa = aamx3;
                break;

            case 50: // '2'
                int i4 = mh.b(ly1, 50);
                amX aamx4[];
                int l1;
                if (fb == null)
                {
                    l1 = 0;
                } else
                {
                    l1 = fb.length;
                }
                aamx4 = new fb[i4 + l1];
                i4 = l1;
                if (l1 != 0)
                {
                    System.arraycopy(fb, 0, aamx4, 0, l1);
                    i4 = l1;
                }
                for (; i4 < aamx4.length - 1; i4++)
                {
                    aamx4[i4] = new <init>();
                    ly1.a(aamx4[i4]);
                    ly1.nB();
                }

                aamx4[i4] = new <init>();
                ly1.a(aamx4[i4]);
                fb = aamx4;
                break;

            case 58: // ':'
                int j4 = mh.b(ly1, 58);
                amX aamx5[];
                int i2;
                if (fc == null)
                {
                    i2 = 0;
                } else
                {
                    i2 = fc.length;
                }
                aamx5 = new fc[j4 + i2];
                j4 = i2;
                if (i2 != 0)
                {
                    System.arraycopy(fc, 0, aamx5, 0, i2);
                    j4 = i2;
                }
                for (; j4 < aamx5.length - 1; j4++)
                {
                    aamx5[j4] = new <init>();
                    ly1.a(aamx5[j4]);
                    ly1.nB();
                }

                aamx5[j4] = new <init>();
                ly1.a(aamx5[j4]);
                fc = aamx5;
                break;

            case 74: // 'J'
                fd = ly1.readString();
                break;

            case 82: // 'R'
                fe = ly1.readString();
                break;

            case 98: // 'b'
                ff = ly1.readString();
                break;

            case 106: // 'j'
                fg = ly1.readString();
                break;

            case 114: // 'r'
                if (fh == null)
                {
                    fh = new <init>();
                }
                ly1.a(fh);
                break;

            case 125: // '}'
                fi = ly1.readFloat();
                break;

            case 130: 
                int k4 = mh.b(ly1, 130);
                String as1[];
                int j2;
                if (fk == null)
                {
                    j2 = 0;
                } else
                {
                    j2 = fk.length;
                }
                as1 = new String[k4 + j2];
                k4 = j2;
                if (j2 != 0)
                {
                    System.arraycopy(fk, 0, as1, 0, j2);
                    k4 = j2;
                }
                for (; k4 < as1.length - 1; k4++)
                {
                    as1[k4] = ly1.readString();
                    ly1.nB();
                }

                as1[k4] = ly1.readString();
                fk = as1;
                break;

            case 136: 
                fl = ly1.nE();
                break;

            case 144: 
                fj = ly1.nF();
                break;

            case 154: 
                int l4 = mh.b(ly1, 154);
                String as2[];
                int k2;
                if (eV == null)
                {
                    k2 = 0;
                } else
                {
                    k2 = eV.length;
                }
                as2 = new String[l4 + k2];
                l4 = k2;
                if (k2 != 0)
                {
                    System.arraycopy(eV, 0, as2, 0, k2);
                    l4 = k2;
                }
                for (; l4 < as2.length - 1; l4++)
                {
                    as2[l4] = ly1.readString();
                    ly1.nB();
                }

                as2[l4] = ly1.readString();
                eV = as2;
                break;
            }
        } while (true);
    }

    public int hashCode()
    {
        boolean flag = false;
        int l1 = mc.hashCode(eV);
        int i2 = mc.hashCode(eW);
        int j2 = mc.hashCode(eX);
        int k2 = mc.hashCode(eY);
        int l2 = mc.hashCode(eZ);
        int i3 = mc.hashCode(fa);
        int j3 = mc.hashCode(fb);
        int k3 = mc.hashCode(fc);
        int i;
        int j;
        int l;
        int i1;
        int j1;
        char c1;
        int k1;
        int l3;
        int i4;
        int j4;
        if (fd == null)
        {
            i = 0;
        } else
        {
            i = fd.hashCode();
        }
        if (fe == null)
        {
            j = 0;
        } else
        {
            j = fe.hashCode();
        }
        if (ff == null)
        {
            l = 0;
        } else
        {
            l = ff.hashCode();
        }
        if (fg == null)
        {
            i1 = 0;
        } else
        {
            i1 = fg.hashCode();
        }
        if (fh == null)
        {
            j1 = 0;
        } else
        {
            j1 = fh.hashCode();
        }
        l3 = Float.floatToIntBits(fi);
        if (fj)
        {
            c1 = '\u04CF';
        } else
        {
            c1 = '\u04D5';
        }
        i4 = mc.hashCode(fk);
        j4 = fl;
        k1 = ((flag) ? 1 : 0);
        if (amX != null)
        {
            if (amX.isEmpty())
            {
                k1 = ((flag) ? 1 : 0);
            } else
            {
                k1 = amX.hashCode();
            }
        }
        return (((c1 + ((j1 + (i1 + (l + (j + (i + ((((((((l1 + 527) * 31 + i2) * 31 + j2) * 31 + k2) * 31 + l2) * 31 + i3) * 31 + j3) * 31 + k3) * 31) * 31) * 31) * 31) * 31) * 31 + l3) * 31) * 31 + i4) * 31 + j4) * 31 + k1;
    }

    public amX k()
    {
        eV = mh.ani;
        eW = mh.ani;
        eX = r();
        eY = i();
        eZ = d();
        fa = d();
        fb = d();
        fc = l();
        fd = "";
        fe = "";
        ff = "0";
        fg = "";
        fh = null;
        fi = 0.0F;
        fj = false;
        fk = mh.ani;
        fl = 0;
        amX = null;
        anb = -1;
        return this;
    }

    public ()
    {
        k();
    }
}
