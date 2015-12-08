// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cleanmaster.ui.app.market.data.filter;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.cleanmaster.ui.app.market.data.filter:
//            b, a

public class c extends b
{

    ArrayList e;

    public c()
    {
        e = new ArrayList();
    }

    public static c b(JSONObject jsonobject)
    {
        c c1 = new c();
        JSONArray jsonarray = jsonobject.getJSONArray("app_installed_condition");
        int i = 0;
_L2:
        jsonobject = c1;
        if (i >= jsonarray.length())
        {
            break; /* Loop/switch isn't completed */
        }
        c1.e.add(jsonarray.getString(i));
        i++;
        if (true) goto _L2; else goto _L1
        jsonobject;
        jsonobject.printStackTrace();
        jsonobject = null;
_L1:
        return jsonobject;
    }

    protected boolean b(a a1)
    {
        return a(a1.e(), e);
    }
}
