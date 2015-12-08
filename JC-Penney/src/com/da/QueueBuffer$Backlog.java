// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.da;

import com.da.model.DAModel;

// Referenced classes of package com.da:
//            DigitalAnalyticsModule, TagUtil, QueueBuffer, LoggingUtil

final class <init>
{

    private static final String BUFFER_FILE = "QueueBuffer";
    private static final int DISCONNECTED_WINDOW_SIZE = 10;
    private int currentWindowSize;

    private void cleanup()
    {
        TagUtil.deleteFile(DigitalAnalyticsModule.getInstance().getApplication(), "QueueBuffer");
    }

    private void persistToLocalStorage(DAModel damodel)
    {
        TagUtil.writeToFile(DigitalAnalyticsModule.getInstance().getApplication(), "QueueBuffer", damodel.toString());
    }

    private void post(DAModel damodel)
    {
        this;
        JVM INSTR monitorenter ;
        if (!QueueBuffer.access$300()) goto _L2; else goto _L1
_L1:
        postToConnectedQueue(damodel);
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (currentWindowSize <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        postToDisconnectedQueue(damodel);
_L5:
        currentWindowSize = currentWindowSize - 1;
        if (true) goto _L4; else goto _L3
        damodel;
        throw damodel;
_L3:
        persistToLocalStorage(damodel);
        LoggingUtil.log((new StringBuilder()).append("(BackLog)Saved: ").append(damodel).toString(), 3);
          goto _L5
    }

    private void postToConnectedQueue(DAModel damodel)
    {
        DAModel damodel1 = readFromLocalStorage();
        if (damodel1 != null)
        {
            LoggingUtil.log((new StringBuilder()).append("(BackLog)Posting BackLog To a Connected Queue: ").append(damodel1).toString(), 3);
            QueueBuffer.access$400(damodel1);
        }
        LoggingUtil.log((new StringBuilder()).append("(BackLog)Posting To a Connected Queue: ").append(damodel).toString(), 3);
        QueueBuffer.access$400(damodel);
        QueueBuffer.access$500();
    }

    private void postToDisconnectedQueue(DAModel damodel)
    {
        LoggingUtil.log((new StringBuilder()).append("(BackLog)Posting To a Disconnected Queue: ").append(damodel).toString(), 3);
        QueueBuffer.access$400(damodel);
    }

    private DAModel readFromLocalStorage()
    {
        String s = TagUtil.readFromFile(DigitalAnalyticsModule.getInstance().getApplication(), "QueueBuffer");
        DAModel damodel = null;
        if (s != null)
        {
            damodel = new DAModel(s);
        }
        return damodel;
    }



    private le()
    {
        currentWindowSize = 10;
    }

    currentWindowSize(currentWindowSize currentwindowsize)
    {
        this();
    }
}
