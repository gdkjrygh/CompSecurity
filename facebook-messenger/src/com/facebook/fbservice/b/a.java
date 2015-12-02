// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.fbservice.b;

import com.facebook.auth.viewercontext.e;
import com.facebook.f.f;
import com.facebook.fbservice.ops.c;
import com.facebook.fbservice.ops.k;
import com.facebook.fbservice.service.d;
import com.facebook.fbservice.service.n;
import com.facebook.fbservice.service.o;
import com.facebook.fbservice.service.p;
import com.facebook.inject.a.g;
import com.facebook.inject.aj;
import com.facebook.inject.b;

// Referenced classes of package com.facebook.fbservice.b:
//            d, e, c, g, 
//            f, h, i

public class a extends b
{

    public a()
    {
    }

    protected void a()
    {
        a(com/facebook/fbservice/service/o).a(new com.facebook.fbservice.b.d(this, null)).a();
        a(com/facebook/fbservice/service/p).a(new com.facebook.fbservice.b.e(this, null)).a();
        a(com/facebook/fbservice/ops/c).a(new com.facebook.fbservice.b.c(this, null));
        a(com/facebook/fbservice/ops/p).a(new com.facebook.fbservice.b.g(this, null));
        a(com/facebook/fbservice/ops/k).b(com/facebook/fbservice/ops/p);
        a(com/facebook/fbservice/ops/o).a(new com.facebook.fbservice.b.f(this, null));
        b(com/facebook/auth/viewercontext/e).b(com/facebook/auth/viewercontext/a);
        c(com/facebook/fbservice/service/n);
        c(com/facebook/f/f).a(com/facebook/fbservice/service/d);
        a(com/facebook/fbservice/a/a).a(new h(this, null));
        a(com/facebook/fbservice/a/b).a(new i(this, null));
    }
}
