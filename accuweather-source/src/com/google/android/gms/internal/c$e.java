// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            mb, c, md, ma, 
//            lz, mf

public static final class j extends mb
{

    private static volatile amY eU[];
    public int key;
    public int value;

    public static j[] i()
    {
        if (eU == null)
        {
            synchronized (md.amX)
            {
                if (eU == null)
                {
                    eU = new eU[0];
                }
            }
        }
        return eU;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void a(ma ma1)
        throws IOException
    {
        ma1.p(1, key);
        ma1.p(2, value);
        super.a(ma1);
    }

    public mf b(lz lz1)
        throws IOException
    {
        return f(lz1);
    }

    protected int c()
    {
        return super.c() + ma.r(1, key) + ma.r(2, value);
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
        if (!(obj instanceof value)) goto _L4; else goto _L3
_L3:
        obj = (value)obj;
        flag = flag1;
        if (key != ((key) (obj)).key) goto _L4; else goto _L5
_L5:
        flag = flag1;
        if (value != ((value) (obj)).value) goto _L4; else goto _L6
_L6:
        if (amU != null && !amU.isEmpty())
        {
            break MISSING_BLOCK_LABEL_93;
        }
        if (((amU) (obj)).amU == null)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (!((amU) (obj)).amU.isEmpty()) goto _L4; else goto _L7
_L7:
        return true;
        return amU.equals(((amU) (obj)).amU);
    }

    public amU f(lz lz1)
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

            case 8: // '\b'
                key = lz1.nz();
                break;

            case 16: // '\020'
                value = lz1.nz();
                break;
            }
        } while (true);
    }

    public int hashCode()
    {
        int l = key;
        int i1 = value;
        int k;
        if (amU == null || amU.isEmpty())
        {
            k = 0;
        } else
        {
            k = amU.hashCode();
        }
        return k + ((l + 527) * 31 + i1) * 31;
    }

    public amU j()
    {
        key = 0;
        value = 0;
        amU = null;
        amY = -1;
        return this;
    }

    public ()
    {
        j();
    }
}
