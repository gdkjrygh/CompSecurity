// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.network;

import android.content.Context;
import android.text.TextUtils;
import com.mopub.volley.DefaultRetryPolicy;
import com.mopub.volley.NetworkResponse;
import com.mopub.volley.Request;
import com.mopub.volley.RequestQueue;
import com.mopub.volley.Response;
import com.mopub.volley.toolbox.HttpHeaderParser;
import java.util.Arrays;
import java.util.Iterator;

// Referenced classes of package com.mopub.network:
//            Networking, i, MoPubNetworkError

public class TrackingRequest extends Request
{

    private final Listener a;

    private TrackingRequest(String s, Listener listener)
    {
        super(0, s, listener);
        a = listener;
        setShouldCache(false);
        setRetryPolicy(new DefaultRetryPolicy(2500, 1, 1.0F));
    }

    public static void makeTrackingHttpRequest(Iterable iterable, Context context)
    {
        makeTrackingHttpRequest(iterable, context, null, null);
    }

    public static void makeTrackingHttpRequest(Iterable iterable, Context context, com.mopub.common.event.BaseEvent.Name name)
    {
        makeTrackingHttpRequest(iterable, context, null, name);
    }

    public static void makeTrackingHttpRequest(Iterable iterable, Context context, Listener listener, com.mopub.common.event.BaseEvent.Name name)
    {
        if (iterable != null && context != null)
        {
            context = Networking.getRequestQueue(context);
            iterable = iterable.iterator();
            while (iterable.hasNext()) 
            {
                name = (String)iterable.next();
                if (!TextUtils.isEmpty(name))
                {
                    context.add(new TrackingRequest(name, new i(listener, name)));
                }
            }
        }
    }

    public static void makeTrackingHttpRequest(String s, Context context)
    {
        makeTrackingHttpRequest(s, context, null, null);
    }

    public static void makeTrackingHttpRequest(String s, Context context, com.mopub.common.event.BaseEvent.Name name)
    {
        makeTrackingHttpRequest(s, context, null, name);
    }

    public static void makeTrackingHttpRequest(String s, Context context, Listener listener)
    {
        makeTrackingHttpRequest(s, context, listener, null);
    }

    public static void makeTrackingHttpRequest(String s, Context context, Listener listener, com.mopub.common.event.BaseEvent.Name name)
    {
        if (s != null)
        {
            makeTrackingHttpRequest(((Iterable) (Arrays.asList(new String[] {
                s
            }))), context, listener, name);
        }
    }

    protected final Response a(NetworkResponse networkresponse)
    {
        if (networkresponse.statusCode != 200)
        {
            return Response.error(new MoPubNetworkError((new StringBuilder("Failed to log tracking request. Response code: ")).append(networkresponse.statusCode).append(" for url: ").append(getUrl()).toString(), MoPubNetworkError.Reason.TRACKING_FAILURE));
        } else
        {
            return Response.success(null, HttpHeaderParser.parseCacheHeaders(networkresponse));
        }
    }

    public volatile void deliverResponse(Object obj)
    {
        deliverResponse((Void)obj);
    }

    public void deliverResponse(Void void1)
    {
        if (a != null)
        {
            a.onResponse(getUrl());
        }
    }

    private class Listener
        implements com.mopub.volley.Response.ErrorListener
    {

        public abstract void onResponse(String s);
    }

}
