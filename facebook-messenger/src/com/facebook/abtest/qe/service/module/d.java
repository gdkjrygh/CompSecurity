// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.abtest.qe.service.module;

import com.facebook.abtest.qe.c.e;
import com.facebook.abtest.qe.g.a;
import com.facebook.abtest.qe.service.b;

// Referenced classes of package com.facebook.abtest.qe.service.module:
//            a, b

class d extends com.facebook.inject.d
{

    final com.facebook.abtest.qe.service.module.a a;

    private d(com.facebook.abtest.qe.service.module.a a1)
    {
        a = a1;
        super();
    }

    d(com.facebook.abtest.qe.service.module.a a1, com.facebook.abtest.qe.service.module.b b1)
    {
        this(a1);
    }

    public b a()
    {
        return new b((a)a(com/facebook/abtest/qe/g/a), (e)a(com/facebook/abtest/qe/c/e));
    }

    public Object b()
    {
        return a();
    }
}
