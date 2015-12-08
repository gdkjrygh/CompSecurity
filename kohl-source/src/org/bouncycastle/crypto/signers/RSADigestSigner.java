// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.signers;

import java.io.IOException;
import java.util.Hashtable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.DigestInfo;
import org.bouncycastle.asn1.x509.X509ObjectIdentifiers;
import org.bouncycastle.crypto.AsymmetricBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.Signer;
import org.bouncycastle.crypto.encodings.PKCS1Encoding;
import org.bouncycastle.crypto.engines.RSABlindedEngine;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.util.Arrays;

public class RSADigestSigner
    implements Signer
{

    private static final Hashtable oidMap;
    private final AlgorithmIdentifier algId;
    private final Digest digest;
    private boolean forSigning;
    private final AsymmetricBlockCipher rsaEngine = new PKCS1Encoding(new RSABlindedEngine());

    public RSADigestSigner(Digest digest1)
    {
        digest = digest1;
        algId = new AlgorithmIdentifier((ASN1ObjectIdentifier)oidMap.get(digest1.getAlgorithmName()), DERNull.INSTANCE);
    }

    private byte[] derEncode(byte abyte0[])
        throws IOException
    {
        return (new DigestInfo(algId, abyte0)).getEncoded("DER");
    }

    public byte[] generateSignature()
        throws CryptoException, DataLengthException
    {
        if (!forSigning)
        {
            throw new IllegalStateException("RSADigestSigner not initialised for signature generation.");
        }
        byte abyte0[] = new byte[digest.getDigestSize()];
        digest.doFinal(abyte0, 0);
        try
        {
            abyte0 = derEncode(abyte0);
            abyte0 = rsaEngine.processBlock(abyte0, 0, abyte0.length);
        }
        catch (IOException ioexception)
        {
            throw new CryptoException((new StringBuilder()).append("unable to encode signature: ").append(ioexception.getMessage()).toString(), ioexception);
        }
        return abyte0;
    }

    public String getAlgorithmName()
    {
        return (new StringBuilder()).append(digest.getAlgorithmName()).append("withRSA").toString();
    }

    public void init(boolean flag, CipherParameters cipherparameters)
    {
        forSigning = flag;
        AsymmetricKeyParameter asymmetrickeyparameter;
        if (cipherparameters instanceof ParametersWithRandom)
        {
            asymmetrickeyparameter = (AsymmetricKeyParameter)((ParametersWithRandom)cipherparameters).getParameters();
        } else
        {
            asymmetrickeyparameter = (AsymmetricKeyParameter)cipherparameters;
        }
        if (flag && !asymmetrickeyparameter.isPrivate())
        {
            throw new IllegalArgumentException("signing requires private key");
        }
        if (!flag && asymmetrickeyparameter.isPrivate())
        {
            throw new IllegalArgumentException("verification requires public key");
        } else
        {
            reset();
            rsaEngine.init(flag, cipherparameters);
            return;
        }
    }

    public void reset()
    {
        digest.reset();
    }

    public void update(byte byte0)
    {
        digest.update(byte0);
    }

    public void update(byte abyte0[], int i, int j)
    {
        digest.update(abyte0, i, j);
    }

    public boolean verifySignature(byte abyte0[])
    {
        boolean flag1 = false;
        if (forSigning)
        {
            throw new IllegalStateException("RSADigestSigner not initialised for verification");
        }
        byte abyte1[] = new byte[digest.getDigestSize()];
        digest.doFinal(abyte1, 0);
        byte abyte2[];
        boolean flag;
        try
        {
            abyte0 = rsaEngine.processBlock(abyte0, 0, abyte0.length);
            abyte2 = derEncode(abyte1);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            return false;
        }
        if (abyte0.length == abyte2.length)
        {
            flag = Arrays.constantTimeAreEqual(abyte0, abyte2);
        } else
        {
            flag = flag1;
            if (abyte0.length == abyte2.length - 2)
            {
                int i1 = abyte0.length - abyte1.length - 2;
                int l = abyte2.length;
                int j1 = abyte1.length;
                abyte2[1] = (byte)(abyte2[1] - 2);
                abyte2[3] = (byte)(abyte2[3] - 2);
                int k = 0;
                int i = 0;
                for (; k < abyte1.length; k++)
                {
                    i |= abyte0[i1 + k] ^ abyte2[(l - j1 - 2) + k];
                }

                l = 0;
                k = i;
                for (int j = l; j < i1; j++)
                {
                    k |= abyte0[j] ^ abyte2[j];
                }

                flag = flag1;
                if (k == 0)
                {
                    return true;
                }
            }
        }
        return flag;
    }

    static 
    {
        oidMap = new Hashtable();
        oidMap.put("RIPEMD128", TeleTrusTObjectIdentifiers.ripemd128);
        oidMap.put("RIPEMD160", TeleTrusTObjectIdentifiers.ripemd160);
        oidMap.put("RIPEMD256", TeleTrusTObjectIdentifiers.ripemd256);
        oidMap.put("SHA-1", X509ObjectIdentifiers.id_SHA1);
        oidMap.put("SHA-224", NISTObjectIdentifiers.id_sha224);
        oidMap.put("SHA-256", NISTObjectIdentifiers.id_sha256);
        oidMap.put("SHA-384", NISTObjectIdentifiers.id_sha384);
        oidMap.put("SHA-512", NISTObjectIdentifiers.id_sha512);
        oidMap.put("MD2", PKCSObjectIdentifiers.md2);
        oidMap.put("MD4", PKCSObjectIdentifiers.md4);
        oidMap.put("MD5", PKCSObjectIdentifiers.md5);
    }
}
