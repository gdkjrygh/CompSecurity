// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import com.facebook.internal.K;
import com.facebook.internal.U;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.facebook:
//            D, G, GraphRequest

final class x
    implements GraphRequest.b
{

    final GraphRequest.b a;
    final GraphRequest b;

    x(GraphRequest graphrequest, GraphRequest.b b1)
    {
        b = graphrequest;
        a = b1;
        super();
    }

    public final void a(D d)
    {
        Object obj = d.a;
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
                G g;
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
                g = G.h;
                if (s.equals("warning"))
                {
                    g = G.g;
                }
                s = ((String) (obj));
                if (!U.a(((String) (obj1))))
                {
                    s = (new StringBuilder()).append(((String) (obj))).append(" Link: ").append(((String) (obj1))).toString();
                }
                K.a(g, GraphRequest.a, s);
                i++;
            }
        }
        if (a != null)
        {
            a.a(d);
        }
    }
}
