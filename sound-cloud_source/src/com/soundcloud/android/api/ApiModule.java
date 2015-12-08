// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api;

import android.content.Context;
import com.c.a.t;
import com.soundcloud.android.accounts.AccountOperations;
import com.soundcloud.android.ads.AdIdHelper;
import com.soundcloud.android.api.json.JacksonJsonTransformer;
import com.soundcloud.android.api.json.JsonTransformer;
import com.soundcloud.android.api.legacy.PublicApi;
import com.soundcloud.android.api.oauth.OAuth;
import com.soundcloud.android.utils.DeviceHelper;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.soundcloud.android.api:
//            ApiClient, UnauthorisedRequestRegistry, ApiUrlBuilder

public class ApiModule
{

    private static final int CONNECT_TIMEOUT_SECONDS = 20;
    private static final int READ_WRITE_TIMEOUT_SECONDS = 20;

    public ApiModule()
    {
    }

    public ApiClient provideApiClient(t t1, ApiUrlBuilder apiurlbuilder, JsonTransformer jsontransformer, DeviceHelper devicehelper, AdIdHelper adidhelper, OAuth oauth, UnauthorisedRequestRegistry unauthorisedrequestregistry, 
            AccountOperations accountoperations)
    {
        t1 = new ApiClient(t1, apiurlbuilder, jsontransformer, devicehelper, adidhelper, oauth, unauthorisedrequestregistry, accountoperations);
        t1.setAssertBackgroundThread(true);
        return t1;
    }

    public JsonTransformer provideJsonTransformer()
    {
        return new JacksonJsonTransformer();
    }

    public t provideOkHttpClient()
    {
        t t1 = new t();
        TimeUnit timeunit = TimeUnit.SECONDS;
        if (20L < 0L)
        {
            throw new IllegalArgumentException("timeout < 0");
        }
        if (timeunit == null)
        {
            throw new IllegalArgumentException("unit == null");
        }
        long l = timeunit.toMillis(20L);
        if (l > 0x7fffffffL)
        {
            throw new IllegalArgumentException("Timeout too large.");
        }
        if (l == 0L && 20L > 0L)
        {
            throw new IllegalArgumentException("Timeout too small.");
        }
        t1.w = (int)l;
        timeunit = TimeUnit.SECONDS;
        if (20L < 0L)
        {
            throw new IllegalArgumentException("timeout < 0");
        }
        if (timeunit == null)
        {
            throw new IllegalArgumentException("unit == null");
        }
        l = timeunit.toMillis(20L);
        if (l > 0x7fffffffL)
        {
            throw new IllegalArgumentException("Timeout too large.");
        }
        if (l == 0L && 20L > 0L)
        {
            throw new IllegalArgumentException("Timeout too small.");
        }
        t1.x = (int)l;
        timeunit = TimeUnit.SECONDS;
        if (20L < 0L)
        {
            throw new IllegalArgumentException("timeout < 0");
        }
        if (timeunit == null)
        {
            throw new IllegalArgumentException("unit == null");
        }
        l = timeunit.toMillis(20L);
        if (l > 0x7fffffffL)
        {
            throw new IllegalArgumentException("Timeout too large.");
        }
        if (l == 0L && 20L > 0L)
        {
            throw new IllegalArgumentException("Timeout too small.");
        } else
        {
            t1.y = (int)l;
            return t1;
        }
    }

    public PublicApi providePublicCloudApi(Context context)
    {
        return PublicApi.getInstance(context);
    }

    public UnauthorisedRequestRegistry provideUnauthorizedRequestRegistry(Context context)
    {
        return UnauthorisedRequestRegistry.getInstance(context);
    }
}
