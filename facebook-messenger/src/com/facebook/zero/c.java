// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.zero;

import com.facebook.common.w.q;
import com.facebook.d.a.a;
import com.facebook.fbservice.service.e;
import com.facebook.http.b.u;
import com.facebook.inject.a.g;
import com.facebook.inject.aj;
import com.facebook.zero.annotations.IsUserCurrentlyZeroRated;
import com.facebook.zero.annotations.IsZeroRatingFeatureEnabled;
import com.facebook.zero.annotations.ZeroTokenQueue;
import com.facebook.zero.rewrite.b;
import com.facebook.zero.rewrite.f;
import com.facebook.zero.ui.d;
import com.facebook.zero.ui.h;
import com.facebook.zero.ui.l;
import com.facebook.zero.ui.o;
import com.facebook.zero.ui.p;

// Referenced classes of package com.facebook.zero:
//            u, t, e, i, 
//            h, f, m, g, 
//            l, v, s, a, 
//            r, k, j, q, 
//            o, p, w, n

public class c extends com.facebook.inject.c
{

    public c()
    {
    }

    protected void a()
    {
        f(com/facebook/d/a/a);
        a(com/facebook/zero/d/a).a(new com.facebook.zero.u(this, null)).a();
        a(com/facebook/zero/protocol/c).a(new t(this, null));
        a(com/facebook/fbservice/service/e).a(com/facebook/zero/annotations/ZeroTokenQueue).a(new com.facebook.zero.e(this, null)).d();
        a(com/facebook/zero/ui/o).a(new i(this, null));
        a(com/facebook/zero/ui/l).a(new com.facebook.zero.h(this, null));
        a(com/facebook/zero/ui/d).a(new com.facebook.zero.f(this, null));
        a(com/facebook/zero/rewrite/b).a(new m(this, null));
        a(com/facebook/zero/ui/h).a(new com.facebook.zero.g(this, null));
        a(com/facebook/zero/ui/p).a(new com.facebook.zero.l(this, null));
        a(com/facebook/zero/rewrite/e).a(new v(this, null));
        a(com/facebook/zero/server/d).a(new s(this, null));
        a(com/facebook/zero/a).a(new r(this, null));
        a(com/facebook/zero/protocol/a/b).a(new k(this, null));
        a(com/facebook/zero/protocol/a/a).a(new j(this, null));
        c(com/facebook/http/b/u).a(com/facebook/zero/rewrite/b);
        c(com/facebook/auth/f/a).a(com/facebook/zero/b/a);
        a(com/facebook/zero/b/d).a(new com.facebook.zero.q(this, null));
        a(com/facebook/zero/b/a).a(new com.facebook.zero.o(this, null));
        a(com/facebook/zero/b/c).a(new com.facebook.zero.p(this, null));
        a(com/facebook/zero/rewrite/f).a(new w(this, null));
        a(com/facebook/zero/rewrite/c).a(new n(this, null));
        b(java/lang/Boolean).a(com/facebook/zero/annotations/IsZeroRatingFeatureEnabled).a(Boolean.valueOf(false));
        b(com/facebook/common/w/q).a(com/facebook/zero/annotations/IsUserCurrentlyZeroRated).a(q.NO);
    }
}
