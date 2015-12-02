// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.abtest.qe.service.module;

import com.facebook.abtest.qe.g.a;
import com.facebook.abtest.qe.service.c;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.abtest.qe.service.module:
//            a, b

class e extends d
{

    final com.facebook.abtest.qe.service.module.a a;

    private e(com.facebook.abtest.qe.service.module.a a1)
    {
        a = a1;
        super();
    }

    e(com.facebook.abtest.qe.service.module.a a1, b b1)
    {
        this(a1);
    }

    public c a()
    {
        return new c((a)a(com/facebook/abtest/qe/g/a), (com.facebook.abtest.qe.b.a)a(com/facebook/abtest/qe/b/a));
    }

    public Object b()
    {
        return a();
    }
}
