// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.a;

import com.android.volley.AuthFailureError;
import com.android.volley.a.h;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

// Referenced classes of package com.tinder.a:
//            f

public final class c extends h
{

    private final Map m = new HashMap();

    public c(String s, JSONObject jsonobject, com.android.volley.i.b b, com.android.volley.i.a a, String s1)
    {
        super(s, jsonobject, b, a);
        m.put("User-Agent", f.a);
        m.put("os-version", f.ab);
        m.put("app-version", f.ac);
        m.put("platform", "android");
        if (s1 != null)
        {
            m.put("X-Auth-Token", s1);
        }
    }

    public final Map d()
        throws AuthFailureError
    {
        return m;
    }
}
