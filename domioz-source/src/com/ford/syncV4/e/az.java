// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.e;

import com.ford.syncV4.e.b.b;
import com.ford.syncV4.e.c.af;

// Referenced classes of package com.ford.syncV4.e:
//            j

final class az
    implements Runnable
{

    final af a;
    final j b;

    az(j j1, af af)
    {
        b = j1;
        a = af;
        super();
    }

    public final void run()
    {
        j.e(b).onOnCommand(a);
    }
}
