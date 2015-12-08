// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.web.browser;

import com.kik.cards.web.plugin.a;
import com.kik.cards.web.plugin.j;
import com.kik.g.r;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.kik.cards.web.browser:
//            WebHistoryPlugin

final class b extends r
{

    final a a;
    final WebHistoryPlugin b;

    b(WebHistoryPlugin webhistoryplugin, a a1)
    {
        b = webhistoryplugin;
        a = a1;
        super();
    }

    public final void a(Object obj)
    {
        Object obj1 = (List)obj;
        obj = new JSONArray();
        try
        {
            kik.a.i.h.a a1;
            for (obj1 = ((List) (obj1)).iterator(); ((Iterator) (obj1)).hasNext(); ((JSONArray) (obj)).put((new JSONObject()).put("id", a1.a()).put("url", a1.b()).put("title", a1.c()).put("iconUrl", a1.d()).put("timestamp", a1.e())))
            {
                a1 = (kik.a.i.h.a)((Iterator) (obj1)).next();
            }

        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            a.a(new j(500));
            return;
        }
        a.a(new j((new JSONObject()).put("items", obj)));
        return;
    }

    public final void a(Throwable throwable)
    {
        a.a(new j(500));
    }
}
