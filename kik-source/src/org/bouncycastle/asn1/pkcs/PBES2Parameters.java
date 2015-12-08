// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.pkcs;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEREncodable;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERSequence;

// Referenced classes of package org.bouncycastle.asn1.pkcs:
//            PKCSObjectIdentifiers, KeyDerivationFunc, PBKDF2Params, EncryptionScheme

public class PBES2Parameters extends ASN1Encodable
    implements PKCSObjectIdentifiers
{

    private KeyDerivationFunc by;
    private EncryptionScheme bz;

    public PBES2Parameters(ASN1Sequence asn1sequence)
    {
        asn1sequence = asn1sequence.e();
        ASN1Sequence asn1sequence1 = ASN1Sequence.a(((DEREncodable)asn1sequence.nextElement()).c());
        if (asn1sequence1.a(0).equals(z))
        {
            by = new KeyDerivationFunc(z, PBKDF2Params.a(asn1sequence1.a(1)));
        } else
        {
            by = new KeyDerivationFunc(asn1sequence1);
        }
        bz = (EncryptionScheme)EncryptionScheme.a(asn1sequence.nextElement());
    }

    public final DERObject d()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.a(by);
        asn1encodablevector.a(bz);
        return new DERSequence(asn1encodablevector);
    }
}
