// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.github.nkzawa.engineio.client;

import com.github.nkzawa.f.a;

// Referenced classes of package com.github.nkzawa.engineio.client:
//            Socket

final class a
    implements Runnable
{

    final Socket a;
    final Socket b;

    public final void run()
    {
        com.github.nkzawa.f.a.a(new Runnable() {

            final Socket._cls7 a;

            public final void run()
            {
                if (Socket.d(a.a) == Socket.ReadyState.d)
                {
                    return;
                } else
                {
                    Socket.b(a.a, "ping timeout");
                    return;
                }
            }

            
            {
                a = Socket._cls7.this;
                super();
            }
        });
    }

    _cls1.a(Socket socket, Socket socket1)
    {
        b = socket;
        a = socket1;
        super();
    }
}
