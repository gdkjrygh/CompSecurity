// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.e;

import com.ford.syncV4.e.b.b;
import com.ford.syncV4.e.c.e;

// Referenced classes of package com.ford.syncV4.e:
//            j

final class n
    implements Runnable
{

    final e a;
    final j b;

    n(j j1, e e)
    {
        b = j1;
        a = e;
        super();
    }

    public final void run()
    {
        com.ford.syncV4.e.j.e(b).onAlertResponse(a);
    }
}
