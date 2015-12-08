// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.isismtt.x509;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERPrintableString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x500.DirectoryString;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.asn1.x509.IssuerSerial;

public class ProcurationSyntax extends ASN1Encodable
{

    private String a;
    private DirectoryString b;
    private GeneralName c;
    private IssuerSerial d;

    public final DERObject d()
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
