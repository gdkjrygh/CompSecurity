// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.snapchat.android.analytics.CameraEventAnalytics;
import java.util.concurrent.atomic.AtomicBoolean;

public static final class >
{

    protected >()
    {
    }

    // Unreferenced inner class rQ$a$1

/* anonymous class */
    final class _cls1
        implements Runnable
    {

        private AtomicBoolean a;
        private CameraEventAnalytics b;

        public final void run()
        {
            try
            {
                Thread.sleep(5000L);
                if (a.get())
                {
                    b.h();
                }
                return;
            }
            catch (InterruptedException interruptedexception)
            {
                return;
            }
        }

            
            {
                a = atomicboolean;
                b = cameraeventanalytics;
                super();
            }
    }

}
