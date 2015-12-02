// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.zero;

import com.facebook.common.json.jsonmirror.e;
import com.facebook.http.protocol.v;
import com.facebook.http.protocol.y;
import com.facebook.http.protocol.z;
import com.facebook.zero.server.FetchZeroTokenParams;
import com.facebook.zero.server.FetchZeroTokenResult;
import com.facebook.zero.server.d;
import com.facebook.zero.ui.p;
import com.google.common.a.es;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import javax.inject.a;

// Referenced classes of package com.facebook.zero:
//            a

class b
    implements v
{

    final com.facebook.zero.a a;
    private final boolean b;

    public b(com.facebook.zero.a a1, boolean flag)
    {
        a = a1;
        super();
        b = flag;
    }

    public List a()
    {
        if (b && !((Boolean)com.facebook.zero.a.a(a).b()).booleanValue())
        {
            return es.d();
        } else
        {
            FetchZeroTokenParams fetchzerotokenparams = new FetchZeroTokenParams(com.facebook.zero.a.b(a).a(), com.facebook.zero.a.b(a).b());
            return es.a(y.a(com.facebook.zero.a.c(a), fetchzerotokenparams).a("fetchZeroToken").a());
        }
    }

    public void a(Map map)
    {
        map = (FetchZeroTokenResult)map.get("fetchZeroToken");
        if (map == null)
        {
            return;
        }
        try
        {
            com.facebook.zero.a.e(a).b(com.facebook.zero.a.a.b, com.facebook.zero.a.d(a).a(map.d()));
            com.facebook.zero.a.e(a).b(com.facebook.zero.a.a.c, com.facebook.zero.a.f(a).a(map.c()));
        }
        catch (IOException ioexception)
        {
            com.facebook.debug.log.b.e(com.facebook.zero.a.a(), "Error storing enabled ui features in sync token fetch");
        }
        catch (e e1)
        {
            com.facebook.debug.log.b.e(com.facebook.zero.a.a(), "Error storing enabled ui features in sync token fetch");
        }
        com.facebook.zero.a.g(a).a(map);
    }
}
