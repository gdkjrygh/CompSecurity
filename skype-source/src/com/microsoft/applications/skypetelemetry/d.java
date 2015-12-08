// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.applications.skypetelemetry;

import android.content.Context;
import android.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;

// Referenced classes of package com.microsoft.applications.skypetelemetry:
//            b

public final class d
    implements Thread.UncaughtExceptionHandler
{

    private final b a;
    private final String b;

    public d(b b1, Context context)
    {
        if (b1 == null || context == null)
        {
            throw new IllegalArgumentException(String.format("Cannot have null parameters: logger:%s|appContext:%s", new Object[] {
                b1, context
            }));
        } else
        {
            a = b1;
            b = context.getPackageName();
            return;
        }
    }

    public final void uncaughtException(Thread thread, Throwable throwable)
    {
        thread = throwable.getClass().getName();
        StringWriter stringwriter = new StringWriter();
        PrintWriter printwriter = new PrintWriter(stringwriter);
        throwable.printStackTrace(printwriter);
        printwriter.flush();
        printwriter.close();
        throwable = stringwriter.toString();
        a.a(thread, throwable, "UnhandledException", "");
        Log.e(b, throwable);
    }
}
