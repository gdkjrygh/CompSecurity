// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.e;

import com.ford.syncV4.e.b.b;
import com.ford.syncV4.e.c.ba;

// Referenced classes of package com.ford.syncV4.e:
//            j

final class ac
    implements Runnable
{

    final ba a;
    final j b;

    ac(j j1, ba ba)
    {
        b = j1;
        a = ba;
        super();
    }

    public final void run()
    {
        j.e(b).onResetGlobalPropertiesResponse(a);
    }
}
