// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import com.facebook.b.al;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.facebook:
//            ad, an, aq, GraphRequest

class z
    implements ad
{

    final ad a;
    final GraphRequest b;

    z(GraphRequest graphrequest, ad ad1)
    {
        b = graphrequest;
        a = ad1;
        super();
    }

    public void a(an an1)
    {
        Object obj = an1.b();
        JSONArray jsonarray;
        if (obj != null)
        {
            obj = ((JSONObject) (obj)).optJSONObject("__debug__");
        } else
        {
            obj = null;
        }
        if (obj != null)
        {
            jsonarray = ((JSONObject) (obj)).optJSONArray("messages");
        } else
        {
            jsonarray = null;
        }
        if (jsonarray != null)
        {
            int i = 0;
            while (i < jsonarray.length()) 
            {
                Object obj1 = jsonarray.optJSONObject(i);
                String s;
                aq aq1;
                if (obj1 != null)
                {
                    obj = ((JSONObject) (obj1)).optString("message");
                } else
                {
                    obj = null;
                }
                if (obj1 != null)
                {
                    s = ((JSONObject) (obj1)).optString("type");
                } else
                {
                    s = null;
                }
                if (obj1 != null)
                {
                    obj1 = ((JSONObject) (obj1)).optString("link");
                } else
                {
                    obj1 = null;
                }
                if (obj == null || s == null)
                {
                    continue;
                }
                aq1 = aq.h;
                if (s.equals("warning"))
                {
                    aq1 = aq.g;
                }
                s = ((String) (obj));
                if (!al.a(((String) (obj1))))
                {
                    s = (new StringBuilder()).append(((String) (obj))).append(" Link: ").append(((String) (obj1))).toString();
                }
                com.facebook.b.z.a(aq1, GraphRequest.a, s);
                i++;
            }
        }
        if (a != null)
        {
            a.a(an1);
        }
    }
}
