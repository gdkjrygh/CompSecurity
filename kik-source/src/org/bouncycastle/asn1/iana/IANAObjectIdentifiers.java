// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.iana;

import org.bouncycastle.asn1.ASN1ObjectIdentifier;

public interface IANAObjectIdentifiers
{

    public static final ASN1ObjectIdentifier a = new ASN1ObjectIdentifier("1.3.6.1.5.5.8.1");
    public static final ASN1ObjectIdentifier b = new ASN1ObjectIdentifier((new StringBuilder()).append(a).append(".1").toString());
    public static final ASN1ObjectIdentifier c = new ASN1ObjectIdentifier((new StringBuilder()).append(a).append(".2").toString());
    public static final ASN1ObjectIdentifier d = new ASN1ObjectIdentifier((new StringBuilder()).append(a).append(".3").toString());
    public static final ASN1ObjectIdentifier e = new ASN1ObjectIdentifier((new StringBuilder()).append(a).append(".4").toString());

}
