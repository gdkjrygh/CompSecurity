// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.acra;

import android.content.Context;
import android.os.PowerManager;
import org.acra.util.PackageManagerWrapper;

// Referenced classes of package org.acra:
//            ErrorReporter

final class mSendInMemoryReport extends Thread
{

    private boolean mSendInMemoryReport;
    final ErrorReporter this$0;

    private android.os.endInMemoryReport acquireWakeLock()
    {
        if (!(new PackageManagerWrapper(ErrorReporter.access$000(ErrorReporter.this))).hasPermission("android.permission.WAKE_LOCK"))
        {
            return null;
        } else
        {
            android.os.endInMemoryReport endinmemoryreport = ((PowerManager)ErrorReporter.access$000(ErrorReporter.this).getSystemService("power")).newWakeLock(1, "ACRA wakelock");
            endinmemoryreport._mth0();
            return endinmemoryreport;
        }
    }

    public void run()
    {
        android.os.is._cls0 _lcls0 = acquireWakeLock();
        if (mSendInMemoryReport)
        {
            sendInMemoryReport(ErrorReporter.access$000(ErrorReporter.this));
        }
        checkAndSendReports(ErrorReporter.access$000(ErrorReporter.this));
        if (_lcls0 != null)
        {
            _lcls0._mth0();
        }
        return;
        Exception exception;
        exception;
        if (_lcls0 != null)
        {
            _lcls0._mth0();
        }
        throw exception;
    }

    public ()
    {
        this$0 = ErrorReporter.this;
        super();
        mSendInMemoryReport = false;
    }

    public mSendInMemoryReport(boolean flag)
    {
        this$0 = ErrorReporter.this;
        super();
        mSendInMemoryReport = false;
        mSendInMemoryReport = flag;
    }
}
