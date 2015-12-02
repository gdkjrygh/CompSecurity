// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley;

import android.os.Handler;
import java.util.concurrent.Executor;

// Referenced classes of package com.android.volley:
//            l, Request, k, VolleyError

public class f
    implements l
{
    private class a
        implements Runnable
    {

        final f a;
        private final Request b;
        private final k c;
        private final Runnable d;

        public void run()
        {
            if (b.h())
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

        public a(Request request, k k1, Runnable runnable)
        {
            a = f.this;
            super();
            b = request;
            c = k1;
            d = runnable;
        }
    }


    private final Executor a;

    public f(Handler handler)
    {
        a = new Executor(handler) {

            final f a;
            private final Handler b;

            public void execute(Runnable runnable)
            {
                b.post(runnable);
            }

            
            {
                a = f.this;
                b = handler;
                super();
            }
        };
    }

    public void a(Request request, VolleyError volleyerror)
    {
        request.a("post-error");
        volleyerror = k.a(volleyerror);
        a.execute(new a(request, volleyerror, null));
    }

    public void a(Request request, k k1)
    {
        a(request, k1, null);
    }

    public void a(Request request, k k1, Runnable runnable)
    {
        request.v();
        request.a("post-response");
        a.execute(new a(request, k1, runnable));
    }
}
