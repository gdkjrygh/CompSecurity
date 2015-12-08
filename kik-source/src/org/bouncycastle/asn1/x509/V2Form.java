// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x509;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;

// Referenced classes of package org.bouncycastle.asn1.x509:
//            GeneralNames, IssuerSerial, ObjectDigestInfo

public class V2Form extends ASN1Encodable
{

    GeneralNames a;
    IssuerSerial b;
    ObjectDigestInfo c;

    private V2Form(ASN1Sequence asn1sequence)
    {
        int i = 0;
        super();
        if (asn1sequence.f() > 3)
        {
            throw new IllegalArgumentException((new StringBuilder("Bad sequence size: ")).append(asn1sequence.f()).toString());
        }
        if (!(asn1sequence.a(0) instanceof ASN1TaggedObject))
        {
            a = GeneralNames.a(asn1sequence.a(0));
            i = 1;
        }
        while (i != asn1sequence.f()) 
        {
            ASN1TaggedObject asn1taggedobject = ASN1TaggedObject.a(asn1sequence.a(i));
            if (asn1taggedobject.e() == 0)
            {
                b = IssuerSerial.a(asn1taggedobject);
            } else
            if (asn1taggedobject.e() == 1)
            {
                c = ObjectDigestInfo.a(asn1taggedobject);
            } else
            {
                throw new IllegalArgumentException((new StringBuilder("Bad tag number: ")).append(asn1taggedobject.e()).toString());
            }
            i++;
        }
    }

    public static V2Form a(Object obj)
    {
        if (obj == null || (obj instanceof V2Form))
        {
            return (V2Form)obj;
        }
        if (obj instanceof ASN1Sequence)
        {
            return new V2Form((ASN1Sequence)obj);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder("unknown object in factory: ")).append(obj.getClass().getName()).toString());
        }
    }

    public static V2Form a(ASN1TaggedObject asn1taggedobject)
    {
        return a(ASN1Sequence.a(asn1taggedobject, false));
    }

    public final DERObject d()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        if (a != null)
        {
            asn1encodablevector.a(a);
        }
        if (b != null)
        {
            asn1encodablevector.a(new DERTaggedObject(false, 0, b));
        }
        if (c != null)
        {
            asn1encodablevector.a(new DERTaggedObject(false, 1, c));
        }
        return new DERSequence(asn1encodablevector);
    }

    public final GeneralNames e()
    {
        return a;
    }

    public final IssuerSerial f()
    {
        return b;
    }
}
