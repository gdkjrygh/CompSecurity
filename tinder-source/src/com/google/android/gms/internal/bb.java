// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Handler;
import java.util.concurrent.Executor;

// Referenced classes of package com.google.android.gms.internal:
//            en, zzk, dv, zzr

public final class bb
    implements en
{
    private final class a
        implements Runnable
    {

        final bb a;
        private final zzk b;
        private final dv c;
        private final Runnable d;

        public final void run()
        {
            if (!b.j) goto _L2; else goto _L1
_L1:
            b.b("canceled-at-delivery");
_L5:
            return;
_L2:
            boolean flag;
            if (c.c == null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (!flag) goto _L4; else goto _L3
_L3:
            b.a(c.a);
_L6:
            zzk zzk1;
            zzr zzr;
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
            if (true) goto _L5; else goto _L4
_L4:
            zzk1 = b;
            zzr = c.c;
            if (zzk1.f != null)
            {
                zzk1.f.a(zzr);
            }
              goto _L6
        }

        public a(zzk zzk1, dv dv1, Runnable runnable)
        {
            a = bb.this;
            super();
            b = zzk1;
            c = dv1;
            d = runnable;
        }
    }


    private final Executor a;

    public bb(Handler handler)
    {
        a = new Executor(handler) {

            final Handler a;
            final bb b;

            public final void execute(Runnable runnable)
            {
                a.post(runnable);
            }

            
            {
                b = bb.this;
                a = handler;
                super();
            }
        };
    }

    public final void a(zzk zzk1, dv dv1)
    {
        a(zzk1, dv1, null);
    }

    public final void a(zzk zzk1, dv dv1, Runnable runnable)
    {
        zzk1.k = true;
        zzk1.a("post-response");
        a.execute(new a(zzk1, dv1, runnable));
    }

    public final void a(zzk zzk1, zzr zzr)
    {
        zzk1.a("post-error");
        zzr = new dv(zzr);
        a.execute(new a(zzk1, zzr, null));
    }
}
