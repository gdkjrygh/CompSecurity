// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.nativeads;

import com.mopub.network.MoPubNetworkError;
import com.mopub.volley.NetworkResponse;
import com.mopub.volley.Response;
import com.mopub.volley.VolleyError;
import com.mopub.volley.toolbox.HttpHeaderParser;
import com.mopub.volley.toolbox.JsonRequest;
import java.io.UnsupportedEncodingException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class PositioningRequest extends JsonRequest
{

    public PositioningRequest(String s, com.mopub.volley.Response.Listener listener, com.mopub.volley.Response.ErrorListener errorlistener)
    {
        super(0, s, null, listener, errorlistener);
    }

    private static void a(JSONArray jsonarray, MoPubNativeAdPositioning.MoPubClientPositioning mopubclientpositioning)
    {
        for (int i = 0; i < jsonarray.length(); i++)
        {
            JSONObject jsonobject = jsonarray.getJSONObject(i);
            int j = jsonobject.optInt("section", 0);
            if (j < 0)
            {
                throw new JSONException((new StringBuilder("Invalid section ")).append(j).append(" in JSON response").toString());
            }
            if (j > 0)
            {
                continue;
            }
            j = jsonobject.getInt("position");
            if (j < 0 || j > 0x10000)
            {
                throw new JSONException((new StringBuilder("Invalid position ")).append(j).append(" in JSON response").toString());
            }
            mopubclientpositioning.addFixedPosition(j);
        }

    }

    protected final Response a(NetworkResponse networkresponse)
    {
        Object obj;
        JSONObject jsonobject;
        if (networkresponse.statusCode != 200)
        {
            return Response.error(new VolleyError(networkresponse));
        }
        if (networkresponse.data.length == 0)
        {
            return Response.error(new VolleyError("Empty positioning response", new JSONException("Empty response")));
        }
        try
        {
            jsonobject = new JSONObject(new String(networkresponse.data, HttpHeaderParser.parseCharset(networkresponse.headers)));
            obj = jsonobject.optString("error", null);
        }
        // Misplaced declaration of an exception variable
        catch (NetworkResponse networkresponse)
        {
            return Response.error(new VolleyError("Couldn't parse JSON from Charset", networkresponse));
        }
        // Misplaced declaration of an exception variable
        catch (NetworkResponse networkresponse)
        {
            return Response.error(new VolleyError("JSON Parsing Error", networkresponse));
        }
        // Misplaced declaration of an exception variable
        catch (NetworkResponse networkresponse)
        {
            return Response.error(networkresponse);
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_149;
        }
        if (((String) (obj)).equalsIgnoreCase("WARMING_UP"))
        {
            throw new MoPubNetworkError(com.mopub.network.MoPubNetworkError.Reason.WARMING_UP);
        }
        throw new JSONException(((String) (obj)));
        obj = jsonobject.optJSONArray("fixed");
        jsonobject = jsonobject.optJSONObject("repeating");
        if (obj != null || jsonobject != null)
        {
            break MISSING_BLOCK_LABEL_187;
        }
        throw new JSONException("Must contain fixed or repeating positions");
        MoPubNativeAdPositioning.MoPubClientPositioning mopubclientpositioning = new MoPubNativeAdPositioning.MoPubClientPositioning();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_206;
        }
        a(((JSONArray) (obj)), mopubclientpositioning);
        if (jsonobject == null)
        {
            break MISSING_BLOCK_LABEL_269;
        }
        int i = jsonobject.getInt("interval");
        if (i >= 2 && i <= 0x10000)
        {
            break MISSING_BLOCK_LABEL_261;
        }
        throw new JSONException((new StringBuilder("Invalid interval ")).append(i).append(" in JSON response").toString());
        mopubclientpositioning.enableRepeatingPositions(i);
        networkresponse = Response.success(mopubclientpositioning, HttpHeaderParser.parseCacheHeaders(networkresponse));
        return networkresponse;
    }

    protected volatile void deliverResponse(Object obj)
    {
        super.deliverResponse((MoPubNativeAdPositioning.MoPubClientPositioning)obj);
    }
}
