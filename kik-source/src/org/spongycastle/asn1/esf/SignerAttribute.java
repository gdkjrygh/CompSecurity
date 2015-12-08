// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.esf;

import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.DERTaggedObject;
import org.spongycastle.asn1.x509.AttributeCertificate;

public class SignerAttribute extends ASN1Object
{

    private Object a[];

    public final ASN1Primitive a()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        int i = 0;
        while (i != a.length) 
        {
            if (a[i] instanceof org.spongycastle.asn1.x509.Attribute[])
            {
                asn1encodablevector.a(new DERTaggedObject(0, new DERSequence((org.spongycastle.asn1.x509.Attribute[])a[i])));
            } else
            {
                asn1encodablevector.a(new DERTaggedObject(1, (AttributeCertificate)a[i]));
            }
            i++;
        }
        return new DERSequence(asn1encodablevector);
    }
}
