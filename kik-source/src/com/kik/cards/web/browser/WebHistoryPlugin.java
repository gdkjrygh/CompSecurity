// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.web.browser;

import com.kik.cards.web.plugin.a;
import com.kik.cards.web.plugin.d;
import com.kik.cards.web.plugin.j;
import com.kik.g.p;
import java.util.ArrayList;
import java.util.List;
import kik.a.i.h;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.kik.cards.web.browser:
//            c, b

public class WebHistoryPlugin extends d
{

    private final h a;

    public WebHistoryPlugin(h h1)
    {
        super("WebHistory");
        a = h1;
    }

    public j deleteHistoryItems(a a1, JSONObject jsonobject)
    {
        jsonobject = jsonobject.getJSONArray("ids");
        if (jsonobject == null)
        {
            return new j(400);
        }
        ArrayList arraylist = new ArrayList();
        for (int i = 0; i < jsonobject.length(); i++)
        {
            arraylist.add((String)jsonobject.get(i));
        }

        a.a(arraylist).a(new c(this, a1));
        return new j(202);
    }

    public j getBrowsingHistory(a a1, JSONObject jsonobject)
    {
        a.a().a(new b(this, a1));
        return new j(202);
    }
}
