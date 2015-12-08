// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.pkcs;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.BERSequence;
import org.bouncycastle.asn1.BERTaggedObject;
import org.bouncycastle.asn1.DEREncodable;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

public class EncryptedData extends ASN1Encodable
{

    ASN1Sequence a;

    public EncryptedData(ASN1Sequence asn1sequence)
    {
        if (((DERInteger)asn1sequence.a(0)).e().intValue() != 0)
        {
            throw new IllegalArgumentException("sequence not version 0");
        } else
        {
            a = (ASN1Sequence)asn1sequence.a(1);
            return;
        }
    }

    public EncryptedData(DERObjectIdentifier derobjectidentifier, AlgorithmIdentifier algorithmidentifier, DEREncodable derencodable)
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.a(derobjectidentifier);
        asn1encodablevector.a(algorithmidentifier.c());
        asn1encodablevector.a(new BERTaggedObject(false, 0, derencodable));
        a = new BERSequence(asn1encodablevector);
    }

    public final DERObject d()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.a(new DERInteger(0));
        asn1encodablevector.a(a);
        return new BERSequence(asn1encodablevector);
    }

    public final AlgorithmIdentifier e()
    {
        return AlgorithmIdentifier.b(a.a(1));
    }

    public final ASN1OctetString f()
    {
        if (a.f() == 3)
        {
            return ASN1OctetString.a((DERTaggedObject)a.a(2));
        } else
        {
            return null;
        }
    }
}
