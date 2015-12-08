// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.tsp;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

public class MessageImprint extends ASN1Object
{

    AlgorithmIdentifier hashAlgorithm;
    byte hashedMessage[];

    private MessageImprint(ASN1Sequence asn1sequence)
    {
        hashAlgorithm = AlgorithmIdentifier.getInstance(asn1sequence.getObjectAt(0));
        hashedMessage = ASN1OctetString.getInstance(asn1sequence.getObjectAt(1)).getOctets();
    }

    public MessageImprint(AlgorithmIdentifier algorithmidentifier, byte abyte0[])
    {
        hashAlgorithm = algorithmidentifier;
        hashedMessage = abyte0;
    }

    public static MessageImprint getInstance(Object obj)
    {
        if (obj instanceof MessageImprint)
        {
            return (MessageImprint)obj;
        }
        if (obj != null)
        {
            return new MessageImprint(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public AlgorithmIdentifier getHashAlgorithm()
    {
        return hashAlgorithm;
    }

    public byte[] getHashedMessage()
    {
        return hashedMessage;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(hashAlgorithm);
        asn1encodablevector.add(new DEROctetString(hashedMessage));
        return new DERSequence(asn1encodablevector);
    }
}
