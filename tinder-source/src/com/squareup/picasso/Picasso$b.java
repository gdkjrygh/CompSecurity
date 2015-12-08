// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.picasso;

import android.os.Handler;
import android.os.Message;
import android.os.Process;
import java.lang.ref.ReferenceQueue;

// Referenced classes of package com.squareup.picasso:
//            Picasso

private static final class setName extends Thread
{

    private final ReferenceQueue a;
    private final Handler b;

    public final void run()
    {
        Process.setThreadPriority(10);
_L1:
        setName setname;
        Message message;
        try
        {
            setname = (ority)a.remove(1000L);
            message = b.obtainMessage();
        }
        catch (InterruptedException interruptedexception)
        {
            return;
        }
        catch (Exception exception)
        {
            b.post(new Runnable(exception) {

                final Exception a;
                final Picasso.b b;

                public final void run()
                {
                    throw new RuntimeException(a);
                }

            
            {
                b = Picasso.b.this;
                a = exception;
                super();
            }
            });
            return;
        }
        if (setname == null)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        message.what = 3;
        message.obj = setname.a;
        b.sendMessage(message);
          goto _L1
        message.recycle();
          goto _L1
    }

    _cls1.a(ReferenceQueue referencequeue, Handler handler)
    {
        a = referencequeue;
        b = handler;
        setDaemon(true);
        setName("Picasso-refQueue");
    }
}
