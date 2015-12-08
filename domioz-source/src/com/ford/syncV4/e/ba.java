// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.e;

import com.ford.syncV4.e.b.b;
import com.ford.syncV4.e.c.ag;
import com.ford.syncV4.g.d;

// Referenced classes of package com.ford.syncV4.e:
//            j, b

final class ba
    implements Runnable
{

    final ag a;
    final j b;

    ba(j j1, ag ag)
    {
        b = j1;
        a = ag;
        super();
    }

    public final void run()
    {
        j.e(b).onOnDriverDistraction(a);
        j.e(b).onOnLockScreenNotification(j.c(b).c().a());
    }
}
