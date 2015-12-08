// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api;

import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.HttpHeaderParser;
import com.pinterest.kit.log.PLog;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.apache.http.Header;
import org.apache.http.HttpEntity;

// Referenced classes of package com.pinterest.api:
//            RequestParams, BaseApiResponseHandler

public class MultipartRequest extends Request
{

    private HttpEntity a;
    private com.android.volley.Response.Listener b;
    private com.android.volley.Response.ErrorListener c;
    private Map d;

    public MultipartRequest(int i, String s, RequestParams requestparams, Map map, BaseApiResponseHandler baseapiresponsehandler)
    {
        Object obj = null;
        super(i, s, null);
        a = null;
        b = null;
        c = null;
        d = null;
        if (requestparams == null)
        {
            s = obj;
        } else
        {
            s = requestparams.b();
        }
        a = s;
        d = map;
        c = baseapiresponsehandler;
        b = baseapiresponsehandler;
    }

    public void deliverError(VolleyError volleyerror)
    {
        if (c != null)
        {
            c.onErrorResponse(volleyerror);
        }
        b = null;
        c = null;
    }

    protected void deliverResponse(Object obj)
    {
        obj = (String)obj;
        if (b != null)
        {
            b.onResponse(obj);
        }
        b = null;
        c = null;
    }

    public byte[] getBody()
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        if (a != null)
        {
            try
            {
                a.writeTo(bytearrayoutputstream);
            }
            catch (IOException ioexception)
            {
                PLog.error(ioexception, "exception occurred", new Object[0]);
            }
        }
        return bytearrayoutputstream.toByteArray();
    }

    public String getBodyContentType()
    {
        return a.getContentType().getValue();
    }

    public Map getHeaders()
    {
        if (d == null || d.equals(Collections.emptyMap()))
        {
            d = new HashMap();
        }
        return d;
    }

    protected Response parseNetworkResponse(NetworkResponse networkresponse)
    {
        String s;
        try
        {
            s = new String(networkresponse.data, HttpHeaderParser.parseCharset(networkresponse.headers));
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            unsupportedencodingexception = new String(networkresponse.data);
        }
        return Response.success(s, HttpHeaderParser.parseCacheHeaders(networkresponse));
    }
}
