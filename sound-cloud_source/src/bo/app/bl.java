// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import com.appboy.d;

// Referenced classes of package bo.app:
//            az

public class bl
    implements Thread.UncaughtExceptionHandler
{

    private static final String a;
    private final az b;

    public bl(az az1)
    {
        b = az1;
    }

    public void uncaughtException(Thread thread, Throwable throwable)
    {
        try
        {
            b.a(throwable, java/lang/Throwable);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Thread thread)
        {
            return;
        }
    }

    static 
    {
        a = String.format("%s.%s", new Object[] {
            d.a, bo/app/bl.getName()
        });
    }
}
