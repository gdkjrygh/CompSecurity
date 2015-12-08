// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x509;

import java.util.Enumeration;
import java.util.Hashtable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

public class PolicyMappings extends ASN1Object
{

    ASN1Sequence seq;

    public PolicyMappings(Hashtable hashtable)
    {
        seq = null;
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        ASN1EncodableVector asn1encodablevector1;
        for (Enumeration enumeration = hashtable.keys(); enumeration.hasMoreElements(); asn1encodablevector.add(new DERSequence(asn1encodablevector1)))
        {
            String s = (String)enumeration.nextElement();
            String s1 = (String)hashtable.get(s);
            asn1encodablevector1 = new ASN1EncodableVector();
            asn1encodablevector1.add(new ASN1ObjectIdentifier(s));
            asn1encodablevector1.add(new ASN1ObjectIdentifier(s1));
        }

        seq = new DERSequence(asn1encodablevector);
    }

    private PolicyMappings(ASN1Sequence asn1sequence)
    {
        seq = null;
        seq = asn1sequence;
    }

    public static PolicyMappings getInstance(Object obj)
    {
        if (obj instanceof PolicyMappings)
        {
            return (PolicyMappings)obj;
        }
        if (obj != null)
        {
            return new PolicyMappings(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public ASN1Primitive toASN1Primitive()
    {
        return seq;
    }
}
