// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.protocol.message;

import com.vungle.publisher.ci;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.vungle.publisher.protocol.message:
//            RequestLocalAdResponse, RequestAdResponse

public static class  extends 
{

    private RequestLocalAdResponse c(JSONObject jsonobject)
        throws JSONException
    {
label0:
        {
            RequestLocalAdResponse requestlocaladresponse = null;
            if (jsonobject != null)
            {
                if (!jsonobject.isNull("sleep"))
                {
                    break label0;
                }
                requestlocaladresponse = (RequestLocalAdResponse)super.(jsonobject);
                Long long1 = ci.d(jsonobject, "expiry");
                requestlocaladresponse.s = long1;
                a(jsonobject, "expiry", long1);
                requestlocaladresponse.t = ci.e(jsonobject, "postBundle");
                requestlocaladresponse.u = ci.e(jsonobject, "preBundle");
                requestlocaladresponse.v = ci.c(jsonobject, "size");
                requestlocaladresponse.w = jsonobject.optString("md5");
                a(jsonobject, "md5", requestlocaladresponse.w);
            }
            return requestlocaladresponse;
        }
        RequestLocalAdResponse requestlocaladresponse1 = new RequestLocalAdResponse();
        requestlocaladresponse1.r = Integer.valueOf(jsonobject.getInt("sleep"));
        return requestlocaladresponse1;
    }

    protected final Object a()
    {
        return new RequestLocalAdResponse();
    }

    public final Object a(JSONObject jsonobject)
        throws JSONException
    {
        return c(jsonobject);
    }

    protected final volatile Object[] a(int i)
    {
        return new RequestLocalAdResponse[i];
    }

    public final RequestAdResponse b(JSONObject jsonobject)
        throws JSONException
    {
        return c(jsonobject);
    }

    protected ()
    {
    }
}
