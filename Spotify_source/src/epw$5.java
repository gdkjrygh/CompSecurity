// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.util.Assertion;
import java.util.concurrent.ExecutorService;

final class ang.Object
    implements Runnable
{

    private Runnable a;
    private epw b;

    public final void run()
    {
        if (b.a.isShutdown())
        {
            Assertion.a("Trying to submit to a shut down executor");
            return;
        } else
        {
            b.a.execute(a);
            return;
        }
    }

    (epw epw1, Runnable runnable)
    {
        b = epw1;
        a = runnable;
        super();
    }
}
