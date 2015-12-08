// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import com.facebook.internal.h;
import com.facebook.internal.m;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.facebook:
//            GraphRequest, j, LoggingBehavior

final class a
    implements a
{

    final a a;
    final GraphRequest b;

    public final void a(j j1)
    {
        Object obj = j1.a;
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
                LoggingBehavior loggingbehavior;
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
                loggingbehavior = com.facebook.LoggingBehavior.h;
                if (s.equals("warning"))
                {
                    loggingbehavior = LoggingBehavior.g;
                }
                s = ((String) (obj));
                if (!m.a(((String) (obj1))))
                {
                    s = (new StringBuilder()).append(((String) (obj))).append(" Link: ").append(((String) (obj1))).toString();
                }
                h.a(loggingbehavior, GraphRequest.a, s);
                i++;
            }
        }
        if (a != null)
        {
            a.a(j1);
        }
    }

    (GraphRequest graphrequest,  )
    {
        b = graphrequest;
        a = ;
        super();
    }
}
