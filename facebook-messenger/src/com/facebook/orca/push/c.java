// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.push;

import com.facebook.auth.login.bm;
import com.facebook.inject.a.a;
import com.facebook.inject.a.g;
import com.facebook.inject.aj;
import com.facebook.push.mqtt.an;

// Referenced classes of package com.facebook.orca.push:
//            b, e, g, h, 
//            f

public class c extends com.facebook.inject.c
{

    public c()
    {
    }

    protected void a()
    {
        b(com/facebook/auth/login/bm).a(null);
        a(com/facebook/orca/push/b).a(new e(this, null)).a();
        a(com/facebook/orca/push/a/a).a(new com.facebook.orca.push.g(this, null)).a();
        a(com/facebook/orca/push/h).a(new f(this, null)).a();
        c(com/facebook/push/fbpushdata/a).a(com/facebook/orca/push/a/a).a(com/facebook/push/mqtt/an);
    }
}
