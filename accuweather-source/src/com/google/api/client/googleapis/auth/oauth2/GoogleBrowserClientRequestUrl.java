// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.googleapis.auth.oauth2;

import com.google.api.client.auth.oauth2.AuthorizationRequestUrl;
import com.google.api.client.auth.oauth2.BrowserClientRequestUrl;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.util.GenericData;
import com.google.api.client.util.Preconditions;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.google.api.client.googleapis.auth.oauth2:
//            GoogleClientSecrets

public class GoogleBrowserClientRequestUrl extends BrowserClientRequestUrl
{

    private String approvalPrompt;

    public GoogleBrowserClientRequestUrl(GoogleClientSecrets googleclientsecrets, String s, Collection collection)
    {
        this(googleclientsecrets.getDetails().getClientId(), s, collection);
    }

    public GoogleBrowserClientRequestUrl(String s, String s1, Collection collection)
    {
        super("https://accounts.google.com/o/oauth2/auth", s);
        setRedirectUri(s1);
        setScopes(collection);
    }

    public volatile AuthorizationRequestUrl clone()
    {
        return clone();
    }

    public volatile BrowserClientRequestUrl clone()
    {
        return clone();
    }

    public GoogleBrowserClientRequestUrl clone()
    {
        return (GoogleBrowserClientRequestUrl)super.clone();
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

    public final String getApprovalPrompt()
    {
        return approvalPrompt;
    }

    public volatile AuthorizationRequestUrl set(String s, Object obj)
    {
        return set(s, obj);
    }

    public volatile BrowserClientRequestUrl set(String s, Object obj)
    {
        return set(s, obj);
    }

    public GoogleBrowserClientRequestUrl set(String s, Object obj)
    {
        return (GoogleBrowserClientRequestUrl)super.set(s, obj);
    }

    public volatile GenericUrl set(String s, Object obj)
    {
        return set(s, obj);
    }

    public volatile GenericData set(String s, Object obj)
    {
        return set(s, obj);
    }

    public GoogleBrowserClientRequestUrl setApprovalPrompt(String s)
    {
        approvalPrompt = s;
        return this;
    }

    public volatile AuthorizationRequestUrl setClientId(String s)
    {
        return setClientId(s);
    }

    public volatile BrowserClientRequestUrl setClientId(String s)
    {
        return setClientId(s);
    }

    public GoogleBrowserClientRequestUrl setClientId(String s)
    {
        return (GoogleBrowserClientRequestUrl)super.setClientId(s);
    }

    public volatile AuthorizationRequestUrl setRedirectUri(String s)
    {
        return setRedirectUri(s);
    }

    public volatile BrowserClientRequestUrl setRedirectUri(String s)
    {
        return setRedirectUri(s);
    }

    public GoogleBrowserClientRequestUrl setRedirectUri(String s)
    {
        return (GoogleBrowserClientRequestUrl)super.setRedirectUri(s);
    }

    public volatile AuthorizationRequestUrl setResponseTypes(Collection collection)
    {
        return setResponseTypes(collection);
    }

    public volatile BrowserClientRequestUrl setResponseTypes(Collection collection)
    {
        return setResponseTypes(collection);
    }

    public GoogleBrowserClientRequestUrl setResponseTypes(Collection collection)
    {
        return (GoogleBrowserClientRequestUrl)super.setResponseTypes(collection);
    }

    public volatile AuthorizationRequestUrl setScopes(Collection collection)
    {
        return setScopes(collection);
    }

    public volatile BrowserClientRequestUrl setScopes(Collection collection)
    {
        return setScopes(collection);
    }

    public GoogleBrowserClientRequestUrl setScopes(Collection collection)
    {
        Preconditions.checkArgument(collection.iterator().hasNext());
        return (GoogleBrowserClientRequestUrl)super.setScopes(collection);
    }

    public volatile AuthorizationRequestUrl setState(String s)
    {
        return setState(s);
    }

    public volatile BrowserClientRequestUrl setState(String s)
    {
        return setState(s);
    }

    public GoogleBrowserClientRequestUrl setState(String s)
    {
        return (GoogleBrowserClientRequestUrl)super.setState(s);
    }
}
