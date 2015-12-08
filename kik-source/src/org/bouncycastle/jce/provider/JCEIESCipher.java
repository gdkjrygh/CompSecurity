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
import org.bouncycastle.jce.interfaces.ECPrivateKey;
import org.bouncycastle.jce.interfaces.ECPublicKey;
import org.bouncycastle.jce.interfaces.IESKey;
import org.bouncycastle.jce.provider.asymmetric.ec.ECUtil;
import org.bouncycastle.jce.spec.IESParameterSpec;

// Referenced classes of package org.bouncycastle.jce.provider:
//            WrapCipherSpi, BouncyCastleProvider, DHUtil, BrokenKDF2BytesGenerator

public class JCEIESCipher extends WrapCipherSpi
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


    private IESEngine e;
    private int f;
    private ByteArrayOutputStream g;
    private AlgorithmParameters h;
    private IESParameterSpec i;
    private Class j[] = {
        org/bouncycastle/jce/spec/IESParameterSpec
    };

    public JCEIESCipher(IESEngine iesengine)
    {
        f = -1;
        g = new ByteArrayOutputStream();
        h = null;
        i = null;
        e = iesengine;
    }

    protected int engineDoFinal(byte abyte0[], int k, int l, byte abyte1[], int i1)
    {
        if (l != 0)
        {
            g.write(abyte0, k, l);
        }
        try
        {
            abyte0 = g.toByteArray();
            g.reset();
            abyte0 = e.processBlock(abyte0, 0, abyte0.length);
            System.arraycopy(abyte0, 0, abyte1, i1, abyte0.length);
            k = abyte0.length;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new BadPaddingException(abyte0.getMessage());
        }
        return k;
    }

    protected byte[] engineDoFinal(byte abyte0[], int k, int l)
    {
        if (l != 0)
        {
            g.write(abyte0, k, l);
        }
        try
        {
            abyte0 = g.toByteArray();
            g.reset();
            abyte0 = e.processBlock(abyte0, 0, abyte0.length);
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
        if (key.b() instanceof DHPrivateKey)
        {
            return ((DHPrivateKey)key.b()).getX().bitLength();
        }
        if (key.b() instanceof ECPrivateKey)
        {
            return ((ECPrivateKey)key.b()).b().bitLength();
        } else
        {
            throw new IllegalArgumentException("not an IE key!");
        }
    }

    protected int engineGetOutputSize(int k)
    {
        if (f == 1 || f == 3)
        {
            return g.size() + k + 20;
        }
        if (f == 2 || f == 4)
        {
            return (g.size() + k) - 20;
        } else
        {
            throw new IllegalStateException("cipher not initialised");
        }
    }

    protected AlgorithmParameters engineGetParameters()
    {
        if (h == null && i != null)
        {
            try
            {
                h = AlgorithmParameters.getInstance("IES", BouncyCastleProvider.a);
                h.init(i);
            }
            catch (Exception exception)
            {
                throw new RuntimeException(exception.toString());
            }
        }
        return h;
    }

    protected void engineInit(int k, Key key, AlgorithmParameters algorithmparameters, SecureRandom securerandom)
    {
        if (algorithmparameters == null) goto _L2; else goto _L1
_L1:
        int l = 0;
_L4:
        if (l == j.length)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        Object obj = algorithmparameters.getParameterSpec(j[l]);
_L5:
        Object obj1;
        obj1 = obj;
        if (obj == null)
        {
            throw new InvalidAlgorithmParameterException((new StringBuilder("can't handle parameter ")).append(algorithmparameters.toString()).toString());
        }
          goto _L3
        obj;
        l++;
          goto _L4
_L2:
        obj1 = null;
_L3:
        h = algorithmparameters;
        engineInit(k, key, ((AlgorithmParameterSpec) (obj1)), securerandom);
        return;
        obj = null;
          goto _L5
    }

    protected void engineInit(int k, Key key, SecureRandom securerandom)
    {
        if (k == 1 || k == 3)
        {
            try
            {
                engineInit(k, key, ((AlgorithmParameterSpec) (null)), securerandom);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Key key) { }
        }
        throw new IllegalArgumentException("can't handle null parameter spec in IES");
    }

    protected void engineInit(int k, Key key, AlgorithmParameterSpec algorithmparameterspec, SecureRandom securerandom)
    {
        if (!(key instanceof IESKey))
        {
            throw new InvalidKeyException("must be passed IES key");
        }
        if (algorithmparameterspec == null && (k == 1 || k == 3))
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
        securerandom = (IESKey)key;
        if (securerandom.a() instanceof ECPublicKey)
        {
            key = ECUtil.a(securerandom.a());
            securerandom = ECUtil.a(securerandom.b());
        } else
        {
            key = DHUtil.a(securerandom.a());
            securerandom = DHUtil.a(securerandom.b());
        }
        i = (IESParameterSpec)algorithmparameterspec;
        algorithmparameterspec = new IESParameters(i.a(), i.b(), i.c());
        f = k;
        g.reset();
        switch (k)
        {
        default:
            System.out.println("eeek!");
            return;

        case 1: // '\001'
        case 3: // '\003'
            e.init(true, securerandom, key, algorithmparameterspec);
            return;

        case 2: // '\002'
        case 4: // '\004'
            e.init(false, securerandom, key, algorithmparameterspec);
            break;
        }
    }

    protected void engineSetMode(String s)
    {
        throw new IllegalArgumentException((new StringBuilder("can't support mode ")).append(s).toString());
    }

    protected void engineSetPadding(String s)
    {
        throw new NoSuchPaddingException((new StringBuilder()).append(s).append(" unavailable with RSA.").toString());
    }

    protected int engineUpdate(byte abyte0[], int k, int l, byte abyte1[], int i1)
    {
        g.write(abyte0, k, l);
        return 0;
    }

    protected byte[] engineUpdate(byte abyte0[], int k, int l)
    {
        g.write(abyte0, k, l);
        return null;
    }
}
