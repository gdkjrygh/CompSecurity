// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.applications.telemetry;

import android.content.Context;
import android.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;

// Referenced classes of package com.microsoft.applications.telemetry:
//            ILogger

public class InstrumentedExceptionHandler
    implements Thread.UncaughtExceptionHandler
{

    private final ILogger logger;
    private final String tag;

    public InstrumentedExceptionHandler(ILogger ilogger, Context context)
    {
        if (ilogger == null || context == null)
        {
            throw new IllegalArgumentException(String.format("Cannot have null parameters: logger:%s|appContext:%s", new Object[] {
                ilogger, context
            }));
        } else
        {
            logger = ilogger;
            tag = context.getPackageName();
            return;
        }
    }

    public void uncaughtException(Thread thread, Throwable throwable)
    {
        thread = throwable.getClass().getName();
        StringWriter stringwriter = new StringWriter();
        PrintWriter printwriter = new PrintWriter(stringwriter);
        throwable.printStackTrace(printwriter);
        printwriter.flush();
        printwriter.close();
        throwable = stringwriter.toString();
        logger.logFailure(thread, throwable, "UnhandledException", "", null);
        Log.e(tag, throwable);
    }
}
