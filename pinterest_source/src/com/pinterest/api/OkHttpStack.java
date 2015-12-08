// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api;

import com.android.volley.Request;
import com.android.volley.toolbox.HurlStack;
import com.pinterest.experiment.Experiments;
import com.pinterest.reporting.CrashReporting;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.OkUrlFactory;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import javax.net.ssl.SSLPeerUnverifiedException;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolVersion;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.message.BasicStatusLine;

public class OkHttpStack extends HurlStack
{

    private final OkUrlFactory a;

    public OkHttpStack()
    {
        this(new OkHttpClient());
    }

    private OkHttpStack(OkHttpClient okhttpclient)
    {
        Experiments.a("android_api_certificate_pinning");
        if (Experiments.w())
        {
            okhttpclient.a((new com.squareup.okhttp.CertificatePinner.Builder()).a("api.pinterest.com", new String[] {
                "sha1/3lKvjNsfmrn+WmfDhvr2iVh/yRs=", "sha1/4hWDB5AgSukEjv9gSHiPDTjSHgM="
            }).a());
        }
        a = new OkUrlFactory(okhttpclient);
    }

    protected HttpURLConnection createConnection(URL url)
    {
        return a.a(url);
    }

    public HttpResponse performRequest(Request request, Map map)
    {
        try
        {
            request = super.performRequest(request, map);
        }
        // Misplaced declaration of an exception variable
        catch (Request request)
        {
            if (StringUtils.containsIgnoreCase(request.getMessage(), "certificate pinning"))
            {
                CrashReporting.a(request);
                a.a().a(null);
                return new BasicHttpResponse(new BasicStatusLine(new ProtocolVersion("HTTP", 1, 1), 500, "Could not complete request"));
            } else
            {
                throw request;
            }
        }
        return request;
    }
}
