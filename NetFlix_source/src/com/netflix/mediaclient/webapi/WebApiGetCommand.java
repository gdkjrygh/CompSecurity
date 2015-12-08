// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.webapi;

import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;

// Referenced classes of package com.netflix.mediaclient.webapi:
//            WebApiCommand, CommonRequestParameters, AuthorizationCredentials

public abstract class WebApiGetCommand extends WebApiCommand
{

    public WebApiGetCommand(String s, AuthorizationCredentials authorizationcredentials, CommonRequestParameters commonrequestparameters)
    {
        super(s, authorizationcredentials, commonrequestparameters);
    }

    protected HttpUriRequest getHttpMethod()
    {
        return new HttpGet(getUrl().toString());
    }

    protected StringBuilder getUrl()
    {
        StringBuilder stringbuilder = super.getUrl();
        stringbuilder.append('?');
        stringbuilder.append("output").append('=').append(getOuput()).append('&');
        stringbuilder.append("routing").append('=').append(getRouting()).append('&');
        stringbuilder.append("timestamp").append('=').append(System.currentTimeMillis()).append('&');
        stringbuilder.append("v").append('=').append(getVersion());
        addIfNotNull(stringbuilder, "esn", esn);
        if (commonRequestParameters != null)
        {
            addIfNotNull(stringbuilder, "withCredentials", String.valueOf(commonRequestParameters.withCredentials));
            addIfNotNull(stringbuilder, "app_version", commonRequestParameters.appVersion);
            addIfNotNull(stringbuilder, "ui_version", commonRequestParameters.uiVersion);
            addIfNotNull(stringbuilder, "os_version", commonRequestParameters.osVersion);
            addIfNotNull(stringbuilder, "country", commonRequestParameters.country);
            addIfNotNull(stringbuilder, "geolocation_country", commonRequestParameters.geolocationCountry);
            addIfNotNull(stringbuilder, "device_cat", commonRequestParameters.deviceCategory);
            addIfNotNull(stringbuilder, "device_type", commonRequestParameters.deviceType);
            addIfNotNull(stringbuilder, "languages", commonRequestParameters.languages);
        }
        return stringbuilder;
    }
}
