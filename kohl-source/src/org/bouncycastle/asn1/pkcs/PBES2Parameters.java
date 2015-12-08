// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.pkcs;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

// Referenced classes of package org.bouncycastle.asn1.pkcs:
//            PKCSObjectIdentifiers, KeyDerivationFunc, PBKDF2Params, EncryptionScheme

public class PBES2Parameters extends ASN1Object
    implements PKCSObjectIdentifiers
{

    private KeyDerivationFunc func;
    private EncryptionScheme scheme;

    public PBES2Parameters(ASN1Sequence asn1sequence)
    {
        asn1sequence = asn1sequence.getObjects();
        ASN1Sequence asn1sequence1 = ASN1Sequence.getInstance(((ASN1Encodable)asn1sequence.nextElement()).toASN1Primitive());
        if (asn1sequence1.getObjectAt(0).equals(id_PBKDF2))
        {
            func = new KeyDerivationFunc(id_PBKDF2, PBKDF2Params.getInstance(asn1sequence1.getObjectAt(1)));
        } else
        {
            func = new KeyDerivationFunc(asn1sequence1);
        }
        scheme = (EncryptionScheme)EncryptionScheme.getInstance(asn1sequence.nextElement());
    }

    public static PBES2Parameters getInstance(Object obj)
    {
        if (obj == null || (obj instanceof PBES2Parameters))
        {
            return (PBES2Parameters)obj;
        }
        if (obj instanceof ASN1Sequence)
        {
            return new PBES2Parameters((ASN1Sequence)obj);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("unknown object in factory: ").append(obj.getClass().getName()).toString());
        }
    }

    public EncryptionScheme getEncryptionScheme()
    {
        return scheme;
    }

    public KeyDerivationFunc getKeyDerivationFunc()
    {
        return func;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(func);
        asn1encodablevector.add(scheme);
        return new DERSequence(asn1encodablevector);
    }
}
