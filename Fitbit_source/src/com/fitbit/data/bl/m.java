// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import com.fitbit.d.a;
import com.fitbit.util.aw;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.fitbit.data.bl:
//            ad

public class m extends aw
{

    private static final String b = "password";
    private static final String c = "login";
    private static final String d = "login_credentials.json";

    public m()
    {
    }

    protected ad a(JSONObject jsonobject)
        throws JSONException
    {
        return new ad(jsonobject.getString("login"), com.fitbit.d.a.a(jsonobject, "password"));
    }

    protected String a()
    {
        return "login_credentials.json";
    }

    protected JSONObject a(ad ad1)
        throws JSONException
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("login", ad1.a);
        jsonobject.put("password", ad1.b);
        return jsonobject;
    }

    protected volatile JSONObject a(Object obj)
        throws JSONException
    {
        return a((ad)obj);
    }

    protected Object b(JSONObject jsonobject)
        throws JSONException
    {
        return a(jsonobject);
    }
}
