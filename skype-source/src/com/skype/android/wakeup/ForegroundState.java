// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.wakeup;

import com.skype.android.app.OnForegroundChanged;
import com.skype.android.event.EventBus;
import com.skype.android.event.EventBusInstance;

public class ForegroundState
{

    private boolean a;
    private EventBus b;

    public ForegroundState()
    {
        b = EventBusInstance.a();
    }

    protected final void a()
    {
        this;
        JVM INSTR monitorenter ;
        a = false;
        b.a(new OnForegroundChanged(false));
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    protected final void b()
    {
        this;
        JVM INSTR monitorenter ;
        a = true;
        b.a(new OnForegroundChanged(true));
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final boolean c()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = a;
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }
}
