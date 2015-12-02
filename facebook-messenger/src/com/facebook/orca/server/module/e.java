// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.server.module;

import com.facebook.fbservice.service.ai;
import com.facebook.fbservice.service.f;
import com.facebook.fbservice.service.v;
import com.facebook.inject.d;
import com.facebook.orca.g.u;
import com.facebook.orca.i.a;

// Referenced classes of package com.facebook.orca.server.module:
//            a, b

class e extends d
{

    final com.facebook.orca.server.module.a a;

    private e(com.facebook.orca.server.module.a a1)
    {
        a = a1;
        super();
    }

    e(com.facebook.orca.server.module.a a1, b b1)
    {
        this(a1);
    }

    public com.facebook.fbservice.service.e a()
    {
        return new v(com.facebook.orca.server.module.a.b(a), new v((f)a(com/facebook/orca/g/u), new v((f)a(com/facebook/orca/i/a), new ai())));
    }

    public Object b()
    {
        return a();
    }
}
