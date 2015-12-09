// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amplitude.api;

import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.amplitude.api:
//            c, e, WorkerThread

class a
    implements Runnable
{

    final a a;

    public void run()
    {
        a.a.b(c.f(a.a));
    }

    ean(ean ean)
    {
        a = ean;
        super();
    }

    // Unreferenced inner class com/amplitude/api/AmplitudeClient$7

/* anonymous class */
    class AmplitudeClient._cls7
        implements Runnable
    {

        final long a;
        final c b;

        public void run()
        {
            e e1 = e.a(b.b);
            e1.b(a);
            c.d(b).set(false);
            if (e1.a() > (long)c.e(b))
            {
                b.i.a(new AmplitudeClient._cls7._cls1(this));
                return;
            } else
            {
                c.a(b, false);
                c.a(b, c.g(b));
                return;
            }
        }

            
            {
                b = c1;
                a = l;
                super();
            }
    }

}
