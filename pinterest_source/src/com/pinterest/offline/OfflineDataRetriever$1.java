// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.offline;

import com.pinterest.kit.log.PLog;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.pinterest.offline:
//            OfflineDataRetriever

class a extends Thread
{

    final OfflineDataRetriever a;

    public void run()
    {
        PLog.log("OfflineDataRetriever", "Thread started up.", new Object[0]);
        OfflineDataRetriever.a(a);
        while (OfflineDataRetriever.b(a).get()) ;
        PLog.log("OfflineDataRetriever", "Thread shut down.", new Object[0]);
    }

    (OfflineDataRetriever offlinedataretriever)
    {
        a = offlinedataretriever;
        super();
    }
}
