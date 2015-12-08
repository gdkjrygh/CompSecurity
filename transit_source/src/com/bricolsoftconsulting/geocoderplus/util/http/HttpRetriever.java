// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bricolsoftconsulting.geocoderplus.util.http;

import java.io.IOException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.DefaultHttpClient;

public class HttpRetriever
{

    DefaultHttpClient httpclient;

    public HttpRetriever()
    {
        httpclient = null;
        httpclient = new DefaultHttpClient();
    }

    public String retrieve(String s)
        throws ClientProtocolException, IOException
    {
        s = new HttpGet(s);
        BasicResponseHandler basicresponsehandler = new BasicResponseHandler();
        return (String)httpclient.execute(s, basicresponsehandler);
    }
}
