// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.internal:
//            ph, pr, pg, pq, 
//            pl, pf, pn

public static final class qL extends ph
{

    public long axj;
    public int axk;
    public int axl;
    public boolean axm;
    public adString axn[];
    public adString axo;
    public byte axp[];
    public byte axq[];
    public byte axr[];
    public adString axs;
    public String axt;
    public String tag;

    public void a(pg pg1)
        throws IOException
    {
        if (axj != 0L)
        {
            pg1.b(1, axj);
        }
        if (!tag.equals(""))
        {
            pg1.b(2, tag);
        }
        if (axn != null && axn.length > 0)
        {
            for (int i = 0; i < axn.length; i++)
            {
                qL ql = axn[i];
                if (ql != null)
                {
                    pg1.a(3, ql);
                }
            }

        }
        if (!Arrays.equals(axp, pq.axd))
        {
            pg1.a(6, axp);
        }
        if (axs != null)
        {
            pg1.a(7, axs);
        }
        if (!Arrays.equals(axq, pq.axd))
        {
            pg1.a(8, axq);
        }
        if (axo != null)
        {
            pg1.a(9, axo);
        }
        if (axm)
        {
            pg1.b(10, axm);
        }
        if (axk != 0)
        {
            pg1.s(11, axk);
        }
        if (axl != 0)
        {
            pg1.s(12, axl);
        }
        if (!Arrays.equals(axr, pq.axd))
        {
            pg1.a(13, axr);
        }
        if (!axt.equals(""))
        {
            pg1.b(14, axt);
        }
        super.a(pg1);
    }

    public pn b(pf pf1)
        throws IOException
    {
        return x(pf1);
    }

