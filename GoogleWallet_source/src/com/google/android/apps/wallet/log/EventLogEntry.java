// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.log;

import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;

public final class EventLogEntry
{

    private final long id;
    private final com.google.wallet.proto.NanoWalletLogging.WalletEventLog walletEventLog;

    public EventLogEntry(long l, com.google.wallet.proto.NanoWalletLogging.WalletEventLog walleteventlog)
    {
        id = l;
        walletEventLog = walleteventlog;
    }

    static List extractIdList(List list)
    {
        java.util.ArrayList arraylist = Lists.newArrayListWithCapacity(list.size());
        for (list = list.iterator(); list.hasNext(); arraylist.add(Long.valueOf(((EventLogEntry)list.next()).getId()))) { }
        return arraylist;
    }

    public final long getId()
    {
        return id;
    }

    public final com.google.wallet.proto.NanoWalletLogging.WalletEventLog getWalletEventLog()
    {
        return walletEventLog;
    }
}
