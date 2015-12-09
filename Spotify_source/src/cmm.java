// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.locks.Lock;

abstract class cmm
{

    private final cmq a;

    protected cmm(cmq cmq)
    {
        a = cmq;
    }

    protected abstract void a();

    public final void a(cmk cmk1)
    {
        cmk1.a.lock();
        cmq cmq;
        cmq cmq1;
        cmq = cmk1.r;
        cmq1 = a;
        if (cmq != cmq1)
        {
            cmk1.a.unlock();
            return;
        }
        a();
        cmk1.a.unlock();
        return;
        Exception exception;
        exception;
        cmk1.a.unlock();
        throw exception;
    }
}
