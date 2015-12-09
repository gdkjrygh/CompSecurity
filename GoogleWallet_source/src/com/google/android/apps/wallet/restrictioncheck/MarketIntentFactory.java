// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.restrictioncheck;

import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.wallet.logging.WLog;

class MarketIntentFactory
{

    private static final String TAG = com/google/android/apps/wallet/restrictioncheck/MarketIntentFactory.getSimpleName();
    private final Application application;

    public MarketIntentFactory(Application application1)
    {
        application = application1;
    }

    public final Intent create()
    {
        String s = application.getString(com.google.android.apps.walletnfcrel.R.string.market_app_search_format, new Object[] {
            application.getPackageName()
        });
        WLog.vfmt(TAG, "Using Wallet android market URI: %s", new Object[] {
            s
        });
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(s));
        intent.addFlags(0x10000);
        return intent;
    }

}
