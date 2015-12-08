// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            ma, c, mc, lz, 
//            ly, me

public static final class j extends ma
{

    private static volatile anb eU[];
    public int key;
    public int value;

    public static j[] i()
    {
        if (eU == null)
        {
            synchronized (mc.ana)
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

    public void a(lz lz1)
        throws IOException
    {
        lz1.p(1, key);
        lz1.p(2, value);
        super.a(lz1);
    }

    public me b(ly ly1)
        throws IOException
    {
        return f(ly1);
    }

    protected int c()
    {
        return super.c() + lz.r(1, key) + lz.r(2, value);
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
        if (amX != null && !amX.isEmpty())
        {
            break MISSING_BLOCK_LABEL_93;
        }
        if (((amX) (obj)).amX == null)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (!((amX) (obj)).amX.isEmpty()) goto _L4; else goto _L7
_L7:
        return true;
        return amX.equals(((amX) (obj)).amX);
    }

    public amX f(ly ly1)
        throws IOException
    {
        do
        {
            int k = ly1.nB();
            switch (k)
            {
            default:
                if (a(ly1, k))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 8: // '\b'
                key = ly1.nE();
                break;

            case 16: // '\020'
                value = ly1.nE();
                break;
            }
        } while (true);
    }

    public int hashCode()
    {
        int l = key;
        int i1 = value;
        int k;
        if (amX == null || amX.isEmpty())
        {
            k = 0;
        } else
        {
            k = amX.hashCode();
        }
        return k + ((l + 527) * 31 + i1) * 31;
    }

    public amX j()
    {
        key = 0;
        value = 0;
        amX = null;
        anb = -1;
        return this;
    }

    public ()
    {
        j();
    }
}
