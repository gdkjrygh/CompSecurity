// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.auth.d;

import com.facebook.auth.b.b;
import com.facebook.auth.login.a;
import com.facebook.fbservice.service.o;
import com.facebook.http.b.ap;

// Referenced classes of package com.facebook.auth.d:
//            b, c

class d extends com.facebook.inject.d
{

    final com.facebook.auth.d.b a;

    private d(com.facebook.auth.d.b b1)
    {
        a = b1;
        super();
    }

    d(com.facebook.auth.d.b b1, c c)
    {
        this(b1);
    }

    public a a()
    {
        return new a((com.facebook.common.executors.a)a(com/facebook/common/executors/a), (o)a(com/facebook/fbservice/service/o), (ap)a(com/facebook/http/b/ap), (b)a(com/facebook/auth/b/b), (com.facebook.auth.userscope.b)a(com/facebook/auth/userscope/b));
    }

    public Object b()
    {
        return a();
    }
}
