// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.web.config;

import com.kik.cards.web.plugin.a;
import com.kik.cards.web.plugin.j;
import com.kik.g.r;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.kik.cards.web.config:
//            XDataPlugin

final class f extends r
{

    final a a;
    final XDataPlugin b;

    f(XDataPlugin xdataplugin, a a1)
    {
        b = xdataplugin;
        a = a1;
        super();
    }

    public final void a(Object obj)
    {
        JSONArray jsonarray = new JSONArray((List)obj);
        obj = new JSONObject();
        try
        {
            ((JSONObject) (obj)).put("primaryKeys", jsonarray);
        }
        catch (JSONException jsonexception)
        {
            jsonexception.printStackTrace();
        }
        a.a(new j(((JSONObject) (obj))));
    }
}
