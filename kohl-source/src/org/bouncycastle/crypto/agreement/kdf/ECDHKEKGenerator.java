// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.agreement.kdf;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.crypto.DataLengthException;
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

    private ASN1ObjectIdentifier algorithm;
    private DerivationFunction kdf;
    private int keySize;
    private byte z[];

    public ECDHKEKGenerator(Digest digest)
    {
        kdf = new KDF2BytesGenerator(digest);
    }

    private byte[] integerToBytes(int i)
    {
        return (new byte[] {
            (byte)(i >> 24), (byte)(i >> 16), (byte)(i >> 8), (byte)i
        });
    }

    public int generateBytes(byte abyte0[], int i, int j)
        throws DataLengthException, IllegalArgumentException
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(new AlgorithmIdentifier(algorithm, new DERNull()));
        asn1encodablevector.add(new DERTaggedObject(true, 2, new DEROctetString(integerToBytes(keySize))));
        try
        {
            kdf.init(new KDFParameters(z, (new DERSequence(asn1encodablevector)).getEncoded("DER")));
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new IllegalArgumentException((new StringBuilder()).append("unable to initialise kdf: ").append(abyte0.getMessage()).toString());
        }
        return kdf.generateBytes(abyte0, i, j);
    }

    public Digest getDigest()
    {
        return kdf.getDigest();
    }

    public void init(DerivationParameters derivationparameters)
    {
        derivationparameters = (DHKDFParameters)derivationparameters;
        algorithm = derivationparameters.getAlgorithm();
        keySize = derivationparameters.getKeySize();
        z = derivationparameters.getZ();
    }
}
