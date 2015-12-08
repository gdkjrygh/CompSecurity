// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.config;

import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.jcajce.provider.util.AsymmetricKeyInfoConverter;

public interface ConfigurableProvider
{

    public abstract void a(String s, String s1);

    public abstract void a(ASN1ObjectIdentifier asn1objectidentifier, AsymmetricKeyInfoConverter asymmetrickeyinfoconverter);

    public abstract boolean b(String s, String s1);
}
