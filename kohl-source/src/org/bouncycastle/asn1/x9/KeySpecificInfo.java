// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x9;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

public class KeySpecificInfo extends ASN1Object
{

    private ASN1ObjectIdentifier algorithm;
    private ASN1OctetString counter;

    public KeySpecificInfo(ASN1ObjectIdentifier asn1objectidentifier, ASN1OctetString asn1octetstring)
    {
        algorithm = asn1objectidentifier;
        counter = asn1octetstring;
    }

    public KeySpecificInfo(ASN1Sequence asn1sequence)
    {
        asn1sequence = asn1sequence.getObjects();
        algorithm = (ASN1ObjectIdentifier)asn1sequence.nextElement();
        counter = (ASN1OctetString)asn1sequence.nextElement();
    }

    public ASN1ObjectIdentifier getAlgorithm()
    {
        return algorithm;
    }

    public ASN1OctetString getCounter()
    {
        return counter;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(algorithm);
        asn1encodablevector.add(counter);
        return new DERSequence(asn1encodablevector);
    }
}
