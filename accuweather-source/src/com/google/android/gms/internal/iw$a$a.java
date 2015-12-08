// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            mb, iw, md, ma, 
//            lz, mf

public static final class iN extends mb
{

    private static volatile viewId Uw[];
    public String Ux;
    public String Uy;
    public int viewId;

    public static iN[] iM()
    {
        if (Uw == null)
        {
            synchronized (md.amX)
            {
                if (Uw == null)
                {
                    Uw = new Uw[0];
                }
            }
        }
        return Uw;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void a(ma ma1)
        throws IOException
    {
        if (!Ux.equals(""))
        {
            ma1.b(1, Ux);
        }
        if (!Uy.equals(""))
        {
            ma1.b(2, Uy);
        }
        if (viewId != 0)
        {
            ma1.p(3, viewId);
        }
        super.a(ma1);
    }

    public mf b(lz lz1)
        throws IOException
    {
        return o(lz1);
    }

    protected int c()
    {
        int j = super.c();
        int i = j;
        if (!Ux.equals(""))
        {
            i = j + ma.h(1, Ux);
        }
        j = i;
        if (!Uy.equals(""))
        {
            j = i + ma.h(2, Uy);
        }
        i = j;
        if (viewId != 0)
        {
            i = j + ma.r(3, viewId);
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
        if (Ux != null) goto _L6; else goto _L5
_L5:
        flag = flag1;
        if (((Ux) (obj)).Ux != null) goto _L4; else goto _L7
_L7:
        if (Uy != null) goto _L9; else goto _L8
_L8:
        flag = flag1;
        if (((Uy) (obj)).Uy != null) goto _L4; else goto _L10
_L10:
        flag = flag1;
        if (viewId != ((viewId) (obj)).viewId) goto _L4; else goto _L11
_L11:
        if (amU != null && !amU.isEmpty())
        {
            break MISSING_BLOCK_LABEL_144;
        }
        if (((amU) (obj)).amU == null)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (!((amU) (obj)).amU.isEmpty()) goto _L4; else goto _L12
_L12:
        return true;
_L6:
        if (!Ux.equals(((Ux) (obj)).Ux))
        {
            return false;
        }
          goto _L7
_L9:
        if (!Uy.equals(((Uy) (obj)).Uy))
        {
            return false;
        }
          goto _L10
        return amU.equals(((amU) (obj)).amU);
          goto _L7
    }

    public int hashCode()
    {
        boolean flag = false;
        int i;
        int j;
        int k;
        int l;
        if (Ux == null)
        {
            i = 0;
        } else
        {
            i = Ux.hashCode();
        }
        if (Uy == null)
        {
            j = 0;
        } else
        {
            j = Uy.hashCode();
        }
        l = viewId;
        k = ((flag) ? 1 : 0);
        if (amU != null)
        {
            if (amU.isEmpty())
            {
                k = ((flag) ? 1 : 0);
            } else
            {
                k = amU.hashCode();
            }
        }
        return ((j + (i + 527) * 31) * 31 + l) * 31 + k;
    }

    public amU iN()
    {
        Ux = "";
        Uy = "";
        viewId = 0;
        amU = null;
        amY = -1;
        return this;
    }

    public amY o(lz lz1)
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
                Ux = lz1.readString();
                break;

            case 18: // '\022'
                Uy = lz1.readString();
                break;

            case 24: // '\030'
                viewId = lz1.nz();
                break;
            }
        } while (true);
    }

    public ()
    {
        iN();
    }
}
