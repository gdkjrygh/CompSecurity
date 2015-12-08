// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            mb, lf, me, mf, 
//            ma, lz

public static final class na extends mb
{

    public long aiD;
    public aiE aiE;
    public aiE fK;

    public static na l(byte abyte0[])
        throws me
    {
        return (na)mf.a(new <init>(), abyte0);
    }

    public void a(ma ma1)
        throws IOException
    {
        ma1.b(1, aiD);
        if (fK != null)
        {
            ma1.a(2, fK);
        }
        if (aiE != null)
        {
            ma1.a(3, aiE);
        }
        super.a(ma1);
    }

    public mf b(lz lz1)
        throws IOException
    {
        return p(lz1);
    }

    protected int c()
    {
        int j = super.c() + ma.d(1, aiD);
        int i = j;
        if (fK != null)
        {
            i = j + ma.b(2, fK);
        }
        j = i;
        if (aiE != null)
        {
            j = i + ma.b(3, aiE);
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
        if (!(obj instanceof aiE)) goto _L4; else goto _L3
_L3:
        obj = (aiE)obj;
        flag = flag1;
        if (aiD != ((aiD) (obj)).aiD) goto _L4; else goto _L5
_L5:
        if (fK != null) goto _L7; else goto _L6
_L6:
        flag = flag1;
        if (((fK) (obj)).fK != null) goto _L4; else goto _L8
_L8:
        if (aiE != null) goto _L10; else goto _L9
_L9:
        flag = flag1;
        if (((aiE) (obj)).aiE != null) goto _L4; else goto _L11
_L11:
        if (amU != null && !amU.isEmpty())
        {
            break MISSING_BLOCK_LABEL_145;
        }
        if (((amU) (obj)).amU == null)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (!((amU) (obj)).amU.isEmpty()) goto _L4; else goto _L12
_L12:
        return true;
_L7:
        if (!fK.quals(((quals) (obj)).fK))
        {
            return false;
        }
          goto _L8
_L10:
        if (!aiE.quals(((quals) (obj)).aiE))
        {
            return false;
        }
          goto _L11
        return amU.equals(((amU) (obj)).amU);
          goto _L8
    }

    public int hashCode()
    {
        boolean flag = false;
        int i1 = (int)(aiD ^ aiD >>> 32);
        int i;
        int j;
        int k;
        if (fK == null)
        {
            i = 0;
        } else
        {
            i = fK.ashCode();
        }
        if (aiE == null)
        {
            j = 0;
        } else
        {
            j = aiE.ashCode();
        }
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
        return (j + (i + (i1 + 527) * 31) * 31) * 31 + k;
    }

    public amU na()
    {
        aiD = 0L;
        fK = null;
        aiE = null;
        amU = null;
        amY = -1;
        return this;
    }

    public amY p(lz lz1)
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
                aiD = lz1.ny();
                break;

            case 18: // '\022'
                if (fK == null)
                {
                    fK = new init>();
                }
                lz1.a(fK);
                break;

            case 26: // '\032'
                if (aiE == null)
                {
                    aiE = new init>();
                }
                lz1.a(aiE);
                break;
            }
        } while (true);
    }

    public ()
    {
        na();
    }
}
