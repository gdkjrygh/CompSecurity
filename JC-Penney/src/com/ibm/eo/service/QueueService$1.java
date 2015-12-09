// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ibm.eo.service;

import android.os.Handler;
import java.util.TimerTask;

// Referenced classes of package com.ibm.eo.service:
//            QueueService

class val.handler extends TimerTask
{

    final QueueService this$0;
    final Handler val$handler;

    public void run()
    {
        class _cls1
            implements Runnable
        {

            final QueueService._cls1 this$1;

            public void run()
            {
                try
                {
                    if (QueueService.access$000() == null)
                    {
                        PostTask _tmp = QueueService.access$002(new PostTask());
                        QueueService.access$000().execute(new Void[0]);
                    }
                    return;
                }
                catch (Exception exception)
                {
                    LogInternal.logException(exception);
                }
            }

            _cls1()
            {
                this$1 = QueueService._cls1.this;
                super();
            }
        }

        val$handler.post(new _cls1());
    }

    _cls1()
    {
        this$0 = final_queueservice;
        val$handler = Handler.this;
        super();
    }
}
