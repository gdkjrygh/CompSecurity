// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.esf;

import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.DERSequence;

// Referenced classes of package org.spongycastle.asn1.esf:
//            OtherHash, CrlIdentifier

public class CrlValidatedID extends ASN1Object
{

    private OtherHash a;
    private CrlIdentifier b;

    public final ASN1Primitive a()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.a(a.a());
        if (b != null)
        {
            asn1encodablevector.a(b.a());
        }
        return new DERSequence(asn1encodablevector);
    }
}
