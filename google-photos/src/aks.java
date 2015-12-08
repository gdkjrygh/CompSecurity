// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import androidx.media.filterpacks.base.DispatchFilter;

public final class aks
    implements aje
{

    private DispatchFilter a;

    public aks(DispatchFilter dispatchfilter)
    {
        a = dispatchfilter;
        super();
    }

    public final void a()
    {
        synchronized (a.mState)
        {
            if (a.mState.a == 1)
            {
                a.mState.a = 2;
            }
        }
        return;
        exception;
        aku1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a(Exception exception)
    {
        throw new RuntimeException("Error during dispatched run!", exception);
    }
}
