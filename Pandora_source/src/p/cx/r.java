// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cx;

import com.pandora.radio.util.n;
import org.json.JSONException;
import org.json.JSONObject;

public class r
{

    private String a;
    private String b;
    private boolean c;
    private String d;
    private n e;
    private n f;
    private Object g;

    public r(String s, boolean flag, Object obj)
        throws JSONException
    {
        a = s;
        b = null;
        c = flag;
        d = "*";
        e = new com.pandora.radio.util.n.a(null);
        f = new com.pandora.radio.util.n.b(null);
        g = obj;
    }

    public r(JSONObject jsonobject)
        throws JSONException
    {
        a = jsonobject.getString("feature");
        b = jsonobject.optString("value", null);
        c = jsonobject.optBoolean("enabled", true);
        d = jsonobject.optString("platform", "*");
        e = new com.pandora.radio.util.n.a(jsonobject.optJSONObject("platformVersionRange"));
        f = new com.pandora.radio.util.n.b(jsonobject.optJSONObject("productVersionRange"));
        g = null;
    }

    public String a()
    {
        return a;
    }

    public boolean b()
    {
        return c;
    }

    public boolean c()
    {
        return "*".equalsIgnoreCase(d) || "android".equalsIgnoreCase(d);
    }

    public boolean d()
    {
        return c() && e.a() && f.a();
    }

    public Object e()
    {
        return g;
    }

    public String toString()
    {
        return String.format("feature=%s, enabled=%s, value=%s, platform=%s, platform range=%s, product range=%s", new Object[] {
            a, Boolean.valueOf(c).toString(), b, d, e.toString(), f.toString()
        });
    }
}
