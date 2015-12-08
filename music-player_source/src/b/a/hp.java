// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import com.b.a.a;

// Referenced classes of package b.a:
//            hw

public final class hp
    implements Thread.UncaughtExceptionHandler
{

    private Thread.UncaughtExceptionHandler a;
    private hw b;

    public hp()
    {
        if (Thread.getDefaultUncaughtExceptionHandler() == this)
        {
            return;
        } else
        {
            a = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(this);
            return;
        }
    }

    public final void a(hw hw1)
    {
        b = hw1;
    }

    public final void uncaughtException(Thread thread, Throwable throwable)
    {
        if (a.k)
        {
            b.a(throwable);
        } else
        {
            b.a(null);
        }
        if (a != null && a != Thread.getDefaultUncaughtExceptionHandler())
        {
            a.uncaughtException(thread, throwable);
        }
    }
}
