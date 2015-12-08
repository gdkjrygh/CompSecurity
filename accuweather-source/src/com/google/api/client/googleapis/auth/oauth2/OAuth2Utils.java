// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.googleapis.auth.oauth2;

import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpHeaders;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpTransport;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;

class OAuth2Utils
{

    private static final String METADATA_SERVER_URL = "http://metadata.google.internal";
    static final Charset UTF_8 = Charset.forName("UTF-8");

    private OAuth2Utils()
    {
    }

    static Throwable exceptionWithCause(Throwable throwable, Throwable throwable1)
    {
        throwable.initCause(throwable1);
        return throwable;
    }

    static boolean headersContainValue(HttpHeaders httpheaders, String s, String s1)
    {
label0:
        {
            httpheaders = ((HttpHeaders) (httpheaders.get(s)));
            if (!(httpheaders instanceof Collection))
            {
                break label0;
            }
            httpheaders = ((Collection)httpheaders).iterator();
            do
            {
                if (!httpheaders.hasNext())
                {
                    break label0;
                }
                s = ((String) (httpheaders.next()));
            } while (!(s instanceof String) || !((String)s).equals(s1));
            return true;
        }
        return false;
    }

    static boolean runningOnComputeEngine(HttpTransport httptransport)
    {
        boolean flag;
        try
        {
            GenericUrl genericurl = new GenericUrl("http://metadata.google.internal");
            flag = headersContainValue(httptransport.createRequestFactory().buildGetRequest(genericurl).execute().getHeaders(), "Metadata-Flavor", "Google");
        }
        // Misplaced declaration of an exception variable
        catch (HttpTransport httptransport)
        {
            return false;
        }
label0:
        {
            if (flag)
            {
                return true;
            }
            break label0;
        }
    }

}
