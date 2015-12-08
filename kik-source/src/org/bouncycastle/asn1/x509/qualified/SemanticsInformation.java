// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x509.qualified;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.GeneralName;

public class SemanticsInformation extends ASN1Encodable
{

    DERObjectIdentifier a;
    GeneralName b[];

    public final DERObject d()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        if (a != null)
        {
            asn1encodablevector.a(a);
        }
        if (b != null)
        {
            ASN1EncodableVector asn1encodablevector1 = new ASN1EncodableVector();
            for (int i = 0; i < b.length; i++)
            {
                asn1encodablevector1.a(b[i]);
            }

            asn1encodablevector.a(new DERSequence(asn1encodablevector1));
        }
        return new DERSequence(asn1encodablevector);
    }
}
