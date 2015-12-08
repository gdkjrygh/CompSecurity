// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.core;

import io.fabric.sdk.android.c;
import io.fabric.sdk.android.h;
import io.fabric.sdk.android.k;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.settings.q;
import java.io.File;

// Referenced classes of package com.crashlytics.android.core:
//            CrashlyticsUncaughtExceptionHandler, CrashlyticsCore, ReportUploader, SessionReport

class a
    implements Runnable
{

    final File a;
    final CrashlyticsUncaughtExceptionHandler b;

    public void run()
    {
        if (CommonUtils.l(((h) (CrashlyticsUncaughtExceptionHandler.f(b))).n))
        {
            c.a().a("CrashlyticsCore", "Attempting to send crash report at time of crash...");
            Object obj = io.fabric.sdk.android.services.settings.().a();
            obj = CrashlyticsUncaughtExceptionHandler.f(b).a(((io.fabric.sdk.android.services.settings.s) (obj)));
            if (obj != null)
            {
                (new ReportUploader(((CreateReportSpiCall) (obj)))).a(new SessionReport(a, CrashlyticsUncaughtExceptionHandler.b()));
            }
        }
    }

    I(CrashlyticsUncaughtExceptionHandler crashlyticsuncaughtexceptionhandler, File file)
    {
        b = crashlyticsuncaughtexceptionhandler;
        a = file;
        super();
    }
}
