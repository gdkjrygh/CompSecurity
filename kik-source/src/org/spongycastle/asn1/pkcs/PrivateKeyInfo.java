// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.pkcs;

import java.math.BigInteger;
import java.util.Enumeration;
import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1OctetString;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.ASN1Set;
import org.spongycastle.asn1.ASN1TaggedObject;
import org.spongycastle.asn1.DEROctetString;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.DERTaggedObject;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;

public class PrivateKeyInfo extends ASN1Object
{

    private ASN1OctetString a;
    private AlgorithmIdentifier b;
    private ASN1Set c;

    public PrivateKeyInfo(ASN1Sequence asn1sequence)
    {
        asn1sequence = asn1sequence.d();
        if (((ASN1Integer)asn1sequence.nextElement()).c().intValue() != 0)
        {
            throw new IllegalArgumentException("wrong version for private key info");
        }
        b = AlgorithmIdentifier.a(asn1sequence.nextElement());
        a = ASN1OctetString.a(asn1sequence.nextElement());
        if (asn1sequence.hasMoreElements())
        {
            c = ASN1Set.a((ASN1TaggedObject)asn1sequence.nextElement());
        }
    }

    public PrivateKeyInfo(AlgorithmIdentifier algorithmidentifier, ASN1Encodable asn1encodable)
    {
        this(algorithmidentifier, asn1encodable, (byte)0);
    }

    private PrivateKeyInfo(AlgorithmIdentifier algorithmidentifier, ASN1Encodable asn1encodable, byte byte0)
    {
        a = new DEROctetString(asn1encodable.a().a("DER"));
        b = algorithmidentifier;
        c = null;
    }

    public static PrivateKeyInfo a(Object obj)
    {
        if (obj instanceof PrivateKeyInfo)
        {
            return (PrivateKeyInfo)obj;
        }
        if (obj != null)
        {
            return new PrivateKeyInfo(ASN1Sequence.a(obj));
        } else
        {
            return null;
        }
    }

    public final ASN1Primitive a()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.a(new ASN1Integer(0));
        asn1encodablevector.a(b);
        asn1encodablevector.a(a);
        if (c != null)
        {
            asn1encodablevector.a(new DERTaggedObject(false, 0, c));
        }
        return new DERSequence(asn1encodablevector);
    }

    public final AlgorithmIdentifier c()
    {
        return b;
    }

    public final AlgorithmIdentifier d()
    {
        return b;
    }

    public final ASN1Encodable e()
    {
        return ASN1Primitive.a(a.d());
    }
}
