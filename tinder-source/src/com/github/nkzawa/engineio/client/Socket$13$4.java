// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.github.nkzawa.engineio.client;

import java.util.LinkedList;
import java.util.logging.Logger;

// Referenced classes of package com.github.nkzawa.engineio.client:
//            Socket, Transport

final class b
    implements com.github.nkzawa.b.t.Socket._cls13._cls4
{

    final Runnable a;
    final Runnable b;
    final b c;

    public final transient void a(Object aobj[])
    {
        if (Socket.g(c.c))
        {
            a.run();
            return;
        } else
        {
            b.run();
            return;
        }
    }

    b(b b1, Runnable runnable, Runnable runnable1)
    {
        c = b1;
        a = runnable;
        b = runnable1;
        super();
    }

    // Unreferenced inner class com/github/nkzawa/engineio/client/Socket$13

/* anonymous class */
    final class Socket._cls13
        implements Runnable
    {

        final Socket a;

        public final void run()
        {
            Runnable runnable;
            Object obj;
label0:
            {
                if (Socket.d(a) == Socket.ReadyState.a || Socket.d(a) == Socket.ReadyState.b)
                {
                    Socket.a(a, Socket.ReadyState.c);
                    obj = a;
                    runnable = new Socket._cls13._cls1(((Socket) (obj)));
                    com.github.nkzawa.b.a.a aa[] = new com.github.nkzawa.b.a.a[1];
                    aa[0] = new Socket._cls13._cls2(((Socket) (obj)), aa, runnable);
                    obj = new Socket._cls13._cls3(((Socket) (obj)), aa);
                    if (a.d.size() <= 0)
                    {
                        break label0;
                    }
                    a.b("drain", new Socket._cls13._cls4(this, ((Runnable) (obj)), runnable));
                }
                return;
            }
            if (Socket.g(a))
            {
                ((Runnable) (obj)).run();
                return;
            } else
            {
                runnable.run();
                return;
            }
        }

            
            {
                a = socket;
                super();
            }

        // Unreferenced inner class com/github/nkzawa/engineio/client/Socket$13$1

/* anonymous class */
        final class Socket._cls13._cls1
            implements Runnable
        {

            final Socket a;
            final Socket._cls13 b;

            public final void run()
            {
                Socket.b(a, "forced close");
                Socket.d().fine("socket closing - telling transport to close");
                a.e.c();
            }

                    
                    {
                        b = Socket._cls13.this;
                        a = socket;
                        super();
                    }
        }


        // Unreferenced inner class com/github/nkzawa/engineio/client/Socket$13$2

/* anonymous class */
        final class Socket._cls13._cls2
            implements com.github.nkzawa.b.a.a
        {

            final Socket a;
            final com.github.nkzawa.b.a.a b[];
            final Runnable c;
            final Socket._cls13 d;

            public final transient void a(Object aobj[])
            {
                a.c("upgrade", b[0]);
                a.c("upgradeError", b[0]);
                c.run();
            }

                    
                    {
                        d = Socket._cls13.this;
                        a = socket;
                        b = aa;
                        c = runnable;
                        super();
                    }
        }


        // Unreferenced inner class com/github/nkzawa/engineio/client/Socket$13$3

/* anonymous class */
        final class Socket._cls13._cls3
            implements Runnable
        {

            final Socket a;
            final com.github.nkzawa.b.a.a b[];
            final Socket._cls13 c;

            public final void run()
            {
                a.b("upgrade", b[0]);
                a.b("upgradeError", b[0]);
            }

                    
                    {
                        c = Socket._cls13.this;
                        a = socket;
                        b = aa;
                        super();
                    }
        }

    }

}
