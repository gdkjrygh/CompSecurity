// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.core;

import io.fabric.sdk.android.c;
import io.fabric.sdk.android.l;
import io.fabric.sdk.android.services.common.BackgroundPriorityRunnable;
import io.fabric.sdk.android.services.common.g;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.crashlytics.android.core:
//            CrashlyticsCore, SessionReport, CreateReportRequest, CreateReportSpiCall, 
//            Report, CrashlyticsUncaughtExceptionHandler

class ReportUploader
{
    private class Worker extends BackgroundPriorityRunnable
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
                    long l1 = ReportUploader.RETRY_INTERVALS[Math.min(i, ReportUploader.RETRY_INTERVALS.length - 1)];
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
            uploadThread = null;
        }

        Worker(float f)
        {
            this$0 = ReportUploader.this;
            super();
            delay = f;
        }
    }


    private static final String CLS_FILE_EXT = ".cls";
    static final Map HEADER_INVALID_CLS_FILE = Collections.singletonMap("X-CRASHLYTICS-INVALID-SESSION", "1");
    private static final short RETRY_INTERVALS[] = {
        10, 20, 30, 60, 120, 300
    };
    private static final FilenameFilter crashFileFilter = new FilenameFilter() {

        public boolean accept(File file, String s)
        {
            return s.endsWith(".cls") && !s.contains("Session");
        }

    };
    private final CreateReportSpiCall createReportCall;
    private final Object fileAccessLock = new Object();
    private Thread uploadThread;

    public ReportUploader(CreateReportSpiCall createreportspicall)
    {
        if (createreportspicall == null)
        {
            throw new IllegalArgumentException("createReportCall must not be null.");
        } else
        {
            createReportCall = createreportspicall;
            return;
        }
    }

    List findReports()
    {
        c.h().a("Fabric", "Checking for crash reports...");
        File afile[];
        synchronized (fileAccessLock)
        {
            afile = CrashlyticsCore.getInstance().getSdkDirectory().listFiles(crashFileFilter);
        }
        obj = new LinkedList();
        int j = afile.length;
        for (int i = 0; i < j; i++)
        {
            File file = afile[i];
            c.h().a("Fabric", (new StringBuilder()).append("Found crash report ").append(file.getPath()).toString());
            ((List) (obj)).add(new SessionReport(file));
        }

        break MISSING_BLOCK_LABEL_122;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        if (((List) (obj)).isEmpty())
        {
            c.h().a("Fabric", "No reports found.");
        }
        return ((List) (obj));
    }

    boolean forceUpload(Report report)
    {
        boolean flag1 = false;
        Object obj1 = fileAccessLock;
        obj1;
        JVM INSTR monitorenter ;
        l l1;
        StringBuilder stringbuilder;
        boolean flag2;
        Object obj = CrashlyticsCore.getInstance().getContext();
        obj = new CreateReportRequest((new g()).a(((android.content.Context) (obj))), report);
        flag2 = createReportCall.invoke(((CreateReportRequest) (obj)));
        l1 = c.h();
        stringbuilder = (new StringBuilder()).append("Crashlytics report upload ");
        String s;
        boolean flag;
        if (flag2)
        {
            s = "complete: ";
        } else
        {
            s = "FAILED: ";
        }
        l1.c("Fabric", stringbuilder.append(s).append(report.getFileName()).toString());
        flag = flag1;
        if (!flag2)
        {
            break MISSING_BLOCK_LABEL_122;
        }
        report.remove();
        flag = true;
_L2:
        obj1;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        c.h().e("Fabric", (new StringBuilder()).append("Error occurred sending report ").append(report).toString(), exception);
        flag = flag1;
        if (true) goto _L2; else goto _L1
_L1:
        report;
        obj1;
        JVM INSTR monitorexit ;
        throw report;
    }

    boolean isUploading()
    {
        return uploadThread != null;
    }

    public void uploadReports()
    {
        uploadReports(0.0F);
    }

    public void uploadReports(float f)
    {
        this;
        JVM INSTR monitorenter ;
        if (uploadThread == null)
        {
            uploadThread = new Thread(new Worker(f), "Crashlytics Report Uploader");
            uploadThread.start();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }



/*
    static Thread access$002(ReportUploader reportuploader, Thread thread)
    {
        reportuploader.uploadThread = thread;
        return thread;
    }

*/

}
