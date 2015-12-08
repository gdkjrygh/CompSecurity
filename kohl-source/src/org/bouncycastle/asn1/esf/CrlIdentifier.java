// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.esf;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERUTCTime;
import org.bouncycastle.asn1.x500.X500Name;

public class CrlIdentifier extends ASN1Object
{

    private DERUTCTime crlIssuedTime;
    private X500Name crlIssuer;
    private ASN1Integer crlNumber;

    private CrlIdentifier(ASN1Sequence asn1sequence)
    {
        if (asn1sequence.size() < 2 || asn1sequence.size() > 3)
        {
            throw new IllegalArgumentException();
        }
        crlIssuer = X500Name.getInstance(asn1sequence.getObjectAt(0));
        crlIssuedTime = DERUTCTime.getInstance(asn1sequence.getObjectAt(1));
        if (asn1sequence.size() > 2)
        {
            crlNumber = ASN1Integer.getInstance(asn1sequence.getObjectAt(2));
        }
    }

    public CrlIdentifier(X500Name x500name, DERUTCTime derutctime)
    {
        this(x500name, derutctime, null);
    }

    public CrlIdentifier(X500Name x500name, DERUTCTime derutctime, BigInteger biginteger)
    {
        crlIssuer = x500name;
        crlIssuedTime = derutctime;
        if (biginteger != null)
        {
            crlNumber = new ASN1Integer(biginteger);
        }
    }

    public static CrlIdentifier getInstance(Object obj)
    {
        if (obj instanceof CrlIdentifier)
        {
            return (CrlIdentifier)obj;
        }
        if (obj != null)
        {
            return new CrlIdentifier(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public DERUTCTime getCrlIssuedTime()
    {
        return crlIssuedTime;
    }

    public X500Name getCrlIssuer()
    {
        return crlIssuer;
    }

    public BigInteger getCrlNumber()
    {
        if (crlNumber == null)
        {
            return null;
        } else
        {
            return crlNumber.getValue();
        }
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(crlIssuer.toASN1Primitive());
        asn1encodablevector.add(crlIssuedTime);
        if (crlNumber != null)
        {
            asn1encodablevector.add(crlNumber);
        }
        return new DERSequence(asn1encodablevector);
    }
}
