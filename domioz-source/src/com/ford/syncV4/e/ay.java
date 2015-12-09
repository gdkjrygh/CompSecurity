// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.e;

import com.ford.syncV4.e.b.b;
import com.ford.syncV4.e.c.ah;
import com.ford.syncV4.g.d;

// Referenced classes of package com.ford.syncV4.e:
//            j, b

final class ay
    implements Runnable
{

    final ah a;
    final j b;

    ay(j j1, ah ah)
    {
        b = j1;
        a = ah;
        super();
    }

    public final void run()
    {
        j.e(b).onOnHMIStatus(a);
        j.e(b).onOnLockScreenNotification(j.c(b).c().a());
    }
}
