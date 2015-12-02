// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.config.server;

import com.facebook.base.broadcast.a;
import com.facebook.inject.d;
import com.facebook.prefs.shared.IsInternalPrefsEnabled;

// Referenced classes of package com.facebook.config.server:
//            b, IsBootstrapEnabled, q, e

class f extends d
{

    private f()
    {
    }

    f(e e)
    {
        this();
    }

    public b a()
    {
        return new b((com.facebook.prefs.shared.d)a(com/facebook/prefs/shared/d), (a)a(com/facebook/base/broadcast/a), b(java/lang/Boolean, com/facebook/prefs/shared/IsInternalPrefsEnabled), b(java/lang/Boolean, com/facebook/config/server/IsBootstrapEnabled), (com.facebook.config.a.a)a(com/facebook/config/a/a), (com.facebook.common.v.a)a(com/facebook/common/v/a), (q)a(com/facebook/config/server/q));
    }

    public Object b()
    {
        return a();
    }
}
