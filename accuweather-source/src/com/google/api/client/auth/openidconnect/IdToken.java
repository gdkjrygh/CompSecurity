// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.auth.openidconnect;

import com.google.api.client.json.GenericJson;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.webtoken.JsonWebSignature;
import com.google.api.client.util.GenericData;
import java.io.IOException;
import java.util.Collection;
import java.util.List;

public class IdToken extends JsonWebSignature
{
    public static class Payload extends com.google.api.client.json.webtoken.JsonWebToken.Payload
    {

        private String accessTokenHash;
        private Long authorizationTimeSeconds;
        private String authorizedParty;
        private String classReference;
        private List methodsReferences;
        private String nonce;

        public Payload clone()
        {
            return (Payload)super.clone();
        }

        public volatile GenericJson clone()
        {
            return clone();
        }

        public volatile com.google.api.client.json.webtoken.JsonWebToken.Payload clone()
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

        public final String getAccessTokenHash()
        {
            return accessTokenHash;
        }

        public final Long getAuthorizationTimeSeconds()
        {
            return authorizationTimeSeconds;
        }

        public final String getAuthorizedParty()
        {
            return authorizedParty;
        }

        public final String getClassReference()
        {
            return classReference;
        }

        public final List getMethodsReferences()
        {
            return methodsReferences;
        }

        public final String getNonce()
        {
            return nonce;
        }

        public Payload set(String s, Object obj)
        {
            return (Payload)super.set(s, obj);
        }

        public volatile GenericJson set(String s, Object obj)
        {
            return set(s, obj);
        }

        public volatile com.google.api.client.json.webtoken.JsonWebToken.Payload set(String s, Object obj)
        {
            return set(s, obj);
        }

        public volatile GenericData set(String s, Object obj)
        {
            return set(s, obj);
        }

        public Payload setAccessTokenHash(String s)
        {
            accessTokenHash = s;
            return this;
        }

        public Payload setAudience(Object obj)
        {
            return (Payload)super.setAudience(obj);
        }

        public volatile com.google.api.client.json.webtoken.JsonWebToken.Payload setAudience(Object obj)
        {
            return setAudience(obj);
        }

        public Payload setAuthorizationTimeSeconds(Long long1)
        {
            authorizationTimeSeconds = long1;
            return this;
        }

        public Payload setAuthorizedParty(String s)
        {
            authorizedParty = s;
            return this;
        }

        public Payload setClassReference(String s)
        {
            classReference = s;
            return this;
        }

        public Payload setExpirationTimeSeconds(Long long1)
        {
            return (Payload)super.setExpirationTimeSeconds(long1);
        }

        public volatile com.google.api.client.json.webtoken.JsonWebToken.Payload setExpirationTimeSeconds(Long long1)
        {
            return setExpirationTimeSeconds(long1);
        }

        public Payload setIssuedAtTimeSeconds(Long long1)
        {
            return (Payload)super.setIssuedAtTimeSeconds(long1);
        }

        public volatile com.google.api.client.json.webtoken.JsonWebToken.Payload setIssuedAtTimeSeconds(Long long1)
        {
            return setIssuedAtTimeSeconds(long1);
        }

        public Payload setIssuer(String s)
        {
            return (Payload)super.setIssuer(s);
        }

        public volatile com.google.api.client.json.webtoken.JsonWebToken.Payload setIssuer(String s)
        {
            return setIssuer(s);
        }

        public Payload setJwtId(String s)
        {
            return (Payload)super.setJwtId(s);
        }

        public volatile com.google.api.client.json.webtoken.JsonWebToken.Payload setJwtId(String s)
        {
            return setJwtId(s);
        }

        public Payload setMethodsReferences(List list)
        {
            methodsReferences = list;
            return this;
        }

        public Payload setNonce(String s)
        {
            nonce = s;
            return this;
        }

        public Payload setNotBeforeTimeSeconds(Long long1)
        {
            return (Payload)super.setNotBeforeTimeSeconds(long1);
        }

        public volatile com.google.api.client.json.webtoken.JsonWebToken.Payload setNotBeforeTimeSeconds(Long long1)
        {
            return setNotBeforeTimeSeconds(long1);
        }

        public Payload setSubject(String s)
        {
            return (Payload)super.setSubject(s);
        }

        public volatile com.google.api.client.json.webtoken.JsonWebToken.Payload setSubject(String s)
        {
            return setSubject(s);
        }

        public Payload setType(String s)
        {
            return (Payload)super.setType(s);
        }

        public volatile com.google.api.client.json.webtoken.JsonWebToken.Payload setType(String s)
        {
            return setType(s);
        }

        public Payload()
        {
        }
    }


    public IdToken(com.google.api.client.json.webtoken.JsonWebSignature.Header header, Payload payload, byte abyte0[], byte abyte1[])
    {
        super(header, payload, abyte0, abyte1);
    }

    public static IdToken parse(JsonFactory jsonfactory, String s)
        throws IOException
    {
        jsonfactory = JsonWebSignature.parser(jsonfactory).setPayloadClass(com/google/api/client/auth/openidconnect/IdToken$Payload).parse(s);
        return new IdToken(jsonfactory.getHeader(), (Payload)jsonfactory.getPayload(), jsonfactory.getSignatureBytes(), jsonfactory.getSignedContentBytes());
    }

    public Payload getPayload()
    {
        return (Payload)super.getPayload();
    }

    public volatile com.google.api.client.json.webtoken.JsonWebToken.Payload getPayload()
    {
        return getPayload();
    }

    public final boolean verifyAudience(Collection collection)
    {
        return collection.containsAll(getPayload().getAudienceAsList());
    }

    public final boolean verifyExpirationTime(long l, long l1)
    {
        return l <= (getPayload().getExpirationTimeSeconds().longValue() + l1) * 1000L;
    }

    public final boolean verifyIssuedAtTime(long l, long l1)
    {
        return l >= (getPayload().getIssuedAtTimeSeconds().longValue() - l1) * 1000L;
    }

    public final boolean verifyIssuer(String s)
    {
        return s.equals(getPayload().getIssuer());
    }

    public final boolean verifyTime(long l, long l1)
    {
        return verifyExpirationTime(l, l1) && verifyIssuedAtTime(l, l1);
    }
}
