// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal;

import android.app.Activity;
import android.app.ApplicationErrorReport;
import android.content.DialogInterface;
import android.content.Intent;
import java.io.PrintWriter;
import java.io.StringWriter;

// Referenced classes of package org.xwalk.core.internal:
//            XWalkViewInternal

class val.activity
    implements android.content.ickListener
{

    final XWalkViewInternal this$0;
    final Activity val$activity;
    final UnsatisfiedLinkError val$err;
    final String val$packageName;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface = new ApplicationErrorReport();
        dialoginterface.type = 1;
        Object obj = val$packageName;
        dialoginterface.processName = ((String) (obj));
        dialoginterface.packageName = ((String) (obj));
        obj = new android.app.rt.CrashInfo();
        obj.exceptionClassName = val$err.getClass().getSimpleName();
        obj.exceptionMessage = "CPU architecture mismatch";
        Object obj1 = new StringWriter();
        PrintWriter printwriter = new PrintWriter(((java.io.Writer) (obj1)));
        val$err.printStackTrace(printwriter);
        obj.stackTrace = ((StringWriter) (obj1)).toString();
        obj1 = val$err.getStackTrace()[0];
        obj.throwClassName = ((StackTraceElement) (obj1)).getClassName();
        obj.throwFileName = ((StackTraceElement) (obj1)).getFileName();
        obj.throwLineNumber = ((StackTraceElement) (obj1)).getLineNumber();
        obj.throwMethodName = ((StackTraceElement) (obj1)).getMethodName();
        dialoginterface.crashInfo = ((android.app.rt.CrashInfo) (obj));
        dialoginterface.systemApp = false;
        dialoginterface.time = System.currentTimeMillis();
        obj = new Intent("android.intent.action.APP_ERROR");
        ((Intent) (obj)).putExtra("android.intent.extra.BUG_REPORT", dialoginterface);
        val$activity.startActivity(((Intent) (obj)));
        val$activity.finish();
    }

    ()
    {
        this$0 = final_xwalkviewinternal;
        val$packageName = s;
        val$err = unsatisfiedlinkerror;
        val$activity = Activity.this;
        super();
    }
}
