// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.protocol.message;

import com.vungle.publisher.ci;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.vungle.publisher.protocol.message:
//            JsonDeserializationFactory, RequestConfigResponse

public static class I extends JsonDeserializationFactory
{

    protected final Object a()
    {
        return new RequestConfigResponse();
    }

    protected final Object a(JSONObject jsonobject)
        throws JSONException
    {
        Object obj = null;
        Object obj1 = null;
        if (jsonobject != null)
        {
            RequestConfigResponse requestconfigresponse = new RequestConfigResponse();
            requestconfigresponse.a = ci.a(jsonobject, "optIn");
            requestconfigresponse.b = ci.c(jsonobject, "updateDelay");
            requestconfigresponse.c = ci.c(jsonobject, "threshold");
            String s = ci.e(jsonobject, "connection");
            obj = obj1;
            if (s != null)
            {
                obj = Enum.valueOf(com/vungle/publisher/protocol/message/RequestConfigResponse$a, s);
            }
            requestconfigresponse.d = (I)obj;
            requestconfigresponse.e = ci.a(jsonobject, "exceptionReportingEnabled");
            requestconfigresponse.f = ci.d(jsonobject, "last_app_fingerprint_timestamp");
            requestconfigresponse.g = ci.d(jsonobject, "app_fingerprint_frequency");
            obj = requestconfigresponse;
        }
        return obj;
    }

    protected final volatile Object[] a(int i)
    {
        return new RequestConfigResponse[i];
    }

    I()
    {
    }
}
