// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.e;

import com.ford.syncV4.e.b.b;
import com.ford.syncV4.e.c.bu;

// Referenced classes of package com.ford.syncV4.e:
//            j

final class x
    implements Runnable
{

    final bu a;
    final j b;

    x(j j1, bu bu)
    {
        b = j1;
        a = bu;
        super();
    }

    public final void run()
    {
        j.e(b).onSystemRequestResponse(a);
    }
}
