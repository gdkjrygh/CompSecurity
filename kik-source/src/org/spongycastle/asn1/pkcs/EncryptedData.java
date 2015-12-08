// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.pkcs;

import java.math.BigInteger;
import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1OctetString;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.ASN1TaggedObject;
import org.spongycastle.asn1.BERSequence;
import org.spongycastle.asn1.BERTaggedObject;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;

public class EncryptedData extends ASN1Object
{

    ASN1Sequence a;

    public EncryptedData(ASN1ObjectIdentifier asn1objectidentifier, AlgorithmIdentifier algorithmidentifier, ASN1Encodable asn1encodable)
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.a(asn1objectidentifier);
        asn1encodablevector.a(algorithmidentifier.a());
        asn1encodablevector.a(new BERTaggedObject(false, 0, asn1encodable));
        a = new BERSequence(asn1encodablevector);
    }

    private EncryptedData(ASN1Sequence asn1sequence)
    {
        if (((ASN1Integer)asn1sequence.a(0)).c().intValue() != 0)
        {
            throw new IllegalArgumentException("sequence not version 0");
        } else
        {
            a = ASN1Sequence.a(asn1sequence.a(1));
            return;
        }
    }

    public static EncryptedData a(Object obj)
    {
        if (obj instanceof EncryptedData)
        {
            return (EncryptedData)obj;
        }
        if (obj != null)
        {
            return new EncryptedData(ASN1Sequence.a(obj));
        } else
        {
            return null;
        }
    }

    public final ASN1Primitive a()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.a(new ASN1Integer(0));
        asn1encodablevector.a(a);
        return new BERSequence(asn1encodablevector);
    }

    public final AlgorithmIdentifier c()
    {
        return AlgorithmIdentifier.a(a.a(1));
    }

    public final ASN1OctetString d()
    {
        if (a.e() == 3)
        {
            return ASN1OctetString.a(ASN1TaggedObject.a(a.a(2)));
        } else
        {
            return null;
        }
    }
}
