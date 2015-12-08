// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.web.auth;

import com.kik.cards.web.plugin.a;
import com.kik.cards.web.plugin.j;
import com.kik.g.r;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.kik.cards.web.auth:
//            g

final class h extends r
{

    final g a;

    h(g g1)
    {
        a = g1;
        super();
    }

    public final void a(Object obj)
    {
        obj = (String)obj;
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("anonymousId", obj);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            a.b.a(new j(500));
            return;
        }
        a.b.a(new j(jsonobject));
    }

    public final void a(Throwable throwable)
    {
        a.b.a(new j(500));
    }
}
