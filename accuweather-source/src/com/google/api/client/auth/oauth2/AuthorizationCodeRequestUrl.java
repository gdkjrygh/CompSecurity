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

public class AuthorizationCodeRequestUrl extends AuthorizationRequestUrl
{

    public AuthorizationCodeRequestUrl(String s, String s1)
    {
        super(s, s1, Collections.singleton("code"));
    }

    public AuthorizationCodeRequestUrl clone()
    {
        return (AuthorizationCodeRequestUrl)super.clone();
    }

    public volatile AuthorizationRequestUrl clone()
    {
        return clone();
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

    public AuthorizationCodeRequestUrl set(String s, Object obj)
    {
        return (AuthorizationCodeRequestUrl)super.set(s, obj);
    }

    public volatile AuthorizationRequestUrl set(String s, Object obj)
    {
        return set(s, obj);
    }

    public volatile GenericUrl set(String s, Object obj)
    {
        return set(s, obj);
    }

    public volatile GenericData set(String s, Object obj)
    {
        return set(s, obj);
    }

    public AuthorizationCodeRequestUrl setClientId(String s)
    {
        return (AuthorizationCodeRequestUrl)super.setClientId(s);
    }

    public volatile AuthorizationRequestUrl setClientId(String s)
    {
        return setClientId(s);
    }

    public AuthorizationCodeRequestUrl setRedirectUri(String s)
    {
        return (AuthorizationCodeRequestUrl)super.setRedirectUri(s);
    }

    public volatile AuthorizationRequestUrl setRedirectUri(String s)
    {
        return setRedirectUri(s);
    }

    public AuthorizationCodeRequestUrl setResponseTypes(Collection collection)
    {
        return (AuthorizationCodeRequestUrl)super.setResponseTypes(collection);
    }

    public volatile AuthorizationRequestUrl setResponseTypes(Collection collection)
    {
        return setResponseTypes(collection);
    }

    public AuthorizationCodeRequestUrl setScopes(Collection collection)
    {
        return (AuthorizationCodeRequestUrl)super.setScopes(collection);
    }

    public volatile AuthorizationRequestUrl setScopes(Collection collection)
    {
        return setScopes(collection);
    }

    public AuthorizationCodeRequestUrl setState(String s)
    {
        return (AuthorizationCodeRequestUrl)super.setState(s);
    }

    public volatile AuthorizationRequestUrl setState(String s)
    {
        return setState(s);
    }
}
