// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.server.module;

import com.facebook.auth.b.b;
import com.facebook.f.a;
import com.facebook.f.f;
import com.facebook.fbservice.service.e;
import com.facebook.http.protocol.i;
import com.facebook.inject.d;
import com.facebook.orca.login.ae;
import com.facebook.orca.protocol.methods.ag;
import com.facebook.orca.protocol.methods.be;
import com.facebook.orca.protocol.methods.u;
import com.facebook.orca.protocol.methods.z;

// Referenced classes of package com.facebook.orca.server.module:
//            a, b

class m extends d
{

    final com.facebook.orca.server.module.a a;

    private m(com.facebook.orca.server.module.a a1)
    {
        a = a1;
        super();
    }

    m(com.facebook.orca.server.module.a a1, com.facebook.orca.server.module.b b1)
    {
        this(a1);
    }

    public e a()
    {
        return new ae((i)a(com/facebook/http/protocol/i), (b)a(com/facebook/auth/b/b), (f)a(com/facebook/orca/protocol/methods/z), (be)a(com/facebook/orca/protocol/methods/be), (com.facebook.orca.protocol.methods.d)a(com/facebook/orca/protocol/methods/d), (u)a(com/facebook/orca/protocol/methods/u), (ag)a(com/facebook/orca/protocol/methods/ag), (a)a(com/facebook/f/a));
    }

    public Object b()
    {
        return a();
    }
}
