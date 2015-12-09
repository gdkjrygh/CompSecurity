// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

final class g.Object
    implements Runnable
{

    private a a;

    public final void run()
    {
        a.a.a();
    }

    t>(t> t>)
    {
        a = t>;
        super();
    }

    // Unreferenced inner class alh$1

/* anonymous class */
    final class alh._cls1 extends gxy
    {

        final alh a;

        public final void b(Activity activity)
        {
            activity = a;
            ((alg) (activity)).b.set(true);
            if (((alg) (activity)).a.get())
            {
                a.c.submit(new alh._cls1._cls1(this));
            }
        }

            
            {
                a = alh1;
                super();
            }
    }

}
