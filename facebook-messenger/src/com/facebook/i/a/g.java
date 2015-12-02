// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.i.a;


// Referenced classes of package com.facebook.i.a:
//            d

class g
    implements Runnable
{

    final d a;

    g(d d1)
    {
        a = d1;
        super();
    }

    public void run()
    {
        if (!d.e(a))
        {
            d.f(a);
        } else
        if (d.g(a) == null)
        {
            d.h(a);
            d.g(a);
            return;
        }
    }
}
