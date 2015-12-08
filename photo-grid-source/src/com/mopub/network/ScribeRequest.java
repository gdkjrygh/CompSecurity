// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.network;

import com.mopub.common.event.EventSerializer;
import com.mopub.volley.DefaultRetryPolicy;
import com.mopub.volley.NetworkResponse;
import com.mopub.volley.Request;
import com.mopub.volley.Response;
import com.mopub.volley.toolbox.HttpHeaderParser;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

public class ScribeRequest extends Request
{

    private final List a;
    private final EventSerializer b;
    private final Listener c;

    public ScribeRequest(String s, List list, EventSerializer eventserializer, Listener listener)
    {
        super(1, s, listener);
        a = list;
        b = eventserializer;
        c = listener;
        setShouldCache(false);
        setRetryPolicy(new DefaultRetryPolicy());
    }

    protected final Response a(NetworkResponse networkresponse)
    {
        return Response.success(null, HttpHeaderParser.parseCacheHeaders(networkresponse));
    }

    protected final Map a()
    {
        JSONArray jsonarray = b.serializeAsJson(a);
        HashMap hashmap = new HashMap();
        hashmap.put("log", jsonarray.toString());
        return hashmap;
    }

    protected void deliverResponse(Object obj)
    {
        c.onResponse();
    }

    public List getEvents()
    {
        return a;
    }

    private class Listener
        implements com.mopub.volley.Response.ErrorListener
    {

        public abstract void onResponse();
    }

}
