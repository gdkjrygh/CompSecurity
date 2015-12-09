// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.nuance.b.b:
//            u, c, d

final class b
{

    private String a;
    private u b;
    private c c;
    private d d;
    private String e;
    private TreeMap f;

    public b()
    {
        a = "NinaCloud";
        b = u.a;
        c = c.b;
        d = d.a;
        e = "";
        f = new TreeMap();
    }

    private String a(JSONObject jsonobject)
    {
        boolean flag = false;
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append('{');
        Iterator iterator = jsonobject.keys();
        String as[] = new String[jsonobject.length()];
        int k = jsonobject.length();
        for (int i = 0; i < k; i++)
        {
            as[i] = (String)iterator.next();
        }

        Arrays.sort(as);
        int l = as.length;
        k = 0;
        int j = ((flag) ? 1 : 0);
        flag = k;
        while (j < l) 
        {
            if (flag)
            {
                stringbuilder.append(',');
            } else
            {
                flag = true;
            }
            if ("extra".equals(as[j]))
            {
                stringbuilder.append("\"extra\":");
                stringbuilder.append(a(jsonobject.optJSONObject("extra")));
            } else
            if ("logSecurity".equals(as[j]))
            {
                stringbuilder.append("\"logSecurity\":");
                stringbuilder.append(a(jsonobject.optJSONObject("logSecurity")));
            } else
            {
                stringbuilder.append((new StringBuilder("\"")).append(as[j]).append("\":\"").append(jsonobject.optString(as[j], "")).append("\"").toString());
            }
            j++;
        }
        stringbuilder.append('}');
        return stringbuilder.toString();
    }

    private JSONObject b()
    {
        Object obj;
        JSONObject jsonobject;
        try
        {
            obj = new JSONObject();
            ((JSONObject) (obj)).put("format", 1);
            ((JSONObject) (obj)).put("cloudName", a);
            ((JSONObject) (obj)).put("logLevel", b.toString());
            jsonobject = new JSONObject();
            jsonobject.put("encryptionKey", e);
            jsonobject.put("encryptionType", d.toString());
            jsonobject.put("level", c.toString());
            ((JSONObject) (obj)).put("logSecurity", jsonobject);
            jsonobject = new JSONObject();
            java.util.Map.Entry entry;
            for (Iterator iterator = f.entrySet().iterator(); iterator.hasNext(); jsonobject.put((String)entry.getKey(), (new StringBuilder()).append((String)entry.getValue()).toString()))
            {
                entry = (java.util.Map.Entry)iterator.next();
            }

        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new RuntimeException("JSONException should be impossible.", ((Throwable) (obj)));
        }
        ((JSONObject) (obj)).put("extra", jsonobject);
        return ((JSONObject) (obj));
    }

    final String a()
    {
        return a(b());
    }

    public final void a(u u1)
    {
        if (u1 == null)
        {
            throw new NullPointerException("logLevel cannot be null");
        } else
        {
            b = u1;
            return;
        }
    }

    public final void a(String s)
    {
        a = s;
    }
}
