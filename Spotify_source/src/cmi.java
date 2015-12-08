// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.locks.Lock;

abstract class cmi
    implements Runnable
{

    private clz a;

    private cmi(clz clz1)
    {
        a = clz1;
        super();
    }

    cmi(clz clz1, byte byte0)
    {
        this(clz1);
    }

    protected abstract void a();

    public void run()
    {
        a.b.lock();
        boolean flag = Thread.interrupted();
        if (flag)
        {
            a.b.unlock();
            return;
        }
        a();
        a.b.unlock();
        return;
        RuntimeException runtimeexception;
        runtimeexception;
        cmk cmk1 = a.a;
        android.os.Message message = cmk1.j.obtainMessage(4, runtimeexception);
        cmk1.j.sendMessage(message);
        a.b.unlock();
        return;
        Exception exception;
        exception;
        a.b.unlock();
        throw exception;
    }
}
