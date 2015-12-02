// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.base.a;

import com.facebook.common.executors.a;
import com.google.common.d.a.ab;

// Referenced classes of package com.facebook.base.a:
//            k, m

class l
    implements Runnable
{

    final ab a;
    final k b;

    l(k k1, ab ab1)
    {
        b = k1;
        a = ab1;
        super();
    }

    public void run()
    {
        com.facebook.base.a.k.a(b);
        a.a_(null);
        k.c(b).b(new m(this));
        k.d(b);
    }
}
