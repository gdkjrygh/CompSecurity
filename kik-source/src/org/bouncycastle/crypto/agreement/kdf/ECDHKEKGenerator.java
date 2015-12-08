// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.agreement.kdf;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.crypto.DerivationFunction;
import org.bouncycastle.crypto.DerivationParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.generators.KDF2BytesGenerator;
import org.bouncycastle.crypto.params.KDFParameters;

// Referenced classes of package org.bouncycastle.crypto.agreement.kdf:
//            DHKDFParameters

public class ECDHKEKGenerator
    implements DerivationFunction
{

    private DerivationFunction a;
    private DERObjectIdentifier b;
    private int c;
    private byte d[];

    public ECDHKEKGenerator(Digest digest)
    {
        a = new KDF2BytesGenerator(digest);
    }

    private byte[] integerToBytes(int i)
    {
        return (new byte[] {
            (byte)(i >> 24), (byte)(i >> 16), (byte)(i >> 8), (byte)i
        });
    }

    public int generateBytes(byte abyte0[], int i, int j)
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.a(new AlgorithmIdentifier(b, new DERNull()));
        asn1encodablevector.a(new DERTaggedObject(true, 2, new DEROctetString(integerToBytes(c))));
        a.init(new KDFParameters(d, (new DERSequence(asn1encodablevector)).b()));
        return a.generateBytes(abyte0, i, j);
    }

    public Digest getDigest()
    {
        return a.getDigest();
    }

    public void init(DerivationParameters derivationparameters)
    {
        derivationparameters = (DHKDFParameters)derivationparameters;
        b = derivationparameters.getAlgorithm();
        c = derivationparameters.getKeySize();
        d = derivationparameters.getZ();
    }
}
