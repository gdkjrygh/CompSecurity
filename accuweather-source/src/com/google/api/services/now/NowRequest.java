// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.services.now;

import com.google.api.client.googleapis.services.AbstractGoogleClient;
import com.google.api.client.googleapis.services.AbstractGoogleClientRequest;
import com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient;
import com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest;
import com.google.api.client.http.HttpHeaders;
import com.google.api.client.util.GenericData;

// Referenced classes of package com.google.api.services.now:
//            Now

public abstract class NowRequest extends AbstractGoogleJsonClientRequest
{

    private String alt;
    private String fields;
    private String key;
    private String oauthToken;
    private Boolean prettyPrint;
    private String quotaUser;
    private String userIp;

    public NowRequest(Now now, String s, String s1, Object obj, Class class1)
    {
        super(now, s, s1, obj, class1);
    }

    public volatile AbstractGoogleClient getAbstractGoogleClient()
    {
        return getAbstractGoogleClient();
    }

    public volatile AbstractGoogleJsonClient getAbstractGoogleClient()
    {
        return getAbstractGoogleClient();
    }

    public final Now getAbstractGoogleClient()
    {
        return (Now)super.getAbstractGoogleClient();
    }

    public String getAlt()
    {
        return alt;
    }

    public String getFields()
    {
        return fields;
    }

    public String getKey()
    {
        return key;
    }

    public String getOauthToken()
    {
        return oauthToken;
    }

    public Boolean getPrettyPrint()
    {
        return prettyPrint;
    }

    public String getQuotaUser()
    {
        return quotaUser;
    }

    public String getUserIp()
    {
        return userIp;
    }

    public volatile AbstractGoogleClientRequest set(String s, Object obj)
    {
        return set(s, obj);
    }

    public volatile AbstractGoogleJsonClientRequest set(String s, Object obj)
    {
        return set(s, obj);
    }

    public volatile GenericData set(String s, Object obj)
    {
        return set(s, obj);
    }

    public NowRequest set(String s, Object obj)
    {
        return (NowRequest)super.set(s, obj);
    }

    public NowRequest setAlt(String s)
    {
        alt = s;
        return this;
    }

    public volatile AbstractGoogleClientRequest setDisableGZipContent(boolean flag)
    {
        return setDisableGZipContent(flag);
    }

    public volatile AbstractGoogleJsonClientRequest setDisableGZipContent(boolean flag)
    {
        return setDisableGZipContent(flag);
    }

    public NowRequest setDisableGZipContent(boolean flag)
    {
        return (NowRequest)super.setDisableGZipContent(flag);
    }

    public NowRequest setFields(String s)
    {
        fields = s;
        return this;
    }

    public NowRequest setKey(String s)
    {
        key = s;
        return this;
    }

    public NowRequest setOauthToken(String s)
    {
        oauthToken = s;
        return this;
    }

    public NowRequest setPrettyPrint(Boolean boolean1)
    {
        prettyPrint = boolean1;
        return this;
    }

    public NowRequest setQuotaUser(String s)
    {
        quotaUser = s;
        return this;
    }

    public volatile AbstractGoogleClientRequest setRequestHeaders(HttpHeaders httpheaders)
    {
        return setRequestHeaders(httpheaders);
    }

    public volatile AbstractGoogleJsonClientRequest setRequestHeaders(HttpHeaders httpheaders)
    {
        return setRequestHeaders(httpheaders);
    }

    public NowRequest setRequestHeaders(HttpHeaders httpheaders)
    {
        return (NowRequest)super.setRequestHeaders(httpheaders);
    }

    public NowRequest setUserIp(String s)
    {
        userIp = s;
        return this;
    }
}
