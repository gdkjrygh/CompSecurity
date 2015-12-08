// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

final class jny extends Thread
{

    CountDownLatch a;
    boolean b;
    private WeakReference c;
    private long d;

    public jny(jnw jnw1, long l)
    {
        c = new WeakReference(jnw1);
        d = l;
        a = new CountDownLatch(1);
        b = false;
        start();
    }

    private void a()
    {
        jnw jnw1 = (jnw)c.get();
        if (jnw1 != null)
        {
            jnw1.a();
            b = true;
        }
    }

    public final void run()
    {
        try
        {
            if (!a.await(d, TimeUnit.MILLISECONDS))
            {
                a();
            }
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            a();
        }
    }
}
