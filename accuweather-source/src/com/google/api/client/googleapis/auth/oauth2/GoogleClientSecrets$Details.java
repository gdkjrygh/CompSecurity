// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.googleapis.auth.oauth2;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.GenericData;
import java.util.List;

// Referenced classes of package com.google.api.client.googleapis.auth.oauth2:
//            GoogleClientSecrets

public static final class  extends GenericJson
{

    private String authUri;
    private String clientId;
    private String clientSecret;
    private List redirectUris;
    private String tokenUri;

    public  clone()
    {
        return ()super.clone();
    }

    public volatile GenericJson clone()
    {
        return clone();
    }

    public volatile GenericData clone()
    {
        return clone();
    }

    public volatile Object clone()
        throws CloneNotSupportedException
    {
        return clone();
    }

    public String getAuthUri()
    {
        return authUri;
    }

    public String getClientId()
    {
        return clientId;
    }

    public String getClientSecret()
    {
        return clientSecret;
    }

    public List getRedirectUris()
    {
        return redirectUris;
    }

    public String getTokenUri()
    {
        return tokenUri;
    }

    public tokenUri set(String s, Object obj)
    {
        return (tokenUri)super.set(s, obj);
    }

    public volatile GenericJson set(String s, Object obj)
    {
        return set(s, obj);
    }

    public volatile GenericData set(String s, Object obj)
    {
        return set(s, obj);
    }

    public set setAuthUri(String s)
    {
        authUri = s;
        return this;
    }

    public authUri setClientId(String s)
    {
        clientId = s;
        return this;
    }

    public clientId setClientSecret(String s)
    {
        clientSecret = s;
        return this;
    }

    public clientSecret setRedirectUris(List list)
    {
        redirectUris = list;
        return this;
    }

    public redirectUris setTokenUri(String s)
    {
        tokenUri = s;
        return this;
    }

    public ()
    {
    }
}
