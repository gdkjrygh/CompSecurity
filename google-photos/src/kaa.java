// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.locks.Lock;

abstract class kaa
{

    private final kae a;

    protected kaa(kae kae)
    {
        a = kae;
    }

    protected abstract void a();

    public final void a(jzu jzu1)
    {
        jzu1.a.lock();
        kae kae;
        kae kae1;
        kae = jzu1.s;
        kae1 = a;
        if (kae != kae1)
        {
            jzu1.a.unlock();
            return;
        }
        a();
        jzu1.a.unlock();
        return;
        Exception exception;
        exception;
        jzu1.a.unlock();
        throw exception;
    }
}
