// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.github.nkzawa.socketio.client;

import java.util.Timer;

// Referenced classes of package com.github.nkzawa.socketio.client:
//            Manager

final class a
    implements a
{

    final Timer a;
    final Manager b;

    public final void a()
    {
        a.cancel();
    }

    (Manager manager, Timer timer)
    {
        b = manager;
        a = timer;
        super();
    }
}
