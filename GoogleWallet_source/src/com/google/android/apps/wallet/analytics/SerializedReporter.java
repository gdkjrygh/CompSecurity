// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.analytics;

import com.google.android.apps.common.csi.lib.Reporter;
import com.google.android.apps.common.csi.lib.Sender;
import com.google.android.apps.common.csi.lib.Ticker;
import com.google.android.apps.wallet.logging.WLog;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Executor;

public final class SerializedReporter
    implements Reporter
{
    static final class SendReportsTask
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
            com.google.android.apps.common.csi.lib.Sender.SenderException senderexception;
            senderexception;
            WLog.i("SerializedReporter", (new StringBuilder(34)).append("#").append(i).append(" failed to send report").toString(), senderexception);
            i++;
            if (true) goto _L2; else goto _L1
_L1:
        }

        public final void run()
        {
            for (Iterator iterator = params.iterator(); iterator.hasNext(); sendWithRetry((Map)iterator.next())) { }
        }

        public SendReportsTask(Sender sender1, String s, List list, int i)
        {
            sender = sender1;
            csiPrefix = s;
            params = list;
            retryLimit = i;
        }
    }


    private final int batchingSize;
    private final String csiPrefix;
    private final String csiServiceName;
    private final String csiVersion;
    private final Executor executor;
    private final int retryLimit;
    private final Sender sender;
    private final ConcurrentMap sharedParams = new ConcurrentHashMap();
    private final BlockingQueue tickers;

    public SerializedReporter(Sender sender1, Executor executor1, String s, String s1, String s2, int i, int j)
    {
        sender = sender1;
        executor = executor1;
        batchingSize = i;
        csiPrefix = s;
        csiServiceName = s1;
        csiVersion = s2;
        retryLimit = j;
        tickers = new ArrayBlockingQueue(i * 2);
        putSharedParam("s", csiServiceName);
        putSharedParam("v", csiVersion);
    }

    private Map extractParams(Ticker ticker)
    {
        HashMap hashmap = new HashMap();
        if (ticker.getReportItems() != null)
        {
            hashmap.putAll(ticker.getReportItems());
        }
        hashmap.putAll(sharedParams);
        return hashmap;
    }

    private void putSharedParam(String s, String s1)
    {
        sharedParams.put(s, s1);
    }

    private void sendReports()
    {
        Object obj = Lists.newArrayList();
        synchronized (tickers)
        {
            tickers.drainTo(((java.util.Collection) (obj)));
        }
        obj1 = new ArrayList();
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); ((List) (obj1)).add(extractParams((Ticker)((Iterator) (obj)).next()))) { }
        break MISSING_BLOCK_LABEL_76;
        exception;
        obj1;
        JVM INSTR monitorexit ;
        throw exception;
        SendReportsTask sendreportstask = new SendReportsTask(sender, csiPrefix, ((List) (obj1)), retryLimit);
        executor.execute(sendreportstask);
        return;
    }

    public final boolean report(Ticker ticker)
    {
        boolean flag;
        synchronized (tickers)
        {
            flag = tickers.offer(ticker);
        }
        if (!flag)
        {
            WLog.w("SerializedReporter", "CSI ticker buffer full. Dropping ticker");
            return false;
        }
        break MISSING_BLOCK_LABEL_38;
        ticker;
        blockingqueue;
        JVM INSTR monitorexit ;
        throw ticker;
        if (tickers.size() >= batchingSize)
        {
            sendReports();
        }
        return true;
    }
}
