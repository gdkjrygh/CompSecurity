// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;

import com.appboy.f;
import com.appboy.f.a;

// Referenced classes of package a.a:
//            aa

public class an
    implements Thread.UncaughtExceptionHandler
{

    private static final String a;
    private final aa b;

    public an(aa aa1)
    {
        b = aa1;
    }

    public void uncaughtException(Thread thread, Throwable throwable)
    {
        try
        {
            com.appboy.f.a.b(a, "Uncaught exception from thread. Publishing as Throwable event", throwable);
            b.a(throwable, java/lang/Throwable);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Thread thread)
        {
            com.appboy.f.a.b(a, "Failed to log throwable.", thread);
        }
    }

    static 
    {
        a = String.format("%s.%s", new Object[] {
            f.a, a/a/an.getName()
        });
    }
}
