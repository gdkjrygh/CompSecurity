// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.appconfig;

import com.facebook.http.protocol.v;
import com.facebook.http.protocol.y;
import com.facebook.http.protocol.z;
import com.google.common.a.es;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.facebook.appconfig:
//            c, AppConfig, b, d

class e
    implements v
{

    final c a;

    private e(c c1)
    {
        a = c1;
        super();
    }

    e(c c1, d d)
    {
        this(c1);
    }

    public List a()
    {
        return es.a(y.a(c.a(a), null).a("appConfig").a());
    }

    public void a(Map map)
    {
        map = (AppConfig)map.get("appConfig");
        c.b(a).a(map);
    }
}
