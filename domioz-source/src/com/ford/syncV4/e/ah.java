// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.e;

import com.ford.syncV4.e.b.b;
import com.ford.syncV4.e.c.aw;

// Referenced classes of package com.ford.syncV4.e:
//            j

final class ah
    implements Runnable
{

    final aw a;
    final j b;

    ah(j j1, aw aw)
    {
        b = j1;
        a = aw;
        super();
    }

    public final void run()
    {
        j.e(b).onPutFileResponse(a);
    }
}
