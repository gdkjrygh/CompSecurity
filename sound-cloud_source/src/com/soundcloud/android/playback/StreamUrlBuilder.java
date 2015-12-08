// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback;

import com.soundcloud.android.accounts.AccountOperations;
import com.soundcloud.android.api.ApiEndpoints;
import com.soundcloud.android.api.ApiUrlBuilder;
import com.soundcloud.android.api.oauth.Token;
import com.soundcloud.android.model.Urn;

public class StreamUrlBuilder
{

    private static final String TAG = com/soundcloud/android/playback/StreamUrlBuilder.getSimpleName();
    private final AccountOperations accountOperations;
    private final ApiUrlBuilder urlBuilder;

    StreamUrlBuilder(AccountOperations accountoperations, ApiUrlBuilder apiurlbuilder)
    {
        accountOperations = accountoperations;
        urlBuilder = apiurlbuilder;
    }

    private ApiUrlBuilder addTokenWhenValid(ApiUrlBuilder apiurlbuilder)
    {
        Token token = accountOperations.getSoundCloudToken();
        if (token.valid())
        {
            apiurlbuilder.withQueryParam(com.soundcloud.android.api.ApiRequest.Param.OAUTH_TOKEN, token.getAccessToken());
        }
        return apiurlbuilder;
    }

    public String buildHttpStreamUrl(Urn urn)
    {
        return addTokenWhenValid(urlBuilder.from(ApiEndpoints.HTTP_STREAM, new Object[] {
            urn
        })).build();
    }

    public String buildHttpsStreamUrl(Urn urn)
    {
        return addTokenWhenValid(urlBuilder.from(ApiEndpoints.HTTPS_STREAM, new Object[] {
            urn
        })).build();
    }

}
