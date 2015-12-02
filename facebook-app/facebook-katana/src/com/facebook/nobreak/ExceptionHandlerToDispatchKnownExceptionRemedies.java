// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.nobreak;

import android.app.Application;

// Referenced classes of package com.facebook.nobreak:
//            CrashCounterRemedy, FrameworkSharedPreferencesExceptionRemedy, DiskFullExceptionRemedy, VerifyErrorRemedy

public class ExceptionHandlerToDispatchKnownExceptionRemedies
    implements Thread.UncaughtExceptionHandler
{

    private static ExceptionHandlerToDispatchKnownExceptionRemedies a;
    private static final KnownExceptionRemedy b[] = {
        new CrashCounterRemedy(), new FrameworkSharedPreferencesExceptionRemedy(), new DiskFullExceptionRemedy(), new VerifyErrorRemedy()
    };
    private final Application c;
    private final Thread.UncaughtExceptionHandler d = Thread.getDefaultUncaughtExceptionHandler();

    private ExceptionHandlerToDispatchKnownExceptionRemedies(Application application)
    {
        c = application;
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    public static void a(Application application)
    {
        com/facebook/nobreak/ExceptionHandlerToDispatchKnownExceptionRemedies;
        JVM INSTR monitorenter ;
        if (a == null)
        {
            a = new ExceptionHandlerToDispatchKnownExceptionRemedies(application);
        }
        com/facebook/nobreak/ExceptionHandlerToDispatchKnownExceptionRemedies;
        JVM INSTR monitorexit ;
        return;
        application;
        com/facebook/nobreak/ExceptionHandlerToDispatchKnownExceptionRemedies;
        JVM INSTR monitorexit ;
        throw application;
    }

    public void uncaughtException(Thread thread, Throwable throwable)
    {
        KnownExceptionRemedy aknownexceptionremedy[] = b;
        int j = aknownexceptionremedy.length;
        for (int i = 0; i < j; i++)
        {
            aknownexceptionremedy[i].a(c, throwable);
        }

        d.uncaughtException(thread, throwable);
    }


    private class KnownExceptionRemedy
    {

        public abstract void a(Application application, Throwable throwable);
    }

}
