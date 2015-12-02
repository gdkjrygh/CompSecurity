// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.auth.d;

import com.facebook.auth.annotations.IsMeUserAnEmployee;
import com.facebook.auth.annotations.LoggedInUser;
import com.facebook.auth.annotations.LoggedInUserId;
import com.facebook.auth.annotations.LoggedInUserKey;
import com.facebook.auth.annotations.ViewerContextUserId;
import com.facebook.auth.annotations.ViewerContextUserKey;
import com.facebook.auth.credentials.UserTokenCredentials;
import com.facebook.auth.login.al;
import com.facebook.auth.login.bk;
import com.facebook.auth.login.w;
import com.facebook.auth.login.y;
import com.facebook.auth.userscope.UserScoped;
import com.facebook.auth.viewercontext.ViewerContext;
import com.facebook.auth.viewercontext.d;
import com.facebook.auth.viewercontext.e;
import com.facebook.auth.viewercontext.h;
import com.facebook.auth.viewercontext.i;
import com.facebook.base.activity.f;
import com.facebook.common.w.q;
import com.facebook.inject.a.a;
import com.facebook.inject.a.g;
import com.facebook.inject.aj;
import com.facebook.inject.c;
import com.facebook.user.User;
import com.facebook.user.UserKey;

// Referenced classes of package com.facebook.auth.d:
//            h, i, a, l, 
//            m, n, k, o, 
//            p, g, d, f, 
//            j, e

public class b extends c
{

    public b()
    {
    }

    protected void a()
    {
        b(com/facebook/user/User, com/facebook/auth/annotations/LoggedInUser);
        com.facebook.auth.userscope.b b1 = new com.facebook.auth.userscope.b();
        a(com/facebook/auth/userscope/UserScoped, ((com.facebook.inject.au) (b1)));
        a(com/facebook/auth/userscope/b).a(b1);
        a(java/lang/String).a(com/facebook/auth/annotations/LoggedInUserId).a(new com.facebook.auth.d.h(this, null));
        a(com/facebook/user/UserKey).a(com/facebook/auth/annotations/LoggedInUserKey).a(new com.facebook.auth.d.i(this, null));
        a(com/facebook/common/w/q).a(com/facebook/auth/annotations/IsMeUserAnEmployee).c(com/facebook/auth/d/a);
        a(com/facebook/auth/viewercontext/d).a(new l(null)).a();
        a(com/facebook/auth/viewercontext/e).c(com/facebook/auth/viewercontext/i);
        a(com/facebook/auth/viewercontext/h).a(new m(this, null)).a();
        a(com/facebook/auth/viewercontext/ViewerContext).a(new n(this, null));
        a(com/facebook/auth/credentials/UserTokenCredentials).a(new k(this, null));
        a(java/lang/String).a(com/facebook/auth/annotations/ViewerContextUserId).a(new o(this, null));
        a(com/facebook/user/UserKey).a(com/facebook/auth/annotations/ViewerContextUserKey).a(new p(this, null));
        a(com/facebook/auth/protocol/h).a(new com.facebook.auth.d.g(this, null));
        a(com/facebook/auth/login/a).a(new com.facebook.auth.d.d(this, null));
        a(com/facebook/auth/login/al).b(com/facebook/auth/login/y);
        a(com/facebook/auth/login/w).a(new com.facebook.auth.d.f(this, null));
        c(com/facebook/base/activity/f).a(com/facebook/auth/viewercontext/h);
        a(com/facebook/auth/login/bk).a(new j(this, null)).a();
        a(com/facebook/auth/c/b).a(new com.facebook.auth.d.e(this, null)).a();
    }
}
