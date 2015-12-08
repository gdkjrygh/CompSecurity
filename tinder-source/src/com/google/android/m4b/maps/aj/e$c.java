// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aj;

import com.google.android.m4b.maps.y.j;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

// Referenced classes of package com.google.android.m4b.maps.aj:
//            f, e

static abstract class <init>
    implements f
{

    private static final Logger a = Logger.getLogger(com/google/android/m4b/maps/aj/e$c.getName());

    public final void a(Runnable runnable, Executor executor)
    {
        j.a(runnable, "Runnable was null.");
        j.a(executor, "Executor was null.");
        try
        {
            executor.execute(runnable);
            return;
        }
        catch (RuntimeException runtimeexception)
        {
            a.log(Level.SEVERE, (new StringBuilder("RuntimeException while executing runnable ")).append(runnable).append(" with executor ").append(executor).toString(), runtimeexception);
        }
    }

    public boolean cancel(boolean flag)
    {
        return false;
    }

    public abstract Object get();

    public Object get(long l, TimeUnit timeunit)
    {
        j.a(timeunit);
        return get();
    }

    public boolean isCancelled()
    {
        return false;
    }

    public boolean isDone()
    {
        return true;
    }


    private ()
    {
    }

    (byte byte0)
    {
        this();
    }
}
