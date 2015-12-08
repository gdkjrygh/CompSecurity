// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x509;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DEREncodable;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERSequence;

// Referenced classes of package org.bouncycastle.asn1.x509:
//            AlgorithmIdentifier

public class SubjectPublicKeyInfo extends ASN1Encodable
{

    private AlgorithmIdentifier a;
    private DERBitString b;

    public SubjectPublicKeyInfo(ASN1Sequence asn1sequence)
    {
        if (asn1sequence.f() != 2)
        {
            throw new IllegalArgumentException((new StringBuilder("Bad sequence size: ")).append(asn1sequence.f()).toString());
        } else
        {
            asn1sequence = asn1sequence.e();
            a = AlgorithmIdentifier.b(asn1sequence.nextElement());
            b = DERBitString.a(asn1sequence.nextElement());
            return;
        }
    }

    public SubjectPublicKeyInfo(AlgorithmIdentifier algorithmidentifier, DEREncodable derencodable)
    {
        b = new DERBitString(derencodable);
        a = algorithmidentifier;
    }

    public SubjectPublicKeyInfo(AlgorithmIdentifier algorithmidentifier, byte abyte0[])
    {
        b = new DERBitString(abyte0);
        a = algorithmidentifier;
    }

    public static SubjectPublicKeyInfo a(Object obj)
    {
        if (obj instanceof SubjectPublicKeyInfo)
        {
            return (SubjectPublicKeyInfo)obj;
        }
        if (obj != null)
        {
            return new SubjectPublicKeyInfo(ASN1Sequence.a(obj));
        } else
        {
            return null;
        }
    }

    public final DERObject d()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.a(a);
        asn1encodablevector.a(b);
        return new DERSequence(asn1encodablevector);
    }

    public final AlgorithmIdentifier e()
    {
        return a;
    }

    public final DERObject f()
    {
        return (new ASN1InputStream(b.e())).a();
    }

    public final DERBitString g()
    {
        return b;
    }
}
