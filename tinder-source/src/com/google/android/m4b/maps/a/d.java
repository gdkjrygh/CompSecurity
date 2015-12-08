// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.a;

import android.os.Handler;
import java.util.concurrent.Executor;

// Referenced classes of package com.google.android.m4b.maps.a:
//            n, k, m, r

public final class d
    implements n
{
    final class a
        implements Runnable
    {

        private final k a;
        private final m b;
        private final Runnable c;
        private d d;

        public final void run()
        {
            if (!a.h) goto _L2; else goto _L1
_L1:
            a.b("canceled-at-delivery");
_L5:
            return;
_L2:
            if (!b.a()) goto _L4; else goto _L3
_L3:
            a.a(b.a);
_L6:
            k k1;
            r r;
            if (b.d)
            {
                a.a("intermediate-response");
            } else
            {
                a.b("done");
            }
            if (c != null)
            {
                c.run();
                return;
            }
            if (true) goto _L5; else goto _L4
_L4:
            k1 = a;
            r = b.c;
            if (k1.d != null)
            {
                k1.d.a(r);
            }
              goto _L6
        }

        public a(k k1, m m1, Runnable runnable)
        {
            d = d.this;
            super();
            a = k1;
            b = m1;
            c = runnable;
        }
    }


    private final Executor a;

    public d(Handler handler)
    {
        a = new Executor(handler) {

            private Handler a;
            private d b;

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

    public d(Executor executor)
    {
        a = executor;
    }

    public final void a(k k1, m m1)
    {
        a(k1, m1, null);
    }

    public final void a(k k1, m m1, Runnable runnable)
    {
        k1.i = true;
        k1.a("post-response");
        a.execute(new a(k1, m1, runnable));
    }

    public final void a(k k1, r r)
    {
        k1.a("post-error");
        r = m.a(r);
        a.execute(new a(k1, r, null));
    }
}
