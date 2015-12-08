// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cleanmaster.ui.app.market.data.filter;

import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.cleanmaster.ui.app.market.data.filter:
//            b, a

public class h extends b
{

    public h()
    {
    }

    public static h b(JSONObject jsonobject)
    {
        h h1 = new h();
        try
        {
            h1.a(jsonobject.getJSONObject("total_space_condition"));
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            jsonobject.printStackTrace();
            return null;
        }
        return h1;
    }

    protected boolean b(a a1)
    {
        return a(a1.d()) && b(a1.d());
    }
}
