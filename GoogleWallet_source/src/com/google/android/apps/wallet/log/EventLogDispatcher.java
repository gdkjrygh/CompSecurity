// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.log;

import com.google.android.apps.wallet.base.java.System;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.rpc.RpcCaller;
import com.google.android.apps.wallet.rpc.RpcException;
import com.google.android.apps.wallet.util.proto.Protos;
import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.google.android.apps.wallet.log:
//            EventLogEntry, EventLogDataStore

public class EventLogDispatcher
{

    private static final String TAG = com/google/android/apps/wallet/log/EventLogDispatcher.getSimpleName();
    private final EventLogDataStore eventLogDataStore;
    private final AtomicBoolean isUploadPending;
    private final RpcCaller rpcCaller;
    private final System system;

    EventLogDispatcher(EventLogDataStore eventlogdatastore, RpcCaller rpccaller, System system1, AtomicBoolean atomicboolean)
    {
        eventLogDataStore = eventlogdatastore;
        rpcCaller = rpccaller;
        system = system1;
        isUploadPending = atomicboolean;
    }

    private com.google.wallet.proto.NanoWalletLogging.WalletEventLogRequest buildRequest(List list)
    {
        java.util.ArrayList arraylist = Lists.newArrayListWithCapacity(list.size());
        for (list = list.iterator(); list.hasNext(); arraylist.add(((EventLogEntry)list.next()).getWalletEventLog())) { }
        list = new com.google.wallet.proto.NanoWalletLogging.WalletEventLogRequest();
        System system1 = system;
        list.clientRequestTimeMicros = Long.valueOf(System.currentTimeMillis() * 1000L);
        list.walletEventLogs = (com.google.wallet.proto.NanoWalletLogging.WalletEventLog[])arraylist.toArray(((com.google.wallet.proto.NanoWalletLogging.WalletEventLogRequest) (list)).walletEventLogs);
        return list;
    }

    private void send(List list)
        throws RpcException
    {
        List list1 = EventLogEntry.extractIdList(list);
        list = buildRequest(list);
        int i = Protos.valueWithDefault(((com.google.wallet.proto.NanoWalletLogging.WalletEventLogResponse)rpcCaller.call("/b/logging/logEvent", list, new com.google.wallet.proto.NanoWalletLogging.WalletEventLogResponse())).status, 1);
        if (i != 1)
        {
            WLog.e(TAG, (new StringBuilder(50)).append("logEvent failure - giving up, status = ").append(i).toString());
        }
        eventLogDataStore.deleteIds(list1);
    }

    public final boolean dispatchAll()
    {
        boolean flag = false;
        this;
        JVM INSTR monitorenter ;
        List list;
        isUploadPending.set(false);
        list = eventLogDataStore.peek(10);
_L2:
        if (list.isEmpty())
        {
            break; /* Loop/switch isn't completed */
        }
        WLog.vfmt("EventLogDispatcherImpl", "sending %d event log entries", new Object[] {
            Integer.valueOf(list.size())
        });
        send(list);
        list = eventLogDataStore.peek(10);
        if (true) goto _L2; else goto _L1
_L1:
        flag = true;
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
        Object obj;
        obj;
        if (true) goto _L4; else goto _L3
_L3:
        obj;
        throw obj;
    }

}
