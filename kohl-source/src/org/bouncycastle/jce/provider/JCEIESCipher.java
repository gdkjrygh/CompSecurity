// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.math.BigInteger;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.BadPaddingException;
import javax.crypto.CipherSpi;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.interfaces.DHPrivateKey;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.agreement.DHBasicAgreement;
import org.bouncycastle.crypto.agreement.ECDHBasicAgreement;
import org.bouncycastle.crypto.digests.SHA1Digest;
import org.bouncycastle.crypto.engines.IESEngine;
import org.bouncycastle.crypto.generators.KDF2BytesGenerator;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.crypto.params.IESParameters;
import org.bouncycastle.jcajce.provider.asymmetric.ec.ECUtil;
import org.bouncycastle.jce.interfaces.ECPrivateKey;
import org.bouncycastle.jce.interfaces.ECPublicKey;
import org.bouncycastle.jce.interfaces.IESKey;
import org.bouncycastle.jce.spec.IESParameterSpec;

// Referenced classes of package org.bouncycastle.jce.provider:
//            BouncyCastleProvider, DHUtil, BrokenKDF2BytesGenerator

public class JCEIESCipher extends CipherSpi
{
    public static class BrokenECIES extends JCEIESCipher
    {

        public BrokenECIES()
        {
            super(new IESEngine(new ECDHBasicAgreement(), new BrokenKDF2BytesGenerator(new SHA1Digest()), new HMac(new SHA1Digest())));
        }
    }

    public static class BrokenIES extends JCEIESCipher
    {

        public BrokenIES()
        {
            super(new IESEngine(new DHBasicAgreement(), new BrokenKDF2BytesGenerator(new SHA1Digest()), new HMac(new SHA1Digest())));
        }
    }

    public static class ECIES extends JCEIESCipher
    {

        public ECIES()
        {
            super(new IESEngine(new ECDHBasicAgreement(), new KDF2BytesGenerator(new SHA1Digest()), new HMac(new SHA1Digest())));
        }
    }

    public static class IES extends JCEIESCipher
    {

        public IES()
        {
            super(new IESEngine(new DHBasicAgreement(), new KDF2BytesGenerator(new SHA1Digest()), new HMac(new SHA1Digest())));
        }
    }


    private Class availableSpecs[] = {
        org/bouncycastle/jce/spec/IESParameterSpec
    };
    private ByteArrayOutputStream buffer;
    private IESEngine cipher;
    private AlgorithmParameters engineParam;
    private IESParameterSpec engineParams;
    private int state;

    public JCEIESCipher(IESEngine iesengine)
    {
        state = -1;
        buffer = new ByteArrayOutputStream();
        engineParam = null;
        engineParams = null;
        cipher = iesengine;
    }

    protected int engineDoFinal(byte abyte0[], int i, int j, byte abyte1[], int k)
        throws IllegalBlockSizeException, BadPaddingException
    {
        if (j != 0)
        {
            buffer.write(abyte0, i, j);
        }
        try
        {
            abyte0 = buffer.toByteArray();
            buffer.reset();
            abyte0 = cipher.processBlock(abyte0, 0, abyte0.length);
            System.arraycopy(abyte0, 0, abyte1, k, abyte0.length);
            i = abyte0.length;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new BadPaddingException(abyte0.getMessage());
        }
        return i;
    }

    protected byte[] engineDoFinal(byte abyte0[], int i, int j)
        throws IllegalBlockSizeException, BadPaddingException
    {
        if (j != 0)
        {
            buffer.write(abyte0, i, j);
        }
        try
        {
            abyte0 = buffer.toByteArray();
            buffer.reset();
            abyte0 = cipher.processBlock(abyte0, 0, abyte0.length);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new BadPaddingException(abyte0.getMessage());
        }
        return abyte0;
    }

    protected int engineGetBlockSize()
    {
        return 0;
    }

    protected byte[] engineGetIV()
    {
        return null;
    }

    protected int engineGetKeySize(Key key)
    {
        if (!(key instanceof IESKey))
        {
            throw new IllegalArgumentException("must be passed IE key");
        }
        key = (IESKey)key;
        if (key.getPrivate() instanceof DHPrivateKey)
        {
            return ((DHPrivateKey)key.getPrivate()).getX().bitLength();
        }
        if (key.getPrivate() instanceof ECPrivateKey)
        {
            return ((ECPrivateKey)key.getPrivate()).getD().bitLength();
        } else
        {
            throw new IllegalArgumentException("not an IE key!");
        }
    }