    protected int c()
    {
        int i = super.c();
        int j = i;
        if (axj != 0L)
        {
            j = i + pg.d(1, axj);
        }
        i = j;
        if (!tag.equals(""))
        {
            i = j + pg.j(2, tag);
        }
        j = i;
        if (axn != null)
        {
            j = i;
            if (axn.length > 0)
            {
                for (j = 0; j < axn.length;)
                {
                    x x1 = axn[j];
                    int k = i;
                    if (x1 != null)
                    {
                        k = i + pg.c(3, x1);
                    }
                    j++;
                    i = k;
                }

                j = i;
            }
        }
        i = j;
        if (!Arrays.equals(axp, pq.axd))
        {
            i = j + pg.b(6, axp);
        }
        j = i;
        if (axs != null)
        {
            j = i + pg.c(7, axs);
        }
        i = j;
        if (!Arrays.equals(axq, pq.axd))
        {
            i = j + pg.b(8, axq);
        }
        j = i;
        if (axo != null)
        {
            j = i + pg.c(9, axo);
        }
        i = j;
        if (axm)
        {
            i = j + pg.c(10, axm);
        }
        j = i;
        if (axk != 0)
        {
            j = i + pg.u(11, axk);
        }
        i = j;
        if (axl != 0)
        {
            i = j + pg.u(12, axl);
        }
        j = i;
        if (!Arrays.equals(axr, pq.axd))
        {
            j = i + pg.b(13, axr);
        }
        i = j;
        if (!axt.equals(""))
        {
            i = j + pg.j(14, axt);
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
        if (!(obj instanceof axt)) goto _L4; else goto _L3
_L3:
        obj = (axt)obj;
        flag = flag1;
        if (axj != ((axj) (obj)).axj) goto _L4; else goto _L5
_L5:
        if (tag != null) goto _L7; else goto _L6
_L6:
        flag = flag1;
        if (((tag) (obj)).tag != null) goto _L4; else goto _L8
_L8:
        flag = flag1;
        if (axk != ((axk) (obj)).axk) goto _L4; else goto _L9
_L9:
        flag = flag1;
        if (axl != ((axl) (obj)).axl) goto _L4; else goto _L10
_L10:
        flag = flag1;
        if (axm != ((axm) (obj)).axm) goto _L4; else goto _L11
_L11:
        flag = flag1;
        if (!pl.equals(axn, ((axn) (obj)).axn)) goto _L4; else goto _L12
_L12:
        if (axo != null) goto _L14; else goto _L13
_L13:
        flag = flag1;
        if (((axo) (obj)).axo != null) goto _L4; else goto _L15
_L15:
        flag = flag1;
        if (!Arrays.equals(axp, ((axp) (obj)).axp)) goto _L4; else goto _L16
_L16:
        flag = flag1;
        if (!Arrays.equals(axq, ((axq) (obj)).axq)) goto _L4; else goto _L17
_L17:
        flag = flag1;
        if (!Arrays.equals(axr, ((axr) (obj)).axr)) goto _L4; else goto _L18
_L18:
        if (axs != null) goto _L20; else goto _L19
_L19:
        flag = flag1;
        if (((axs) (obj)).axs != null) goto _L4; else goto _L21
_L21:
        if (axt != null)
        {
            break MISSING_BLOCK_LABEL_260;
        }
        flag = flag1;
        if (((axt) (obj)).axt != null) goto _L4; else goto _L22
_L22:
        return a(((ph) (obj)));
_L7:
        if (!tag.equals(((tag) (obj)).tag))
        {
            return false;
        }
          goto _L8
_L14:
        if (!axo.equals(((equals) (obj)).axo))
        {
            return false;
        }
          goto _L15
_L20:
        if (!axs.equals(((equals) (obj)).axs))
        {
            return false;
        }
          goto _L21
        if (!axt.equals(((axt) (obj)).axt))
        {
            return false;
        }
          goto _L22
    }

    public int hashCode()
    {
        int l = 0;
        int i1 = (int)(axj ^ axj >>> 32);
        int i;
        char c1;
        int j;
        int k;
        int j1;
        int k1;
        int l1;
        int i2;
        int j2;
        int k2;
        if (tag == null)
        {
            i = 0;
        } else
        {
            i = tag.hashCode();
        }
        j1 = axk;
        k1 = axl;
        if (axm)
        {
            c1 = '\u04CF';
        } else
        {
            c1 = '\u04D5';
        }
        l1 = pl.hashCode(axn);
        if (axo == null)
        {
            j = 0;
        } else
        {
            j = axo.hashCode();
        }
        i2 = Arrays.hashCode(axp);
        j2 = Arrays.hashCode(axq);
        k2 = Arrays.hashCode(axr);
        if (axs == null)
        {
            k = 0;
        } else
        {
            k = axs.hashCode();
        }
        if (axt != null)
        {
            l = axt.hashCode();
        }
        return ((k + ((((j + ((c1 + (((i + (i1 + 527) * 31) * 31 + j1) * 31 + k1) * 31) * 31 + l1) * 31) * 31 + i2) * 31 + j2) * 31 + k2) * 31) * 31 + l) * 31 + qz();
    }

    public qz qL()
    {
        axj = 0L;
        tag = "";
        axk = 0;
        axl = 0;
        axm = false;
        axn = qM();
        axo = null;
        axp = pq.axd;
        axq = pq.axd;
        axr = pq.axd;
        axs = null;
        axt = "";
        awJ = null;
        awU = -1;
        return this;
    }

    public awU x(pf pf1)
        throws IOException
    {
        do
        {
            int i = pf1.qi();
            switch (i)
            {
            default:
                if (a(pf1, i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 8: // '\b'
                axj = pf1.qk();
                break;

            case 18: // '\022'
                tag = pf1.readString();
                break;

            case 26: // '\032'
                int k = pq.b(pf1, 26);
                awU aawu[];
                int j;
                if (axn == null)
                {
                    j = 0;
                } else
                {
                    j = axn.length;
                }
                aawu = new axn[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(axn, 0, aawu, 0, j);
                    k = j;
                }
                for (; k < aawu.length - 1; k++)
                {
                    aawu[k] = new <init>();
                    pf1.a(aawu[k]);
                    pf1.qi();
                }

                aawu[k] = new <init>();
                pf1.a(aawu[k]);
                axn = aawu;
                break;

            case 50: // '2'
                axp = pf1.readBytes();
                break;

            case 58: // ':'
                if (axs == null)
                {
                    axs = new <init>();
                }
                pf1.a(axs);
                break;

            case 66: // 'B'
                axq = pf1.readBytes();
                break;

            case 74: // 'J'
                if (axo == null)
                {
                    axo = new <init>();
                }
                pf1.a(axo);
                break;

            case 80: // 'P'
                axm = pf1.qm();
                break;

            case 88: // 'X'
                axk = pf1.ql();
                break;

            case 96: // '`'
                axl = pf1.ql();
                break;

            case 106: // 'j'
                axr = pf1.readBytes();
                break;

            case 114: // 'r'
                axt = pf1.readString();
                break;
            }
        } while (true);
    }

    public ()
    {
        qL();
    }
}
