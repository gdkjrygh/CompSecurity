// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;


// Referenced classes of package com.flurry.sdk:
//            jx, lj, jg, kc, 
//            jw

class it>
    implements jx
{

    final jg a;

    public volatile void a(jw jw)
    {
        a((lj)jw);
    }

    public void a(lj lj1)
    {
        if (jg.a(a) > 0L && jg.a(a) < System.currentTimeMillis())
        {
            kc.a(4, jg.f(), "No location received in 90 seconds , stopping LocationManager");
            jg.b(a);
        }
    }

    (jg jg1)
    {
        a = jg1;
        super();
    }
}
