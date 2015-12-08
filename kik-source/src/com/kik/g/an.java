// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.g;

import java.util.concurrent.ScheduledFuture;

// Referenced classes of package com.kik.g:
//            r

final class an extends r
{

    final ScheduledFuture a;

    an(ScheduledFuture scheduledfuture)
    {
        a = scheduledfuture;
        super();
    }

    public final void a()
    {
        a.cancel(true);
    }
}
