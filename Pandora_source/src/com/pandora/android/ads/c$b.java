// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.ads;

import com.pandora.radio.util.b;

// Referenced classes of package com.pandora.android.ads:
//            c, g

public static class ion extends b
{

    private static volatile g a;

    public static g a()
    {
        if (a == null)
        {
            android.app.Application application = com.pandora.android.provider.b.a.h();
            if (application == null)
            {
                throw new IllegalStateException("AdManager has no available context to use.");
            }
            p.cw.c c1 = com.pandora.android.provider.b.a.b();
            if (c1 == null)
            {
                throw new IllegalStateException("AdManager has no available radio to use.");
            }
            a = new c(application, c1);
        }
        return a;
    }

    static g a(g g)
    {
        a = g;
        return g;
    }

    static g b()
    {
        return a;
    }
}
