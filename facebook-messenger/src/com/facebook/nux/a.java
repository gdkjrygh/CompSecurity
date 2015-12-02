// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.nux;

import com.facebook.config.background.k;
import com.facebook.fbservice.service.e;
import com.facebook.fbservice.service.p;
import com.facebook.inject.a.c;
import com.facebook.inject.a.g;
import com.facebook.inject.aj;
import com.facebook.inject.b;
import com.facebook.inject.t;
import com.facebook.nux.service.NuxQueue;
import com.facebook.nux.status.f;
import com.facebook.nux.status.j;

// Referenced classes of package com.facebook.nux:
//            d, f, g, e, 
//            c

public class a extends b
{

    public a()
    {
    }

    protected void a()
    {
        a(com/facebook/nux/status/a).a(new d(null));
        a(com/facebook/nux/status/f).a(new com.facebook.nux.f(null));
        a(com/facebook/nux/status/j).a(new com.facebook.nux.g(null)).a();
        a(com/facebook/nux/service/a).a(new com.facebook.nux.e(null));
        a(com/facebook/fbservice/service/e).a(com/facebook/nux/service/NuxQueue).a(new com.facebook.nux.c(null)).d();
        c(com/facebook/auth/a/c).a(com/facebook/nux/status/f);
        c(com/facebook/config/background/k).a(com/facebook/nux/status/f);
        c(com/facebook/nux/status/e);
    }

    public void a(t t1)
    {
        super.a(t1);
        t1 = (p)t1.a(com/facebook/fbservice/service/p);
        t1.a(com.facebook.nux.service.a.a, com/facebook/nux/service/NuxQueue);
        t1.a(com.facebook.nux.service.a.b, com/facebook/nux/service/NuxQueue);
    }
}
