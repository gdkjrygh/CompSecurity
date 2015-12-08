// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.iana;

import org.bouncycastle.asn1.ASN1ObjectIdentifier;

public interface IANAObjectIdentifiers
{

    public static final ASN1ObjectIdentifier hmacMD5 = new ASN1ObjectIdentifier((new StringBuilder()).append(isakmpOakley).append(".1").toString());
    public static final ASN1ObjectIdentifier hmacRIPEMD160 = new ASN1ObjectIdentifier((new StringBuilder()).append(isakmpOakley).append(".4").toString());
    public static final ASN1ObjectIdentifier hmacSHA1 = new ASN1ObjectIdentifier((new StringBuilder()).append(isakmpOakley).append(".2").toString());
    public static final ASN1ObjectIdentifier hmacTIGER = new ASN1ObjectIdentifier((new StringBuilder()).append(isakmpOakley).append(".3").toString());
    public static final ASN1ObjectIdentifier isakmpOakley = new ASN1ObjectIdentifier("1.3.6.1.5.5.8.1");

}
