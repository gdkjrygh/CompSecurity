// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.k;

import android.os.Handler;
import java.util.concurrent.Executor;

// Referenced classes of package p.k:
//            o, l, n, s

public class e
    implements o
{
    private class a
        implements Runnable
    {

        final e a;
        private final l b;
        private final n c;
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

        public a(l l1, n n1, Runnable runnable)
        {
            a = e.this;
            super();
            b = l1;
            c = n1;
            d = runnable;
        }
    }


    private final Executor a;

    public e(Handler handler)
    {
        a = new Executor(handler) {

            final Handler a;
            final e b;

            public void execute(Runnable runnable)
            {
                a.post(runnable);
            }

            
            {
                b = e.this;
                a = handler;
                super();
            }
        };
    }

    public void a(l l1, n n1)
    {
        a(l1, n1, null);
    }

    public void a(l l1, n n1, Runnable runnable)
    {
        l1.v();
        l1.a("post-response");
        a.execute(new a(l1, n1, runnable));
    }

    public void a(l l1, s s)
    {
        l1.a("post-error");
        s = n.a(s);
        a.execute(new a(l1, s, null));
    }
}
