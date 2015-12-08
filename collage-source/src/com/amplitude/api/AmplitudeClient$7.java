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

    final long a;
    final c b;

    public void run()
    {
        e e1 = e.a(b.b);
        e1.b(a);
        c.d(b).set(false);
        if (e1.a() > (long)c.e(b))
        {
            b.i.a(new Runnable() {

                final AmplitudeClient._cls7 a;

                public void run()
                {
                    a.b.b(c.f(a.b));
                }

            
            {
                a = AmplitudeClient._cls7.this;
                super();
            }
            });
            return;
        } else
        {
            c.a(b, false);
            c.a(b, c.g(b));
            return;
        }
    }

    _cls1.a(c c1, long l)
    {
        b = c1;
        a = l;
        super();
    }
}
