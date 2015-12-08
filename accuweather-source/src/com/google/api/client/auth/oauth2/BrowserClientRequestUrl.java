// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.auth.oauth2;

import com.google.api.client.http.GenericUrl;
import com.google.api.client.util.GenericData;
import java.util.Collection;
import java.util.Collections;

// Referenced classes of package com.google.api.client.auth.oauth2:
//            AuthorizationRequestUrl

public class BrowserClientRequestUrl extends AuthorizationRequestUrl
{

    public BrowserClientRequestUrl(String s, String s1)
    {
        super(s, s1, Collections.singleton("token"));
    }

    public volatile AuthorizationRequestUrl clone()
    {
        return clone();
    }

    public BrowserClientRequestUrl clone()
    {
        return (BrowserClientRequestUrl)super.clone();
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

    public volatile AuthorizationRequestUrl set(String s, Object obj)
    {
        return set(s, obj);
    }

    public BrowserClientRequestUrl set(String s, Object obj)
    {
        return (BrowserClientRequestUrl)super.set(s, obj);
    }

    public volatile GenericUrl set(String s, Object obj)
    {
        return set(s, obj);
    }

    public volatile GenericData set(String s, Object obj)
    {
        return set(s, obj);
    }

    public volatile AuthorizationRequestUrl setClientId(String s)
    {
        return setClientId(s);
    }

    public BrowserClientRequestUrl setClientId(String s)
    {
        return (BrowserClientRequestUrl)super.setClientId(s);
    }

    public volatile AuthorizationRequestUrl setRedirectUri(String s)
    {
        return setRedirectUri(s);
    }

    public BrowserClientRequestUrl setRedirectUri(String s)
    {
        return (BrowserClientRequestUrl)super.setRedirectUri(s);
    }

    public volatile AuthorizationRequestUrl setResponseTypes(Collection collection)
    {
        return setResponseTypes(collection);
    }

    public BrowserClientRequestUrl setResponseTypes(Collection collection)
    {
        return (BrowserClientRequestUrl)super.setResponseTypes(collection);
    }

    public volatile AuthorizationRequestUrl setScopes(Collection collection)
    {
        return setScopes(collection);
    }

    public BrowserClientRequestUrl setScopes(Collection collection)
    {
        return (BrowserClientRequestUrl)super.setScopes(collection);
    }

    public volatile AuthorizationRequestUrl setState(String s)
    {
        return setState(s);
    }

    public BrowserClientRequestUrl setState(String s)
    {
        return (BrowserClientRequestUrl)super.setState(s);
    }
}
