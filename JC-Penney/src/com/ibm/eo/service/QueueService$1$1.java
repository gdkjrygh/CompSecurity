// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ibm.eo.service;

import com.ibm.eo.util.LogInternal;
import com.ibm.eo.util.PostTask;

// Referenced classes of package com.ibm.eo.service:
//            QueueService

class this._cls1
    implements Runnable
{

    final tion this$1;

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

    ()
    {
        this$1 = this._cls1.this;
        super();
    }
}
