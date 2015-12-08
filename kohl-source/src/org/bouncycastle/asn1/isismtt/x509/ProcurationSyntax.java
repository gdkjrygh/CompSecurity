// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.isismtt.x509;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERPrintableString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x500.DirectoryString;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.asn1.x509.IssuerSerial;

public class ProcurationSyntax extends ASN1Object
{

    private IssuerSerial certRef;
    private String country;
    private GeneralName thirdPerson;
    private DirectoryString typeOfSubstitution;

    public ProcurationSyntax(String s, DirectoryString directorystring, GeneralName generalname)
    {
        country = s;
        typeOfSubstitution = directorystring;
        thirdPerson = generalname;
        certRef = null;
    }

    public ProcurationSyntax(String s, DirectoryString directorystring, IssuerSerial issuerserial)
    {
        country = s;
        typeOfSubstitution = directorystring;
        thirdPerson = null;
        certRef = issuerserial;
    }

    private ProcurationSyntax(ASN1Sequence asn1sequence)
    {
        if (asn1sequence.size() < 1 || asn1sequence.size() > 3)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Bad sequence size: ").append(asn1sequence.size()).toString());
        }
        asn1sequence = asn1sequence.getObjects();
        do
        {
            if (asn1sequence.hasMoreElements())
            {
                Object obj = ASN1TaggedObject.getInstance(asn1sequence.nextElement());
                switch (((ASN1TaggedObject) (obj)).getTagNo())
                {
                default:
                    throw new IllegalArgumentException((new StringBuilder()).append("Bad tag number: ").append(((ASN1TaggedObject) (obj)).getTagNo()).toString());

                case 1: // '\001'
                    country = DERPrintableString.getInstance(((ASN1TaggedObject) (obj)), true).getString();
                    break;

                case 2: // '\002'
                    typeOfSubstitution = DirectoryString.getInstance(((ASN1TaggedObject) (obj)), true);
                    break;

                case 3: // '\003'
                    obj = ((ASN1TaggedObject) (obj)).getObject();
                    if (obj instanceof ASN1TaggedObject)
                    {
                        thirdPerson = GeneralName.getInstance(obj);
                    } else
                    {
                        certRef = IssuerSerial.getInstance(obj);
                    }
                    break;
                }
                if (true)
                {
                    continue;
                }
            }
            return;
        } while (true);
    }

    public static ProcurationSyntax getInstance(Object obj)
    {
        if (obj == null || (obj instanceof ProcurationSyntax))
        {
            return (ProcurationSyntax)obj;
        }
        if (obj instanceof ASN1Sequence)
        {
            return new ProcurationSyntax((ASN1Sequence)obj);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("illegal object in getInstance: ").append(obj.getClass().getName()).toString());
        }
    }

    public IssuerSerial getCertRef()
    {
        return certRef;
    }

    public String getCountry()
    {
        return country;
    }

    public GeneralName getThirdPerson()
    {
        return thirdPerson;
    }

    public DirectoryString getTypeOfSubstitution()
    {
        return typeOfSubstitution;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        if (country != null)
        {
            asn1encodablevector.add(new DERTaggedObject(true, 1, new DERPrintableString(country, true)));
        }
        if (typeOfSubstitution != null)
        {
            asn1encodablevector.add(new DERTaggedObject(true, 2, typeOfSubstitution));
        }
        if (thirdPerson != null)
        {
            asn1encodablevector.add(new DERTaggedObject(true, 3, thirdPerson));
        } else
        {
            asn1encodablevector.add(new DERTaggedObject(true, 3, certRef));
        }
        return new DERSequence(asn1encodablevector);
    }
}
