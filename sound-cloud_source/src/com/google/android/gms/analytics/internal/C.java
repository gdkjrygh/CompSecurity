// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.content.ComponentName;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            v, z, s, n

final class C
    implements Runnable
{

    final ComponentName a;
    final z.a b;

    C(z.a a1, ComponentName componentname)
    {
        b = a1;
        a = componentname;
        super();
    }

    public final void run()
    {
        z z1 = b.a;
        ComponentName componentname = a;
        v.g();
        if (z1.b != null)
        {
            z1.b = null;
            z1.a("Disconnected from device AnalyticsService", componentname);
            ((s) (z1)).i.c().c();
        }
    }
}
