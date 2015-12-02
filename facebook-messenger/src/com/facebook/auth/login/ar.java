// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.auth.login;

import com.facebook.auth.a.b;
import com.facebook.auth.annotations.ShouldExpireAuthToken;
import com.facebook.auth.annotations.ShouldRequestSessionCookiesWithAuth;
import com.facebook.auth.b.a;
import com.facebook.auth.protocol.c;
import com.facebook.auth.protocol.e;
import com.facebook.http.protocol.aq;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.auth.login:
//            o, am, a, ap, 
//            aq

class ar extends d
{

    final ap a;

    private ar(ap ap)
    {
        a = ap;
        super();
    }

    ar(ap ap, com.facebook.auth.login.aq aq1)
    {
        this(ap);
    }

    public o a()
    {
        return new o((a)a(com/facebook/auth/b/a), (com.facebook.prefs.shared.d)a(com/facebook/prefs/shared/d), c(com/facebook/auth/a/b), (c)a(com/facebook/auth/protocol/c), (e)a(com/facebook/auth/protocol/e), (com.facebook.auth.protocol.b)a(com/facebook/auth/protocol/b), (com.facebook.auth.protocol.a)a(com/facebook/auth/protocol/a), b(com/facebook/http/protocol/aq), b(java/lang/Boolean, com/facebook/auth/annotations/ShouldExpireAuthToken), (am)a(com/facebook/auth/login/am), b(java/lang/Boolean, com/facebook/auth/annotations/ShouldRequestSessionCookiesWithAuth), (com.facebook.auth.login.a)a(com/facebook/auth/login/a));
    }

    public Object b()
    {
        return a();
    }
}
