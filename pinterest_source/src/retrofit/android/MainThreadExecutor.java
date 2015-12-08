// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package retrofit.android;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

public final class MainThreadExecutor
    implements Executor
{

    private final Handler handler = new Handler(Looper.getMainLooper());

    public MainThreadExecutor()
    {
    }

    public final void execute(Runnable runnable)
    {
        handler.post(runnable);
    }
}
