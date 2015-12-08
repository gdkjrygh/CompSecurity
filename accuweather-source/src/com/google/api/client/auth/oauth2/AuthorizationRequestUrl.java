// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.auth.oauth2;

import com.google.api.client.http.GenericUrl;
import com.google.api.client.util.GenericData;
import com.google.api.client.util.Joiner;
import com.google.api.client.util.Preconditions;
import java.util.Collection;
import java.util.Iterator;

public class AuthorizationRequestUrl extends GenericUrl
{

    private String clientId;
    private String redirectUri;
    private String responseTypes;
    private String scopes;
    private String state;

    public AuthorizationRequestUrl(String s, String s1, Collection collection)
    {
        super(s);
        boolean flag;
        if (getFragment() == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        setClientId(s1);
        setResponseTypes(collection);
    }

    public AuthorizationRequestUrl clone()
    {
        return (AuthorizationRequestUrl)super.clone();
    }

    public volatile GenericUrl clone()
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

    public final String getClientId()
    {
        return clientId;
    }

    public final String getRedirectUri()
    {
        return redirectUri;
    }

    public final String getResponseTypes()
    {
        return responseTypes;
    }

    public final String getScopes()
    {
        return scopes;
    }

    public final String getState()
    {
        return state;
    }

    public AuthorizationRequestUrl set(String s, Object obj)
    {
        return (AuthorizationRequestUrl)super.set(s, obj);
    }

    public volatile GenericUrl set(String s, Object obj)
    {
        return set(s, obj);
    }

    public volatile GenericData set(String s, Object obj)
    {
        return set(s, obj);
    }

    public AuthorizationRequestUrl setClientId(String s)
    {
        clientId = (String)Preconditions.checkNotNull(s);
        return this;
    }

    public AuthorizationRequestUrl setRedirectUri(String s)
    {
        redirectUri = s;
        return this;
    }

    public AuthorizationRequestUrl setResponseTypes(Collection collection)
    {
        responseTypes = Joiner.on(' ').join(collection);
        return this;
    }

    public AuthorizationRequestUrl setScopes(Collection collection)
    {
        if (collection == null || !collection.iterator().hasNext())
        {
            collection = null;
        } else
        {
            collection = Joiner.on(' ').join(collection);
        }
        scopes = collection;
        return this;
    }

    public AuthorizationRequestUrl setState(String s)
    {
        state = s;
        return this;
    }
}
