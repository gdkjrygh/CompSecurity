// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.auth.broadcast;

import com.facebook.config.a.a;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.auth.broadcast:
//            d, e

class j extends d
{

    final com.facebook.auth.broadcast.d a;

    private j(com.facebook.auth.broadcast.d d1)
    {
        a = d1;
        super();
    }

    j(com.facebook.auth.broadcast.d d1, e e)
    {
        this(d1);
    }

    public com.facebook.base.j a()
    {
        return ((a)a(com/facebook/config/a/a)).j();
    }

    public Object b()
    {
        return a();
    }
}
