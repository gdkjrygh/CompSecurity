// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.c;

import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.impl.auth.DigestScheme;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.util.EntityUtils;

public class i
{

    public static String a = "/v2/search";
    public static String b = "/v2/echo";
    private static String c = "image_url";
    private static HttpHost d;
    private static BasicHttpContext e;
    private static DefaultHttpClient f;

    public i(String s, String s1)
    {
        b(s, s1);
    }

    private void b(String s, String s1)
    {
        f = new DefaultHttpClient();
        d = new HttpHost("api.moodstocks.com", 80, "http");
        AuthScope authscope = new AuthScope(d.getHostName(), d.getPort());
        s = new UsernamePasswordCredentials(s, s1);
        f.getCredentialsProvider().setCredentials(authscope, s);
        e = new BasicHttpContext();
        e.setAttribute("preemptive-auth", new DigestScheme());
    }

    public String a(HttpRequest httprequest)
    {
        return EntityUtils.toString(f.execute(d, httprequest, e).getEntity(), "UTF-8");
    }

    public HttpGet a(String s, String s1)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(s).append("?").append(c).append("=").append(s1);
        return new HttpGet(stringbuilder.toString());
    }

    public void a()
    {
        f.getConnectionManager().shutdown();
    }

}
