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
//            HttpIOExceptionHandler, HttpRequest

public class HttpBackOffIOExceptionHandler
    implements HttpIOExceptionHandler
{

    private final BackOff backOff;
    private Sleeper sleeper;

    public HttpBackOffIOExceptionHandler(BackOff backoff)
    {
        sleeper = Sleeper.DEFAULT;
        backOff = (BackOff)Preconditions.checkNotNull(backoff);
    }

    public final BackOff getBackOff()
    {
        return backOff;
    }

    public final Sleeper getSleeper()
    {
        return sleeper;
    }

    public boolean handleIOException(HttpRequest httprequest, boolean flag)
        throws IOException
    {
        if (!flag)
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

    public HttpBackOffIOExceptionHandler setSleeper(Sleeper sleeper1)
    {
        sleeper = (Sleeper)Preconditions.checkNotNull(sleeper1);
        return this;
    }
}
