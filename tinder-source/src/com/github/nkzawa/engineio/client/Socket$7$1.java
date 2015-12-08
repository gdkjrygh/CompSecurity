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

    final a a;

    public final void run()
    {
        if (Socket.d(a.a) == yState.d)
        {
            return;
        } else
        {
            Socket.b(a.a, "ping timeout");
            return;
        }
    }

    yState(yState ystate)
    {
        a = ystate;
        super();
    }

    // Unreferenced inner class com/github/nkzawa/engineio/client/Socket$7

/* anonymous class */
    final class Socket._cls7
        implements Runnable
    {

        final Socket a;
        final Socket b;

        public final void run()
        {
            com.github.nkzawa.f.a.a(new Socket._cls7._cls1(this));
        }

            
            {
                b = socket;
                a = socket1;
                super();
            }
    }

}
