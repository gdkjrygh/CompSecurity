// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.github.nkzawa.engineio.client;

import java.util.LinkedList;

// Referenced classes of package com.github.nkzawa.engineio.client:
//            Socket

final class a
    implements Runnable
{

    final Socket a;
    final Socket b;

    public final void run()
    {
        a.d.clear();
        Socket.h(a).clear();
        Socket.i(a);
    }

    (Socket socket, Socket socket1)
    {
        b = socket;
        a = socket1;
        super();
    }
}
