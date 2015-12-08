// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.analytics.framework;

import com.snapchat.android.Timber;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.snapchat.android.analytics.framework:
//            BlizzardEventLogger, DatabaseHelper, WorkerThread

class a
    implements Runnable
{

    private a a;

    public void run()
    {
        BlizzardEventLogger.m(a.a);
    }

    ( )
    {
        a = ;
        super();
    }

    // Unreferenced inner class com/snapchat/android/analytics/framework/BlizzardEventLogger$9

/* anonymous class */
    class BlizzardEventLogger._cls9
        implements Runnable
    {

        final BlizzardEventLogger a;
        private int b;
        private long c;
        private long d;

        public void run()
        {
            DatabaseHelper databasehelper = DatabaseHelper.a(BlizzardEventLogger.i(a));
            if (b == 200)
            {
                if (BlizzardEventLogger.j(a))
                {
                    BlizzardEventLogger.k(a);
                }
            } else
            if (c > 0L)
            {
                if (!BlizzardEventLogger.j(a))
                {
                    BlizzardEventLogger.c(a, System.currentTimeMillis());
                }
                BlizzardEventLogger.d(a, c);
            } else
            {
                Timber.e("com.snapchat.android.analaytics.framework.BlizzardEventLogger", "Uploaded to server with 0 events.", new Object[0]);
            }
            databasehelper.a(d);
            BlizzardEventLogger.l(a).set(false);
            if (databasehelper.a() > 30L)
            {
                a.e.a(new BlizzardEventLogger._cls9._cls1(this));
            }
        }

            
            {
                a = blizzardeventlogger;
                b = i;
                c = l;
                d = l1;
                super();
            }
    }

}
