// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.googleapis.auth.clientlogin;

import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpExecuteInterceptor;
import com.google.api.client.http.HttpHeaders;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpResponseException;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.UrlEncodedContent;
import com.google.api.client.util.StringUtils;
import com.google.api.client.util.Strings;
import java.io.IOException;

// Referenced classes of package com.google.api.client.googleapis.auth.clientlogin:
//            AuthKeyValueParser, ClientLoginResponseException

public final class ClientLogin
{
    public static final class ErrorInfo
    {

        public String captchaToken;
        public String captchaUrl;
        public String error;
        public String url;

        public ErrorInfo()
        {
        }
    }

    public static final class Response
        implements HttpExecuteInterceptor, HttpRequestInitializer
    {

        public String auth;

        public String getAuthorizationHeaderValue()
        {
            return ClientLogin.getAuthorizationHeaderValue(auth);
        }

        public void initialize(HttpRequest httprequest)
        {
            httprequest.setInterceptor(this);
        }

        public void intercept(HttpRequest httprequest)
        {
            httprequest.getHeaders().setAuthorization(getAuthorizationHeaderValue());
        }

        public Response()
        {
        }
    }


    public String accountType;
    public String applicationName;
    public String authTokenType;
    public String captchaAnswer;
    public String captchaToken;
    public String password;
    public GenericUrl serverUrl;
    public HttpTransport transport;
    public String username;

    public ClientLogin()
    {
        serverUrl = new GenericUrl("https://www.google.com");
    }

    public static String getAuthorizationHeaderValue(String s)
    {
        s = String.valueOf(s);
        if (s.length() != 0)
        {
            return "GoogleLogin auth=".concat(s);
        } else
        {
            return new String("GoogleLogin auth=");
        }
    }

    public Response authenticate()
        throws IOException
    {
        Object obj = serverUrl.clone();
        ((GenericUrl) (obj)).appendRawPath("/accounts/ClientLogin");
        obj = transport.createRequestFactory().buildPostRequest(((GenericUrl) (obj)), new UrlEncodedContent(this));
        ((HttpRequest) (obj)).setParser(AuthKeyValueParser.INSTANCE);
        ((HttpRequest) (obj)).setContentLoggingLimit(0);
        ((HttpRequest) (obj)).setThrowExceptionOnExecuteError(false);
        Object obj1 = ((HttpRequest) (obj)).execute();
        if (((HttpResponse) (obj1)).isSuccessStatusCode())
        {
            return (Response)((HttpResponse) (obj1)).parseAs(com/google/api/client/googleapis/auth/clientlogin/ClientLogin$Response);
        }
        obj = new com.google.api.client.http.HttpResponseException.Builder(((HttpResponse) (obj1)).getStatusCode(), ((HttpResponse) (obj1)).getStatusMessage(), ((HttpResponse) (obj1)).getHeaders());
        ErrorInfo errorinfo = (ErrorInfo)((HttpResponse) (obj1)).parseAs(com/google/api/client/googleapis/auth/clientlogin/ClientLogin$ErrorInfo);
        String s = errorinfo.toString();
        obj1 = HttpResponseException.computeMessageBuffer(((HttpResponse) (obj1)));
        if (!Strings.isNullOrEmpty(s))
        {
            ((StringBuilder) (obj1)).append(StringUtils.LINE_SEPARATOR).append(s);
            ((com.google.api.client.http.HttpResponseException.Builder) (obj)).setContent(s);
        }
        ((com.google.api.client.http.HttpResponseException.Builder) (obj)).setMessage(((StringBuilder) (obj1)).toString());
        throw new ClientLoginResponseException(((com.google.api.client.http.HttpResponseException.Builder) (obj)), errorinfo);
    }
}
