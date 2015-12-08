// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.pkcs;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

// Referenced classes of package org.bouncycastle.asn1.pkcs:
//            PKCSObjectIdentifiers, EncryptionScheme, KeyDerivationFunc

public class PBES2Algorithms extends AlgorithmIdentifier
    implements PKCSObjectIdentifiers
{

    private EncryptionScheme bA;
    private DERObjectIdentifier by;
    private KeyDerivationFunc bz;

    public final DERObject c()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        ASN1EncodableVector asn1encodablevector1 = new ASN1EncodableVector();
        asn1encodablevector.a(by);
        asn1encodablevector1.a(bz);
        asn1encodablevector1.a(bA);
        asn1encodablevector.a(new DERSequence(asn1encodablevector1));
        return new DERSequence(asn1encodablevector);
    }

    public final DERObjectIdentifier e()
    {
        return by;
    }
}
