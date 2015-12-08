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

class a
    implements Runnable
{

    final File a;
    final CrashlyticsUncaughtExceptionHandler b;

    public void run()
    {
        if (CommonUtils.n(CrashlyticsUncaughtExceptionHandler.d(b).C()))
        {
            Fabric.g().a("Fabric", "Attempting to send crash report at time of crash...");
            Object obj = Settings.a().b();
            obj = CrashlyticsUncaughtExceptionHandler.d(b).a(((io.fabric.sdk.android.services.settings.SettingsData) (obj)));
            if (obj != null)
            {
                (new ReportUploader(((CreateReportSpiCall) (obj)))).a(new SessionReport(a, CrashlyticsUncaughtExceptionHandler.i()));
            }
        }
    }

    (CrashlyticsUncaughtExceptionHandler crashlyticsuncaughtexceptionhandler, File file)
    {
        b = crashlyticsuncaughtexceptionhandler;
        a = file;
        super();
    }
}
