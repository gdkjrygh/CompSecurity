// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.bsp;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.yume.android.bsp:
//            i, p, f, g, 
//            h

final class n
    implements Runnable
{

    private i a;

    n(i j)
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
            a.a.a("BSP downloads Resumed.");
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
        if (f1.e().a != h.b) goto _L4; else goto _L3
_L3:
        f1.a(a.d);
          goto _L2
_L4:
        if (f1.e().a != h.c) goto _L2; else goto _L5
_L5:
        f1.a(a.e);
          goto _L2
    }
}
