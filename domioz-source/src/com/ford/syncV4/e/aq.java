// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.e;

import com.ford.syncV4.e.b.b;
import com.ford.syncV4.e.c.br;

// Referenced classes of package com.ford.syncV4.e:
//            j

final class aq
    implements Runnable
{

    final br a;
    final j b;

    aq(j j1, br br)
    {
        b = j1;
        a = br;
        super();
    }

    public final void run()
    {
        j.e(b).onSubscribeVehicleDataResponse(a);
    }
}
