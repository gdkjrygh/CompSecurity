// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.googleapis.auth.oauth2;

import com.google.api.client.auth.oauth2.AuthorizationCodeRequestUrl;
import com.google.api.client.auth.oauth2.AuthorizationRequestUrl;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.util.GenericData;
import com.google.api.client.util.Preconditions;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.google.api.client.googleapis.auth.oauth2:
//            GoogleClientSecrets

public class GoogleAuthorizationCodeRequestUrl extends AuthorizationCodeRequestUrl
{

    private String accessType;
    private String approvalPrompt;

    public GoogleAuthorizationCodeRequestUrl(GoogleClientSecrets googleclientsecrets, String s, Collection collection)
    {
        this(googleclientsecrets.getDetails().getClientId(), s, collection);
    }

    public GoogleAuthorizationCodeRequestUrl(String s, String s1, String s2, Collection collection)
    {
        super(s, s1);
        setRedirectUri(s2);
        setScopes(collection);
    }

    public GoogleAuthorizationCodeRequestUrl(String s, String s1, Collection collection)
    {
        this("https://accounts.google.com/o/oauth2/auth", s, s1, collection);
    }

    public volatile AuthorizationCodeRequestUrl clone()
    {
        return clone();
    }

    public volatile AuthorizationRequestUrl clone()
    {
        return clone();
    }

    public GoogleAuthorizationCodeRequestUrl clone()
    {
        return (GoogleAuthorizationCodeRequestUrl)super.clone();
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

    public final String getAccessType()
    {
        return accessType;
    }

    public final String getApprovalPrompt()
    {
        return approvalPrompt;
    }

    public volatile AuthorizationCodeRequestUrl set(String s, Object obj)
    {
        return set(s, obj);
    }

    public volatile AuthorizationRequestUrl set(String s, Object obj)
    {
        return set(s, obj);
    }

    public GoogleAuthorizationCodeRequestUrl set(String s, Object obj)
    {
        return (GoogleAuthorizationCodeRequestUrl)super.set(s, obj);
    }

    public volatile GenericUrl set(String s, Object obj)
    {
        return set(s, obj);
    }

    public volatile GenericData set(String s, Object obj)
    {
        return set(s, obj);
    }

    public GoogleAuthorizationCodeRequestUrl setAccessType(String s)
    {
        accessType = s;
        return this;
    }

    public GoogleAuthorizationCodeRequestUrl setApprovalPrompt(String s)
    {
        approvalPrompt = s;
        return this;
    }

    public volatile AuthorizationCodeRequestUrl setClientId(String s)
    {
        return setClientId(s);
    }

    public volatile AuthorizationRequestUrl setClientId(String s)
    {
        return setClientId(s);
    }

    public GoogleAuthorizationCodeRequestUrl setClientId(String s)
    {
        return (GoogleAuthorizationCodeRequestUrl)super.setClientId(s);
    }

    public volatile AuthorizationCodeRequestUrl setRedirectUri(String s)
    {
        return setRedirectUri(s);
    }

    public volatile AuthorizationRequestUrl setRedirectUri(String s)
    {
        return setRedirectUri(s);
    }

    public GoogleAuthorizationCodeRequestUrl setRedirectUri(String s)
    {
        Preconditions.checkNotNull(s);
        return (GoogleAuthorizationCodeRequestUrl)super.setRedirectUri(s);
    }

    public volatile AuthorizationCodeRequestUrl setResponseTypes(Collection collection)
    {
        return setResponseTypes(collection);
    }

    public volatile AuthorizationRequestUrl setResponseTypes(Collection collection)
    {
        return setResponseTypes(collection);
    }

    public GoogleAuthorizationCodeRequestUrl setResponseTypes(Collection collection)
    {
        return (GoogleAuthorizationCodeRequestUrl)super.setResponseTypes(collection);
    }

    public volatile AuthorizationCodeRequestUrl setScopes(Collection collection)
    {
        return setScopes(collection);
    }

    public volatile AuthorizationRequestUrl setScopes(Collection collection)
    {
        return setScopes(collection);
    }

    public GoogleAuthorizationCodeRequestUrl setScopes(Collection collection)
    {
        Preconditions.checkArgument(collection.iterator().hasNext());
        return (GoogleAuthorizationCodeRequestUrl)super.setScopes(collection);
    }

    public volatile AuthorizationCodeRequestUrl setState(String s)
    {
        return setState(s);
    }

    public volatile AuthorizationRequestUrl setState(String s)
    {
        return setState(s);
    }

    public GoogleAuthorizationCodeRequestUrl setState(String s)
    {
        return (GoogleAuthorizationCodeRequestUrl)super.setState(s);
    }
}
