// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.e;

import com.ford.syncV4.e.b.b;
import com.ford.syncV4.e.c.u;

// Referenced classes of package com.ford.syncV4.e:
//            j

final class av
    implements Runnable
{

    final u a;
    final j b;

    av(j j1, u u)
    {
        b = j1;
        a = u;
        super();
    }

    public final void run()
    {
        j.e(b).onGetDTCsResponse(a);
    }
}
