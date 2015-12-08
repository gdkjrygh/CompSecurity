// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.agreement.kdf;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.DerivationFunction;
import org.bouncycastle.crypto.DerivationParameters;
import org.bouncycastle.crypto.Digest;

// Referenced classes of package org.bouncycastle.crypto.agreement.kdf:
//            DHKDFParameters

public class DHKEKGenerator
    implements DerivationFunction
{

    private DERObjectIdentifier algorithm;
    private final Digest digest;
    private int keySize;
    private byte partyAInfo[];
    private byte z[];

    public DHKEKGenerator(Digest digest1)
    {
        digest = digest1;
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
        if (abyte0.length - j < i)
        {
            throw new DataLengthException("output buffer too small");
        }
        long l1 = j;
        int i1 = digest.getDigestSize();
        if (l1 > 0x1ffffffffL)
        {
            throw new IllegalArgumentException("Output length too large");
        }
        int j1 = (int)(((l1 + (long)i1) - 1L) / (long)i1);
        byte abyte1[] = new byte[digest.getDigestSize()];
        boolean flag = false;
        boolean flag1 = true;
        int k = j;
        int l = i;
        j = ((flag1) ? 1 : 0);
        i = ((flag) ? 1 : 0);
        while (i < j1) 
        {
            digest.update(z, 0, z.length);
            ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
            ASN1EncodableVector asn1encodablevector1 = new ASN1EncodableVector();
            asn1encodablevector1.add(algorithm);
            asn1encodablevector1.add(new DEROctetString(integerToBytes(j)));
            asn1encodablevector.add(new DERSequence(asn1encodablevector1));
            if (partyAInfo != null)
            {
                asn1encodablevector.add(new DERTaggedObject(true, 0, new DEROctetString(partyAInfo)));
            }
            asn1encodablevector.add(new DERTaggedObject(true, 2, new DEROctetString(integerToBytes(keySize))));
            try
            {
                byte abyte2[] = (new DERSequence(asn1encodablevector)).getEncoded("DER");
                digest.update(abyte2, 0, abyte2.length);
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                throw new IllegalArgumentException((new StringBuilder()).append("unable to encode parameter info: ").append(abyte0.getMessage()).toString());
            }
            digest.doFinal(abyte1, 0);
            if (k > i1)
            {
                System.arraycopy(abyte1, 0, abyte0, l, i1);
                l += i1;
                k -= i1;
            } else
            {
                System.arraycopy(abyte1, 0, abyte0, l, k);
            }
            j++;
            i++;
        }
        digest.reset();
        return k;
    }

    public Digest getDigest()
    {
        return digest;
    }

    public void init(DerivationParameters derivationparameters)
    {
        derivationparameters = (DHKDFParameters)derivationparameters;
        algorithm = derivationparameters.getAlgorithm();
        keySize = derivationparameters.getKeySize();
        z = derivationparameters.getZ();
        partyAInfo = derivationparameters.getExtraInfo();
    }
}
