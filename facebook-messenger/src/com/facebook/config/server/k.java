// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.config.server;

import com.facebook.http.annotations.BootstrapPlatformAppHttpConfig;
import com.facebook.http.annotations.ProductionPlatformAppHttpConfig;
import com.facebook.http.annotations.UserAgentString;
import com.facebook.http.c.i;
import com.facebook.inject.a.a;
import com.facebook.inject.c;

// Referenced classes of package com.facebook.config.server:
//            j, n, o, m, 
//            p

public class k extends c
{

    public k()
    {
    }

    protected void a()
    {
        d(com/facebook/config/server/j);
        a(com/facebook/http/c/i).a(new n(null));
        a(com/facebook/http/c/i).a(com/facebook/http/annotations/ProductionPlatformAppHttpConfig).a(new o(null));
        a(com/facebook/http/c/i).a(com/facebook/http/annotations/BootstrapPlatformAppHttpConfig).a(new m(null));
        a(java/lang/String).a(com/facebook/http/annotations/UserAgentString).a(new p(this, null));
    }
}
