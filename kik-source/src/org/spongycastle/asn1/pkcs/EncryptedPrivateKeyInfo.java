// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.pkcs;

import java.util.Enumeration;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1OctetString;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.DEROctetString;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;

// Referenced classes of package org.spongycastle.asn1.pkcs:
//            EncryptedData

public class EncryptedPrivateKeyInfo extends ASN1Object
{

    private AlgorithmIdentifier a;
    private ASN1OctetString b;

    private EncryptedPrivateKeyInfo(ASN1Sequence asn1sequence)
    {
        asn1sequence = asn1sequence.d();
        a = AlgorithmIdentifier.a(asn1sequence.nextElement());
        b = ASN1OctetString.a(asn1sequence.nextElement());
    }

    public EncryptedPrivateKeyInfo(AlgorithmIdentifier algorithmidentifier, byte abyte0[])
    {
        a = algorithmidentifier;
        b = new DEROctetString(abyte0);
    }

    public static EncryptedPrivateKeyInfo a(Object obj)
    {
        if (obj instanceof EncryptedData)
        {
            return (EncryptedPrivateKeyInfo)obj;
        }
        if (obj != null)
        {
            return new EncryptedPrivateKeyInfo(ASN1Sequence.a(obj));
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

    public final byte[] d()
    {
        return b.d();
    }
}
