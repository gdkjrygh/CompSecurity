// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.e;

import com.ford.syncV4.e.b.b;
import com.ford.syncV4.e.c.ax;

// Referenced classes of package com.ford.syncV4.e:
//            j

final class au
    implements Runnable
{

    final ax a;
    final j b;

    au(j j1, ax ax)
    {
        b = j1;
        a = ax;
        super();
    }

    public final void run()
    {
        j.e(b).onReadDIDResponse(a);
    }
}
