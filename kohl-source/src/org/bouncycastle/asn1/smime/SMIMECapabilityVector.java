// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.smime;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.DERSequence;

public class SMIMECapabilityVector
{

    private ASN1EncodableVector capabilities;

    public SMIMECapabilityVector()
    {
        capabilities = new ASN1EncodableVector();
    }

    public void addCapability(ASN1ObjectIdentifier asn1objectidentifier)
    {
        capabilities.add(new DERSequence(asn1objectidentifier));
    }

    public void addCapability(ASN1ObjectIdentifier asn1objectidentifier, int i)
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(asn1objectidentifier);
        asn1encodablevector.add(new ASN1Integer(i));
        capabilities.add(new DERSequence(asn1encodablevector));
    }

    public void addCapability(ASN1ObjectIdentifier asn1objectidentifier, ASN1Encodable asn1encodable)
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(asn1objectidentifier);
        asn1encodablevector.add(asn1encodable);
        capabilities.add(new DERSequence(asn1encodablevector));
    }

    public ASN1EncodableVector toASN1EncodableVector()
    {
        return capabilities;
    }
}
