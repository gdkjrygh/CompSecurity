// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.asymmetric.elgamal;

import java.math.BigInteger;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.MGF1ParameterSpec;
import javax.crypto.BadPaddingException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.interfaces.DHKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.OAEPParameterSpec;
import org.spongycastle.crypto.AsymmetricBlockCipher;
import org.spongycastle.crypto.BufferedAsymmetricBlockCipher;
import org.spongycastle.crypto.InvalidCipherTextException;
import org.spongycastle.crypto.encodings.ISO9796d1Encoding;
import org.spongycastle.crypto.encodings.OAEPEncoding;
import org.spongycastle.crypto.encodings.PKCS1Encoding;
import org.spongycastle.crypto.engines.ElGamalEngine;
import org.spongycastle.crypto.params.ParametersWithRandom;
import org.spongycastle.jcajce.provider.asymmetric.util.BaseCipherSpi;
import org.spongycastle.jcajce.provider.util.DigestFactory;
import org.spongycastle.jce.interfaces.ElGamalKey;
import org.spongycastle.jce.interfaces.ElGamalPrivateKey;
import org.spongycastle.jce.interfaces.ElGamalPublicKey;
import org.spongycastle.jce.provider.BouncyCastleProvider;
import org.spongycastle.jce.provider.ElGamalUtil;
import org.spongycastle.jce.spec.ElGamalParameterSpec;
import org.spongycastle.util.Strings;

public class CipherSpi extends BaseCipherSpi
{
    public static class NoPadding extends CipherSpi
    {

        public NoPadding()
        {
            super(new ElGamalEngine());
        }
    }

    public static class PKCS1v1_5Padding extends CipherSpi
    {

        public PKCS1v1_5Padding()
        {
            super(new PKCS1Encoding(new ElGamalEngine()));
        }
    }


    private BufferedAsymmetricBlockCipher c;
    private AlgorithmParameterSpec d;
    private AlgorithmParameters e;

    public CipherSpi(AsymmetricBlockCipher asymmetricblockcipher)
    {
        c = new BufferedAsymmetricBlockCipher(asymmetricblockcipher);
    }

    private void a(OAEPParameterSpec oaepparameterspec)
    {
        MGF1ParameterSpec mgf1parameterspec = (MGF1ParameterSpec)oaepparameterspec.getMGFParameters();
        org.spongycastle.crypto.Digest digest = DigestFactory.a(mgf1parameterspec.getDigestAlgorithm());
        if (digest == null)
        {
            throw new NoSuchPaddingException((new StringBuilder("no match on OAEP constructor for digest algorithm: ")).append(mgf1parameterspec.getDigestAlgorithm()).toString());
        } else
        {
            c = new BufferedAsymmetricBlockCipher(new OAEPEncoding(new ElGamalEngine(), digest, ((javax.crypto.spec.PSource.PSpecified)oaepparameterspec.getPSource()).getValue()));
            d = oaepparameterspec;
            return;
        }
    }

    protected int engineDoFinal(byte abyte0[], int i, int j, byte abyte1[], int k)
    {
        c.a(abyte0, i, j);
        try
        {
            abyte0 = c.c();
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new BadPaddingException(abyte0.getMessage());
        }
        for (i = 0; i != abyte0.length; i++)
        {
            abyte1[k + i] = abyte0[i];
        }

        return abyte0.length;
    }

