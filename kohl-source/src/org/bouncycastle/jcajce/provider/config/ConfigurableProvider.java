// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.config;

import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter;

public interface ConfigurableProvider
{

    public static final String DH_DEFAULT_PARAMS = "DhDefaultParams";
    public static final String EC_IMPLICITLY_CA = "ecImplicitlyCa";
    public static final String THREAD_LOCAL_DH_DEFAULT_PARAMS = "threadLocalDhDefaultParams";
    public static final String THREAD_LOCAL_EC_IMPLICITLY_CA = "threadLocalEcImplicitlyCa";

    public abstract void addAlgorithm(String s, String s1);

    public abstract void addKeyInfoConverter(ASN1ObjectIdentifier asn1objectidentifier, AsymmetricKeyInfoConverter asymmetrickeyinfoconverter);

    public abstract AsymmetricKeyInfoConverter getConverter(ASN1ObjectIdentifier asn1objectidentifier);

    public abstract boolean hasAlgorithm(String s, String s1);

    public abstract void setParameter(String s, Object obj);
}
