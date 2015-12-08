// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.googleapis.auth.oauth2;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.GenericData;
import java.util.List;

// Referenced classes of package com.google.api.client.googleapis.auth.oauth2:
//            GoogleIdToken

public static class  extends com.google.api.client.auth.openidconnect.oad
{

    private String email;
    private Object emailVerified;
    private String hostedDomain;

    public volatile com.google.api.client.auth.openidconnect.oad clone()
    {
        return clone();
    }

    public clone clone()
    {
        return (clone)super.oad();
    }

    public volatile GenericJson clone()
    {
        return clone();
    }

    public volatile com.google.api.client.json.webtoken..Payload clone()
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

    public String getEmail()
    {
        return email;
    }

    public Boolean getEmailVerified()
    {
        if (emailVerified == null)
        {
            return null;
        }
        if (emailVerified instanceof Boolean)
        {
            return (Boolean)emailVerified;
        } else
        {
            return Boolean.valueOf((String)emailVerified);
        }
    }

    public String getHostedDomain()
    {
        return hostedDomain;
    }

    public String getIssuee()
    {
        return getAuthorizedParty();
    }

    public String getUserId()
    {
        return getSubject();
    }

    public volatile com.google.api.client.auth.openidconnect.oad set(String s, Object obj)
    {
        return set(s, obj);
    }

    public set set(String s, Object obj)
    {
        return (set)super.oad(s, obj);
    }

    public volatile GenericJson set(String s, Object obj)
    {
        return set(s, obj);
    }

    public volatile com.google.api.client.json.webtoken..Payload set(String s, Object obj)
    {
        return set(s, obj);
    }

    public volatile GenericData set(String s, Object obj)
    {
        return set(s, obj);
    }

    public volatile com.google.api.client.auth.openidconnect.oad setAccessTokenHash(String s)
    {
        return setAccessTokenHash(s);
    }

    public setAccessTokenHash setAccessTokenHash(String s)
    {
        return (setAccessTokenHash)super.essTokenHash(s);
    }

    public volatile com.google.api.client.auth.openidconnect.oad setAudience(Object obj)
    {
        return setAudience(obj);
    }

    public setAudience setAudience(Object obj)
    {
        return (setAudience)super.ience(obj);
    }

    public volatile com.google.api.client.json.webtoken..Payload setAudience(Object obj)
    {
        return setAudience(obj);
    }

    public volatile com.google.api.client.auth.openidconnect.oad setAuthorizationTimeSeconds(Long long1)
    {
        return setAuthorizationTimeSeconds(long1);
    }

    public setAuthorizationTimeSeconds setAuthorizationTimeSeconds(Long long1)
    {
        return (setAuthorizationTimeSeconds)super.horizationTimeSeconds(long1);
    }

    public volatile com.google.api.client.auth.openidconnect.oad setAuthorizedParty(String s)
    {
        return setAuthorizedParty(s);
    }

    public setAuthorizedParty setAuthorizedParty(String s)
    {
        return (setAuthorizedParty)super.horizedParty(s);
    }

    public volatile com.google.api.client.auth.openidconnect.oad setClassReference(String s)
    {
        return setClassReference(s);
    }

    public setClassReference setClassReference(String s)
    {
        return (setClassReference)super.ssReference(s);
    }

    public ference setEmail(String s)
    {
        email = s;
        return this;
    }

    public email setEmailVerified(Boolean boolean1)
    {
        emailVerified = boolean1;
        return this;
    }

    public volatile com.google.api.client.auth.openidconnect.oad setExpirationTimeSeconds(Long long1)
    {
        return setExpirationTimeSeconds(long1);
    }

    public setExpirationTimeSeconds setExpirationTimeSeconds(Long long1)
    {
        return (setExpirationTimeSeconds)super.irationTimeSeconds(long1);
    }

    public volatile com.google.api.client.json.webtoken..Payload setExpirationTimeSeconds(Long long1)
    {
        return setExpirationTimeSeconds(long1);
    }

    public setExpirationTimeSeconds setHostedDomain(String s)
    {
        hostedDomain = s;
        return this;
    }

    public volatile com.google.api.client.auth.openidconnect.oad setIssuedAtTimeSeconds(Long long1)
    {
        return setIssuedAtTimeSeconds(long1);
    }

    public setIssuedAtTimeSeconds setIssuedAtTimeSeconds(Long long1)
    {
        return (setIssuedAtTimeSeconds)super.uedAtTimeSeconds(long1);
    }

    public volatile com.google.api.client.json.webtoken..Payload setIssuedAtTimeSeconds(Long long1)
    {
        return setIssuedAtTimeSeconds(long1);
    }

    public setIssuedAtTimeSeconds setIssuee(String s)
    {
        return setAuthorizedParty(s);
    }

    public volatile com.google.api.client.auth.openidconnect.oad setIssuer(String s)
    {
        return setIssuer(s);
    }

    public setIssuer setIssuer(String s)
    {
        return (setIssuer)super.uer(s);
    }

    public volatile com.google.api.client.json.webtoken..Payload setIssuer(String s)
    {
        return setIssuer(s);
    }

    public volatile com.google.api.client.auth.openidconnect.oad setJwtId(String s)
    {
        return setJwtId(s);
    }

    public setJwtId setJwtId(String s)
    {
        return (setJwtId)super.Id(s);
    }

    public volatile com.google.api.client.json.webtoken..Payload setJwtId(String s)
    {
        return setJwtId(s);
    }

    public volatile com.google.api.client.auth.openidconnect.oad setMethodsReferences(List list)
    {
        return setMethodsReferences(list);
    }

    public setMethodsReferences setMethodsReferences(List list)
    {
        return (setMethodsReferences)super.hodsReferences(list);
    }

    public volatile com.google.api.client.auth.openidconnect.oad setNonce(String s)
    {
        return setNonce(s);
    }

    public setNonce setNonce(String s)
    {
        return (setNonce)super.ce(s);
    }

    public volatile com.google.api.client.auth.openidconnect.oad setNotBeforeTimeSeconds(Long long1)
    {
        return setNotBeforeTimeSeconds(long1);
    }

    public setNotBeforeTimeSeconds setNotBeforeTimeSeconds(Long long1)
    {
        return (setNotBeforeTimeSeconds)super.BeforeTimeSeconds(long1);
    }

    public volatile com.google.api.client.json.webtoken..Payload setNotBeforeTimeSeconds(Long long1)
    {
        return setNotBeforeTimeSeconds(long1);
    }

    public volatile com.google.api.client.auth.openidconnect.oad setSubject(String s)
    {
        return setSubject(s);
    }

    public setSubject setSubject(String s)
    {
        return (setSubject)super.ject(s);
    }

    public volatile com.google.api.client.json.webtoken..Payload setSubject(String s)
    {
        return setSubject(s);
    }

    public volatile com.google.api.client.auth.openidconnect.oad setType(String s)
    {
        return setType(s);
    }

    public setType setType(String s)
    {
        return (setType)super.e(s);
    }

    public volatile com.google.api.client.json.webtoken..Payload setType(String s)
    {
        return setType(s);
    }

    public setType setUserId(String s)
    {
        return setSubject(s);
    }

    public ()
    {
    }
}
