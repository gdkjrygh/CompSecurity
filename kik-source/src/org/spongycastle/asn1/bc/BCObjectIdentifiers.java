// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.bc;

import org.spongycastle.asn1.ASN1ObjectIdentifier;

public interface BCObjectIdentifiers
{

    public static final ASN1ObjectIdentifier a = new ASN1ObjectIdentifier("1.3.6.1.4.1.22554");
    public static final ASN1ObjectIdentifier b = new ASN1ObjectIdentifier((new StringBuilder()).append(a.c()).append(".1").toString());
    public static final ASN1ObjectIdentifier c = new ASN1ObjectIdentifier((new StringBuilder()).append(b.c()).append(".1").toString());
    public static final ASN1ObjectIdentifier d = new ASN1ObjectIdentifier((new StringBuilder()).append(b.c()).append(".2.1").toString());
    public static final ASN1ObjectIdentifier e = new ASN1ObjectIdentifier((new StringBuilder()).append(b.c()).append(".2.2").toString());
    public static final ASN1ObjectIdentifier f = new ASN1ObjectIdentifier((new StringBuilder()).append(b.c()).append(".2.3").toString());
    public static final ASN1ObjectIdentifier g = new ASN1ObjectIdentifier((new StringBuilder()).append(b.c()).append(".2.4").toString());
    public static final ASN1ObjectIdentifier h = new ASN1ObjectIdentifier((new StringBuilder()).append(c.c()).append(".1").toString());
    public static final ASN1ObjectIdentifier i = new ASN1ObjectIdentifier((new StringBuilder()).append(c.c()).append(".2").toString());
    public static final ASN1ObjectIdentifier j = new ASN1ObjectIdentifier((new StringBuilder()).append(d.c()).append(".1").toString());
    public static final ASN1ObjectIdentifier k = new ASN1ObjectIdentifier((new StringBuilder()).append(d.c()).append(".2").toString());
    public static final ASN1ObjectIdentifier l = new ASN1ObjectIdentifier((new StringBuilder()).append(i.c()).append(".1.2").toString());
    public static final ASN1ObjectIdentifier m = new ASN1ObjectIdentifier((new StringBuilder()).append(i.c()).append(".1.22").toString());
    public static final ASN1ObjectIdentifier n = new ASN1ObjectIdentifier((new StringBuilder()).append(i.c()).append(".1.42").toString());
    public static final ASN1ObjectIdentifier o = new ASN1ObjectIdentifier((new StringBuilder()).append(k.c()).append(".1.2").toString());
    public static final ASN1ObjectIdentifier p = new ASN1ObjectIdentifier((new StringBuilder()).append(k.c()).append(".1.22").toString());
    public static final ASN1ObjectIdentifier q = new ASN1ObjectIdentifier((new StringBuilder()).append(k.c()).append(".1.42").toString());

}
