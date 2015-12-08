// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.cryptopro;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;

public class GOST3410PublicKeyAlgParameters extends ASN1Object
{

    private ASN1ObjectIdentifier digestParamSet;
    private ASN1ObjectIdentifier encryptionParamSet;
    private ASN1ObjectIdentifier publicKeyParamSet;

    public GOST3410PublicKeyAlgParameters(ASN1ObjectIdentifier asn1objectidentifier, ASN1ObjectIdentifier asn1objectidentifier1)
    {
        publicKeyParamSet = asn1objectidentifier;
        digestParamSet = asn1objectidentifier1;
        encryptionParamSet = null;
    }

    public GOST3410PublicKeyAlgParameters(ASN1ObjectIdentifier asn1objectidentifier, ASN1ObjectIdentifier asn1objectidentifier1, ASN1ObjectIdentifier asn1objectidentifier2)
    {
        publicKeyParamSet = asn1objectidentifier;
        digestParamSet = asn1objectidentifier1;
        encryptionParamSet = asn1objectidentifier2;
    }

    public GOST3410PublicKeyAlgParameters(ASN1Sequence asn1sequence)
    {
        publicKeyParamSet = (ASN1ObjectIdentifier)asn1sequence.getObjectAt(0);
        digestParamSet = (ASN1ObjectIdentifier)asn1sequence.getObjectAt(1);
        if (asn1sequence.size() > 2)
        {
            encryptionParamSet = (ASN1ObjectIdentifier)asn1sequence.getObjectAt(2);
        }
    }

    public static GOST3410PublicKeyAlgParameters getInstance(Object obj)
    {
        if (obj instanceof GOST3410PublicKeyAlgParameters)
        {
            return (GOST3410PublicKeyAlgParameters)obj;
        }
        if (obj != null)
        {
            return new GOST3410PublicKeyAlgParameters(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public static GOST3410PublicKeyAlgParameters getInstance(ASN1TaggedObject asn1taggedobject, boolean flag)
    {
        return getInstance(ASN1Sequence.getInstance(asn1taggedobject, flag));
    }

    public ASN1ObjectIdentifier getDigestParamSet()
    {
        return digestParamSet;
    }

    public ASN1ObjectIdentifier getEncryptionParamSet()
    {
        return encryptionParamSet;
    }

    public ASN1ObjectIdentifier getPublicKeyParamSet()
    {
        return publicKeyParamSet;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(publicKeyParamSet);
        asn1encodablevector.add(digestParamSet);
        if (encryptionParamSet != null)
        {
            asn1encodablevector.add(encryptionParamSet);
        }
        return new DERSequence(asn1encodablevector);
    }
}
