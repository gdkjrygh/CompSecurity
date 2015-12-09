// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.core;

import io.fabric.sdk.android.c;
import io.fabric.sdk.android.l;
import io.fabric.sdk.android.services.common.h;
import io.fabric.sdk.android.services.d.q;
import java.io.File;

// Referenced classes of package com.crashlytics.android.core:
//            CrashlyticsUncaughtExceptionHandler, CrashlyticsCore, ReportUploader, SessionReport

class val.toSend
    implements Runnable
{

    final CrashlyticsUncaughtExceptionHandler this$0;
    final File val$toSend;

    public void run()
    {
        if (h.n(CrashlyticsUncaughtExceptionHandler.access$900(CrashlyticsUncaughtExceptionHandler.this).getContext()))
        {
            c.h().a("Fabric", "Attempting to send crash report at time of crash...");
            Object obj = q.a().b();
            obj = CrashlyticsUncaughtExceptionHandler.access$900(CrashlyticsUncaughtExceptionHandler.this).getCreateReportSpiCall(((io.fabric.sdk.android.services.d.t) (obj)));
            if (obj != null)
            {
                (new ReportUploader(((CreateReportSpiCall) (obj)))).forceUpload(new SessionReport(val$toSend, CrashlyticsUncaughtExceptionHandler.access$1400()));
            }
        }
    }

    I()
    {
        this$0 = final_crashlyticsuncaughtexceptionhandler;
        val$toSend = File.this;
        super();
    }
}
