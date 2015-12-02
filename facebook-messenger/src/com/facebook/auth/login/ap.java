// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.auth.login;

import com.facebook.auth.a.b;
import com.facebook.auth.annotations.AuthQueue;
import com.facebook.auth.annotations.AuthTokenString;
import com.facebook.auth.annotations.IsFirstPartySsoEnabled;
import com.facebook.auth.annotations.IsWildfireRegEnabled;
import com.facebook.auth.annotations.ShouldExpireAuthToken;
import com.facebook.auth.annotations.ShouldRequestSessionCookiesWithAuth;
import com.facebook.fbservice.service.e;
import com.facebook.fbservice.service.p;
import com.facebook.http.protocol.aq;
import com.facebook.inject.a.a;
import com.facebook.inject.a.g;
import com.facebook.inject.aj;
import com.facebook.inject.at;
import com.facebook.inject.c;
import com.facebook.inject.t;
import com.facebook.prefs.shared.d;

// Referenced classes of package com.facebook.auth.login:
//            v, at, aw, o, 
//            ar, bc, az, s, 
//            as, bm, ba, av, 
//            am, ay, au, z, 
//            ax, n, bb

public class ap extends c
{

    public ap()
    {
    }

    protected void a()
    {
        b(java/lang/Boolean).a(com/facebook/auth/annotations/IsWildfireRegEnabled).a(Boolean.valueOf(false));
        b(java/lang/Boolean).a(com/facebook/auth/annotations/ShouldExpireAuthToken).a(Boolean.valueOf(false));
        b(java/lang/Boolean).a(com/facebook/auth/annotations/IsFirstPartySsoEnabled).a(Boolean.valueOf(false));
        b(java/lang/Boolean).a(com/facebook/auth/annotations/ShouldRequestSessionCookiesWithAuth).a(Boolean.valueOf(false));
        b(com/facebook/auth/b/a).a(at.a(com/facebook/auth/b/a));
        b(com/facebook/prefs/shared/d).a(at.a(com/facebook/prefs/shared/d));
        b(com/facebook/http/protocol/aq).a(at.a(com/facebook/http/protocol/aq));
        b(com/facebook/fbservice/service/p).a(at.a(com/facebook/fbservice/service/p));
        b(com/facebook/ui/d/a).a(at.a(com/facebook/ui/d/a));
        b(com/facebook/auth/login/v).a(new com.facebook.auth.login.at(this, null)).a();
        a(com/facebook/fbservice/service/e).a(com/facebook/auth/annotations/AuthQueue).a(new aw(this, null)).d();
        a(com/facebook/auth/login/o).a(new ar(this, null)).a();
        a(com/facebook/auth/login/bc).a(new az(this, null)).a();
        a(com/facebook/auth/login/s).a(new as(this, null));
        a(com/facebook/auth/login/bm).a(new ba(this, null)).a();
        a(com/facebook/auth/protocol/e).a(new av(this, null));
        a(com/facebook/auth/login/am).a(new ay(this, null)).a();
        a(java/lang/String).a(com/facebook/auth/annotations/AuthTokenString).a(new au(this, null));
        a(com/facebook/auth/login/z).a(new ax(this, null)).a();
        c(com/facebook/auth/a/b).a(com/facebook/auth/login/z);
        c(com/facebook/auth/a/b);
        c(com/facebook/auth/a/c);
        c(com/facebook/auth/f/b);
        c(com/facebook/auth/f/a);
    }

    public void a(t t1)
    {
        super.a(t1);
        t1 = (p)t1.a(com/facebook/fbservice/service/p);
        t1.a(com.facebook.auth.login.n.a, com/facebook/auth/annotations/AuthQueue);
        t1.a(com.facebook.auth.login.n.b, com/facebook/auth/annotations/AuthQueue);
        t1.a(com.facebook.auth.login.n.c, com/facebook/auth/annotations/AuthQueue);
        t1.a(com.facebook.auth.login.n.d, com/facebook/auth/annotations/AuthQueue);
        t1.a(com.facebook.auth.login.bb.a, com/facebook/auth/annotations/AuthQueue);
    }
}
