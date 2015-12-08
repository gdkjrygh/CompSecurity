// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.Message;
import android.os.Process;
import java.lang.ref.ReferenceQueue;

public final class gvu extends Thread
{

    private final ReferenceQueue a;
    private final Handler b;

    public gvu(ReferenceQueue referencequeue, Handler handler)
    {
        a = referencequeue;
        b = handler;
        setDaemon(true);
        setName("Picasso-refQueue");
    }

    public final void run()
    {
        Process.setThreadPriority(10);
_L1:
        gva gva1;
        Message message;
        try
        {
            gva1 = (gva)a.remove(1000L);
            message = b.obtainMessage();
        }
        catch (InterruptedException interruptedexception)
        {
            return;
        }
        catch (Exception exception)
        {
            b.post(new Runnable(exception) {

                private Exception a;

                public final void run()
                {
                    throw new RuntimeException(a);
                }

            
            {
                a = exception;
                super();
            }
            });
            return;
        }
        if (gva1 == null)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        message.what = 3;
        message.obj = gva1.a;
        b.sendMessage(message);
          goto _L1
        message.recycle();
          goto _L1
    }
}
