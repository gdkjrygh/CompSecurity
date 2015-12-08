// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import org.json.JSONObject;

// Referenced classes of package com.facebook:
//            GraphRequest, GraphResponse

static final class val.callback
    implements llback
{

    final aphJSONArrayCallback val$callback;

    public void onCompleted(GraphResponse graphresponse)
    {
        if (val$callback != null)
        {
            Object obj = graphresponse.getJSONObject();
            if (obj != null)
            {
                obj = ((JSONObject) (obj)).optJSONArray("data");
            } else
            {
                obj = null;
            }
            val$callback.onCompleted(((org.json.JSONArray) (obj)), graphresponse);
        }
    }

    aphJSONArrayCallback(aphJSONArrayCallback aphjsonarraycallback)
    {
        val$callback = aphjsonarraycallback;
        super();
    }
}
