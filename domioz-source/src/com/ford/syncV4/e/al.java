// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.e;

import com.ford.syncV4.e.b.b;
import com.ford.syncV4.e.c.bb;

// Referenced classes of package com.ford.syncV4.e:
//            j

final class al
    implements Runnable
{

    final bb a;
    final j b;

    al(j j1, bb bb)
    {
        b = j1;
        a = bb;
        super();
    }

    public final void run()
    {
        j.e(b).onScrollableMessageResponse(a);
    }
}
