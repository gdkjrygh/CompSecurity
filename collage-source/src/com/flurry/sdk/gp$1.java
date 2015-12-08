// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;


// Referenced classes of package com.flurry.sdk:
//            fy, gp, fi, gd, 
//            fx

class it>
    implements fy
{

    final gp a;

    public void a(fi fi1)
    {
        gd.a(4, a.c, (new StringBuilder()).append("onNetworkStateChanged : isNetworkEnable = ").append(fi1.a).toString());
        if (fi1.a)
        {
            a.e();
        }
    }

    public void notify(fx fx)
    {
        a((fi)fx);
    }

    der(gp gp1)
    {
        a = gp1;
        super();
    }
}
