// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.volley.toolbox;

import com.mopub.volley.NetworkResponse;
import com.mopub.volley.Request;
import com.mopub.volley.Response;
import com.mopub.volley.VolleyLog;
import java.io.UnsupportedEncodingException;

public abstract class JsonRequest extends Request
{

    private static final String a = String.format("application/json; charset=%s", new Object[] {
        "utf-8"
    });
    private final com.mopub.volley.Response.Listener b;
    private final String c;

    public JsonRequest(int i, String s, String s1, com.mopub.volley.Response.Listener listener, com.mopub.volley.Response.ErrorListener errorlistener)
    {
        super(i, s, errorlistener);
        b = listener;
        c = s1;
    }

    public JsonRequest(String s, String s1, com.mopub.volley.Response.Listener listener, com.mopub.volley.Response.ErrorListener errorlistener)
    {
        this(-1, s, s1, listener, errorlistener);
    }

    protected abstract Response a(NetworkResponse networkresponse);

    protected void deliverResponse(Object obj)
    {
        b.onResponse(obj);
    }

    public byte[] getBody()
    {
        if (c == null)
        {
            return null;
        }
        byte abyte0[];
        try
        {
            abyte0 = c.getBytes("utf-8");
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            VolleyLog.wtf("Unsupported Encoding while trying to get the bytes of %s using %s", new Object[] {
                c, "utf-8"
            });
            return null;
        }
        return abyte0;
    }

    public String getBodyContentType()
    {
        return a;
    }

    public byte[] getPostBody()
    {
        return getBody();
    }

    public String getPostBodyContentType()
    {
        return getBodyContentType();
    }

}
