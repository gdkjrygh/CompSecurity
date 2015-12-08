// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            ph, ll, pl, pg, 
//            pf, pn

public static final class lR extends ph
{

    private static volatile viewId adF[];
    public String adG;
    public String adH;
    public int viewId;

    public static lR[] lQ()
    {
        if (adF == null)
        {
            synchronized (pl.awT)
            {
                if (adF == null)
                {
                    adF = new adF[0];
                }
            }
        }
        return adF;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void a(pg pg1)
        throws IOException
    {
        if (!adG.equals(""))
        {
            pg1.b(1, adG);
        }
        if (!adH.equals(""))
        {
            pg1.b(2, adH);
        }
        if (viewId != 0)
        {
            pg1.s(3, viewId);
        }
        super.a(pg1);
    }

    public pn b(pf pf1)
        throws IOException
    {
        return o(pf1);
    }

    protected int c()
    {
        int j = super.c();
        int i = j;
        if (!adG.equals(""))
        {
            i = j + pg.j(1, adG);
        }
        j = i;
        if (!adH.equals(""))
        {
            j = i + pg.j(2, adH);
        }
        i = j;
        if (viewId != 0)
        {
            i = j + pg.u(3, viewId);
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
        if (!(obj instanceof viewId)) goto _L4; else goto _L3
_L3:
        obj = (viewId)obj;
        if (adG != null) goto _L6; else goto _L5
_L5:
        flag = flag1;
        if (((adG) (obj)).adG != null) goto _L4; else goto _L7
_L7:
        if (adH != null)
        {
            break MISSING_BLOCK_LABEL_92;
        }
        flag = flag1;
        if (((adH) (obj)).adH != null) goto _L4; else goto _L8
_L8:
        flag = flag1;
        if (viewId == ((viewId) (obj)).viewId)
        {
            return a(((ph) (obj)));
        }
          goto _L4
_L6:
        if (!adG.equals(((adG) (obj)).adG))
        {
            return false;
        }
          goto _L7
        if (!adH.equals(((adH) (obj)).adH))
        {
            return false;
        }
          goto _L8
    }

    public int hashCode()
    {
        int j = 0;
        int i;
        if (adG == null)
        {
            i = 0;
        } else
        {
            i = adG.hashCode();
        }
        if (adH != null)
        {
            j = adH.hashCode();
        }
        return (((i + 527) * 31 + j) * 31 + viewId) * 31 + qz();
    }

    public qz lR()
    {
        adG = "";
        adH = "";
        viewId = 0;
        awJ = null;
        awU = -1;
        return this;
    }

    public awU o(pf pf1)
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

            case 10: // '\n'
                adG = pf1.readString();
                break;

            case 18: // '\022'
                adH = pf1.readString();
                break;

            case 24: // '\030'
                viewId = pf1.ql();
                break;
            }
        } while (true);
    }

    public ()
    {
        lR();
    }
}
