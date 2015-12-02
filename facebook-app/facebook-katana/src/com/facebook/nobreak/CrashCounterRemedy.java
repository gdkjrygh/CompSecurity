// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.nobreak;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import com.facebook.common.dextricks.DexLibLoader;
import com.facebook.common.errorreporting.crashcounter.CrashCounter;
import com.facebook.nodex.startup.crashloop.FixCrashLoopService;

public class CrashCounterRemedy
    implements ExceptionHandlerToDispatchKnownExceptionRemedies.KnownExceptionRemedy
{

    private static final String a = com/facebook/nobreak/CrashCounterRemedy.getSimpleName();

    public CrashCounterRemedy()
    {
    }

    private static void a(Context context, CrashCounter crashcounter)
    {
        int i = crashcounter.e();
        if (i > 50 && !crashcounter.b("clear_odex"))
        {
            Log.e(a, "Crash loop detected. Marking odex files as corrupted.");
            crashcounter.a("clear_odex");
            DexLibLoader.b(context);
        } else
        if (i > 300 && !crashcounter.b("crash_loop"))
        {
            Log.e(a, "Crash loop detected. Applying CrashLoop fix.");
            crashcounter.a("crash_loop");
            FixCrashLoopService.a(context);
            return;
        }
    }

    public final void a(Application application, Throwable throwable)
    {
        try
        {
            throwable = new CrashCounter(application);
            throwable.a();
            throwable.c();
            a(((Context) (application)), ((CrashCounter) (throwable)));
            throwable.b();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Application application)
        {
            Log.e(a, "Something went wrong while trying to report new crash to crash counter.", application);
        }
    }

}
