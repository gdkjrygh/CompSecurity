// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            mb, c, md, ma, 
//            lz, mf

public static final class g extends mb
{

    private static volatile amU eL[];
    public String eM;
    public long eN;
    public long eO;
    public boolean eP;
    public long eQ;

    public static g[] f()
    {
        if (eL == null)
        {
            synchronized (md.amX)
            {
                if (eL == null)
                {
                    eL = new eL[0];
                }
            }
        }
        return eL;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void a(ma ma1)
        throws IOException
    {
        if (!eM.equals(""))
        {
            ma1.b(1, eM);
        }
        if (eN != 0L)
        {
            ma1.b(2, eN);
        }
        if (eO != 0x7fffffffL)
        {
            ma1.b(3, eO);
        }
        if (eP)
        {
            ma1.a(4, eP);
        }
        if (eQ != 0L)
        {
            ma1.b(5, eQ);
        }
        super.a(ma1);
    }

    public mf b(lz lz1)
        throws IOException
    {
        return d(lz1);
    }

    protected int c()
    {
        int j = super.c();
        int i = j;
        if (!eM.equals(""))
        {
            i = j + ma.h(1, eM);
        }
        j = i;
        if (eN != 0L)
        {
            j = i + ma.d(2, eN);
        }
        i = j;
        if (eO != 0x7fffffffL)
        {
            i = j + ma.d(3, eO);
        }
        j = i;
        if (eP)
        {
            j = i + ma.b(4, eP);
        }
        i = j;
        if (eQ != 0L)
        {
            i = j + ma.d(5, eQ);
        }
        return i;
    }

    public eQ d(lz lz1)
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

            case 10: // '\n'
                eM = lz1.readString();
                break;

            case 16: // '\020'
                eN = lz1.ny();
                break;

            case 24: // '\030'
                eO = lz1.ny();
                break;

            case 32: // ' '
                eP = lz1.nA();
                break;

            case 40: // '('
                eQ = lz1.ny();
                break;
            }
        } while (true);
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
        if (!(obj instanceof y)) goto _L4; else goto _L3
_L3:
        obj = (y)obj;
        if (eM != null)
        {
            break MISSING_BLOCK_LABEL_138;
        }
        flag = flag1;
        if (((eM) (obj)).eM != null) goto _L4; else goto _L5
_L5:
        flag = flag1;
        if (eN != ((eN) (obj)).eN) goto _L4; else goto _L6
_L6:
        flag = flag1;
        if (eO != ((eO) (obj)).eO) goto _L4; else goto _L7
_L7:
        flag = flag1;
        if (eP != ((eP) (obj)).eP) goto _L4; else goto _L8
_L8:
        flag = flag1;
        if (eQ != ((eQ) (obj)).eQ) goto _L4; else goto _L9
_L9:
        if (amU != null && !amU.isEmpty())
        {
            break MISSING_BLOCK_LABEL_154;
        }
        if (((amU) (obj)).amU == null)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (!((amU) (obj)).amU.isEmpty()) goto _L4; else goto _L10
_L10:
        return true;
        if (!eM.equals(((eM) (obj)).eM))
        {
            return false;
        }
          goto _L5
        return amU.equals(((amU) (obj)).amU);
    }

    public amU g()
    {
        eM = "";
        eN = 0L;
        eO = 0x7fffffffL;
        eP = false;
        eQ = 0L;
        amU = null;
        amY = -1;
        return this;
    }

    public int hashCode()
    {
        boolean flag = false;
        int i;
        char c1;
        int j;
        int k;
        int l;
        int i1;
        if (eM == null)
        {
            i = 0;
        } else
        {
            i = eM.hashCode();
        }
        k = (int)(eN ^ eN >>> 32);
        l = (int)(eO ^ eO >>> 32);
        if (eP)
        {
            c1 = '\u04CF';
        } else
        {
            c1 = '\u04D5';
        }
        i1 = (int)(eQ ^ eQ >>> 32);
        j = ((flag) ? 1 : 0);
        if (amU != null)
        {
            if (amU.isEmpty())
            {
                j = ((flag) ? 1 : 0);
            } else
            {
                j = amU.hashCode();
            }
        }
        return ((c1 + (((i + 527) * 31 + k) * 31 + l) * 31) * 31 + i1) * 31 + j;
    }

    public ()
    {
        g();
    }
}
