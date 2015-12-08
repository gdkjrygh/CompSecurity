// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.userevents;

import com.google.android.apps.wallet.log.WalletEventLogger;

public class UserEventLogger
{

    private final WalletEventLogger eventLogger;

    UserEventLogger(WalletEventLogger walleteventlogger)
    {
        eventLogger = walleteventlogger;
    }

    public final void log(int i, int j)
    {
        log(i, j, null);
    }

    public final void log(int i, int j, com.google.wallet.proto.NanoWalletLogging.UserEventContextExtraInfo usereventcontextextrainfo)
    {
        com.google.wallet.proto.NanoWalletLogging.WalletEventLog walleteventlog = new com.google.wallet.proto.NanoWalletLogging.WalletEventLog();
        walleteventlog.userEventInfo = new com.google.wallet.proto.NanoWalletLogging.UserEventInfo();
        walleteventlog.userEventInfo.userEventContextType = Integer.valueOf(i);
        walleteventlog.userEventInfo.userEventType = Integer.valueOf(j);
        if (usereventcontextextrainfo != null)
        {
            walleteventlog.userEventInfo.contextExtraInfo = usereventcontextextrainfo;
        }
        eventLogger.logEvent(walleteventlog);
    }
}
