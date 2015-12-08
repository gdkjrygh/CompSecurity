// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley;

import android.os.Handler;
import java.util.concurrent.Executor;

// Referenced classes of package com.android.volley:
//            j, Request, i, VolleyError

public final class d
    implements j
{
    private final class a
        implements Runnable
    {

        final d a;
        private final Request b;
        private final i c;
        private final Runnable d;

        public final void run()
        {
            if (b.h)
            {
                b.b("canceled-at-delivery");
            } else
            {
                boolean flag;
                if (c.c == null)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (flag)
                {
                    b.a(c.a);
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

        public a(Request request, i k, Runnable runnable)
        {
            a = d.this;
            super();
            b = request;
            c = k;
            d = runnable;
        }
    }


    private final Executor a;

    public d(Handler handler)
    {
        a = new Executor(handler) {

            final Handler a;
            final d b;

            public final void execute(Runnable runnable)
            {
                a.post(runnable);
            }

            
            {
                b = d.this;
                a = handler;
                super();
            }
        };
    }

    public final void a(Request request, VolleyError volleyerror)
    {
        request.a("post-error");
        volleyerror = i.a(volleyerror);
        a.execute(new a(request, volleyerror, null));
    }

    public final void a(Request request, i k)
    {
        a(request, k, null);
    }

    public final void a(Request request, i k, Runnable runnable)
    {
        request.i = true;
        request.a("post-response");
        a.execute(new a(request, k, runnable));
    }
}
