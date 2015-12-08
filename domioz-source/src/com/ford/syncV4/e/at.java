// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.e;

import com.ford.syncV4.e.b.b;
import com.ford.syncV4.e.c.w;

// Referenced classes of package com.ford.syncV4.e:
//            j

final class at
    implements Runnable
{

    final w a;
    final j b;

    at(j j1, w w)
    {
        b = j1;
        a = w;
        super();
    }

    public final void run()
    {
        j.e(b).onGetVehicleDataResponse(a);
    }
}
