// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.web.plugin;

import org.c.b;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.kik.cards.web.plugin:
//            a, j, h, b

final class i
    implements a
{

    final String a;
    final String b;
    final h c;

    i(h h1, String s, String s1)
    {
        c = h1;
        a = s;
        b = s1;
        super();
    }

    public final void a(j j1)
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("status", j1.a());
            jsonobject.put("data", j1.b());
        }
        // Misplaced declaration of an exception variable
        catch (j j1)
        {
            h.e().b((new StringBuilder("Error creating response for async method: ")).append(a).toString(), j1);
        }
        com.kik.cards.web.plugin.h.b(c).a(b, jsonobject);
    }
}
