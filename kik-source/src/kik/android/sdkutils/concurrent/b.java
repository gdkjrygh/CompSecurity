// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.sdkutils.concurrent;

import java.util.concurrent.Callable;

public final class b
    implements Runnable, Callable
{

    private final Runnable a;

    public b(Runnable runnable)
    {
        a = runnable;
    }

    public final Object call()
    {
        a.run();
        return null;
    }

    public final void run()
    {
        a.run();
    }
}
