// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.abtest.qe.service.module;

import com.facebook.abtest.qe.service.b;
import com.facebook.abtest.qe.service.g;
import com.facebook.fbservice.service.e;
import com.facebook.fbservice.service.f;
import com.facebook.fbservice.service.v;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.abtest.qe.service.module:
//            a, b

class c extends d
{

    final a a;

    private c(a a1)
    {
        a = a1;
        super();
    }

    c(a a1, com.facebook.abtest.qe.service.module.b b1)
    {
        this(a1);
    }

    public e a()
    {
        return new v((f)a(com/facebook/abtest/qe/service/c), new v((f)a(com/facebook/abtest/qe/service/b), (e)a(com/facebook/abtest/qe/service/g)));
    }

    public Object b()
    {
        return a();
    }
}
