// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.smime;

import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.pkcs.PKCSObjectIdentifiers;

public class SMIMECapabilities extends ASN1Object
{

    public static final ASN1ObjectIdentifier a;
    public static final ASN1ObjectIdentifier b;
    public static final ASN1ObjectIdentifier c;
    public static final ASN1ObjectIdentifier d = new ASN1ObjectIdentifier("1.3.14.3.2.7");
    public static final ASN1ObjectIdentifier e;
    public static final ASN1ObjectIdentifier f;
    private ASN1Sequence g;

    public final ASN1Primitive a()
    {
        return g;
    }

    static 
    {
        a = PKCSObjectIdentifiers.ao;
        b = PKCSObjectIdentifiers.ap;
        c = PKCSObjectIdentifiers.aq;
        e = PKCSObjectIdentifiers.B;
        f = PKCSObjectIdentifiers.C;
    }
}
