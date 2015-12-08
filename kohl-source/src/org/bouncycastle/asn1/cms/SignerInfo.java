// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.cms;

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

// Referenced classes of package org.bouncycastle.asn1.cms:
//            SignerIdentifier

public class SignerInfo extends ASN1Object
{

    private ASN1Set authenticatedAttributes;
    private AlgorithmIdentifier digAlgorithm;
    private AlgorithmIdentifier digEncryptionAlgorithm;
    private ASN1OctetString encryptedDigest;
    private SignerIdentifier sid;
    private ASN1Set unauthenticatedAttributes;
    private ASN1Integer version;

    public SignerInfo(ASN1Sequence asn1sequence)
    {
        asn1sequence = asn1sequence.getObjects();
        version = (ASN1Integer)asn1sequence.nextElement();
        sid = SignerIdentifier.getInstance(asn1sequence.nextElement());
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

    public SignerInfo(SignerIdentifier signeridentifier, AlgorithmIdentifier algorithmidentifier, ASN1Set asn1set, AlgorithmIdentifier algorithmidentifier1, ASN1OctetString asn1octetstring, ASN1Set asn1set1)
    {
        if (signeridentifier.isTagged())
        {
            version = new ASN1Integer(3);
        } else
        {
            version = new ASN1Integer(1);
        }
        sid = signeridentifier;
        digAlgorithm = algorithmidentifier;
        authenticatedAttributes = asn1set;
        digEncryptionAlgorithm = algorithmidentifier1;
        encryptedDigest = asn1octetstring;
        unauthenticatedAttributes = asn1set1;
    }

    public static SignerInfo getInstance(Object obj)
        throws IllegalArgumentException
    {
        if (obj == null || (obj instanceof SignerInfo))
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

    public SignerIdentifier getSID()
    {
        return sid;
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
        asn1encodablevector.add(sid);
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
