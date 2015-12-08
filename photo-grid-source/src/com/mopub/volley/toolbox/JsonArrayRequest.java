// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.volley.toolbox;

import com.mopub.volley.NetworkResponse;
import com.mopub.volley.ParseError;
import com.mopub.volley.Response;
import java.io.UnsupportedEncodingException;
import org.json.JSONArray;
import org.json.JSONException;

// Referenced classes of package com.mopub.volley.toolbox:
//            JsonRequest, HttpHeaderParser

public class JsonArrayRequest extends JsonRequest
{

    public JsonArrayRequest(String s, com.mopub.volley.Response.Listener listener, com.mopub.volley.Response.ErrorListener errorlistener)
    {
        super(0, s, null, listener, errorlistener);
    }

    protected final Response a(NetworkResponse networkresponse)
    {
        try
        {
            networkresponse = Response.success(new JSONArray(new String(networkresponse.data, HttpHeaderParser.parseCharset(networkresponse.headers))), HttpHeaderParser.parseCacheHeaders(networkresponse));
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
