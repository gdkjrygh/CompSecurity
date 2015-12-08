// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            mb, c, md, ma, 
//            lz, mf

public static final class p extends mb
{

    private static volatile amY fG[];
    public amY fH;
    public amY fI;
    public String name;

    public static p[] o()
    {
        if (fG == null)
        {
            synchronized (md.amX)
            {
                if (fG == null)
                {
                    fG = new fG[0];
                }
            }
        }
        return fG;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void a(ma ma1)
        throws IOException
    {
        if (!name.equals(""))
        {
            ma1.b(1, name);
        }
        if (fH != null)
        {
            ma1.a(2, fH);
        }
        if (fI != null)
        {
            ma1.a(3, fI);
        }
        super.a(ma1);
    }

    public mf b(lz lz1)
        throws IOException
    {
        return j(lz1);
    }

    protected int c()
    {
        int l = super.c();
        int k = l;
        if (!name.equals(""))
        {
            k = l + ma.h(1, name);
        }
        l = k;
        if (fH != null)
        {
            l = k + ma.b(2, fH);
        }
        k = l;
        if (fI != null)
        {
            k = l + ma.b(3, fI);
        }
        return k;
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
        if (!(obj instanceof fI)) goto _L4; else goto _L3
_L3:
        obj = (fI)obj;
        if (name != null) goto _L6; else goto _L5
_L5:
        flag = flag1;
        if (((name) (obj)).name != null) goto _L4; else goto _L7
_L7:
        if (fH != null) goto _L9; else goto _L8
_L8:
        flag = flag1;
        if (((fH) (obj)).fH != null) goto _L4; else goto _L10
_L10:
        if (fI != null) goto _L12; else goto _L11
_L11:
        flag = flag1;
        if (((fI) (obj)).fI != null) goto _L4; else goto _L13
_L13:
        if (amU != null && !amU.isEmpty())
        {
            break MISSING_BLOCK_LABEL_163;
        }
        if (((amU) (obj)).amU == null)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (!((amU) (obj)).amU.isEmpty()) goto _L4; else goto _L14
_L14:
        return true;
_L6:
        if (!name.equals(((name) (obj)).name))
        {
            return false;
        }
          goto _L7
_L9:
        if (!fH.equals(((equals) (obj)).fH))
        {
            return false;
        }
          goto _L10
_L12:
        if (!fI.equals(((equals) (obj)).fI))
        {
            return false;
        }
          goto _L13
        return amU.equals(((amU) (obj)).amU);
          goto _L7
    }

    public int hashCode()
    {
        boolean flag = false;
        int k;
        int l;
        int i1;
        int j1;
        if (name == null)
        {
            k = 0;
        } else
        {
            k = name.hashCode();
        }
        if (fH == null)
        {
            l = 0;
        } else
        {
            l = fH.hashCode();
        }
        if (fI == null)
        {
            i1 = 0;
        } else
        {
            i1 = fI.hashCode();
        }
        j1 = ((flag) ? 1 : 0);
        if (amU != null)
        {
            if (amU.isEmpty())
            {
                j1 = ((flag) ? 1 : 0);
            } else
            {
                j1 = amU.hashCode();
            }
        }
        return (i1 + (l + (k + 527) * 31) * 31) * 31 + j1;
    }

    public amU j(lz lz1)
        throws IOException
    {
        do
        {
            int k = lz1.nw();
            switch (k)
            {
            default:
                if (a(lz1, k))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                name = lz1.readString();
                break;

            case 18: // '\022'
                if (fH == null)
                {
                    fH = new <init>();
                }
                lz1.a(fH);
                break;

            case 26: // '\032'
                if (fI == null)
                {
                    fI = new <init>();
                }
                lz1.a(fI);
                break;
            }
        } while (true);
    }

    public fI p()
    {
        name = "";
        fH = null;
        fI = null;
        amU = null;
        amY = -1;
        return this;
    }

    public ()
    {
        p();
    }
}
