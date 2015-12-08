// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;


// Referenced classes of package com.flurry.sdk:
//            fy, fh, gd, hj, 
//            fx

class it>
    implements fy
{

    final fh a;

    public void a(hj hj1)
    {
        if (fh.a(a) > 0L && fh.a(a) < System.currentTimeMillis())
        {
            gd.a(4, fh.f(), "No location received in 90 seconds , stopping LocationManager");
            fh.b(a);
        }
    }

    public void notify(fx fx)
    {
        a((hj)fx);
    }

    (fh fh1)
    {
        a = fh1;
        super();
    }
}