    protected byte[] engineDoFinal(byte abyte0[], int i, int j)
    {
        c.a(abyte0, i, j);
        try
        {
            abyte0 = c.c();
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
        return c.a();
    }

    protected int engineGetKeySize(Key key)
    {
        if (key instanceof ElGamalKey)
        {
            return ((ElGamalKey)key).b().a().bitLength();
        }
        if (key instanceof DHKey)
        {
            return ((DHKey)key).getParams().getP().bitLength();
        } else
        {
            throw new IllegalArgumentException("not an ElGamal key!");
        }
    }

    protected int engineGetOutputSize(int i)
    {
        return c.b();
    }

    protected AlgorithmParameters engineGetParameters()
    {
        if (e == null && d != null)
        {
            try
            {
                e = AlgorithmParameters.getInstance("OAEP", BouncyCastleProvider.a);
                e.init(d);
            }
            catch (Exception exception)
            {
                throw new RuntimeException(exception.toString());
            }
        }
        return e;
    }

    protected void engineInit(int i, Key key, AlgorithmParameters algorithmparameters, SecureRandom securerandom)
    {
        throw new InvalidAlgorithmParameterException("can't handle parameters in ElGamal");
    }

    protected void engineInit(int i, Key key, SecureRandom securerandom)
    {
        engineInit(i, key, ((AlgorithmParameterSpec) (null)), securerandom);
    }

    protected void engineInit(int i, Key key, AlgorithmParameterSpec algorithmparameterspec, SecureRandom securerandom)
    {
        if (algorithmparameterspec == null)
        {
            if (key instanceof ElGamalPublicKey)
            {
                key = ElGamalUtil.a((PublicKey)key);
            } else
            if (key instanceof ElGamalPrivateKey)
            {
                key = ElGamalUtil.a((PrivateKey)key);
            } else
            {
                throw new InvalidKeyException("unknown key type passed to ElGamal");
            }
            if (securerandom != null)
            {
                key = new ParametersWithRandom(key, securerandom);
            }
            switch (i)
            {
            default:
                throw new InvalidParameterException((new StringBuilder("unknown opmode ")).append(i).append(" passed to ElGamal").toString());

            case 1: // '\001'
            case 3: // '\003'
                c.a(true, key);
                return;

            case 2: // '\002'
            case 4: // '\004'
                c.a(false, key);
                break;
            }
        } else
        {
            throw new IllegalArgumentException("unknown parameter type.");
        }
    }

    protected void engineSetMode(String s)
    {
        String s1 = Strings.b(s);
        if (s1.equals("NONE") || s1.equals("ECB"))
        {
            return;
        } else
        {
            throw new NoSuchAlgorithmException((new StringBuilder("can't support mode ")).append(s).toString());
        }
    }

    protected void engineSetPadding(String s)
    {
        String s1 = Strings.b(s);
        if (s1.equals("NOPADDING"))
        {
            c = new BufferedAsymmetricBlockCipher(new ElGamalEngine());
            return;
        }
        if (s1.equals("PKCS1PADDING"))
        {
            c = new BufferedAsymmetricBlockCipher(new PKCS1Encoding(new ElGamalEngine()));
            return;
        }
        if (s1.equals("ISO9796-1PADDING"))
        {
            c = new BufferedAsymmetricBlockCipher(new ISO9796d1Encoding(new ElGamalEngine()));
            return;
        }
        if (s1.equals("OAEPPADDING"))
        {
            a(OAEPParameterSpec.DEFAULT);
            return;
        }
        if (s1.equals("OAEPWITHMD5ANDMGF1PADDING"))
        {
            a(new OAEPParameterSpec("MD5", "MGF1", new MGF1ParameterSpec("MD5"), javax.crypto.spec.PSource.PSpecified.DEFAULT));
            return;
        }
        if (s1.equals("OAEPWITHSHA1ANDMGF1PADDING"))
        {
            a(OAEPParameterSpec.DEFAULT);
            return;
        }
        if (s1.equals("OAEPWITHSHA224ANDMGF1PADDING"))
        {
            a(new OAEPParameterSpec("SHA-224", "MGF1", new MGF1ParameterSpec("SHA-224"), javax.crypto.spec.PSource.PSpecified.DEFAULT));
            return;
        }
        if (s1.equals("OAEPWITHSHA256ANDMGF1PADDING"))
        {
            a(new OAEPParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, javax.crypto.spec.PSource.PSpecified.DEFAULT));
            return;
        }
        if (s1.equals("OAEPWITHSHA384ANDMGF1PADDING"))
        {
            a(new OAEPParameterSpec("SHA-384", "MGF1", MGF1ParameterSpec.SHA384, javax.crypto.spec.PSource.PSpecified.DEFAULT));
            return;
        }
        if (s1.equals("OAEPWITHSHA512ANDMGF1PADDING"))
        {
            a(new OAEPParameterSpec("SHA-512", "MGF1", MGF1ParameterSpec.SHA512, javax.crypto.spec.PSource.PSpecified.DEFAULT));
            return;
        } else
        {
            throw new NoSuchPaddingException((new StringBuilder()).append(s).append(" unavailable with ElGamal.").toString());
        }
    }

    protected int engineUpdate(byte abyte0[], int i, int j, byte abyte1[], int k)
    {
        c.a(abyte0, i, j);
        return 0;
    }

    protected byte[] engineUpdate(byte abyte0[], int i, int j)
    {
        c.a(abyte0, i, j);
        return null;
    }
}
