// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x509;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;

// Referenced classes of package org.bouncycastle.asn1.x509:
//            GeneralNames

public class AuthorityKeyIdentifier extends ASN1Encodable
{

    ASN1OctetString a;
    GeneralNames b;
    DERInteger c;

    public AuthorityKeyIdentifier(ASN1Sequence asn1sequence)
    {
        a = null;
        b = null;
        c = null;
        asn1sequence = asn1sequence.e();
        do
        {
            if (!asn1sequence.hasMoreElements())
            {
                break;
            }
            ASN1TaggedObject asn1taggedobject = DERTaggedObject.a(asn1sequence.nextElement());
            switch (asn1taggedobject.e())
            {
            default:
                throw new IllegalArgumentException("illegal tag");

            case 0: // '\0'
                a = ASN1OctetString.a(asn1taggedobject);
                break;

            case 1: // '\001'
                b = GeneralNames.a(asn1taggedobject);
                break;

            case 2: // '\002'
                c = DERInteger.a(asn1taggedobject, false);
                break;
            }
        } while (true);
    }

    public final DERObject d()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        if (a != null)
        {
            asn1encodablevector.a(new DERTaggedObject(false, 0, a));
        }
        if (b != null)
        {
            asn1encodablevector.a(new DERTaggedObject(false, 1, b));
        }
        if (c != null)
        {
            asn1encodablevector.a(new DERTaggedObject(false, 2, c));
        }
        return new DERSequence(asn1encodablevector);
    }

    public final byte[] e()
    {
        if (a != null)
        {
            return a.f();
        } else
        {
            return null;
        }
    }

    public String toString()
    {
        return (new StringBuilder("AuthorityKeyIdentifier: KeyID(")).append(a.f()).append(")").toString();
    }
}
