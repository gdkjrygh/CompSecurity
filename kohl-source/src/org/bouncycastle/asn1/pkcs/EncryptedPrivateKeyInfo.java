// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.pkcs;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

// Referenced classes of package org.bouncycastle.asn1.pkcs:
//            EncryptedData

public class EncryptedPrivateKeyInfo extends ASN1Object
{

    private AlgorithmIdentifier algId;
    private ASN1OctetString data;

    private EncryptedPrivateKeyInfo(ASN1Sequence asn1sequence)
    {
        asn1sequence = asn1sequence.getObjects();
        algId = AlgorithmIdentifier.getInstance(asn1sequence.nextElement());
        data = ASN1OctetString.getInstance(asn1sequence.nextElement());
    }

    public EncryptedPrivateKeyInfo(AlgorithmIdentifier algorithmidentifier, byte abyte0[])
    {
        algId = algorithmidentifier;
        data = new DEROctetString(abyte0);
    }

    public static EncryptedPrivateKeyInfo getInstance(Object obj)
    {
        if (obj instanceof EncryptedData)
        {
            return (EncryptedPrivateKeyInfo)obj;
        }
        if (obj != null)
        {
            return new EncryptedPrivateKeyInfo(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public byte[] getEncryptedData()
    {
        return data.getOctets();
    }

    public AlgorithmIdentifier getEncryptionAlgorithm()
    {
        return algId;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(algId);
        asn1encodablevector.add(data);
        return new DERSequence(asn1encodablevector);
    }
}
