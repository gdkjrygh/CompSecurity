// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import com.facebook.internal.Logger;
import com.facebook.internal.Utility;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.facebook:
//            GraphRequest, GraphResponse, LoggingBehavior

class llback
    implements llback
{

    final GraphRequest this$0;
    final llback val$callback;

    public void onCompleted(GraphResponse graphresponse)
    {
        Object obj = graphresponse.getJSONObject();
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
                loggingbehavior = LoggingBehavior.GRAPH_API_DEBUG_INFO;
                if (s.equals("warning"))
                {
                    loggingbehavior = LoggingBehavior.GRAPH_API_DEBUG_WARNING;
                }
                s = ((String) (obj));
                if (!Utility.isNullOrEmpty(((String) (obj1))))
                {
                    s = (new StringBuilder()).append(((String) (obj))).append(" Link: ").append(((String) (obj1))).toString();
                }
                Logger.log(loggingbehavior, GraphRequest.TAG, s);
                i++;
            }
        }
        if (val$callback != null)
        {
            val$callback.onCompleted(graphresponse);
        }
    }

    llback()
    {
        this$0 = final_graphrequest;
        val$callback = llback.this;
        super();
    }
}
