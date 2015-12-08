// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.crmf;

import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;

public interface CRMFObjectIdentifiers
{

    public static final ASN1ObjectIdentifier a = asn1objectidentifier;
    public static final ASN1ObjectIdentifier b = asn1objectidentifier;
    public static final ASN1ObjectIdentifier c = asn1objectidentifier;
    public static final ASN1ObjectIdentifier d = asn1objectidentifier.b("1");
    public static final ASN1ObjectIdentifier e = c.b("2");
    public static final ASN1ObjectIdentifier f = c.b("3");
    public static final ASN1ObjectIdentifier g = c.b("4");
    public static final ASN1ObjectIdentifier h = new ASN1ObjectIdentifier((new StringBuilder()).append(PKCSObjectIdentifiers.ar).append(".21").toString());

    
    {
        ASN1ObjectIdentifier asn1objectidentifier = new ASN1ObjectIdentifier("1.3.6.1.5.5.7");
        asn1objectidentifier = asn1objectidentifier.b("5");
        asn1objectidentifier = asn1objectidentifier.b("1");
    }
}
