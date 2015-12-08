// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.a;

import com.android.volley.AuthFailureError;
import com.android.volley.a.i;
import com.tinder.utils.t;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

// Referenced classes of package com.tinder.a:
//            f

public class d extends i
{

    private final Map m = new HashMap();

    public d(int j, String s, JSONObject jsonobject, com.android.volley.i.b b, com.android.volley.i.a a1, String s1)
    {
        JSONObject jsonobject1;
        if (jsonobject == null && j == 1)
        {
            jsonobject1 = new JSONObject();
        } else
        {
            jsonobject1 = jsonobject;
        }
        super(j, s, jsonobject1, b, a1);
        (new StringBuilder("jsonObject=")).append(jsonobject);
        m.put("User-Agent", f.a);
        m.put("os-version", f.ab);
        m.put("app-version", f.ac);
        m.put("platform", "android");
        m.put("Accept-Language", t.a());
        if (s1 != null)
        {
            m.put("X-Auth-Token", s1);
        }
    }

    public final void a(String s, String s1)
    {
        m.put(s, s1);
    }

    public final Map d()
        throws AuthFailureError
    {
        return m;
    }
}
