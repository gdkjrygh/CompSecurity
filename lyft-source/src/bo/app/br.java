// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import com.appboy.Constants;
import com.appboy.support.AppboyLogger;

// Referenced classes of package bo.app:
//            be

public class br
    implements Thread.UncaughtExceptionHandler
{

    private static final String a;
    private final be b;

    public br(be be1)
    {
        b = be1;
    }

    public void uncaughtException(Thread thread, Throwable throwable)
    {
        try
        {
            AppboyLogger.w(a, "Uncaught exception from thread. Publishing as Throwable event", throwable);
            b.a(throwable, java/lang/Throwable);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Thread thread)
        {
            AppboyLogger.w(a, "Failed to log throwable.", thread);
        }
    }

    static 
    {
        a = String.format("%s.%s", new Object[] {
            Constants.APPBOY_LOG_TAG_PREFIX, bo/app/br.getName()
        });
    }
}
