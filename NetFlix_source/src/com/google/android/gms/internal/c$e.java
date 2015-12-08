// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            kp, c, kr, ko, 
//            kn, kt

public static final class j extends kp
{

    private static volatile adY eU[];
    public int key;
    public int value;

    public static j[] i()
    {
        if (eU == null)
        {
            synchronized (kr.adX)
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

    public void a(ko ko1)
        throws IOException
    {
        ko1.i(1, key);
        ko1.i(2, value);
        super.a(ko1);
    }

    public kt b(kn kn1)
        throws IOException
    {
        return f(kn1);
    }

    public int c()
    {
        int k = super.c() + ko.j(1, key) + ko.j(2, value);
        adY = k;
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
        if (!(obj instanceof adY)) goto _L4; else goto _L3
_L3:
        obj = (adY)obj;
        flag = flag1;
        if (key != ((key) (obj)).key) goto _L4; else goto _L5
_L5:
        flag = flag1;
        if (value != ((value) (obj)).value) goto _L4; else goto _L6
_L6:
        if (adU != null && !adU.isEmpty())
        {
            break MISSING_BLOCK_LABEL_93;
        }
        if (((adU) (obj)).adU == null)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (!((adU) (obj)).adU.isEmpty()) goto _L4; else goto _L7
_L7:
        return true;
        return adU.equals(((adU) (obj)).adU);
    }

    public adU f(kn kn1)
        throws IOException
    {
        do
        {
            int k = kn1.mh();
            switch (k)
            {
            default:
                if (a(kn1, k))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 8: // '\b'
                key = kn1.mk();
                break;

            case 16: // '\020'
                value = kn1.mk();
                break;
            }
        } while (true);
    }

    public int hashCode()
    {
        int l = key;
        int i1 = value;
        int k;
        if (adU == null || adU.isEmpty())
        {
            k = 0;
        } else
        {
            k = adU.hashCode();
        }
        return k + ((l + 527) * 31 + i1) * 31;
    }

    public adU j()
    {
        key = 0;
        value = 0;
        adU = null;
        adY = -1;
        return this;
    }

    public ()
    {
        j();
    }
}
