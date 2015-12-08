// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            kp, c, kr, ko, 
//            kn, kw, kt

public static final class e extends kp
{

    private static volatile adU eG[];
    public int eH[];
    public int eI;
    public boolean eJ;
    public boolean eK;
    public int name;

    public static e[] d()
    {
        if (eG == null)
        {
            synchronized (kr.adX)
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

    public void a(ko ko1)
        throws IOException
    {
        if (eK)
        {
            ko1.a(1, eK);
        }
        ko1.i(2, eI);
        if (eH != null && eH.length > 0)
        {
            for (int i = 0; i < eH.length; i++)
            {
                ko1.i(3, eH[i]);
            }

        }
        if (name != 0)
        {
            ko1.i(4, name);
        }
        if (eJ)
        {
            ko1.a(6, eJ);
        }
        super.a(ko1);
    }

    public kt b(kn kn1)
        throws IOException
    {
        return c(kn1);
    }

    public int c()
    {
        int j = 0;
        int k = super.c();
        int i = k;
        if (eK)
        {
            i = k + ko.b(1, eK);
        }
        k = ko.j(2, eI) + i;
        if (eH != null && eH.length > 0)
        {
            for (i = 0; i < eH.length; i++)
            {
                j += ko.cX(eH[i]);
            }

            j = k + j + eH.length * 1;
        } else
        {
            j = k;
        }
        i = j;
        if (name != 0)
        {
            i = j + ko.j(4, name);
        }
        j = i;
        if (eJ)
        {
            j = i + ko.b(6, eJ);
        }
        adY = j;
        return j;
    }

    public adY c(kn kn1)
        throws IOException
    {
        do
        {
            int i = kn1.mh();
            switch (i)
            {
            default:
                if (a(kn1, i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 8: // '\b'
                eK = kn1.ml();
                break;

            case 16: // '\020'
                eI = kn1.mk();
                break;

            case 24: // '\030'
                int l = kw.b(kn1, 24);
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
                    ai[l] = kn1.mk();
                    kn1.mh();
                }

                ai[l] = kn1.mk();
                eH = ai;
                break;

            case 26: // '\032'
                int j1 = kn1.cR(kn1.mn());
                int k = kn1.getPosition();
                int i1;
                for (i1 = 0; kn1.ms() > 0; i1++)
                {
                    kn1.mk();
                }

                kn1.cT(k);
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
                    ai1[i1] = kn1.mk();
                }

                eH = ai1;
                kn1.cS(j1);
                break;

            case 32: // ' '
                name = kn1.mk();
                break;

            case 48: // '0'
                eJ = kn1.ml();
                break;
            }
        } while (true);
    }

    public l e()
    {
        eH = kw.aea;
        eI = 0;
        name = 0;
        eJ = false;
        eK = false;
        adU = null;
        adY = -1;
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
        if (!(obj instanceof adY)) goto _L4; else goto _L3
_L3:
        obj = (adY)obj;
        flag = flag1;
        if (!kr.equals(eH, ((eH) (obj)).eH)) goto _L4; else goto _L5
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
        if (adU != null && !adU.isEmpty())
        {
            break MISSING_BLOCK_LABEL_135;
        }
        if (((adU) (obj)).adU == null)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (!((adU) (obj)).adU.isEmpty()) goto _L4; else goto _L10
_L10:
        return true;
        return adU.equals(((adU) (obj)).adU);
    }

    public int hashCode()
    {
        char c2 = '\u04CF';
        int j = kr.hashCode(eH);
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
        if (adU == null || adU.isEmpty())
        {
            i = 0;
        } else
        {
            i = adU.hashCode();
        }
        return i + ((c1 + (((j + 527) * 31 + k) * 31 + l) * 31) * 31 + c2) * 31;
    }

    public ()
    {
        e();
    }
}
