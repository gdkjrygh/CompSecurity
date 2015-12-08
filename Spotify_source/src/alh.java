// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

final class alh extends alg
{

    final ExecutorService c;
    private final gxy d = new gxy() {

        final alh a;

        public final void b(Activity activity)
        {
            activity = a;
            ((alg) (activity)).b.set(true);
            if (((alg) (activity)).a.get())
            {
                a.c.submit(new Runnable(this) {

                    private _cls1 a;

                    public final void run()
                    {
                        a.a.a();
                    }

            
            {
                a = _pcls1;
                super();
            }
                });
            }
        }

            
            {
                a = alh.this;
                super();
            }
    };

    public alh(gxw gxw1, ExecutorService executorservice)
    {
        c = executorservice;
        gxw1.a(d);
    }
}
