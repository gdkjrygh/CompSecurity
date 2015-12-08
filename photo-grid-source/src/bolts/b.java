// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bolts;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

final class b
    implements Executor
{

    private b()
    {
    }

    b(byte byte0)
    {
        this();
    }

    public final void execute(Runnable runnable)
    {
        (new Handler(Looper.getMainLooper())).post(runnable);
    }
}
