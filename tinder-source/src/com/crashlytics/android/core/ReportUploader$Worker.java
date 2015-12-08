// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.core;

import io.fabric.sdk.android.c;
import io.fabric.sdk.android.k;
import io.fabric.sdk.android.services.common.h;
import io.fabric.sdk.android.services.settings.q;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.crashlytics.android.core:
//            ReportUploader, CrashlyticsCore, CrashlyticsUncaughtExceptionHandler, Report

private class b extends h
{

    final ReportUploader a;
    private final float b;

    public final void a()
    {
        float f;
        c.a().a("CrashlyticsCore", (new StringBuilder("Starting report processing in ")).append(b).append(" second(s)...").toString());
        f = b;
        if (f <= 0.0F)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        Thread.sleep((long)(b * 1000F));
        Object obj;
        CrashlyticsCore crashlyticscore = CrashlyticsCore.f();
        CrashlyticsUncaughtExceptionHandler crashlyticsuncaughtexceptionhandler = crashlyticscore.b;
        obj = a.a();
        if (!crashlyticsuncaughtexceptionhandler.e.get())
        {
            if (((List) (obj)).isEmpty() || ((Boolean)io.fabric.sdk.android.services.settings.er.e().a(new t>(crashlyticscore), Boolean.valueOf(true))).booleanValue())
            {
                break MISSING_BLOCK_LABEL_421;
            }
            c.a().a("CrashlyticsCore", (new StringBuilder("User declined to send. Removing ")).append(((List) (obj)).size()).append(" Report(s).").toString());
            for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); ((Report)((Iterator) (obj)).next()).a()) { }
        }
_L1:
        ReportUploader.a(a);
        return;
        obj;
        try
        {
            Thread.currentThread().interrupt();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            c.a().c("CrashlyticsCore", "An unexpected error occurred while attempting to upload crash reports.", ((Throwable) (obj)));
        }
          goto _L1
_L4:
        if (((List) (obj)).isEmpty() || CrashlyticsCore.f().b.e.get()) goto _L1; else goto _L2
_L2:
        c.a().a("CrashlyticsCore", (new StringBuilder("Attempting to send ")).append(((List) (obj)).size()).append(" report(s)").toString());
        Report report;
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); a.a(report))
        {
            report = (Report)((Iterator) (obj)).next();
        }

        List list = a.a();
        obj = list;
        if (list.isEmpty()) goto _L4; else goto _L3
_L3:
        int i;
        long l;
        l = ReportUploader.b()[Math.min(i, ReportUploader.b().length - 1)];
        c.a().a("CrashlyticsCore", (new StringBuilder("Report submisson: scheduling delayed retry in ")).append(l).append(" seconds").toString());
        Thread.sleep(l * 1000L);
        i++;
        obj = list;
          goto _L4
        InterruptedException interruptedexception;
        interruptedexception;
        Thread.currentThread().interrupt();
          goto _L1
        i = 0;
          goto _L4
    }

    eptionHandler(ReportUploader reportuploader, float f)
    {
        a = reportuploader;
        super();
        b = f;
    }
}
