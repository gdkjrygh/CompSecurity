// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cleanmaster.ui.app.market.data.filter;

import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.cleanmaster.ui.app.market.data.filter:
//            b, a

public class d extends b
{

    public d()
    {
    }

    public static d b(JSONObject jsonobject)
    {
        d d1 = new d();
        try
        {
            d1.a(jsonobject.getJSONObject("app_installed_num"));
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            jsonobject.printStackTrace();
            return null;
        }
        return d1;
    }

    protected boolean b(a a1)
    {
        return b(a1.c()) && a(a1.c());
    }
}
