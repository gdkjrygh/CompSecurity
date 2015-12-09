// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.e;

import com.ford.syncV4.e.b.b;
import com.ford.syncV4.e.c.bp;

// Referenced classes of package com.ford.syncV4.e:
//            j

final class t
    implements Runnable
{

    final bp a;
    final j b;

    t(j j1, bp bp)
    {
        b = j1;
        a = bp;
        super();
    }

    public final void run()
    {
        j.e(b).onSubscribeButtonResponse(a);
    }
}
