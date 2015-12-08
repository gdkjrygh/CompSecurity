// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api;

import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.HttpHeaderParser;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.pinterest.api:
//            ByteApiResponseHandler

public class ByteRequest extends Request
{

    private com.android.volley.Response.Listener a;
    private com.android.volley.Response.ErrorListener b;
    private Map c;

    public ByteRequest(String s, Map map, ByteApiResponseHandler byteapiresponsehandler)
    {
        super(0, s, null);
        a = null;
        b = null;
        c = null;
        c = map;
        a = byteapiresponsehandler;
        b = byteapiresponsehandler;
    }

    public void deliverError(VolleyError volleyerror)
    {
        if (b != null)
        {
            b.onErrorResponse(volleyerror);
        }
        a = null;
        b = null;
    }

    protected void deliverResponse(Object obj)
    {
        obj = (byte[])obj;
        if (a != null)
        {
            a.onResponse(obj);
        }
        a = null;
        b = null;
    }

    public Map getHeaders()
    {
        if (c == null || c.equals(Collections.emptyMap()))
        {
            c = new HashMap();
        }
        return c;
    }

    protected Response parseNetworkResponse(NetworkResponse networkresponse)
    {
        return Response.success(networkresponse.data, HttpHeaderParser.parseCacheHeaders(networkresponse));
    }
}
