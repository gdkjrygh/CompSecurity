// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.signers;

import java.util.Hashtable;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.DigestInfo;
import org.bouncycastle.asn1.x509.X509ObjectIdentifiers;
import org.bouncycastle.crypto.AsymmetricBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.Signer;
import org.bouncycastle.crypto.encodings.PKCS1Encoding;
import org.bouncycastle.crypto.engines.RSABlindedEngine;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.ParametersWithRandom;

public class RSADigestSigner
    implements Signer
{

    private static final Hashtable e;
    private final AsymmetricBlockCipher a = new PKCS1Encoding(new RSABlindedEngine());
    private final AlgorithmIdentifier b;
    private final Digest c;
    private boolean d;

    public RSADigestSigner(Digest digest)
    {
        c = digest;
        b = new AlgorithmIdentifier((DERObjectIdentifier)e.get(digest.getAlgorithmName()), DERNull.b);
    }

    private byte[] derEncode(byte abyte0[])
    {
        return (new DigestInfo(b, abyte0)).b();
    }

    public byte[] generateSignature()
    {
        if (!d)
        {
            throw new IllegalStateException("RSADigestSigner not initialised for signature generation.");
        } else
        {
            byte abyte0[] = new byte[c.getDigestSize()];
            c.doFinal(abyte0, 0);
            abyte0 = derEncode(abyte0);
            return a.processBlock(abyte0, 0, abyte0.length);
        }
    }

    public String getAlgorithmName()
    {
        return (new StringBuilder()).append(c.getAlgorithmName()).append("withRSA").toString();
    }

    public void init(boolean flag, CipherParameters cipherparameters)
    {
        d = flag;
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
            a.init(flag, cipherparameters);
            return;
        }
    }

    public void reset()
    {
        c.reset();
    }

    public void update(byte byte0)
    {
        c.update(byte0);
    }

    public void update(byte abyte0[], int i, int j)
    {
        c.update(abyte0, i, j);
    }

    public boolean verifySignature(byte abyte0[])
    {
        if (d)
        {
            throw new IllegalStateException("RSADigestSigner not initialised for verification");
        }
        byte abyte1[] = new byte[c.getDigestSize()];
        c.doFinal(abyte1, 0);
        byte abyte2[];
        int i;
        int j;
        int k;
        int l;
        try
        {
            abyte0 = a.processBlock(abyte0, 0, abyte0.length);
            abyte2 = derEncode(abyte1);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            return false;
        }
        if (abyte0.length != abyte2.length) goto _L2; else goto _L1
_L1:
        i = 0;
_L8:
        if (i >= abyte0.length) goto _L4; else goto _L3
_L3:
        if (abyte0[i] == abyte2[i]) goto _L6; else goto _L5
_L5:
        return false;
_L6:
        i++;
        continue; /* Loop/switch isn't completed */
_L2:
        if (abyte0.length != abyte2.length - 2)
        {
            continue; /* Loop/switch isn't completed */
        }
        j = abyte0.length - abyte1.length - 2;
        k = abyte2.length;
        l = abyte1.length;
        abyte2[1] = (byte)(abyte2[1] - 2);
        abyte2[3] = (byte)(abyte2[3] - 2);
        for (i = 0; i < abyte1.length; i++)
        {
            if (abyte0[j + i] != abyte2[(k - l - 2) + i])
            {
                continue; /* Loop/switch isn't completed */
            }
        }

        i = 0;
        do
        {
            if (i >= j)
            {
                break; /* Loop/switch isn't completed */
            }
            if (abyte0[i] != abyte2[i])
            {
                continue; /* Loop/switch isn't completed */
            }
            i++;
        } while (true);
        if (true) goto _L5; else goto _L4
_L4:
        return true;
        if (true) goto _L8; else goto _L7
_L7:
    }

    static 
    {
        Hashtable hashtable = new Hashtable();
        e = hashtable;
        hashtable.put("RIPEMD128", TeleTrusTObjectIdentifiers.c);
        e.put("RIPEMD160", TeleTrusTObjectIdentifiers.b);
        e.put("RIPEMD256", TeleTrusTObjectIdentifiers.d);
        e.put("SHA-1", X509ObjectIdentifiers.i);
        e.put("SHA-224", NISTObjectIdentifiers.e);
        e.put("SHA-256", NISTObjectIdentifiers.b);
        e.put("SHA-384", NISTObjectIdentifiers.c);
        e.put("SHA-512", NISTObjectIdentifiers.d);
        e.put("MD2", PKCSObjectIdentifiers.E);
        e.put("MD4", PKCSObjectIdentifiers.F);
        e.put("MD5", PKCSObjectIdentifiers.G);
    }
}
