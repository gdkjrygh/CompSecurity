// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.video.analytics;

import com.facebook.tools.dextr.runtime.detour.ExecutorDetour;

// Referenced classes of package com.facebook.video.analytics:
//            TimedMicroStorage

class a
    implements Runnable
{

    final llback a;
    final TimedMicroStorage b;

    public void run()
    {
        TimedMicroStorage.a();
        TimedMicroStorage.c(b);
        a.hashCode();
        class _cls1
            implements Runnable
        {

            final TimedMicroStorage._cls2 a;

            public void run()
            {
                TimedMicroStorage.a(a.b, a.a);
            }

            _cls1()
            {
                a = TimedMicroStorage._cls2.this;
                super();
            }
        }

        ExecutorDetour.a(TimedMicroStorage.d(b), new _cls1(), 0x6ecf514d);
    }

    llback(TimedMicroStorage timedmicrostorage, llback llback)
    {
        b = timedmicrostorage;
        a = llback;
        super();
    }
}
