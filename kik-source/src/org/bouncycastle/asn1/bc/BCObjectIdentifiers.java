// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.bc;

import org.bouncycastle.asn1.DERObjectIdentifier;

public interface BCObjectIdentifiers
{

    public static final DERObjectIdentifier a = new DERObjectIdentifier("1.3.6.1.4.1.22554");
    public static final DERObjectIdentifier b = new DERObjectIdentifier((new StringBuilder()).append(a.e()).append(".1").toString());
    public static final DERObjectIdentifier c = new DERObjectIdentifier((new StringBuilder()).append(b.e()).append(".1").toString());
    public static final DERObjectIdentifier d = new DERObjectIdentifier((new StringBuilder()).append(b.e()).append(".2.1").toString());
    public static final DERObjectIdentifier e = new DERObjectIdentifier((new StringBuilder()).append(b.e()).append(".2.2").toString());
    public static final DERObjectIdentifier f = new DERObjectIdentifier((new StringBuilder()).append(b.e()).append(".2.3").toString());
    public static final DERObjectIdentifier g = new DERObjectIdentifier((new StringBuilder()).append(b.e()).append(".2.4").toString());
    public static final DERObjectIdentifier h = new DERObjectIdentifier((new StringBuilder()).append(c.e()).append(".1").toString());
    public static final DERObjectIdentifier i = new DERObjectIdentifier((new StringBuilder()).append(c.e()).append(".2").toString());
    public static final DERObjectIdentifier j = new DERObjectIdentifier((new StringBuilder()).append(d.e()).append(".1").toString());
    public static final DERObjectIdentifier k = new DERObjectIdentifier((new StringBuilder()).append(d.e()).append(".2").toString());
    public static final DERObjectIdentifier l = new DERObjectIdentifier((new StringBuilder()).append(i.e()).append(".1.2").toString());
    public static final DERObjectIdentifier m = new DERObjectIdentifier((new StringBuilder()).append(i.e()).append(".1.22").toString());
    public static final DERObjectIdentifier n = new DERObjectIdentifier((new StringBuilder()).append(i.e()).append(".1.42").toString());
    public static final DERObjectIdentifier o = new DERObjectIdentifier((new StringBuilder()).append(k.e()).append(".1.2").toString());
    public static final DERObjectIdentifier p = new DERObjectIdentifier((new StringBuilder()).append(k.e()).append(".1.22").toString());
    public static final DERObjectIdentifier q = new DERObjectIdentifier((new StringBuilder()).append(k.e()).append(".1.42").toString());

}
