// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.crash;

import android.app.ApplicationErrorReport;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Looper;
import android.os.Process;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RestartExceptionHandler
    implements Thread.UncaughtExceptionHandler
{

    private static final Logger a = Logger.getLogger("crash");
    private Context b;
    private boolean c;

    public RestartExceptionHandler(Context context)
    {
        b = context;
    }

    public void uncaughtException(Thread thread, Throwable throwable)
    {
        if (c) goto _L2; else goto _L1
_L1:
        c = true;
        a.log(Level.SEVERE, "Uncaught exception", throwable);
        if (thread != Looper.getMainLooper().getThread() || !(throwable instanceof Exception)) goto _L4; else goto _L3
_L3:
        thread = b;
        ApplicationErrorReport applicationerrorreport = new ApplicationErrorReport();
        applicationerrorreport.crashInfo = new android.app.ApplicationErrorReport.CrashInfo(throwable);
        applicationerrorreport.type = 1;
        applicationerrorreport.packageName = thread.getPackageName();
        applicationerrorreport.time = System.currentTimeMillis();
        int i = thread.getApplicationInfo().flags;
        throwable = new Intent("android.intent.action.APP_ERROR");
        throwable.setComponent(ApplicationErrorReport.getErrorReportReceiver(thread, applicationerrorreport.packageName, i));
        throwable.putExtra("android.intent.extra.BUG_REPORT", applicationerrorreport);
        throwable.addFlags(0x10000000);
        thread.startActivity(throwable);
_L5:
        thread = b;
        throwable = thread.getPackageManager().getLaunchIntentForPackage(thread.getPackageName());
        throwable.addFlags(0x4000000);
        throwable.addFlags(32768);
        thread.startActivity(throwable);
_L4:
        Process.killProcess(Process.myPid());
        System.exit(10);
_L2:
        return;
        thread;
        thread.printStackTrace();
          goto _L5
        thread;
        Process.killProcess(Process.myPid());
        System.exit(10);
        throw thread;
    }

}
