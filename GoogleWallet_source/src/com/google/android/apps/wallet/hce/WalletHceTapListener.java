// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.hce;

import android.app.Application;
import com.google.android.apps.wallet.analytics.AnalyticsCustomDimension;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.hce.tap.NfcSessionLog;
import com.google.android.apps.wallet.hce.tap.TapListener;
import com.google.android.apps.wallet.hce.tap.WalletHcePaymentEvent;
import com.google.android.apps.wallet.log.WalletEventLogger;

// Referenced classes of package com.google.android.apps.wallet.hce:
//            HceTapProcessorService

public class WalletHceTapListener
    implements TapListener
{

    private final AnalyticsUtil analyticsUtil;
    private final Application application;
    private final WalletEventLogger eventLogger;

    WalletHceTapListener(Application application1, WalletEventLogger walleteventlogger, AnalyticsUtil analyticsutil)
    {
        application = application1;
        eventLogger = walleteventlogger;
        analyticsUtil = analyticsutil;
    }

    public final void notifyOfTap(WalletHcePaymentEvent wallethcepaymentevent)
    {
        HceTapProcessorService.notifyTapCompleted(application, wallethcepaymentevent);
        wallethcepaymentevent = wallethcepaymentevent.getNfcSessionLog();
        com.google.wallet.proto.NanoWalletLogging.WalletEventLog walleteventlog = new com.google.wallet.proto.NanoWalletLogging.WalletEventLog();
        walleteventlog.physicalTapLog = wallethcepaymentevent.toPhysicalTapLog();
        eventLogger.logEvent(walleteventlog);
    }

    public final void notifyTapStarted()
    {
        analyticsUtil.sendNfcEvent("TapAndPayInitiated", new AnalyticsCustomDimension[0]);
    }
}
