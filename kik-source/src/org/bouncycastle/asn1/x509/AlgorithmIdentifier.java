// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x509;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DEREncodable;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.DERSequence;

public class AlgorithmIdentifier extends ASN1Encodable
{

    private DERObjectIdentifier a;
    private DEREncodable b;
    private boolean c;

    private AlgorithmIdentifier(String s)
    {
        c = false;
        a = new DERObjectIdentifier(s);
    }

    public AlgorithmIdentifier(ASN1Sequence asn1sequence)
    {
        c = false;
        if (asn1sequence.f() <= 0 || asn1sequence.f() > 2)
        {
            throw new IllegalArgumentException((new StringBuilder("Bad sequence size: ")).append(asn1sequence.f()).toString());
        }
        a = DERObjectIdentifier.a(asn1sequence.a(0));
        if (asn1sequence.f() == 2)
        {
            c = true;
            b = asn1sequence.a(1);
            return;
        } else
        {
            b = null;
            return;
        }
    }

    public AlgorithmIdentifier(DERObjectIdentifier derobjectidentifier)
    {
        c = false;
        a = derobjectidentifier;
    }

    public AlgorithmIdentifier(DERObjectIdentifier derobjectidentifier, DEREncodable derencodable)
    {
        c = false;
        c = true;
        a = derobjectidentifier;
        b = derencodable;
    }

    public static AlgorithmIdentifier a(ASN1TaggedObject asn1taggedobject)
    {
        return b(ASN1Sequence.a(asn1taggedobject, true));
    }

    public static AlgorithmIdentifier b(Object obj)
    {
        if (obj == null || (obj instanceof AlgorithmIdentifier))
        {
            return (AlgorithmIdentifier)obj;
        }
        if (obj instanceof DERObjectIdentifier)
        {
            return new AlgorithmIdentifier((DERObjectIdentifier)obj);
        }
        if (obj instanceof String)
        {
            return new AlgorithmIdentifier((String)obj);
        }
        if (obj instanceof ASN1Sequence)
        {
            return new AlgorithmIdentifier((ASN1Sequence)obj);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder("unknown object in factory: ")).append(obj.getClass().getName()).toString());
        }
    }

    public final DERObject d()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.a(a);
        if (c)
        {
            if (b != null)
            {
                asn1encodablevector.a(b);
            } else
            {
                asn1encodablevector.a(DERNull.b);
            }
        }
        return new DERSequence(asn1encodablevector);
    }

    public DERObjectIdentifier e()
    {
        return a;
    }

    public final ASN1ObjectIdentifier f()
    {
        return new ASN1ObjectIdentifier(a.e());
    }

    public final DEREncodable g()
    {
        return b;
    }
}
