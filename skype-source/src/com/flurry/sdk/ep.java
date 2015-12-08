// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.flurry.sdk:
//            et, eq, dj

public final class ep
    implements et
{

    private static ep a;
    private final List b = b();

    private ep()
    {
    }

    public static ep a()
    {
        com/flurry/sdk/ep;
        JVM INSTR monitorenter ;
        ep ep1;
        if (a == null)
        {
            a = new ep();
        }
        ep1 = a;
        com/flurry/sdk/ep;
        JVM INSTR monitorexit ;
        return ep1;
        Exception exception;
        exception;
        throw exception;
    }

    private static List b()
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new eq("com.flurry.android.impl.analytics.FlurryAnalyticsModule", 10));
        arraylist.add(new eq("com.flurry.android.impl.ads.FlurryAdModule", 10));
        return Collections.unmodifiableList(arraylist);
    }

    public final void a(dj dj)
    {
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((et)iterator.next()).a(dj)) { }
    }

    public final void a(dj dj, Context context)
    {
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((et)iterator.next()).a(dj, context)) { }
    }

    public final void b(dj dj, Context context)
    {
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((et)iterator.next()).b(dj, context)) { }
    }

    public final void c(dj dj, Context context)
    {
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((et)iterator.next()).c(dj, context)) { }
    }
}
