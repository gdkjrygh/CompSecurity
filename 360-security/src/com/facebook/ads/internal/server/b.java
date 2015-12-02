// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.server;

import com.facebook.ads.internal.d.a;
import com.facebook.ads.internal.d.c;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook.ads.internal.server:
//            d, e, c

public class b
{

    private static b a = new b();

    public b()
    {
    }

    public static b a()
    {
        com/facebook/ads/internal/server/b;
        JVM INSTR monitorenter ;
        b b1 = a;
        com/facebook/ads/internal/server/b;
        JVM INSTR monitorexit ;
        return b1;
        Exception exception;
        exception;
        throw exception;
    }

    private d a(JSONObject jsonobject, String s, String s1, String s2)
    {
        s = new d(s, s1);
        s.d = s2;
        jsonobject.optInt("code");
        s1 = jsonobject.getJSONArray("placements").getJSONObject(0);
        jsonobject = s1.optJSONObject("meta");
        if (jsonobject == null)
        {
            jsonobject = "";
        } else
        {
            jsonobject = jsonobject.getString("plid");
        }
        ((d) (s)).e.a(jsonobject);
        jsonobject = c.a(s1.getJSONObject("definition"));
        ((d) (s)).e.a(jsonobject);
        jsonobject = jsonobject.a();
        if (s1.has("ads"))
        {
            s1 = s1.getJSONArray("ads");
            for (int i = 0; i < s1.length(); i++)
            {
                s2 = new a(jsonobject);
                Object obj = s1.getJSONObject(i);
                s2.a(((JSONObject) (obj)).getString("adapter"));
                JSONObject jsonobject1 = ((JSONObject) (obj)).getJSONObject("data");
                obj = ((JSONObject) (obj)).optJSONArray("trackers");
                if (obj != null)
                {
                    jsonobject1.put("trackers", obj);
                }
                s2.a(jsonobject1);
                ((d) (s)).e.a(s2);
            }

        }
        return s;
    }

    private e a(JSONObject jsonobject, String s, String s1)
    {
        s = new e(s, s1);
        try
        {
            s.d = jsonobject.getString("message");
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            com.facebook.ads.internal.c.a.d("no message in the error response");
            return s;
        }
        return s;
    }

    public com.facebook.ads.internal.server.c a(String s)
    {
        String s1;
        Object obj;
        JSONObject jsonobject;
        String s2;
        byte byte0;
        jsonobject = new JSONObject(s);
        s2 = jsonobject.getString("type");
        obj = jsonobject.optJSONObject("meta");
        if (obj == null)
        {
            s = "";
        } else
        {
            s = ((JSONObject) (obj)).getString("version");
        }
        if (obj == null)
        {
            s1 = "";
        } else
        {
            s1 = ((JSONObject) (obj)).getString("srv");
        }
        if (obj == null)
        {
            obj = "";
        } else
        {
            obj = ((JSONObject) (obj)).getString("geo");
        }
        byte0 = -1;
        s2.hashCode();
        JVM INSTR lookupswitch 2: default 84
    //                   96432: 172
    //                   96784904: 188;
           goto _L1 _L2 _L3
_L1:
        break; /* Loop/switch isn't completed */
_L3:
        break MISSING_BLOCK_LABEL_188;
_L4:
        switch (byte0)
        {
        default:
            com.facebook.ads.internal.c.a.a((new StringBuilder()).append("response type unknown: ").append(s2).toString());
            return new com.facebook.ads.internal.server.c(com.facebook.ads.internal.server.c.a.a);

        case 0: // '\0'
            return a(jsonobject, s, s1, ((String) (obj)));

        case 1: // '\001'
            return a(jsonobject, s, s1);
        }
_L2:
        if (s2.equals("ads"))
        {
            byte0 = 0;
        }
          goto _L4
        if (s2.equals("error"))
        {
            byte0 = 1;
        }
          goto _L4
    }

}
