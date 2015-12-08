// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.locks.Lock;

abstract class jzs
    implements Runnable
{

    private jzf a;

    private jzs(jzf jzf1)
    {
        a = jzf1;
        super();
    }

    jzs(jzf jzf1, byte byte0)
    {
        this(jzf1);
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
        jzu jzu1 = a.a;
        android.os.Message message = jzu1.j.obtainMessage(4, runtimeexception);
        jzu1.j.sendMessage(message);
        a.b.unlock();
        return;
        Exception exception;
        exception;
        a.b.unlock();
        throw exception;
    }
}
