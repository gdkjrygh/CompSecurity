// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cleanmaster.ui.app.market.data.filter;

import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.cleanmaster.ui.app.market.data.filter:
//            b, a

public class f extends b
{

    public f()
    {
    }

    public static f b(JSONObject jsonobject)
    {
        f f1 = new f();
        try
        {
            f1.a(jsonobject.getJSONObject("free_space_condition"));
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            jsonobject.printStackTrace();
            return null;
        }
        return f1;
    }

    protected boolean b(a a1)
    {
        return b(a1.f()) && a(a1.f());
    }
}
