// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.x509.sigi;

import org.spongycastle.asn1.ASN1ObjectIdentifier;

public interface SigIObjectIdentifiers
{

    public static final ASN1ObjectIdentifier a = new ASN1ObjectIdentifier("1.3.36.8");
    public static final ASN1ObjectIdentifier b = new ASN1ObjectIdentifier((new StringBuilder()).append(a).append(".2").toString());
    public static final ASN1ObjectIdentifier c = new ASN1ObjectIdentifier((new StringBuilder()).append(a).append(".1").toString());
    public static final ASN1ObjectIdentifier d = new ASN1ObjectIdentifier((new StringBuilder()).append(a).append(".4").toString());
    public static final ASN1ObjectIdentifier e = new ASN1ObjectIdentifier((new StringBuilder()).append(b).append(".1").toString());
    public static final ASN1ObjectIdentifier f = new ASN1ObjectIdentifier((new StringBuilder()).append(d).append(".1").toString());
    public static final ASN1ObjectIdentifier g = new ASN1ObjectIdentifier((new StringBuilder()).append(c).append(".1").toString());

}
