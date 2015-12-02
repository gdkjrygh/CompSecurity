// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.server.module;

import com.facebook.fbservice.service.ai;
import com.facebook.fbservice.service.e;
import com.facebook.fbservice.service.f;
import com.facebook.fbservice.service.v;
import com.facebook.inject.d;
import com.facebook.orca.protocol.a;

// Referenced classes of package com.facebook.orca.server.module:
//            a, b

class k extends d
{

    final com.facebook.orca.server.module.a a;

    private k(com.facebook.orca.server.module.a a1)
    {
        a = a1;
        super();
    }

    k(com.facebook.orca.server.module.a a1, b b1)
    {
        this(a1);
    }

    public e a()
    {
        return new v((f)a(com/facebook/orca/protocol/a), new ai());
    }

    public Object b()
    {
        return a();
    }
}
