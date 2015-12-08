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
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.JsonParser;
import com.google.api.client.json.JsonToken;
import com.google.api.client.util.Clock;
import com.google.api.client.util.Preconditions;
import com.google.api.client.util.SecurityUtils;
import com.google.api.client.util.StringUtils;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GooglePublicKeysManager
{
    public static class Builder
    {

        Clock clock;
        final JsonFactory jsonFactory;
        String publicCertsEncodedUrl;
        final HttpTransport transport;

        public GooglePublicKeysManager build()
        {
            return new GooglePublicKeysManager(this);
        }

        public final Clock getClock()
        {
            return clock;
        }

        public final JsonFactory getJsonFactory()
        {
            return jsonFactory;
        }

        public final String getPublicCertsEncodedUrl()
        {
            return publicCertsEncodedUrl;
        }

        public final HttpTransport getTransport()
        {
            return transport;
        }

        public Builder setClock(Clock clock1)
        {
            clock = (Clock)Preconditions.checkNotNull(clock1);
            return this;
        }

        public Builder setPublicCertsEncodedUrl(String s)
        {
            publicCertsEncodedUrl = (String)Preconditions.checkNotNull(s);
            return this;
        }

        public Builder(HttpTransport httptransport, JsonFactory jsonfactory)
        {
            clock = Clock.SYSTEM;
            publicCertsEncodedUrl = "https://www.googleapis.com/oauth2/v1/certs";
            transport = (HttpTransport)Preconditions.checkNotNull(httptransport);
            jsonFactory = (JsonFactory)Preconditions.checkNotNull(jsonfactory);
        }
    }


    private static final Pattern MAX_AGE_PATTERN = Pattern.compile("\\s*max-age\\s*=\\s*(\\d+)\\s*");
    private static final long REFRESH_SKEW_MILLIS = 0x493e0L;
    private final Clock clock;
    private long expirationTimeMilliseconds;
    private final JsonFactory jsonFactory;
    private final Lock lock;
    private final String publicCertsEncodedUrl;
    private List publicKeys;
    private final HttpTransport transport;

    protected GooglePublicKeysManager(Builder builder)
    {
        lock = new ReentrantLock();
        transport = builder.transport;
        jsonFactory = builder.jsonFactory;
        clock = builder.clock;
        publicCertsEncodedUrl = builder.publicCertsEncodedUrl;
    }

    public GooglePublicKeysManager(HttpTransport httptransport, JsonFactory jsonfactory)
    {
        this(new Builder(httptransport, jsonfactory));
    }

    long getCacheTimeInSec(HttpHeaders httpheaders)
    {
        long l;
        long l1;
        l1 = 0L;
        l = l1;
        if (httpheaders.getCacheControl() == null) goto _L2; else goto _L1
_L1:
        String as[];
        int i;
        int j;
        as = httpheaders.getCacheControl().split(",");
        j = as.length;
        i = 0;
_L7:
        l = l1;
        if (i >= j) goto _L2; else goto _L3
_L3:
        Object obj;
        obj = as[i];
        obj = MAX_AGE_PATTERN.matcher(((CharSequence) (obj)));
        if (!((Matcher) (obj)).matches()) goto _L5; else goto _L4
_L4:
        l = Long.valueOf(((Matcher) (obj)).group(1)).longValue();
_L2:
        long l2 = l;
        if (httpheaders.getAge() != null)
        {
            l2 = l - httpheaders.getAge().longValue();
        }
        return Math.max(0L, l2);
_L5:
        i++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final Clock getClock()
    {
        return clock;
    }

    public final long getExpirationTimeMilliseconds()
    {
        return expirationTimeMilliseconds;
    }

    public final JsonFactory getJsonFactory()
    {
        return jsonFactory;
    }

    public final String getPublicCertsEncodedUrl()
    {
        return publicCertsEncodedUrl;
    }

    public final List getPublicKeys()
        throws GeneralSecurityException, IOException
    {
        lock.lock();
        List list;
        if (publicKeys == null || clock.currentTimeMillis() + 0x493e0L > expirationTimeMilliseconds)
        {
            refresh();
        }
        list = publicKeys;
        lock.unlock();
        return list;
        Exception exception;
        exception;
        lock.unlock();
        throw exception;
    }

    public final HttpTransport getTransport()
    {
        return transport;
    }

    public GooglePublicKeysManager refresh()
        throws GeneralSecurityException, IOException
    {
        lock.lock();
        JsonToken jsontoken1;
        CertificateFactory certificatefactory;
        JsonParser jsonparser;
        publicKeys = new ArrayList();
        certificatefactory = SecurityUtils.getX509CertificateFactory();
        HttpResponse httpresponse = transport.createRequestFactory().buildGetRequest(new GenericUrl(publicCertsEncodedUrl)).execute();
        expirationTimeMilliseconds = clock.currentTimeMillis() + getCacheTimeInSec(httpresponse.getHeaders()) * 1000L;
        jsonparser = jsonFactory.createJsonParser(httpresponse.getContent());
        jsontoken1 = jsonparser.getCurrentToken();
        JsonToken jsontoken;
        jsontoken = jsontoken1;
        if (jsontoken1 != null)
        {
            break MISSING_BLOCK_LABEL_106;
        }
        jsontoken = jsonparser.nextToken();
        Exception exception;
        boolean flag;
        if (jsontoken == JsonToken.START_OBJECT)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        X509Certificate x509certificate;
        for (; jsonparser.nextToken() != JsonToken.END_OBJECT; publicKeys.add(x509certificate.getPublicKey()))
        {
            jsonparser.nextToken();
            x509certificate = (X509Certificate)certificatefactory.generateCertificate(new ByteArrayInputStream(StringUtils.getBytesUtf8(jsonparser.getText())));
        }

        break MISSING_BLOCK_LABEL_204;
        exception;
        jsonparser.close();
        throw exception;
        exception;
        lock.unlock();
        throw exception;
        publicKeys = Collections.unmodifiableList(publicKeys);
        jsonparser.close();
        lock.unlock();
        return this;
    }

}
