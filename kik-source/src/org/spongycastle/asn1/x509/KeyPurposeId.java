// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.x509;

import org.spongycastle.asn1.ASN1ObjectIdentifier;

// Referenced classes of package org.spongycastle.asn1.x509:
//            X509Extensions

public class KeyPurposeId extends ASN1ObjectIdentifier
{

    public static final KeyPurposeId b;
    public static final KeyPurposeId c = new KeyPurposeId("1.3.6.1.5.5.7.3.1");
    public static final KeyPurposeId d = new KeyPurposeId("1.3.6.1.5.5.7.3.2");
    public static final KeyPurposeId e = new KeyPurposeId("1.3.6.1.5.5.7.3.3");
    public static final KeyPurposeId f = new KeyPurposeId("1.3.6.1.5.5.7.3.4");
    public static final KeyPurposeId g = new KeyPurposeId("1.3.6.1.5.5.7.3.5");
    public static final KeyPurposeId h = new KeyPurposeId("1.3.6.1.5.5.7.3.6");
    public static final KeyPurposeId i = new KeyPurposeId("1.3.6.1.5.5.7.3.7");
    public static final KeyPurposeId j = new KeyPurposeId("1.3.6.1.5.5.7.3.8");
    public static final KeyPurposeId k = new KeyPurposeId("1.3.6.1.5.5.7.3.9");
    public static final KeyPurposeId l = new KeyPurposeId("1.3.6.1.5.5.7.3.10");
    public static final KeyPurposeId m = new KeyPurposeId("1.3.6.1.5.5.7.3.11");
    public static final KeyPurposeId n = new KeyPurposeId("1.3.6.1.5.5.7.3.12");
    public static final KeyPurposeId o = new KeyPurposeId("1.3.6.1.5.5.7.3.13");
    public static final KeyPurposeId p = new KeyPurposeId("1.3.6.1.5.5.7.3.14");
    public static final KeyPurposeId q = new KeyPurposeId("1.3.6.1.5.5.7.3.15");
    public static final KeyPurposeId r = new KeyPurposeId("1.3.6.1.5.5.7.3.16");
    public static final KeyPurposeId s = new KeyPurposeId("1.3.6.1.5.5.7.3.17");
    public static final KeyPurposeId t = new KeyPurposeId("1.3.6.1.5.5.7.3.18");
    public static final KeyPurposeId u = new KeyPurposeId("1.3.6.1.5.5.7.3.19");
    public static final KeyPurposeId v = new KeyPurposeId("1.3.6.1.4.1.311.20.2.2");

    private KeyPurposeId(String s1)
    {
        super(s1);
    }

    static 
    {
        b = new KeyPurposeId((new StringBuilder()).append(X509Extensions.u.c()).append(".0").toString());
    }
}
