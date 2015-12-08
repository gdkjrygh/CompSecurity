// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.googleapis.auth.oauth2;

import com.google.api.client.auth.oauth2.TokenResponse;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpHeaders;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.JsonObjectParser;
import java.io.IOException;

// Referenced classes of package com.google.api.client.googleapis.auth.oauth2:
//            GoogleCredential, DefaultCredentialProvider

private static class  extends GoogleCredential
{

    private static final String TOKEN_SERVER_ENCODED_URL = "http://metadata/computeMetadata/v1/instance/service-accounts/default/token";

    protected TokenResponse executeRefreshToken()
        throws IOException
    {
        Object obj = new GenericUrl(getTokenServerEncodedUrl());
        Object obj1 = getTransport().createRequestFactory().buildGetRequest(((GenericUrl) (obj)));
        obj = new JsonObjectParser(getJsonFactory());
        ((HttpRequest) (obj1)).setParser(((com.google.api.client.util.ObjectParser) (obj)));
        ((HttpRequest) (obj1)).getHeaders().set("X-Google-Metadata-Request", Boolean.valueOf(true));
        ((HttpRequest) (obj1)).setThrowExceptionOnExecuteError(false);
        obj1 = ((HttpRequest) (obj1)).execute();
        int i = ((HttpResponse) (obj1)).getStatusCode();
        if (i == 200)
        {
            java.io.InputStream inputstream = ((HttpResponse) (obj1)).getContent();
            if (inputstream == null)
            {
                throw new IOException("Empty content from metadata token server request.");
            } else
            {
                return (TokenResponse)((JsonObjectParser) (obj)).parseAndClose(inputstream, ((HttpResponse) (obj1)).getContentCharset(), com/google/api/client/auth/oauth2/TokenResponse);
            }
        }
        if (i == 404)
        {
            throw new IOException(String.format("Error code %s trying to get security access token from Compute Engine metadata for the default service account. This may be because the virtual machine instance does not have permission scopes specified.", new Object[] {
                Integer.valueOf(i)
            }));
        } else
        {
            throw new IOException(String.format("Unexpected Error code %s trying to get security access token from Compute Engine metadata for the default service account: %s", new Object[] {
                Integer.valueOf(i), ((HttpResponse) (obj1)).parseAsString()
            }));
        }
    }

    (HttpTransport httptransport, JsonFactory jsonfactory)
    {
        super((new ()).(httptransport).(jsonfactory).("http://metadata/computeMetadata/v1/instance/service-accounts/default/token"));
    }
}
