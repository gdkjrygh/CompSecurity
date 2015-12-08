// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.s3;

import com.google.gson.Gson;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;
import java.io.File;
import java.io.IOException;
import me.lyft.android.infrastructure.api.BaseApi;
import me.lyft.android.infrastructure.lyft.LyftApiException;
import me.lyft.android.infrastructure.lyft.LyftError;
import rx.Observable;

// Referenced classes of package me.lyft.android.infrastructure.s3:
//            IS3Api, ConfigsDTO

public class S3Api extends BaseApi
    implements IS3Api
{

    private static final String CONFIGS_URL = "http://api.lyft.com.s3.amazonaws.com/servers.json";

    public S3Api(OkHttpClient okhttpclient, Gson gson)
    {
        super(okhttpclient, gson);
    }

    protected com.squareup.okhttp.Request.Builder createRequest()
    {
        return new com.squareup.okhttp.Request.Builder();
    }

    public Observable getConfigs()
    {
        return executeAsync(createRequest().url("http://api.lyft.com.s3.amazonaws.com/servers.json").get(), me/lyft/android/infrastructure/s3/ConfigsDTO);
    }

    protected IOException getUnsuccessfulResponseException(Response response)
    {
        LyftError lyfterror;
        try
        {
            lyfterror = (LyftError)deserializeJsonBody(response, me/lyft/android/infrastructure/lyft/LyftError);
        }
        catch (Throwable throwable)
        {
            throwable = new LyftError();
        }
        return new LyftApiException(lyfterror, response.code());
    }

    public Observable uploadFile(String s, File file)
    {
        return executeWithoutResultAsync(createRequest().url(s).put(RequestBody.create(null, file)));
    }
}
