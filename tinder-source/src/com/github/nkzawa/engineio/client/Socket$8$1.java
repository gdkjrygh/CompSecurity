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

    final a a;

    public final void run()
    {
        Socket.d().fine(String.format("writing ping packet - expecting pong within %sms", new Object[] {
            Long.valueOf(Socket.f(a.a))
        }));
        com.github.nkzawa.f.a.a(new nit>(a.a));
        com.github.nkzawa.engineio.client.Socket.a(a.a, Socket.f(a.a));
    }

    ( )
    {
        a = ;
        super();
    }

    // Unreferenced inner class com/github/nkzawa/engineio/client/Socket$8

/* anonymous class */
    final class Socket._cls8
        implements Runnable
    {

        final Socket a;
        final Socket b;

        public final void run()
        {
            com.github.nkzawa.f.a.a(new Socket._cls8._cls1(this));
        }

            
            {
                b = socket;
                a = socket1;
                super();
            }
    }

}
