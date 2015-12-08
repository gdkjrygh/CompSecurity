// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Process;
import java.util.concurrent.Callable;

final class kwx
    implements Runnable
{

    private kxs a;
    private Callable b;

    kwx(kxs kxs1, Callable callable)
    {
        a = kxs1;
        b = callable;
        super();
    }

    public final void run()
    {
        try
        {
            Process.setThreadPriority(10);
            a.b(b.call());
            return;
        }
        catch (Exception exception)
        {
            jqc.f().a(exception, true);
        }
        a.cancel(true);
    }
}
