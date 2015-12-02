// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.server.module;

import com.facebook.fbservice.service.e;
import com.facebook.fbservice.service.f;
import com.facebook.fbservice.service.v;
import com.facebook.inject.d;
import com.facebook.orca.f.j;
import com.facebook.orca.l.a;

// Referenced classes of package com.facebook.orca.server.module:
//            a, b

class h extends d
{

    final com.facebook.orca.server.module.a a;

    private h(com.facebook.orca.server.module.a a1)
    {
        a = a1;
        super();
    }

    h(com.facebook.orca.server.module.a a1, b b1)
    {
        this(a1);
    }

    public e a()
    {
        return new v((f)a(com/facebook/orca/l/a), new v((f)a(com/facebook/orca/f/j), com.facebook.orca.server.module.a.a(a)));
    }

    public Object b()
    {
        return a();
    }
}
