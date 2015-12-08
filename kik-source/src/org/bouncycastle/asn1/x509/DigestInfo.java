// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x509;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;

// Referenced classes of package org.bouncycastle.asn1.x509:
//            AlgorithmIdentifier

public class DigestInfo extends ASN1Encodable
{

    private byte a[];
    private AlgorithmIdentifier b;

    private DigestInfo(ASN1Sequence asn1sequence)
    {
        asn1sequence = asn1sequence.e();
        b = AlgorithmIdentifier.b(asn1sequence.nextElement());
        a = ASN1OctetString.a(asn1sequence.nextElement()).f();
    }

    public DigestInfo(AlgorithmIdentifier algorithmidentifier, byte abyte0[])
    {
        a = abyte0;
        b = algorithmidentifier;
    }

    public static DigestInfo a(Object obj)
    {
        if (obj instanceof DigestInfo)
        {
            return (DigestInfo)obj;
        }
        if (obj instanceof ASN1Sequence)
        {
            return new DigestInfo((ASN1Sequence)obj);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder("unknown object in factory: ")).append(obj.getClass().getName()).toString());
        }
    }

    public final DERObject d()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.a(b);
        asn1encodablevector.a(new DEROctetString(a));
        return new DERSequence(asn1encodablevector);
    }

    public final AlgorithmIdentifier e()
    {
        return b;
    }

    public final byte[] f()
    {
        return a;
    }
}
