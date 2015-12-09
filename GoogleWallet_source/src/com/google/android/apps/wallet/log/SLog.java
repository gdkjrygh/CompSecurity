// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.log;

import com.google.android.apps.wallet.config.featurecontrol.Feature;
import com.google.android.apps.wallet.config.featurecontrol.FeatureManager;
import java.io.PrintWriter;
import java.io.StringWriter;

// Referenced classes of package com.google.android.apps.wallet.log:
//            LogMessageBouncer, WalletEventLogger

public class SLog
{

    private final LogMessageBouncer bouncer;
    private final FeatureManager featureManager;
    private final WalletEventLogger walletEventLogger;

    SLog(FeatureManager featuremanager, LogMessageBouncer logmessagebouncer, WalletEventLogger walleteventlogger)
    {
        featureManager = featuremanager;
        bouncer = logmessagebouncer;
        walletEventLogger = walleteventlogger;
    }

    private static String getStackTrace(Throwable throwable)
    {
        StringWriter stringwriter = new StringWriter();
        PrintWriter printwriter = new PrintWriter(stringwriter);
        throwable.printStackTrace(printwriter);
        printwriter.flush();
        return stringwriter.toString();
    }

    private void log(String s, String s1, Throwable throwable)
    {
        while (!featureManager.isFeatureEnabled(Feature.SERVER_LOGGING) || !bouncer.permitLogMessage()) 
        {
            return;
        }
        com.google.wallet.proto.NanoWalletLogging.WalletEventLog walleteventlog = new com.google.wallet.proto.NanoWalletLogging.WalletEventLog();
        walleteventlog.logMessage = new com.google.wallet.proto.NanoWalletLogging.LogMessage();
        walleteventlog.logMessage.namespace = s;
        walleteventlog.logMessage.log = truncate(s1);
        if (throwable != null)
        {
            walleteventlog.logMessage.exception = truncate(getStackTrace(throwable));
        }
        walletEventLogger.logEvent(walleteventlog);
    }

    private static String truncate(String s)
    {
        if (s.length() <= 1500)
        {
            return s;
        } else
        {
            return s.substring(0, 1500);
        }
    }

    public final void log(String s, String s1)
    {
        log(s, s1, null);
    }
}
