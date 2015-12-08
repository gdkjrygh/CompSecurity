// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.hce;

import android.app.Application;
import com.google.android.apps.wallet.hce.setup.api.NfcSetupApi;
import com.google.android.apps.wallet.logging.WLog;

public class RotatingAtcListener
    implements com.google.android.apps.wallet.hce.emv.RotatingAtc.Listener
{

    private static final String TAG = com/google/android/apps/wallet/hce/RotatingAtcListener.getSimpleName();
    private final Application application;

    RotatingAtcListener(Application application1)
    {
        application = application1;
    }

    public final void atcThresholdReached()
    {
        WLog.d(TAG, "atcThresholdReached");
        application.startService(NfcSetupApi.getRefreshIntent(application, 2));
    }

    public final void lastAtcUsed()
    {
        WLog.d(TAG, "lastAtcUsed");
        application.startService(NfcSetupApi.getRefreshIntent(application, 0));
    }

}
