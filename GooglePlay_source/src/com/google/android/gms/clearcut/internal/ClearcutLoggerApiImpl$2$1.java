// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.clearcut.internal;

import android.os.Process;
import java.util.concurrent.ThreadFactory;

// Referenced classes of package com.google.android.gms.clearcut.internal:
//            ClearcutLoggerApiImpl

final class val.r
    implements Runnable
{

    final val.r this$1;
    final Runnable val$r;

    public final void run()
    {
        Process.setThreadPriority(10);
        val$r.run();
    }

    is._cls0()
    {
        this$1 = final__pcls0;
        val$r = Runnable.this;
        super();
    }

    // Unreferenced inner class com/google/android/gms/clearcut/internal/ClearcutLoggerApiImpl$2

/* anonymous class */
    final class ClearcutLoggerApiImpl._cls2
        implements ThreadFactory
    {

        final ClearcutLoggerApiImpl this$0;

        public final Thread newThread(Runnable runnable)
        {
            return new Thread(runnable. new ClearcutLoggerApiImpl._cls2._cls1());
        }

            
            {
                this$0 = ClearcutLoggerApiImpl.this;
                super();
            }
    }

}
