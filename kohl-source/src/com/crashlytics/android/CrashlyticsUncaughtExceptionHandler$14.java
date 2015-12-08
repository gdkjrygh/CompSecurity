// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;

import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.settings.Settings;
import java.io.File;

// Referenced classes of package com.crashlytics.android:
//            CrashlyticsUncaughtExceptionHandler, Crashlytics, ReportUploader, SessionReport

class val.toSend
    implements Runnable
{

    final CrashlyticsUncaughtExceptionHandler this$0;
    final File val$toSend;

    public void run()
    {
        if (CommonUtils.canTryConnection(CrashlyticsUncaughtExceptionHandler.access$700(CrashlyticsUncaughtExceptionHandler.this).getContext()))
        {
            Fabric.getLogger().d("Fabric", "Attempting to send crash report at time of crash...");
            Object obj = Settings.getInstance().awaitSettingsData();
            obj = CrashlyticsUncaughtExceptionHandler.access$700(CrashlyticsUncaughtExceptionHandler.this).getCreateReportSpiCall(((io.fabric.sdk.android.services.settings.SettingsData) (obj)));
            if (obj != null)
            {
                (new ReportUploader(((CreateReportSpiCall) (obj)))).forceUpload(new SessionReport(val$toSend, CrashlyticsUncaughtExceptionHandler.access$1200()));
            }
        }
    }

    ()
    {
        this$0 = final_crashlyticsuncaughtexceptionhandler;
        val$toSend = File.this;
        super();
    }
}
