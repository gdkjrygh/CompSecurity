// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.json.webtoken;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.GenericData;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.api.client.json.webtoken:
//            JsonWebToken

public static class  extends GenericJson
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

    public clone clone()
    {
        return (clone)super.clone();
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

    public set set(String s, Object obj)
    {
        return (set)super.set(s, obj);
    }

    public volatile GenericData set(String s, Object obj)
    {
        return set(s, obj);
    }

    public set setAudience(Object obj)
    {
        audience = obj;
        return this;
    }

    public audience setExpirationTimeSeconds(Long long1)
    {
        expirationTimeSeconds = long1;
        return this;
    }

    public expirationTimeSeconds setIssuedAtTimeSeconds(Long long1)
    {
        issuedAtTimeSeconds = long1;
        return this;
    }

    public issuedAtTimeSeconds setIssuer(String s)
    {
        issuer = s;
        return this;
    }

    public issuer setJwtId(String s)
    {
        jwtId = s;
        return this;
    }

    public jwtId setNotBeforeTimeSeconds(Long long1)
    {
        notBeforeTimeSeconds = long1;
        return this;
    }

    public notBeforeTimeSeconds setSubject(String s)
    {
        subject = s;
        return this;
    }

    public subject setType(String s)
    {
        type = s;
        return this;
    }

    public ()
    {
    }
}
