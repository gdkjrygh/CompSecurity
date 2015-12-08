// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.webapi;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.HttpEntity;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.message.BasicNameValuePair;

// Referenced classes of package com.netflix.mediaclient.webapi:
//            WebApiCommand, CommonRequestParameters, AuthorizationCredentials

public abstract class WebApiPostCommand extends WebApiCommand
{

    public WebApiPostCommand(String s, AuthorizationCredentials authorizationcredentials, CommonRequestParameters commonrequestparameters)
    {
        super(s, authorizationcredentials, commonrequestparameters);
    }

    protected void addIfNotNull(List list, String s, String s1)
    {
        if (s1 != null)
        {
            list.add(new BasicNameValuePair(s, s1));
        }
    }

    protected HttpEntity getEntity()
        throws UnsupportedEncodingException
    {
        return new UrlEncodedFormEntity(getParameters());
    }

    protected HttpUriRequest getHttpMethod()
        throws UnsupportedEncodingException
    {
        HttpPost httppost = new HttpPost(getUrl().toString());
        httppost.setEntity(getEntity());
        return httppost;
    }

    protected List getParameters()
    {
        ArrayList arraylist = new ArrayList(5);
        addIfNotNull(arraylist, "output", getOuput());
        addIfNotNull(arraylist, "v", getVersion());
        addIfNotNull(arraylist, "routing", getRouting());
        addIfNotNull(arraylist, "timestamp", String.valueOf(System.currentTimeMillis()));
        addIfNotNull(arraylist, "esn", esn);
        if (commonRequestParameters != null)
        {
            addIfNotNull(arraylist, "withCredentials", String.valueOf(commonRequestParameters.withCredentials));
            addIfNotNull(arraylist, "app_version", commonRequestParameters.appVersion);
            addIfNotNull(arraylist, "ui_version", commonRequestParameters.uiVersion);
            addIfNotNull(arraylist, "os_version", commonRequestParameters.osVersion);
            addIfNotNull(arraylist, "country", commonRequestParameters.country);
            addIfNotNull(arraylist, "geolocation_country", commonRequestParameters.geolocationCountry);
            addIfNotNull(arraylist, "device_cat", commonRequestParameters.deviceCategory);
            addIfNotNull(arraylist, "device_type", commonRequestParameters.deviceType);
            addIfNotNull(arraylist, "languages", commonRequestParameters.languages);
        }
        return arraylist;
    }
}
