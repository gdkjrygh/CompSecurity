// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.smime;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;

public class SMIMECapabilities extends ASN1Encodable
{

    public static final DERObjectIdentifier a;
    public static final DERObjectIdentifier b;
    public static final DERObjectIdentifier c;
    public static final DERObjectIdentifier d = new DERObjectIdentifier("1.3.14.3.2.7");
    public static final DERObjectIdentifier e;
    public static final DERObjectIdentifier f;
    private ASN1Sequence g;

    public final DERObject d()
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
