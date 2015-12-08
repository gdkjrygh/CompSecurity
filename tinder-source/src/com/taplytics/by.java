// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import java.util.Date;
import org.json.JSONObject;

// Referenced classes of package com.taplytics:
//            hu, em, gs, bw

final class by extends hu
{

    final String a;
    final Object b;
    final bw c;

    by(bw bw, String s, Object obj)
    {
        c = bw;
        a = s;
        b = obj;
        super();
    }

    public final void c()
    {
        super.c();
        JSONObject jsonobject;
        jsonobject = new JSONObject();
        jsonobject.put("name", a);
        jsonobject.put("createdAt", new Date());
        jsonobject.put("defaultVal", b);
        try
        {
            jsonobject.put("variableType", b.getClass().getSimpleName());
        }
        catch (Throwable throwable)
        {
            try
            {
                jsonobject.put("variableType", "unknown");
            }
            catch (Exception exception)
            {
                gs.b("Problem pushing dynamic var to socket", exception);
                return;
            }
        }
        em.a().a("newDynamicVar", jsonobject);
        return;
    }
}
