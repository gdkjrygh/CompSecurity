// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.serverinteraction;

import com.fitbit.util.aw;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.fitbit.serverinteraction:
//            a

public class b extends aw
{

    private static final String b = "token";
    private static final String c = "secret";
    private static final String d = "authinfo_credentials.json";

    public b()
    {
    }

    protected a a(JSONObject jsonobject)
        throws JSONException
    {
        if (jsonobject.has("token") && jsonobject.has("secret"))
        {
            return new a(jsonobject.getString("token"), jsonobject.getString("secret"));
        } else
        {
            return null;
        }
    }

    protected String a()
    {
        return "authinfo_credentials.json";
    }

    protected JSONObject a(a a1)
        throws JSONException
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("token", a1.a);
        jsonobject.put("secret", a1.b);
        return jsonobject;
    }

    protected volatile JSONObject a(Object obj)
        throws JSONException
    {
        return a((a)obj);
    }

    protected Object b(JSONObject jsonobject)
        throws JSONException
    {
        return a(jsonobject);
    }
}
