// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.server;

import com.facebook.ads.internal.dto.a;
import com.facebook.ads.internal.dto.c;
import org.json.JSONArray;
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

    private d a(JSONObject jsonobject)
    {
        d d1 = new d();
        jsonobject.optInt("code");
        Object obj = jsonobject.getJSONArray("placements").getJSONObject(0);
        jsonobject = ((JSONObject) (obj)).optJSONObject("meta");
        if (jsonobject == null)
        {
            jsonobject = "";
        } else
        {
            jsonobject = jsonobject.getString("plid");
        }
        d1.a.a(jsonobject);
        jsonobject = c.a(((JSONObject) (obj)).getJSONObject("definition"));
        d1.a.a(jsonobject);
        jsonobject = jsonobject.a();
        if (((JSONObject) (obj)).has("ads"))
        {
            obj = ((JSONObject) (obj)).getJSONArray("ads");
            for (int i = 0; i < ((JSONArray) (obj)).length(); i++)
            {
                a a1 = new a(jsonobject);
                Object obj1 = ((JSONArray) (obj)).getJSONObject(i);
                a1.a(((JSONObject) (obj1)).getString("adapter"));
                JSONObject jsonobject1 = ((JSONObject) (obj1)).getJSONObject("data");
                obj1 = ((JSONObject) (obj1)).optJSONArray("trackers");
                if (obj1 != null)
                {
                    jsonobject1.put("trackers", obj1);
                }
                a1.a(jsonobject1);
                d1.a.a(a1);
            }

        }
        return d1;
    }

    private e b(JSONObject jsonobject)
    {
        String s = jsonobject.optString("message", "");
        jsonobject.optInt("code");
        return new e(s);
    }

    public com.facebook.ads.internal.server.c a(String s)
    {
        String s1;
        byte byte0;
        s = new JSONObject(s);
        s1 = s.optString("type");
        byte0 = -1;
        s1.hashCode();
        JVM INSTR lookupswitch 2: default 48
    //                   96432: 89
    //                   96784904: 103;
           goto _L1 _L2 _L3
_L1:
        break; /* Loop/switch isn't completed */
_L3:
        break MISSING_BLOCK_LABEL_103;
_L4:
        switch (byte0)
        {
        default:
            s = s.optJSONObject("error");
            if (s != null)
            {
                return b(s);
            } else
            {
                return new com.facebook.ads.internal.server.c(com.facebook.ads.internal.server.c.a.a);
            }

        case 0: // '\0'
            return a(((JSONObject) (s)));

        case 1: // '\001'
            return b(s);
        }
_L2:
        if (s1.equals("ads"))
        {
            byte0 = 0;
        }
          goto _L4
        if (s1.equals("error"))
        {
            byte0 = 1;
        }
          goto _L4
    }

}
