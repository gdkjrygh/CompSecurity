// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.isismtt.x509;

import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.DERPrintableString;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.DERTaggedObject;
import org.spongycastle.asn1.x500.DirectoryString;
import org.spongycastle.asn1.x509.GeneralName;
import org.spongycastle.asn1.x509.IssuerSerial;

public class ProcurationSyntax extends ASN1Object
{

    private String a;
    private DirectoryString b;
    private GeneralName c;
    private IssuerSerial d;

    public final ASN1Primitive a()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        if (a != null)
        {
            asn1encodablevector.a(new DERTaggedObject(true, 1, new DERPrintableString(a, true)));
        }
        if (b != null)
        {
            asn1encodablevector.a(new DERTaggedObject(true, 2, b));
        }
        if (c != null)
        {
            asn1encodablevector.a(new DERTaggedObject(true, 3, c));
        } else
        {
            asn1encodablevector.a(new DERTaggedObject(true, 3, d));
        }
        return new DERSequence(asn1encodablevector);
    }
}
