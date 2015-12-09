// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.e;

import com.ford.syncV4.e.b.b;
import com.ford.syncV4.e.c.k;

// Referenced classes of package com.ford.syncV4.e:
//            j

final class q
    implements Runnable
{

    final k a;
    final j b;

    q(j j1, k k)
    {
        b = j1;
        a = k;
        super();
    }

    public final void run()
    {
        j.e(b).onDeleteCommandResponse(a);
    }
}
