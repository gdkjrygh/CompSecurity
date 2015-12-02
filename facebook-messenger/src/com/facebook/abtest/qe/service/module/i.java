// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.abtest.qe.service.module;

import com.facebook.abtest.qe.protocol.sync.user.a;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.abtest.qe.service.module:
//            a, b

class i extends d
{

    final com.facebook.abtest.qe.service.module.a a;

    private i(com.facebook.abtest.qe.service.module.a a1)
    {
        a = a1;
        super();
    }

    i(com.facebook.abtest.qe.service.module.a a1, b b1)
    {
        this(a1);
    }

    public a a()
    {
        return new a(new com.facebook.abtest.qe.protocol.sync.user.d());
    }

    public Object b()
    {
        return a();
    }
}
