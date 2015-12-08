// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.esf;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.DERUTF8String;
import org.bouncycastle.asn1.x500.DirectoryString;

public class SignerLocation extends ASN1Object
{

    private DERUTF8String countryName;
    private DERUTF8String localityName;
    private ASN1Sequence postalAddress;

    private SignerLocation(ASN1Sequence asn1sequence)
    {
        asn1sequence = asn1sequence.getObjects();
_L2:
        DERTaggedObject dertaggedobject;
label0:
        {
            do
            {
                if (!asn1sequence.hasMoreElements())
                {
                    break;
                }
                dertaggedobject = (DERTaggedObject)asn1sequence.nextElement();
                switch (dertaggedobject.getTagNo())
                {
                default:
                    throw new IllegalArgumentException("illegal tag");

                case 2: // '\002'
                    break label0;

                case 0: // '\0'
                    countryName = new DERUTF8String(DirectoryString.getInstance(dertaggedobject, true).getString());
                    break;

                case 1: // '\001'
                    localityName = new DERUTF8String(DirectoryString.getInstance(dertaggedobject, true).getString());
                    break;
                }
            } while (true);
            break; /* Loop/switch isn't completed */
        }
        if (dertaggedobject.isExplicit())
        {
            postalAddress = ASN1Sequence.getInstance(dertaggedobject, true);
        } else
        {
            postalAddress = ASN1Sequence.getInstance(dertaggedobject, false);
        }
        if (postalAddress != null && postalAddress.size() > 6)
        {
            throw new IllegalArgumentException("postal address must contain less than 6 strings");
        }
        if (true) goto _L2; else goto _L1
_L1:
    }

    public SignerLocation(DERUTF8String derutf8string, DERUTF8String derutf8string1, ASN1Sequence asn1sequence)
    {
        if (asn1sequence != null && asn1sequence.size() > 6)
        {
            throw new IllegalArgumentException("postal address must contain less than 6 strings");
        }
        if (derutf8string != null)
        {
            countryName = DERUTF8String.getInstance(derutf8string.toASN1Primitive());
        }
        if (derutf8string1 != null)
        {
            localityName = DERUTF8String.getInstance(derutf8string1.toASN1Primitive());
        }
        if (asn1sequence != null)
        {
            postalAddress = ASN1Sequence.getInstance(asn1sequence.toASN1Primitive());
        }
    }

    public static SignerLocation getInstance(Object obj)
    {
        if (obj == null || (obj instanceof SignerLocation))
        {
            return (SignerLocation)obj;
        } else
        {
            return new SignerLocation(ASN1Sequence.getInstance(obj));
        }
    }

    public DERUTF8String getCountryName()
    {
        return countryName;
    }

    public DERUTF8String getLocalityName()
    {
        return localityName;
    }

    public ASN1Sequence getPostalAddress()
    {
        return postalAddress;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        if (countryName != null)
        {
            asn1encodablevector.add(new DERTaggedObject(true, 0, countryName));
        }
        if (localityName != null)
        {
            asn1encodablevector.add(new DERTaggedObject(true, 1, localityName));
        }
        if (postalAddress != null)
        {
            asn1encodablevector.add(new DERTaggedObject(true, 2, postalAddress));
        }
        return new DERSequence(asn1encodablevector);
    }
}
