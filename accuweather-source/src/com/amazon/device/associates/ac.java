// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.associates;


// Referenced classes of package com.amazon.device.associates:
//            aq, p

abstract class ac
{

    protected aq a;

    ac()
    {
        a = new aq();
    }

    protected abstract void a();

    protected abstract void b()
        throws Exception;

    protected abstract String c();

    public void e()
    {
        a();
        long l = System.nanoTime();
        p.c("AbstractServiceCall", (new StringBuilder()).append(c()).append(" Started").toString());
        try
        {
            b();
        }
        catch (Exception exception)
        {
            p.d("AbstractServiceCall", "Error making MobileAssociates service call.");
            p.a("AbstractServiceCall", (new StringBuilder()).append("Service name: ").append(c()).append(" Ex=").append(exception).toString());
        }
        p.c("AbstractServiceCall", (new StringBuilder()).append(c()).append(" Completed").toString());
        l = (System.nanoTime() - l) / 0xf4240L;
        p.c("AbstractServiceCall", (new StringBuilder()).append(c()).append(".Latency=").append(l).append("ms").toString());
    }
}
