// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.github.nkzawa.engineio.client;

import com.github.nkzawa.f.a;
import java.util.logging.Logger;

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

            final Socket._cls8 a;

            public final void run()
            {
                Socket.d().fine(String.format("writing ping packet - expecting pong within %sms", new Object[] {
                    Long.valueOf(Socket.f(a.a))
                }));
                com.github.nkzawa.f.a.a(new Socket._cls9(a.a));
                com.github.nkzawa.engineio.client.Socket.a(a.a, Socket.f(a.a));
            }

            
            {
                a = Socket._cls8.this;
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
