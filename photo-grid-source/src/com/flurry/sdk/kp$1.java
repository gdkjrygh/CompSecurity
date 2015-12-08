// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;


// Referenced classes of package com.flurry.sdk:
//            jx, kp, jh, kc, 
//            jw

class it>
    implements jx
{

    final kp a;

    public void a(jh jh1)
    {
        kc.a(4, a.a, (new StringBuilder("onNetworkStateChanged : isNetworkEnable = ")).append(jh1.a).toString());
        if (jh1.a)
        {
            a.e();
        }
    }

    public volatile void a(jw jw)
    {
        a((jh)jw);
    }

    der(kp kp1)
    {
        a = kp1;
        super();
    }
}