    protected int engineGetOutputSize(int i)
    {
        if (state == 1 || state == 3)
        {
            return buffer.size() + i + 20;
        }
        if (state == 2 || state == 4)
        {
            return (buffer.size() + i) - 20;
        } else
        {
            throw new IllegalStateException("cipher not initialised");
        }
    }

    protected AlgorithmParameters engineGetParameters()
    {
        if (engineParam == null && engineParams != null)
        {
            try
            {
                engineParam = AlgorithmParameters.getInstance("IES", BouncyCastleProvider.PROVIDER_NAME);
                engineParam.init(engineParams);
            }
            catch (Exception exception)
            {
                throw new RuntimeException(exception.toString());
            }
        }
        return engineParam;
    }

    protected void engineInit(int i, Key key, AlgorithmParameters algorithmparameters, SecureRandom securerandom)
        throws InvalidKeyException, InvalidAlgorithmParameterException
    {
        if (algorithmparameters == null) goto _L2; else goto _L1
_L1:
        int j = 0;
_L4:
        if (j == availableSpecs.length)
        {
            break MISSING_BLOCK_LABEL_99;
        }
        Object obj = algorithmparameters.getParameterSpec(availableSpecs[j]);
_L5:
        Object obj1;
        obj1 = obj;
        if (obj == null)
        {
            throw new InvalidAlgorithmParameterException((new StringBuilder()).append("can't handle parameter ").append(algorithmparameters.toString()).toString());
        }
          goto _L3
        obj;
        j++;
          goto _L4
_L2:
        obj1 = null;
_L3:
        engineParam = algorithmparameters;
        engineInit(i, key, ((AlgorithmParameterSpec) (obj1)), securerandom);
        return;
        obj = null;
          goto _L5
    }

    protected void engineInit(int i, Key key, SecureRandom securerandom)
        throws InvalidKeyException
    {
        if (i == 1 || i == 3)
        {
            try
            {
                engineInit(i, key, (AlgorithmParameterSpec)null, securerandom);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Key key) { }
        }
        throw new IllegalArgumentException("can't handle null parameter spec in IES");
    }

    protected void engineInit(int i, Key key, AlgorithmParameterSpec algorithmparameterspec, SecureRandom securerandom)
        throws InvalidKeyException, InvalidAlgorithmParameterException
    {
        if (!(key instanceof IESKey))
        {
            throw new InvalidKeyException("must be passed IES key");
        }
        if (algorithmparameterspec == null && (i == 1 || i == 3))
        {
            byte abyte0[] = new byte[16];
            byte abyte1[] = new byte[16];
            algorithmparameterspec = securerandom;
            if (securerandom == null)
            {
                algorithmparameterspec = new SecureRandom();
            }
            algorithmparameterspec.nextBytes(abyte0);
            algorithmparameterspec.nextBytes(abyte1);
            algorithmparameterspec = new IESParameterSpec(abyte0, abyte1, 128);
        } else
        if (!(algorithmparameterspec instanceof IESParameterSpec))
        {
            throw new InvalidAlgorithmParameterException("must be passed IES parameters");
        }
        key = (IESKey)key;
        if (key.getPublic() instanceof ECPublicKey)
        {
            securerandom = ECUtil.generatePublicKeyParameter(key.getPublic());
            key = ECUtil.generatePrivateKeyParameter(key.getPrivate());
        } else
        {
            securerandom = DHUtil.generatePublicKeyParameter(key.getPublic());
            key = DHUtil.generatePrivateKeyParameter(key.getPrivate());
        }
        engineParams = (IESParameterSpec)algorithmparameterspec;
        algorithmparameterspec = new IESParameters(engineParams.getDerivationV(), engineParams.getEncodingV(), engineParams.getMacKeySize());
        state = i;
        buffer.reset();
        switch (i)
        {
        default:
            System.out.println("eeek!");
            return;

        case 1: // '\001'
        case 3: // '\003'
            cipher.init(true, key, securerandom, algorithmparameterspec);
            return;

        case 2: // '\002'
        case 4: // '\004'
            cipher.init(false, key, securerandom, algorithmparameterspec);
            break;
        }
    }

    protected void engineSetMode(String s)
    {
        throw new IllegalArgumentException((new StringBuilder()).append("can't support mode ").append(s).toString());
    }

    protected void engineSetPadding(String s)
        throws NoSuchPaddingException
    {
        throw new NoSuchPaddingException((new StringBuilder()).append(s).append(" unavailable with RSA.").toString());
    }

    protected int engineUpdate(byte abyte0[], int i, int j, byte abyte1[], int k)
    {
        buffer.write(abyte0, i, j);
        return 0;
    }

    protected byte[] engineUpdate(byte abyte0[], int i, int j)
    {
        buffer.write(abyte0, i, j);
        return null;
    }
}
