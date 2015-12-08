// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.x509;

import java.util.Enumeration;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1OctetString;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.ASN1TaggedObject;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.DERTaggedObject;

// Referenced classes of package org.spongycastle.asn1.x509:
//            GeneralNames

public class AuthorityKeyIdentifier extends ASN1Object
{

    ASN1OctetString a;
    GeneralNames b;
    ASN1Integer c;

    private AuthorityKeyIdentifier(ASN1Sequence asn1sequence)
    {
        a = null;
        b = null;
        c = null;
        asn1sequence = asn1sequence.d();
        do
        {
            if (!asn1sequence.hasMoreElements())
            {
                break;
            }
            ASN1TaggedObject asn1taggedobject = DERTaggedObject.a(asn1sequence.nextElement());
            switch (asn1taggedobject.c())
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
                c = ASN1Integer.a(asn1taggedobject, false);
                break;
            }
        } while (true);
    }

    public static AuthorityKeyIdentifier a(Object obj)
    {
        if (obj instanceof AuthorityKeyIdentifier)
        {
            return (AuthorityKeyIdentifier)obj;
        }
        if (obj != null)
        {
            return new AuthorityKeyIdentifier(ASN1Sequence.a(obj));
        } else
        {
            return null;
        }
    }

    public final ASN1Primitive a()
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

    public final byte[] c()
    {
        if (a != null)
        {
            return a.d();
        } else
        {
            return null;
        }
    }

    public String toString()
    {
        return (new StringBuilder("AuthorityKeyIdentifier: KeyID(")).append(a.d()).append(")").toString();
    }
}
