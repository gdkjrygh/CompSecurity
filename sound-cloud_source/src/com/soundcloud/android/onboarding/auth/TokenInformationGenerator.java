// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.onboarding.auth;

import android.os.Bundle;
import com.soundcloud.android.api.ApiClient;
import com.soundcloud.android.api.ApiEndpoints;
import com.soundcloud.android.api.ApiRequest;
import com.soundcloud.android.api.ApiRequestException;
import com.soundcloud.android.api.ApiResponse;
import com.soundcloud.android.api.oauth.OAuth;
import com.soundcloud.android.api.oauth.Token;
import com.soundcloud.android.onboarding.exceptions.TokenRetrievalException;
import java.io.IOException;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class TokenInformationGenerator
{
    public static interface TokenKeys
    {

        public static final String EXTENSION_GRANT_TYPE_EXTRA = "extensionGrantType";
        public static final String PASSWORD_EXTRA = "password";
        public static final String USERNAME_EXTRA = "username";
    }


    private final ApiClient apiClient;
    private final OAuth oAuth;

    public TokenInformationGenerator(ApiClient apiclient, OAuth oauth)
    {
        apiClient = apiclient;
        oAuth = oauth;
    }

    private String extractGrantType(Bundle bundle)
    {
        return bundle.getString("extensionGrantType");
    }

    private String getPassword(Bundle bundle)
    {
        return bundle.getString("password");
    }

    private Map getScopeParams(String as[])
    {
        return oAuth.getTokenRequestParamsFromClientCredentials(as);
    }

    private Map getTokenParams(Bundle bundle)
    {
        if (isFromUserCredentials(bundle))
        {
            return oAuth.getTokenRequestParamsFromUserCredentials(getUsername(bundle), getPassword(bundle));
        }
        if (isFromExtensionGrant(bundle))
        {
            return oAuth.getTokenRequestParamsFromExtensionGrant(extractGrantType(bundle));
        } else
        {
            throw new IllegalArgumentException((new StringBuilder("invalid param ")).append(bundle).toString());
        }
    }

    private String getUsername(Bundle bundle)
    {
        return bundle.getString("username");
    }

    private boolean isFromExtensionGrant(Bundle bundle)
    {
        return bundle.containsKey("extensionGrantType");
    }

    private boolean isFromUserCredentials(Bundle bundle)
    {
        return bundle.containsKey("username") && bundle.containsKey("password");
    }

    private Token requestToken(Map map)
        throws ApiRequestException
    {
        map = ApiRequest.post(ApiEndpoints.OAUTH2_TOKEN.path()).forPublicApi().withFormMap(map).build();
        map = apiClient.fetchResponse(map);
        if (map.isNotSuccess())
        {
            throw map.getFailure();
        }
        map = new Token(new JSONObject(map.getResponseBody()));
        return map;
        map;
_L2:
        throw new TokenRetrievalException(map);
        map;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public Bundle getGrantBundle(String s, String s1)
    {
        Bundle bundle = new Bundle();
        bundle.putString("extensionGrantType", (new StringBuilder()).append(s).append(s1).toString());
        return bundle;
    }

    public Token getToken(Bundle bundle)
        throws ApiRequestException
    {
        return requestToken(getTokenParams(bundle));
    }

    public boolean isFromFacebook(Bundle bundle)
    {
        bundle = extractGrantType(bundle);
        return bundle != null && bundle.startsWith("urn:soundcloud:oauth2:grant-type:facebook&access_token=");
    }

    public transient Token verifyScopes(String as[])
        throws ApiRequestException
    {
        Token token = requestToken(getScopeParams(as));
        if (as != null)
        {
            int j = as.length;
            for (int i = 0; i < j; i++)
            {
                String s = as[i];
                if (!token.hasScope(s))
                {
                    throw new TokenRetrievalException(new IllegalArgumentException((new StringBuilder("Could not obtain requested scope '")).append(s).append("' (got: '").append(token.getScope()).append("')").toString()));
                }
            }

        }
        return token;
    }
}
