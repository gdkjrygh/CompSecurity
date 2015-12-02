// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.auth.login;

import com.facebook.auth.b.b;
import com.facebook.auth.b.d;
import com.facebook.auth.protocol.GetLoggedInUserResult;
import com.facebook.auth.viewercontext.ViewerContext;
import com.facebook.http.protocol.v;
import com.facebook.http.protocol.y;
import com.facebook.http.protocol.z;
import com.facebook.user.o;
import com.google.common.a.es;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.facebook.auth.login:
//            bc, bd

class be
    implements v
{

    final bc a;

    private be(bc bc1)
    {
        a = bc1;
        super();
    }

    be(bc bc1, bd bd)
    {
        this(bc1);
    }

    public List a()
    {
        return es.a(y.a(bc.a(a), null).a("user").a());
    }

    public void a(Map map)
    {
        d d1 = (d)com.facebook.auth.login.bc.b(a);
        map = (GetLoggedInUserResult)map.get("user");
        o o1 = new o();
        o1.a(map.a());
        o1.g(com.facebook.auth.login.bc.b(a).a().b());
        d1.b(o1.x());
    }
}
