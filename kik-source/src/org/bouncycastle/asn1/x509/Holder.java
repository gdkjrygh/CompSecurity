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
//            IssuerSerial, GeneralNames, ObjectDigestInfo

public class Holder extends ASN1Encodable
{

    IssuerSerial a;
    GeneralNames b;
    ObjectDigestInfo c;
    private int d;

    private Holder(ASN1Sequence asn1sequence)
    {
        int i;
        d = 1;
        if (asn1sequence.f() > 3)
        {
            throw new IllegalArgumentException((new StringBuilder("Bad sequence size: ")).append(asn1sequence.f()).toString());
        }
        i = 0;
_L2:
        ASN1TaggedObject asn1taggedobject;
        if (i == asn1sequence.f())
        {
            break MISSING_BLOCK_LABEL_139;
        }
        asn1taggedobject = ASN1TaggedObject.a(asn1sequence.a(i));
        switch (asn1taggedobject.e())
        {
        default:
            throw new IllegalArgumentException("unknown tag in Holder");

        case 1: // '\001'
            break; /* Loop/switch isn't completed */

        case 2: // '\002'
            break MISSING_BLOCK_LABEL_128;

        case 0: // '\0'
            a = IssuerSerial.a(asn1taggedobject);
            break;
        }
_L3:
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        b = GeneralNames.a(asn1taggedobject);
          goto _L3
        c = ObjectDigestInfo.a(asn1taggedobject);
          goto _L3
        d = 1;
        return;
    }

    private Holder(ASN1TaggedObject asn1taggedobject)
    {
        d = 1;
        asn1taggedobject.e();
        JVM INSTR tableswitch 0 1: default 36
    //                   0 46
    //                   1 60;
           goto _L1 _L2 _L3
_L1:
        throw new IllegalArgumentException("unknown tag in Holder");
_L2:
        a = IssuerSerial.a(asn1taggedobject);
_L5:
        d = 0;
        return;
_L3:
        b = GeneralNames.a(asn1taggedobject);
        if (true) goto _L5; else goto _L4
_L4:
    }

    public static Holder a(Object obj)
    {
        if (obj instanceof Holder)
        {
            return (Holder)obj;
        }
        if (obj instanceof ASN1Sequence)
        {
            return new Holder((ASN1Sequence)obj);
        }
        if (obj instanceof ASN1TaggedObject)
        {
            return new Holder((ASN1TaggedObject)obj);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder("unknown object in factory: ")).append(obj.getClass().getName()).toString());
        }
    }

    public final DERObject d()
    {
        if (d == 1)
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
        if (b != null)
        {
            return new DERTaggedObject(false, 1, b);
        } else
        {
            return new DERTaggedObject(false, 0, a);
        }
    }

    public final IssuerSerial e()
    {
        return a;
    }

    public final GeneralNames f()
    {
        return b;
    }

    public final ObjectDigestInfo g()
    {
        return c;
    }
}
