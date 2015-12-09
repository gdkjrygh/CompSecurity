// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley;

import android.os.Handler;
import java.util.concurrent.Executor;

// Referenced classes of package com.android.volley:
//            n, k, m, r

public class ExecutorDelivery
    implements n
{
    private class ResponseDeliveryRunnable
        implements Runnable
    {

        final ExecutorDelivery a;
        private final k b;
        private final m c;
        private final Runnable d;

        public void run()
        {
            if (b.j())
            {
                b.b("canceled-at-delivery");
            } else
            {
                if (c.a())
                {
                    b.b(c.a);
                } else
                {
                    b.b(c.c);
                }
                if (c.d)
                {
                    b.a("intermediate-response");
                } else
                {
                    b.b("done");
                }
                if (d != null)
                {
                    d.run();
                    return;
                }
            }
        }

        public ResponseDeliveryRunnable(k k1, m m1, Runnable runnable)
        {
            a = ExecutorDelivery.this;
            super();
            b = k1;
            c = m1;
            d = runnable;
        }
    }


    private final Executor a;

    public ExecutorDelivery(Handler handler)
    {
        a = new Executor(handler) {

            final Handler a;
            final ExecutorDelivery b;

            public void execute(Runnable runnable)
            {
                a.post(runnable);
            }

            
            {
                b = ExecutorDelivery.this;
                a = handler;
                super();
            }
        };
    }

    public void a(k k1, m m1)
    {
        a(k1, m1, null);
    }

    public void a(k k1, m m1, Runnable runnable)
    {
        k1.x();
        k1.a("post-response");
        a.execute(new ResponseDeliveryRunnable(k1, m1, runnable));
    }

    public void a(k k1, r r)
    {
        k1.a("post-error");
        r = m.a(r);
        a.execute(new ResponseDeliveryRunnable(k1, r, null));
    }
}
