// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.googleapis.auth.oauth2;

import com.google.api.client.auth.openidconnect.IdToken;
import com.google.api.client.json.GenericJson;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.webtoken.JsonWebSignature;
import com.google.api.client.util.GenericData;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.List;

// Referenced classes of package com.google.api.client.googleapis.auth.oauth2:
//            GoogleIdTokenVerifier

public class GoogleIdToken extends IdToken
{
    public static class Payload extends com.google.api.client.auth.openidconnect.IdToken.Payload
    {

        private String email;
        private Object emailVerified;
        private String hostedDomain;

        public volatile com.google.api.client.auth.openidconnect.IdToken.Payload clone()
        {
            return clone();
        }

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

        public volatile com.google.api.client.auth.openidconnect.IdToken.Payload set(String s, Object obj)
        {
            return set(s, obj);
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

        public volatile com.google.api.client.auth.openidconnect.IdToken.Payload setAccessTokenHash(String s)
        {
            return setAccessTokenHash(s);
        }

        public Payload setAccessTokenHash(String s)
        {
            return (Payload)super.setAccessTokenHash(s);
        }

        public volatile com.google.api.client.auth.openidconnect.IdToken.Payload setAudience(Object obj)
        {
            return setAudience(obj);
        }

        public Payload setAudience(Object obj)
        {
            return (Payload)super.setAudience(obj);
        }

        public volatile com.google.api.client.json.webtoken.JsonWebToken.Payload setAudience(Object obj)
        {
            return setAudience(obj);
        }

        public volatile com.google.api.client.auth.openidconnect.IdToken.Payload setAuthorizationTimeSeconds(Long long1)
        {
            return setAuthorizationTimeSeconds(long1);
        }

        public Payload setAuthorizationTimeSeconds(Long long1)
        {
            return (Payload)super.setAuthorizationTimeSeconds(long1);
        }

        public volatile com.google.api.client.auth.openidconnect.IdToken.Payload setAuthorizedParty(String s)
        {
            return setAuthorizedParty(s);
        }

        public Payload setAuthorizedParty(String s)
        {
            return (Payload)super.setAuthorizedParty(s);
        }

        public volatile com.google.api.client.auth.openidconnect.IdToken.Payload setClassReference(String s)
        {
            return setClassReference(s);
        }

        public Payload setClassReference(String s)
        {
            return (Payload)super.setClassReference(s);
        }

        public Payload setEmail(String s)
        {
            email = s;
            return this;
        }

        public Payload setEmailVerified(Boolean boolean1)
        {
            emailVerified = boolean1;
            return this;
        }

        public volatile com.google.api.client.auth.openidconnect.IdToken.Payload setExpirationTimeSeconds(Long long1)
        {
            return setExpirationTimeSeconds(long1);
        }

        public Payload setExpirationTimeSeconds(Long long1)
        {
            return (Payload)super.setExpirationTimeSeconds(long1);
        }

        public volatile com.google.api.client.json.webtoken.JsonWebToken.Payload setExpirationTimeSeconds(Long long1)
        {
            return setExpirationTimeSeconds(long1);
        }

        public Payload setHostedDomain(String s)
        {
            hostedDomain = s;
            return this;
        }

        public volatile com.google.api.client.auth.openidconnect.IdToken.Payload setIssuedAtTimeSeconds(Long long1)
        {
            return setIssuedAtTimeSeconds(long1);
        }

        public Payload setIssuedAtTimeSeconds(Long long1)
        {
            return (Payload)super.setIssuedAtTimeSeconds(long1);
        }

        public volatile com.google.api.client.json.webtoken.JsonWebToken.Payload setIssuedAtTimeSeconds(Long long1)
        {
            return setIssuedAtTimeSeconds(long1);
        }

        public Payload setIssuee(String s)
        {
            return setAuthorizedParty(s);
        }

        public volatile com.google.api.client.auth.openidconnect.IdToken.Payload setIssuer(String s)
        {
            return setIssuer(s);
        }

        public Payload setIssuer(String s)
        {
            return (Payload)super.setIssuer(s);
        }

        public volatile com.google.api.client.json.webtoken.JsonWebToken.Payload setIssuer(String s)
        {
            return setIssuer(s);
        }

        public volatile com.google.api.client.auth.openidconnect.IdToken.Payload setJwtId(String s)
        {
            return setJwtId(s);
        }

        public Payload setJwtId(String s)
        {
            return (Payload)super.setJwtId(s);
        }

        public volatile com.google.api.client.json.webtoken.JsonWebToken.Payload setJwtId(String s)
        {
            return setJwtId(s);
        }

        public volatile com.google.api.client.auth.openidconnect.IdToken.Payload setMethodsReferences(List list)
        {
            return setMethodsReferences(list);
        }

        public Payload setMethodsReferences(List list)
        {
            return (Payload)super.setMethodsReferences(list);
        }

        public volatile com.google.api.client.auth.openidconnect.IdToken.Payload setNonce(String s)
        {
            return setNonce(s);
        }

        public Payload setNonce(String s)
        {
            return (Payload)super.setNonce(s);
        }

        public volatile com.google.api.client.auth.openidconnect.IdToken.Payload setNotBeforeTimeSeconds(Long long1)
        {
            return setNotBeforeTimeSeconds(long1);
        }

        public Payload setNotBeforeTimeSeconds(Long long1)
        {
            return (Payload)super.setNotBeforeTimeSeconds(long1);
        }

        public volatile com.google.api.client.json.webtoken.JsonWebToken.Payload setNotBeforeTimeSeconds(Long long1)
        {
            return setNotBeforeTimeSeconds(long1);
        }

        public volatile com.google.api.client.auth.openidconnect.IdToken.Payload setSubject(String s)
        {
            return setSubject(s);
        }

        public Payload setSubject(String s)
        {
            return (Payload)super.setSubject(s);
        }

        public volatile com.google.api.client.json.webtoken.JsonWebToken.Payload setSubject(String s)
        {
            return setSubject(s);
        }

        public volatile com.google.api.client.auth.openidconnect.IdToken.Payload setType(String s)
        {
            return setType(s);
        }

        public Payload setType(String s)
        {
            return (Payload)super.setType(s);
        }

        public volatile com.google.api.client.json.webtoken.JsonWebToken.Payload setType(String s)
        {
            return setType(s);
        }

        public Payload setUserId(String s)
        {
            return setSubject(s);
        }

        public Payload()
        {
        }
    }


    public GoogleIdToken(com.google.api.client.json.webtoken.JsonWebSignature.Header header, Payload payload, byte abyte0[], byte abyte1[])
    {
        super(header, payload, abyte0, abyte1);
    }

    public static GoogleIdToken parse(JsonFactory jsonfactory, String s)
        throws IOException
    {
        jsonfactory = JsonWebSignature.parser(jsonfactory).setPayloadClass(com/google/api/client/googleapis/auth/oauth2/GoogleIdToken$Payload).parse(s);
        return new GoogleIdToken(jsonfactory.getHeader(), (Payload)jsonfactory.getPayload(), jsonfactory.getSignatureBytes(), jsonfactory.getSignedContentBytes());
    }

    public volatile com.google.api.client.auth.openidconnect.IdToken.Payload getPayload()
    {
        return getPayload();
    }

    public Payload getPayload()
    {
        return (Payload)super.getPayload();
    }

    public volatile com.google.api.client.json.webtoken.JsonWebToken.Payload getPayload()
    {
        return getPayload();
    }

    public boolean verify(GoogleIdTokenVerifier googleidtokenverifier)
        throws GeneralSecurityException, IOException
    {
        return googleidtokenverifier.verify(this);
    }
}
