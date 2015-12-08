// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.auth.oauth;

import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.UrlEncodedParser;
import java.io.IOException;

// Referenced classes of package com.google.api.client.auth.oauth:
//            OAuthParameters, OAuthCredentialsResponse, OAuthSigner

public abstract class AbstractOAuthGetToken extends GenericUrl
{

    public String consumerKey;
    public OAuthSigner signer;
    public HttpTransport transport;
    protected boolean usePost;

    protected AbstractOAuthGetToken(String s)
    {
        super(s);
    }

    public OAuthParameters createParameters()
    {
        OAuthParameters oauthparameters = new OAuthParameters();
        oauthparameters.consumerKey = consumerKey;
        oauthparameters.signer = signer;
        return oauthparameters;
    }

    public final OAuthCredentialsResponse execute()
        throws IOException
    {
        Object obj1 = transport.createRequestFactory();
        Object obj;
        if (usePost)
        {
            obj = "POST";
        } else
        {
            obj = "GET";
        }
        obj = ((HttpRequestFactory) (obj1)).buildRequest(((String) (obj)), this, null);
        createParameters().intercept(((HttpRequest) (obj)));
        obj = ((HttpRequest) (obj)).execute();
        ((HttpResponse) (obj)).setContentLoggingLimit(0);
        obj1 = new OAuthCredentialsResponse();
        UrlEncodedParser.parse(((HttpResponse) (obj)).parseAsString(), obj1);
        return ((OAuthCredentialsResponse) (obj1));
    }
}
