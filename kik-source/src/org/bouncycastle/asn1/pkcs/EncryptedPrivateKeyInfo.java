// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.pkcs;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

public class EncryptedPrivateKeyInfo extends ASN1Encodable
{

    private AlgorithmIdentifier a;
    private ASN1OctetString b;

    public EncryptedPrivateKeyInfo(ASN1Sequence asn1sequence)
    {
        asn1sequence = asn1sequence.e();
        a = AlgorithmIdentifier.b(asn1sequence.nextElement());
        b = (ASN1OctetString)asn1sequence.nextElement();
    }

    public EncryptedPrivateKeyInfo(AlgorithmIdentifier algorithmidentifier, byte abyte0[])
    {
        a = algorithmidentifier;
        b = new DEROctetString(abyte0);
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

    public final byte[] f()
    {
        return b.f();
    }
}
