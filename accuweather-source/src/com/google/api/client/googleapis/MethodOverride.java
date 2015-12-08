// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.googleapis;

import com.google.api.client.http.EmptyContent;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpExecuteInterceptor;
import com.google.api.client.http.HttpHeaders;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.UrlEncodedContent;
import java.io.IOException;

public final class MethodOverride
    implements HttpExecuteInterceptor, HttpRequestInitializer
{
    public static final class Builder
    {

        private boolean overrideAllMethods;

        public MethodOverride build()
        {
            return new MethodOverride(overrideAllMethods);
        }

        public boolean getOverrideAllMethods()
        {
            return overrideAllMethods;
        }

        public Builder setOverrideAllMethods(boolean flag)
        {
            overrideAllMethods = flag;
            return this;
        }

        public Builder()
        {
        }
    }


    public static final String HEADER = "X-HTTP-Method-Override";
    static final int MAX_URL_LENGTH = 2048;
    private final boolean overrideAllMethods;

    public MethodOverride()
    {
        this(false);
    }

    MethodOverride(boolean flag)
    {
        overrideAllMethods = flag;
    }

    private boolean overrideThisMethod(HttpRequest httprequest)
        throws IOException
    {
        String s;
        boolean flag1;
        flag1 = true;
        s = httprequest.getRequestMethod();
        if (!s.equals("POST")) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        if (!s.equals("GET"))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (httprequest.getUrl().build().length() > 2048)
        {
            continue; /* Loop/switch isn't completed */
        }
_L5:
        flag = flag1;
        if (httprequest.getTransport().supportsMethod(s))
        {
            return false;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (overrideAllMethods)
        {
            return true;
        }
          goto _L5
        if (true) goto _L4; else goto _L6
_L6:
    }

    public void initialize(HttpRequest httprequest)
    {
        httprequest.setInterceptor(this);
    }

    public void intercept(HttpRequest httprequest)
        throws IOException
    {
        if (overrideThisMethod(httprequest))
        {
            String s = httprequest.getRequestMethod();
            httprequest.setRequestMethod("POST");
            httprequest.getHeaders().set("X-HTTP-Method-Override", s);
            if (s.equals("GET"))
            {
                httprequest.setContent(new UrlEncodedContent(httprequest.getUrl().clone()));
                httprequest.getUrl().clear();
            } else
            if (httprequest.getContent() == null)
            {
                httprequest.setContent(new EmptyContent());
                return;
            }
        }
    }
}
