// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.x509;

import java.util.Enumeration;
import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1InputStream;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.DERBitString;
import org.spongycastle.asn1.DERSequence;

// Referenced classes of package org.spongycastle.asn1.x509:
//            AlgorithmIdentifier

public class SubjectPublicKeyInfo extends ASN1Object
{

    private AlgorithmIdentifier a;
    private DERBitString b;

    public SubjectPublicKeyInfo(ASN1Sequence asn1sequence)
    {
        if (asn1sequence.e() != 2)
        {
            throw new IllegalArgumentException((new StringBuilder("Bad sequence size: ")).append(asn1sequence.e()).toString());
        } else
        {
            asn1sequence = asn1sequence.d();
            a = AlgorithmIdentifier.a(asn1sequence.nextElement());
            b = DERBitString.a(asn1sequence.nextElement());
            return;
        }
    }

    public SubjectPublicKeyInfo(AlgorithmIdentifier algorithmidentifier, ASN1Encodable asn1encodable)
    {
        b = new DERBitString(asn1encodable);
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

    public final ASN1Primitive a()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.a(a);
        asn1encodablevector.a(b);
        return new DERSequence(asn1encodablevector);
    }

    public final AlgorithmIdentifier c()
    {
        return a;
    }

    public final AlgorithmIdentifier d()
    {
        return a;
    }

    public final ASN1Primitive e()
    {
        return (new ASN1InputStream(b.c())).b();
    }

    public final DERBitString f()
    {
        return b;
    }
}
