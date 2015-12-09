// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.e;

import com.ford.syncV4.e.b.b;
import com.ford.syncV4.e.c.bz;

// Referenced classes of package com.ford.syncV4.e:
//            j

final class as
    implements Runnable
{

    final bz a;
    final j b;

    as(j j1, bz bz)
    {
        b = j1;
        a = bz;
        super();
    }

    public final void run()
    {
        j.e(b).onUnsubscribeVehicleDataResponse(a);
    }
}
