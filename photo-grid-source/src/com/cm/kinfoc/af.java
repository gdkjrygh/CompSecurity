// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cm.kinfoc;

import com.cm.kinfoc.a.j;

// Referenced classes of package com.cm.kinfoc:
//            z, ag

final class af
    implements j
{

    final z a;

    af(z z1)
    {
        a = z1;
        super();
    }

    public final void a(boolean flag)
    {
        if (!flag)
        {
            return;
        }
label0:
        {
            synchronized (z.d(a))
            {
                if (!z.e(a))
                {
                    break label0;
                }
            }
            z.a(a, false);
            return;
        }
        z.a(a, true);
        obj;
        JVM INSTR monitorexit ;
        obj = ag.b();
        if (obj == null)
        {
            z.a(a, false);
            return;
        }
        break MISSING_BLOCK_LABEL_83;
        exception1;
        obj;
        JVM INSTR monitorexit ;
        throw exception1;
        Exception exception;
        exception;
        z.a(a, false);
        throw exception;
        int i = 0;
_L2:
        if (i >= 2)
        {
            break; /* Loop/switch isn't completed */
        }
        z.a(a, i);
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        z.a(a, false);
        return;
    }
}
