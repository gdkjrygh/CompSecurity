// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.x509;

import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.ASN1SequenceParser;
import org.spongycastle.asn1.ASN1TaggedObject;
import org.spongycastle.asn1.DERNull;
import org.spongycastle.asn1.DERSequence;

public class AlgorithmIdentifier extends ASN1Object
{

    private ASN1ObjectIdentifier a;
    private ASN1Encodable b;
    private boolean c;

    private AlgorithmIdentifier(String s)
    {
        c = false;
        a = new ASN1ObjectIdentifier(s);
    }

    public AlgorithmIdentifier(ASN1ObjectIdentifier asn1objectidentifier)
    {
        c = false;
        a = asn1objectidentifier;
    }

    public AlgorithmIdentifier(ASN1ObjectIdentifier asn1objectidentifier, ASN1Encodable asn1encodable)
    {
        c = false;
        c = true;
        a = asn1objectidentifier;
        b = asn1encodable;
    }

    private AlgorithmIdentifier(ASN1Sequence asn1sequence)
    {
        c = false;
        if (asn1sequence.e() <= 0 || asn1sequence.e() > 2)
        {
            throw new IllegalArgumentException((new StringBuilder("Bad sequence size: ")).append(asn1sequence.e()).toString());
        }
        a = ASN1ObjectIdentifier.a(asn1sequence.a(0));
        if (asn1sequence.e() == 2)
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

    public static AlgorithmIdentifier a(Object obj)
    {
        if (obj == null || (obj instanceof AlgorithmIdentifier))
        {
            return (AlgorithmIdentifier)obj;
        }
        if (obj instanceof ASN1ObjectIdentifier)
        {
            return new AlgorithmIdentifier((ASN1ObjectIdentifier)obj);
        }
        if (obj instanceof String)
        {
            return new AlgorithmIdentifier((String)obj);
        }
        if ((obj instanceof ASN1Sequence) || (obj instanceof ASN1SequenceParser))
        {
            return new AlgorithmIdentifier(ASN1Sequence.a(obj));
        } else
        {
            throw new IllegalArgumentException((new StringBuilder("unknown object in factory: ")).append(obj.getClass().getName()).toString());
        }
    }

    public static AlgorithmIdentifier a(ASN1TaggedObject asn1taggedobject)
    {
        return a(ASN1Sequence.a(asn1taggedobject, true));
    }

    public final ASN1Primitive a()
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
                asn1encodablevector.a(DERNull.a);
            }
        }
        return new DERSequence(asn1encodablevector);
    }

    public ASN1ObjectIdentifier c()
    {
        return a;
    }

    public final ASN1ObjectIdentifier d()
    {
        return new ASN1ObjectIdentifier(a.c());
    }

    public final ASN1Encodable e()
    {
        return b;
    }
}
