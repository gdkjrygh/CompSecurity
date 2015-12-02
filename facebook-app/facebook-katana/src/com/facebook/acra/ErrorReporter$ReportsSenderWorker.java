// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.acra;

import android.content.Context;
import android.os.PowerManager;
import com.facebook.acra.util.PackageManagerWrapper;

// Referenced classes of package com.facebook.acra:
//            ErrorReporter, CrashReportData

final class mReportTypesToSend extends Thread
{

    private Throwable exception;
    private CrashReportData mInMemoryReportToSend;
    private final exception mReportTypesToSend[];
    final ErrorReporter this$0;

    private android.os.Worker acquireWakeLock()
    {
        if (!(new PackageManagerWrapper(ErrorReporter.access$000(ErrorReporter.this))).hasPermission("android.permission.WAKE_LOCK"))
        {
            return null;
        } else
        {
            android.os.Worker worker = ((PowerManager)ErrorReporter.access$000(ErrorReporter.this).getSystemService("power")).newWakeLock(1, "ACRA wakelock");
            worker.Counted(false);
            worker.Counted();
            return worker;
        }
    }

    public final Throwable getException()
    {
        return exception;
    }

    public final void run()
    {
        android.os.pe pe;
        android.os.pe pe1;
        pe1 = null;
        pe = null;
        android.os.pe pe2 = acquireWakeLock();
        pe = pe2;
        pe1 = pe2;
        if (mInMemoryReportToSend == null) goto _L2; else goto _L1
_L1:
        pe = pe2;
        pe1 = pe2;
        sendInMemoryReport(ErrorReporter.access$000(ErrorReporter.this), mInMemoryReportToSend);
_L6:
        if (pe2 != null && pe2.mInMemoryReportToSend())
        {
            pe2.mInMemoryReportToSend();
        }
_L4:
        return;
_L2:
        pe = pe2;
        pe1 = pe2;
        checkAndSendReports(ErrorReporter.access$000(ErrorReporter.this), mReportTypesToSend);
        continue; /* Loop/switch isn't completed */
        Throwable throwable;
        throwable;
        pe1 = pe;
        exception = throwable;
        if (pe == null || !pe.exception()) goto _L4; else goto _L3
_L3:
        pe.exception();
        return;
        Exception exception1;
        exception1;
        if (pe1 != null && pe1.exception())
        {
            pe1.exception();
        }
        throw exception1;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public _cls9(CrashReportData crashreportdata)
    {
        this(new <init>[0]);
        mInMemoryReportToSend = crashreportdata;
    }

    public transient mInMemoryReportToSend(mInMemoryReportToSend aminmemoryreporttosend[])
    {
        this$0 = ErrorReporter.this;
        super();
        exception = null;
        mReportTypesToSend = aminmemoryreporttosend;
    }
}
