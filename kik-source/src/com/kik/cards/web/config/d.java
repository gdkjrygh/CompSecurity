// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.web.config;

import com.kik.cards.web.plugin.a;
import com.kik.cards.web.plugin.j;
import com.kik.g.r;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.kik.cards.web.config:
//            XDataPlugin

final class d extends r
{

    final a a;
    final XDataPlugin b;

    d(XDataPlugin xdataplugin, a a1)
    {
        b = xdataplugin;
        a = a1;
        super();
    }

    public final void a(Object obj)
    {
        Object obj1;
        obj1 = (Map)obj;
        obj = new JSONObject();
        if (((Map) (obj1)).size() != 1 || !((Map) (obj1)).containsKey("")) goto _L2; else goto _L1
_L1:
        ((JSONObject) (obj)).put("record", (JSONObject)((Map) (obj1)).get(""));
_L4:
        a.a(new j(((JSONObject) (obj))));
        return;
_L2:
        JSONObject jsonobject;
        jsonobject = new JSONObject();
        java.util.Map.Entry entry;
        for (obj1 = ((Map) (obj1)).entrySet().iterator(); ((Iterator) (obj1)).hasNext(); jsonobject.put((String)entry.getKey(), entry.getValue()))
        {
            entry = (java.util.Map.Entry)((Iterator) (obj1)).next();
        }

        try
        {
            ((JSONObject) (obj)).put("recordset", jsonobject);
        }
        catch (JSONException jsonexception) { }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
