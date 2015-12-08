// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.googlenow;

import com.google.gson.Gson;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Response;
import java.io.IOException;
import me.lyft.android.common.Unit;
import me.lyft.android.infrastructure.api.BaseApi;
import me.lyft.android.infrastructure.api.UrlBuilder;
import rx.Observable;

public class GoogleNowAuthenticationApi extends BaseApi
{

    private static final String ROOT = "https://accounts.google.com/";

    public GoogleNowAuthenticationApi(OkHttpClient okhttpclient, Gson gson)
    {
        super(okhttpclient, gson);
    }

    protected com.squareup.okhttp.Request.Builder createRequest()
    {
        return new com.squareup.okhttp.Request.Builder();
    }

    protected IOException getUnsuccessfulResponseException(Response response)
    {
        return super.getUnsuccessfulResponseException(response);
    }

    public Observable revokeToken(String s)
    {
        s = (new UrlBuilder("https://accounts.google.com/o/oauth2/revoke")).addQueryParam("token", s).build();
        return executeAsync(createRequest().url(s).get(), me/lyft/android/common/Unit);
    }
}
