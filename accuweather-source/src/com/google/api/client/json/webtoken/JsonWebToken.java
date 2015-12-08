// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.json.webtoken;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.GenericData;
import com.google.api.client.util.Objects;
import com.google.api.client.util.Preconditions;
import java.util.Collections;
import java.util.List;

public class JsonWebToken
{
    public static class Header extends GenericJson
    {

        private String contentType;
        private String type;

        public volatile GenericJson clone()
        {
            return clone();
        }

        public Header clone()
        {
            return (Header)super.clone();
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

        public final String getContentType()
        {
            return contentType;
        }

        public final String getType()
        {
            return type;
        }

        public volatile GenericJson set(String s, Object obj)
        {
            return set(s, obj);
        }

        public Header set(String s, Object obj)
        {
            return (Header)super.set(s, obj);
        }

        public volatile GenericData set(String s, Object obj)
        {
            return set(s, obj);
        }

        public Header setContentType(String s)
        {
            contentType = s;
            return this;
        }

        public Header setType(String s)
        {
            type = s;
            return this;
        }

        public Header()
        {
        }
    }

    public static class Payload extends GenericJson
    {

        private Object audience;
        private Long expirationTimeSeconds;
        private Long issuedAtTimeSeconds;
        private String issuer;
        private String jwtId;
        private Long notBeforeTimeSeconds;
        private String subject;
        private String type;

        public volatile GenericJson clone()
        {
            return clone();
        }

        public Payload clone()
        {
            return (Payload)super.clone();
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

        public final Object getAudience()
        {
            return audience;
        }

        public final List getAudienceAsList()
        {
            if (audience == null)
            {
                return Collections.emptyList();
            }
            if (audience instanceof String)
            {
                return Collections.singletonList((String)audience);
            } else
            {
                return (List)audience;
            }
        }

        public final Long getExpirationTimeSeconds()
        {
            return expirationTimeSeconds;
        }

        public final Long getIssuedAtTimeSeconds()
        {
            return issuedAtTimeSeconds;
        }

        public final String getIssuer()
        {
            return issuer;
        }

        public final String getJwtId()
        {
            return jwtId;
        }

        public final Long getNotBeforeTimeSeconds()
        {
            return notBeforeTimeSeconds;
        }

        public final String getSubject()
        {
            return subject;
        }

        public final String getType()
        {
            return type;
        }

        public volatile GenericJson set(String s, Object obj)
        {
            return set(s, obj);
        }

        public Payload set(String s, Object obj)
        {
            return (Payload)super.set(s, obj);
        }

        public volatile GenericData set(String s, Object obj)
        {
            return set(s, obj);
        }

        public Payload setAudience(Object obj)
        {
            audience = obj;
            return this;
        }

        public Payload setExpirationTimeSeconds(Long long1)
        {
            expirationTimeSeconds = long1;
            return this;
        }

        public Payload setIssuedAtTimeSeconds(Long long1)
        {
            issuedAtTimeSeconds = long1;
            return this;
        }

        public Payload setIssuer(String s)
        {
            issuer = s;
            return this;
        }

        public Payload setJwtId(String s)
        {
            jwtId = s;
            return this;
        }

        public Payload setNotBeforeTimeSeconds(Long long1)
        {
            notBeforeTimeSeconds = long1;
            return this;
        }

        public Payload setSubject(String s)
        {
            subject = s;
            return this;
        }

        public Payload setType(String s)
        {
            type = s;
            return this;
        }

        public Payload()
        {
        }
    }


    private final Header header;
    private final Payload payload;

    public JsonWebToken(Header header1, Payload payload1)
    {
        header = (Header)Preconditions.checkNotNull(header1);
        payload = (Payload)Preconditions.checkNotNull(payload1);
    }

    public Header getHeader()
    {
        return header;
    }

    public Payload getPayload()
    {
        return payload;
    }

    public String toString()
    {
        return Objects.toStringHelper(this).add("header", header).add("payload", payload).toString();
    }
}
