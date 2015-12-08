// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b;

import android.os.Handler;

// Referenced classes of package com.nuance.b.b:
//            eo

final class ep
    implements Runnable
{

    final eo a;
    private boolean b;

    ep(eo eo1)
    {
        a = eo1;
        super();
        b = false;
    }

    public final void run()
    {
        if (!eo.a(a))
        {
            eo.b(a);
            int i = eo.c(a);
            if (!b && i > 0)
            {
                eo.d(a);
                if (!eo.a(a))
                {
                    b = true;
                }
            }
            if (!eo.a(a))
            {
                eo.e(a).postDelayed(this, 200L);
                return;
            }
        }
    }
}
