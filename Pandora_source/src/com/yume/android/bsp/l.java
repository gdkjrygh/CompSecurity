// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.bsp;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.yume.android.bsp:
//            i, p, f

final class l
    implements Runnable
{

    private i a;

    l(i j)
    {
        a = j;
        super();
    }

    public final void run()
    {
        Iterator iterator = a.b.entrySet().iterator();
_L2:
        if (!iterator.hasNext())
        {
            a.b = null;
            a.a.a("BSP downloads Aborted.");
            return;
        }
        f f1;
        try
        {
            f1 = (f)((java.util.Map.Entry)iterator.next()).getValue();
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
            return;
        }
        if (f1 == null) goto _L2; else goto _L1
_L1:
        f1.a(null);
        f1.b();
          goto _L2
    }
}
