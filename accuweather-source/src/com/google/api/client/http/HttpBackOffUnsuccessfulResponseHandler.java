// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.http;

import com.google.api.client.util.BackOff;
import com.google.api.client.util.BackOffUtils;
import com.google.api.client.util.Preconditions;
import com.google.api.client.util.Sleeper;
import java.io.IOException;

// Referenced classes of package com.google.api.client.http:
//            HttpUnsuccessfulResponseHandler, HttpRequest, HttpResponse

public class HttpBackOffUnsuccessfulResponseHandler
    implements HttpUnsuccessfulResponseHandler
{
    public static interface BackOffRequired
    {

        public static final BackOffRequired ALWAYS = new BackOffRequired() {

            public boolean isRequired(HttpResponse httpresponse)
            {
                return true;
            }

        };
        public static final BackOffRequired ON_SERVER_ERROR = new BackOffRequired() {

            public boolean isRequired(HttpResponse httpresponse)
            {
                return httpresponse.getStatusCode() / 100 == 5;
            }

        };

        public abstract boolean isRequired(HttpResponse httpresponse);

    }


    private final BackOff backOff;
    private BackOffRequired backOffRequired;
    private Sleeper sleeper;

    public HttpBackOffUnsuccessfulResponseHandler(BackOff backoff)
    {
        backOffRequired = BackOffRequired.ON_SERVER_ERROR;
        sleeper = Sleeper.DEFAULT;
        backOff = (BackOff)Preconditions.checkNotNull(backoff);
    }

    public final BackOff getBackOff()
    {
        return backOff;
    }

    public final BackOffRequired getBackOffRequired()
    {
        return backOffRequired;
    }

    public final Sleeper getSleeper()
    {
        return sleeper;
    }

    public final boolean handleResponse(HttpRequest httprequest, HttpResponse httpresponse, boolean flag)
        throws IOException
    {
        while (!flag || !backOffRequired.isRequired(httpresponse)) 
        {
            return false;
        }
        try
        {
            flag = BackOffUtils.next(sleeper, backOff);
        }
        // Misplaced declaration of an exception variable
        catch (HttpRequest httprequest)
        {
            return false;
        }
        return flag;
    }

    public HttpBackOffUnsuccessfulResponseHandler setBackOffRequired(BackOffRequired backoffrequired)
    {
        backOffRequired = (BackOffRequired)Preconditions.checkNotNull(backoffrequired);
        return this;
    }

    public HttpBackOffUnsuccessfulResponseHandler setSleeper(Sleeper sleeper1)
    {
        sleeper = (Sleeper)Preconditions.checkNotNull(sleeper1);
        return this;
    }
}
