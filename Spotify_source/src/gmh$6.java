// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.logging.Logger;

final class ang.Object
    implements Runnable
{

    private Runnable a;

    public final void run()
    {
        try
        {
            a.run();
            return;
        }
        catch (Exception exception)
        {
            Logger.c("Error while running a task", new Object[] {
                a
            });
            Assertion.a("Failed to run queued task", exception);
            return;
        }
    }

    (Runnable runnable)
    {
        a = runnable;
        super();
    }
}
