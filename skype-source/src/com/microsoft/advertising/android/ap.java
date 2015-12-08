// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;

import android.text.TextUtils;
import com.microsoft.advertising.android.a.e;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.microsoft.advertising.android:
//            ai, e, bv, i, 
//            as, aq, bs, l, 
//            ao

final class ap
{

    protected String a;
    protected String b;
    protected String c;
    protected String d;
    protected String e;
    protected String f;
    protected String g;
    protected String h;
    protected String i;
    protected String j;
    protected boolean k;
    protected boolean l;
    protected final ArrayList m = new ArrayList();
    protected final ArrayList n = new ArrayList();
    private final ai o;
    private String p;

    ap(ai ai1)
    {
        p = null;
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        h = null;
        i = null;
        j = null;
        k = false;
        l = false;
        o = ai1;
    }

    private void a(String s, e e1)
    {
        if (o != null)
        {
            o.c(s, e1);
        }
    }

    private void a(JSONObject jsonobject)
        throws JSONException
    {
        int i1;
        jsonobject = (JSONArray)jsonobject.get("ast");
        i1 = 0;
_L2:
        JSONObject jsonobject1;
        if (i1 >= jsonobject.length())
        {
            return;
        }
        jsonobject1 = jsonobject.getJSONObject(i1);
        if (!jsonobject1.getString("type").equals("uri"))
        {
            break; /* Loop/switch isn't completed */
        }
        j = jsonobject1.optString("label");
        m.add(new com.microsoft.advertising.android.e(e.a.a, jsonobject1.optString("label"), jsonobject1.getString("value")));
_L3:
        i1++;
        if (true) goto _L2; else goto _L1
_L1:
        if (jsonobject1.getString("type").equals("phone"))
        {
            i = jsonobject1.optString("label");
            if (bv.c())
            {
                m.add(new com.microsoft.advertising.android.e(e.a.b, i, jsonobject1.getString("value")));
            }
        } else
        if (jsonobject1.getString("type").equals("text"))
        {
            if (jsonobject1.getString("name").equals("title"))
            {
                d = jsonobject1.getString("value");
            }
            if (jsonobject1.getString("name").equals("description"))
            {
                e = jsonobject1.getString("value");
            }
        } else
        if (jsonobject1.getString("type").equals("image"))
        {
            c = jsonobject1.getString("uri");
        } else
        if (jsonobject1.getString("type").equals("content"))
        {
            f = jsonobject1.getString("value");
        }
          goto _L3
        if (true) goto _L2; else goto _L4
_L4:
    }

    private void b(JSONObject jsonobject)
        throws JSONException
    {
        if (!jsonobject.isNull("evt"))
        {
            jsonobject = ((JSONObject) (jsonobject.get("evt")));
            if (jsonobject instanceof JSONObject)
            {
                jsonobject = (JSONObject)jsonobject;
                if (jsonobject.getString("action").equals("impr"))
                {
                    n.add(jsonobject.getString("uri"));
                }
            } else
            {
                jsonobject = (JSONArray)jsonobject;
                int i1 = 0;
                while (i1 < jsonobject.length()) 
                {
                    JSONObject jsonobject1 = jsonobject.getJSONObject(i1);
                    if (jsonobject1.getString("action").equals("impr"))
                    {
                        n.add(jsonobject1.getString("uri"));
                    }
                    i1++;
                }
            }
        }
    }

    final ao a(JSONObject jsonobject, l l1)
        throws i
    {
        Object obj = null;
        jsonobject = jsonobject.getJSONObject("adrsp");
        b = jsonobject.getString("status");
        g = jsonobject.getString("code");
        h = jsonobject.getString("message");
        a = jsonobject.getString("version");
        if ("err".equalsIgnoreCase(b))
        {
            p = String.format("Code=%s message=%s", new Object[] {
                g, h
            });
        }
        if (!"3.0".equals(a))
        {
            p = "Invalid protocol version. Protocol should have version 3.0";
        }
        if (p == null) goto _L2; else goto _L1
_L1:
        if (p.startsWith("Code=2000"))
        {
            throw new i.a();
        }
          goto _L3
        jsonobject;
        throw jsonobject;
_L3:
        if (!p.startsWith("Code=")) goto _L5; else goto _L4
_L4:
        a((new StringBuilder("Ad server error : ")).append(p).toString(), e.e);
          goto _L6
_L5:
        a((new StringBuilder("Error parsing legacy Ad JSON: ")).append(p).toString(), e.e);
          goto _L6
        jsonobject;
        a((new StringBuilder("Error parsing legacy Ad JSON : ")).append(jsonobject).toString(), e.f);
        jsonobject = obj;
_L7:
        return jsonobject;
_L2:
        jsonobject = (JSONObject)((JSONObject)jsonobject.get("ad")).get("cr");
        a(jsonobject);
        b(jsonobject);
        if (TextUtils.isEmpty(f) && TextUtils.isEmpty(c))
        {
            jsonobject = new as(this, l1);
            continue; /* Loop/switch isn't completed */
        }
        if (TextUtils.isEmpty(f) && !TextUtils.isEmpty(c))
        {
            jsonobject = new aq(this, l1);
            continue; /* Loop/switch isn't completed */
        }
        jsonobject = obj;
        if (!TextUtils.isEmpty(f))
        {
            k = f.toLowerCase().contains("mraid.js");
            l = f.toLowerCase().contains("skypesponsoredcontent.js");
            jsonobject = new bs(this, l1);
        }
        if (true) goto _L7; else goto _L6
_L6:
        return null;
    }
}
