// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.googleapis.services;

import com.google.api.client.googleapis.batch.BatchRequest;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.util.ObjectParser;
import com.google.api.client.util.Preconditions;
import com.google.api.client.util.Strings;
import java.io.IOException;
import java.util.logging.Logger;

// Referenced classes of package com.google.api.client.googleapis.services:
//            GoogleClientRequestInitializer, AbstractGoogleClientRequest

public abstract class AbstractGoogleClient
{
    public static abstract class Builder
    {

        String applicationName;
        GoogleClientRequestInitializer googleClientRequestInitializer;
        HttpRequestInitializer httpRequestInitializer;
        final ObjectParser objectParser;
        String rootUrl;
        String servicePath;
        boolean suppressPatternChecks;
        boolean suppressRequiredParameterChecks;
        final HttpTransport transport;

        public abstract AbstractGoogleClient build();

        public final String getApplicationName()
        {
            return applicationName;
        }

        public final GoogleClientRequestInitializer getGoogleClientRequestInitializer()
        {
            return googleClientRequestInitializer;
        }

        public final HttpRequestInitializer getHttpRequestInitializer()
        {
            return httpRequestInitializer;
        }

        public ObjectParser getObjectParser()
        {
            return objectParser;
        }

        public final String getRootUrl()
        {
            return rootUrl;
        }

        public final String getServicePath()
        {
            return servicePath;
        }

        public final boolean getSuppressPatternChecks()
        {
            return suppressPatternChecks;
        }

        public final boolean getSuppressRequiredParameterChecks()
        {
            return suppressRequiredParameterChecks;
        }

        public final HttpTransport getTransport()
        {
            return transport;
        }

        public Builder setApplicationName(String s)
        {
            applicationName = s;
            return this;
        }

        public Builder setGoogleClientRequestInitializer(GoogleClientRequestInitializer googleclientrequestinitializer)
        {
            googleClientRequestInitializer = googleclientrequestinitializer;
            return this;
        }

        public Builder setHttpRequestInitializer(HttpRequestInitializer httprequestinitializer)
        {
            httpRequestInitializer = httprequestinitializer;
            return this;
        }

        public Builder setRootUrl(String s)
        {
            rootUrl = AbstractGoogleClient.normalizeRootUrl(s);
            return this;
        }

        public Builder setServicePath(String s)
        {
            servicePath = AbstractGoogleClient.normalizeServicePath(s);
            return this;
        }

        public Builder setSuppressAllChecks(boolean flag)
        {
            return setSuppressPatternChecks(true).setSuppressRequiredParameterChecks(true);
        }

        public Builder setSuppressPatternChecks(boolean flag)
        {
            suppressPatternChecks = flag;
            return this;
        }

        public Builder setSuppressRequiredParameterChecks(boolean flag)
        {
            suppressRequiredParameterChecks = flag;
            return this;
        }

        protected Builder(HttpTransport httptransport, String s, String s1, ObjectParser objectparser, HttpRequestInitializer httprequestinitializer)
        {
            transport = (HttpTransport)Preconditions.checkNotNull(httptransport);
            objectParser = objectparser;
            setRootUrl(s);
            setServicePath(s1);
            httpRequestInitializer = httprequestinitializer;
        }
    }


    static final Logger LOGGER = Logger.getLogger(com/google/api/client/googleapis/services/AbstractGoogleClient.getName());
    private final String applicationName;
    private final GoogleClientRequestInitializer googleClientRequestInitializer;
    private final ObjectParser objectParser;
    private final HttpRequestFactory requestFactory;
    private final String rootUrl;
    private final String servicePath;
    private boolean suppressPatternChecks;
    private boolean suppressRequiredParameterChecks;

    protected AbstractGoogleClient(Builder builder)
    {
        googleClientRequestInitializer = builder.googleClientRequestInitializer;
        rootUrl = normalizeRootUrl(builder.rootUrl);
        servicePath = normalizeServicePath(builder.servicePath);
        if (Strings.isNullOrEmpty(builder.applicationName))
        {
            LOGGER.warning("Application name is not set. Call Builder#setApplicationName.");
        }
        applicationName = builder.applicationName;
        HttpRequestFactory httprequestfactory;
        if (builder.httpRequestInitializer == null)
        {
            httprequestfactory = builder.transport.createRequestFactory();
        } else
        {
            httprequestfactory = builder.transport.createRequestFactory(builder.httpRequestInitializer);
        }
        requestFactory = httprequestfactory;
        objectParser = builder.objectParser;
        suppressPatternChecks = builder.suppressPatternChecks;
        suppressRequiredParameterChecks = builder.suppressRequiredParameterChecks;
    }

    static String normalizeRootUrl(String s)
    {
        Preconditions.checkNotNull(s, "root URL cannot be null.");
        String s1 = s;
        if (!s.endsWith("/"))
        {
            s1 = String.valueOf(s).concat("/");
        }
        return s1;
    }

    static String normalizeServicePath(String s)
    {
        Preconditions.checkNotNull(s, "service path cannot be null");
        String s1;
        if (s.length() == 1)
        {
            Preconditions.checkArgument("/".equals(s), "service path must equal \"/\" if it is of length 1.");
            s1 = "";
        } else
        {
            s1 = s;
            if (s.length() > 0)
            {
                String s2 = s;
                if (!s.endsWith("/"))
                {
                    s2 = String.valueOf(s).concat("/");
                }
                s1 = s2;
                if (s2.startsWith("/"))
                {
                    return s2.substring(1);
                }
            }
        }
        return s1;
    }

    public final BatchRequest batch()
    {
        return batch(null);
    }

    public final BatchRequest batch(HttpRequestInitializer httprequestinitializer)
    {
        httprequestinitializer = new BatchRequest(getRequestFactory().getTransport(), httprequestinitializer);
        httprequestinitializer.setBatchUrl(new GenericUrl(String.valueOf(getRootUrl()).concat("batch")));
        return httprequestinitializer;
    }

    public final String getApplicationName()
    {
        return applicationName;
    }

    public final String getBaseUrl()
    {
        String s = String.valueOf(rootUrl);
        String s1 = String.valueOf(servicePath);
        if (s1.length() != 0)
        {
            return s.concat(s1);
        } else
        {
            return new String(s);
        }
    }

    public final GoogleClientRequestInitializer getGoogleClientRequestInitializer()
    {
        return googleClientRequestInitializer;
    }

    public ObjectParser getObjectParser()
    {
        return objectParser;
    }

    public final HttpRequestFactory getRequestFactory()
    {
        return requestFactory;
    }

    public final String getRootUrl()
    {
        return rootUrl;
    }

    public final String getServicePath()
    {
        return servicePath;
    }

    public final boolean getSuppressPatternChecks()
    {
        return suppressPatternChecks;
    }

    public final boolean getSuppressRequiredParameterChecks()
    {
        return suppressRequiredParameterChecks;
    }

    protected void initialize(AbstractGoogleClientRequest abstractgoogleclientrequest)
        throws IOException
    {
        if (getGoogleClientRequestInitializer() != null)
        {
            getGoogleClientRequestInitializer().initialize(abstractgoogleclientrequest);
        }
    }

}
