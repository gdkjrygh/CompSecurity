// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.service;

import com.pinterest.kit.log.PLog;
import java.io.File;
import java.util.List;

// Referenced classes of package com.pinterest.service:
//            PinUploader, PinterestWorkerService

class this._cls0
    implements Runnable
{

    final PinUploader this$0;

    public void run()
    {
        if (PinUploader.access$000(PinUploader.this) == null)
        {
            return;
        }
        PLog.log("Upload task started!", new Object[0]);
        Object obj = PinUploader.access$100(PinUploader.this);
        obj;
        JVM INSTR monitorenter ;
_L3:
        Exception exception;
        if (PinUploader.access$000(PinUploader.this).size() <= 0)
        {
            break MISSING_BLOCK_LABEL_204;
        }
        if (PinUploader.access$200(PinUploader.this))
        {
            break MISSING_BLOCK_LABEL_123;
        }
        if (PinUploader.access$000(PinUploader.this) != null && PinUploader.access$000(PinUploader.this).size() != 0)
        {
            break MISSING_BLOCK_LABEL_88;
        }
        return;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        if (!PinUploader.access$300(PinUploader.this, (File)PinUploader.access$000(PinUploader.this).get(0)))
        {
            break MISSING_BLOCK_LABEL_176;
        }
        PinUploader.access$202(PinUploader.this, true);
_L1:
        boolean flag = PinUploader.access$200(PinUploader.this);
        if (flag)
        {
            try
            {
                PLog.log("Upload in progress, waiting...", new Object[0]);
                PinUploader.access$100(PinUploader.this).wait();
                PinUploader.access$002(PinUploader.this, PinUploader.access$600(PinUploader.this));
            }
            catch (Exception exception1) { }
            finally { }
        }
        continue; /* Loop/switch isn't completed */
        PLog.log("Upload failed entirely, purging :(", new Object[0]);
        PinUploader.access$400(PinUploader.this, 0x7f0703ac);
        PinUploader.access$500(PinUploader.this);
          goto _L1
        PLog.log("Upload task exiting and closing service! No more uploads!", new Object[0]);
        if (PinUploader.access$700(PinUploader.this) != null)
        {
            PinUploader.access$700(PinUploader.this).onWorkerComplete();
            PinUploader.access$702(PinUploader.this, null);
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        if (true) goto _L3; else goto _L2
_L2:
    }

    rService()
    {
        this$0 = PinUploader.this;
        super();
    }
}
