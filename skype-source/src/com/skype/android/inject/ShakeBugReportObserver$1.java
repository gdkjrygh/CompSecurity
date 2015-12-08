// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.inject;

import android.app.Activity;
import com.skype.Account;
import com.skype.SkyLib;
import com.skype.android.analytics.AnalyticsPersistentStorage;
import com.skype.android.crash.ShakeBugReportDialog;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.inject:
//            ShakeBugReportObserver

final class rage
    implements a
{

    final ShakeBugReportObserver this$0;
    final Provider val$accountProvider;
    final Activity val$activity;
    final AnalyticsPersistentStorage val$analyticsPersistentStorage;
    final SkyLib val$lib;

    public final void onShake()
    {
        (new ShakeBugReportDialog(val$activity, val$lib, (Account)val$accountProvider.get(), val$analyticsPersistentStorage)).a();
    }

    rage()
    {
        this$0 = final_shakebugreportobserver;
        val$activity = activity1;
        val$lib = skylib;
        val$accountProvider = provider;
        val$analyticsPersistentStorage = AnalyticsPersistentStorage.this;
        super();
    }
}
