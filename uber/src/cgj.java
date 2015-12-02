// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.Process;
import java.lang.ref.ReferenceQueue;

final class cgj extends Thread
{

    private final ReferenceQueue a;
    private final Handler b;

    cgj(ReferenceQueue referencequeue, Handler handler)
    {
        a = referencequeue;
        b = handler;
        setDaemon(true);
        setName("Picasso-refQueue");
    }

    public final void run()
    {
        Process.setThreadPriority(10);
        try
        {
            do
            {
                cff cff1 = (cff)a.remove();
                b.sendMessage(b.obtainMessage(3, cff1.a));
            } while (true);
        }
        catch (InterruptedException interruptedexception)
        {
            return;
        }
        catch (Exception exception)
        {
            b.post(new Runnable(exception) {

                final Exception a;
                final cgj b;

                public final void run()
                {
                    throw new RuntimeException(a);
                }

            
            {
                b = cgj.this;
                a = exception;
                super();
            }
            });
        }
    }
}
