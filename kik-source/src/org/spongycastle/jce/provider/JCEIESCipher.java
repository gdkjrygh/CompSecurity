// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jce.provider;

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
import javax.crypto.NoSuchPaddingException;
import javax.crypto.interfaces.DHPrivateKey;
import org.spongycastle.crypto.InvalidCipherTextException;
import org.spongycastle.crypto.agreement.DHBasicAgreement;
import org.spongycastle.crypto.agreement.ECDHBasicAgreement;
import org.spongycastle.crypto.digests.SHA1Digest;
import org.spongycastle.crypto.engines.IESEngine;
import org.spongycastle.crypto.generators.KDF2BytesGenerator;
import org.spongycastle.crypto.macs.HMac;
import org.spongycastle.crypto.params.IESParameters;
import org.spongycastle.jcajce.provider.asymmetric.ec.ECUtil;
import org.spongycastle.jce.interfaces.ECPrivateKey;
import org.spongycastle.jce.interfaces.ECPublicKey;
import org.spongycastle.jce.interfaces.IESKey;
import org.spongycastle.jce.spec.IESParameterSpec;

// Referenced classes of package org.spongycastle.jce.provider:
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


    private IESEngine a;
    private int b;
    private ByteArrayOutputStream c;
    private AlgorithmParameters d;
    private IESParameterSpec e;
    private Class f[] = {
        org/spongycastle/jce/spec/IESParameterSpec
    };

    public JCEIESCipher(IESEngine iesengine)
    {
        b = -1;
        c = new ByteArrayOutputStream();
        d = null;
        e = null;
        a = iesengine;
    }

    protected int engineDoFinal(byte abyte0[], int i, int j, byte abyte1[], int k)
    {
        if (j != 0)
        {
            c.write(abyte0, i, j);
        }
        try
        {
            abyte0 = c.toByteArray();
            c.reset();
            abyte0 = a.a(abyte0, abyte0.length);
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
    {
        if (j != 0)
        {
            c.write(abyte0, i, j);
        }
        try
        {
            abyte0 = c.toByteArray();
            c.reset();
            abyte0 = a.a(abyte0, abyte0.length);
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
            return ((ECPrivateKey)key.b()).c().bitLength();
        } else
        {
            throw new IllegalArgumentException("not an IE key!");
        }
    }

    protected int engineGetOutputSize(int i)
    {
        if (b == 1 || b == 3)
        {
            return c.size() + i + 20;
        }
        if (b == 2 || b == 4)
        {
            return (c.size() + i) - 20;
        } else
        {
            throw new IllegalStateException("cipher not initialised");
        }
    }

    protected AlgorithmParameters engineGetParameters()
    {
        if (d == null && e != null)
        {
            try
            {
                d = AlgorithmParameters.getInstance("IES", BouncyCastleProvider.a);
                d.init(e);
            }
            catch (Exception exception)
            {
                throw new RuntimeException(exception.toString());
            }
        }
        return d;
    }

    protected void engineInit(int i, Key key, AlgorithmParameters algorithmparameters, SecureRandom securerandom)
    {
        if (algorithmparameters == null) goto _L2; else goto _L1
_L1:
        int j = 0;
_L4:
        if (j == f.length)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        Object obj = algorithmparameters.getParameterSpec(f[j]);
_L5:
        Object obj1;
        obj1 = obj;
        if (obj == null)
        {
            throw new InvalidAlgorithmParameterException((new StringBuilder("can't handle parameter ")).append(algorithmparameters.toString()).toString());
        }
          goto _L3
        obj;
        j++;
          goto _L4
_L2:
        obj1 = null;
_L3:
        d = algorithmparameters;
        engineInit(i, key, ((AlgorithmParameterSpec) (obj1)), securerandom);
        return;
        obj = null;
          goto _L5
    }

    protected void engineInit(int i, Key key, SecureRandom securerandom)
    {
        if (i == 1 || i == 3)
        {
            try
            {
                engineInit(i, key, ((AlgorithmParameterSpec) (null)), securerandom);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Key key) { }
        }
        throw new IllegalArgumentException("can't handle null parameter spec in IES");
    }

    protected void engineInit(int i, Key key, AlgorithmParameterSpec algorithmparameterspec, SecureRandom securerandom)
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
        e = (IESParameterSpec)algorithmparameterspec;
        algorithmparameterspec = new IESParameters(e.a(), e.b(), e.c());
        b = i;
        c.reset();
        switch (i)
        {
        default:
            System.out.println("eeek!");
            return;

        case 1: // '\001'
        case 3: // '\003'
            a.a(true, securerandom, key, algorithmparameterspec);
            return;

        case 2: // '\002'
        case 4: // '\004'
            a.a(false, securerandom, key, algorithmparameterspec);
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

    protected int engineUpdate(byte abyte0[], int i, int j, byte abyte1[], int k)
    {
        c.write(abyte0, i, j);
        return 0;
    }

    protected byte[] engineUpdate(byte abyte0[], int i, int j)
    {
        c.write(abyte0, i, j);
        return null;
    }
}
