// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.json.webtoken;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.GenericData;
import java.util.List;

// Referenced classes of package com.google.api.client.json.webtoken:
//            JsonWebSignature

public static class A extends A
{

    private String algorithm;
    private List critical;
    private String jwk;
    private String jwkUrl;
    private String keyId;
    private String x509Certificate;
    private String x509Thumbprint;
    private String x509Url;

    public volatile GenericJson clone()
    {
        return clone();
    }

    public clone clone()
    {
        return (clone)super.e();
    }

    public volatile e clone()
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

    public final String getAlgorithm()
    {
        return algorithm;
    }

    public final List getCritical()
    {
        return critical;
    }

    public final String getJwk()
    {
        return jwk;
    }

    public final String getJwkUrl()
    {
        return jwkUrl;
    }

    public final String getKeyId()
    {
        return keyId;
    }

    public final String getX509Certificate()
    {
        return x509Certificate;
    }

    public final String getX509Thumbprint()
    {
        return x509Thumbprint;
    }

    public final String getX509Url()
    {
        return x509Url;
    }

    public volatile GenericJson set(String s, Object obj)
    {
        return set(s, obj);
    }

    public set set(String s, Object obj)
    {
        return (set)super.set(s, obj);
    }

    public volatile set set(String s, Object obj)
    {
        return set(s, obj);
    }

    public volatile GenericData set(String s, Object obj)
    {
        return set(s, obj);
    }

    public set setAlgorithm(String s)
    {
        algorithm = s;
        return this;
    }

    public algorithm setCritical(List list)
    {
        critical = list;
        return this;
    }

    public critical setJwk(String s)
    {
        jwk = s;
        return this;
    }

    public jwk setJwkUrl(String s)
    {
        jwkUrl = s;
        return this;
    }

    public jwkUrl setKeyId(String s)
    {
        keyId = s;
        return this;
    }

    public keyId setType(String s)
    {
        super.ype(s);
        return this;
    }

    public volatile ype setType(String s)
    {
        return setType(s);
    }

    public setType setX509Certificate(String s)
    {
        x509Certificate = s;
        return this;
    }

    public x509Certificate setX509Thumbprint(String s)
    {
        x509Thumbprint = s;
        return this;
    }

    public x509Thumbprint setX509Url(String s)
    {
        x509Url = s;
        return this;
    }

    public A()
    {
    }
}
