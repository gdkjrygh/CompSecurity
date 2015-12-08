// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.e;

import com.ford.syncV4.e.a.c;
import com.ford.syncV4.e.b.b;

// Referenced classes of package com.ford.syncV4.e:
//            j

final class bn
    implements Runnable
{

    final c a;
    final j b;

    bn(j j1, c c1)
    {
        b = j1;
        a = c1;
        super();
    }

    public final void run()
    {
        j.e(b).onProxyClosed$41146304(a.b(), a.d(), a.c());
    }
}
