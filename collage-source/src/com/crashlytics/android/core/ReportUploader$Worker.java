// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.core;

import io.fabric.sdk.android.c;
import io.fabric.sdk.android.l;
import io.fabric.sdk.android.services.common.BackgroundPriorityRunnable;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.crashlytics.android.core:
//            ReportUploader, CrashlyticsCore, CrashlyticsUncaughtExceptionHandler, Report

private class delay extends BackgroundPriorityRunnable
{

    private final float delay;
    final ReportUploader this$0;

    private void attemptUploadWithRetry()
    {
        Object obj;
        CrashlyticsCore crashlyticscore;
        c.h().a("Fabric", (new StringBuilder()).append("Starting report processing in ").append(delay).append(" second(s)...").toString());
        CrashlyticsUncaughtExceptionHandler crashlyticsuncaughtexceptionhandler;
        if (delay > 0.0F)
        {
            try
            {
                Thread.sleep((long)(delay * 1000F));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Thread.currentThread().interrupt();
                return;
            }
        }
        crashlyticscore = CrashlyticsCore.getInstance();
        crashlyticsuncaughtexceptionhandler = crashlyticscore.getHandler();
        obj = findReports();
        if (!crashlyticsuncaughtexceptionhandler.isHandlingException()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (((List) (obj)).isEmpty() || crashlyticscore.canSendWithUserApproval())
        {
            break; /* Loop/switch isn't completed */
        }
        c.h().a("Fabric", (new StringBuilder()).append("User declined to send. Removing ").append(((List) (obj)).size()).append(" Report(s).").toString());
        obj = ((List) (obj)).iterator();
        while (((Iterator) (obj)).hasNext()) 
        {
            ((Report)((Iterator) (obj)).next()).remove();
        }
        if (true) goto _L1; else goto _L3
_L3:
        int i = 0;
        while (!((List) (obj)).isEmpty() && !CrashlyticsCore.getInstance().getHandler().isHandlingException()) 
        {
            c.h().a("Fabric", (new StringBuilder()).append("Attempting to send ").append(((List) (obj)).size()).append(" report(s)").toString());
            Report report;
            for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); forceUpload(report))
            {
                report = (Report)((Iterator) (obj)).next();
            }

            obj = findReports();
            if (!((List) (obj)).isEmpty())
            {
                long l1 = ReportUploader.access$100()[Math.min(i, ReportUploader.access$100().length - 1)];
                c.h().a("Fabric", (new StringBuilder()).append("Report submisson: scheduling delayed retry in ").append(l1).append(" seconds").toString());
                try
                {
                    Thread.sleep(l1 * 1000L);
                }
                catch (InterruptedException interruptedexception)
                {
                    Thread.currentThread().interrupt();
                    return;
                }
                i++;
            }
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public void onRun()
    {
        try
        {
            attemptUploadWithRetry();
        }
        catch (Exception exception)
        {
            c.h().e("Fabric", "An unexpected error occurred while attempting to upload crash reports.", exception);
        }
        ReportUploader.access$002(ReportUploader.this, null);
    }

    eptionHandler(float f)
    {
        this$0 = ReportUploader.this;
        super();
        delay = f;
    }
}
