// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk;


// Referenced classes of package com.paypal.android.sdk:
//            aW, bg, be, bh, 
//            R

final class aX
    implements Runnable
{

    private bg a;
    private aW b;

    aX(aW aw, bg bg1)
    {
        b = aw;
        a = bg1;
        super();
    }

    public final void run()
    {
        aW.c();
        (new StringBuilder("Mock executing ")).append(a.o()).append(" request: ").append(a.g());
        if (b.c(a))
        {
            String s = b.a();
            a.i().a();
            (new StringBuilder("mock failure:\n")).append(s);
            a.b(s);
            aW.a(a, b.b());
        } else
        {
            String s1 = a.e();
            if (R.b(s1))
            {
                throw new RuntimeException((new StringBuilder("Blank mock value for ")).append(a.i()).toString());
            }
            a.i().a();
            (new StringBuilder("mock response:")).append(s1);
            a.b(s1);
            aW.a(a);
        }
        if (!a.a())
        {
            try
            {
                aW.c();
                (new StringBuilder("sleep for [")).append(b.b).append(" ms].");
                Thread.sleep(b.b);
                aW.c();
                (new StringBuilder("end [")).append(b.b).append(" ms] sleep");
            }
            catch (InterruptedException interruptedexception)
            {
                a.i().a();
            }
            b.a.a(a);
        }
    }
}
