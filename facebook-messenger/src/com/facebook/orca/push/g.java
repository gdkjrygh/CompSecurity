// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.push;

import android.content.res.Resources;
import com.facebook.analytics.cn;
import com.facebook.auth.b.b;
import com.facebook.auth.login.bm;
import com.facebook.fbservice.ops.c;
import com.facebook.inject.ab;
import com.facebook.inject.d;
import com.facebook.l.k;
import com.facebook.orca.fbwebrtc.ag;
import com.facebook.orca.push.a.a;
import com.facebook.push.c2dm.y;
import com.fasterxml.jackson.databind.ObjectMapper;

// Referenced classes of package com.facebook.orca.push:
//            b, h, c, d

class g extends d
{

    final com.facebook.orca.push.c a;

    private g(com.facebook.orca.push.c c1)
    {
        a = c1;
        super();
    }

    g(com.facebook.orca.push.c c1, com.facebook.orca.push.d d1)
    {
        this(c1);
    }

    public a a()
    {
        return new a((b)a(com/facebook/auth/b/b), (Resources)a(android/content/res/Resources), (com.facebook.orca.push.b)a(com/facebook/orca/push/b), (com.facebook.orca.push.a.b)a(com/facebook/orca/push/a/b), (k)a(com/facebook/l/k), (cn)a(com/facebook/analytics/cn), (y)a(com/facebook/push/c2dm/y), (h)a(com/facebook/orca/push/h), (bm)a(com/facebook/auth/login/bm), (ObjectMapper)a(com/fasterxml/jackson/databind/ObjectMapper), (com.facebook.config.a.d)a(com/facebook/config/a/d), (ag)a(com/facebook/orca/fbwebrtc/ag), e().b(com/facebook/fbservice/ops/c));
    }

    public Object b()
    {
        return a();
    }
}
