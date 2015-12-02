// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.l;

import com.facebook.debug.log.b;
import com.google.common.d.a.h;

// Referenced classes of package com.facebook.l:
//            k

class o
    implements h
{

    final k a;

    o(k k1)
    {
        a = k1;
        super();
    }

    public volatile void a(Object obj)
    {
        a((Void)obj);
    }

    public void a(Throwable throwable)
    {
        k.a(a, false);
        b.c(k.j(), "Failed to load facebook users", throwable);
    }

    public void a(Void void1)
    {
        k.d(a);
    }
}
