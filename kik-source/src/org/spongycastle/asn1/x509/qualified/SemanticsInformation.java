// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.x509.qualified;

import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.x509.GeneralName;

public class SemanticsInformation extends ASN1Object
{

    private ASN1ObjectIdentifier a;
    private GeneralName b[];

    public final ASN1Primitive a()
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
