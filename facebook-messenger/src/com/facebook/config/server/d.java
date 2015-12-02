// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.config.server;

import com.facebook.inject.a.a;
import com.facebook.inject.a.g;
import com.facebook.inject.c;
import com.facebook.prefs.shared.IsInternalPrefsEnabled;

// Referenced classes of package com.facebook.config.server:
//            q, g, b, f, 
//            IsBootstrapEnabled, j

public class d extends c
{

    private final String a;

    public d()
    {
        this("TestApp");
    }

    public d(String s)
    {
        a = s;
    }

    static String a(d d1)
    {
        return d1.a;
    }

    protected void a()
    {
        a(com/facebook/config/server/q).a(new com.facebook.config.server.g(this, null));
        a(com/facebook/config/server/b).a(new f(null)).a();
        b(java/lang/Boolean).a(com/facebook/prefs/shared/IsInternalPrefsEnabled).a(Boolean.FALSE);
        b(java/lang/Boolean).a(com/facebook/config/server/IsBootstrapEnabled).a(Boolean.FALSE);
        b(com/facebook/config/server/j).b(com/facebook/config/server/b);
    }
}
