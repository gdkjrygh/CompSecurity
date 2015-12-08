// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.gsa.shared.util.a;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

public final class b
    implements Executor
{

    private final Handler a;
    private final boolean b;

    public b()
    {
        this((byte)0);
    }

    private b(byte byte0)
    {
        a = new Handler(Looper.getMainLooper());
        b = false;
    }

    public final void execute(Runnable runnable)
    {
        if (b)
        {
            boolean flag;
            if (Looper.getMainLooper() == Looper.myLooper())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                runnable.run();
                return;
            }
        }
        a.post(runnable);
    }
}
