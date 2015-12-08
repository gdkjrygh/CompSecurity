// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.eac;

import org.bouncycastle.asn1.DERObjectIdentifier;

public interface EACObjectIdentifiers
{

    public static final DERObjectIdentifier a = new DERObjectIdentifier("0.4.0.127.0.7");
    public static final DERObjectIdentifier b = new DERObjectIdentifier((new StringBuilder()).append(a).append(".2.2.1").toString());
    public static final DERObjectIdentifier c = new DERObjectIdentifier((new StringBuilder()).append(b).append(".1").toString());
    public static final DERObjectIdentifier d = new DERObjectIdentifier((new StringBuilder()).append(b).append(".2").toString());
    public static final DERObjectIdentifier e = new DERObjectIdentifier((new StringBuilder()).append(a).append(".2.2.3").toString());
    public static final DERObjectIdentifier f = new DERObjectIdentifier((new StringBuilder()).append(e).append(".1").toString());
    public static final DERObjectIdentifier g = new DERObjectIdentifier((new StringBuilder()).append(f).append(".1").toString());
    public static final DERObjectIdentifier h = new DERObjectIdentifier((new StringBuilder()).append(e).append(".2").toString());
    public static final DERObjectIdentifier i = new DERObjectIdentifier((new StringBuilder()).append(h).append(".1").toString());
    public static final DERObjectIdentifier j = new DERObjectIdentifier((new StringBuilder()).append(a).append(".2.2.2").toString());
    public static final DERObjectIdentifier k = new DERObjectIdentifier((new StringBuilder()).append(j).append(".1").toString());
    public static final DERObjectIdentifier l = new DERObjectIdentifier((new StringBuilder()).append(k).append(".1").toString());
    public static final DERObjectIdentifier m = new DERObjectIdentifier((new StringBuilder()).append(k).append(".2").toString());
    public static final DERObjectIdentifier n = new DERObjectIdentifier((new StringBuilder()).append(k).append(".3").toString());
    public static final DERObjectIdentifier o = new DERObjectIdentifier((new StringBuilder()).append(k).append(".4").toString());
    public static final DERObjectIdentifier p = new DERObjectIdentifier((new StringBuilder()).append(j).append(".2").toString());
    public static final DERObjectIdentifier q = new DERObjectIdentifier((new StringBuilder()).append(p).append(".1").toString());
    public static final DERObjectIdentifier r = new DERObjectIdentifier((new StringBuilder()).append(p).append(".2").toString());
    public static final DERObjectIdentifier s = new DERObjectIdentifier((new StringBuilder()).append(p).append(".3").toString());
    public static final DERObjectIdentifier t = new DERObjectIdentifier((new StringBuilder()).append(p).append(".4").toString());
    public static final DERObjectIdentifier u = new DERObjectIdentifier((new StringBuilder()).append(p).append(".5").toString());
    public static final DERObjectIdentifier v = new DERObjectIdentifier((new StringBuilder()).append(a).append(".3.1.2.1").toString());

}
