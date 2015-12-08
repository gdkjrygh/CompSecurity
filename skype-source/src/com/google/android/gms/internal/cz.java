// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Handler;
import java.util.concurrent.Executor;

// Referenced classes of package com.google.android.gms.internal:
//            iy, ia, iw, kp

public final class cz
    implements iy
{
    private final class a
        implements Runnable
    {

        final cz a;
        private final ia b;
        private final iw c;
        private final Runnable d;

        public final void run()
        {
            if (b.g())
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

        public a(ia ia1, iw iw1, Runnable runnable)
        {
            a = cz.this;
            super();
            b = ia1;
            c = iw1;
            d = runnable;
        }
    }


    private final Executor a;

    public cz(Handler handler)
    {
        a = new Executor(handler) {

            final Handler a;
            final cz b;

            public final void execute(Runnable runnable)
            {
                a.post(runnable);
            }

            
            {
                b = cz.this;
                a = handler;
                super();
            }
        };
    }

    public final void a(ia ia1, iw iw1)
    {
        a(ia1, iw1, null);
    }

    public final void a(ia ia1, iw iw1, Runnable runnable)
    {
        ia1.l();
        ia1.a("post-response");
        a.execute(new a(ia1, iw1, runnable));
    }

    public final void a(ia ia1, kp kp)
    {
        ia1.a("post-error");
        kp = iw.a(kp);
        a.execute(new a(ia1, kp, null));
    }
}
