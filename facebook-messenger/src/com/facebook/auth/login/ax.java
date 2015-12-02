// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.auth.login;

import com.facebook.auth.f.b;
import com.facebook.common.executors.a;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.auth.login:
//            z, ap, aq

class ax extends d
{

    final ap a;

    private ax(ap ap)
    {
        a = ap;
        super();
    }

    ax(ap ap, aq aq)
    {
        this(ap);
    }

    public z a()
    {
        return new z((a)a(com/facebook/common/executors/a), c(com/facebook/auth/f/b), c(com/facebook/auth/f/a));
    }

    public Object b()
    {
        return a();
    }
}
