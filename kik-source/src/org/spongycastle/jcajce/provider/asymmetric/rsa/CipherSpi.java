// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.asymmetric.rsa;

import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import java.security.spec.MGF1ParameterSpec;
import javax.crypto.BadPaddingException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.OAEPParameterSpec;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.spongycastle.crypto.AsymmetricBlockCipher;
import org.spongycastle.crypto.InvalidCipherTextException;
import org.spongycastle.crypto.encodings.ISO9796d1Encoding;
import org.spongycastle.crypto.encodings.OAEPEncoding;
import org.spongycastle.crypto.encodings.PKCS1Encoding;
import org.spongycastle.crypto.engines.RSABlindedEngine;
import org.spongycastle.crypto.params.ParametersWithRandom;
import org.spongycastle.jcajce.provider.asymmetric.util.BaseCipherSpi;
import org.spongycastle.jcajce.provider.util.DigestFactory;
import org.spongycastle.jce.provider.BouncyCastleProvider;
import org.spongycastle.util.Strings;

// Referenced classes of package org.spongycastle.jcajce.provider.asymmetric.rsa:
//            RSAUtil

public class CipherSpi extends BaseCipherSpi
{
    public static class ISO9796d1Padding extends CipherSpi
    {

        public ISO9796d1Padding()
        {
            super(new ISO9796d1Encoding(new RSABlindedEngine()));
        }
    }

    public static class NoPadding extends CipherSpi
    {

        public NoPadding()
        {
            super(new RSABlindedEngine());
        }
    }

    public static class OAEPPadding extends CipherSpi
    {

        public OAEPPadding()
        {
            super(OAEPParameterSpec.DEFAULT);
        }
    }

    public static class PKCS1v1_5Padding extends CipherSpi
    {

        public PKCS1v1_5Padding()
        {
            super(new PKCS1Encoding(new RSABlindedEngine()));
        }
    }

    public static class PKCS1v1_5Padding_PrivateOnly extends CipherSpi
    {

        public PKCS1v1_5Padding_PrivateOnly()
        {
            super(false, true, new PKCS1Encoding(new RSABlindedEngine()));
        }
    }

    public static class PKCS1v1_5Padding_PublicOnly extends CipherSpi
    {

        public PKCS1v1_5Padding_PublicOnly()
        {
            super(true, false, new PKCS1Encoding(new RSABlindedEngine()));
        }
    }


    private AsymmetricBlockCipher c;
    private AlgorithmParameterSpec d;
    private AlgorithmParameters e;
    private boolean f;
    private boolean g;
    private ByteArrayOutputStream h;

    public CipherSpi(OAEPParameterSpec oaepparameterspec)
    {
        f = false;
        g = false;
        h = new ByteArrayOutputStream();
        try
        {
            a(oaepparameterspec);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (OAEPParameterSpec oaepparameterspec)
        {
            throw new IllegalArgumentException(oaepparameterspec.getMessage());
        }
    }

    public CipherSpi(AsymmetricBlockCipher asymmetricblockcipher)
    {
        f = false;
        g = false;
        h = new ByteArrayOutputStream();
        c = asymmetricblockcipher;
    }

    public CipherSpi(boolean flag, boolean flag1, AsymmetricBlockCipher asymmetricblockcipher)
    {
        f = false;
        g = false;
        h = new ByteArrayOutputStream();
        f = flag;
        g = flag1;
        c = asymmetricblockcipher;
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
            c = new OAEPEncoding(new RSABlindedEngine(), digest, ((javax.crypto.spec.PSource.PSpecified)oaepparameterspec.getPSource()).getValue());
            d = oaepparameterspec;
            return;
        }
    }

    protected int engineDoFinal(byte abyte0[], int i, int j, byte abyte1[], int k)
    {
        boolean flag = false;
        if (abyte0 != null)
        {
            h.write(abyte0, i, j);
        }
        if (c instanceof RSABlindedEngine)
        {
            if (h.size() > c.a() + 1)
            {
                throw new ArrayIndexOutOfBoundsException("too much data for RSA block");
            }
        } else
        if (h.size() > c.a())
        {
            throw new ArrayIndexOutOfBoundsException("too much data for RSA block");
        }
        try
        {
            abyte0 = h.toByteArray();
            h.reset();
            abyte0 = c.a(abyte0, 0, abyte0.length);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new BadPaddingException(abyte0.getMessage());
        }
        for (i = ((flag) ? 1 : 0); i != abyte0.length; i++)
        {
            abyte1[k + i] = abyte0[i];
        }

        return abyte0.length;
    }

