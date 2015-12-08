// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley;

import android.os.Handler;
import java.util.concurrent.Executor;

// Referenced classes of package com.android.volley:
//            s, g, n, r, 
//            w

public final class f
    implements s
{
    private final class a
        implements Runnable
    {

        final f a;
        private final n b;
        private final r c;
        private final Runnable d;

        public final void run()
        {
            if (b.h())
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

        public a(n n1, r r1, Runnable runnable)
        {
            a = f.this;
            super();
            b = n1;
            c = r1;
            d = runnable;
        }
    }


    private final Executor a;

    public f(Handler handler)
    {
        a = new g(this, handler);
    }

    public final void a(n n1, r r1)
    {
        a(n1, r1, null);
    }

    public final void a(n n1, r r1, Runnable runnable)
    {
        n1.r();
        n1.a("post-response");
        a.execute(new a(n1, r1, runnable));
    }

    public final void a(n n1, w w)
    {
        n1.a("post-error");
        w = r.a(w);
        a.execute(new a(n1, w, null));
    }
}
