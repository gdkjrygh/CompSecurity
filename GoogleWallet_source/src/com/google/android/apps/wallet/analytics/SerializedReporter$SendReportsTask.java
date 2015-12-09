// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.analytics;

import com.google.android.apps.common.csi.lib.Sender;
import com.google.android.apps.wallet.logging.WLog;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.android.apps.wallet.analytics:
//            SerializedReporter

static final class retryLimit
    implements Runnable
{

    private final String csiPrefix;
    private final List params;
    private final int retryLimit;
    private final Sender sender;

    private void sendWithRetry(Map map)
    {
        int i = 0;
_L2:
        if (i > retryLimit)
        {
            break MISSING_BLOCK_LABEL_22;
        }
        sender.send(csiPrefix, map);
        return;
        com.google.android.apps.common.csi.lib.k k;
        k;
        WLog.i("SerializedReporter", (new StringBuilder(34)).append("#").append(i).append(" failed to send report").toString(), k);
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final void run()
    {
        for (Iterator iterator = params.iterator(); iterator.hasNext(); sendWithRetry((Map)iterator.next())) { }
    }

    public Q(Sender sender1, String s, List list, int i)
    {
        sender = sender1;
        csiPrefix = s;
        params = list;
        retryLimit = i;
    }
}
