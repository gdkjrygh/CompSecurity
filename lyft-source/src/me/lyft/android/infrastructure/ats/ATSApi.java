// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.ats;

import com.google.gson.Gson;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Response;
import java.io.IOException;
import me.lyft.android.ILyftPreferences;
import me.lyft.android.common.Strings;
import me.lyft.android.infrastructure.api.BaseApi;
import me.lyft.android.infrastructure.api.JsonBody;
import me.lyft.android.infrastructure.device.IDevice;
import rx.Observable;

// Referenced classes of package me.lyft.android.infrastructure.ats:
//            DriverApplicationDTO, DriverApplicationDataDTO, ATSError, ATSException

public class ATSApi extends BaseApi
{

    private static final int API_VERSION = 2;
    IDevice device;
    private ILyftPreferences preferences;

    ATSApi(OkHttpClient okhttpclient, Gson gson, ILyftPreferences ilyftpreferences, IDevice idevice)
    {
        super(okhttpclient, gson);
        preferences = ilyftpreferences;
        device = idevice;
    }

    private String getATSApiRoot()
    {
        return (new StringBuilder()).append(preferences.getATSApiRoot()).append("/api").toString();
    }

    private String getDefaultApplicationSelf()
    {
        return (new StringBuilder()).append(getATSApiRoot()).append("/leads/me").toString();
    }

    protected com.squareup.okhttp.Request.Builder createRequest()
    {
        com.squareup.okhttp.Request.Builder builder = (new com.squareup.okhttp.Request.Builder()).addHeader("Accept", "application/vnd.lyft.ats+json;version=2");
        if (!Strings.isNullOrEmpty(preferences.getLyftToken()))
        {
            builder.addHeader("Authorization", (new StringBuilder()).append("lyftToken ").append(preferences.getLyftToken()).toString());
        }
        return builder;
    }

    public Observable getDriverApplication()
    {
        String s = getDefaultApplicationSelf();
        return executeAsync(createRequest().url(s).get(), me/lyft/android/infrastructure/ats/DriverApplicationDTO);
    }

    public Observable getDriverApplicationData()
    {
        String s = (new StringBuilder()).append(getATSApiRoot()).append("/application_data/").toString();
        return executeAsync(createRequest().url(s).get(), me/lyft/android/infrastructure/ats/DriverApplicationDataDTO);
    }

    protected IOException getUnsuccessfulResponseException(Response response)
    {
        ATSError atserror;
        try
        {
            atserror = (ATSError)deserializeJsonBody(response, me/lyft/android/infrastructure/ats/ATSError);
        }
        catch (Throwable throwable)
        {
            throwable = new ATSError();
        }
        return new ATSException(atserror, response.code());
    }

    public Observable updateDriverApplication(DriverApplicationDTO driverapplicationdto)
    {
        String s;
        if (driverapplicationdto.getSelf() != null)
        {
            s = driverapplicationdto.getSelf();
        } else
        {
            s = getDefaultApplicationSelf();
        }
        return executeAsync(createRequest().url(s).put(JsonBody.create(gson, driverapplicationdto)), me/lyft/android/infrastructure/ats/DriverApplicationDTO);
    }
}
