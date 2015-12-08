// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.pkcs;

import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.DERSequence;

// Referenced classes of package org.spongycastle.asn1.pkcs:
//            PKCSObjectIdentifiers, EncryptionScheme, KeyDerivationFunc

public class PBES2Parameters extends ASN1Object
    implements PKCSObjectIdentifiers
{

    private EncryptionScheme bA;
    private KeyDerivationFunc bz;

    public final ASN1Primitive a()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.a(bz);
        asn1encodablevector.a(bA);
        return new DERSequence(asn1encodablevector);
    }
}
