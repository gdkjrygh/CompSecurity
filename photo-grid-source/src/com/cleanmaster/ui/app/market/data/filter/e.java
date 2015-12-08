// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cleanmaster.ui.app.market.data.filter;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.cleanmaster.ui.app.market.data.filter:
//            c, a

public class e extends c
{

    public e()
    {
    }

    public static e c(JSONObject jsonobject)
    {
        e e1 = new e();
        JSONArray jsonarray = jsonobject.getJSONArray("app_uninstalled_condition");
        int i = 0;
_L2:
        jsonobject = e1;
        if (i >= jsonarray.length())
        {
            break; /* Loop/switch isn't completed */
        }
        e1.e.add(jsonarray.getString(i));
        i++;
        if (true) goto _L2; else goto _L1
        jsonobject;
        jsonobject.printStackTrace();
        jsonobject = null;
_L1:
        return jsonobject;
    }

    protected boolean b(a a)
    {
        return !super.b(a);
    }
}
