// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.f;

import android.os.Bundle;
import com.facebook.http.protocol.v;
import com.facebook.http.protocol.y;
import com.facebook.http.protocol.z;
import com.facebook.prefs.shared.d;
import com.facebook.prefs.shared.e;
import com.google.common.a.es;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.facebook.f:
//            g, n, b, e, 
//            c, h

class i
    implements v
{

    final g a;

    private i(g g1)
    {
        a = g1;
        super();
    }

    i(g g1, h h)
    {
        this(g1);
    }

    private void a(Bundle bundle)
    {
        if (bundle == null)
        {
            return;
        }
        e e1 = g.c(a).b();
        e1.a(com.facebook.f.n.d, System.currentTimeMillis());
        String s;
        for (Iterator iterator = bundle.keySet().iterator(); iterator.hasNext(); e1.a(n.a(s), bundle.getBoolean(s)))
        {
            s = (String)iterator.next();
        }

        e1.a();
    }

    public List a()
    {
        b b1 = new b(e.a(g.a(a)), c.IS_NOT_SESSIONLESS);
        return es.a(y.a(g.b(a), b1).a("gk").a());
    }

    public void a(Map map)
    {
        a((Bundle)map.get("gk"));
    }
}
