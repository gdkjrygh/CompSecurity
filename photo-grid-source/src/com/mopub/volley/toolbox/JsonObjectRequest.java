// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.volley.toolbox;

import com.mopub.volley.NetworkResponse;
import com.mopub.volley.ParseError;
import com.mopub.volley.Response;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.mopub.volley.toolbox:
//            JsonRequest, HttpHeaderParser

public class JsonObjectRequest extends JsonRequest
{

    public JsonObjectRequest(int i, String s, JSONObject jsonobject, com.mopub.volley.Response.Listener listener, com.mopub.volley.Response.ErrorListener errorlistener)
    {
        if (jsonobject == null)
        {
            jsonobject = null;
        } else
        {
            jsonobject = jsonobject.toString();
        }
        super(i, s, jsonobject, listener, errorlistener);
    }

    public JsonObjectRequest(String s, JSONObject jsonobject, com.mopub.volley.Response.Listener listener, com.mopub.volley.Response.ErrorListener errorlistener)
    {
        int i;
        if (jsonobject == null)
        {
            i = 0;
        } else
        {
            i = 1;
        }
        this(i, s, jsonobject, listener, errorlistener);
    }

    protected final Response a(NetworkResponse networkresponse)
    {
        try
        {
            networkresponse = Response.success(new JSONObject(new String(networkresponse.data, HttpHeaderParser.parseCharset(networkresponse.headers))), HttpHeaderParser.parseCacheHeaders(networkresponse));
        }
        // Misplaced declaration of an exception variable
        catch (NetworkResponse networkresponse)
        {
            return Response.error(new ParseError(networkresponse));
        }
        // Misplaced declaration of an exception variable
        catch (NetworkResponse networkresponse)
        {
            return Response.error(new ParseError(networkresponse));
        }
        return networkresponse;
    }
}
