// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;


// Referenced classes of package com.flurry.sdk:
//            if, ig, kj, kc, 
//            ih

class it>
    implements it>
{

    final ig a;
    final ih b;
    final if c;

    public volatile void a(kj kj1, Object obj)
    {
        a(kj1, (String)obj);
    }

    public void a(kj kj1, String s)
    {
        kc.a(3, com.flurry.sdk.if.b(), (new StringBuilder("Pulse report to ")).append(a.i()).append(" for ").append(a.m()).append(", HTTP status code is: ").append(kj1.h()).toString());
        int i = kj1.h();
        b.a((int)kj1.c());
        b.e = i;
        if (!kj1.f())
        {
            Exception exception = kj1.j();
            if (kj1.d())
            {
                if (kj1.i())
                {
                    kc.a(3, com.flurry.sdk.if.b(), (new StringBuilder("Timeout occured when trying to connect to: ")).append(a.i()).append(". Exception: ").append(kj1.j().getMessage()).toString());
                } else
                {
                    kc.a(3, com.flurry.sdk.if.b(), (new StringBuilder("Manually managed http request timeout occured for: ")).append(a.i()).toString());
                }
                com.flurry.sdk.if.a(c, b, a);
                return;
            } else
            {
                kc.a(3, com.flurry.sdk.if.b(), (new StringBuilder("Error occured when trying to connect to: ")).append(a.i()).append(". Exception: ").append(exception.getMessage()).toString());
                com.flurry.sdk.if.a(c, b, a, s);
                return;
            }
        }
        if (i >= 200 && i < 300)
        {
            com.flurry.sdk.if.b(c, b, a);
            return;
        }
        if (i >= 300 && i < 400)
        {
            com.flurry.sdk.if.a(c, b, a, kj1);
            return;
        } else
        {
            kc.a(3, com.flurry.sdk.if.b(), (new StringBuilder()).append(a.m()).append(" report failed sending to : ").append(a.i()).toString());
            com.flurry.sdk.if.a(c, b, a, s);
            return;
        }
    }

    der(if if1, ig ig1, ih ih1)
    {
        c = if1;
        a = ig1;
        b = ih1;
        super();
    }
}
