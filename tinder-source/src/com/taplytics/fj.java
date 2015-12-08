// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import com.github.nkzawa.socketio.client.d;
import java.util.Map;
import org.json.JSONObject;

// Referenced classes of package com.taplytics:
//            hu, ci, ba, em, 
//            hq, gs

final class fj extends hu
{

    final em a;

    fj(em em1)
    {
        a = em1;
        super();
    }

    public final void c()
    {
        super.c();
        Object obj;
        Map map;
        em em1;
        map = ci.b().c.a();
        em1 = a;
        if (!em.a(a).c())
        {
            break MISSING_BLOCK_LABEL_202;
        }
        obj = new hq();
_L2:
        em.a(em1, ((hq) (obj)));
        if (em.f(a) != null && map.containsKey("pid"))
        {
            obj = (new StringBuilder("project_")).append(map.get("pid")).toString();
            if (em.g(a) == null || !em.g(a).equals(obj))
            {
                map.put("room", obj);
                em.f(a).a("subscribe", new Object[] {
                    new JSONObject(map)
                });
                em.a(a, ((String) (obj)));
                a.b = true;
                if (gs.b())
                {
                    gs.a((new StringBuilder("Connected to Socket Room: ")).append(em.g(a)).toString());
                    return;
                }
            }
        }
        break MISSING_BLOCK_LABEL_220;
        obj = em.a(a);
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        gs.b("WebSocket room connect issue", exception);
    }
}
