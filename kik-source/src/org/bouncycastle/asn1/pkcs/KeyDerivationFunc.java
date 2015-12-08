// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.pkcs;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

public class KeyDerivationFunc extends AlgorithmIdentifier
{

    KeyDerivationFunc(ASN1Sequence asn1sequence)
    {
        super(asn1sequence);
    }

    public KeyDerivationFunc(DERObjectIdentifier derobjectidentifier, ASN1Encodable asn1encodable)
    {
        super(derobjectidentifier, asn1encodable);
    }
}
