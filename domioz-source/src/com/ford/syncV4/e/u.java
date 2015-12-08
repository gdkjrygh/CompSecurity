// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.e;

import com.ford.syncV4.e.b.b;
import com.ford.syncV4.e.c.by;

// Referenced classes of package com.ford.syncV4.e:
//            j

final class u
    implements Runnable
{

    final by a;
    final j b;

    u(j j1, by by)
    {
        b = j1;
        a = by;
        super();
    }

    public final void run()
    {
        j.e(b).onUnsubscribeButtonResponse(a);
    }
}
