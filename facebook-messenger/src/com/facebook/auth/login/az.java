// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.auth.login;

import com.facebook.auth.a.c;
import com.facebook.auth.b.b;
import com.facebook.auth.protocol.h;
import com.facebook.http.protocol.w;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.auth.login:
//            bc, ap, aq

class az extends d
{

    final ap a;

    private az(ap ap)
    {
        a = ap;
        super();
    }

    az(ap ap, aq aq)
    {
        this(ap);
    }

    public bc a()
    {
        return new bc((b)a(com/facebook/auth/b/b), (w)a(com/facebook/http/protocol/w), (h)a(com/facebook/auth/protocol/h), c(com/facebook/auth/a/c));
    }

    public Object b()
    {
        return a();
    }
}