    protected byte[] engineDoFinal(byte abyte0[], int i, int j)
    {
        if (abyte0 != null)
        {
            h.write(abyte0, i, j);
        }
        if (c instanceof RSABlindedEngine)
        {
            if (h.size() > c.a() + 1)
            {
                throw new ArrayIndexOutOfBoundsException("too much data for RSA block");
            }
        } else
        if (h.size() > c.a())
        {
            throw new ArrayIndexOutOfBoundsException("too much data for RSA block");
        }
        try
        {
            abyte0 = h.toByteArray();
            h.reset();
            abyte0 = c.a(abyte0, 0, abyte0.length);
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
        int i;
        try
        {
            i = c.a();
        }
        catch (NullPointerException nullpointerexception)
        {
            throw new IllegalStateException("RSA Cipher not initialised");
        }
        return i;
    }

    protected int engineGetKeySize(Key key)
    {
        if (key instanceof RSAPrivateKey)
        {
            return ((RSAPrivateKey)key).getModulus().bitLength();
        }
        if (key instanceof RSAPublicKey)
        {
            return ((RSAPublicKey)key).getModulus().bitLength();
        } else
        {
            throw new IllegalArgumentException("not an RSA key!");
        }
    }

    protected int engineGetOutputSize(int i)
    {
        try
        {
            i = c.b();
        }
        catch (NullPointerException nullpointerexception)
        {
            throw new IllegalStateException("RSA Cipher not initialised");
        }
        return i;
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
        AlgorithmParameterSpec algorithmparameterspec = null;
        if (algorithmparameters != null)
        {
            try
            {
                algorithmparameterspec = algorithmparameters.getParameterSpec(javax/crypto/spec/OAEPParameterSpec);
            }
            // Misplaced declaration of an exception variable
            catch (Key key)
            {
                throw new InvalidAlgorithmParameterException((new StringBuilder("cannot recognise parameters: ")).append(key.toString()).toString(), key);
            }
        }
        e = algorithmparameters;
        engineInit(i, key, algorithmparameterspec, securerandom);
    }

    protected void engineInit(int i, Key key, SecureRandom securerandom)
    {
        try
        {
            engineInit(i, key, ((AlgorithmParameterSpec) (null)), securerandom);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Key key)
        {
            throw new InvalidKeyException((new StringBuilder("Eeeek! ")).append(key.toString()).toString(), key);
        }
    }

    protected void engineInit(int i, Key key, AlgorithmParameterSpec algorithmparameterspec, SecureRandom securerandom)
    {
        if (algorithmparameterspec == null || (algorithmparameterspec instanceof OAEPParameterSpec))
        {
            if (key instanceof RSAPublicKey)
            {
                if (g && i == 1)
                {
                    throw new InvalidKeyException("mode 1 requires RSAPrivateKey");
                }
                key = RSAUtil.a((RSAPublicKey)key);
            } else
            if (key instanceof RSAPrivateKey)
            {
                if (f && i == 1)
                {
                    throw new InvalidKeyException("mode 2 requires RSAPublicKey");
                }
                key = RSAUtil.a((RSAPrivateKey)key);
            } else
            {
                throw new InvalidKeyException("unknown key type passed to RSA");
            }
            if (algorithmparameterspec != null)
            {
                OAEPParameterSpec oaepparameterspec = (OAEPParameterSpec)algorithmparameterspec;
                d = algorithmparameterspec;
                if (!oaepparameterspec.getMGFAlgorithm().equalsIgnoreCase("MGF1") && !oaepparameterspec.getMGFAlgorithm().equals(PKCSObjectIdentifiers.H_.c()))
                {
                    throw new InvalidAlgorithmParameterException("unknown mask generation function specified");
                }
                if (!(oaepparameterspec.getMGFParameters() instanceof MGF1ParameterSpec))
                {
                    throw new InvalidAlgorithmParameterException("unkown MGF parameters");
                }
                algorithmparameterspec = DigestFactory.a(oaepparameterspec.getDigestAlgorithm());
                if (algorithmparameterspec == null)
                {
                    throw new InvalidAlgorithmParameterException((new StringBuilder("no match on digest algorithm: ")).append(oaepparameterspec.getDigestAlgorithm()).toString());
                }
                MGF1ParameterSpec mgf1parameterspec = (MGF1ParameterSpec)oaepparameterspec.getMGFParameters();
                org.spongycastle.crypto.Digest digest = DigestFactory.a(mgf1parameterspec.getDigestAlgorithm());
                if (digest == null)
                {
                    throw new InvalidAlgorithmParameterException((new StringBuilder("no match on MGF digest algorithm: ")).append(mgf1parameterspec.getDigestAlgorithm()).toString());
                }
                c = new OAEPEncoding(new RSABlindedEngine(), algorithmparameterspec, digest, ((javax.crypto.spec.PSource.PSpecified)oaepparameterspec.getPSource()).getValue());
            }
            if (!(c instanceof RSABlindedEngine))
            {
                if (securerandom != null)
                {
                    key = new ParametersWithRandom(key, securerandom);
                } else
                {
                    key = new ParametersWithRandom(key, new SecureRandom());
                }
            }
            switch (i)
            {
            default:
                throw new InvalidParameterException((new StringBuilder("unknown opmode ")).append(i).append(" passed to RSA").toString());

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
        }
        if (s1.equals("1"))
        {
            g = true;
            f = false;
            return;
        }
        if (s1.equals("2"))
        {
            g = false;
            f = true;
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
            c = new RSABlindedEngine();
            return;
        }
        if (s1.equals("PKCS1PADDING"))
        {
            c = new PKCS1Encoding(new RSABlindedEngine());
            return;
        }
        if (s1.equals("ISO9796-1PADDING"))
        {
            c = new ISO9796d1Encoding(new RSABlindedEngine());
            return;
        }
        if (s1.equals("OAEPWITHMD5ANDMGF1PADDING"))
        {
            a(new OAEPParameterSpec("MD5", "MGF1", new MGF1ParameterSpec("MD5"), javax.crypto.spec.PSource.PSpecified.DEFAULT));
            return;
        }
        if (s1.equals("OAEPPADDING"))
        {
            a(OAEPParameterSpec.DEFAULT);
            return;
        }
        if (s1.equals("OAEPWITHSHA1ANDMGF1PADDING") || s1.equals("OAEPWITHSHA-1ANDMGF1PADDING"))
        {
            a(OAEPParameterSpec.DEFAULT);
            return;
        }
        if (s1.equals("OAEPWITHSHA224ANDMGF1PADDING") || s1.equals("OAEPWITHSHA-224ANDMGF1PADDING"))
        {
            a(new OAEPParameterSpec("SHA-224", "MGF1", new MGF1ParameterSpec("SHA-224"), javax.crypto.spec.PSource.PSpecified.DEFAULT));
            return;
        }
        if (s1.equals("OAEPWITHSHA256ANDMGF1PADDING") || s1.equals("OAEPWITHSHA-256ANDMGF1PADDING"))
        {
            a(new OAEPParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, javax.crypto.spec.PSource.PSpecified.DEFAULT));
            return;
        }
        if (s1.equals("OAEPWITHSHA384ANDMGF1PADDING") || s1.equals("OAEPWITHSHA-384ANDMGF1PADDING"))
        {
            a(new OAEPParameterSpec("SHA-384", "MGF1", MGF1ParameterSpec.SHA384, javax.crypto.spec.PSource.PSpecified.DEFAULT));
            return;
        }
        if (s1.equals("OAEPWITHSHA512ANDMGF1PADDING") || s1.equals("OAEPWITHSHA-512ANDMGF1PADDING"))
        {
            a(new OAEPParameterSpec("SHA-512", "MGF1", MGF1ParameterSpec.SHA512, javax.crypto.spec.PSource.PSpecified.DEFAULT));
            return;
        } else
        {
            throw new NoSuchPaddingException((new StringBuilder()).append(s).append(" unavailable with RSA.").toString());
        }
    }

    protected int engineUpdate(byte abyte0[], int i, int j, byte abyte1[], int k)
    {
        h.write(abyte0, i, j);
        if (c instanceof RSABlindedEngine)
        {
            if (h.size() > c.a() + 1)
            {
                throw new ArrayIndexOutOfBoundsException("too much data for RSA block");
            }
        } else
        if (h.size() > c.a())
        {
            throw new ArrayIndexOutOfBoundsException("too much data for RSA block");
        }
        return 0;
    }

    protected byte[] engineUpdate(byte abyte0[], int i, int j)
    {
        h.write(abyte0, i, j);
        if (c instanceof RSABlindedEngine)
        {
            if (h.size() > c.a() + 1)
            {
                throw new ArrayIndexOutOfBoundsException("too much data for RSA block");
            }
        } else
        if (h.size() > c.a())
        {
            throw new ArrayIndexOutOfBoundsException("too much data for RSA block");
        }
        return null;
    }
}
