// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.github.nkzawa.engineio.client.a;

import java.util.logging.Logger;

// Referenced classes of package com.github.nkzawa.engineio.client.a:
//            a

final class a
    implements Runnable
{

    final a a;
    final b b;

    public final void run()
    {
        com.github.nkzawa.engineio.client.a.a.i().fine("paused");
        com.github.nkzawa.engineio.client.a.a.b(a, com.github.nkzawa.engineio.client.ort.ReadyState.d);
        b.b.run();
    }

    b(b b1, a a1)
    {
        b = b1;
        a = a1;
        super();
    }

    // Unreferenced inner class com/github/nkzawa/engineio/client/a/a$1

/* anonymous class */
    public final class a._cls1
        implements Runnable
    {

        final Runnable a;
        final a b;

        public final void run()
        {
            Object obj = b;
            com.github.nkzawa.engineio.client.a.a.a(b, com.github.nkzawa.engineio.client.Transport.ReadyState.d);
            obj = new a._cls1._cls1(this, ((a) (obj)));
            if (com.github.nkzawa.engineio.client.a.a.a(b) || !b.c)
            {
                int ai[] = new int[1];
                ai[0] = 0;
                if (com.github.nkzawa.engineio.client.a.a.a(b))
                {
                    com.github.nkzawa.engineio.client.a.a.i().fine("we are currently polling - waiting to pause");
                    ai[0] = ai[0] + 1;
                    b.b("pollComplete", new a._cls1._cls2(ai, ((Runnable) (obj))));
                }
                if (!b.c)
                {
                    com.github.nkzawa.engineio.client.a.a.i().fine("we are currently writing - waiting to pause");
                    ai[0] = ai[0] + 1;
                    b.b("drain", new a._cls1._cls3(ai, ((Runnable) (obj))));
                }
                return;
            } else
            {
                ((Runnable) (obj)).run();
                return;
            }
        }

            public 
            {
                b = a1;
                a = runnable;
                super();
            }

        // Unreferenced inner class com/github/nkzawa/engineio/client/a/a$1$2

/* anonymous class */
        final class a._cls1._cls2
            implements com.github.nkzawa.b.a.a
        {

            final int a[];
            final Runnable b;
            final a._cls1 c;

            public final transient void a(Object aobj[])
            {
                com.github.nkzawa.engineio.client.a.a.i().fine("pre-pause polling complete");
                aobj = a;
                Object obj = aobj[0] - 1;
                aobj[0] = obj;
                if (obj == 0)
                {
                    b.run();
                }
            }

                    
                    {
                        c = a._cls1.this;
                        a = ai;
                        b = runnable;
                        super();
                    }
        }


        // Unreferenced inner class com/github/nkzawa/engineio/client/a/a$1$3

/* anonymous class */
        final class a._cls1._cls3
            implements com.github.nkzawa.b.a.a
        {

            final int a[];
            final Runnable b;
            final a._cls1 c;

            public final transient void a(Object aobj[])
            {
                com.github.nkzawa.engineio.client.a.a.i().fine("pre-pause writing complete");
                aobj = a;
                Object obj = aobj[0] - 1;
                aobj[0] = obj;
                if (obj == 0)
                {
                    b.run();
                }
            }

                    
                    {
                        c = a._cls1.this;
                        a = ai;
                        b = runnable;
                        super();
                    }
        }

    }

}
