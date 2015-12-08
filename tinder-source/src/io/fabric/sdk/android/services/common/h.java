// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.common;

import android.os.Process;

public abstract class h
    implements Runnable
{

    public h()
    {
    }

    public abstract void a();

    public final void run()
    {
        Process.setThreadPriority(10);
        a();
    }
}
