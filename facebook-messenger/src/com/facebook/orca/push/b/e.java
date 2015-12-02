// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.push.b;

import com.facebook.analytics.cn;
import com.facebook.config.a.a;
import com.facebook.inject.d;
import com.facebook.l.k;
import com.facebook.orca.f.l;
import com.facebook.orca.fbwebrtc.ag;
import com.facebook.orca.push.b;
import com.fasterxml.jackson.databind.ObjectMapper;

// Referenced classes of package com.facebook.orca.push.b:
//            a, b, c

class e extends d
{

    final com.facebook.orca.push.b.b a;

    private e(com.facebook.orca.push.b.b b1)
    {
        a = b1;
        super();
    }

    e(com.facebook.orca.push.b.b b1, c c)
    {
        this(b1);
    }

    public com.facebook.orca.push.b.a a()
    {
        a a2 = (a)a(com/facebook/config/a/a);
        com.facebook.launcherbadges.a a1 = null;
        if (a2.i() == com.facebook.config.a.d.MESSENGER)
        {
            a1 = (com.facebook.launcherbadges.a)a(com/facebook/launcherbadges/a);
        }
        return new com.facebook.orca.push.b.a((b)a(com/facebook/orca/push/b), (com.facebook.orca.push.a.b)a(com/facebook/orca/push/a/b), b(com/facebook/orca/f/l), (k)a(com/facebook/l/k), (cn)a(com/facebook/analytics/cn), (ObjectMapper)a(com/fasterxml/jackson/databind/ObjectMapper), (ag)a(com/facebook/orca/fbwebrtc/ag), (com.facebook.auth.b.b)a(com/facebook/auth/b/b), a1, a2);
    }

    public Object b()
    {
        return a();
    }
}
