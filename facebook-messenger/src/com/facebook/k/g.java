// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.k;

import com.facebook.base.broadcast.CrossFbAppBroadcast;
import com.facebook.base.broadcast.j;
import com.facebook.common.time.a;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.k:
//            a, e, f

class g extends d
{

    final e a;

    private g(e e)
    {
        a = e;
        super();
    }

    g(e e, f f)
    {
        this(e);
    }

    public com.facebook.k.a a()
    {
        return new com.facebook.k.a((j)a(com/facebook/base/broadcast/j, com/facebook/base/broadcast/CrossFbAppBroadcast), (a)a(com/facebook/common/time/a));
    }

    public Object b()
    {
        return a();
    }
}
