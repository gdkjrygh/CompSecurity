// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cmcm.adsdk.nativead;

import android.os.Handler;

// Referenced classes of package com.cmcm.adsdk.nativead:
//            e, g

final class f
    implements Runnable
{

    final e a;

    f(e e1)
    {
        a = e1;
        super();
    }

    public final void run()
    {
        if (a.c != null && a.b)
        {
            a.c.a();
            if (a.a != null)
            {
                a.a.postDelayed(this, e.a(a));
            }
        }
    }
}
