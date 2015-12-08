// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            mb, c, md, ma, 
//            lz, mi, mf

public static final class e extends mb
{

    private static volatile amU eG[];
    public int eH[];
    public int eI;
    public boolean eJ;
    public boolean eK;
    public int name;

    public static e[] d()
    {
        if (eG == null)
        {
            synchronized (md.amX)
            {
                if (eG == null)
                {
                    eG = new eG[0];
                }
            }
        }
        return eG;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void a(ma ma1)
        throws IOException
    {
        if (eK)
        {
            ma1.a(1, eK);
        }
        ma1.p(2, eI);
        if (eH != null && eH.length > 0)
        {
            for (int i = 0; i < eH.length; i++)
            {
                ma1.p(3, eH[i]);
            }

        }
        if (name != 0)
        {
            ma1.p(4, name);
        }
        if (eJ)
        {
            ma1.a(6, eJ);
        }
        super.a(ma1);
    }

    public mf b(lz lz1)
        throws IOException
    {
        return c(lz1);
    }

    protected int c()
    {
        int j = 0;
        int k = super.c();
        int i = k;
        if (eK)
        {
            i = k + ma.b(1, eK);
        }
        k = ma.r(2, eI) + i;
        if (eH != null && eH.length > 0)
        {
            for (i = 0; i < eH.length; i++)
            {
                j += ma.eE(eH[i]);
            }

            j = k + j + eH.length * 1;
        } else
        {
            j = k;
        }
        i = j;
        if (name != 0)
        {
            i = j + ma.r(4, name);
        }
        j = i;
        if (eJ)
        {
            j = i + ma.b(6, eJ);
        }
        return j;
    }

    public eJ c(lz lz1)
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
                eK = lz1.nA();
                break;

            case 16: // '\020'
                eI = lz1.nz();
                break;

            case 24: // '\030'
                int l = mi.b(lz1, 24);
                int ai[];
                int j;
                if (eH == null)
                {
                    j = 0;
                } else
                {
                    j = eH.length;
                }
                ai = new int[l + j];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(eH, 0, ai, 0, j);
                    l = j;
                }
                for (; l < ai.length - 1; l++)
                {
                    ai[l] = lz1.nz();
                    lz1.nw();
                }

                ai[l] = lz1.nz();
                eH = ai;
                break;

            case 26: // '\032'
                int j1 = lz1.ex(lz1.nD());
                int k = lz1.getPosition();
                int i1;
                for (i1 = 0; lz1.nI() > 0; i1++)
                {
                    lz1.nz();
                }

                lz1.ez(k);
                int ai1[];
                if (eH == null)
                {
                    k = 0;
                } else
                {
                    k = eH.length;
                }
                ai1 = new int[i1 + k];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(eH, 0, ai1, 0, k);
                    i1 = k;
                }
                for (; i1 < ai1.length; i1++)
                {
                    ai1[i1] = lz1.nz();
                }

                eH = ai1;
                lz1.ey(j1);
                break;

            case 32: // ' '
                name = lz1.nz();
                break;

            case 48: // '0'
                eJ = lz1.nA();
                break;
            }
        } while (true);
    }

    public A e()
    {
        eH = mi.ana;
        eI = 0;
        name = 0;
        eJ = false;
        eK = false;
        amU = null;
        amY = -1;
        return this;
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
        if (!(obj instanceof amY)) goto _L4; else goto _L3
_L3:
        obj = (amY)obj;
        flag = flag1;
        if (!md.equals(eH, ((eH) (obj)).eH)) goto _L4; else goto _L5
_L5:
        flag = flag1;
        if (eI != ((eI) (obj)).eI) goto _L4; else goto _L6
_L6:
        flag = flag1;
        if (name != ((name) (obj)).name) goto _L4; else goto _L7
_L7:
        flag = flag1;
        if (eJ != ((eJ) (obj)).eJ) goto _L4; else goto _L8
_L8:
        flag = flag1;
        if (eK != ((eK) (obj)).eK) goto _L4; else goto _L9
_L9:
        if (amU != null && !amU.isEmpty())
        {
            break MISSING_BLOCK_LABEL_135;
        }
        if (((amU) (obj)).amU == null)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (!((amU) (obj)).amU.isEmpty()) goto _L4; else goto _L10
_L10:
        return true;
        return amU.equals(((amU) (obj)).amU);
    }

    public int hashCode()
    {
        char c2 = '\u04CF';
        int j = md.hashCode(eH);
        int k = eI;
        int l = name;
        char c1;
        int i;
        if (eJ)
        {
            c1 = '\u04CF';
        } else
        {
            c1 = '\u04D5';
        }
        if (!eK)
        {
            c2 = '\u04D5';
        }
        if (amU == null || amU.isEmpty())
        {
            i = 0;
        } else
        {
            i = amU.hashCode();
        }
        return i + ((c1 + (((j + 527) * 31 + k) * 31 + l) * 31) * 31 + c2) * 31;
    }

    public ()
    {
        e();
    }
}
