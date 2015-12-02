// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

final class btw
    implements Executor
{

    private btw()
    {
    }

    btw(byte byte0)
    {
        this();
    }

    public final void execute(Runnable runnable)
    {
        (new Handler(Looper.getMainLooper())).post(runnable);
    }
}
