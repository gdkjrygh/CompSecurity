// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import com.facebook.internal.ak;
import com.facebook.internal.aw;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.facebook:
//            aa, aj, am, GraphRequest

final class w
    implements aa
{

    final aa a;
    final GraphRequest b;

    w(GraphRequest graphrequest, aa aa1)
    {
        b = graphrequest;
        a = aa1;
        super();
    }

    public final void a(aj aj1)
    {
        Object obj = aj1.b();
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
                am am1;
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
                am1 = am.h;
                if (s.equals("warning"))
                {
                    am1 = am.g;
                }
                s = ((String) (obj));
                if (!aw.a(((String) (obj1))))
                {
                    s = (new StringBuilder()).append(((String) (obj))).append(" Link: ").append(((String) (obj1))).toString();
                }
                ak.a(am1, GraphRequest.a, s);
                i++;
            }
        }
        if (a != null)
        {
            a.a(aj1);
        }
    }
}
