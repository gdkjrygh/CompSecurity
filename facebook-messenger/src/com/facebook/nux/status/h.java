// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.nux.status;

import com.facebook.http.protocol.v;
import com.facebook.http.protocol.y;
import com.facebook.http.protocol.z;
import com.google.common.a.es;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.facebook.nux.status:
//            f, FetchNuxStatusesResult, j, g

class h
    implements v
{

    final f a;

    private h(f f1)
    {
        a = f1;
        super();
    }

    h(f f1, g g)
    {
        this(f1);
    }

    public List a()
    {
        return es.a(y.a(f.a(a), null).a("nuxstatus").a());
    }

    public void a(Map map)
    {
        map = (FetchNuxStatusesResult)map.get("nuxstatus");
        f.b(a).a(map);
    }
}
