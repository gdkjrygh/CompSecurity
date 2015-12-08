// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.pkcs;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

public class KeyDerivationFunc extends AlgorithmIdentifier
{

    public KeyDerivationFunc(ASN1ObjectIdentifier asn1objectidentifier, ASN1Encodable asn1encodable)
    {
        super(asn1objectidentifier, asn1encodable);
    }

    KeyDerivationFunc(ASN1Sequence asn1sequence)
    {
        super(asn1sequence);
    }
}
