// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api;

import android.content.res.Resources;
import android.net.Uri;
import com.soundcloud.android.api.oauth.OAuth;
import com.soundcloud.java.collections.MultiMap;
import com.soundcloud.java.strings.Joiner;
import com.soundcloud.java.strings.Strings;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.soundcloud.android.api:
//            ApiEndpoints, ApiRequest

public class ApiUrlBuilder
{

    private final String mobileApiBaseUrl;
    private final OAuth oAuth;
    private final String publicApiBaseUrl;
    private android.net.Uri.Builder uriBuilder;

    public ApiUrlBuilder(Resources resources, OAuth oauth)
    {
        oAuth = oauth;
        mobileApiBaseUrl = resources.getString(0x7f0702d0);
        publicApiBaseUrl = resources.getString(0x7f070309);
    }

    private ApiUrlBuilder withOAuthClientIdParam()
    {
        return withQueryParam("client_id", oAuth.getClientId());
    }

    public String build()
    {
        return uriBuilder.toString();
    }

    public android.net.Uri.Builder builder()
    {
        return uriBuilder;
    }

    public transient ApiUrlBuilder from(ApiEndpoints apiendpoints, Object aobj[])
    {
        uriBuilder = Uri.parse((new StringBuilder()).append(mobileApiBaseUrl).append(apiendpoints.unencodedPath(aobj)).toString()).buildUpon();
        return withOAuthClientIdParam();
    }

    public ApiUrlBuilder from(ApiRequest apirequest)
    {
        if (apirequest.getUri().isAbsolute())
        {
            uriBuilder = apirequest.getUri().buildUpon();
        } else
        {
            String s;
            if (apirequest.isPrivate())
            {
                s = mobileApiBaseUrl;
            } else
            {
                s = publicApiBaseUrl;
            }
            uriBuilder = Uri.parse((new StringBuilder()).append(s).append(apirequest.getUri()).toString()).buildUpon();
        }
        return withOAuthClientIdParam();
    }

    public ApiUrlBuilder withQueryParam(ApiRequest.Param param, Object obj)
    {
        uriBuilder.appendQueryParameter(param.toString(), obj.toString());
        return this;
    }

    public ApiUrlBuilder withQueryParam(String s, Object obj)
    {
        uriBuilder.appendQueryParameter(s, obj.toString());
        return this;
    }

    public ApiUrlBuilder withQueryParams(MultiMap multimap)
    {
        String s;
        for (Iterator iterator = multimap.keySet().iterator(); iterator.hasNext(); withQueryParam(s, Strings.joinOn(',').join(multimap.get(s))))
        {
            s = (String)iterator.next();
        }

        return this;
    }
}
