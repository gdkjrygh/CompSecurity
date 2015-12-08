// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import java.util.concurrent.ScheduledFuture;

// Referenced classes of package com.taplytics:
//            hu, hq

final class hs extends hu
{

    final ScheduledFuture a;
    final hq b;

    hs(hq hq, ScheduledFuture scheduledfuture)
    {
        b = hq;
        a = scheduledfuture;
        super();
    }

    public final void d()
    {
        a.cancel(true);
    }
}
