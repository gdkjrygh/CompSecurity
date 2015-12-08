// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;

import android.os.Handler;
import android.os.Message;
import android.os.Process;
import java.lang.ref.ReferenceQueue;

// Referenced classes of package com.c.b:
//            b, an

final class am extends Thread
{

    private final ReferenceQueue a;
    private final Handler b;

    am(ReferenceQueue referencequeue, Handler handler)
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
        b b1;
        Message message;
        try
        {
            b1 = (b)a.remove(1000L);
            message = b.obtainMessage();
        }
        catch (InterruptedException interruptedexception)
        {
            return;
        }
        catch (Exception exception)
        {
            b.post(new an(this, exception));
            return;
        }
        if (b1 == null)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        message.what = 3;
        message.obj = b1.a;
        b.sendMessage(message);
          goto _L1
        message.recycle();
          goto _L1
    }
}
