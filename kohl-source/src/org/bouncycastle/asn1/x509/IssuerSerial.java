// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x509;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERSequence;

// Referenced classes of package org.bouncycastle.asn1.x509:
//            GeneralNames

public class IssuerSerial extends ASN1Object
{

    GeneralNames issuer;
    DERBitString issuerUID;
    ASN1Integer serial;

    public IssuerSerial(ASN1Sequence asn1sequence)
    {
        if (asn1sequence.size() != 2 && asn1sequence.size() != 3)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Bad sequence size: ").append(asn1sequence.size()).toString());
        }
        issuer = GeneralNames.getInstance(asn1sequence.getObjectAt(0));
        serial = ASN1Integer.getInstance(asn1sequence.getObjectAt(1));
        if (asn1sequence.size() == 3)
        {
            issuerUID = DERBitString.getInstance(asn1sequence.getObjectAt(2));
        }
    }

    public IssuerSerial(GeneralNames generalnames, ASN1Integer asn1integer)
    {
        issuer = generalnames;
        serial = asn1integer;
    }

    public static IssuerSerial getInstance(Object obj)
    {
        if (obj == null || (obj instanceof IssuerSerial))
        {
            return (IssuerSerial)obj;
        }
        if (obj instanceof ASN1Sequence)
        {
            return new IssuerSerial((ASN1Sequence)obj);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("illegal object in getInstance: ").append(obj.getClass().getName()).toString());
        }
    }

    public static IssuerSerial getInstance(ASN1TaggedObject asn1taggedobject, boolean flag)
    {
        return getInstance(ASN1Sequence.getInstance(asn1taggedobject, flag));
    }

    public GeneralNames getIssuer()
    {
        return issuer;
    }

    public DERBitString getIssuerUID()
    {
        return issuerUID;
    }

    public ASN1Integer getSerial()
    {
        return serial;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(issuer);
        asn1encodablevector.add(serial);
        if (issuerUID != null)
        {
            asn1encodablevector.add(issuerUID);
        }
        return new DERSequence(asn1encodablevector);
    }
}
