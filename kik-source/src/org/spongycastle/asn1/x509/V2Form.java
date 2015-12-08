// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.x509;

import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.ASN1TaggedObject;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.DERTaggedObject;

// Referenced classes of package org.spongycastle.asn1.x509:
//            GeneralNames, IssuerSerial, ObjectDigestInfo

public class V2Form extends ASN1Object
{

    GeneralNames a;
    IssuerSerial b;
    ObjectDigestInfo c;

    private V2Form(ASN1Sequence asn1sequence)
    {
        int i = 0;
        super();
        if (asn1sequence.e() > 3)
        {
            throw new IllegalArgumentException((new StringBuilder("Bad sequence size: ")).append(asn1sequence.e()).toString());
        }
        if (!(asn1sequence.a(0) instanceof ASN1TaggedObject))
        {
            a = GeneralNames.a(asn1sequence.a(0));
            i = 1;
        }
        while (i != asn1sequence.e()) 
        {
            ASN1TaggedObject asn1taggedobject = ASN1TaggedObject.a(asn1sequence.a(i));
            if (asn1taggedobject.c() == 0)
            {
                b = IssuerSerial.a(asn1taggedobject);
            } else
            if (asn1taggedobject.c() == 1)
            {
                c = ObjectDigestInfo.a(asn1taggedobject);
            } else
            {
                throw new IllegalArgumentException((new StringBuilder("Bad tag number: ")).append(asn1taggedobject.c()).toString());
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

    public final ASN1Primitive a()
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

    public final GeneralNames c()
    {
        return a;
    }

    public final IssuerSerial d()
    {
        return b;
    }
}
