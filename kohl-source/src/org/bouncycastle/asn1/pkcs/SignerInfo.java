// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.pkcs;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

// Referenced classes of package org.bouncycastle.asn1.pkcs:
//            IssuerAndSerialNumber

public class SignerInfo extends ASN1Object
{

    private ASN1Set authenticatedAttributes;
    private AlgorithmIdentifier digAlgorithm;
    private AlgorithmIdentifier digEncryptionAlgorithm;
    private ASN1OctetString encryptedDigest;
    private IssuerAndSerialNumber issuerAndSerialNumber;
    private ASN1Set unauthenticatedAttributes;
    private ASN1Integer version;

    public SignerInfo(ASN1Integer asn1integer, IssuerAndSerialNumber issuerandserialnumber, AlgorithmIdentifier algorithmidentifier, ASN1Set asn1set, AlgorithmIdentifier algorithmidentifier1, ASN1OctetString asn1octetstring, ASN1Set asn1set1)
    {
        version = asn1integer;
        issuerAndSerialNumber = issuerandserialnumber;
        digAlgorithm = algorithmidentifier;
        authenticatedAttributes = asn1set;
        digEncryptionAlgorithm = algorithmidentifier1;
        encryptedDigest = asn1octetstring;
        unauthenticatedAttributes = asn1set1;
    }

    public SignerInfo(ASN1Sequence asn1sequence)
    {
        asn1sequence = asn1sequence.getObjects();
        version = (ASN1Integer)asn1sequence.nextElement();
        issuerAndSerialNumber = IssuerAndSerialNumber.getInstance(asn1sequence.nextElement());
        digAlgorithm = AlgorithmIdentifier.getInstance(asn1sequence.nextElement());
        Object obj = asn1sequence.nextElement();
        if (obj instanceof ASN1TaggedObject)
        {
            authenticatedAttributes = ASN1Set.getInstance((ASN1TaggedObject)obj, false);
            digEncryptionAlgorithm = AlgorithmIdentifier.getInstance(asn1sequence.nextElement());
        } else
        {
            authenticatedAttributes = null;
            digEncryptionAlgorithm = AlgorithmIdentifier.getInstance(obj);
        }
        encryptedDigest = DEROctetString.getInstance(asn1sequence.nextElement());
        if (asn1sequence.hasMoreElements())
        {
            unauthenticatedAttributes = ASN1Set.getInstance((ASN1TaggedObject)asn1sequence.nextElement(), false);
            return;
        } else
        {
            unauthenticatedAttributes = null;
            return;
        }
    }

    public static SignerInfo getInstance(Object obj)
    {
        if (obj instanceof SignerInfo)
        {
            return (SignerInfo)obj;
        }
        if (obj instanceof ASN1Sequence)
        {
            return new SignerInfo((ASN1Sequence)obj);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("unknown object in factory: ").append(obj.getClass().getName()).toString());
        }
    }

    public ASN1Set getAuthenticatedAttributes()
    {
        return authenticatedAttributes;
    }

    public AlgorithmIdentifier getDigestAlgorithm()
    {
        return digAlgorithm;
    }

    public AlgorithmIdentifier getDigestEncryptionAlgorithm()
    {
        return digEncryptionAlgorithm;
    }

    public ASN1OctetString getEncryptedDigest()
    {
        return encryptedDigest;
    }

    public IssuerAndSerialNumber getIssuerAndSerialNumber()
    {
        return issuerAndSerialNumber;
    }

    public ASN1Set getUnauthenticatedAttributes()
    {
        return unauthenticatedAttributes;
    }

    public ASN1Integer getVersion()
    {
        return version;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(version);
        asn1encodablevector.add(issuerAndSerialNumber);
        asn1encodablevector.add(digAlgorithm);
        if (authenticatedAttributes != null)
        {
            asn1encodablevector.add(new DERTaggedObject(false, 0, authenticatedAttributes));
        }
        asn1encodablevector.add(digEncryptionAlgorithm);
        asn1encodablevector.add(encryptedDigest);
        if (unauthenticatedAttributes != null)
        {
            asn1encodablevector.add(new DERTaggedObject(false, 1, unauthenticatedAttributes));
        }
        return new DERSequence(asn1encodablevector);
    }
}
