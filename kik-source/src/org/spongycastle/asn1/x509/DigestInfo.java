// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.x509;

import java.util.Enumeration;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1OctetString;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.DEROctetString;
import org.spongycastle.asn1.DERSequence;

// Referenced classes of package org.spongycastle.asn1.x509:
//            AlgorithmIdentifier

public class DigestInfo extends ASN1Object
{

    private byte a[];
    private AlgorithmIdentifier b;

    private DigestInfo(ASN1Sequence asn1sequence)
    {
        asn1sequence = asn1sequence.d();
        b = AlgorithmIdentifier.a(asn1sequence.nextElement());
        a = ASN1OctetString.a(asn1sequence.nextElement()).d();
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
        if (obj != null)
        {
            return new DigestInfo(ASN1Sequence.a(obj));
        } else
        {
            return null;
        }
    }

    public final ASN1Primitive a()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.a(b);
        asn1encodablevector.a(new DEROctetString(a));
        return new DERSequence(asn1encodablevector);
    }

    public final AlgorithmIdentifier c()
    {
        return b;
    }

    public final byte[] d()
    {
        return a;
    }
}
