// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.e;

import com.ford.syncV4.e.b.b;
import com.ford.syncV4.e.c.aq;

// Referenced classes of package com.ford.syncV4.e:
//            j

final class bo
    implements Runnable
{

    final aq a;
    final j b;

    bo(j j1, aq aq)
    {
        b = j1;
        a = aq;
        super();
    }

    public final void run()
    {
        j.e(b).onOnVehicleData(a);
    }
}
