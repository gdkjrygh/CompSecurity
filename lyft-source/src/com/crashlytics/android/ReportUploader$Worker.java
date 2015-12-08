// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;

import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import io.fabric.sdk.android.services.common.BackgroundPriorityRunnable;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.crashlytics.android:
//            Crashlytics, ReportUploader, CrashlyticsUncaughtExceptionHandler, Report

class b extends BackgroundPriorityRunnable
{

    final ReportUploader a;
    private final float b;

    private void b()
    {
        Object obj;
        Crashlytics crashlytics;
        Fabric.g().a("Fabric", (new StringBuilder()).append("Starting report processing in ").append(b).append(" second(s)...").toString());
        CrashlyticsUncaughtExceptionHandler crashlyticsuncaughtexceptionhandler;
        if (b > 0.0F)
        {
            try
            {
                Thread.sleep((long)(b * 1000F));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Thread.currentThread().interrupt();
                return;
            }
        }
        crashlytics = Crashlytics.f();
        crashlyticsuncaughtexceptionhandler = crashlytics.m();
        obj = a.a();
        if (!crashlyticsuncaughtexceptionhandler.a()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (((List) (obj)).isEmpty() || crashlytics.x())
        {
            break; /* Loop/switch isn't completed */
        }
        Fabric.g().a("Fabric", (new StringBuilder()).append("User declined to send. Removing ").append(((List) (obj)).size()).append(" Report(s).").toString());
        obj = ((List) (obj)).iterator();
        while (((Iterator) (obj)).hasNext()) 
        {
            ((Report)((Iterator) (obj)).next()).a();
        }
        if (true) goto _L1; else goto _L3
_L3:
        int i = 0;
        while (!((List) (obj)).isEmpty() && !Crashlytics.f().m().a()) 
        {
            Fabric.g().a("Fabric", (new StringBuilder()).append("Attempting to send ").append(((List) (obj)).size()).append(" report(s)").toString());
            Report report;
            for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); a.a(report))
            {
                report = (Report)((Iterator) (obj)).next();
            }

            obj = a.a();
            if (!((List) (obj)).isEmpty())
            {
                long l = ReportUploader.b()[Math.min(i, ReportUploader.b().length - 1)];
                Fabric.g().a("Fabric", (new StringBuilder()).append("Report submisson: scheduling delayed retry in ").append(l).append(" seconds").toString());
                try
                {
                    Thread.sleep(l * 1000L);
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

    public void a()
    {
        try
        {
            b();
        }
        catch (Exception exception)
        {
            Fabric.g().d("Fabric", "An unexpected error occurred while attempting to upload crash reports.", exception);
        }
        ReportUploader.a(a, null);
    }

    eptionHandler(ReportUploader reportuploader, float f)
    {
        a = reportuploader;
        super();
        b = f;
    }
}
