// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.signers;

import org.bouncycastle.crypto.AsymmetricBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.Signer;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.util.Arrays;

public class GenericSigner
    implements Signer
{

    private final Digest digest;
    private final AsymmetricBlockCipher engine;
    private boolean forSigning;

    public GenericSigner(AsymmetricBlockCipher asymmetricblockcipher, Digest digest1)
    {
        engine = asymmetricblockcipher;
        digest = digest1;
    }

    public byte[] generateSignature()
        throws CryptoException, DataLengthException
    {
        if (!forSigning)
        {
            throw new IllegalStateException("GenericSigner not initialised for signature generation.");
        } else
        {
            byte abyte0[] = new byte[digest.getDigestSize()];
            digest.doFinal(abyte0, 0);
            return engine.processBlock(abyte0, 0, abyte0.length);
        }
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
            engine.init(flag, cipherparameters);
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
        if (forSigning)
        {
            throw new IllegalStateException("GenericSigner not initialised for verification");
        }
        byte abyte1[] = new byte[digest.getDigestSize()];
        digest.doFinal(abyte1, 0);
        boolean flag;
        try
        {
            flag = Arrays.constantTimeAreEqual(engine.processBlock(abyte0, 0, abyte0.length), abyte1);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            return false;
        }
        return flag;
    }
}
